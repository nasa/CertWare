lexer grammar InternalSemiFormalProof;
@header {
package net.certware.argument.sfp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'Theorem' ;
T12 : ':' ;
T13 : '(' ;
T14 : ')' ;
T15 : ',' ;
T16 : 'hypothesis' ;
T17 : 'epsilon' ;
T18 : '->' ;
T19 : '^' ;
T20 : '.' ;
T21 : '{' ;
T22 : '}' ;
T23 : 'unknown' ;
T24 : 'valid' ;
T25 : 'invalid' ;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1128
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1130
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1132
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1134
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1136
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1138
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 1140
RULE_ANY_OTHER : .;


