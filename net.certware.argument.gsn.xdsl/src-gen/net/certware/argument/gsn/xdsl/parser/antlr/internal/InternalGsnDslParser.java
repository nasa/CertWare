package net.certware.argument.gsn.xdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.gsn.xdsl.services.GsnDslGrammarAccess;



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
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGsnDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGsnDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGsnDslParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g"; }



     	private GsnDslGrammarAccess grammarAccess;
     	
        public InternalGsnDslParser(TokenStream input, GsnDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Goal";	
       	}
       	
       	@Override
       	protected GsnDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGoal"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:67:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:68:2: (iv_ruleGoal= ruleGoal EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:69:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_in_entryRuleGoal75);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:76:1: ruleGoal returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
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


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:79:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:80:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:80:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:80:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:80:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGoalAccess().getGoalAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:86:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:87:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:87:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:88:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGoal137); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getGoalAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal163); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getGoalKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal175); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:109:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:109:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal188); 

                        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:113:1: ( (lv_identifier_5_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:114:1: (lv_identifier_5_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:114:1: (lv_identifier_5_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:115:3: lv_identifier_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getIdentifierString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleGoal209);
                    lv_identifier_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:131:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:131:6: otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal224); 

                        	newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:135:1: ( (lv_description_7_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:136:1: (lv_description_7_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:136:1: (lv_description_7_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:137:3: lv_description_7_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleGoal245);
                    lv_description_7_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:153:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:153:6: otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGoal260); 

                        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:157:1: ( (lv_content_9_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:158:1: (lv_content_9_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:158:1: (lv_content_9_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:159:3: lv_content_9_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getContentString0ParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleGoal281);
                    lv_content_9_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:175:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:175:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGoal296); 

                        	newLeafNode(otherlv_10, grammarAccess.getGoalAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:179:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:180:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:180:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:181:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleGoal317);
                    lv_toBeSupported_11_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"toBeSupported",
                            		lv_toBeSupported_11_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:197:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:197:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGoal332); 

                        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal344); 

                        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:205:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:206:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:206:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:207:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleGoal365);
                    lv_isTagged_14_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_14_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:223:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:223:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal378); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:227:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:228:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:228:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:229:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleGoal399);
                    	    lv_isTagged_16_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_16_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal413); 

                        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:249:3: (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:249:5: otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGoal428); 

                        	newLeafNode(otherlv_18, grammarAccess.getGoalAccess().getSubGoalsKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal440); 

                        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:257:1: ( (lv_subGoals_20_0= ruleGoal ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:258:1: (lv_subGoals_20_0= ruleGoal )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:258:1: (lv_subGoals_20_0= ruleGoal )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:259:3: lv_subGoals_20_0= ruleGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getSubGoalsGoalParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleGoal461);
                    lv_subGoals_20_0=ruleGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"subGoals",
                            		lv_subGoals_20_0, 
                            		"Goal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:275:2: (otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:275:4: otherlv_21= ',' ( (lv_subGoals_22_0= ruleGoal ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal474); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:279:1: ( (lv_subGoals_22_0= ruleGoal ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:280:1: (lv_subGoals_22_0= ruleGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:280:1: (lv_subGoals_22_0= ruleGoal )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:281:3: lv_subGoals_22_0= ruleGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getSubGoalsGoalParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleGoal495);
                    	    lv_subGoals_22_0=ruleGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subGoals",
                    	            		lv_subGoals_22_0, 
                    	            		"Goal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal509); 

                        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:301:3: (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:301:5: otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGoal524); 

                        	newLeafNode(otherlv_24, grammarAccess.getGoalAccess().getStrategiesKeyword_10_0());
                        
                    otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal536); 

                        	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:309:1: ( (lv_strategies_26_0= ruleStrategy ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:310:1: (lv_strategies_26_0= ruleStrategy )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:310:1: (lv_strategies_26_0= ruleStrategy )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:311:3: lv_strategies_26_0= ruleStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getStrategiesStrategyParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleGoal557);
                    lv_strategies_26_0=ruleStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"strategies",
                            		lv_strategies_26_0, 
                            		"Strategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:327:2: (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:327:4: otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) )
                    	    {
                    	    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal570); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:331:1: ( (lv_strategies_28_0= ruleStrategy ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:332:1: (lv_strategies_28_0= ruleStrategy )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:332:1: (lv_strategies_28_0= ruleStrategy )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:333:3: lv_strategies_28_0= ruleStrategy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStrategiesStrategyParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleGoal591);
                    	    lv_strategies_28_0=ruleStrategy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"strategies",
                    	            		lv_strategies_28_0, 
                    	            		"Strategy");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal605); 

                        	newLeafNode(otherlv_29, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:353:3: (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:353:5: otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGoal620); 

                        	newLeafNode(otherlv_30, grammarAccess.getGoalAccess().getGoalContextsKeyword_11_0());
                        
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal632); 

                        	newLeafNode(otherlv_31, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:361:1: ( (lv_goalContexts_32_0= ruleContext ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:362:1: (lv_goalContexts_32_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:362:1: (lv_goalContexts_32_0= ruleContext )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:363:3: lv_goalContexts_32_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getGoalContextsContextParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleGoal653);
                    lv_goalContexts_32_0=ruleContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"goalContexts",
                            		lv_goalContexts_32_0, 
                            		"Context");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:379:2: (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:379:4: otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) )
                    	    {
                    	    otherlv_33=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal666); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getGoalAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:383:1: ( (lv_goalContexts_34_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:384:1: (lv_goalContexts_34_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:384:1: (lv_goalContexts_34_0= ruleContext )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:385:3: lv_goalContexts_34_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getGoalContextsContextParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleGoal687);
                    	    lv_goalContexts_34_0=ruleContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goalContexts",
                    	            		lv_goalContexts_34_0, 
                    	            		"Context");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal701); 

                        	newLeafNode(otherlv_35, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:405:3: (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:405:5: otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGoal716); 

                        	newLeafNode(otherlv_36, grammarAccess.getGoalAccess().getAssumptionsKeyword_12_0());
                        
                    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal728); 

                        	newLeafNode(otherlv_37, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:413:1: ( (lv_assumptions_38_0= ruleAssumption ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:414:1: (lv_assumptions_38_0= ruleAssumption )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:414:1: (lv_assumptions_38_0= ruleAssumption )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:415:3: lv_assumptions_38_0= ruleAssumption
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getAssumptionsAssumptionParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleGoal749);
                    lv_assumptions_38_0=ruleAssumption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"assumptions",
                            		lv_assumptions_38_0, 
                            		"Assumption");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:431:2: (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:431:4: otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    {
                    	    otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal762); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getGoalAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:435:1: ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:436:1: (lv_assumptions_40_0= ruleAssumption )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:436:1: (lv_assumptions_40_0= ruleAssumption )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:437:3: lv_assumptions_40_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getAssumptionsAssumptionParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleGoal783);
                    	    lv_assumptions_40_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assumptions",
                    	            		lv_assumptions_40_0, 
                    	            		"Assumption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal797); 

                        	newLeafNode(otherlv_41, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:457:3: (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:457:5: otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGoal812); 

                        	newLeafNode(otherlv_42, grammarAccess.getGoalAccess().getGoalSolutionsKeyword_13_0());
                        
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGoal824); 

                        	newLeafNode(otherlv_43, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:465:1: ( (lv_goalSolutions_44_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:466:1: (lv_goalSolutions_44_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:466:1: (lv_goalSolutions_44_0= ruleSolution )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:467:3: lv_goalSolutions_44_0= ruleSolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleGoal845);
                    lv_goalSolutions_44_0=ruleSolution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"goalSolutions",
                            		lv_goalSolutions_44_0, 
                            		"Solution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:483:2: (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:483:4: otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    {
                    	    otherlv_45=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal858); 

                    	        	newLeafNode(otherlv_45, grammarAccess.getGoalAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:487:1: ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:488:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:488:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:489:3: lv_goalSolutions_46_0= ruleSolution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleGoal879);
                    	    lv_goalSolutions_46_0=ruleSolution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goalSolutions",
                    	            		lv_goalSolutions_46_0, 
                    	            		"Solution");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal893); 

                        	newLeafNode(otherlv_47, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_48=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGoal907); 

                	newLeafNode(otherlv_48, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleArgumentElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:523:1: entryRuleArgumentElement returns [EObject current=null] : iv_ruleArgumentElement= ruleArgumentElement EOF ;
    public final EObject entryRuleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentElement = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:524:2: (iv_ruleArgumentElement= ruleArgumentElement EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:525:2: iv_ruleArgumentElement= ruleArgumentElement EOF
            {
             newCompositeNode(grammarAccess.getArgumentElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_entryRuleArgumentElement945);
            iv_ruleArgumentElement=ruleArgumentElement();

            state._fsp--;

             current =iv_ruleArgumentElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentElement955); 

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
    // $ANTLR end "entryRuleArgumentElement"


    // $ANTLR start "ruleArgumentElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:532:1: ruleArgumentElement returns [EObject current=null] : (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) ;
    public final EObject ruleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Claim_Impl_0 = null;

        EObject this_EvidenceAssertion_1 = null;

        EObject this_InformationElement_2 = null;

        EObject this_ArgumentReasoning_3 = null;

        EObject this_CitationElement_4 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:535:28: ( (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:536:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:536:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==57) ) {
                    alt18=1;
                }
                else if ( (LA18_1==58) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

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
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:537:5: this_Claim_Impl_0= ruleClaim_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentElementAccess().getClaim_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClaim_Impl_in_ruleArgumentElement1002);
                    this_Claim_Impl_0=ruleClaim_Impl();

                    state._fsp--;

                     
                            current = this_Claim_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:547:5: this_EvidenceAssertion_1= ruleEvidenceAssertion
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentElementAccess().getEvidenceAssertionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEvidenceAssertion_in_ruleArgumentElement1029);
                    this_EvidenceAssertion_1=ruleEvidenceAssertion();

                    state._fsp--;

                     
                            current = this_EvidenceAssertion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:557:5: this_InformationElement_2= ruleInformationElement
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentElementAccess().getInformationElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInformationElement_in_ruleArgumentElement1056);
                    this_InformationElement_2=ruleInformationElement();

                    state._fsp--;

                     
                            current = this_InformationElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:567:5: this_ArgumentReasoning_3= ruleArgumentReasoning
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentElementAccess().getArgumentReasoningParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentReasoning_in_ruleArgumentElement1083);
                    this_ArgumentReasoning_3=ruleArgumentReasoning();

                    state._fsp--;

                     
                            current = this_ArgumentReasoning_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:577:5: this_CitationElement_4= ruleCitationElement
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentElementAccess().getCitationElementParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCitationElement_in_ruleArgumentElement1110);
                    this_CitationElement_4=ruleCitationElement();

                    state._fsp--;

                     
                            current = this_CitationElement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentElement"


    // $ANTLR start "entryRuleArgumentLink"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:593:1: entryRuleArgumentLink returns [EObject current=null] : iv_ruleArgumentLink= ruleArgumentLink EOF ;
    public final EObject entryRuleArgumentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentLink = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:594:2: (iv_ruleArgumentLink= ruleArgumentLink EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:595:2: iv_ruleArgumentLink= ruleArgumentLink EOF
            {
             newCompositeNode(grammarAccess.getArgumentLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_entryRuleArgumentLink1145);
            iv_ruleArgumentLink=ruleArgumentLink();

            state._fsp--;

             current =iv_ruleArgumentLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentLink1155); 

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
    // $ANTLR end "entryRuleArgumentLink"


    // $ANTLR start "ruleArgumentLink"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:602:1: ruleArgumentLink returns [EObject current=null] : (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) ;
    public final EObject ruleArgumentLink() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_AssertedInference_1 = null;

        EObject this_AssertedEvidence_2 = null;

        EObject this_AssertedContext_3 = null;

        EObject this_AssertedCounterEvidence_4 = null;

        EObject this_AssertedChallenge_5 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:605:28: ( (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:606:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:606:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
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
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:607:5: this_Annotation_0= ruleAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAnnotationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleArgumentLink1202);
                    this_Annotation_0=ruleAnnotation();

                    state._fsp--;

                     
                            current = this_Annotation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:617:5: this_AssertedInference_1= ruleAssertedInference
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedInferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedInference_in_ruleArgumentLink1229);
                    this_AssertedInference_1=ruleAssertedInference();

                    state._fsp--;

                     
                            current = this_AssertedInference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:627:5: this_AssertedEvidence_2= ruleAssertedEvidence
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedEvidenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedEvidence_in_ruleArgumentLink1256);
                    this_AssertedEvidence_2=ruleAssertedEvidence();

                    state._fsp--;

                     
                            current = this_AssertedEvidence_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:637:5: this_AssertedContext_3= ruleAssertedContext
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedContextParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedContext_in_ruleArgumentLink1283);
                    this_AssertedContext_3=ruleAssertedContext();

                    state._fsp--;

                     
                            current = this_AssertedContext_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:647:5: this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedCounterEvidenceParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedCounterEvidence_in_ruleArgumentLink1310);
                    this_AssertedCounterEvidence_4=ruleAssertedCounterEvidence();

                    state._fsp--;

                     
                            current = this_AssertedCounterEvidence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:657:5: this_AssertedChallenge_5= ruleAssertedChallenge
                    {
                     
                            newCompositeNode(grammarAccess.getArgumentLinkAccess().getAssertedChallengeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssertedChallenge_in_ruleArgumentLink1337);
                    this_AssertedChallenge_5=ruleAssertedChallenge();

                    state._fsp--;

                     
                            current = this_AssertedChallenge_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentLink"


    // $ANTLR start "entryRuleString0"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:673:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:674:2: (iv_ruleString0= ruleString0 EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:675:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01373);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01384); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:682:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:685:28: (this_STRING_0= RULE_STRING )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:686:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01423); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleTaggedValue"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:701:1: entryRuleTaggedValue returns [EObject current=null] : iv_ruleTaggedValue= ruleTaggedValue EOF ;
    public final EObject entryRuleTaggedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedValue = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:702:2: (iv_ruleTaggedValue= ruleTaggedValue EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:703:2: iv_ruleTaggedValue= ruleTaggedValue EOF
            {
             newCompositeNode(grammarAccess.getTaggedValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1467);
            iv_ruleTaggedValue=ruleTaggedValue();

            state._fsp--;

             current =iv_ruleTaggedValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaggedValue1477); 

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
    // $ANTLR end "entryRuleTaggedValue"


    // $ANTLR start "ruleTaggedValue"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:710:1: ruleTaggedValue returns [EObject current=null] : ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTaggedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:713:28: ( ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:714:1: ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:714:1: ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:714:2: () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:714:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:715:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaggedValueAccess().getTaggedValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTaggedValue1523); 

                	newLeafNode(otherlv_1, grammarAccess.getTaggedValueAccess().getTaggedValueKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaggedValue1535); 

                	newLeafNode(otherlv_2, grammarAccess.getTaggedValueAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:728:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:728:3: otherlv_3= 'key' ( (lv_key_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTaggedValue1548); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaggedValueAccess().getKeyKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:732:1: ( (lv_key_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:733:1: (lv_key_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:733:1: (lv_key_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:734:3: lv_key_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaggedValueAccess().getKeyString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleTaggedValue1569);
                    lv_key_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaggedValueRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:750:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:750:6: otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTaggedValue1584); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaggedValueAccess().getValueKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:754:1: ( (lv_value_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:755:1: (lv_value_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:755:1: (lv_value_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:756:3: lv_value_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaggedValueAccess().getValueString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleTaggedValue1605);
                    lv_value_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaggedValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaggedValue1619); 

                	newLeafNode(otherlv_7, grammarAccess.getTaggedValueAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaggedValue"


    // $ANTLR start "entryRuleEString"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:784:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:785:2: (iv_ruleEString= ruleEString EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:786:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1656);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1667); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:793:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:796:28: (this_STRING_0= RULE_STRING )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:797:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1706); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:812:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:813:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:814:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1751);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1762); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:821:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:824:28: ( (kw= 'true' | kw= 'false' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:825:1: (kw= 'true' | kw= 'false' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:825:1: (kw= 'true' | kw= 'false' )
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
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:826:2: kw= 'true'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEBoolean1800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:833:2: kw= 'false'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean1819); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleStrategy"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:846:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:847:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:848:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy1859);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy1869); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:855:1: ruleStrategy returns [EObject current=null] : ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
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


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:858:28: ( ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:859:1: ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:859:1: ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:859:2: () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:859:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStrategyAccess().getStrategyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStrategy1915); 

                	newLeafNode(otherlv_1, grammarAccess.getStrategyAccess().getStrategyKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1927); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:873:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:873:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStrategy1940); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:877:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:878:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:878:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:879:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleStrategy1961);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:895:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:895:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStrategy1976); 

                        	newLeafNode(otherlv_5, grammarAccess.getStrategyAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:899:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:900:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:900:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:901:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleStrategy1997);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:917:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:917:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStrategy2012); 

                        	newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:921:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:922:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:922:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:923:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleStrategy2033);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:939:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:939:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStrategy2048); 

                        	newLeafNode(otherlv_9, grammarAccess.getStrategyAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2060); 

                        	newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:947:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:948:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:948:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:949:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy2081);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:965:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==19) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:965:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2094); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStrategyAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:969:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:970:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:970:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:971:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy2115);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2129); 

                        	newLeafNode(otherlv_14, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:991:3: (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:991:5: otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStrategy2144); 

                        	newLeafNode(otherlv_15, grammarAccess.getStrategyAccess().getGoalsKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2156); 

                        	newLeafNode(otherlv_16, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:999:1: ( (lv_goals_17_0= ruleGoal ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1000:1: (lv_goals_17_0= ruleGoal )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1000:1: (lv_goals_17_0= ruleGoal )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1001:3: lv_goals_17_0= ruleGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getGoalsGoalParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleStrategy2177);
                    lv_goals_17_0=ruleGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"goals",
                            		lv_goals_17_0, 
                            		"Goal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1017:2: (otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==19) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1017:4: otherlv_18= ',' ( (lv_goals_19_0= ruleGoal ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2190); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getStrategyAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1021:1: ( (lv_goals_19_0= ruleGoal ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1022:1: (lv_goals_19_0= ruleGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1022:1: (lv_goals_19_0= ruleGoal )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1023:3: lv_goals_19_0= ruleGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getGoalsGoalParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleStrategy2211);
                    	    lv_goals_19_0=ruleGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goals",
                    	            		lv_goals_19_0, 
                    	            		"Goal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2225); 

                        	newLeafNode(otherlv_20, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1043:3: (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1043:5: otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStrategy2240); 

                        	newLeafNode(otherlv_21, grammarAccess.getStrategyAccess().getJustificationsKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2252); 

                        	newLeafNode(otherlv_22, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1051:1: ( (lv_justifications_23_0= ruleJustification ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1052:1: (lv_justifications_23_0= ruleJustification )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1052:1: (lv_justifications_23_0= ruleJustification )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1053:3: lv_justifications_23_0= ruleJustification
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2273);
                    lv_justifications_23_0=ruleJustification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"justifications",
                            		lv_justifications_23_0, 
                            		"Justification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1069:2: (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==19) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1069:4: otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2286); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getStrategyAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1073:1: ( (lv_justifications_25_0= ruleJustification ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1074:1: (lv_justifications_25_0= ruleJustification )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1074:1: (lv_justifications_25_0= ruleJustification )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1075:3: lv_justifications_25_0= ruleJustification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2307);
                    	    lv_justifications_25_0=ruleJustification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"justifications",
                    	            		lv_justifications_25_0, 
                    	            		"Justification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2321); 

                        	newLeafNode(otherlv_26, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1095:3: (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1095:5: otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStrategy2336); 

                        	newLeafNode(otherlv_27, grammarAccess.getStrategyAccess().getStrategyContextsKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2348); 

                        	newLeafNode(otherlv_28, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1103:1: ( (lv_strategyContexts_29_0= ruleContext ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1104:1: (lv_strategyContexts_29_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1104:1: (lv_strategyContexts_29_0= ruleContext )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1105:3: lv_strategyContexts_29_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2369);
                    lv_strategyContexts_29_0=ruleContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"strategyContexts",
                            		lv_strategyContexts_29_0, 
                            		"Context");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1121:2: (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==19) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1121:4: otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2382); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getStrategyAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1125:1: ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1126:1: (lv_strategyContexts_31_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1126:1: (lv_strategyContexts_31_0= ruleContext )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1127:3: lv_strategyContexts_31_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2403);
                    	    lv_strategyContexts_31_0=ruleContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"strategyContexts",
                    	            		lv_strategyContexts_31_0, 
                    	            		"Context");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2417); 

                        	newLeafNode(otherlv_32, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1147:3: (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1147:5: otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStrategy2432); 

                        	newLeafNode(otherlv_33, grammarAccess.getStrategyAccess().getStrategySolutionsKeyword_10_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2444); 

                        	newLeafNode(otherlv_34, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1155:1: ( (lv_strategySolutions_35_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1156:1: (lv_strategySolutions_35_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1156:1: (lv_strategySolutions_35_0= ruleSolution )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1157:3: lv_strategySolutions_35_0= ruleSolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2465);
                    lv_strategySolutions_35_0=ruleSolution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"strategySolutions",
                            		lv_strategySolutions_35_0, 
                            		"Solution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1173:2: (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==19) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1173:4: otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    {
                    	    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2478); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getStrategyAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1177:1: ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1178:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1178:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1179:3: lv_strategySolutions_37_0= ruleSolution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2499);
                    	    lv_strategySolutions_37_0=ruleSolution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"strategySolutions",
                    	            		lv_strategySolutions_37_0, 
                    	            		"Solution");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2513); 

                        	newLeafNode(otherlv_38, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2527); 

                	newLeafNode(otherlv_39, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleContext"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1211:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1212:2: (iv_ruleContext= ruleContext EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1213:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext2563);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext2573); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1220:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1223:28: ( ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1224:1: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1224:1: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1224:2: () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1224:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContextAccess().getContextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleContext2619); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2631); 

                	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1238:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1238:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContext2644); 

                        	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1242:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1243:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1243:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1244:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleContext2665);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1260:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1260:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContext2680); 

                        	newLeafNode(otherlv_5, grammarAccess.getContextAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1264:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1265:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1265:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1266:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleContext2701);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1282:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1282:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContext2716); 

                        	newLeafNode(otherlv_7, grammarAccess.getContextAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1286:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1287:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1287:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1288:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleContext2737);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1304:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1304:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext2752); 

                        	newLeafNode(otherlv_9, grammarAccess.getContextAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2764); 

                        	newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1312:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1313:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1313:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1314:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2785);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1330:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==19) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1330:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContext2798); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1334:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1335:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1335:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1336:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2819);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2833); 

                        	newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2847); 

                	newLeafNode(otherlv_15, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAssumption"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1368:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1369:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1370:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_entryRuleAssumption2883);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssumption2893); 

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
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1377:1: ruleAssumption returns [EObject current=null] : ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1380:28: ( ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1381:1: ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1381:1: ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1381:2: () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1381:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1382:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssumptionAccess().getAssumptionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAssumption2939); 

                	newLeafNode(otherlv_1, grammarAccess.getAssumptionAccess().getAssumptionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption2951); 

                	newLeafNode(otherlv_2, grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1395:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1395:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssumption2964); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssumptionAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1399:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1400:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1400:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1401:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssumption2985);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1417:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1417:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssumption3000); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssumptionAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1421:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1422:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1422:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1423:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssumption3021);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1439:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==16) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1439:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssumption3036); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssumptionAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1443:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1444:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1444:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1445:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssumption3057);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1461:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==18) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1461:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssumption3072); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssumptionAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption3084); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1469:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1470:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1470:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1471:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption3105);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1487:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==19) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1487:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssumption3118); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssumptionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1491:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1492:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1492:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1493:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption3139);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption3153); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption3167); 

                	newLeafNode(otherlv_15, grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleSolution"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1525:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1526:2: (iv_ruleSolution= ruleSolution EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1527:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolution_in_entryRuleSolution3203);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolution3213); 

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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1534:1: ruleSolution returns [EObject current=null] : ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;

        EObject lv_solutionEvidence_29_0 = null;

        EObject lv_solutionEvidence_31_0 = null;

        EObject lv_solutionContexts_35_0 = null;

        EObject lv_solutionContexts_37_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1537:28: ( ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1538:1: ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1538:1: ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1538:2: () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1538:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1539:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSolutionAccess().getSolutionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSolution3259); 

                	newLeafNode(otherlv_1, grammarAccess.getSolutionAccess().getSolutionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3271); 

                	newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1552:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1552:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSolution3284); 

                        	newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1556:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1557:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1557:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1558:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleSolution3305);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1574:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1574:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolution3320); 

                        	newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1578:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1579:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1579:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1580:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleSolution3341);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1596:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1596:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolution3356); 

                        	newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1600:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1601:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1601:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1602:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleSolution3377);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1618:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1618:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSolution3392); 

                        	newLeafNode(otherlv_9, grammarAccess.getSolutionAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3404); 

                        	newLeafNode(otherlv_10, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1626:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1627:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1627:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1628:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3427);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1641:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==19) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1641:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3440); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSolutionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1645:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1646:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1646:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1647:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3463);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3477); 

                        	newLeafNode(otherlv_14, grammarAccess.getSolutionAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1664:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1664:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSolution3492); 

                        	newLeafNode(otherlv_15, grammarAccess.getSolutionAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3504); 

                        	newLeafNode(otherlv_16, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1672:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1673:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1673:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1674:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3527);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1687:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==19) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1687:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3540); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSolutionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1691:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1692:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1692:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1693:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3563);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3577); 

                        	newLeafNode(otherlv_20, grammarAccess.getSolutionAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1710:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==18) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1710:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolution3592); 

                        	newLeafNode(otherlv_21, grammarAccess.getSolutionAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3604); 

                        	newLeafNode(otherlv_22, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1718:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1719:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1719:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1720:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3625);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1736:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==19) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1736:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3638); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getSolutionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1740:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1741:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1741:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1742:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3659);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3673); 

                        	newLeafNode(otherlv_26, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1762:3: (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1762:5: otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSolution3688); 

                        	newLeafNode(otherlv_27, grammarAccess.getSolutionAccess().getSolutionEvidenceKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3700); 

                        	newLeafNode(otherlv_28, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1770:1: ( (lv_solutionEvidence_29_0= ruleEvidence ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1771:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1771:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1772:3: lv_solutionEvidence_29_0= ruleEvidence
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3721);
                    lv_solutionEvidence_29_0=ruleEvidence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		add(
                           			current, 
                           			"solutionEvidence",
                            		lv_solutionEvidence_29_0, 
                            		"Evidence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1788:2: (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==19) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1788:4: otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3734); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getSolutionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1792:1: ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1793:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1793:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1794:3: lv_solutionEvidence_31_0= ruleEvidence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3755);
                    	    lv_solutionEvidence_31_0=ruleEvidence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"solutionEvidence",
                    	            		lv_solutionEvidence_31_0, 
                    	            		"Evidence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3769); 

                        	newLeafNode(otherlv_32, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1814:3: (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1814:5: otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSolution3784); 

                        	newLeafNode(otherlv_33, grammarAccess.getSolutionAccess().getSolutionContextsKeyword_10_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3796); 

                        	newLeafNode(otherlv_34, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1822:1: ( (lv_solutionContexts_35_0= ruleContext ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1823:1: (lv_solutionContexts_35_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1823:1: (lv_solutionContexts_35_0= ruleContext )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1824:3: lv_solutionContexts_35_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3817);
                    lv_solutionContexts_35_0=ruleContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		add(
                           			current, 
                           			"solutionContexts",
                            		lv_solutionContexts_35_0, 
                            		"Context");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1840:2: (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==19) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1840:4: otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    {
                    	    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3830); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getSolutionAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1844:1: ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1845:1: (lv_solutionContexts_37_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1845:1: (lv_solutionContexts_37_0= ruleContext )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1846:3: lv_solutionContexts_37_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3851);
                    	    lv_solutionContexts_37_0=ruleContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"solutionContexts",
                    	            		lv_solutionContexts_37_0, 
                    	            		"Context");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3865); 

                        	newLeafNode(otherlv_38, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3879); 

                	newLeafNode(otherlv_39, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleJustification"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1878:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1879:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1880:2: iv_ruleJustification= ruleJustification EOF
            {
             newCompositeNode(grammarAccess.getJustificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJustification_in_entryRuleJustification3915);
            iv_ruleJustification=ruleJustification();

            state._fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJustification3925); 

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
    // $ANTLR end "entryRuleJustification"


    // $ANTLR start "ruleJustification"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1887:1: ruleJustification returns [EObject current=null] : ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleJustification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1890:28: ( ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1891:1: ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1891:1: ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1891:2: () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1891:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJustificationAccess().getJustificationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleJustification3971); 

                	newLeafNode(otherlv_1, grammarAccess.getJustificationAccess().getJustificationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification3983); 

                	newLeafNode(otherlv_2, grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1905:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==14) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1905:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleJustification3996); 

                        	newLeafNode(otherlv_3, grammarAccess.getJustificationAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1909:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1910:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1910:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1911:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleJustification4017);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1927:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==15) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1927:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleJustification4032); 

                        	newLeafNode(otherlv_5, grammarAccess.getJustificationAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1931:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1932:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1932:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1933:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleJustification4053);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1949:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==16) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1949:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleJustification4068); 

                        	newLeafNode(otherlv_7, grammarAccess.getJustificationAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1953:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1954:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1954:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1955:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleJustification4089);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1971:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1971:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleJustification4104); 

                        	newLeafNode(otherlv_9, grammarAccess.getJustificationAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification4116); 

                        	newLeafNode(otherlv_10, grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1979:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1980:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1980:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1981:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification4137);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1997:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==19) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:1997:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleJustification4150); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getJustificationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2001:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2002:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2002:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2003:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification4171);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification4185); 

                        	newLeafNode(otherlv_14, grammarAccess.getJustificationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification4199); 

                	newLeafNode(otherlv_15, grammarAccess.getJustificationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJustification"


    // $ANTLR start "entryRuleEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2035:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2036:2: (iv_ruleEvidence= ruleEvidence EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2037:2: iv_ruleEvidence= ruleEvidence EOF
            {
             newCompositeNode(grammarAccess.getEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_entryRuleEvidence4235);
            iv_ruleEvidence=ruleEvidence();

            state._fsp--;

             current =iv_ruleEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidence4245); 

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
    // $ANTLR end "entryRuleEvidence"


    // $ANTLR start "ruleEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2044:1: ruleEvidence returns [EObject current=null] : ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2047:28: ( ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2048:1: ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2048:1: ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2048:2: () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2048:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2049:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvidenceAccess().getEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEvidence4291); 

                	newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence4303); 

                	newLeafNode(otherlv_2, grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2062:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==14) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2062:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidence4316); 

                        	newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2066:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2067:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2067:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2068:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidence4337);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2084:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==15) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2084:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidence4352); 

                        	newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2088:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2089:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2089:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2090:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidence4373);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2106:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==16) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2106:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidence4388); 

                        	newLeafNode(otherlv_7, grammarAccess.getEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2110:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2111:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2111:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2112:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidence4409);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2128:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==39) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2128:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEvidence4424); 

                        	newLeafNode(otherlv_9, grammarAccess.getEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4436); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2136:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2137:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2137:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2138:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4459);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2151:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==19) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2151:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4472); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2155:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2156:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2156:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2157:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4495);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4509); 

                        	newLeafNode(otherlv_14, grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2174:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2174:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEvidence4524); 

                        	newLeafNode(otherlv_15, grammarAccess.getEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4536); 

                        	newLeafNode(otherlv_16, grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2182:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2183:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2183:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2184:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4559);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2197:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==19) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2197:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4572); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2201:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2202:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2202:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2203:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4595);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4609); 

                        	newLeafNode(otherlv_20, grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2220:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==18) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2220:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidence4624); 

                        	newLeafNode(otherlv_21, grammarAccess.getEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence4636); 

                        	newLeafNode(otherlv_22, grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2228:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2229:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2229:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2230:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4657);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2246:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==19) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2246:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4670); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2250:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2251:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2251:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2252:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4691);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4705); 

                        	newLeafNode(otherlv_26, grammarAccess.getEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4719); 

                	newLeafNode(otherlv_27, grammarAccess.getEvidenceAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvidence"


    // $ANTLR start "entryRuleArgument"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2284:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2285:2: (iv_ruleArgument= ruleArgument EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2286:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgument_in_entryRuleArgument4755);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgument4765); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2293:1: ruleArgument returns [EObject current=null] : ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
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


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2296:28: ( ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2297:1: ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2297:1: ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2297:2: () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2297:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArgumentAccess().getArgumentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleArgument4811); 

                	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getArgumentKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4823); 

                	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2311:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==14) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2311:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArgument4836); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2315:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2316:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2316:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2317:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgument4857);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2333:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==15) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2333:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArgument4872); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2337:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2338:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2338:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2339:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgument4893);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2355:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==16) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2355:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArgument4908); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2359:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2360:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2360:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2361:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgument4929);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2377:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2377:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArgument4944); 

                        	newLeafNode(otherlv_9, grammarAccess.getArgumentAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4956); 

                        	newLeafNode(otherlv_10, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2385:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2386:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2386:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2387:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument4977);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2403:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==19) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2403:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4990); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getArgumentAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2407:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2408:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2408:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2409:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument5011);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5025); 

                        	newLeafNode(otherlv_14, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2429:3: (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==48) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2429:5: otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleArgument5040); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentAccess().getContainsArgumentElementKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument5052); 

                        	newLeafNode(otherlv_16, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2437:1: ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2438:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2438:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2439:3: lv_containsArgumentElement_17_0= ruleArgumentElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument5073);
                    lv_containsArgumentElement_17_0=ruleArgumentElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		add(
                           			current, 
                           			"containsArgumentElement",
                            		lv_containsArgumentElement_17_0, 
                            		"ArgumentElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2455:2: (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==19) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2455:4: otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5086); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getArgumentAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2459:1: ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2460:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2460:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2461:3: lv_containsArgumentElement_19_0= ruleArgumentElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument5107);
                    	    lv_containsArgumentElement_19_0=ruleArgumentElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"containsArgumentElement",
                    	            		lv_containsArgumentElement_19_0, 
                    	            		"ArgumentElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5121); 

                        	newLeafNode(otherlv_20, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2481:3: (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==49) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2481:5: otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleArgument5136); 

                        	newLeafNode(otherlv_21, grammarAccess.getArgumentAccess().getContainsArgumentLinkKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument5148); 

                        	newLeafNode(otherlv_22, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2489:1: ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2490:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2490:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2491:3: lv_containsArgumentLink_23_0= ruleArgumentLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument5169);
                    lv_containsArgumentLink_23_0=ruleArgumentLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		add(
                           			current, 
                           			"containsArgumentLink",
                            		lv_containsArgumentLink_23_0, 
                            		"ArgumentLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2507:2: (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==19) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2507:4: otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5182); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getArgumentAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2511:1: ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2512:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2512:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2513:3: lv_containsArgumentLink_25_0= ruleArgumentLink
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument5203);
                    	    lv_containsArgumentLink_25_0=ruleArgumentLink();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"containsArgumentLink",
                    	            		lv_containsArgumentLink_25_0, 
                    	            		"ArgumentLink");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5217); 

                        	newLeafNode(otherlv_26, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2533:3: (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==50) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2533:5: otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleArgument5232); 

                        	newLeafNode(otherlv_27, grammarAccess.getArgumentAccess().getContainsArgumentKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument5244); 

                        	newLeafNode(otherlv_28, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2541:1: ( (lv_containsArgument_29_0= ruleArgument ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2542:1: (lv_containsArgument_29_0= ruleArgument )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2542:1: (lv_containsArgument_29_0= ruleArgument )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2543:3: lv_containsArgument_29_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument5265);
                    lv_containsArgument_29_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		add(
                           			current, 
                           			"containsArgument",
                            		lv_containsArgument_29_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2559:2: (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==19) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2559:4: otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5278); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getArgumentAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2563:1: ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2564:1: (lv_containsArgument_31_0= ruleArgument )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2564:1: (lv_containsArgument_31_0= ruleArgument )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2565:3: lv_containsArgument_31_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument5299);
                    	    lv_containsArgument_31_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"containsArgument",
                    	            		lv_containsArgument_31_0, 
                    	            		"Argument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5313); 

                        	newLeafNode(otherlv_32, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5327); 

                	newLeafNode(otherlv_33, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAnnotation"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2597:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2598:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2599:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation5363);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation5373); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2606:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2609:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2610:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2610:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2610:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2610:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2611:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAnnotation5419); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5431); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2624:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==14) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2624:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation5444); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2628:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2629:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2629:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2630:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAnnotation5465);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2646:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==15) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2646:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation5480); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2650:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2651:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2651:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2652:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAnnotation5501);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2668:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==16) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2668:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation5516); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2672:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2673:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2673:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2674:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAnnotation5537);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2690:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==39) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2690:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAnnotation5552); 

                        	newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5564); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2698:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2699:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2699:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2700:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5587);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2713:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==19) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2713:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5600); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2717:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2718:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2718:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2719:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5623);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5637); 

                        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2736:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==42) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2736:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation5652); 

                        	newLeafNode(otherlv_15, grammarAccess.getAnnotationAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5664); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2744:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2745:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2745:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2746:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5687);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2759:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==19) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2759:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5700); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2763:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2764:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2764:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2765:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5723);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5737); 

                        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2782:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==18) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2782:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation5752); 

                        	newLeafNode(otherlv_21, grammarAccess.getAnnotationAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5764); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2790:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2791:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2791:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2792:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5785);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2808:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==19) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2808:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5798); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2812:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2813:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2813:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2814:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5819);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5833); 

                        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5847); 

                	newLeafNode(otherlv_27, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAssertedInference"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2846:1: entryRuleAssertedInference returns [EObject current=null] : iv_ruleAssertedInference= ruleAssertedInference EOF ;
    public final EObject entryRuleAssertedInference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedInference = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2847:2: (iv_ruleAssertedInference= ruleAssertedInference EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2848:2: iv_ruleAssertedInference= ruleAssertedInference EOF
            {
             newCompositeNode(grammarAccess.getAssertedInferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5883);
            iv_ruleAssertedInference=ruleAssertedInference();

            state._fsp--;

             current =iv_ruleAssertedInference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedInference5893); 

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
    // $ANTLR end "entryRuleAssertedInference"


    // $ANTLR start "ruleAssertedInference"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2855:1: ruleAssertedInference returns [EObject current=null] : ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssertedInference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2858:28: ( ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2859:1: ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2859:1: ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2859:2: () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2859:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedInferenceAccess().getAssertedInferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAssertedInference5939); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedInferenceAccess().getAssertedInferenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference5951); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2873:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==14) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2873:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedInference5964); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedInferenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2877:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2878:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2878:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2879:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedInference5985);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2895:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==15) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2895:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedInference6000); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedInferenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2899:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2900:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2900:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2901:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedInference6021);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2917:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==16) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2917:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedInference6036); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedInferenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2921:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2922:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2922:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2923:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedInference6057);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2939:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==39) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2939:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedInference6072); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedInferenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference6084); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2947:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2948:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2948:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2949:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6107);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2962:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==19) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2962:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6120); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2966:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2967:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2967:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2968:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6143);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference6157); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2985:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==42) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2985:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedInference6172); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedInferenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference6184); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2993:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2994:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2994:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:2995:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6207);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3008:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==19) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3008:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6220); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3012:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3013:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3013:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3014:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6243);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference6257); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3031:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==18) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3031:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedInference6272); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedInferenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference6284); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3039:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3040:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3040:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3041:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference6305);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3057:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==19) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3057:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6318); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3061:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3062:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3062:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3063:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference6339);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference6353); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedInferenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference6367); 

                	newLeafNode(otherlv_27, grammarAccess.getAssertedInferenceAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertedInference"


    // $ANTLR start "entryRuleAssertedEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3095:1: entryRuleAssertedEvidence returns [EObject current=null] : iv_ruleAssertedEvidence= ruleAssertedEvidence EOF ;
    public final EObject entryRuleAssertedEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedEvidence = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3096:2: (iv_ruleAssertedEvidence= ruleAssertedEvidence EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3097:2: iv_ruleAssertedEvidence= ruleAssertedEvidence EOF
            {
             newCompositeNode(grammarAccess.getAssertedEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence6403);
            iv_ruleAssertedEvidence=ruleAssertedEvidence();

            state._fsp--;

             current =iv_ruleAssertedEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedEvidence6413); 

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
    // $ANTLR end "entryRuleAssertedEvidence"


    // $ANTLR start "ruleAssertedEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3104:1: ruleAssertedEvidence returns [EObject current=null] : ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssertedEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3107:28: ( ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3108:1: ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3108:1: ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3108:2: () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3108:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3109:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAssertedEvidence6459); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6471); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3122:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==14) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3122:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedEvidence6484); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3126:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3127:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3127:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3128:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedEvidence6505);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3144:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==15) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3144:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedEvidence6520); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3148:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3149:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3149:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3150:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedEvidence6541);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3166:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==16) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3166:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedEvidence6556); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3170:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3171:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3171:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3172:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedEvidence6577);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3188:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==39) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3188:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedEvidence6592); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6604); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3196:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3197:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3197:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3198:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6627);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3211:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==19) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3211:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6640); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3215:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3216:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3216:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3217:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6663);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6677); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3234:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==42) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3234:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedEvidence6692); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6704); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3242:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3243:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3243:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3244:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6727);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3257:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==19) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3257:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6740); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3261:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3262:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3262:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3263:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6763);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6777); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3280:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==18) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3280:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedEvidence6792); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6804); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3288:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3289:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3289:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3290:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6825);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3306:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==19) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3306:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6838); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3310:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3311:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3311:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3312:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6859);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6873); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6887); 

                	newLeafNode(otherlv_27, grammarAccess.getAssertedEvidenceAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertedEvidence"


    // $ANTLR start "entryRuleAssertedContext"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3344:1: entryRuleAssertedContext returns [EObject current=null] : iv_ruleAssertedContext= ruleAssertedContext EOF ;
    public final EObject entryRuleAssertedContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedContext = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3345:2: (iv_ruleAssertedContext= ruleAssertedContext EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3346:2: iv_ruleAssertedContext= ruleAssertedContext EOF
            {
             newCompositeNode(grammarAccess.getAssertedContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6923);
            iv_ruleAssertedContext=ruleAssertedContext();

            state._fsp--;

             current =iv_ruleAssertedContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedContext6933); 

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
    // $ANTLR end "entryRuleAssertedContext"


    // $ANTLR start "ruleAssertedContext"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3353:1: ruleAssertedContext returns [EObject current=null] : ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssertedContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3356:28: ( ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3357:1: ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3357:1: ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3357:2: () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3357:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3358:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedContextAccess().getAssertedContextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAssertedContext6979); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedContextAccess().getAssertedContextKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext6991); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3371:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==14) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3371:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedContext7004); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedContextAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3375:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3376:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3376:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3377:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedContext7025);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3393:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==15) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3393:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedContext7040); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedContextAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3397:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3398:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3398:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3399:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedContext7061);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3415:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==16) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3415:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedContext7076); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedContextAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3419:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3420:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3420:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3421:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedContext7097);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3437:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==39) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3437:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedContext7112); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedContextAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext7124); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3445:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3446:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3446:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3447:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7147);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3460:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==19) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3460:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7160); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedContextAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3464:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3465:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3465:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3466:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7183);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext7197); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3483:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==42) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3483:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedContext7212); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedContextAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext7224); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3491:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3492:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3492:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3493:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7247);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3506:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==19) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3506:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7260); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedContextAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3510:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3511:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3511:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3512:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7283);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext7297); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3529:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==18) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3529:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedContext7312); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedContextAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext7324); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3537:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3538:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3538:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3539:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext7345);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3555:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==19) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3555:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7358); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedContextAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3559:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3560:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3560:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3561:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext7379);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext7393); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedContextAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext7407); 

                	newLeafNode(otherlv_27, grammarAccess.getAssertedContextAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertedContext"


    // $ANTLR start "entryRuleAssertedCounterEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3593:1: entryRuleAssertedCounterEvidence returns [EObject current=null] : iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF ;
    public final EObject entryRuleAssertedCounterEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedCounterEvidence = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3594:2: (iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3595:2: iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF
            {
             newCompositeNode(grammarAccess.getAssertedCounterEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence7443);
            iv_ruleAssertedCounterEvidence=ruleAssertedCounterEvidence();

            state._fsp--;

             current =iv_ruleAssertedCounterEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedCounterEvidence7453); 

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
    // $ANTLR end "entryRuleAssertedCounterEvidence"


    // $ANTLR start "ruleAssertedCounterEvidence"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3602:1: ruleAssertedCounterEvidence returns [EObject current=null] : ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssertedCounterEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3605:28: ( ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3606:1: ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3606:1: ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3606:2: () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3606:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAssertedCounterEvidence7499); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence7511); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3620:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==14) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3620:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedCounterEvidence7524); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3624:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3625:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3625:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3626:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7545);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3642:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==15) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3642:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedCounterEvidence7560); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3646:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3647:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3647:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3648:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7581);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3664:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==16) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3664:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedCounterEvidence7596); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedCounterEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3668:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3669:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3669:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3670:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7617);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3686:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==39) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3686:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedCounterEvidence7632); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedCounterEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7644); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3694:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3695:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3695:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3696:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7667);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3709:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==19) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3709:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7680); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3713:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3714:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3714:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3715:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7703);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7717); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3732:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==42) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3732:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedCounterEvidence7732); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedCounterEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7744); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3740:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3741:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3741:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3742:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7767);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3755:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==19) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3755:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7780); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3759:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3760:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3760:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3761:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7803);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7817); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3778:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==18) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3778:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedCounterEvidence7832); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence7844); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3786:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3787:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3787:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3788:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7865);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3804:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==19) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3804:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7878); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3808:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3809:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3809:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3810:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7899);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7913); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedCounterEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7927); 

                	newLeafNode(otherlv_27, grammarAccess.getAssertedCounterEvidenceAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertedCounterEvidence"


    // $ANTLR start "entryRuleAssertedChallenge"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3842:1: entryRuleAssertedChallenge returns [EObject current=null] : iv_ruleAssertedChallenge= ruleAssertedChallenge EOF ;
    public final EObject entryRuleAssertedChallenge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedChallenge = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3843:2: (iv_ruleAssertedChallenge= ruleAssertedChallenge EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3844:2: iv_ruleAssertedChallenge= ruleAssertedChallenge EOF
            {
             newCompositeNode(grammarAccess.getAssertedChallengeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7963);
            iv_ruleAssertedChallenge=ruleAssertedChallenge();

            state._fsp--;

             current =iv_ruleAssertedChallenge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedChallenge7973); 

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
    // $ANTLR end "entryRuleAssertedChallenge"


    // $ANTLR start "ruleAssertedChallenge"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3851:1: ruleAssertedChallenge returns [EObject current=null] : ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssertedChallenge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_23_0 = null;

        EObject lv_isTagged_25_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3854:28: ( ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3855:1: ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3855:1: ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3855:2: () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3855:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3856:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedChallengeAccess().getAssertedChallengeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAssertedChallenge8019); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedChallengeAccess().getAssertedChallengeKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge8031); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3869:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==14) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3869:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedChallenge8044); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedChallengeAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3873:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3874:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3874:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3875:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedChallenge8065);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3891:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==15) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3891:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedChallenge8080); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedChallengeAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3895:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3896:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3896:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3897:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedChallenge8101);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3913:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==16) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3913:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedChallenge8116); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedChallengeAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3917:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3918:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3918:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3919:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAssertedChallenge8137);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3935:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==39) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3935:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedChallenge8152); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedChallengeAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge8164); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3943:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3944:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3944:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3945:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8187);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3958:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==19) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3958:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8200); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3962:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3963:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3963:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3964:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8223);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge8237); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3981:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==42) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3981:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedChallenge8252); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedChallengeAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge8264); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3989:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3990:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3990:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:3991:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8287);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4004:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==19) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4004:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8300); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4008:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4009:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4009:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4010:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8323);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge8337); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4027:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==18) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4027:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedChallenge8352); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedChallengeAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge8364); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4035:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4036:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4036:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4037:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8385);
                    lv_isTagged_23_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_23_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4053:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==19) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4053:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8398); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4057:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4058:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4058:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4059:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8419);
                    	    lv_isTagged_25_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_25_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge8433); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedChallengeAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge8447); 

                	newLeafNode(otherlv_27, grammarAccess.getAssertedChallengeAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertedChallenge"


    // $ANTLR start "entryRuleClaim_Impl"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4091:1: entryRuleClaim_Impl returns [EObject current=null] : iv_ruleClaim_Impl= ruleClaim_Impl EOF ;
    public final EObject entryRuleClaim_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim_Impl = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4092:2: (iv_ruleClaim_Impl= ruleClaim_Impl EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4093:2: iv_ruleClaim_Impl= ruleClaim_Impl EOF
            {
             newCompositeNode(grammarAccess.getClaim_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl8483);
            iv_ruleClaim_Impl=ruleClaim_Impl();

            state._fsp--;

             current =iv_ruleClaim_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClaim_Impl8493); 

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
    // $ANTLR end "entryRuleClaim_Impl"


    // $ANTLR start "ruleClaim_Impl"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4100:1: ruleClaim_Impl returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleClaim_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_identifier_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_content_9_0 = null;

        AntlrDatatypeRuleToken lv_toBeSupported_11_0 = null;

        EObject lv_isTagged_14_0 = null;

        EObject lv_isTagged_16_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4103:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4104:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4104:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4104:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4104:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClaim_ImplAccess().getClaimAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4110:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==11) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4111:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4111:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4112:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleClaim_Impl8545); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getClaim_ImplAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClaim_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleClaim_Impl8571); 

                	newLeafNode(otherlv_2, grammarAccess.getClaim_ImplAccess().getClaimKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl8583); 

                	newLeafNode(otherlv_3, grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4133:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==14) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4133:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClaim_Impl8596); 

                        	newLeafNode(otherlv_4, grammarAccess.getClaim_ImplAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4137:1: ( (lv_identifier_5_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4138:1: (lv_identifier_5_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4138:1: (lv_identifier_5_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4139:3: lv_identifier_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIdentifierString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClaim_Impl8617);
                    lv_identifier_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4155:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==15) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4155:6: otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClaim_Impl8632); 

                        	newLeafNode(otherlv_6, grammarAccess.getClaim_ImplAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4159:1: ( (lv_description_7_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4160:1: (lv_description_7_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4160:1: (lv_description_7_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4161:3: lv_description_7_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getDescriptionString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClaim_Impl8653);
                    lv_description_7_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4177:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==16) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4177:6: otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClaim_Impl8668); 

                        	newLeafNode(otherlv_8, grammarAccess.getClaim_ImplAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4181:1: ( (lv_content_9_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4182:1: (lv_content_9_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4182:1: (lv_content_9_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4183:3: lv_content_9_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getContentString0ParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClaim_Impl8689);
                    lv_content_9_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4199:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==17) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4199:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClaim_Impl8704); 

                        	newLeafNode(otherlv_10, grammarAccess.getClaim_ImplAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4203:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4204:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4204:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4205:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleClaim_Impl8725);
                    lv_toBeSupported_11_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"toBeSupported",
                            		lv_toBeSupported_11_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4221:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==18) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4221:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClaim_Impl8740); 

                        	newLeafNode(otherlv_12, grammarAccess.getClaim_ImplAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl8752); 

                        	newLeafNode(otherlv_13, grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4229:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4230:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4230:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4231:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8773);
                    lv_isTagged_14_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_14_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4247:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==19) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4247:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClaim_Impl8786); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getClaim_ImplAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4251:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4252:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4252:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4253:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8807);
                    	    lv_isTagged_16_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_16_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8821); 

                        	newLeafNode(otherlv_17, grammarAccess.getClaim_ImplAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8835); 

                	newLeafNode(otherlv_18, grammarAccess.getClaim_ImplAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClaim_Impl"


    // $ANTLR start "entryRuleEvidenceAssertion"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4285:1: entryRuleEvidenceAssertion returns [EObject current=null] : iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF ;
    public final EObject entryRuleEvidenceAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidenceAssertion = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4286:2: (iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4287:2: iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF
            {
             newCompositeNode(grammarAccess.getEvidenceAssertionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8871);
            iv_ruleEvidenceAssertion=ruleEvidenceAssertion();

            state._fsp--;

             current =iv_ruleEvidenceAssertion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidenceAssertion8881); 

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
    // $ANTLR end "entryRuleEvidenceAssertion"


    // $ANTLR start "ruleEvidenceAssertion"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4294:1: ruleEvidenceAssertion returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleEvidenceAssertion() throws RecognitionException {
        EObject current = null;

        Token lv_assumed_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_identifier_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_content_9_0 = null;

        AntlrDatatypeRuleToken lv_toBeSupported_11_0 = null;

        EObject lv_isTagged_14_0 = null;

        EObject lv_isTagged_16_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4297:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4298:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4298:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4298:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4298:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4299:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4304:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==11) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4305:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4305:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4306:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEvidenceAssertion8933); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getEvidenceAssertionAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEvidenceAssertion8959); 

                	newLeafNode(otherlv_2, grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion8971); 

                	newLeafNode(otherlv_3, grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4327:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==14) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4327:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidenceAssertion8984); 

                        	newLeafNode(otherlv_4, grammarAccess.getEvidenceAssertionAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4331:1: ( (lv_identifier_5_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4332:1: (lv_identifier_5_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4332:1: (lv_identifier_5_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4333:3: lv_identifier_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIdentifierString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidenceAssertion9005);
                    lv_identifier_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4349:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==15) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4349:6: otherlv_6= 'description' ( (lv_description_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidenceAssertion9020); 

                        	newLeafNode(otherlv_6, grammarAccess.getEvidenceAssertionAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4353:1: ( (lv_description_7_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4354:1: (lv_description_7_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4354:1: (lv_description_7_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4355:3: lv_description_7_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getDescriptionString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidenceAssertion9041);
                    lv_description_7_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4371:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==16) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4371:6: otherlv_8= 'content' ( (lv_content_9_0= ruleString0 ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidenceAssertion9056); 

                        	newLeafNode(otherlv_8, grammarAccess.getEvidenceAssertionAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4375:1: ( (lv_content_9_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4376:1: (lv_content_9_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4376:1: (lv_content_9_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4377:3: lv_content_9_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getContentString0ParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEvidenceAssertion9077);
                    lv_content_9_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4393:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==17) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4393:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvidenceAssertion9092); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvidenceAssertionAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4397:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4398:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4398:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4399:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion9113);
                    lv_toBeSupported_11_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"toBeSupported",
                            		lv_toBeSupported_11_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4415:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==18) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4415:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidenceAssertion9128); 

                        	newLeafNode(otherlv_12, grammarAccess.getEvidenceAssertionAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion9140); 

                        	newLeafNode(otherlv_13, grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4423:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4424:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4424:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4425:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9161);
                    lv_isTagged_14_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_14_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4441:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==19) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4441:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidenceAssertion9174); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getEvidenceAssertionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4445:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4446:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4446:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4447:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9195);
                    	    lv_isTagged_16_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_16_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion9209); 

                        	newLeafNode(otherlv_17, grammarAccess.getEvidenceAssertionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion9223); 

                	newLeafNode(otherlv_18, grammarAccess.getEvidenceAssertionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvidenceAssertion"


    // $ANTLR start "entryRuleInformationElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4479:1: entryRuleInformationElement returns [EObject current=null] : iv_ruleInformationElement= ruleInformationElement EOF ;
    public final EObject entryRuleInformationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationElement = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4480:2: (iv_ruleInformationElement= ruleInformationElement EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4481:2: iv_ruleInformationElement= ruleInformationElement EOF
            {
             newCompositeNode(grammarAccess.getInformationElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInformationElement_in_entryRuleInformationElement9259);
            iv_ruleInformationElement=ruleInformationElement();

            state._fsp--;

             current =iv_ruleInformationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInformationElement9269); 

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
    // $ANTLR end "entryRuleInformationElement"


    // $ANTLR start "ruleInformationElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4488:1: ruleInformationElement returns [EObject current=null] : ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleInformationElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_11_0 = null;

        EObject lv_isTagged_13_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4491:28: ( ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4492:1: ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4492:1: ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4492:2: () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4492:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4493:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInformationElementAccess().getInformationElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleInformationElement9315); 

                	newLeafNode(otherlv_1, grammarAccess.getInformationElementAccess().getInformationElementKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement9327); 

                	newLeafNode(otherlv_2, grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4506:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==14) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4506:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInformationElement9340); 

                        	newLeafNode(otherlv_3, grammarAccess.getInformationElementAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4510:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4511:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4511:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4512:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleInformationElement9361);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4528:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==15) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4528:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInformationElement9376); 

                        	newLeafNode(otherlv_5, grammarAccess.getInformationElementAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4532:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4533:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4533:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4534:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleInformationElement9397);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4550:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==16) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4550:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInformationElement9412); 

                        	newLeafNode(otherlv_7, grammarAccess.getInformationElementAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4554:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4555:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4555:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4556:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleInformationElement9433);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4572:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==18) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4572:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInformationElement9448); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformationElementAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement9460); 

                        	newLeafNode(otherlv_10, grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4580:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4581:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4581:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4582:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement9481);
                    lv_isTagged_11_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_11_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4598:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==19) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4598:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInformationElement9494); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getInformationElementAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4602:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4603:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4603:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4604:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement9515);
                    	    lv_isTagged_13_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_13_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement9529); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformationElementAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement9543); 

                	newLeafNode(otherlv_15, grammarAccess.getInformationElementAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInformationElement"


    // $ANTLR start "entryRuleArgumentReasoning"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4636:1: entryRuleArgumentReasoning returns [EObject current=null] : iv_ruleArgumentReasoning= ruleArgumentReasoning EOF ;
    public final EObject entryRuleArgumentReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentReasoning = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4637:2: (iv_ruleArgumentReasoning= ruleArgumentReasoning EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4638:2: iv_ruleArgumentReasoning= ruleArgumentReasoning EOF
            {
             newCompositeNode(grammarAccess.getArgumentReasoningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning9579);
            iv_ruleArgumentReasoning=ruleArgumentReasoning();

            state._fsp--;

             current =iv_ruleArgumentReasoning; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentReasoning9589); 

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
    // $ANTLR end "entryRuleArgumentReasoning"


    // $ANTLR start "ruleArgumentReasoning"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4645:1: ruleArgumentReasoning returns [EObject current=null] : ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleArgumentReasoning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_19_0 = null;

        EObject lv_isTagged_21_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4648:28: ( ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4649:1: ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4649:1: ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4649:2: () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4649:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4650:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArgumentReasoningAccess().getArgumentReasoningAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleArgumentReasoning9635); 

                	newLeafNode(otherlv_1, grammarAccess.getArgumentReasoningAccess().getArgumentReasoningKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning9647); 

                	newLeafNode(otherlv_2, grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4663:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==14) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4663:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArgumentReasoning9660); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentReasoningAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4667:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4668:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4668:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4669:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgumentReasoning9681);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4685:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==15) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4685:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArgumentReasoning9696); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentReasoningAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4689:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4690:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4690:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4691:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgumentReasoning9717);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4707:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==16) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4707:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArgumentReasoning9732); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentReasoningAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4711:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4712:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4712:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4713:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleArgumentReasoning9753);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4729:4: (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==61) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4729:6: otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleArgumentReasoning9768); 

                        	newLeafNode(otherlv_9, grammarAccess.getArgumentReasoningAccess().getDescribesKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleArgumentReasoning9780); 

                        	newLeafNode(otherlv_10, grammarAccess.getArgumentReasoningAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4737:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4738:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4738:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4739:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9803);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4752:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==19) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4752:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9816); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getArgumentReasoningAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4756:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4757:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4757:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4758:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9839);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleArgumentReasoning9853); 

                        	newLeafNode(otherlv_14, grammarAccess.getArgumentReasoningAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4775:3: (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==62) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4775:5: otherlv_15= 'hasStructure' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleArgumentReasoning9868); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentReasoningAccess().getHasStructureKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4779:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4780:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4780:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4781:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getHasStructureArgumentCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9891);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4794:4: (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==18) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4794:6: otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArgumentReasoning9906); 

                        	newLeafNode(otherlv_17, grammarAccess.getArgumentReasoningAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning9918); 

                        	newLeafNode(otherlv_18, grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4802:1: ( (lv_isTagged_19_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4803:1: (lv_isTagged_19_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4803:1: (lv_isTagged_19_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4804:3: lv_isTagged_19_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9939);
                    lv_isTagged_19_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_19_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4820:2: (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==19) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4820:4: otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9952); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getArgumentReasoningAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4824:1: ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4825:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4825:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4826:3: lv_isTagged_21_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9973);
                    	    lv_isTagged_21_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_21_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning9987); 

                        	newLeafNode(otherlv_22, grammarAccess.getArgumentReasoningAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning10001); 

                	newLeafNode(otherlv_23, grammarAccess.getArgumentReasoningAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentReasoning"


    // $ANTLR start "entryRuleCitationElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4858:1: entryRuleCitationElement returns [EObject current=null] : iv_ruleCitationElement= ruleCitationElement EOF ;
    public final EObject entryRuleCitationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCitationElement = null;


        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4859:2: (iv_ruleCitationElement= ruleCitationElement EOF )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4860:2: iv_ruleCitationElement= ruleCitationElement EOF
            {
             newCompositeNode(grammarAccess.getCitationElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCitationElement_in_entryRuleCitationElement10037);
            iv_ruleCitationElement=ruleCitationElement();

            state._fsp--;

             current =iv_ruleCitationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCitationElement10047); 

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
    // $ANTLR end "entryRuleCitationElement"


    // $ANTLR start "ruleCitationElement"
    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4867:1: ruleCitationElement returns [EObject current=null] : ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCitationElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_content_8_0 = null;

        EObject lv_isTagged_15_0 = null;

        EObject lv_isTagged_17_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4870:28: ( ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4871:1: ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4871:1: ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4871:2: () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4871:2: ()
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCitationElementAccess().getCitationElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCitationElement10093); 

                	newLeafNode(otherlv_1, grammarAccess.getCitationElementAccess().getCitationElementKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement10105); 

                	newLeafNode(otherlv_2, grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4885:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==14) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4885:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCitationElement10118); 

                        	newLeafNode(otherlv_3, grammarAccess.getCitationElementAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4889:1: ( (lv_identifier_4_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4890:1: (lv_identifier_4_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4890:1: (lv_identifier_4_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4891:3: lv_identifier_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIdentifierString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleCitationElement10139);
                    lv_identifier_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4907:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==15) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4907:6: otherlv_5= 'description' ( (lv_description_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCitationElement10154); 

                        	newLeafNode(otherlv_5, grammarAccess.getCitationElementAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4911:1: ( (lv_description_6_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4912:1: (lv_description_6_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4912:1: (lv_description_6_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4913:3: lv_description_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getDescriptionString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleCitationElement10175);
                    lv_description_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4929:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==16) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4929:6: otherlv_7= 'content' ( (lv_content_8_0= ruleString0 ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCitationElement10190); 

                        	newLeafNode(otherlv_7, grammarAccess.getCitationElementAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4933:1: ( (lv_content_8_0= ruleString0 ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4934:1: (lv_content_8_0= ruleString0 )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4934:1: (lv_content_8_0= ruleString0 )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4935:3: lv_content_8_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getContentString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleCitationElement10211);
                    lv_content_8_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4951:4: (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==64) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4951:6: otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCitationElement10226); 

                        	newLeafNode(otherlv_9, grammarAccess.getCitationElementAccess().getRefersToArgumentElementKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4955:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4956:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4956:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4957:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCitationElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentElementArgumentElementCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10249);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4970:4: (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==65) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4970:6: otherlv_11= 'refersToArgument' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCitationElement10264); 

                        	newLeafNode(otherlv_11, grammarAccess.getCitationElementAccess().getRefersToArgumentKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4974:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4975:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4975:1: ( ruleEString )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4976:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCitationElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentArgumentCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10287);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4989:4: (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==18) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4989:6: otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCitationElement10302); 

                        	newLeafNode(otherlv_13, grammarAccess.getCitationElementAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement10314); 

                        	newLeafNode(otherlv_14, grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4997:1: ( (lv_isTagged_15_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4998:1: (lv_isTagged_15_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4998:1: (lv_isTagged_15_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:4999:3: lv_isTagged_15_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement10335);
                    lv_isTagged_15_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_15_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5015:2: (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )*
                    loop170:
                    do {
                        int alt170=2;
                        int LA170_0 = input.LA(1);

                        if ( (LA170_0==19) ) {
                            alt170=1;
                        }


                        switch (alt170) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5015:4: otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCitationElement10348); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getCitationElementAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5019:1: ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5020:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5020:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.xdsl/src-gen/net/certware/argument/gsn/xdsl/parser/antlr/internal/InternalGsnDsl.g:5021:3: lv_isTagged_17_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement10369);
                    	    lv_isTagged_17_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"isTagged",
                    	            		lv_isTagged_17_0, 
                    	            		"TaggedValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop170;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement10383); 

                        	newLeafNode(otherlv_18, grammarAccess.getCitationElementAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement10397); 

                	newLeafNode(otherlv_19, grammarAccess.getCitationElementAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCitationElement"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGoal137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal163 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal175 = new BitSet(new long[]{0x0000000003F7C000L});
        public static final BitSet FOLLOW_14_in_ruleGoal188 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleGoal209 = new BitSet(new long[]{0x0000000003F78000L});
        public static final BitSet FOLLOW_15_in_ruleGoal224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleGoal245 = new BitSet(new long[]{0x0000000003F70000L});
        public static final BitSet FOLLOW_16_in_ruleGoal260 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleGoal281 = new BitSet(new long[]{0x0000000003F60000L});
        public static final BitSet FOLLOW_17_in_ruleGoal296 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleGoal317 = new BitSet(new long[]{0x0000000003F40000L});
        public static final BitSet FOLLOW_18_in_ruleGoal332 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal344 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleGoal365 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal378 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleGoal399 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal413 = new BitSet(new long[]{0x0000000003F00000L});
        public static final BitSet FOLLOW_21_in_ruleGoal428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal440 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleGoal461 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal474 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleGoal495 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal509 = new BitSet(new long[]{0x0000000003D00000L});
        public static final BitSet FOLLOW_22_in_ruleGoal524 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal536 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleGoal557 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal570 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleGoal591 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal605 = new BitSet(new long[]{0x0000000003900000L});
        public static final BitSet FOLLOW_23_in_ruleGoal620 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal632 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleGoal653 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal666 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleGoal687 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal701 = new BitSet(new long[]{0x0000000003100000L});
        public static final BitSet FOLLOW_24_in_ruleGoal716 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal728 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleGoal749 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal762 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleGoal783 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal797 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleGoal812 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGoal824 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleGoal845 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleGoal858 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleGoal879 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleGoal893 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleGoal907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_entryRuleArgumentElement945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentElement955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClaim_Impl_in_ruleArgumentElement1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidenceAssertion_in_ruleArgumentElement1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInformationElement_in_ruleArgumentElement1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentReasoning_in_ruleArgumentElement1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCitationElement_in_ruleArgumentElement1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_entryRuleArgumentLink1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentLink1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleArgumentLink1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedInference_in_ruleArgumentLink1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedEvidence_in_ruleArgumentLink1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedContext_in_ruleArgumentLink1283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedCounterEvidence_in_ruleArgumentLink1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedChallenge_in_ruleArgumentLink1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1467 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaggedValue1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTaggedValue1523 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaggedValue1535 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_27_in_ruleTaggedValue1548 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleTaggedValue1569 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleTaggedValue1584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleTaggedValue1605 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaggedValue1619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEBoolean1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy1859 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleStrategy1915 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1927 = new BitSet(new long[]{0x0000000F0015C000L});
        public static final BitSet FOLLOW_14_in_ruleStrategy1940 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleStrategy1961 = new BitSet(new long[]{0x0000000F00158000L});
        public static final BitSet FOLLOW_15_in_ruleStrategy1976 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleStrategy1997 = new BitSet(new long[]{0x0000000F00150000L});
        public static final BitSet FOLLOW_16_in_ruleStrategy2012 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleStrategy2033 = new BitSet(new long[]{0x0000000F00140000L});
        public static final BitSet FOLLOW_18_in_ruleStrategy2048 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2060 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy2081 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2094 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy2115 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2129 = new BitSet(new long[]{0x0000000F00100000L});
        public static final BitSet FOLLOW_32_in_ruleStrategy2144 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2156 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleStrategy2177 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2190 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleStrategy2211 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2225 = new BitSet(new long[]{0x0000000E00100000L});
        public static final BitSet FOLLOW_33_in_ruleStrategy2240 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2252 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2273 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2286 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2307 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2321 = new BitSet(new long[]{0x0000000C00100000L});
        public static final BitSet FOLLOW_34_in_ruleStrategy2336 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2348 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2369 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2382 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2403 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2417 = new BitSet(new long[]{0x0000000800100000L});
        public static final BitSet FOLLOW_35_in_ruleStrategy2432 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2444 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2465 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2478 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2499 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2513 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext2563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleContext2619 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2631 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleContext2644 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleContext2665 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleContext2680 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleContext2701 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleContext2716 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleContext2737 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleContext2752 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2764 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2785 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleContext2798 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2819 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleContext2833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleContext2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption2883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssumption2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAssumption2939 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption2951 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssumption2964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssumption2985 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssumption3000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssumption3021 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssumption3036 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssumption3057 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssumption3072 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption3084 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption3105 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssumption3118 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption3139 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption3153 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolution_in_entryRuleSolution3203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolution3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSolution3259 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3271 = new BitSet(new long[]{0x00001C800015C000L});
        public static final BitSet FOLLOW_14_in_ruleSolution3284 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleSolution3305 = new BitSet(new long[]{0x00001C8000158000L});
        public static final BitSet FOLLOW_15_in_ruleSolution3320 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleSolution3341 = new BitSet(new long[]{0x00001C8000150000L});
        public static final BitSet FOLLOW_16_in_ruleSolution3356 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleSolution3377 = new BitSet(new long[]{0x00001C8000140000L});
        public static final BitSet FOLLOW_39_in_ruleSolution3392 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3404 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3427 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3440 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3463 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3477 = new BitSet(new long[]{0x00001C0000140000L});
        public static final BitSet FOLLOW_42_in_ruleSolution3492 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3504 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3527 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3540 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3563 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3577 = new BitSet(new long[]{0x0000180000140000L});
        public static final BitSet FOLLOW_18_in_ruleSolution3592 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3604 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3625 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3638 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3659 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3673 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_43_in_ruleSolution3688 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3700 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3721 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3734 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3755 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3769 = new BitSet(new long[]{0x0000100000100000L});
        public static final BitSet FOLLOW_44_in_ruleSolution3784 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3796 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3817 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3830 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3851 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3865 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification3915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJustification3925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleJustification3971 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification3983 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleJustification3996 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleJustification4017 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleJustification4032 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleJustification4053 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleJustification4068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleJustification4089 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleJustification4104 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification4116 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification4137 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleJustification4150 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification4171 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleJustification4185 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleJustification4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidence_in_entryRuleEvidence4235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidence4245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEvidence4291 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence4303 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidence4316 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidence4337 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleEvidence4352 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidence4373 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleEvidence4388 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidence4409 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleEvidence4424 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4436 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4459 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4472 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4495 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4509 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleEvidence4524 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4536 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4559 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4572 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4595 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4609 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidence4624 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence4636 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4657 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4670 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4691 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4705 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgument4765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleArgument4811 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4823 = new BitSet(new long[]{0x000700000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgument4836 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgument4857 = new BitSet(new long[]{0x0007000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgument4872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgument4893 = new BitSet(new long[]{0x0007000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgument4908 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgument4929 = new BitSet(new long[]{0x0007000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgument4944 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4956 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument4977 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4990 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument5011 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5025 = new BitSet(new long[]{0x0007000000100000L});
        public static final BitSet FOLLOW_48_in_ruleArgument5040 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument5052 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument5073 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5086 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument5107 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5121 = new BitSet(new long[]{0x0006000000100000L});
        public static final BitSet FOLLOW_49_in_ruleArgument5136 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument5148 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument5169 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5182 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument5203 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5217 = new BitSet(new long[]{0x0004000000100000L});
        public static final BitSet FOLLOW_50_in_ruleArgument5232 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument5244 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument5265 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5278 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument5299 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5313 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAnnotation5419 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5431 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation5444 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAnnotation5465 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation5480 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAnnotation5501 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation5516 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAnnotation5537 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAnnotation5552 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5564 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5587 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5600 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5623 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5637 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation5652 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5664 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5687 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5700 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5723 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5737 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation5752 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5764 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5785 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5798 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5819 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedInference5893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAssertedInference5939 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference5951 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedInference5964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedInference5985 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedInference6000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedInference6021 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedInference6036 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedInference6057 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedInference6072 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference6084 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6107 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6143 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference6157 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedInference6172 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference6184 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6207 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6243 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference6257 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedInference6272 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference6284 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference6305 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6318 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference6339 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference6353 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference6367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence6403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedEvidence6413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAssertedEvidence6459 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6471 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedEvidence6484 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedEvidence6505 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedEvidence6520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedEvidence6541 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedEvidence6556 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedEvidence6577 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedEvidence6592 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6627 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6640 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6663 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6677 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedEvidence6692 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6704 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6727 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6740 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6763 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6777 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedEvidence6792 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6804 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6825 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6838 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6859 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6873 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedContext6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAssertedContext6979 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext6991 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedContext7004 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedContext7025 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedContext7040 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedContext7061 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedContext7076 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedContext7097 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedContext7112 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext7124 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7147 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7160 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7183 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext7197 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedContext7212 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext7224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7247 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7260 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7283 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext7297 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedContext7312 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext7324 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext7345 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7358 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext7379 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext7393 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext7407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence7443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedCounterEvidence7453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAssertedCounterEvidence7499 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence7511 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedCounterEvidence7524 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7545 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedCounterEvidence7560 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7581 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedCounterEvidence7596 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedCounterEvidence7617 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedCounterEvidence7632 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7644 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7667 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7680 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7703 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7717 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedCounterEvidence7732 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7744 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7767 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7780 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7803 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7817 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedCounterEvidence7832 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence7844 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7865 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7878 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7899 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7913 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedChallenge7973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAssertedChallenge8019 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge8031 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedChallenge8044 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedChallenge8065 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedChallenge8080 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedChallenge8101 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedChallenge8116 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAssertedChallenge8137 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedChallenge8152 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge8164 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8187 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8200 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8223 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge8237 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedChallenge8252 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge8264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8287 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8300 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8323 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge8337 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedChallenge8352 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge8364 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8385 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8398 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8419 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge8433 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge8447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl8483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClaim_Impl8493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleClaim_Impl8545 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleClaim_Impl8571 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl8583 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleClaim_Impl8596 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClaim_Impl8617 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleClaim_Impl8632 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClaim_Impl8653 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleClaim_Impl8668 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClaim_Impl8689 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleClaim_Impl8704 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleClaim_Impl8725 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleClaim_Impl8740 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl8752 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8773 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleClaim_Impl8786 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8807 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8821 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidenceAssertion8881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEvidenceAssertion8933 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleEvidenceAssertion8959 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion8971 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidenceAssertion8984 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidenceAssertion9005 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleEvidenceAssertion9020 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidenceAssertion9041 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleEvidenceAssertion9056 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEvidenceAssertion9077 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleEvidenceAssertion9092 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion9113 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidenceAssertion9128 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion9140 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9161 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidenceAssertion9174 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9195 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion9209 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion9223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInformationElement_in_entryRuleInformationElement9259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInformationElement9269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleInformationElement9315 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement9327 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleInformationElement9340 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleInformationElement9361 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleInformationElement9376 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleInformationElement9397 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleInformationElement9412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleInformationElement9433 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleInformationElement9448 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement9460 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement9481 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleInformationElement9494 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement9515 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement9529 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement9543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning9579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentReasoning9589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleArgumentReasoning9635 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning9647 = new BitSet(new long[]{0x600000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgumentReasoning9660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgumentReasoning9681 = new BitSet(new long[]{0x6000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgumentReasoning9696 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgumentReasoning9717 = new BitSet(new long[]{0x6000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgumentReasoning9732 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleArgumentReasoning9753 = new BitSet(new long[]{0x6000000000140000L});
        public static final BitSet FOLLOW_61_in_ruleArgumentReasoning9768 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleArgumentReasoning9780 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9803 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9816 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9839 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleArgumentReasoning9853 = new BitSet(new long[]{0x4000000000140000L});
        public static final BitSet FOLLOW_62_in_ruleArgumentReasoning9868 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9891 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgumentReasoning9906 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning9918 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9939 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9952 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9973 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning9987 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning10001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCitationElement_in_entryRuleCitationElement10037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCitationElement10047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCitationElement10093 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement10105 = new BitSet(new long[]{0x000000000015C000L,0x0000000000000003L});
        public static final BitSet FOLLOW_14_in_ruleCitationElement10118 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleCitationElement10139 = new BitSet(new long[]{0x0000000000158000L,0x0000000000000003L});
        public static final BitSet FOLLOW_15_in_ruleCitationElement10154 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleCitationElement10175 = new BitSet(new long[]{0x0000000000150000L,0x0000000000000003L});
        public static final BitSet FOLLOW_16_in_ruleCitationElement10190 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleCitationElement10211 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64_in_ruleCitationElement10226 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10249 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCitationElement10264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10287 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleCitationElement10302 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement10314 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement10335 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleCitationElement10348 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement10369 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement10383 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement10397 = new BitSet(new long[]{0x0000000000000002L});
    }


}