lexer grammar InternalCpnDsl;
@header {
package net.certware.planning.cpn.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
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

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1325
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1327
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1329
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1331
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1333
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1335
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g" 1337
RULE_ANY_OTHER : .;


