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
T76 : 'net' ;
T77 : '{' ;
T78 : '}' ;
T79 : 'node' ;
T80 : 'states' ;
T81 : '=' ;
T82 : '(' ;
T83 : ')' ;
T84 : ';' ;
T85 : 'position' ;
T86 : 'subtype' ;
T87 : 'state_values' ;
T88 : 'node_size' ;
T89 : 'potential' ;
T90 : '|' ;
T91 : 'data' ;
T92 : 'model_nodes' ;
T93 : 'samples_per_interval' ;
T94 : 'model_data' ;
T95 : 'class' ;
T96 : 'instance' ;
T97 : ':' ;
T98 : ',' ;
T99 : '||' ;
T100 : '&&' ;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10673
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10675
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10677
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10679
RULE_DOUBLE : ('1'..'9' ('0'..'9')* ('.' ('0'..'9')+)? (('E'|'e') ('+'|'-')? ('0'..'9')+)?|'0' ('.' ('0'..'9')+)? (('E'|'e') ('+'|'-')? ('0'..'9')+)?);

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10681
RULE_STRING : '"' ( options {greedy=false;} : . )*'"';

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10683
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10685
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10687
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.evidence.hugin.ui/src-gen/net/certware/evidence/hugin/ui/contentassist/antlr/internal/InternalNetDSL.g" 10689
RULE_ANY_OTHER : .;


