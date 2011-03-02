lexer grammar InternalNetDSL;
@header {
package net.certware.evidence.hugin.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '+' ;
T12 : '-' ;
T13 : 'decision' ;
T14 : 'utility' ;
T15 : 'function' ;
T16 : 'discrete' ;
T17 : 'continuous' ;
T18 : 'label' ;
T19 : 'boolean' ;
T20 : 'number' ;
T21 : 'interval' ;
T22 : '==' ;
T23 : '=' ;
T24 : '!=' ;
T25 : '<>' ;
T26 : '<' ;
T27 : '<=' ;
T28 : '>' ;
T29 : '>=' ;
T30 : '*' ;
T31 : '/' ;
T32 : 'truncate' ;
T33 : 'Normal' ;
T34 : 'LogNormal' ;
T35 : 'Beta' ;
T36 : 'Gamma' ;
T37 : 'Exponential' ;
T38 : 'Weibull' ;
T39 : 'Uniform' ;
T40 : 'Triangular' ;
T41 : 'PERT' ;
T42 : 'Binomial' ;
T43 : 'Poisson' ;
T44 : 'NegativeBinomial' ;
T45 : 'Geometric' ;
T46 : 'min' ;
T47 : 'max' ;
T48 : 'log' ;
T49 : 'log2' ;
T50 : 'log10' ;
T51 : 'exp' ;
T52 : 'sin' ;
T53 : 'cos' ;
T54 : 'tan' ;
T55 : 'sinh' ;
T56 : 'cosh' ;
T57 : 'tanh' ;
T58 : 'sqrt' ;
T59 : 'abs' ;
T60 : 'floor' ;
T61 : 'ceil' ;
T62 : 'mod' ;
T63 : 'if' ;
T64 : 'and' ;
T65 : 'or' ;
T66 : 'not' ;
T67 : '.' ;
T68 : 'net' ;
T69 : '{' ;
T70 : '}' ;
T71 : 'node' ;
T72 : 'states' ;
T73 : '(' ;
T74 : ')' ;
T75 : ';' ;
T76 : 'position' ;
T77 : 'subtype' ;
T78 : 'state_values' ;
T79 : 'node_size' ;
T80 : 'potential' ;
T81 : '|' ;
T82 : 'data' ;
T83 : 'normal' ;
T84 : ',' ;
T85 : 'model_nodes' ;
T86 : 'samples_per_interval' ;
T87 : 'model_data' ;
T88 : 'class' ;
T89 : 'instance' ;
T90 : ':' ;
T91 : '^' ;
T92 : 'Distribution' ;
T93 : 'NoisyOR' ;
T94 : 'false' ;
T95 : 'true' ;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9188
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9190
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9192
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9194
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9196
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9198
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9200
RULE_ANY_OTHER : .;


