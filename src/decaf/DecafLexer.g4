/*
 * Skeleton code for your Lexer, provided by Emma Norling
 *
 * Please note that this code is far from complete.
 * It needs to be extended and the documentation updated to reflect your changes.
 *
 */
lexer grammar DecafLexer;

// This rule matches one of the keywords for Decaf - what others do you need?
CLASS : 'class';

BOOLEAN:'boolean';
BREAK:'break';
CALLOUT:'callout';
CONTINUE:'continue';
ELSE:'else';
FALSE:'false';
FOR:'for';
IF:'if';
INT:'int';
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
DECIMAL_LITERAL:DIGIT+;

fragment
HEX_LITERAL:'0' 'x' HEX_DIGIT+;

INTLITERAL :   DECIMAL_LITERAL|HEX_LITERAL;
FLOAT   :   DIGIT* '.' DIGIT+;

RETURN:'return';
TRUE:'true';
VOID:'void';

DIGIT: '0'..'9';






// SPECIAL CHARACTERS
LCURLY : '{';
RCURLY : '}';
SEMICOLON:';';
LBRACKET:'(';
RBRACKET:')';

LSQUAREBRACKET:'[';

RSQUAREBRACKET:']';
COMMA:',';

LESSTHANBRACKET:'<';
GREATERTHANBRACKET:'>';
LTOREQUALBRACKET:'<=';
GTOREQUALBRACKET:'>=';

//ARITHMETIC SYMBOLS
ADDITION:'+';
SUBTRACTION:'-';
MODULO:'%';
MULTIPLICATION:'*';
DIVISION:'/';
ADDITIONASSIGNMENT:'+=';
SUBTRACTASSIGNMENT:'-=';
EQUAL:'=';
EQUALTO:'==';
NOTEQUALTO:'!=';

AND:'&';
LOGICALAND:'&&';
OR:'|';
LOGICALOR:'||';
NOT:'!';


// This says an identifier is a sequence of one  alphabetic character followed
// by alpha numerical values
ID:(ALPHA)(ALPHA_NUM)*;


ALPHA:('a'..'z' | 'A'..'Z' | '_');

fragment ALPHA_NUM: (ALPHA|DIGIT);
//digit variations


//INTLITERAL: DECIMAL_LITERAL | HEX_LITERAL;

//DIGIT    :  '0'..'9';

// | HEX_LITERAL;







BOOL_LITERAL:('true'|'false');
// This rule simply ignores (skips) any space or newline characters
WS_ : (' ' | '\n' |'\t') -> skip;

// And this rule ignores comments (everything from a '//' to the end of the line)
SL_COMMENT : '//' (~'\n')* '\n' -> skip;

// These two rules describe characters and strings
// This rule says a character is contained within single quotes, and is a single instance of either an ESC, or any
// character other than a single quote.
CHAR : '\'' (ESC|NOTESC) '\'';
// This rule says a string is contained within double quotes, and is zero or more instances of either an ESC, or any
// character other than a double quote.
STRING : '"' (ESC|NOTESC)* '"';
//Integer

// A rule that is marked as a fragment will NOT have a token created for it. So anything matching the rules above
// will create a token in the output, but something matching the ESC rule below will only be used locally in the scope
// of this file. Any rule that should not generate an output token should be preceded by the fragment keyword.
// ESC matches either a pair of characters representing a newline ('\' and 'n') or a pair of characters representing
// a double quote ('\' and '"'). HINT: there are many other characters that should be escaped - think of how you need
// to write them in strings in languages like Java.
fragment
ESC :  '\\'('n'|'"'|'t'|'\\'|'\'');
fragment
NOTESC : ~('\n'|'"'|'\t'|'\\'|'\'');