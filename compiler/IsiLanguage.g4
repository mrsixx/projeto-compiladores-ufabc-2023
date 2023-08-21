grammar IsiLanguage;

@header{
	import ast.*;
	import symbols.*;
	import exceptions.*;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.List;
}

@members{
	private List<String> ids;
	private Program  program = new Program();
	private Expression expression;
	private BinaryExpression binaryExpression;
	private BinaryRelationalExpression binaryRelExpression;
	private List<Command> curThread;
	private List<Command> listaTrue;
	private List<Command> listaFalse;
	private List<Command> listaEnquanto;
	private List<Integer> _tipoVar = new ArrayList<Integer>();
	private RelationalExpression _relationalExpression;
	private DeclarationCommand _declCmd;
	public Program getAST() { 
		return this.program;
	} 

	public void showIdentifiers() {
		program.getSymbolTable().getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void showCommands() {
		 program.getCommands().forEach((cmd)->System.out.println(cmd));
	}

	private String lastToken() {
		return ((TokenStream)_input).LT(-1).getText();
	}

	private Identifier getIdIfDeclared() { 
			String id = lastToken();
			if (!program.getSymbolTable().exists(id)){
				throw new IsiSemanticException("Semantic ERROR - Undeclared Identifier: " + id);
			}
			return program.getSymbolTable().get(id);
  }

  public void verificaID(String id){
		if (!program.getSymbolTable().exists(id))
			throw new IsiSemanticException("Symbol "+id+" not declared");
	}
	
	public void mapIdentifier(String name, DataType type) {
		Identifier id = new Identifier(name, type);
		program.getSymbolTable().add(id);
		_declCmd.getIds().add(id);
	}
}
prog  	: 'programa' declaracoes bloco 'fimprog' EOL {
	program.cleanStack();
	program.checkIds();
};

declaracoes : declara*;

declara	: 'declare' ID {
												ids = new ArrayList<String>();
												ids.add(lastToken());
												_declCmd = new DeclarationCommand();
										}
										(COMMA ID { ids.add(lastToken());})* 'como' type EOL;

type		: 'INTEIRO' {ids.forEach((name)-> mapIdentifier(name, DataType.INTEIRO));program.putCommandOnStack(_declCmd);}
				| 'DECIMAL' {ids.forEach((name)-> mapIdentifier(name, DataType.DECIMAL));program.putCommandOnStack(_declCmd);}
				| 'TEXTO' 	{ids.forEach((name)-> mapIdentifier(name, DataType.TEXTO));program.putCommandOnStack(_declCmd);};

bloco		: cmd+;

escopo	: AC
					bloco
					FC;

cmd			: cmdLine | cmdIf | cmdLoop;

cmdLine : (cmdLeitura | cmdEscrita | cmdExpr)EOL;

cmdLeitura	: 'leia' AP
										ID {
											Identifier id = getIdIfDeclared();
											id.setAssigned();
											program.putCommandOnStack(new ReadCommand(id));
										}
										FP;

cmdEscrita	: 'escreva' AP (
								  INT {
										Integer literal = Integer.valueOf(lastToken());
										program.putCommandOnStack(new WriteCommand(new LiteralExpression<Integer>(literal)));
									}
								| DECIMAL {
										Double literal = Double.valueOf(lastToken());
										program.putCommandOnStack(new WriteCommand(new LiteralExpression<Double>(literal)));
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
								Identifier id = program.getSymbolTable().get(idAtribuido);
								id.setAssigned();
								program.putCommandOnStack(new AttributionCommand(id, expression));
								expression = null;		
							};

cmdIf				:  'se' { DecisionCommand cmdIf = new DecisionCommand(); }
								AP
								exprRel { cmdIf.setCondition(_relationalExpression); }
								FP 
								//{ verificaCompatibilidade(_tipoVar); }
								'entao' AC { program.newLayer(); }
									(cmd)+
									FC { cmdIf.getTrueCommands().addAll(program.popStackCommands()); }
									(
								'senao'
									AC { program.newLayer(); }
									(cmd+)
									FC
									{
										cmdIf.getFalseCommands().addAll(program.popStackCommands());
									})?
									{program.putCommandOnStack(cmdIf);}
            ;

cmdLoop			: paratodo | enquanto;

paratodo		: 'paratodo' {
									// adiciona nova camada na pilha e cria o comando de loop
									ForLoopCommand loopCommand = new ForLoopCommand();
								}
								// nome e tipo da variavel iteradora
								ID { loopCommand.getIteratorId().setName(lastToken()); }
								(
									'INTEIRO'  { loopCommand.getIteratorId().setType(DataType.INTEIRO); }
								|	'DECIMAL'  { loopCommand.getIteratorId().setType(DataType.DECIMAL); }
								)
								'em' { program.getSymbolTable().add(loopCommand.getIteratorId()); }
								ACO
									// limitante Inferior do intervalo de iteração
									(ID { loopCommand.setLowerBound(new IdentifierExpression(getIdIfDeclared())); }
									|INT { loopCommand.setLowerBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
									| DECIMAL { loopCommand.setLowerBound(new LiteralExpression<Double>(Double.valueOf(lastToken()))); }
									)
								'..'
									// limitante superior do intervalo de iteração
									(ID { loopCommand.setUpperBound(new IdentifierExpression(getIdIfDeclared())); }
									|INT { loopCommand.setUpperBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
									| DECIMAL { loopCommand.setUpperBound(new LiteralExpression<Double>(Double.valueOf(lastToken()))); }
									)
								';'
								// passo da iteração
								(ID { loopCommand.setStep(new IdentifierExpression(getIdIfDeclared())); }
								|INT { loopCommand.setStep(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); }
								| DECIMAL { loopCommand.setStep(new LiteralExpression<Double>(Double.valueOf(lastToken()))); }
								)
								// parenteses representa intervalo aberto (i < limSup), colchete representa intervalo fechado (i <= limSup)
								(FP   { loopCommand.setOpenInterval(true); }
								|FCO  { loopCommand.setOpenInterval(false); }
								)
								AC { program.newLayer(); }
									(cmd)+
								FC {
									loopCommand.setScope(program.popStackCommands());
									program.putCommandOnStack(loopCommand);
								};

enquanto		: 'enquanto' { WhileLoopCommand whileCmd = new WhileLoopCommand(); }
						  AP
						  exprRel { whileCmd.setCondition(_relationalExpression); }
						  FP 
						  'faca'
							AC { program.newLayer(); }
							(cmd)+
							FC
							{ 
								whileCmd.getCommands().addAll(program.popStackCommands());
								program.putCommandOnStack(whileCmd);
							};



exprRel				: termoRel exprRell*;

exprRell			: OPLOG { 
								binaryRelExpression = new BinaryRelationalExpression(lastToken());
								binaryRelExpression.setLeftOperand(_relationalExpression);
								}
							termoRel {
								binaryRelExpression.setRightOperand(_relationalExpression);
								_relationalExpression = binaryRelExpression;
							};

termoRel			: expr {
								_relationalExpression = new RelationalExpression();
								_relationalExpression.setLeftMember(expression);
							}
							OPREL { _relationalExpression.setOperator(lastToken()); }
							expr { _relationalExpression.setRightMember(expression); };

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
						| DECIMAL { expression = new LiteralExpression<Double>(Double.valueOf(lastToken())); }
						| TEXTO  { expression = new LiteralExpression<String>(lastToken()); }
						| AP expr FP;

num	  		: INT | DECIMAL;

TEXTO 	  	: '"' (~["])+ '"';

INT				: ('-')?[0-9]+;

DECIMAL		: INT('.'[0-9]+);

ATTR	  	: ':=';		

OP				: '+' | '-' | '*' | '/';
          
OPREL     : '<' | '>' | '<=' | '>=' | '!=' | '==';          

OPLOG			: 'e' | 'ou';

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