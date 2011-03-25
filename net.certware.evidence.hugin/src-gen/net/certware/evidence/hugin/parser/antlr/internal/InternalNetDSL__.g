lexer grammar InternalNetDSL;
@header {
package net.certware.evidence.hugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'net' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'discrete' ;
T17 : 'continuous' ;
T18 : 'node' ;
T19 : 'decision' ;
T20 : 'utility' ;
T21 : 'function' ;
T22 : 'states' ;
T23 : '=' ;
T24 : '(' ;
T25 : ')' ;
T26 : ';' ;
T27 : 'label' ;
T28 : 'position' ;
T29 : 'subtype' ;
T30 : 'boolean' ;
T31 : 'number' ;
T32 : 'interval' ;
T33 : 'state_values' ;
T34 : 'node_size' ;
T35 : 'potential' ;
T36 : '|' ;
T37 : 'data' ;
T38 : '*' ;
T39 : 'model_nodes' ;
T40 : 'samples_per_interval' ;
T41 : 'model_data' ;
T42 : 'class' ;
T43 : 'instance' ;
T44 : ':' ;
T45 : ',' ;
T46 : '+=' ;
T47 : '-=' ;
T48 : '*=' ;
T49 : '/=' ;
T50 : '%=' ;
T51 : '||' ;
T52 : '&&' ;
T53 : '!=' ;
T54 : '==' ;
T55 : '<=' ;
T56 : '<>' ;
T57 : '>=' ;
T58 : '<' ;
T59 : '>' ;
T60 : '+' ;
T61 : '-' ;
T62 : '/' ;
T63 : '!' ;
T64 : 'truncate' ;
T65 : 'Normal' ;
T66 : 'LogNormal' ;
T67 : 'Beta' ;
T68 : 'Gamma' ;
T69 : 'Exponential' ;
T70 : 'Weibull' ;
T71 : 'Uniform' ;
T72 : 'Triangular' ;
T73 : 'PERT' ;
T74 : 'Binomial' ;
T75 : 'Poisson' ;
T76 : 'NegativeBinomial' ;
T77 : 'Geometric' ;
T78 : 'Distribution' ;
T79 : 'NoisyOR' ;
T80 : 'min' ;
T81 : 'max' ;
T82 : 'log' ;
T83 : 'log2' ;
T84 : 'log10' ;
T85 : 'exp' ;
T86 : 'sin' ;
T87 : 'cos' ;
T88 : 'tan' ;
T89 : 'sinh' ;
T90 : 'cosh' ;
T91 : 'tanh' ;
T92 : 'sqrt' ;
T93 : 'abs' ;
T94 : 'floor' ;
T95 : 'ceil' ;
T96 : 'mod' ;
T97 : 'if' ;
T98 : 'and' ;
T99 : 'or' ;
T100 : 'not' ;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4971
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4973
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4975
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4977
RULE_DOUBLE : ('1'..'9' ('0'..'9')* ('.' ('0'..'9')+)? (('E'|'e') ('+'|'-')? ('0'..'9')+)?|'0' ('.' ('0'..'9')+)? (('E'|'e') ('+'|'-')? ('0'..'9')+)?);

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4979
RULE_STRING : '"' ( options {greedy=false;} : . )*'"';

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4981
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4983
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4985
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g" 4987
RULE_ANY_OTHER : .;


