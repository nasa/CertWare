package net.certware.argument.gsn.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import net.certware.argument.gsn.services.GsnDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGsnDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'assumed'", "'Goal'", "'{'", "'identifier'", "'description'", "'content'", "'toBeSupported'", "'isTagged'", "','", "'}'", "'subGoals'", "'strategies'", "'goalContexts'", "'assumptions'", "'goalSolutions'", "'TaggedValue'", "'key'", "'value'", "'true'", "'false'", "'Strategy'", "'goals'", "'justifications'", "'strategyContexts'", "'strategySolutions'", "'Context'", "'Assumption'", "'Solution'", "'target'", "'('", "')'", "'source'", "'solutionEvidence'", "'solutionContexts'", "'Justification'", "'Evidence'", "'Argument'", "'containsArgumentElement'", "'containsArgumentLink'", "'containsArgument'", "'Annotation'", "'AssertedInference'", "'AssertedEvidence'", "'AssertedContext'", "'AssertedCounterEvidence'", "'AssertedChallenge'", "'Claim'", "'EvidenceAssertion'", "'InformationElement'", "'ArgumentReasoning'", "'describes'", "'hasStructure'", "'CitationElement'", "'refersToArgumentElement'", "'refersToArgument'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalGsnDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g"; }



     	private GsnDslGrammarAccess grammarAccess;
     	
        public InternalGsnDslParser(TokenStream input, IAstFactory factory, GsnDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Goal";	
       	}
       	
       	@Override
       	protected GsnDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleGoal
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:77:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:78:2: (iv_ruleGoal= ruleGoal EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:79:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_in_entryRuleGoal75);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGoal85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGoal


    // $ANTLR start ruleGoal
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:86:1: ruleGoal returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Goal' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )? ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )? ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )? ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )? ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )? '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        AntlrDatatypeRuleToken lv_identifier_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_content_9_0 = null;

        AntlrDatatypeRuleToken lv_toBeSupported_11_0 = null;

        EObject lv_isTagged_14_0 = null;

        EObject lv_isTagged_16_0 = null;

        EObject lv_subGoals_20_0 = null;

        EObject lv_subGoals_22_0 = null;

        EObject lv_strategies_26_0 = null;

        EObject lv_strategies_28_0 = null;

        EObject lv_goalContexts_32_0 = null;

        EObject lv_goalContexts_34_0 = null;

        EObject lv_assumptions_38_0 = null;

        EObject lv_assumptions_40_0 = null;

        EObject lv_goalSolutions_44_0 = null;

        EObject lv_goalSolutions_46_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:91:6: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Goal' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )? ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )? ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )? ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )? ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:92:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Goal' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )? ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )? ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )? ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )? ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:92:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Goal' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )? ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )? ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )? ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )? ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:92:2: () ( (lv_assumed_1_0= 'assumed' ) )? 'Goal' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )? ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )? ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )? ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )? ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:92:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getGoalAccess().getGoalAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getGoalAccess().getGoalAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:103:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:104:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:104:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:105:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)input.LT(1);
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleGoal137); 

                            createLeafNode(grammarAccess.getGoalAccess().getAssumedAssumedKeyword_1_0(), "assumed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "assumed", true, "assumed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal161); 

                    createLeafNode(grammarAccess.getGoalAccess().getGoalKeyword_2(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal171); 

                    createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:132:1: ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:132:3: 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal182); 

                            createLeafNode(grammarAccess.getGoalAccess().getIdentifierKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:136:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:137:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:137:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:138:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getIdentifierEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGoal203);
                    lv_identifier_5_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_5_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:160:4: ( 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:160:6: 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal216); 

                            createLeafNode(grammarAccess.getGoalAccess().getDescriptionKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:164:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:165:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:165:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:166:3: lv_description_7_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getDescriptionEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGoal237);
                    lv_description_7_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_7_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:188:4: ( 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:188:6: 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleGoal250); 

                            createLeafNode(grammarAccess.getGoalAccess().getContentKeyword_6_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:192:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:193:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:193:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:194:3: lv_content_9_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getContentEStringParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGoal271);
                    lv_content_9_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_9_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:216:4: ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:216:6: 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleGoal284); 

                            createLeafNode(grammarAccess.getGoalAccess().getToBeSupportedKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:220:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:221:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:221:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:222:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleGoal305);
                    lv_toBeSupported_11_0=ruleEBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"toBeSupported",
                    	        		lv_toBeSupported_11_0, 
                    	        		"EBoolean", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:244:4: ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:244:6: 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleGoal318); 

                            createLeafNode(grammarAccess.getGoalAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal328); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:252:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:253:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:253:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:254:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleGoal349);
                    lv_isTagged_14_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_14_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:276:2: ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:276:4: ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal360); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:280:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:281:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:281:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:282:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleGoal381);
                    	    lv_isTagged_16_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_16_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal393); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:308:3: ( 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:308:5: 'subGoals' '{' ( (lv_subGoals_20_0= ruleGoal ) ) ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* '}'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleGoal406); 

                            createLeafNode(grammarAccess.getGoalAccess().getSubGoalsKeyword_9_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal416); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_9_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:316:1: ( (lv_subGoals_20_0= ruleGoal ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:317:1: (lv_subGoals_20_0= ruleGoal )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:317:1: (lv_subGoals_20_0= ruleGoal )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:318:3: lv_subGoals_20_0= ruleGoal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getSubGoalsGoalParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleGoal437);
                    lv_subGoals_20_0=ruleGoal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"subGoals",
                    	        		lv_subGoals_20_0, 
                    	        		"Goal", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:340:2: ( ',' ( (lv_subGoals_22_0= ruleGoal ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:340:4: ',' ( (lv_subGoals_22_0= ruleGoal ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal448); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:344:1: ( (lv_subGoals_22_0= ruleGoal ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:345:1: (lv_subGoals_22_0= ruleGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:345:1: (lv_subGoals_22_0= ruleGoal )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:346:3: lv_subGoals_22_0= ruleGoal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getSubGoalsGoalParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleGoal469);
                    	    lv_subGoals_22_0=ruleGoal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subGoals",
                    	    	        		lv_subGoals_22_0, 
                    	    	        		"Goal", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal481); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_9_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:372:3: ( 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:372:5: 'strategies' '{' ( (lv_strategies_26_0= ruleStrategy ) ) ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* '}'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleGoal494); 

                            createLeafNode(grammarAccess.getGoalAccess().getStrategiesKeyword_10_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal504); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_10_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:380:1: ( (lv_strategies_26_0= ruleStrategy ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:381:1: (lv_strategies_26_0= ruleStrategy )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:381:1: (lv_strategies_26_0= ruleStrategy )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:382:3: lv_strategies_26_0= ruleStrategy
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getStrategiesStrategyParserRuleCall_10_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleGoal525);
                    lv_strategies_26_0=ruleStrategy();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"strategies",
                    	        		lv_strategies_26_0, 
                    	        		"Strategy", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:404:2: ( ',' ( (lv_strategies_28_0= ruleStrategy ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:404:4: ',' ( (lv_strategies_28_0= ruleStrategy ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal536); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_10_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:408:1: ( (lv_strategies_28_0= ruleStrategy ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:409:1: (lv_strategies_28_0= ruleStrategy )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:409:1: (lv_strategies_28_0= ruleStrategy )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:410:3: lv_strategies_28_0= ruleStrategy
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getStrategiesStrategyParserRuleCall_10_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleGoal557);
                    	    lv_strategies_28_0=ruleStrategy();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"strategies",
                    	    	        		lv_strategies_28_0, 
                    	    	        		"Strategy", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal569); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_10_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:436:3: ( 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:436:5: 'goalContexts' '{' ( (lv_goalContexts_32_0= ruleContext ) ) ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* '}'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleGoal582); 

                            createLeafNode(grammarAccess.getGoalAccess().getGoalContextsKeyword_11_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal592); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_11_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:444:1: ( (lv_goalContexts_32_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:445:1: (lv_goalContexts_32_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:445:1: (lv_goalContexts_32_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:446:3: lv_goalContexts_32_0= ruleContext
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getGoalContextsContextParserRuleCall_11_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleGoal613);
                    lv_goalContexts_32_0=ruleContext();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"goalContexts",
                    	        		lv_goalContexts_32_0, 
                    	        		"Context", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:468:2: ( ',' ( (lv_goalContexts_34_0= ruleContext ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:468:4: ',' ( (lv_goalContexts_34_0= ruleContext ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal624); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_11_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:472:1: ( (lv_goalContexts_34_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:473:1: (lv_goalContexts_34_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:473:1: (lv_goalContexts_34_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:474:3: lv_goalContexts_34_0= ruleContext
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getGoalContextsContextParserRuleCall_11_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleGoal645);
                    	    lv_goalContexts_34_0=ruleContext();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"goalContexts",
                    	    	        		lv_goalContexts_34_0, 
                    	    	        		"Context", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal657); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_11_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:500:3: ( 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:500:5: 'assumptions' '{' ( (lv_assumptions_38_0= ruleAssumption ) ) ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* '}'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleGoal670); 

                            createLeafNode(grammarAccess.getGoalAccess().getAssumptionsKeyword_12_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal680); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_12_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:508:1: ( (lv_assumptions_38_0= ruleAssumption ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:509:1: (lv_assumptions_38_0= ruleAssumption )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:509:1: (lv_assumptions_38_0= ruleAssumption )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:510:3: lv_assumptions_38_0= ruleAssumption
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getAssumptionsAssumptionParserRuleCall_12_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleGoal701);
                    lv_assumptions_38_0=ruleAssumption();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"assumptions",
                    	        		lv_assumptions_38_0, 
                    	        		"Assumption", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:532:2: ( ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:532:4: ',' ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal712); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_12_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:536:1: ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:537:1: (lv_assumptions_40_0= ruleAssumption )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:537:1: (lv_assumptions_40_0= ruleAssumption )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:538:3: lv_assumptions_40_0= ruleAssumption
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getAssumptionsAssumptionParserRuleCall_12_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleGoal733);
                    	    lv_assumptions_40_0=ruleAssumption();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"assumptions",
                    	    	        		lv_assumptions_40_0, 
                    	    	        		"Assumption", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal745); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_12_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:564:3: ( 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:564:5: 'goalSolutions' '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* '}'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleGoal758); 

                            createLeafNode(grammarAccess.getGoalAccess().getGoalSolutionsKeyword_13_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal768); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_13_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:572:1: ( (lv_goalSolutions_44_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:573:1: (lv_goalSolutions_44_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:573:1: (lv_goalSolutions_44_0= ruleSolution )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:574:3: lv_goalSolutions_44_0= ruleSolution
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleGoal789);
                    lv_goalSolutions_44_0=ruleSolution();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"goalSolutions",
                    	        		lv_goalSolutions_44_0, 
                    	        		"Solution", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:596:2: ( ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:596:4: ',' ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal800); 

                    	            createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_13_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:600:1: ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:601:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:601:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:602:3: lv_goalSolutions_46_0= ruleSolution
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleGoal821);
                    	    lv_goalSolutions_46_0=ruleSolution();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"goalSolutions",
                    	    	        		lv_goalSolutions_46_0, 
                    	    	        		"Solution", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal833); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_13_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal845); 

                    createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_14(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGoal


    // $ANTLR start entryRuleArgumentElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:642:1: entryRuleArgumentElement returns [EObject current=null] : iv_ruleArgumentElement= ruleArgumentElement EOF ;
    public final EObject entryRuleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:643:2: (iv_ruleArgumentElement= ruleArgumentElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:644:2: iv_ruleArgumentElement= ruleArgumentElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_entryRuleArgumentElement883);
            iv_ruleArgumentElement=ruleArgumentElement();
            _fsp--;

             current =iv_ruleArgumentElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentElement893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgumentElement


    // $ANTLR start ruleArgumentElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:651:1: ruleArgumentElement returns [EObject current=null] : (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) ;
    public final EObject ruleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Claim_Impl_0 = null;

        EObject this_EvidenceAssertion_1 = null;

        EObject this_InformationElement_2 = null;

        EObject this_ArgumentReasoning_3 = null;

        EObject this_CitationElement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:656:6: ( (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:657:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:657:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==58) ) {
                    alt18=2;
                }
                else if ( (LA18_1==57) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("657:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                alt18=1;
                }
                break;
            case 58:
                {
                alt18=2;
                }
                break;
            case 59:
                {
                alt18=3;
                }
                break;
            case 60:
                {
                alt18=4;
                }
                break;
            case 63:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("657:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:658:5: this_Claim_Impl_0= ruleClaim_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentElementAccess().getClaim_ImplParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClaim_Impl_in_ruleArgumentElement940);
                    this_Claim_Impl_0=ruleClaim_Impl();
                    _fsp--;

                     
                            current = this_Claim_Impl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:668:5: this_EvidenceAssertion_1= ruleEvidenceAssertion
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentElementAccess().getEvidenceAssertionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEvidenceAssertion_in_ruleArgumentElement967);
                    this_EvidenceAssertion_1=ruleEvidenceAssertion();
                    _fsp--;

                     
                            current = this_EvidenceAssertion_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:678:5: this_InformationElement_2= ruleInformationElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentElementAccess().getInformationElementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInformationElement_in_ruleArgumentElement994);
                    this_InformationElement_2=ruleInformationElement();
                    _fsp--;

                     
                            current = this_InformationElement_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:688:5: this_ArgumentReasoning_3= ruleArgumentReasoning
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentElementAccess().getArgumentReasoningParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentReasoning_in_ruleArgumentElement1021);
                    this_ArgumentReasoning_3=ruleArgumentReasoning();
                    _fsp--;

                     
                            current = this_ArgumentReasoning_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:698:5: this_CitationElement_4= ruleCitationElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentElementAccess().getCitationElementParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCitationElement_in_ruleArgumentElement1048);
                    this_CitationElement_4=ruleCitationElement();
                    _fsp--;

                     
                            current = this_CitationElement_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgumentElement


    // $ANTLR start entryRuleArgumentLink
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:714:1: entryRuleArgumentLink returns [EObject current=null] : iv_ruleArgumentLink= ruleArgumentLink EOF ;
    public final EObject entryRuleArgumentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentLink = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:715:2: (iv_ruleArgumentLink= ruleArgumentLink EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:716:2: iv_ruleArgumentLink= ruleArgumentLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentLinkRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_entryRuleArgumentLink1083);
            iv_ruleArgumentLink=ruleArgumentLink();
            _fsp--;

             current =iv_ruleArgumentLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentLink1093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgumentLink


    // $ANTLR start ruleArgumentLink
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:723:1: ruleArgumentLink returns [EObject current=null] : (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) ;
    public final EObject ruleArgumentLink() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_AssertedInference_1 = null;

        EObject this_AssertedEvidence_2 = null;

        EObject this_AssertedContext_3 = null;

        EObject this_AssertedCounterEvidence_4 = null;

        EObject this_AssertedChallenge_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:728:6: ( (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:729:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:729:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            case 55:
                {
                alt19=5;
                }
                break;
            case 56:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("729:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:730:5: this_Annotation_0= ruleAnnotation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAnnotationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleArgumentLink1140);
                    this_Annotation_0=ruleAnnotation();
                    _fsp--;

                     
                            current = this_Annotation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:740:5: this_AssertedInference_1= ruleAssertedInference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedInferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedInference_in_ruleArgumentLink1167);
                    this_AssertedInference_1=ruleAssertedInference();
                    _fsp--;

                     
                            current = this_AssertedInference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:750:5: this_AssertedEvidence_2= ruleAssertedEvidence
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedEvidenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedEvidence_in_ruleArgumentLink1194);
                    this_AssertedEvidence_2=ruleAssertedEvidence();
                    _fsp--;

                     
                            current = this_AssertedEvidence_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:760:5: this_AssertedContext_3= ruleAssertedContext
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedContextParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedContext_in_ruleArgumentLink1221);
                    this_AssertedContext_3=ruleAssertedContext();
                    _fsp--;

                     
                            current = this_AssertedContext_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:770:5: this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedCounterEvidenceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedCounterEvidence_in_ruleArgumentLink1248);
                    this_AssertedCounterEvidence_4=ruleAssertedCounterEvidence();
                    _fsp--;

                     
                            current = this_AssertedCounterEvidence_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:780:5: this_AssertedChallenge_5= ruleAssertedChallenge
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedChallengeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedChallenge_in_ruleArgumentLink1275);
                    this_AssertedChallenge_5=ruleAssertedChallenge();
                    _fsp--;

                     
                            current = this_AssertedChallenge_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgumentLink


    // $ANTLR start entryRuleTaggedValue
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:796:1: entryRuleTaggedValue returns [EObject current=null] : iv_ruleTaggedValue= ruleTaggedValue EOF ;
    public final EObject entryRuleTaggedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedValue = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:797:2: (iv_ruleTaggedValue= ruleTaggedValue EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:798:2: iv_ruleTaggedValue= ruleTaggedValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTaggedValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1310);
            iv_ruleTaggedValue=ruleTaggedValue();
            _fsp--;

             current =iv_ruleTaggedValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaggedValue1320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTaggedValue


    // $ANTLR start ruleTaggedValue
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:805:1: ruleTaggedValue returns [EObject current=null] : ( () 'TaggedValue' '{' ( 'key' ( (lv_key_4_0= ruleEString ) ) )? ( 'value' ( (lv_value_6_0= ruleEString ) ) )? '}' ) ;
    public final EObject ruleTaggedValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:810:6: ( ( () 'TaggedValue' '{' ( 'key' ( (lv_key_4_0= ruleEString ) ) )? ( 'value' ( (lv_value_6_0= ruleEString ) ) )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:811:1: ( () 'TaggedValue' '{' ( 'key' ( (lv_key_4_0= ruleEString ) ) )? ( 'value' ( (lv_value_6_0= ruleEString ) ) )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:811:1: ( () 'TaggedValue' '{' ( 'key' ( (lv_key_4_0= ruleEString ) ) )? ( 'value' ( (lv_value_6_0= ruleEString ) ) )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:811:2: () 'TaggedValue' '{' ( 'key' ( (lv_key_4_0= ruleEString ) ) )? ( 'value' ( (lv_value_6_0= ruleEString ) ) )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:811:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:812:5: 
            {
             
                    temp=factory.create(grammarAccess.getTaggedValueAccess().getTaggedValueAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTaggedValueAccess().getTaggedValueAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,26,FollowSets000.FOLLOW_26_in_ruleTaggedValue1364); 

                    createLeafNode(grammarAccess.getTaggedValueAccess().getTaggedValueKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleTaggedValue1374); 

                    createLeafNode(grammarAccess.getTaggedValueAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:830:1: ( 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:830:3: 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleTaggedValue1385); 

                            createLeafNode(grammarAccess.getTaggedValueAccess().getKeyKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:834:1: ( (lv_key_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:835:1: (lv_key_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:835:1: (lv_key_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:836:3: lv_key_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTaggedValueAccess().getKeyEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaggedValue1406);
                    lv_key_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTaggedValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"key",
                    	        		lv_key_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:858:4: ( 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:858:6: 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleTaggedValue1419); 

                            createLeafNode(grammarAccess.getTaggedValueAccess().getValueKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:862:1: ( (lv_value_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:863:1: (lv_value_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:863:1: (lv_value_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:864:3: lv_value_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTaggedValueAccess().getValueEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaggedValue1440);
                    lv_value_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTaggedValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleTaggedValue1452); 

                    createLeafNode(grammarAccess.getTaggedValueAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTaggedValue


    // $ANTLR start entryRuleEBoolean
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:898:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:899:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:900:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1489);
            iv_ruleEBoolean=ruleEBoolean();
            _fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEBoolean


    // $ANTLR start ruleEBoolean
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:907:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:912:6: ( (kw= 'true' | kw= 'false' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:913:1: (kw= 'true' | kw= 'false' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:913:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("913:1: (kw= 'true' | kw= 'false' )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:914:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleEBoolean1538); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:921:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean1557); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEBooleanAccess().getFalseKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEBoolean


    // $ANTLR start entryRuleEString
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:934:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:935:2: (iv_ruleEString= ruleEString EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:936:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1598);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:943:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:948:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:949:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:949:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("949:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:949:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1649); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:957:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1675); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start entryRuleStrategy
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:972:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:973:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:974:2: iv_ruleStrategy= ruleStrategy EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStrategyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy1720);
            iv_ruleStrategy=ruleStrategy();
            _fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy1730); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStrategy


    // $ANTLR start ruleStrategy
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:981:1: ruleStrategy returns [EObject current=null] : ( () 'Strategy' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )? ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )? ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )? ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )? '}' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;

        EObject lv_goals_17_0 = null;

        EObject lv_goals_19_0 = null;

        EObject lv_justifications_23_0 = null;

        EObject lv_justifications_25_0 = null;

        EObject lv_strategyContexts_29_0 = null;

        EObject lv_strategyContexts_31_0 = null;

        EObject lv_strategySolutions_35_0 = null;

        EObject lv_strategySolutions_37_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:986:6: ( ( () 'Strategy' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )? ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )? ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )? ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:987:1: ( () 'Strategy' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )? ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )? ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )? ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:987:1: ( () 'Strategy' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )? ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )? ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )? ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:987:2: () 'Strategy' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )? ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )? ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )? ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:987:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:988:5: 
            {
             
                    temp=factory.create(grammarAccess.getStrategyAccess().getStrategyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStrategyAccess().getStrategyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleStrategy1774); 

                    createLeafNode(grammarAccess.getStrategyAccess().getStrategyKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1784); 

                    createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1006:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1006:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleStrategy1795); 

                            createLeafNode(grammarAccess.getStrategyAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1010:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1011:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1011:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1012:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1816);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1034:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1034:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleStrategy1829); 

                            createLeafNode(grammarAccess.getStrategyAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1038:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1039:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1039:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1040:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1850);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1062:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1062:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleStrategy1863); 

                            createLeafNode(grammarAccess.getStrategyAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1066:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1067:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1067:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1068:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1884);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1090:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1090:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleStrategy1897); 

                            createLeafNode(grammarAccess.getStrategyAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1907); 

                            createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1098:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1099:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1099:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1100:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy1928);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1122:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==19) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1122:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy1939); 

                    	            createLeafNode(grammarAccess.getStrategyAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1126:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1127:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1127:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1128:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy1960);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy1972); 

                            createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1154:3: ( 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1154:5: 'goals' '{' ( (lv_goals_17_0= ruleGoal ) ) ( ',' ( (lv_goals_19_0= ruleGoal ) ) )* '}'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleStrategy1985); 

                            createLeafNode(grammarAccess.getStrategyAccess().getGoalsKeyword_7_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1995); 

                            createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1162:1: ( (lv_goals_17_0= ruleGoal ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1163:1: (lv_goals_17_0= ruleGoal )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1163:1: (lv_goals_17_0= ruleGoal )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1164:3: lv_goals_17_0= ruleGoal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getGoalsGoalParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleStrategy2016);
                    lv_goals_17_0=ruleGoal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"goals",
                    	        		lv_goals_17_0, 
                    	        		"Goal", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1186:2: ( ',' ( (lv_goals_19_0= ruleGoal ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1186:4: ',' ( (lv_goals_19_0= ruleGoal ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2027); 

                    	            createLeafNode(grammarAccess.getStrategyAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1190:1: ( (lv_goals_19_0= ruleGoal ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1191:1: (lv_goals_19_0= ruleGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1191:1: (lv_goals_19_0= ruleGoal )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1192:3: lv_goals_19_0= ruleGoal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getGoalsGoalParserRuleCall_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleStrategy2048);
                    	    lv_goals_19_0=ruleGoal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"goals",
                    	    	        		lv_goals_19_0, 
                    	    	        		"Goal", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2060); 

                            createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1218:3: ( 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1218:5: 'justifications' '{' ( (lv_justifications_23_0= ruleJustification ) ) ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )* '}'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleStrategy2073); 

                            createLeafNode(grammarAccess.getStrategyAccess().getJustificationsKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2083); 

                            createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1226:1: ( (lv_justifications_23_0= ruleJustification ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1227:1: (lv_justifications_23_0= ruleJustification )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1227:1: (lv_justifications_23_0= ruleJustification )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1228:3: lv_justifications_23_0= ruleJustification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2104);
                    lv_justifications_23_0=ruleJustification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"justifications",
                    	        		lv_justifications_23_0, 
                    	        		"Justification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1250:2: ( ',' ( (lv_justifications_25_0= ruleJustification ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1250:4: ',' ( (lv_justifications_25_0= ruleJustification ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2115); 

                    	            createLeafNode(grammarAccess.getStrategyAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1254:1: ( (lv_justifications_25_0= ruleJustification ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1255:1: (lv_justifications_25_0= ruleJustification )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1255:1: (lv_justifications_25_0= ruleJustification )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1256:3: lv_justifications_25_0= ruleJustification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2136);
                    	    lv_justifications_25_0=ruleJustification();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"justifications",
                    	    	        		lv_justifications_25_0, 
                    	    	        		"Justification", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2148); 

                            createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1282:3: ( 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1282:5: 'strategyContexts' '{' ( (lv_strategyContexts_29_0= ruleContext ) ) ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* '}'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleStrategy2161); 

                            createLeafNode(grammarAccess.getStrategyAccess().getStrategyContextsKeyword_9_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2171); 

                            createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_9_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1290:1: ( (lv_strategyContexts_29_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1291:1: (lv_strategyContexts_29_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1291:1: (lv_strategyContexts_29_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1292:3: lv_strategyContexts_29_0= ruleContext
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2192);
                    lv_strategyContexts_29_0=ruleContext();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"strategyContexts",
                    	        		lv_strategyContexts_29_0, 
                    	        		"Context", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1314:2: ( ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1314:4: ',' ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2203); 

                    	            createLeafNode(grammarAccess.getStrategyAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1318:1: ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1319:1: (lv_strategyContexts_31_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1319:1: (lv_strategyContexts_31_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1320:3: lv_strategyContexts_31_0= ruleContext
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2224);
                    	    lv_strategyContexts_31_0=ruleContext();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"strategyContexts",
                    	    	        		lv_strategyContexts_31_0, 
                    	    	        		"Context", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2236); 

                            createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_9_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1346:3: ( 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1346:5: 'strategySolutions' '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* '}'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleStrategy2249); 

                            createLeafNode(grammarAccess.getStrategyAccess().getStrategySolutionsKeyword_10_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2259); 

                            createLeafNode(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_10_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1354:1: ( (lv_strategySolutions_35_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1355:1: (lv_strategySolutions_35_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1355:1: (lv_strategySolutions_35_0= ruleSolution )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1356:3: lv_strategySolutions_35_0= ruleSolution
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2280);
                    lv_strategySolutions_35_0=ruleSolution();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"strategySolutions",
                    	        		lv_strategySolutions_35_0, 
                    	        		"Solution", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1378:2: ( ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==19) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1378:4: ',' ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2291); 

                    	            createLeafNode(grammarAccess.getStrategyAccess().getCommaKeyword_10_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1382:1: ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1383:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1383:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1384:3: lv_strategySolutions_37_0= ruleSolution
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2312);
                    	    lv_strategySolutions_37_0=ruleSolution();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStrategyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"strategySolutions",
                    	    	        		lv_strategySolutions_37_0, 
                    	    	        		"Solution", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2324); 

                            createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_10_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2336); 

                    createLeafNode(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStrategy


    // $ANTLR start entryRuleContext
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1422:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1423:2: (iv_ruleContext= ruleContext EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1424:2: iv_ruleContext= ruleContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContextRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext2372);
            iv_ruleContext=ruleContext();
            _fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext2382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContext


    // $ANTLR start ruleContext
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1431:1: ruleContext returns [EObject current=null] : ( () 'Context' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1436:6: ( ( () 'Context' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1437:1: ( () 'Context' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1437:1: ( () 'Context' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1437:2: () 'Context' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1437:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1438:5: 
            {
             
                    temp=factory.create(grammarAccess.getContextAccess().getContextAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getContextAccess().getContextAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleContext2426); 

                    createLeafNode(grammarAccess.getContextAccess().getContextKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2436); 

                    createLeafNode(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1456:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1456:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleContext2447); 

                            createLeafNode(grammarAccess.getContextAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1460:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1461:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1461:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1462:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2468);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1484:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1484:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleContext2481); 

                            createLeafNode(grammarAccess.getContextAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1488:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1489:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1489:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1490:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2502);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1512:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1512:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleContext2515); 

                            createLeafNode(grammarAccess.getContextAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1516:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1517:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1517:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1518:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2536);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1540:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==18) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1540:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleContext2549); 

                            createLeafNode(grammarAccess.getContextAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2559); 

                            createLeafNode(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1548:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1549:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1549:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1550:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2580);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1572:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==19) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1572:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleContext2591); 

                    	            createLeafNode(grammarAccess.getContextAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1576:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1577:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1577:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1578:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2612);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2624); 

                            createLeafNode(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2636); 

                    createLeafNode(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContext


    // $ANTLR start entryRuleAssumption
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1616:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1617:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1618:2: iv_ruleAssumption= ruleAssumption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssumptionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_entryRuleAssumption2672);
            iv_ruleAssumption=ruleAssumption();
            _fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssumption2682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssumption


    // $ANTLR start ruleAssumption
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1625:1: ruleAssumption returns [EObject current=null] : ( () 'Assumption' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1630:6: ( ( () 'Assumption' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1631:1: ( () 'Assumption' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1631:1: ( () 'Assumption' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1631:2: () 'Assumption' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1631:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1632:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssumptionAccess().getAssumptionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssumptionAccess().getAssumptionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleAssumption2726); 

                    createLeafNode(grammarAccess.getAssumptionAccess().getAssumptionKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption2736); 

                    createLeafNode(grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1650:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1650:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssumption2747); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1654:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1655:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1655:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1656:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssumptionAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2768);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssumptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1678:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1678:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssumption2781); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1682:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1683:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1683:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1684:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssumptionAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2802);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssumptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1706:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1706:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssumption2815); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1710:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1711:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1711:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1712:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssumptionAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2836);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssumptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1734:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1734:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssumption2849); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption2859); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1742:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1743:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1743:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1744:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption2880);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssumptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1766:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1766:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssumption2891); 

                    	            createLeafNode(grammarAccess.getAssumptionAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1770:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1771:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1771:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1772:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption2912);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssumptionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption2924); 

                            createLeafNode(grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption2936); 

                    createLeafNode(grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssumption


    // $ANTLR start entryRuleSolution
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1810:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1811:2: (iv_ruleSolution= ruleSolution EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1812:2: iv_ruleSolution= ruleSolution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSolutionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSolution_in_entryRuleSolution2972);
            iv_ruleSolution=ruleSolution();
            _fsp--;

             current =iv_ruleSolution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolution2982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSolution


    // $ANTLR start ruleSolution
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1819:1: ruleSolution returns [EObject current=null] : ( () 'Solution' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )? ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )? '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;

        EObject lv_solutionEvidence_29_0 = null;

        EObject lv_solutionEvidence_31_0 = null;

        EObject lv_solutionContexts_35_0 = null;

        EObject lv_solutionContexts_37_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1824:6: ( ( () 'Solution' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )? ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:1: ( () 'Solution' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )? ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:1: ( () 'Solution' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )? ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:2: () 'Solution' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )? ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1826:5: 
            {
             
                    temp=factory.create(grammarAccess.getSolutionAccess().getSolutionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSolutionAccess().getSolutionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,38,FollowSets000.FOLLOW_38_in_ruleSolution3026); 

                    createLeafNode(grammarAccess.getSolutionAccess().getSolutionKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3036); 

                    createLeafNode(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1844:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1844:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleSolution3047); 

                            createLeafNode(grammarAccess.getSolutionAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1848:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1849:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1849:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1850:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3068);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1872:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1872:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleSolution3081); 

                            createLeafNode(grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1876:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1877:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1877:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1878:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3102);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1900:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1900:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSolution3115); 

                            createLeafNode(grammarAccess.getSolutionAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1904:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1905:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1905:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1906:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3136);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1928:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1928:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleSolution3149); 

                            createLeafNode(grammarAccess.getSolutionAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3159); 

                            createLeafNode(grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1936:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1937:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1937:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1938:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3182);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1952:2: ( ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==19) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1952:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3193); 

                    	            createLeafNode(grammarAccess.getSolutionAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1956:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1957:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1957:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1958:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3216);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3228); 

                            createLeafNode(grammarAccess.getSolutionAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1976:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1976:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleSolution3241); 

                            createLeafNode(grammarAccess.getSolutionAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3251); 

                            createLeafNode(grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1984:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1985:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1985:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1986:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3274);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2000:2: ( ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==19) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2000:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3285); 

                    	            createLeafNode(grammarAccess.getSolutionAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2004:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2005:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2005:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2006:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3308);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3320); 

                            createLeafNode(grammarAccess.getSolutionAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2024:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2024:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleSolution3333); 

                            createLeafNode(grammarAccess.getSolutionAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3343); 

                            createLeafNode(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2032:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2033:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2033:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2034:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3364);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2056:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==19) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2056:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3375); 

                    	            createLeafNode(grammarAccess.getSolutionAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2060:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2061:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2061:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2062:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3396);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3408); 

                            createLeafNode(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2088:3: ( 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2088:5: 'solutionEvidence' '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* '}'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleSolution3421); 

                            createLeafNode(grammarAccess.getSolutionAccess().getSolutionEvidenceKeyword_9_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3431); 

                            createLeafNode(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_9_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2096:1: ( (lv_solutionEvidence_29_0= ruleEvidence ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2097:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2097:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2098:3: lv_solutionEvidence_29_0= ruleEvidence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3452);
                    lv_solutionEvidence_29_0=ruleEvidence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"solutionEvidence",
                    	        		lv_solutionEvidence_29_0, 
                    	        		"Evidence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2120:2: ( ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==19) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2120:4: ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3463); 

                    	            createLeafNode(grammarAccess.getSolutionAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2124:1: ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2125:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2125:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2126:3: lv_solutionEvidence_31_0= ruleEvidence
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3484);
                    	    lv_solutionEvidence_31_0=ruleEvidence();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"solutionEvidence",
                    	    	        		lv_solutionEvidence_31_0, 
                    	    	        		"Evidence", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3496); 

                            createLeafNode(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_9_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2152:3: ( 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2152:5: 'solutionContexts' '{' ( (lv_solutionContexts_35_0= ruleContext ) ) ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* '}'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleSolution3509); 

                            createLeafNode(grammarAccess.getSolutionAccess().getSolutionContextsKeyword_10_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3519); 

                            createLeafNode(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_10_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2160:1: ( (lv_solutionContexts_35_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2161:1: (lv_solutionContexts_35_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2161:1: (lv_solutionContexts_35_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2162:3: lv_solutionContexts_35_0= ruleContext
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3540);
                    lv_solutionContexts_35_0=ruleContext();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"solutionContexts",
                    	        		lv_solutionContexts_35_0, 
                    	        		"Context", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2184:2: ( ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==19) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2184:4: ',' ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3551); 

                    	            createLeafNode(grammarAccess.getSolutionAccess().getCommaKeyword_10_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2188:1: ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2189:1: (lv_solutionContexts_37_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2189:1: (lv_solutionContexts_37_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2190:3: lv_solutionContexts_37_0= ruleContext
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3572);
                    	    lv_solutionContexts_37_0=ruleContext();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSolutionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"solutionContexts",
                    	    	        		lv_solutionContexts_37_0, 
                    	    	        		"Context", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3584); 

                            createLeafNode(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_10_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3596); 

                    createLeafNode(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSolution


    // $ANTLR start entryRuleJustification
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2228:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2229:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2230:2: iv_ruleJustification= ruleJustification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJustificationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleJustification_in_entryRuleJustification3632);
            iv_ruleJustification=ruleJustification();
            _fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJustification3642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJustification


    // $ANTLR start ruleJustification
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2237:1: ruleJustification returns [EObject current=null] : ( () 'Justification' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleJustification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2242:6: ( ( () 'Justification' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2243:1: ( () 'Justification' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2243:1: ( () 'Justification' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2243:2: () 'Justification' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2243:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2244:5: 
            {
             
                    temp=factory.create(grammarAccess.getJustificationAccess().getJustificationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getJustificationAccess().getJustificationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,45,FollowSets000.FOLLOW_45_in_ruleJustification3686); 

                    createLeafNode(grammarAccess.getJustificationAccess().getJustificationKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification3696); 

                    createLeafNode(grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2262:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==14) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2262:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleJustification3707); 

                            createLeafNode(grammarAccess.getJustificationAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2266:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2267:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2267:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2268:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification3728);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2290:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==15) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2290:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleJustification3741); 

                            createLeafNode(grammarAccess.getJustificationAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2294:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2295:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2295:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2296:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification3762);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2318:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2318:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleJustification3775); 

                            createLeafNode(grammarAccess.getJustificationAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2322:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2323:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2323:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2324:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification3796);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2346:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==18) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2346:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleJustification3809); 

                            createLeafNode(grammarAccess.getJustificationAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification3819); 

                            createLeafNode(grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2354:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2355:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2355:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2356:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification3840);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2378:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==19) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2378:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleJustification3851); 

                    	            createLeafNode(grammarAccess.getJustificationAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2382:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2383:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2383:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2384:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification3872);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification3884); 

                            createLeafNode(grammarAccess.getJustificationAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification3896); 

                    createLeafNode(grammarAccess.getJustificationAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJustification


    // $ANTLR start entryRuleEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2422:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2423:2: (iv_ruleEvidence= ruleEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2424:2: iv_ruleEvidence= ruleEvidence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEvidenceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_entryRuleEvidence3932);
            iv_ruleEvidence=ruleEvidence();
            _fsp--;

             current =iv_ruleEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidence3942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvidence


    // $ANTLR start ruleEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2431:1: ruleEvidence returns [EObject current=null] : ( () 'Evidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleEvidence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2436:6: ( ( () 'Evidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2437:1: ( () 'Evidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2437:1: ( () 'Evidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2437:2: () 'Evidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2437:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2438:5: 
            {
             
                    temp=factory.create(grammarAccess.getEvidenceAccess().getEvidenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEvidenceAccess().getEvidenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,46,FollowSets000.FOLLOW_46_in_ruleEvidence3986); 

                    createLeafNode(grammarAccess.getEvidenceAccess().getEvidenceKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence3996); 

                    createLeafNode(grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2456:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==14) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2456:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidence4007); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2460:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2461:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2461:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2462:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4028);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2484:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2484:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidence4041); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2488:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2489:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2489:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2490:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4062);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2512:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2512:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidence4075); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2516:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2517:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2517:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2518:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4096);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2540:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==39) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2540:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleEvidence4109); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4119); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2548:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2549:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2549:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2550:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4142);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2564:2: ( ',' ( ( ruleEString ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==19) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2564:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4153); 

                    	            createLeafNode(grammarAccess.getEvidenceAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2568:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2569:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2569:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2570:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4176);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4188); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2588:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2588:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleEvidence4201); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4211); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2596:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2597:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2597:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2598:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4234);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2612:2: ( ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==19) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2612:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4245); 

                    	            createLeafNode(grammarAccess.getEvidenceAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2616:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2617:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2617:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2618:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4268);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4280); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2636:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==18) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2636:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidence4293); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence4303); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2644:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2645:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2645:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2646:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4324);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2668:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==19) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2668:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4335); 

                    	            createLeafNode(grammarAccess.getEvidenceAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2672:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2673:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2673:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2674:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4356);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4368); 

                            createLeafNode(grammarAccess.getEvidenceAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4380); 

                    createLeafNode(grammarAccess.getEvidenceAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEvidence


    // $ANTLR start entryRuleArgument
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2712:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2713:2: (iv_ruleArgument= ruleArgument EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2714:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArgument_in_entryRuleArgument4416);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgument4426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2721:1: ruleArgument returns [EObject current=null] : ( () 'Argument' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )? ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )? ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )? '}' ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;

        EObject lv_containsArgumentElement_17_0 = null;

        EObject lv_containsArgumentElement_19_0 = null;

        EObject lv_containsArgumentLink_23_0 = null;

        EObject lv_containsArgumentLink_25_0 = null;

        EObject lv_containsArgument_29_0 = null;

        EObject lv_containsArgument_31_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2726:6: ( ( () 'Argument' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )? ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )? ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2727:1: ( () 'Argument' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )? ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )? ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2727:1: ( () 'Argument' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )? ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )? ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2727:2: () 'Argument' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )? ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )? ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2727:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2728:5: 
            {
             
                    temp=factory.create(grammarAccess.getArgumentAccess().getArgumentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getArgumentAccess().getArgumentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,47,FollowSets000.FOLLOW_47_in_ruleArgument4470); 

                    createLeafNode(grammarAccess.getArgumentAccess().getArgumentKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4480); 

                    createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2746:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==14) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2746:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleArgument4491); 

                            createLeafNode(grammarAccess.getArgumentAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2750:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2751:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2751:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2752:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4512);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2774:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==15) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2774:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleArgument4525); 

                            createLeafNode(grammarAccess.getArgumentAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2778:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2779:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2779:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2780:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4546);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2802:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==16) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2802:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleArgument4559); 

                            createLeafNode(grammarAccess.getArgumentAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2806:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2807:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2807:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2808:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4580);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2830:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==18) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2830:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleArgument4593); 

                            createLeafNode(grammarAccess.getArgumentAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4603); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2838:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2840:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument4624);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2862:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==19) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2862:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4635); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2866:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2867:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2867:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2868:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument4656);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4668); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2894:3: ( 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==48) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2894:5: 'containsArgumentElement' '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* '}'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleArgument4681); 

                            createLeafNode(grammarAccess.getArgumentAccess().getContainsArgumentElementKeyword_7_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4691); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2902:1: ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2903:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2903:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2904:3: lv_containsArgumentElement_17_0= ruleArgumentElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument4712);
                    lv_containsArgumentElement_17_0=ruleArgumentElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"containsArgumentElement",
                    	        		lv_containsArgumentElement_17_0, 
                    	        		"ArgumentElement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2926:2: ( ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==19) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2926:4: ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4723); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2930:1: ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2931:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2931:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2932:3: lv_containsArgumentElement_19_0= ruleArgumentElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument4744);
                    	    lv_containsArgumentElement_19_0=ruleArgumentElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"containsArgumentElement",
                    	    	        		lv_containsArgumentElement_19_0, 
                    	    	        		"ArgumentElement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4756); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2958:3: ( 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==49) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2958:5: 'containsArgumentLink' '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* '}'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleArgument4769); 

                            createLeafNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4779); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2966:1: ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2967:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2967:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2968:3: lv_containsArgumentLink_23_0= ruleArgumentLink
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument4800);
                    lv_containsArgumentLink_23_0=ruleArgumentLink();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"containsArgumentLink",
                    	        		lv_containsArgumentLink_23_0, 
                    	        		"ArgumentLink", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2990:2: ( ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==19) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2990:4: ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4811); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2994:1: ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2995:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2995:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2996:3: lv_containsArgumentLink_25_0= ruleArgumentLink
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument4832);
                    	    lv_containsArgumentLink_25_0=ruleArgumentLink();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"containsArgumentLink",
                    	    	        		lv_containsArgumentLink_25_0, 
                    	    	        		"ArgumentLink", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4844); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3022:3: ( 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3022:5: 'containsArgument' '{' ( (lv_containsArgument_29_0= ruleArgument ) ) ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* '}'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleArgument4857); 

                            createLeafNode(grammarAccess.getArgumentAccess().getContainsArgumentKeyword_9_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4867); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_9_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3030:1: ( (lv_containsArgument_29_0= ruleArgument ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3031:1: (lv_containsArgument_29_0= ruleArgument )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3031:1: (lv_containsArgument_29_0= ruleArgument )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3032:3: lv_containsArgument_29_0= ruleArgument
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument4888);
                    lv_containsArgument_29_0=ruleArgument();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"containsArgument",
                    	        		lv_containsArgument_29_0, 
                    	        		"Argument", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3054:2: ( ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==19) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3054:4: ',' ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4899); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3058:1: ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3059:1: (lv_containsArgument_31_0= ruleArgument )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3059:1: (lv_containsArgument_31_0= ruleArgument )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3060:3: lv_containsArgument_31_0= ruleArgument
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument4920);
                    	    lv_containsArgument_31_0=ruleArgument();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"containsArgument",
                    	    	        		lv_containsArgument_31_0, 
                    	    	        		"Argument", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4932); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_9_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4944); 

                    createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleAnnotation
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3098:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3099:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3100:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4980);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4990); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3107:1: ruleAnnotation returns [EObject current=null] : ( () 'Annotation' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3112:6: ( ( () 'Annotation' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3113:1: ( () 'Annotation' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3113:1: ( () 'Annotation' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3113:2: () 'Annotation' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3113:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3114:5: 
            {
             
                    temp=factory.create(grammarAccess.getAnnotationAccess().getAnnotationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,51,FollowSets000.FOLLOW_51_in_ruleAnnotation5034); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getAnnotationKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5044); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3132:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==14) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3132:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation5055); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3136:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3137:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3137:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3138:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5076);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3160:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==15) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3160:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation5089); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3164:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3165:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3165:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3166:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5110);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3188:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==16) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3188:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation5123); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3192:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3193:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3193:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3194:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5144);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3216:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==39) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3216:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAnnotation5157); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5167); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3224:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3225:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3225:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3226:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5190);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3240:2: ( ',' ( ( ruleEString ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==19) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3240:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5201); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3244:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3245:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3245:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3246:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5224);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5236); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3264:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==42) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3264:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation5249); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5259); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3272:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3273:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3273:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3274:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5282);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3288:2: ( ',' ( ( ruleEString ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==19) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3288:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5293); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3292:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3293:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3293:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3294:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5316);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5328); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3312:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==18) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3312:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation5341); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5351); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3320:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3321:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3321:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3322:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5372);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3344:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==19) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3344:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5383); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3348:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3349:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3349:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3350:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5404);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5416); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5428); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleAssertedInference
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3388:1: entryRuleAssertedInference returns [EObject current=null] : iv_ruleAssertedInference= ruleAssertedInference EOF ;
    public final EObject entryRuleAssertedInference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedInference = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3389:2: (iv_ruleAssertedInference= ruleAssertedInference EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3390:2: iv_ruleAssertedInference= ruleAssertedInference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertedInferenceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5464);
            iv_ruleAssertedInference=ruleAssertedInference();
            _fsp--;

             current =iv_ruleAssertedInference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedInference5474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertedInference


    // $ANTLR start ruleAssertedInference
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3397:1: ruleAssertedInference returns [EObject current=null] : ( () 'AssertedInference' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssertedInference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3402:6: ( ( () 'AssertedInference' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3403:1: ( () 'AssertedInference' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3403:1: ( () 'AssertedInference' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3403:2: () 'AssertedInference' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3403:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3404:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssertedInferenceAccess().getAssertedInferenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssertedInferenceAccess().getAssertedInferenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,52,FollowSets000.FOLLOW_52_in_ruleAssertedInference5518); 

                    createLeafNode(grammarAccess.getAssertedInferenceAccess().getAssertedInferenceKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference5528); 

                    createLeafNode(grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3422:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==14) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3422:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedInference5539); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3426:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3427:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3427:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3428:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5560);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3450:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==15) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3450:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedInference5573); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3454:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3455:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3455:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3456:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5594);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3478:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==16) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3478:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedInference5607); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3482:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3483:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3483:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3484:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5628);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3506:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==39) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3506:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedInference5641); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference5651); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3514:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3515:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3515:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3516:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5674);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3530:2: ( ',' ( ( ruleEString ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==19) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3530:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference5685); 

                    	            createLeafNode(grammarAccess.getAssertedInferenceAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3534:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3535:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3535:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3536:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5708);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference5720); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3554:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==42) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3554:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedInference5733); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference5743); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3562:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3563:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3563:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3564:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5766);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3578:2: ( ',' ( ( ruleEString ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==19) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3578:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference5777); 

                    	            createLeafNode(grammarAccess.getAssertedInferenceAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3582:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3583:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3583:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3584:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5800);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference5812); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3602:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==18) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3602:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedInference5825); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference5835); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3610:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3611:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3611:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3612:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference5856);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3634:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==19) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3634:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference5867); 

                    	            createLeafNode(grammarAccess.getAssertedInferenceAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3638:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3639:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3639:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3640:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference5888);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedInferenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference5900); 

                            createLeafNode(grammarAccess.getAssertedInferenceAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference5912); 

                    createLeafNode(grammarAccess.getAssertedInferenceAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertedInference


    // $ANTLR start entryRuleAssertedEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3678:1: entryRuleAssertedEvidence returns [EObject current=null] : iv_ruleAssertedEvidence= ruleAssertedEvidence EOF ;
    public final EObject entryRuleAssertedEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3679:2: (iv_ruleAssertedEvidence= ruleAssertedEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3680:2: iv_ruleAssertedEvidence= ruleAssertedEvidence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertedEvidenceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence5948);
            iv_ruleAssertedEvidence=ruleAssertedEvidence();
            _fsp--;

             current =iv_ruleAssertedEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedEvidence5958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertedEvidence


    // $ANTLR start ruleAssertedEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3687:1: ruleAssertedEvidence returns [EObject current=null] : ( () 'AssertedEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssertedEvidence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3692:6: ( ( () 'AssertedEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3693:1: ( () 'AssertedEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3693:1: ( () 'AssertedEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3693:2: () 'AssertedEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3693:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3694:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,53,FollowSets000.FOLLOW_53_in_ruleAssertedEvidence6002); 

                    createLeafNode(grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6012); 

                    createLeafNode(grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3712:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==14) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3712:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedEvidence6023); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3716:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3717:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3717:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3718:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6044);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3740:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==15) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3740:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedEvidence6057); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3744:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3745:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3745:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3746:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6078);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3768:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==16) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3768:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedEvidence6091); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3772:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3773:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3773:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3774:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6112);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3796:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==39) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3796:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedEvidence6125); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6135); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3804:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3805:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3805:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3806:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6158);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3820:2: ( ',' ( ( ruleEString ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==19) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3820:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6169); 

                    	            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3824:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3825:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3825:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3826:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6192);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6204); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3844:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==42) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3844:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedEvidence6217); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6227); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3852:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3853:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3853:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3854:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6250);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3868:2: ( ',' ( ( ruleEString ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==19) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3868:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6261); 

                    	            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3872:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3873:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3873:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3874:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6284);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6296); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3892:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==18) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3892:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedEvidence6309); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6319); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3900:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3901:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3901:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3902:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6340);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3924:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==19) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3924:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6351); 

                    	            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3928:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3929:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3929:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3930:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6372);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6384); 

                            createLeafNode(grammarAccess.getAssertedEvidenceAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6396); 

                    createLeafNode(grammarAccess.getAssertedEvidenceAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertedEvidence


    // $ANTLR start entryRuleAssertedContext
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3968:1: entryRuleAssertedContext returns [EObject current=null] : iv_ruleAssertedContext= ruleAssertedContext EOF ;
    public final EObject entryRuleAssertedContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedContext = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3969:2: (iv_ruleAssertedContext= ruleAssertedContext EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3970:2: iv_ruleAssertedContext= ruleAssertedContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertedContextRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6432);
            iv_ruleAssertedContext=ruleAssertedContext();
            _fsp--;

             current =iv_ruleAssertedContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedContext6442); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertedContext


    // $ANTLR start ruleAssertedContext
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3977:1: ruleAssertedContext returns [EObject current=null] : ( () 'AssertedContext' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssertedContext() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3982:6: ( ( () 'AssertedContext' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3983:1: ( () 'AssertedContext' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3983:1: ( () 'AssertedContext' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3983:2: () 'AssertedContext' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3983:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3984:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssertedContextAccess().getAssertedContextAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssertedContextAccess().getAssertedContextAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,54,FollowSets000.FOLLOW_54_in_ruleAssertedContext6486); 

                    createLeafNode(grammarAccess.getAssertedContextAccess().getAssertedContextKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext6496); 

                    createLeafNode(grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4002:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==14) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4002:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedContext6507); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4006:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4007:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4007:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4008:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6528);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4030:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==15) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4030:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedContext6541); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4034:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4035:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4035:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4036:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6562);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4058:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==16) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4058:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedContext6575); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4062:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4063:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4063:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4064:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6596);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4086:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==39) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4086:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedContext6609); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext6619); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4094:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4095:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4095:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4096:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6642);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4110:2: ( ',' ( ( ruleEString ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==19) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4110:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext6653); 

                    	            createLeafNode(grammarAccess.getAssertedContextAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4114:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4115:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4115:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4116:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6676);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext6688); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4134:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==42) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4134:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedContext6701); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext6711); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4142:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4143:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4143:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4144:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6734);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4158:2: ( ',' ( ( ruleEString ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==19) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4158:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext6745); 

                    	            createLeafNode(grammarAccess.getAssertedContextAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4162:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4163:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4163:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4164:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6768);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext6780); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4182:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==18) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4182:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedContext6793); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext6803); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4190:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4191:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4191:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4192:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext6824);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4214:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==19) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4214:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext6835); 

                    	            createLeafNode(grammarAccess.getAssertedContextAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4218:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4219:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4219:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4220:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext6856);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedContextRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext6868); 

                            createLeafNode(grammarAccess.getAssertedContextAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext6880); 

                    createLeafNode(grammarAccess.getAssertedContextAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertedContext


    // $ANTLR start entryRuleAssertedCounterEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4258:1: entryRuleAssertedCounterEvidence returns [EObject current=null] : iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF ;
    public final EObject entryRuleAssertedCounterEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedCounterEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4259:2: (iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4260:2: iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertedCounterEvidenceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence6916);
            iv_ruleAssertedCounterEvidence=ruleAssertedCounterEvidence();
            _fsp--;

             current =iv_ruleAssertedCounterEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedCounterEvidence6926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertedCounterEvidence


    // $ANTLR start ruleAssertedCounterEvidence
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4267:1: ruleAssertedCounterEvidence returns [EObject current=null] : ( () 'AssertedCounterEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssertedCounterEvidence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4272:6: ( ( () 'AssertedCounterEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4273:1: ( () 'AssertedCounterEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4273:1: ( () 'AssertedCounterEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4273:2: () 'AssertedCounterEvidence' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4273:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4274:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,55,FollowSets000.FOLLOW_55_in_ruleAssertedCounterEvidence6970); 

                    createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence6980); 

                    createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4292:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==14) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4292:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedCounterEvidence6991); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4296:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4297:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4297:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4298:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7012);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4320:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==15) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4320:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedCounterEvidence7025); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4324:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4325:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4325:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4326:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7046);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4348:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==16) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4348:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedCounterEvidence7059); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4352:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4353:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4353:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4354:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7080);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4376:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==39) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4376:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedCounterEvidence7093); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7103); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4384:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4385:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4385:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4386:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7126);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4400:2: ( ',' ( ( ruleEString ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==19) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4400:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7137); 

                    	            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4404:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4405:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4405:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4406:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7160);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7172); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4424:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==42) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4424:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedCounterEvidence7185); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7195); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4432:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4433:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4433:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4434:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7218);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4448:2: ( ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==19) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4448:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7229); 

                    	            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4452:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4453:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4453:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4454:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7252);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7264); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==18) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedCounterEvidence7277); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence7287); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4480:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4481:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4481:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4482:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7308);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4504:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==19) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4504:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7319); 

                    	            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4508:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4509:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4509:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4510:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7340);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedCounterEvidenceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7352); 

                            createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7364); 

                    createLeafNode(grammarAccess.getAssertedCounterEvidenceAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertedCounterEvidence


    // $ANTLR start entryRuleAssertedChallenge
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4548:1: entryRuleAssertedChallenge returns [EObject current=null] : iv_ruleAssertedChallenge= ruleAssertedChallenge EOF ;
    public final EObject entryRuleAssertedChallenge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedChallenge = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4549:2: (iv_ruleAssertedChallenge= ruleAssertedChallenge EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4550:2: iv_ruleAssertedChallenge= ruleAssertedChallenge EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertedChallengeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7400);
            iv_ruleAssertedChallenge=ruleAssertedChallenge();
            _fsp--;

             current =iv_ruleAssertedChallenge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedChallenge7410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertedChallenge


    // $ANTLR start ruleAssertedChallenge
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4557:1: ruleAssertedChallenge returns [EObject current=null] : ( () 'AssertedChallenge' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleAssertedChallenge() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4562:6: ( ( () 'AssertedChallenge' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4563:1: ( () 'AssertedChallenge' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4563:1: ( () 'AssertedChallenge' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4563:2: () 'AssertedChallenge' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4563:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4564:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssertedChallengeAccess().getAssertedChallengeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssertedChallengeAccess().getAssertedChallengeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,56,FollowSets000.FOLLOW_56_in_ruleAssertedChallenge7454); 

                    createLeafNode(grammarAccess.getAssertedChallengeAccess().getAssertedChallengeKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge7464); 

                    createLeafNode(grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4582:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==14) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4582:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedChallenge7475); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4586:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4587:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4587:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4588:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7496);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4610:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==15) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4610:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedChallenge7509); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4614:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4615:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4615:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4616:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7530);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4638:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==16) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4638:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedChallenge7543); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4642:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4643:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4643:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4644:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7564);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4666:4: ( 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==39) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4666:6: 'target' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedChallenge7577); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getTargetKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge7587); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4674:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4675:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4675:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4676:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7610);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4690:2: ( ',' ( ( ruleEString ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==19) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4690:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge7621); 

                    	            createLeafNode(grammarAccess.getAssertedChallengeAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4694:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4695:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4695:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4696:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7644);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge7656); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4714:3: ( 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==42) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4714:5: 'source' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedChallenge7669); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getSourceKeyword_7_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge7679); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4722:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4723:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4723:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4724:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7702);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4738:2: ( ',' ( ( ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==19) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4738:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge7713); 

                    	            createLeafNode(grammarAccess.getAssertedChallengeAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4742:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4743:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4743:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4744:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7736);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge7748); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4762:3: ( 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==18) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4762:5: 'isTagged' '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedChallenge7761); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge7771); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4770:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4771:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4771:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4772:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge7792);
                    lv_isTagged_23_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_23_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4794:2: ( ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==19) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4794:4: ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge7803); 

                    	            createLeafNode(grammarAccess.getAssertedChallengeAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4798:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4799:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4799:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4800:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge7824);
                    	    lv_isTagged_25_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssertedChallengeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_25_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge7836); 

                            createLeafNode(grammarAccess.getAssertedChallengeAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge7848); 

                    createLeafNode(grammarAccess.getAssertedChallengeAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertedChallenge


    // $ANTLR start entryRuleClaim_Impl
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4838:1: entryRuleClaim_Impl returns [EObject current=null] : iv_ruleClaim_Impl= ruleClaim_Impl EOF ;
    public final EObject entryRuleClaim_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim_Impl = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4839:2: (iv_ruleClaim_Impl= ruleClaim_Impl EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4840:2: iv_ruleClaim_Impl= ruleClaim_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClaim_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl7884);
            iv_ruleClaim_Impl=ruleClaim_Impl();
            _fsp--;

             current =iv_ruleClaim_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClaim_Impl7894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClaim_Impl


    // $ANTLR start ruleClaim_Impl
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4847:1: ruleClaim_Impl returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Claim' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleClaim_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        AntlrDatatypeRuleToken lv_identifier_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_content_9_0 = null;

        AntlrDatatypeRuleToken lv_toBeSupported_11_0 = null;

        EObject lv_isTagged_14_0 = null;

        EObject lv_isTagged_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4852:6: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Claim' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4853:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Claim' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4853:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'Claim' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4853:2: () ( (lv_assumed_1_0= 'assumed' ) )? 'Claim' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4853:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4854:5: 
            {
             
                    temp=factory.create(grammarAccess.getClaim_ImplAccess().getClaimAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getClaim_ImplAccess().getClaimAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4864:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==11) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4865:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4865:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4866:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)input.LT(1);
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleClaim_Impl7946); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getAssumedAssumedKeyword_1_0(), "assumed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "assumed", true, "assumed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,57,FollowSets000.FOLLOW_57_in_ruleClaim_Impl7970); 

                    createLeafNode(grammarAccess.getClaim_ImplAccess().getClaimKeyword_2(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl7980); 

                    createLeafNode(grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4893:1: ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==14) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4893:3: 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleClaim_Impl7991); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getIdentifierKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4897:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4898:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4898:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4899:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getIdentifierEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8012);
                    lv_identifier_5_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_5_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4921:4: ( 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==15) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4921:6: 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleClaim_Impl8025); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getDescriptionKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4925:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4926:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4926:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4927:3: lv_description_7_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8046);
                    lv_description_7_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_7_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4949:4: ( 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==16) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4949:6: 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleClaim_Impl8059); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getContentKeyword_6_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4953:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4954:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4954:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4955:3: lv_content_9_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getContentEStringParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8080);
                    lv_content_9_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_9_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4977:4: ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==17) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4977:6: 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleClaim_Impl8093); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getToBeSupportedKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4981:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4982:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4982:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4983:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleClaim_Impl8114);
                    lv_toBeSupported_11_0=ruleEBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"toBeSupported",
                    	        		lv_toBeSupported_11_0, 
                    	        		"EBoolean", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5005:4: ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==18) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5005:6: 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleClaim_Impl8127); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl8137); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5013:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5014:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5014:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5015:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8158);
                    lv_isTagged_14_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_14_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5037:2: ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==19) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5037:4: ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleClaim_Impl8169); 

                    	            createLeafNode(grammarAccess.getClaim_ImplAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5041:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5042:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5042:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5043:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8190);
                    	    lv_isTagged_16_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClaim_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_16_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8202); 

                            createLeafNode(grammarAccess.getClaim_ImplAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8214); 

                    createLeafNode(grammarAccess.getClaim_ImplAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClaim_Impl


    // $ANTLR start entryRuleEvidenceAssertion
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5081:1: entryRuleEvidenceAssertion returns [EObject current=null] : iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF ;
    public final EObject entryRuleEvidenceAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidenceAssertion = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5082:2: (iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5083:2: iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEvidenceAssertionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8250);
            iv_ruleEvidenceAssertion=ruleEvidenceAssertion();
            _fsp--;

             current =iv_ruleEvidenceAssertion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidenceAssertion8260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvidenceAssertion


    // $ANTLR start ruleEvidenceAssertion
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5090:1: ruleEvidenceAssertion returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? 'EvidenceAssertion' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleEvidenceAssertion() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        AntlrDatatypeRuleToken lv_identifier_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_content_9_0 = null;

        AntlrDatatypeRuleToken lv_toBeSupported_11_0 = null;

        EObject lv_isTagged_14_0 = null;

        EObject lv_isTagged_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5095:6: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? 'EvidenceAssertion' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5096:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'EvidenceAssertion' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5096:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? 'EvidenceAssertion' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5096:2: () ( (lv_assumed_1_0= 'assumed' ) )? 'EvidenceAssertion' '{' ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? ( 'description' ( (lv_description_7_0= ruleEString ) ) )? ( 'content' ( (lv_content_9_0= ruleEString ) ) )? ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5096:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5097:5: 
            {
             
                    temp=factory.create(grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5107:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==11) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5108:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5108:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5109:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)input.LT(1);
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleEvidenceAssertion8312); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getAssumedAssumedKeyword_1_0(), "assumed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "assumed", true, "assumed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,58,FollowSets000.FOLLOW_58_in_ruleEvidenceAssertion8336); 

                    createLeafNode(grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionKeyword_2(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion8346); 

                    createLeafNode(grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5136:1: ( 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==14) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5136:3: 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidenceAssertion8357); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getIdentifierKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5140:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5141:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5141:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5142:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIdentifierEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion8378);
                    lv_identifier_5_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_5_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5164:4: ( 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==15) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5164:6: 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidenceAssertion8391); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getDescriptionKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5168:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5169:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5169:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5170:3: lv_description_7_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getDescriptionEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion8412);
                    lv_description_7_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_7_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5192:4: ( 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==16) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5192:6: 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidenceAssertion8425); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getContentKeyword_6_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5196:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5197:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5197:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5198:3: lv_content_9_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getContentEStringParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion8446);
                    lv_content_9_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_9_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5220:4: ( 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==17) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5220:6: 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleEvidenceAssertion8459); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getToBeSupportedKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5224:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5225:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5225:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5226:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion8480);
                    lv_toBeSupported_11_0=ruleEBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"toBeSupported",
                    	        		lv_toBeSupported_11_0, 
                    	        		"EBoolean", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5248:4: ( 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==18) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5248:6: 'isTagged' '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidenceAssertion8493); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion8503); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5256:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5257:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5257:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5258:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion8524);
                    lv_isTagged_14_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_14_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5280:2: ( ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==19) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5280:4: ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidenceAssertion8535); 

                    	            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5284:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5285:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5285:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5286:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion8556);
                    	    lv_isTagged_16_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getEvidenceAssertionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_16_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion8568); 

                            createLeafNode(grammarAccess.getEvidenceAssertionAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion8580); 

                    createLeafNode(grammarAccess.getEvidenceAssertionAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEvidenceAssertion


    // $ANTLR start entryRuleInformationElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5324:1: entryRuleInformationElement returns [EObject current=null] : iv_ruleInformationElement= ruleInformationElement EOF ;
    public final EObject entryRuleInformationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5325:2: (iv_ruleInformationElement= ruleInformationElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5326:2: iv_ruleInformationElement= ruleInformationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInformationElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInformationElement_in_entryRuleInformationElement8616);
            iv_ruleInformationElement=ruleInformationElement();
            _fsp--;

             current =iv_ruleInformationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInformationElement8626); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInformationElement


    // $ANTLR start ruleInformationElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5333:1: ruleInformationElement returns [EObject current=null] : ( () 'InformationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleInformationElement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5338:6: ( ( () 'InformationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5339:1: ( () 'InformationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5339:1: ( () 'InformationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5339:2: () 'InformationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5339:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5340:5: 
            {
             
                    temp=factory.create(grammarAccess.getInformationElementAccess().getInformationElementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInformationElementAccess().getInformationElementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,59,FollowSets000.FOLLOW_59_in_ruleInformationElement8670); 

                    createLeafNode(grammarAccess.getInformationElementAccess().getInformationElementKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement8680); 

                    createLeafNode(grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5358:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==14) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5358:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleInformationElement8691); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5362:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5363:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5363:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5364:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInformationElementAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement8712);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInformationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5386:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==15) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5386:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleInformationElement8725); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5390:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5391:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5391:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5392:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInformationElementAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement8746);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInformationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5414:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==16) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5414:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleInformationElement8759); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5418:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5419:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5419:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5420:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInformationElementAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement8780);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInformationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5442:4: ( 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==18) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5442:6: 'isTagged' '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleInformationElement8793); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getIsTaggedKeyword_6_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement8803); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5450:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5451:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5451:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5452:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement8824);
                    lv_isTagged_11_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInformationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_11_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5474:2: ( ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==19) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5474:4: ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleInformationElement8835); 

                    	            createLeafNode(grammarAccess.getInformationElementAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5478:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5479:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5479:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5480:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement8856);
                    	    lv_isTagged_13_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInformationElementRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_13_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement8868); 

                            createLeafNode(grammarAccess.getInformationElementAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement8880); 

                    createLeafNode(grammarAccess.getInformationElementAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInformationElement


    // $ANTLR start entryRuleArgumentReasoning
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5518:1: entryRuleArgumentReasoning returns [EObject current=null] : iv_ruleArgumentReasoning= ruleArgumentReasoning EOF ;
    public final EObject entryRuleArgumentReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentReasoning = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5519:2: (iv_ruleArgumentReasoning= ruleArgumentReasoning EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5520:2: iv_ruleArgumentReasoning= ruleArgumentReasoning EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentReasoningRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning8916);
            iv_ruleArgumentReasoning=ruleArgumentReasoning();
            _fsp--;

             current =iv_ruleArgumentReasoning; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentReasoning8926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgumentReasoning


    // $ANTLR start ruleArgumentReasoning
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5527:1: ruleArgumentReasoning returns [EObject current=null] : ( () 'ArgumentReasoning' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'hasStructure' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleArgumentReasoning() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_19_0 = null;

        EObject lv_isTagged_21_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5532:6: ( ( () 'ArgumentReasoning' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'hasStructure' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5533:1: ( () 'ArgumentReasoning' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'hasStructure' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5533:1: ( () 'ArgumentReasoning' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'hasStructure' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5533:2: () 'ArgumentReasoning' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )? ( 'hasStructure' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5533:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5534:5: 
            {
             
                    temp=factory.create(grammarAccess.getArgumentReasoningAccess().getArgumentReasoningAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getArgumentReasoningAccess().getArgumentReasoningAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,60,FollowSets000.FOLLOW_60_in_ruleArgumentReasoning8970); 

                    createLeafNode(grammarAccess.getArgumentReasoningAccess().getArgumentReasoningKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning8980); 

                    createLeafNode(grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5552:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==14) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5552:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleArgumentReasoning8991); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5556:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5557:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5557:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5558:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9012);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5580:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==15) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5580:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleArgumentReasoning9025); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5584:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5585:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5585:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5586:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9046);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5608:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==16) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5608:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleArgumentReasoning9059); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5612:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5613:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5613:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5614:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9080);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5636:4: ( 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')' )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==61) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5636:6: 'describes' '(' ( ( ruleEString ) ) ( ',' ( ( ruleEString ) ) )* ')'
                    {
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleArgumentReasoning9093); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getDescribesKeyword_6_0(), null); 
                        
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleArgumentReasoning9103); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5644:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5645:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5645:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5646:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9126);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5660:2: ( ',' ( ( ruleEString ) ) )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==19) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5660:4: ',' ( ( ruleEString ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9137); 

                    	            createLeafNode(grammarAccess.getArgumentReasoningAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5664:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5665:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5665:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5666:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9160);
                    	    ruleEString();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleArgumentReasoning9172); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getRightParenthesisKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5684:3: ( 'hasStructure' ( ( ruleEString ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==62) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5684:5: 'hasStructure' ( ( ruleEString ) )
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleArgumentReasoning9185); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getHasStructureKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5688:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5689:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5689:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5690:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getHasStructureArgumentCrossReference_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9208);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5704:4: ( 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==18) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5704:6: 'isTagged' '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleArgumentReasoning9221); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning9231); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5712:1: ( (lv_isTagged_19_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5713:1: (lv_isTagged_19_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5713:1: (lv_isTagged_19_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5714:3: lv_isTagged_19_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9252);
                    lv_isTagged_19_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_19_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5736:2: ( ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==19) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5736:4: ',' ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9263); 

                    	            createLeafNode(grammarAccess.getArgumentReasoningAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5740:1: ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5741:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5741:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5742:3: lv_isTagged_21_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9284);
                    	    lv_isTagged_21_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentReasoningRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_21_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning9296); 

                            createLeafNode(grammarAccess.getArgumentReasoningAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning9308); 

                    createLeafNode(grammarAccess.getArgumentReasoningAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgumentReasoning


    // $ANTLR start entryRuleCitationElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5780:1: entryRuleCitationElement returns [EObject current=null] : iv_ruleCitationElement= ruleCitationElement EOF ;
    public final EObject entryRuleCitationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCitationElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5781:2: (iv_ruleCitationElement= ruleCitationElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5782:2: iv_ruleCitationElement= ruleCitationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCitationElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCitationElement_in_entryRuleCitationElement9344);
            iv_ruleCitationElement=ruleCitationElement();
            _fsp--;

             current =iv_ruleCitationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCitationElement9354); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCitationElement


    // $ANTLR start ruleCitationElement
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5789:1: ruleCitationElement returns [EObject current=null] : ( () 'CitationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'refersToArgumentElement' ( ( ruleEString ) ) )? ( 'refersToArgument' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )? '}' ) ;
    public final EObject ruleCitationElement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_15_0 = null;

        EObject lv_isTagged_17_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5794:6: ( ( () 'CitationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'refersToArgumentElement' ( ( ruleEString ) ) )? ( 'refersToArgument' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )? '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5795:1: ( () 'CitationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'refersToArgumentElement' ( ( ruleEString ) ) )? ( 'refersToArgument' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )? '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5795:1: ( () 'CitationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'refersToArgumentElement' ( ( ruleEString ) ) )? ( 'refersToArgument' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )? '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5795:2: () 'CitationElement' '{' ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? ( 'description' ( (lv_description_6_0= ruleEString ) ) )? ( 'content' ( (lv_content_8_0= ruleEString ) ) )? ( 'refersToArgumentElement' ( ( ruleEString ) ) )? ( 'refersToArgument' ( ( ruleEString ) ) )? ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )? '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5795:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5796:5: 
            {
             
                    temp=factory.create(grammarAccess.getCitationElementAccess().getCitationElementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCitationElementAccess().getCitationElementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleCitationElement9398); 

                    createLeafNode(grammarAccess.getCitationElementAccess().getCitationElementKeyword_1(), null); 
                
            match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement9408); 

                    createLeafNode(grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5814:1: ( 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==14) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5814:3: 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleCitationElement9419); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getIdentifierKeyword_3_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5818:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5819:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5819:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5820:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getIdentifierEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement9440);
                    lv_identifier_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"identifier",
                    	        		lv_identifier_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5842:4: ( 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==15) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5842:6: 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleCitationElement9453); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getDescriptionKeyword_4_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5846:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5847:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5847:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5848:3: lv_description_6_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getDescriptionEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement9474);
                    lv_description_6_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5870:4: ( 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==16) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5870:6: 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleCitationElement9487); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getContentKeyword_5_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5874:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5875:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5875:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5876:3: lv_content_8_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getContentEStringParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement9508);
                    lv_content_8_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_8_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5898:4: ( 'refersToArgumentElement' ( ( ruleEString ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==64) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5898:6: 'refersToArgumentElement' ( ( ruleEString ) )
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleCitationElement9521); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getRefersToArgumentElementKeyword_6_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5902:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5903:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5903:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5904:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentElementArgumentElementCrossReference_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement9544);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5918:4: ( 'refersToArgument' ( ( ruleEString ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==65) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5918:6: 'refersToArgument' ( ( ruleEString ) )
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleCitationElement9557); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getRefersToArgumentKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5922:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5923:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5923:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5924:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentArgumentCrossReference_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement9580);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5938:4: ( 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}' )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==18) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5938:6: 'isTagged' '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleCitationElement9593); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getIsTaggedKeyword_8_0(), null); 
                        
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement9603); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5946:1: ( (lv_isTagged_15_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5947:1: (lv_isTagged_15_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5947:1: (lv_isTagged_15_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5948:3: lv_isTagged_15_0= ruleTaggedValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement9624);
                    lv_isTagged_15_0=ruleTaggedValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"isTagged",
                    	        		lv_isTagged_15_0, 
                    	        		"TaggedValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5970:2: ( ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==19) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5970:4: ',' ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    {
                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleCitationElement9635); 

                    	            createLeafNode(grammarAccess.getCitationElementAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5974:1: ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5975:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5975:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5976:3: lv_isTagged_17_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement9656);
                    	    lv_isTagged_17_0=ruleTaggedValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCitationElementRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"isTagged",
                    	    	        		lv_isTagged_17_0, 
                    	    	        		"TaggedValue", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement9668); 

                            createLeafNode(grammarAccess.getCitationElementAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement9680); 

                    createLeafNode(grammarAccess.getCitationElementAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCitationElement


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGoal137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal161 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal171 = new BitSet(new long[]{0x0000000003F7C000L});
        public static final BitSet FOLLOW_14_in_ruleGoal182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGoal203 = new BitSet(new long[]{0x0000000003F78000L});
        public static final BitSet FOLLOW_15_in_ruleGoal216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGoal237 = new BitSet(new long[]{0x0000000003F70000L});
        public static final BitSet FOLLOW_16_in_ruleGoal250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGoal271 = new BitSet(new long[]{0x0000000003F60000L});
        public static final BitSet FOLLOW_17_in_ruleGoal284 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleGoal305 = new BitSet(new long[]{0x0000000003F40000L});
        public static final BitSet FOLLOW_18_in_ruleGoal318 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal328 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleGoal349 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal360 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleGoal381 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal393 = new BitSet(new long[]{0x0000000003F00000L});
        public static final BitSet FOLLOW_21_in_ruleGoal406 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal416 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleGoal437 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal448 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleGoal469 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal481 = new BitSet(new long[]{0x0000000003D00000L});
        public static final BitSet FOLLOW_22_in_ruleGoal494 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal504 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleGoal525 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal536 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleGoal557 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal569 = new BitSet(new long[]{0x0000000003900000L});
        public static final BitSet FOLLOW_23_in_ruleGoal582 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal592 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleGoal613 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal624 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleGoal645 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal657 = new BitSet(new long[]{0x0000000003100000L});
        public static final BitSet FOLLOW_24_in_ruleGoal670 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal680 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleGoal701 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal712 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleGoal733 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal745 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleGoal758 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal768 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleGoal789 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal800 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleGoal821 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleGoal845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_entryRuleArgumentElement883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentElement893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClaim_Impl_in_ruleArgumentElement940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidenceAssertion_in_ruleArgumentElement967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInformationElement_in_ruleArgumentElement994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentReasoning_in_ruleArgumentElement1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCitationElement_in_ruleArgumentElement1048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_entryRuleArgumentLink1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentLink1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleArgumentLink1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedInference_in_ruleArgumentLink1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedEvidence_in_ruleArgumentLink1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedContext_in_ruleArgumentLink1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedCounterEvidence_in_ruleArgumentLink1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedChallenge_in_ruleArgumentLink1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaggedValue1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTaggedValue1364 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaggedValue1374 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_27_in_ruleTaggedValue1385 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaggedValue1406 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleTaggedValue1419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaggedValue1440 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaggedValue1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEBoolean1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy1720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleStrategy1774 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1784 = new BitSet(new long[]{0x0000000F0015C000L});
        public static final BitSet FOLLOW_14_in_ruleStrategy1795 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1816 = new BitSet(new long[]{0x0000000F00158000L});
        public static final BitSet FOLLOW_15_in_ruleStrategy1829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1850 = new BitSet(new long[]{0x0000000F00150000L});
        public static final BitSet FOLLOW_16_in_ruleStrategy1863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1884 = new BitSet(new long[]{0x0000000F00140000L});
        public static final BitSet FOLLOW_18_in_ruleStrategy1897 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1907 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy1928 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy1939 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy1960 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy1972 = new BitSet(new long[]{0x0000000F00100000L});
        public static final BitSet FOLLOW_32_in_ruleStrategy1985 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1995 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleStrategy2016 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2027 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleStrategy2048 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2060 = new BitSet(new long[]{0x0000000E00100000L});
        public static final BitSet FOLLOW_33_in_ruleStrategy2073 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2083 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2104 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2115 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2136 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2148 = new BitSet(new long[]{0x0000000C00100000L});
        public static final BitSet FOLLOW_34_in_ruleStrategy2161 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2171 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2192 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2203 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2224 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2236 = new BitSet(new long[]{0x0000000800100000L});
        public static final BitSet FOLLOW_35_in_ruleStrategy2249 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2259 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2280 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2291 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2312 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2324 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext2372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleContext2426 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2436 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleContext2447 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2468 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleContext2481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2502 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleContext2515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2536 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleContext2549 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2559 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2580 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleContext2591 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2612 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleContext2624 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleContext2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption2672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssumption2682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAssumption2726 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption2736 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssumption2747 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2768 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssumption2781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2802 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssumption2815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2836 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssumption2849 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption2859 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption2880 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssumption2891 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption2912 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption2924 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolution_in_entryRuleSolution2972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolution2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSolution3026 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3036 = new BitSet(new long[]{0x00001C800015C000L});
        public static final BitSet FOLLOW_14_in_ruleSolution3047 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3068 = new BitSet(new long[]{0x00001C8000158000L});
        public static final BitSet FOLLOW_15_in_ruleSolution3081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3102 = new BitSet(new long[]{0x00001C8000150000L});
        public static final BitSet FOLLOW_16_in_ruleSolution3115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3136 = new BitSet(new long[]{0x00001C8000140000L});
        public static final BitSet FOLLOW_39_in_ruleSolution3149 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3182 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3193 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3216 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3228 = new BitSet(new long[]{0x00001C0000140000L});
        public static final BitSet FOLLOW_42_in_ruleSolution3241 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3251 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3274 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3308 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3320 = new BitSet(new long[]{0x0000180000140000L});
        public static final BitSet FOLLOW_18_in_ruleSolution3333 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3343 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3364 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3375 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3396 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3408 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_43_in_ruleSolution3421 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3431 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3452 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3463 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3484 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3496 = new BitSet(new long[]{0x0000100000100000L});
        public static final BitSet FOLLOW_44_in_ruleSolution3509 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3519 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3540 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3551 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3572 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3584 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification3632 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJustification3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleJustification3686 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification3696 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleJustification3707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification3728 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleJustification3741 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification3762 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleJustification3775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification3796 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleJustification3809 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification3819 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification3840 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleJustification3851 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification3872 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleJustification3884 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleJustification3896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidence_in_entryRuleEvidence3932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidence3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEvidence3986 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence3996 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidence4007 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4028 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleEvidence4041 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4062 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleEvidence4075 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4096 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleEvidence4109 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4119 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4142 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4176 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4188 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleEvidence4201 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4234 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4268 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4280 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidence4293 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence4303 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4324 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4335 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4356 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4368 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgument4426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleArgument4470 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4480 = new BitSet(new long[]{0x000700000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgument4491 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4512 = new BitSet(new long[]{0x0007000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgument4525 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4546 = new BitSet(new long[]{0x0007000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgument4559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4580 = new BitSet(new long[]{0x0007000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgument4593 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4603 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument4624 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4635 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument4656 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4668 = new BitSet(new long[]{0x0007000000100000L});
        public static final BitSet FOLLOW_48_in_ruleArgument4681 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4691 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument4712 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4723 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument4744 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4756 = new BitSet(new long[]{0x0006000000100000L});
        public static final BitSet FOLLOW_49_in_ruleArgument4769 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4779 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument4800 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4811 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument4832 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4844 = new BitSet(new long[]{0x0004000000100000L});
        public static final BitSet FOLLOW_50_in_ruleArgument4857 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4867 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument4888 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4899 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument4920 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4932 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAnnotation5034 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5044 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation5055 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5076 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation5089 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5110 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation5123 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5144 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAnnotation5157 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5190 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5224 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5236 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation5249 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5282 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5316 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5328 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation5341 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5351 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5372 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5383 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5404 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5416 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedInference5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAssertedInference5518 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference5528 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedInference5539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5560 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedInference5573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5594 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedInference5607 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5628 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedInference5641 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference5651 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5674 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference5685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5708 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference5720 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedInference5733 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference5743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5766 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference5777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5800 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference5812 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedInference5825 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference5835 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference5856 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference5867 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference5888 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference5900 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference5912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence5948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedEvidence5958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAssertedEvidence6002 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6012 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedEvidence6023 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6044 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedEvidence6057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6078 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedEvidence6091 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6112 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedEvidence6125 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6135 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6158 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6169 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6192 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6204 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedEvidence6217 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6250 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6261 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6284 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6296 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedEvidence6309 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6319 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6340 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6351 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6372 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6384 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedContext6442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAssertedContext6486 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext6496 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedContext6507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6528 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedContext6541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6562 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedContext6575 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6596 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedContext6609 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext6619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6642 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext6653 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6676 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext6688 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedContext6701 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext6711 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6734 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext6745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6768 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext6780 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedContext6793 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext6803 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext6824 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext6835 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext6856 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext6868 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext6880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence6916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedCounterEvidence6926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAssertedCounterEvidence6970 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence6980 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedCounterEvidence6991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7012 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedCounterEvidence7025 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7046 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedCounterEvidence7059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7080 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedCounterEvidence7093 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7126 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7160 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7172 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedCounterEvidence7185 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7195 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7218 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7229 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7252 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7264 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedCounterEvidence7277 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence7287 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7308 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7319 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7340 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7352 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedChallenge7410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAssertedChallenge7454 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge7464 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedChallenge7475 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7496 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedChallenge7509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7530 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedChallenge7543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7564 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedChallenge7577 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge7587 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7610 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge7621 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7644 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge7656 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedChallenge7669 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge7679 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7702 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge7713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7736 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge7748 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedChallenge7761 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge7771 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge7792 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge7803 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge7824 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge7836 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge7848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl7884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClaim_Impl7894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleClaim_Impl7946 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleClaim_Impl7970 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl7980 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleClaim_Impl7991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8012 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleClaim_Impl8025 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8046 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleClaim_Impl8059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8080 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleClaim_Impl8093 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleClaim_Impl8114 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleClaim_Impl8127 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl8137 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8158 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleClaim_Impl8169 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8190 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8202 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidenceAssertion8260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEvidenceAssertion8312 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleEvidenceAssertion8336 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion8346 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidenceAssertion8357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion8378 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleEvidenceAssertion8391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion8412 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleEvidenceAssertion8425 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion8446 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleEvidenceAssertion8459 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion8480 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidenceAssertion8493 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion8503 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion8524 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidenceAssertion8535 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion8556 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion8568 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInformationElement_in_entryRuleInformationElement8616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInformationElement8626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleInformationElement8670 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement8680 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleInformationElement8691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement8712 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleInformationElement8725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement8746 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleInformationElement8759 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement8780 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleInformationElement8793 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement8803 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement8824 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleInformationElement8835 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement8856 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement8868 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement8880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning8916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentReasoning8926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleArgumentReasoning8970 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning8980 = new BitSet(new long[]{0x600000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgumentReasoning8991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9012 = new BitSet(new long[]{0x6000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgumentReasoning9025 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9046 = new BitSet(new long[]{0x6000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgumentReasoning9059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9080 = new BitSet(new long[]{0x6000000000140000L});
        public static final BitSet FOLLOW_61_in_ruleArgumentReasoning9093 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleArgumentReasoning9103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9126 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9160 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleArgumentReasoning9172 = new BitSet(new long[]{0x4000000000140000L});
        public static final BitSet FOLLOW_62_in_ruleArgumentReasoning9185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9208 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgumentReasoning9221 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning9231 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9252 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9263 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9284 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning9296 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning9308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCitationElement_in_entryRuleCitationElement9344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCitationElement9354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCitationElement9398 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement9408 = new BitSet(new long[]{0x000000000015C000L,0x0000000000000003L});
        public static final BitSet FOLLOW_14_in_ruleCitationElement9419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement9440 = new BitSet(new long[]{0x0000000000158000L,0x0000000000000003L});
        public static final BitSet FOLLOW_15_in_ruleCitationElement9453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement9474 = new BitSet(new long[]{0x0000000000150000L,0x0000000000000003L});
        public static final BitSet FOLLOW_16_in_ruleCitationElement9487 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement9508 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64_in_ruleCitationElement9521 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement9544 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCitationElement9557 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement9580 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleCitationElement9593 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement9603 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement9624 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleCitationElement9635 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement9656 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement9668 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement9680 = new BitSet(new long[]{0x0000000000000002L});
    }


}