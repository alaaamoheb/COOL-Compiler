lexer grammar COOLLexer;

// KEY WORDZ case insensitive
CLASS : [Cc][Ll][Aa][Ss][Ss];
INHERITS : [Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss];
IF : [Ii][Ff];
THEN : [Tt][Hh][Ee][Nn];
ELSE : [Ee][Ll][Ss][Ee];
FI : [Ff][Ii];
DO: [Dd][Oo];
WHILE : [Ww][Hh][Ii][Ll][Ee];
LOOP : [Ll][Oo][Oo][Pp];
POOL : [Pp][Oo][Oo][Ll];
LET : [Ll][Ee][Tt];
IN : [Ii][Nn];
CASE : [Cc][Aa][Ss][Ee];
ESAC : [Ee][Ss][Aa][Cc];
OF : [Oo][Ff];
NEW : [Nn][Ee][Ww];
ISVOID : [Ii][Ss][Vv][Oo][Ii][Dd];
NOT : [Nn][Oo][Tt];
// true and false must start with lowwer case chars
TRUE : [t] [Rr] [Uu] [Ee];
FALSE :  [f] [Aa] [Ll] [Ss] [Ee];


INTEGERS: [0-9]+;

SELF: 'self' {setType(OBJECT_IDENTIFIER);};
SELF_TYPE: 'SELF_TYPE' {setType(TYPE_IDENTIFIER);};

TYPE_IDENTIFIER: SELF_TYPE | [A-Z][a-zA-Z0-9_]*;
OBJECT_IDENTIFIER: SELF | [a-z][a-zA-Z0-9_]*;

// Define tokens for special notation
LPAREN : '(';
RPAREN : ')';
SEMI : ';';
COLON : ':';
ATSYM : '@';
COMMA : ',';
PLUS_OP : '+';
MINUS_OP : '-';
MULT_OP : '*';
DIV_OP : '/';
TILDE_OP : '~';
LT_OP : '<';
EQUALS_OP : '=';
LBRACE : '{';
RBRACE : '}';
DOT_OP : '.';
LE_OP : '<=';
ASSIGN_OP : '<-';
RES : '=>';

STRING: '"' (('\\'|'\t'|'\r\n'|'\r'|'\n') | ~('\\'|'\t'|'\r'|'\n'|'"'))* '"';

SINGLECOMMENT: '--' ~[\r\n]* -> skip;
COMMENT		: '(*'-> pushMode(ININCOM), skip;
mode ININCOM;
OCOMMENT	: '(*' -> pushMode(ININCOM), skip ;
CCOMMENT	: '*)' -> popMode, skip ;
INCOMMENT_T : . -> skip ;

WS: [ \n\t\r]+ -> skip;