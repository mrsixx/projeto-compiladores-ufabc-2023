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
	private SymbolTable symbolTable = new SymbolTable();

	public void setup() {
		program.setSymbols(symbolTable);
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

escopo	: AC bloco FC;

cmd			: cmdLine | cmdIf | cmdLoop;

cmdLine : (cmdLeitura | cmdEscrita | cmdExpr)EOL;

cmdLeitura	: 'leia' AP ID FP;

cmdEscrita	: 'escreva' AP (num | TEXTO | ID) FP;

cmdExpr			: ID {String idAtribuido = lastToken();}
							ATTR
							expr {
								Identifier id = symbolTable.get(idAtribuido);
								program.putCommandOnStack(new AttributionCommand(id, expression));
								expression = null;		
							};

cmdIf				: 'se' AP exprRel FP 'entao' escopo ('senao' escopo)?;

cmdLoop			: (paratodo | enquanto) escopo;

paratodo		: 'paratodo' ID 'em' ACO limInf'..'limSup';' passo (FP|FCO);

enquanto		: 'enquanto' AP exprRel FP;

limInf			: (ID|num);

limSup			: (ID|num);

passo				: (ID|num);

exprRel			: expr OPREL expr;

expr				: termo (OP termo)*;

termo				: ID 
						| INT { expression = new LiteralExpression<Integer>(Integer.getInteger(lastToken())); }
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