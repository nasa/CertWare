lexer grammar InternalGsnDsl;
@header {
package net.certware.argument.gsn.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'true' ;
T12 : 'false' ;
T13 : 'Goal' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'identifier' ;
T17 : 'description' ;
T18 : 'content' ;
T19 : 'toBeSupported' ;
T20 : 'isTagged' ;
T21 : ',' ;
T22 : 'subGoals' ;
T23 : 'strategies' ;
T24 : 'goalContexts' ;
T25 : 'assumptions' ;
T26 : 'goalSolutions' ;
T27 : 'TaggedValue' ;
T28 : 'key' ;
T29 : 'value' ;
T30 : 'Strategy' ;
T31 : 'goals' ;
T32 : 'justifications' ;
T33 : 'strategyContexts' ;
T34 : 'strategySolutions' ;
T35 : 'Context' ;
T36 : 'Assumption' ;
T37 : 'Solution' ;
T38 : 'target' ;
T39 : '(' ;
T40 : ')' ;
T41 : 'source' ;
T42 : 'solutionEvidence' ;
T43 : 'solutionContexts' ;
T44 : 'Justification' ;
T45 : 'Evidence' ;
T46 : 'Argument' ;
T47 : 'containsArgumentElement' ;
T48 : 'containsArgumentLink' ;
T49 : 'containsArgument' ;
T50 : 'Annotation' ;
T51 : 'AssertedInference' ;
T52 : 'AssertedEvidence' ;
T53 : 'AssertedContext' ;
T54 : 'AssertedCounterEvidence' ;
T55 : 'AssertedChallenge' ;
T56 : 'Claim' ;
T57 : 'EvidenceAssertion' ;
T58 : 'InformationElement' ;
T59 : 'ArgumentReasoning' ;
T60 : 'describes' ;
T61 : 'hasStructure' ;
T62 : 'CitationElement' ;
T63 : 'refersToArgumentElement' ;
T64 : 'refersToArgument' ;
T65 : 'assumed' ;

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25089
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25091
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25093
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25095
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25097
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25099
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.certware.argument.gsn.dsl.ui/src-gen/net/certware/argument/gsn/ui/contentassist/antlr/internal/InternalGsnDsl.g" 25101
RULE_ANY_OTHER : .;


