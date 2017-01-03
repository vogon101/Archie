grammar archie;
// Parser Rules

program:  line* EOF;

line
 : element (';' | '\n')+
 | COMMENT
 ;

//assignment: identifier  EQ  element;

element
 : O_R_BRACK element C_R_BRACK  #bracketedElement
 | identifier EQ element        #assignment//assignment
 | element  elementList         #functionCall//Function Call
 | nameList  FARROW  element    #functionLiteral//Function Literal
 | identifier                   #textID
 | element  (DOT NAME)+         #combinedID//CombinedID
 | O_C_BRACK (element (';' | '\n')+)* C_C_BRACK #codeBlock
 | element NAME element #opFunctionCall
 | value #literal
 ;


elementList: O_R_BRACK  element?  (COMMA  element)* C_R_BRACK;

identifier: NAME (DOT NAME)*;

nameList: O_R_BRACK (NAME COMMA)* (NAME COMMA?)? C_R_BRACK;

value
 : integerLiteral
 | floatLiteral
 | stringLiteral
 ;

stringLiteral: STRING_LITERAL_TOKEN;
floatLiteral: NUMERIC+ ( ( (DOT NUMERIC+) ('f' | 'F')? ) | ('f' | 'F') );
integerLiteral: NUMERIC+;

fragment ESCAPED_QUOTE : '\\"';
STRING_LITERAL_TOKEN :   '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

NAME
 : [A-Za-z_][A-Za-z0-9_]*
 | [~!$^*&+#<>?|]+
 ;

NUMERIC: [0-9];

FARROW: '=>';
WS: [ \t]+ -> skip;
SKP: [\r]+ -> skip;
COMMENT: '//' ~[\n] '\n'+;

DOT: '.';
COMMA: ',';

EQ: '=';

O_R_BRACK: '(';
C_R_BRACK: ')';
O_C_BRACK: '{';
C_C_BRACK: '}';
