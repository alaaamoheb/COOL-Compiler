lexer grammar COOLLexer;

// Keywords
CLASS : 'class';
INHERITS : 'inherits';
IF : 'if';
THEN : 'then';
ELSE : 'else';
FI : 'fi';
WHILE : 'while';
LOOP : 'loop';
POOL : 'pool';
LET : 'let';
IN : 'in';
CASE : 'case';
OF : 'of';
ESAC : 'esac';
NEW : 'new';
ISVOID : 'isvoid';
NOT : 'not';

// Operators and Punctuation
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
EQUALS : '=';
LESS_THAN : '<';
LESS_THAN_OR_EQUAL : '<=';
AT : '@';
COLON : ':';
SEMICOLON : ';';
COMMA : ',';
DOT : '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
TILDE : '~';

// Identifiers and Literals
ID : [a-zA-Z][a-zA-Z0-9_]*;
INT_CONST : [0-9]+;
STR_CONST : '"' (~["\r\n])* '"';
BOOL_CONST : 'true' | 'false';

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip;
COMMENT : '--' ~[\r\n]* -> skip;
