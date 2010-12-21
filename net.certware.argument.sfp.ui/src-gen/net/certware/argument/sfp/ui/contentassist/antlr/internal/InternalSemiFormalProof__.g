lexer grammar InternalSemiFormalProof;
@header {
package net.certware.argument.sfp.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'unknown' ;
T12 : 'valid' ;
T13 : 'invalid' ;
T14 : 'Theorem' ;
T15 : ':' ;
T16 : '(' ;
T17 : ')' ;
T18 : ',' ;
T19 : '->' ;
T20 : '^' ;
T21 : '.' ;
T22 : '{' ;
T23 : '}' ;
T24 : 'hypothesis' ;
T25 : 'epsilon' ;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2312
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2314
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2316
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2318
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2320
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2322
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 2324
RULE_ANY_OTHER : .;


