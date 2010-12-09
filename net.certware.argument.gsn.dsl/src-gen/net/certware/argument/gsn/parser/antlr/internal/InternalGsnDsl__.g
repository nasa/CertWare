lexer grammar InternalGsnDsl;
@header {
package net.certware.argument.gsn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'assumed' ;
T12 : 'Goal' ;
T13 : '{' ;
T14 : 'identifier' ;
T15 : 'description' ;
T16 : 'content' ;
T17 : 'toBeSupported' ;
T18 : 'isTagged' ;
T19 : ',' ;
T20 : '}' ;
T21 : 'subGoals' ;
T22 : 'strategies' ;
T23 : 'goalContexts' ;
T24 : 'assumptions' ;
T25 : 'goalSolutions' ;
T26 : 'TaggedValue' ;
T27 : 'key' ;
T28 : 'value' ;
T29 : 'true' ;
T30 : 'false' ;
T31 : 'Strategy' ;
T32 : 'goals' ;
T33 : 'justifications' ;
T34 : 'strategyContexts' ;
T35 : 'strategySolutions' ;
T36 : 'Context' ;
T37 : 'Assumption' ;
T38 : 'Solution' ;
T39 : 'target' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'source' ;
T43 : 'solutionEvidence' ;
T44 : 'solutionContexts' ;
T45 : 'Justification' ;
T46 : 'Evidence' ;
T47 : 'Argument' ;
T48 : 'containsArgumentElement' ;
T49 : 'containsArgumentLink' ;
T50 : 'containsArgument' ;
T51 : 'Annotation' ;
T52 : 'AssertedInference' ;
T53 : 'AssertedEvidence' ;
T54 : 'AssertedContext' ;
T55 : 'AssertedCounterEvidence' ;
T56 : 'AssertedChallenge' ;
T57 : 'Claim' ;
T58 : 'EvidenceAssertion' ;
T59 : 'InformationElement' ;
T60 : 'ArgumentReasoning' ;
T61 : 'describes' ;
T62 : 'hasStructure' ;
T63 : 'CitationElement' ;
T64 : 'refersToArgumentElement' ;
T65 : 'refersToArgument' ;

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6013
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6015
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6017
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6019
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6021
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6023
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g" 6025
RULE_ANY_OTHER : .;


