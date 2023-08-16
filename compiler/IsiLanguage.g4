grammar IsiLanguage;

@header{
	import ast.*;
	import symbols.*;
	import java.util.Arrays;
	import java.util.List;
}

@members{
	private List<String> ids;
	private Program  program = new Program();
	private Expression expression;
	private BinaryExpression binaryExpression;
	private SymbolTable symbolTable = new SymbolTable();
	private ArrayList<Command> curThread;
	private ArrayList<Command> listaTrue;
	private ArrayList<Command> listaFalse;
	private ArrayList<AbstractCommand> listaEnquanto;
	private ArrayList<Integer> _tipoVar = new ArrayList<Integer>();
	private Stack<ArrayList<Command>> stack = new Stack<ArrayList<Command>>();
	private String _exprContent;
	private String _exprDecision;

	public void setup() {
		program.setSymbols(symbolTable);
	}

	public Program getAST() { 
		return this.program;
	} 

	public void showIdentifiers() {
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void showCommands() {
		 program.getCommands().forEach((cmd)->System.out.println(cmd));
	}

	private String lastToken() {
		return ((TokenStream)_input).LT(-1).getText();
	}
	private Identifier getIdIfDeclared() { 
			String id = lastToken();
			if (!symbolTable.exists(id)){
				throw new RuntimeException("Semantic ERROR - Undeclared Identifier: " + id);
			}
			return symbolTable.get(id);
	 }
}
	public void verificaID(String id){
		if (!symbolTable.exists(id))
			throw new IsiSemanticException("Symbol "+id+" not declared");
	}

prog  	: 'programa' declaracoes bloco 'fimprog' EOL {
	program.cleanStack();
};

declaracoes : declara*;

declara	: 'declare' ID { ids = new ArrayList<String>(); ids.add(lastToken());}
										(COMMA ID { ids.add(lastToken());})* 'como' type EOL;

type		: 'INTEIRO' {ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.INTEIRO)));}
				| 'DECIMAL' {ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.DECIMAL)));}
				| 'TEXTO' 	{ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.TEXTO)));};

bloco		: cmd+;

escopo	: AC
					bloco
					FC;

cmd			: cmdLine | cmdIf | cmdLoop;

cmdLine : (cmdLeitura | cmdEscrita | cmdExpr)EOL;

cmdLeitura	: 'leia' AP
										ID {
											Identifier id = getIdIfDeclared();
											// id.setAssigned(true);
											program.putCommandOnStack(new ReadCommand(id));
										}
										FP;

cmdEscrita	: 'escreva' AP (
								  INT {
										Integer literal = Integer.valueOf(lastToken());
										program.putCommandOnStack(new WriteCommand(new LiteralExpression<Integer>(literal)));
									}
								| DECIMAL {
										Float literal = Float.valueOf(lastToken());
										program.putCommandOnStack(new WriteCommand(new LiteralExpression<Float>(literal)));
									}
								| TEXTO {
										String literal = lastToken();
										program.putCommandOnStack(new WriteCommand(new LiteralExpression<String>(literal)));
									}
								| ID {
									program.putCommandOnStack(new WriteCommand(new IdentifierExpression(getIdIfDeclared())));
									}
							) FP;

cmdExpr			: ID {String idAtribuido = lastToken();}
							ATTR
							expr {
								Identifier id = symbolTable.get(idAtribuido);
								program.putCommandOnStack(new AttributionCommand(id, expression));
								expression = null;		
							};

cmdIf				:  'se' AP
                    ID    		  {
									verificaID(lastToken());
									verificaAttrib(lastToken());
									_exprDecision = lastToken();
									_tipoVar.add(symbolTable.getTypeBy(lastToken()));
						  		  }
                    OPREL 		  { _exprDecision += lastToken(); }
                    (ID | NUMBER) {
									verificaAttrib(lastToken());
									if (lastToken().matches("\\d+(\\.\\d+)?"))
										_tipoVar.add(IsiVariable.NUMBER);
									else {
										verificaID(lastToken());
										_tipoVar.add(symbolTable.getTypeBy(lastToken()));
									}
									_exprDecision += lastToken();
								  }
                    FP 			  { verificaCompatibilidade(_tipoVar); }
                    'entao' ACH	  {
                    
                    				program.newLayer();
                    			  }
                    (cmd)+

                    FCH			  { listaTrue = stack.pop(); }
                    (
					'senao'
                   	ACH
								  {
									program.newLayer();
								  }
                   	(cmd+)
                   	FCH
								  {
									listaFalse = stack.pop();
									CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
									program.putCommandOnStack(cmd);
								  }
                    )?
            ;

cmdLoop			: paratodo | enquanto;

paratodo		: 'paratodo' {
									// adiciona nova camada na pilha e cria o comando de loop
									program.newLayer();
									ForLoopCommand loopCommand = new ForLoopCommand();
								}
								// nome e tipo da variavel iteradora
								ID { loopCommand.getIteratorId().setName(lastToken()); }
								(
									'INTEIRO'  { loopCommand.getIteratorId().setType(DataType.INTEIRO); }
								|	'DECIMAL'  { loopCommand.getIteratorId().setType(DataType.DECIMAL); }
								)
								'em'
								ACO
									// limitante Inferior do intervalo de iteração
									(ID { loopCommand.setLowerBound(new IdentifierExpression(getIdIfDeclared())); }
									|INT { loopCommand.setLowerBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
									| DECIMAL { loopCommand.setLowerBound(new LiteralExpression<Float>(Float.valueOf(lastToken()))); }
									)
								'..'
									// limitante superior do intervalo de iteração
									(ID { loopCommand.setUpperBound(new IdentifierExpression(getIdIfDeclared())); }
									|INT { loopCommand.setUpperBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
									| DECIMAL { loopCommand.setUpperBound(new LiteralExpression<Float>(Float.valueOf(lastToken()))); }
									)
								';'
								// passo da iteração
								(ID { loopCommand.setStep(new IdentifierExpression(getIdIfDeclared())); }
								|INT { loopCommand.setStep(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
								| DECIMAL { loopCommand.setStep(new LiteralExpression<Float>(Float.valueOf(lastToken()))); }
								)
								// parenteses representa intervalo aberto (i < limSup), colchete representa intervalo fechado (i <= limSup)
								(FP   { loopCommand.setOpenInterval(true); }
								|FCO  { loopCommand.setOpenInterval(false); }
								)
								escopo {
									loopCommand.setScope(program.popStackCommands());
									program.putCommandOnStack(loopCommand);
								};

enquanto		: 			  'enquanto'
						  AP

						  ID		    {
									 	  verificaID(lastToken());
										  verificaAttrib(lastToken());
										  _exprDecision = lastToken();
										  _tipoVar.add(symbolTable.getTypeBy(lastToken()));
										}
						  OPREL 		{ _exprDecision += lastToken(); }
						  (ID | NUMBER)
						 				{
											verificaAttrib(lastToken());
											if (lastToken().matches("\\d+(\\.\\d+)?"))
												_tipoVar.add(IsiVariable.NUMBER);
											else {
												verificaID(lastToken());
												_tipoVar.add(symbolTable.getTypeBy(lastToken()));
											}
											_exprDecision += lastToken();
										}
						  FP 			{ verificaCompatibilidade(_tipoVar); }
						  'faca'
                          ACH
                           				{
                           				  program.newLayer();
                           				}
                          (cmd)+

                          FCH
                          				{
                            			  listaEnquanto = stack.pop();
                            			  WhileLoopCommand cmd = new WhileLoopCommand(_exprDecision, listaEnquanto);
                            			  program.putCommandOnStack(cmd);
                           				}
			 ;

exprRel			: expr OPREL expr;

expr				: termo exprl*;

exprl				: OP { 
								binaryExpression = new BinaryExpression(lastToken().charAt(0));
								binaryExpression.setLeftOperand(expression);
								}
							termo {
								binaryExpression.setRightOperand(expression);
								expression = binaryExpression;
							};

termo				: ID { expression = new IdentifierExpression(getIdIfDeclared()); }
						| INT { expression = new LiteralExpression<Integer>(Integer.valueOf(lastToken())); }
						| DECIMAL { expression = new LiteralExpression<Float>(Float.valueOf(lastToken())); }
						| TEXTO  { expression = new LiteralExpression<String>(lastToken()); }
						| AP expr FP;

num	  		: INT | DECIMAL;

TEXTO 	  	: DITTO ([a-z]|[A-Z]|[0-9]|'\t' | BLANK)* DITTO;

INT				: ('-')?[0-9]+;

DECIMAL		: INT('.'[0-9]+);

ATTR	  	: ':=';		

OP				: '+' | '-' | '*' | '/';
          
OPREL     : '<' | '>' | '<=' | '>=' | '!=' | '==';          
   		  
ID			  : ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*;
          
COMMA      : ',';
          
AP	      : '(';
	      
FP 			  : ')';

AC	      : '{';
	      
FC 			  : '}';

ACO				: '[';

FCO				: ']';

EOL				: '.';

DITTO			: '"';

ARROW			: '=>';

BLANK     : (' '| '\t' | '\n' | '\r') -> skip;                                 		           		 		 