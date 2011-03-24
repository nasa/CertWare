lexer grammar InternalNetDSL;
@header {
package net.certware.evidence.hugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

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
T39 : '+' ;
T40 : '*' ;
T41 : 'model_nodes' ;
T42 : 'samples_per_interval' ;
T43 : 'model_data' ;
T44 : 'class' ;
T45 : 'instance' ;
T46 : ':' ;
T47 : ',' ;
T48 : '+=' ;
T49 : '-=' ;
T50 : '*=' ;
T51 : '/=' ;
T52 : '%=' ;
T53 : '||' ;
T54 : '&&' ;
T55 : '!=' ;
T56 : '==' ;
T57 : '<=' ;
T58 : '<>' ;
T59 : '>=' ;
T60 : '<' ;
T61 : '>' ;
T62 : '-' ;
T63 : '/' ;
T64 : '!' ;
T65 : 'truncate' ;
T66 : 'Normal' ;
T67 : 'LogNormal' ;
T68 : 'Beta' ;
T69 : 'Gamma' ;
T70 : 'Exponential' ;
T71 : 'Weibull' ;
T72 : 'Uniform' ;
T73 : 'Triangular' ;
T74 : 'PERT' ;
T75 : 'Binomial' ;
T76 : 'Poisson' ;
T77 : 'NegativeBinomial' ;
T78 : 'Geometric' ;
T79 : 'Distribution' ;
T80 : 'NoisyOR' ;
T81 : 'min' ;
T82 : 'max' ;
T83 : 'log' ;
T84 : 'log2' ;
T85 : 'log10' ;
T86 : 'exp' ;
T87 : 'sin' ;
T88 : 'cos' ;
T89 : 'tan' ;
T90 : 'sinh' ;
T91 : 'cosh' ;
T92 : 'tanh' ;
T93 : 'sqrt' ;
T94 : 'abs' ;
T95 : 'floor' ;
T96 : 'ceil' ;
T97 : 'mod' ;
T98 : 'if' ;
T99 : 'and' ;
T100 : 'or' ;
T101 : 'not' ;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4520
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4522
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4524
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4526
RULE_STRING : '"' ( options {greedy=false;} : . )*'"';

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4528
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4530
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4532
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4534
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4536
RULE_ANY_OTHER : .;


