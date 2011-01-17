lexer grammar InternalCpnDsl;
@header {
package net.certware.planning.cpn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'argumentmodel' ;
T12 : 'cost' ;
T13 : 'duration' ;
T14 : 'team' ;
T15 : 'facility' ;
T16 : 'plan' ;
T17 : 'element' ;
T18 : 'estimated' ;
T19 : '(' ;
T20 : ')' ;
T21 : 'actual' ;

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 485
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 487
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 489
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 491
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 493
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 495
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g" 497
RULE_ANY_OTHER : .;


