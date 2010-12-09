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

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 962
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 964
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 966
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 968
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 970
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 972
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g" 974
RULE_ANY_OTHER : .;


