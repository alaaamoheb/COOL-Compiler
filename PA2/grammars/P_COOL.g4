grammar P_COOL;

options {
  tokenVocab = COOLLexer;
}

program : class+  # start;
class   : CLASS TYPE_IDENTIFIER (INHERITS TYPE_IDENTIFIER)? LBRACE (feature SEMI)* RBRACE SEMI #classdef;
feature : OBJECT_IDENTIFIER LPAREN (formal (COMMA formal)*)? RPAREN COLON TYPE_IDENTIFIER LBRACE expr RBRACE #function
        | OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN_OP expr)? #variable;
formal  : OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER #parameter;
expr    : OBJECT_IDENTIFIER ASSIGN_OP expr #assign
        | expr (ATSYM TYPE_IDENTIFIER)? DOT_OP OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #objectcall
        | OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #staticcall
        | expr LT_OP expr #lt
        | IF expr THEN expr (ELSE expr)? FI #if
        | WHILE expr POOL #while
        | DO LOOP expr POOL WHILE expr #dowhile
        | LBRACE (expr SEMI)+ RBRACE #block
        | LET OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN_OP expr)? (COMMA OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN_OP expr)? )* IN expr #let
        | CASE expr OF (OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER RES expr SEMI)+ ESAC #case
        | NEW TYPE_IDENTIFIER #newobject
        | ISVOID expr #void
        | expr PLUS_OP expr #add
        | expr MINUS_OP expr #sub
        | expr MULT_OP expr # mul
        | expr DIV_OP expr #div
        | TILDE_OP expr #invert
        | expr LE_OP expr #lq
        | expr EQUALS_OP expr #eq
        | NOT expr #not
        | LPAREN expr RPAREN #parexpr
        | OBJECT_IDENTIFIER #id
        | INTEGERS #num
        | STRING #text
        | TRUE #true
        | FALSE #false;

