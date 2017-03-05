grammar archie;
// Parser Rules

program: '\n'? line* EOF;

line
 : classDef '\n'+
 | element (';' | '\n')+
 | COMMENT

 ;

classDef: classHeader element?;

classHeader
 : CLASS ALPHA_NUMERIC_NAME nameList;

//assignment: identifier  EQ  element;

element
 : O_R_BRACK element C_R_BRACK                                 #bracketedElement
 | element  elementList                                        #functionCall//Function Call
 | element name element                                        #opFunctionCall
 | nameList  FARROW  element                                   #functionLiteral//Function Literal
 | O_C_BRACK '\n'* (element (';' | '\n')+)* element? C_C_BRACK #codeBlock
 | identifier EQ element                                       #assignment//assignment
 | IF O_R_BRACK element C_R_BRACK ('\n')? element ('\n' | ';')? ELSE element #elseElement
 | IF O_R_BRACK element C_R_BRACK ('\n')? element              #if
 | WHILE O_R_BRACK element C_R_BRACK ('\n')? element           #whileElement
 | identifier                                                  #textID
 | element  (DOT name)+                                        #combinedID//CombinedID
 | instantiation                                               #newObj
 | value                                                       #literal
 ;


instantiation: 'new' name elementList;

elementList: O_R_BRACK  element?  (COMMA  element)* C_R_BRACK;

identifier: name (DOT name)*;

nameList: O_R_BRACK (name COMMA)* (name COMMA?)? C_R_BRACK;

value
 : integerLiteral
 | floatLiteral
 | stringLiteral
 | booleanLiteral
 ;



booleanLiteral: 'true' | 'false';
stringLiteral: STRING_LITERAL_TOKEN;
floatLiteral: NUMERIC+ ( ( (DOT NUMERIC+) ('f' | 'F')? ) | ('f' | 'F') );
integerLiteral: NUMERIC+;
name: ALPHA_NUMERIC_NAME | SYMBOL | EQ (EQ)+;

IF: 'if';
ELSE: 'else';
CLASS: 'class';
WHILE: 'while';

fragment ESCAPED_QUOTE : '\\"';
STRING_LITERAL_TOKEN :   '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

ALPHA_NUMERIC_NAME: [A-Za-z_][A-Za-z0-9_]*;
SYMBOL: [~!$^*&+#<>?|\-]+;

CLASS_NAME: [A-Za-z_][A-Za-z0-9_]*;

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
