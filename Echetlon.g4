grammar Echetlon;

// Keywords
WS: [ \t\r\n]+ -> skip;

OBJ: 'obj';
INT: 'int';
STR: 'string';
NEW: 'new';
LOOP: 'loop';
RETURN: 'return';

EQ: '=';
STRING: '"' ~[\n\r]+ '"';
IDENTIFIER : [a-zA-Z_]+;
SEMIC: ';';
COLON: ':';
LCPAREN: '{';
RCPAREN: '}';
LPAREN: '(';
RPAREN: ')';
LSPAREN: '[';
RSPAREN: ']';
COMMA: ',';
DOT: '.';
MINUS: '-';
PLUS: '+';
INT_LIT: [0-9]+;


singleType: INT | STR | IDENTIFIER;
array: singleType LSPAREN  RSPAREN;
type: singleType | array;

fieldDecl: type IDENTIFIER SEMIC;
fieldAlloc: name=IDENTIFIER EQ expression;
argument: type name=IDENTIFIER;
methodDecl: type name=IDENTIFIER COLON (argument (COMMA argument)*)? LCPAREN statement+ RCPAREN SEMIC;
objDecl: OBJ name=IDENTIFIER LCPAREN fieldDecl* methodDecl* RCPAREN;
objAlloc: NEW alloc=IDENTIFIER LPAREN (fieldAlloc (COMMA fieldAlloc)*)? RPAREN;
varObjDec: type var=IDENTIFIER EQ expression;
fieldDeref: DOT name=IDENTIFIER;
varAss: var=IDENTIFIER (fieldDeref)? EQ expression;
loop: LOOP expression LCPAREN statement+ RCPAREN;
methodCallStmt: (objName=IDENTIFIER)? DOT name=IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN;
returnStmt: RETURN expression;
statement: (
    objDecl
    | methodCallStmt
    | loop
    | returnStmt
    | varObjDec
    | varAss
    ) SEMIC;

expression: INT_LIT #intLiteral
    | STRING #strLiteral
    | LPAREN expression RPAREN #parenExp
    | (objName=IDENTIFIER)? DOT name=IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN #methodCall
    | arr=expression LSPAREN index=expression RSPAREN #arrayRef
    | LCPAREN (expression (COMMA expression)*)? RCPAREN #arrayLiteral
    | l=expression PLUS r=expression #add
    | l=expression MINUS r=expression #sub
    | objAlloc #objVal
    | name=IDENTIFIER DOT field=IDENTIFIER #varFieldRef
    | name=IDENTIFIER #varRef
    ;
file: statement+;