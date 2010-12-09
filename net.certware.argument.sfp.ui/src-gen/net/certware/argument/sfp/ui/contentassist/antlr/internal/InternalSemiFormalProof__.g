lexer grammar InternalSemiFormalProof;
@header {
package net.certware.argument.sfp.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Theorem' ;
T12 : ':' ;
T13 : '(' ;
T14 : ')' ;
T15 : ',' ;
T16 : '->' ;
T17 : '^' ;
T18 : '.' ;
T19 : 'hypothesis' ;
T20 : 'epsilon' ;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1938
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1940
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1942
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1944
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1946
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1948
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g" 1950
RULE_ANY_OTHER : .;


