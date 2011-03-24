lexer grammar InternalNetDSL;
@header {
package net.certware.evidence.hugin.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'decision' ;
T14 : 'utility' ;
T15 : 'function' ;
T16 : 'discrete' ;
T17 : 'continuous' ;
T18 : 'label' ;
T19 : 'boolean' ;
T20 : 'number' ;
T21 : 'interval' ;
T22 : '+=' ;
T23 : '-=' ;
T24 : '*=' ;
T25 : '/=' ;
T26 : '%=' ;
T27 : '!=' ;
T28 : '==' ;
T29 : '<=' ;
T30 : '<>' ;
T31 : '>=' ;
T32 : '<' ;
T33 : '>' ;
T34 : '+' ;
T35 : '-' ;
T36 : '*' ;
T37 : '/' ;
T38 : '!' ;
T39 : 'truncate' ;
T40 : 'Normal' ;
T41 : 'LogNormal' ;
T42 : 'Beta' ;
T43 : 'Gamma' ;
T44 : 'Exponential' ;
T45 : 'Weibull' ;
T46 : 'Uniform' ;
T47 : 'Triangular' ;
T48 : 'PERT' ;
T49 : 'Binomial' ;
T50 : 'Poisson' ;
T51 : 'NegativeBinomial' ;
T52 : 'Geometric' ;
T53 : 'Distribution' ;
T54 : 'NoisyOR' ;
T55 : 'min' ;
T56 : 'max' ;
T57 : 'log' ;
T58 : 'log2' ;
T59 : 'log10' ;
T60 : 'exp' ;
T61 : 'sin' ;
T62 : 'cos' ;
T63 : 'tan' ;
T64 : 'sinh' ;
T65 : 'cosh' ;
T66 : 'tanh' ;
T67 : 'sqrt' ;
T68 : 'abs' ;
T69 : 'floor' ;
T70 : 'ceil' ;
T71 : 'mod' ;
T72 : 'if' ;
T73 : 'and' ;
T74 : 'or' ;
T75 : 'not' ;
T76 : '.' ;
T77 : 'net' ;
T78 : '{' ;
T79 : '}' ;
T80 : 'node' ;
T81 : 'states' ;
T82 : '=' ;
T83 : '(' ;
T84 : ')' ;
T85 : ';' ;
T86 : 'position' ;
T87 : 'subtype' ;
T88 : 'state_values' ;
T89 : 'node_size' ;
T90 : 'potential' ;
T91 : '|' ;
T92 : 'data' ;
T93 : 'model_nodes' ;
T94 : 'samples_per_interval' ;
T95 : 'model_data' ;
T96 : 'class' ;
T97 : 'instance' ;
T98 : ':' ;
T99 : ',' ;
T100 : '||' ;
T101 : '&&' ;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9959
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9961
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9963
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9965
RULE_STRING : '"' ( options {greedy=false;} : . )*'"';

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9967
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9969
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9971
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9973
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 9975
RULE_ANY_OTHER : .;


