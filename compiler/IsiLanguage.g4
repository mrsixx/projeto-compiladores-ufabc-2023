grammar IsiLanguage;

prog  	: 'programa' declara bloco 'fimprog' EOL;

declara	: 'declare' ID (COMMA ID)* EOL;

bloco		: cmd+;

escopo	: AC bloco FC;

cmd			: cmdLine | cmdIf;

cmdLine : (cmdLeitura | cmdEscrita | cmdExpr)EOL;

cmdLeitura	: 'leia' AP ID FP;

cmdEscrita	: 'escreva' AP (TEXTO | ID) FP;

cmdExpr			: ID ATTR expr;

cmdIf				: 'se' AP exprRel FP 'entao' escopo ('senao' escopo)?;

exprRel			: expr OPREL expr;

expr				: termo (OP termo)*;

termo				: NUM | ID | AP expr FP;

TEXTO 	  	: DITTO ([a-z]|[A-Z]|[0-9]|'\t' | BLANK)* DITTO;		  
		  
NUM	  		: [0-9]+;

ATTR	  	: ':=';		

OP				: '+' | '-' | '*' | '/';
          
OPREL     : '<' | '>' | '<=' | '>=' | '!=' | '==';          
   		  
ID			  : ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*;
          
COMMA      : ',';
          
AP	      : '(';
	      
FP 			  : ')';

AC	      : '{';
	      
FC 			  : '}';

EOL				: '.';

DITTO			: '"';

BLANK     : (' '| '\t' | '\n' | '\r') -> skip;                                 		           		 		 