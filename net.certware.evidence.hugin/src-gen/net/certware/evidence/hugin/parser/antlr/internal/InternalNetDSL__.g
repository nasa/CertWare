lexer grammar InternalNetDSL;
@header {
package net.certware.evidence.hugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '+' ;
T12 : '-' ;
T13 : '.' ;
T14 : 'net' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'discrete' ;
T18 : 'continuous' ;
T19 : 'node' ;
T20 : 'decision' ;
T21 : 'utility' ;
T22 : 'function' ;
T23 : 'states' ;
T24 : '=' ;
T25 : '(' ;
T26 : ')' ;
T27 : ';' ;
T28 : 'label' ;
T29 : 'position' ;
T30 : 'subtype' ;
T31 : 'boolean' ;
T32 : 'number' ;
T33 : 'interval' ;
T34 : 'state_values' ;
T35 : 'node_size' ;
T36 : 'potential' ;
T37 : '|' ;
T38 : 'data' ;
T39 : 'normal' ;
T40 : ',' ;
T41 : '*' ;
T42 : 'model_nodes' ;
T43 : 'samples_per_interval' ;
T44 : 'model_data' ;
T45 : 'class' ;
T46 : 'instance' ;
T47 : ':' ;
T48 : '^' ;
T49 : 'false' ;
T50 : 'true' ;
T51 : '==' ;
T52 : '!=' ;
T53 : '<>' ;
T54 : '<' ;
T55 : '<=' ;
T56 : '>' ;
T57 : '>=' ;
T58 : '/' ;
T59 : 'truncate' ;
T60 : 'Normal' ;
T61 : 'LogNormal' ;
T62 : 'Beta' ;
T63 : 'Gamma' ;
T64 : 'Exponential' ;
T65 : 'Weibull' ;
T66 : 'Uniform' ;
T67 : 'Triangular' ;
T68 : 'PERT' ;
T69 : 'Binomial' ;
T70 : 'Poisson' ;
T71 : 'NegativeBinomial' ;
T72 : 'Geometric' ;
T73 : 'Distribution' ;
T74 : 'NoisyOR' ;
T75 : 'min' ;
T76 : 'max' ;
T77 : 'log' ;
T78 : 'log2' ;
T79 : 'log10' ;
T80 : 'exp' ;
T81 : 'sin' ;
T82 : 'cos' ;
T83 : 'tan' ;
T84 : 'sinh' ;
T85 : 'cosh' ;
T86 : 'tanh' ;
T87 : 'sqrt' ;
T88 : 'abs' ;
T89 : 'floor' ;
T90 : 'ceil' ;
T91 : 'mod' ;
T92 : 'if' ;
T93 : 'and' ;
T94 : 'or' ;
T95 : 'not' ;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4083
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4085
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4087
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4089
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4091
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4093
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4095
RULE_ANY_OTHER : .;


