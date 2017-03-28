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
 | RETURN element                                              #returnElement
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



booleanLiteral: BOOLEAN_LITERAL_TOKEN;
stringLiteral: STRING_LITERAL_TOKEN;
floatLiteral: FLOAT_LITERAL;
integerLiteral: INTEGER_LITERAL;
name: ALPHA_NUMERIC_NAME | SYMBOL | EQ (EQ)+;

//Lexer rules
IF: 'if';
ELSE: 'else';
CLASS: 'class';
WHILE: 'while';
RETURN: 'return';
BOOLEAN_LITERAL_TOKEN: 'true' | 'false';

fragment ESCAPED_QUOTE : '\\"';
STRING_LITERAL_TOKEN :   '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

ALPHA_NUMERIC_NAME: [A-Za-z_][A-Za-z0-9_]*'!'?;
SYMBOL: [~!$^*&+#<>?|\-]+;


fragment NUMERIC: [0-9];
INTEGER_LITERAL: NUMERIC+;
FLOAT_LITERAL: NUMERIC+ (((DOT NUMERIC+) ('f' | 'F')?) | ('f' | 'F'));

FARROW: '=>';
WS: [ \t]+ -> skip;
SKP: [\r]+ -> skip;
COMMENT: '//' (~[\n])+ '\n'+;

DOT: '.';
COMMA: ',';

EQ: '=';

O_R_BRACK: '(';
C_R_BRACK: ')';
O_C_BRACK: '{';
C_C_BRACK: '}';