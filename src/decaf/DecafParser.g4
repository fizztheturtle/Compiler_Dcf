/*
 * A VERY minimal skeleton for your parser, provided by Emma Norling.
 *
 * Your parser should use the tokens provided by your lexer in rules.
 * Even if your lexer appeared to be working perfectly for stage 1,
 * you might need to adjust some of those rules when you implement
 * your parser.
 *
 * Remember to provide documentation too (including replacing this
 * documentation).
 *
 */
parser grammar DecafParser;
options { tokenVocab = DecafLexer; }

// This rule says that a program consists of the tokens CLASS ID LCURLY RCURLY EOF nothing more nothing less,
// in exactly that order. However obviously something (quite a lot of something) needs to go between the curly
// brackets. You need to write the rules (based on the provided grammar) to capture this.

program: CLASS ID LCURLY field_dec*  method_dec* RCURLY EOF;

field_name: ID | (ID LSQUAREBRACKET INTLITERAL RSQUAREBRACKET);
field_dec : type field_name (COMMA field_name )*    SEMICOLON;

method_dec_name : (type ID);
method_dec : (type | VOID) ID LBRACKET (method_dec_name (COMMA  method_dec_name )*)? RBRACKET block;



block : LCURLY var_dec* statement* RCURLY;

var_name: ID;
var_dec: type var_name (COMMA var_name)* SEMICOLON;


type: INT | BOOLEAN;

statement: location assign_op expr SEMICOLON #Assign
            | method_call SEMICOLON #MC
            | IF LBRACKET expr RBRACKET block (ELSE block)? #If
            | FOR ID EQUAL expr COMMA expr block #For
            | RETURN (expr)? SEMICOLON #Return
            | BREAK SEMICOLON #Break
            | CONTINUE SEMICOLON #Continue
            | block #B1;

assign_op: EQUAL |ADDITIONASSIGNMENT |SUBTRACTASSIGNMENT;

method_call: method_name LBRACKET  (expr (COMMA expr )*)? RBRACKET
| CALLOUT LBRACKET STRING (COMMA callout_arg )* RBRACKET;

method_name: ID;

location: ID | ID LSQUAREBRACKET expr RSQUAREBRACKET;


expr:  SUBTRACTION expr
    | NOT expr
    | expr (MULTIPLICATION|DIVISION|MODULO) expr
    | expr (ADDITION|SUBTRACTION) expr
    | expr (relational_op) expr
    | expr (EQUALTO|NOTEQUALTO) expr
    | expr cond_and expr
    | expr cond_or expr
    | location
    | method_call
    | literal
    | LBRACKET expr RBRACKET ;



callout_arg: expr | STRING;


relational_op: LESSTHANBRACKET|GREATERTHANBRACKET|LTOREQUALBRACKET|GTOREQUALBRACKET;


cond_and: LOGICALAND ;
cond_or: LOGICALOR ;

literal: INTLITERAL|CHAR|BOOL_LITERAL;

//bin_op: arith_op|relational_op| equality_op|cond_and|cond_or;

//arith_op: ADDITION|SUBTRACTION|MULTIPLICATION|DIVISION|MODULO;

//equality_op: EQUALTO|NOTEQUALTO;

//bool_literal:BOOL_LITERAL;

//char_literal:CHAR;

//string_literal:STRING;

//expr:expr_cond_or;
//
//expr_cond_or: expr_cond_and((cond_or)expr_cond_and)*;
//expr_cond_and:expr_equality((cond_and)expr_equality)*;
//expr_equality:expr_relational((EQUALTO|NOTEQUALTO)expr_relational)* ;
//expr_relational:expr_add_subt((relational_op)expr_add_subt)*;
//expr_add_subt:expr_mult_div_rem((ADDITION|SUBTRACTION)expr_mult_div_rem)* ;
//expr_mult_div_rem:expr_not((MULTIPLICATION|DIVISION|MODULO) expr_not)* ;
//expr_not:expr_minus( (NOT)expr_minus)*;
//expr_minus: SUBTRACTION expr;

//will be in exam, so will be explaining int literal and eplaining decaf lexar
//screecast #4, week 4
