grammar IsiLanguage;

programa  : 'programa' cmd* 'fimprog.'
		  ;

cmd		  : 'ola mundo'
		  ;
	         
		  
NUMBER	  : [0-9]+
		  ;
		  
TEXT 	  : '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '<>'
 		  ;          
   		  
ID		  : [a-z] ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	      
BLANK     : (' '| '\t' | '\n' | '\r') -> skip
          ;                                 		           		 		 