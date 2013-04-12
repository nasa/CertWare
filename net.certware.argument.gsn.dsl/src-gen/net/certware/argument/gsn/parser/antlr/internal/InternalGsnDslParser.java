package net.certware.argument.gsn.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
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
    public String getGrammarFileName() { return "../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g"; }



     	private GsnDslGrammarAccess grammarAccess;
     	
        public InternalGsnDslParser(TokenStream input, GsnDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelGoal";	
       	}
       	
       	@Override
       	protected GsnDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelGoal"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:67:1: entryRuleModelGoal returns [EObject current=null] : iv_ruleModelGoal= ruleModelGoal EOF ;
    public final EObject entryRuleModelGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelGoal = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:68:2: (iv_ruleModelGoal= ruleModelGoal EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:69:2: iv_ruleModelGoal= ruleModelGoal EOF
            {
             newCompositeNode(grammarAccess.getModelGoalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelGoal_in_entryRuleModelGoal75);
            iv_ruleModelGoal=ruleModelGoal();

            state._fsp--;

             current =iv_ruleModelGoal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelGoal85); 

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
    // $ANTLR end "entryRuleModelGoal"


    // $ANTLR start "ruleModelGoal"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:76:1: ruleModelGoal returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleModelGoal() throws RecognitionException {
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:79:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:80:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:80:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:80:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Goal' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )? (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )? (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )? (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )? (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:80:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelGoalAccess().getGoalAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:86:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:87:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:87:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:88:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModelGoal137); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getModelGoalAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelGoalRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModelGoal163); 

                	newLeafNode(otherlv_2, grammarAccess.getModelGoalAccess().getGoalKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal175); 

                	newLeafNode(otherlv_3, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:109:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:109:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModelGoal188); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelGoalAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:113:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:114:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:114:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:115:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getIdentifierEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelGoal209);
                    lv_identifier_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:131:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:131:6: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModelGoal224); 

                        	newLeafNode(otherlv_6, grammarAccess.getModelGoalAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:135:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:136:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:136:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:137:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelGoal245);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:153:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:153:6: otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModelGoal260); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelGoalAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:157:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:158:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:158:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:159:3: lv_content_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getContentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelGoal281);
                    lv_content_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:175:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:175:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModelGoal296); 

                        	newLeafNode(otherlv_10, grammarAccess.getModelGoalAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:179:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:180:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:180:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:181:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleModelGoal317);
                    lv_toBeSupported_11_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:197:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:197:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModelGoal332); 

                        	newLeafNode(otherlv_12, grammarAccess.getModelGoalAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal344); 

                        	newLeafNode(otherlv_13, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:205:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:206:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:206:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:207:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleModelGoal365);
                    lv_isTagged_14_0=ruleTaggedValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"isTagged",
                            		lv_isTagged_14_0, 
                            		"TaggedValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:223:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:223:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal378); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getModelGoalAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:227:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:228:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:228:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:229:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleModelGoal399);
                    	    lv_isTagged_16_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal413); 

                        	newLeafNode(otherlv_17, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:249:3: (otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:249:5: otherlv_18= 'subGoals' otherlv_19= '{' ( (lv_subGoals_20_0= ruleModelGoal ) ) (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleModelGoal428); 

                        	newLeafNode(otherlv_18, grammarAccess.getModelGoalAccess().getSubGoalsKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal440); 

                        	newLeafNode(otherlv_19, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:257:1: ( (lv_subGoals_20_0= ruleModelGoal ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:258:1: (lv_subGoals_20_0= ruleModelGoal )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:258:1: (lv_subGoals_20_0= ruleModelGoal )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:259:3: lv_subGoals_20_0= ruleModelGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getSubGoalsModelGoalParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModelGoal_in_ruleModelGoal461);
                    lv_subGoals_20_0=ruleModelGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"subGoals",
                            		lv_subGoals_20_0, 
                            		"ModelGoal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:275:2: (otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:275:4: otherlv_21= ',' ( (lv_subGoals_22_0= ruleModelGoal ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal474); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getModelGoalAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:279:1: ( (lv_subGoals_22_0= ruleModelGoal ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:280:1: (lv_subGoals_22_0= ruleModelGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:280:1: (lv_subGoals_22_0= ruleModelGoal )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:281:3: lv_subGoals_22_0= ruleModelGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getSubGoalsModelGoalParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModelGoal_in_ruleModelGoal495);
                    	    lv_subGoals_22_0=ruleModelGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subGoals",
                    	            		lv_subGoals_22_0, 
                    	            		"ModelGoal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal509); 

                        	newLeafNode(otherlv_23, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:301:3: (otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:301:5: otherlv_24= 'strategies' otherlv_25= '{' ( (lv_strategies_26_0= ruleStrategy ) ) (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModelGoal524); 

                        	newLeafNode(otherlv_24, grammarAccess.getModelGoalAccess().getStrategiesKeyword_10_0());
                        
                    otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal536); 

                        	newLeafNode(otherlv_25, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:309:1: ( (lv_strategies_26_0= ruleStrategy ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:310:1: (lv_strategies_26_0= ruleStrategy )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:310:1: (lv_strategies_26_0= ruleStrategy )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:311:3: lv_strategies_26_0= ruleStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getStrategiesStrategyParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleModelGoal557);
                    lv_strategies_26_0=ruleStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"strategies",
                            		lv_strategies_26_0, 
                            		"Strategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:327:2: (otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:327:4: otherlv_27= ',' ( (lv_strategies_28_0= ruleStrategy ) )
                    	    {
                    	    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal570); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getModelGoalAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:331:1: ( (lv_strategies_28_0= ruleStrategy ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:332:1: (lv_strategies_28_0= ruleStrategy )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:332:1: (lv_strategies_28_0= ruleStrategy )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:333:3: lv_strategies_28_0= ruleStrategy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getStrategiesStrategyParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleModelGoal591);
                    	    lv_strategies_28_0=ruleStrategy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal605); 

                        	newLeafNode(otherlv_29, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:353:3: (otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:353:5: otherlv_30= 'goalContexts' otherlv_31= '{' ( (lv_goalContexts_32_0= ruleContext ) ) (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModelGoal620); 

                        	newLeafNode(otherlv_30, grammarAccess.getModelGoalAccess().getGoalContextsKeyword_11_0());
                        
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal632); 

                        	newLeafNode(otherlv_31, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:361:1: ( (lv_goalContexts_32_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:362:1: (lv_goalContexts_32_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:362:1: (lv_goalContexts_32_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:363:3: lv_goalContexts_32_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getGoalContextsContextParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleModelGoal653);
                    lv_goalContexts_32_0=ruleContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"goalContexts",
                            		lv_goalContexts_32_0, 
                            		"Context");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:379:2: (otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:379:4: otherlv_33= ',' ( (lv_goalContexts_34_0= ruleContext ) )
                    	    {
                    	    otherlv_33=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal666); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getModelGoalAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:383:1: ( (lv_goalContexts_34_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:384:1: (lv_goalContexts_34_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:384:1: (lv_goalContexts_34_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:385:3: lv_goalContexts_34_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getGoalContextsContextParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleModelGoal687);
                    	    lv_goalContexts_34_0=ruleContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

                    otherlv_35=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal701); 

                        	newLeafNode(otherlv_35, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:405:3: (otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:405:5: otherlv_36= 'assumptions' otherlv_37= '{' ( (lv_assumptions_38_0= ruleAssumption ) ) (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModelGoal716); 

                        	newLeafNode(otherlv_36, grammarAccess.getModelGoalAccess().getAssumptionsKeyword_12_0());
                        
                    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal728); 

                        	newLeafNode(otherlv_37, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:413:1: ( (lv_assumptions_38_0= ruleAssumption ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:414:1: (lv_assumptions_38_0= ruleAssumption )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:414:1: (lv_assumptions_38_0= ruleAssumption )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:415:3: lv_assumptions_38_0= ruleAssumption
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getAssumptionsAssumptionParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleModelGoal749);
                    lv_assumptions_38_0=ruleAssumption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"assumptions",
                            		lv_assumptions_38_0, 
                            		"Assumption");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:431:2: (otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:431:4: otherlv_39= ',' ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    {
                    	    otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal762); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getModelGoalAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:435:1: ( (lv_assumptions_40_0= ruleAssumption ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:436:1: (lv_assumptions_40_0= ruleAssumption )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:436:1: (lv_assumptions_40_0= ruleAssumption )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:437:3: lv_assumptions_40_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getAssumptionsAssumptionParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_ruleModelGoal783);
                    	    lv_assumptions_40_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

                    otherlv_41=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal797); 

                        	newLeafNode(otherlv_41, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:457:3: (otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:457:5: otherlv_42= 'goalSolutions' otherlv_43= '{' ( (lv_goalSolutions_44_0= ruleSolution ) ) (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleModelGoal812); 

                        	newLeafNode(otherlv_42, grammarAccess.getModelGoalAccess().getGoalSolutionsKeyword_13_0());
                        
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModelGoal824); 

                        	newLeafNode(otherlv_43, grammarAccess.getModelGoalAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:465:1: ( (lv_goalSolutions_44_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:466:1: (lv_goalSolutions_44_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:466:1: (lv_goalSolutions_44_0= ruleSolution )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:467:3: lv_goalSolutions_44_0= ruleSolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleModelGoal845);
                    lv_goalSolutions_44_0=ruleSolution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
                    	        }
                           		add(
                           			current, 
                           			"goalSolutions",
                            		lv_goalSolutions_44_0, 
                            		"Solution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:483:2: (otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:483:4: otherlv_45= ',' ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    {
                    	    otherlv_45=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelGoal858); 

                    	        	newLeafNode(otherlv_45, grammarAccess.getModelGoalAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:487:1: ( (lv_goalSolutions_46_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:488:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:488:1: (lv_goalSolutions_46_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:489:3: lv_goalSolutions_46_0= ruleSolution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelGoalAccess().getGoalSolutionsSolutionParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleModelGoal879);
                    	    lv_goalSolutions_46_0=ruleSolution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelGoalRule());
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

                    otherlv_47=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal893); 

                        	newLeafNode(otherlv_47, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_48=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelGoal907); 

                	newLeafNode(otherlv_48, grammarAccess.getModelGoalAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleModelGoal"


    // $ANTLR start "entryRuleArgumentElement"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:523:1: entryRuleArgumentElement returns [EObject current=null] : iv_ruleArgumentElement= ruleArgumentElement EOF ;
    public final EObject entryRuleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:524:2: (iv_ruleArgumentElement= ruleArgumentElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:525:2: iv_ruleArgumentElement= ruleArgumentElement EOF
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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:532:1: ruleArgumentElement returns [EObject current=null] : (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) ;
    public final EObject ruleArgumentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Claim_Impl_0 = null;

        EObject this_EvidenceAssertion_1 = null;

        EObject this_InformationElement_2 = null;

        EObject this_ArgumentReasoning_3 = null;

        EObject this_CitationElement_4 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:535:28: ( (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:536:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:536:1: (this_Claim_Impl_0= ruleClaim_Impl | this_EvidenceAssertion_1= ruleEvidenceAssertion | this_InformationElement_2= ruleInformationElement | this_ArgumentReasoning_3= ruleArgumentReasoning | this_CitationElement_4= ruleCitationElement )
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:537:5: this_Claim_Impl_0= ruleClaim_Impl
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:547:5: this_EvidenceAssertion_1= ruleEvidenceAssertion
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:557:5: this_InformationElement_2= ruleInformationElement
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:567:5: this_ArgumentReasoning_3= ruleArgumentReasoning
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:577:5: this_CitationElement_4= ruleCitationElement
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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:593:1: entryRuleArgumentLink returns [EObject current=null] : iv_ruleArgumentLink= ruleArgumentLink EOF ;
    public final EObject entryRuleArgumentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentLink = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:594:2: (iv_ruleArgumentLink= ruleArgumentLink EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:595:2: iv_ruleArgumentLink= ruleArgumentLink EOF
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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:602:1: ruleArgumentLink returns [EObject current=null] : (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:605:28: ( (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:606:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:606:1: (this_Annotation_0= ruleAnnotation | this_AssertedInference_1= ruleAssertedInference | this_AssertedEvidence_2= ruleAssertedEvidence | this_AssertedContext_3= ruleAssertedContext | this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence | this_AssertedChallenge_5= ruleAssertedChallenge )
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:607:5: this_Annotation_0= ruleAnnotation
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:617:5: this_AssertedInference_1= ruleAssertedInference
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:627:5: this_AssertedEvidence_2= ruleAssertedEvidence
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:637:5: this_AssertedContext_3= ruleAssertedContext
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:647:5: this_AssertedCounterEvidence_4= ruleAssertedCounterEvidence
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:657:5: this_AssertedChallenge_5= ruleAssertedChallenge
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


    // $ANTLR start "entryRuleTaggedValue"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:673:1: entryRuleTaggedValue returns [EObject current=null] : iv_ruleTaggedValue= ruleTaggedValue EOF ;
    public final EObject entryRuleTaggedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedValue = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:674:2: (iv_ruleTaggedValue= ruleTaggedValue EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:675:2: iv_ruleTaggedValue= ruleTaggedValue EOF
            {
             newCompositeNode(grammarAccess.getTaggedValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1372);
            iv_ruleTaggedValue=ruleTaggedValue();

            state._fsp--;

             current =iv_ruleTaggedValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaggedValue1382); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:682:1: ruleTaggedValue returns [EObject current=null] : ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:685:28: ( ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:686:1: ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:686:1: ( () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:686:2: () otherlv_1= 'TaggedValue' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:686:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:687:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaggedValueAccess().getTaggedValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTaggedValue1428); 

                	newLeafNode(otherlv_1, grammarAccess.getTaggedValueAccess().getTaggedValueKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaggedValue1440); 

                	newLeafNode(otherlv_2, grammarAccess.getTaggedValueAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:700:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:700:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTaggedValue1453); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaggedValueAccess().getKeyKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:704:1: ( (lv_key_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:705:1: (lv_key_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:705:1: (lv_key_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:706:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaggedValueAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaggedValue1474);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaggedValueRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:722:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:722:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTaggedValue1489); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaggedValueAccess().getValueKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:726:1: ( (lv_value_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:727:1: (lv_value_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:727:1: (lv_value_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:728:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaggedValueAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaggedValue1510);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaggedValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaggedValue1524); 

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


    // $ANTLR start "entryRuleEBoolean"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:756:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:757:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:758:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1561);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1572); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:765:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:768:28: ( (kw= 'true' | kw= 'false' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:769:1: (kw= 'true' | kw= 'false' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:769:1: (kw= 'true' | kw= 'false' )
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
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:770:2: kw= 'true'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEBoolean1610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:777:2: kw= 'false'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean1629); 

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


    // $ANTLR start "entryRuleEString"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:790:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:791:2: (iv_ruleEString= ruleEString EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:792:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1670);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1681); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:799:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:802:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:803:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:803:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:803:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1721); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:811:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1747); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStrategy"
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:826:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:827:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:828:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy1792);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy1802); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:835:1: ruleStrategy returns [EObject current=null] : ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:838:28: ( ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:839:1: ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:839:1: ( () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:839:2: () otherlv_1= 'Strategy' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )? (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )? (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )? (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:839:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:840:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStrategyAccess().getStrategyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStrategy1848); 

                	newLeafNode(otherlv_1, grammarAccess.getStrategyAccess().getStrategyKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1860); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:853:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:853:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStrategy1873); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:857:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:858:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:858:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:859:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1894);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:875:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:875:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStrategy1909); 

                        	newLeafNode(otherlv_5, grammarAccess.getStrategyAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:879:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:880:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:880:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:881:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1930);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:897:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:897:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStrategy1945); 

                        	newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:901:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:902:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:902:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:903:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStrategy1966);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:919:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:919:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStrategy1981); 

                        	newLeafNode(otherlv_9, grammarAccess.getStrategyAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy1993); 

                        	newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:927:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:928:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:928:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:929:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy2014);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:945:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==19) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:945:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2027); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStrategyAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:949:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:950:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:950:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:951:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleStrategy2048);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2062); 

                        	newLeafNode(otherlv_14, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:971:3: (otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:971:5: otherlv_15= 'goals' otherlv_16= '{' ( (lv_goals_17_0= ruleModelGoal ) ) (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStrategy2077); 

                        	newLeafNode(otherlv_15, grammarAccess.getStrategyAccess().getGoalsKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2089); 

                        	newLeafNode(otherlv_16, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:979:1: ( (lv_goals_17_0= ruleModelGoal ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:980:1: (lv_goals_17_0= ruleModelGoal )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:980:1: (lv_goals_17_0= ruleModelGoal )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:981:3: lv_goals_17_0= ruleModelGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getGoalsModelGoalParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModelGoal_in_ruleStrategy2110);
                    lv_goals_17_0=ruleModelGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	        }
                           		add(
                           			current, 
                           			"goals",
                            		lv_goals_17_0, 
                            		"ModelGoal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:997:2: (otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:997:4: otherlv_18= ',' ( (lv_goals_19_0= ruleModelGoal ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2123); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getStrategyAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1001:1: ( (lv_goals_19_0= ruleModelGoal ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1002:1: (lv_goals_19_0= ruleModelGoal )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1002:1: (lv_goals_19_0= ruleModelGoal )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1003:3: lv_goals_19_0= ruleModelGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getGoalsModelGoalParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModelGoal_in_ruleStrategy2144);
                    	    lv_goals_19_0=ruleModelGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goals",
                    	            		lv_goals_19_0, 
                    	            		"ModelGoal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2158); 

                        	newLeafNode(otherlv_20, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1023:3: (otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1023:5: otherlv_21= 'justifications' otherlv_22= '{' ( (lv_justifications_23_0= ruleJustification ) ) (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStrategy2173); 

                        	newLeafNode(otherlv_21, grammarAccess.getStrategyAccess().getJustificationsKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2185); 

                        	newLeafNode(otherlv_22, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1031:1: ( (lv_justifications_23_0= ruleJustification ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1032:1: (lv_justifications_23_0= ruleJustification )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1032:1: (lv_justifications_23_0= ruleJustification )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1033:3: lv_justifications_23_0= ruleJustification
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2206);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1049:2: (otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1049:4: otherlv_24= ',' ( (lv_justifications_25_0= ruleJustification ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2219); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getStrategyAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1053:1: ( (lv_justifications_25_0= ruleJustification ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1054:1: (lv_justifications_25_0= ruleJustification )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1054:1: (lv_justifications_25_0= ruleJustification )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1055:3: lv_justifications_25_0= ruleJustification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getJustificationsJustificationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleJustification_in_ruleStrategy2240);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2254); 

                        	newLeafNode(otherlv_26, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1075:3: (otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1075:5: otherlv_27= 'strategyContexts' otherlv_28= '{' ( (lv_strategyContexts_29_0= ruleContext ) ) (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStrategy2269); 

                        	newLeafNode(otherlv_27, grammarAccess.getStrategyAccess().getStrategyContextsKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2281); 

                        	newLeafNode(otherlv_28, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1083:1: ( (lv_strategyContexts_29_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1084:1: (lv_strategyContexts_29_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1084:1: (lv_strategyContexts_29_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1085:3: lv_strategyContexts_29_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2302);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1101:2: (otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1101:4: otherlv_30= ',' ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2315); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getStrategyAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1105:1: ( (lv_strategyContexts_31_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1106:1: (lv_strategyContexts_31_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1106:1: (lv_strategyContexts_31_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1107:3: lv_strategyContexts_31_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategyContextsContextParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleStrategy2336);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2350); 

                        	newLeafNode(otherlv_32, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1127:3: (otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1127:5: otherlv_33= 'strategySolutions' otherlv_34= '{' ( (lv_strategySolutions_35_0= ruleSolution ) ) (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStrategy2365); 

                        	newLeafNode(otherlv_33, grammarAccess.getStrategyAccess().getStrategySolutionsKeyword_10_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStrategy2377); 

                        	newLeafNode(otherlv_34, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1135:1: ( (lv_strategySolutions_35_0= ruleSolution ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1136:1: (lv_strategySolutions_35_0= ruleSolution )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1136:1: (lv_strategySolutions_35_0= ruleSolution )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1137:3: lv_strategySolutions_35_0= ruleSolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2398);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1153:2: (otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==19) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1153:4: otherlv_36= ',' ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    {
                    	    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStrategy2411); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getStrategyAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1157:1: ( (lv_strategySolutions_37_0= ruleSolution ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1158:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1158:1: (lv_strategySolutions_37_0= ruleSolution )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1159:3: lv_strategySolutions_37_0= ruleSolution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyAccess().getStrategySolutionsSolutionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSolution_in_ruleStrategy2432);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2446); 

                        	newLeafNode(otherlv_38, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStrategy2460); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1191:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1192:2: (iv_ruleContext= ruleContext EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1193:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext2496);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext2506); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1200:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1203:28: ( ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1204:1: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1204:1: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1204:2: () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1204:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1205:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContextAccess().getContextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleContext2552); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2564); 

                	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1218:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1218:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContext2577); 

                        	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1222:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1223:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1223:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1224:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2598);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1240:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1240:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContext2613); 

                        	newLeafNode(otherlv_5, grammarAccess.getContextAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1244:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1245:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1245:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1246:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2634);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1262:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1262:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContext2649); 

                        	newLeafNode(otherlv_7, grammarAccess.getContextAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1266:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1267:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1267:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1268:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext2670);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1284:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==18) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1284:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext2685); 

                        	newLeafNode(otherlv_9, grammarAccess.getContextAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext2697); 

                        	newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1292:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1293:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1293:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1294:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2718);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1310:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==19) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1310:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContext2731); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1314:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1315:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1315:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1316:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleContext2752);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2766); 

                        	newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext2780); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1348:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1349:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1350:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssumption_in_entryRuleAssumption2816);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssumption2826); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1357:1: ruleAssumption returns [EObject current=null] : ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1360:28: ( ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1361:1: ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1361:1: ( () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1361:2: () otherlv_1= 'Assumption' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1361:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1362:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssumptionAccess().getAssumptionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAssumption2872); 

                	newLeafNode(otherlv_1, grammarAccess.getAssumptionAccess().getAssumptionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption2884); 

                	newLeafNode(otherlv_2, grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1375:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1375:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssumption2897); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssumptionAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1379:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1380:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1380:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1381:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2918);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1397:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1397:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssumption2933); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssumptionAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1401:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1402:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1402:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1403:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2954);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1419:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1419:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssumption2969); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssumptionAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1423:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1424:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1424:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1425:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssumption2990);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssumptionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1441:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1441:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssumption3005); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssumptionAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssumption3017); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1449:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1450:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1450:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1451:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption3038);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1467:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1467:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssumption3051); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssumptionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1471:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1472:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1472:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1473:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssumptionAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssumption3072);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption3086); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssumption3100); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1505:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1506:2: (iv_ruleSolution= ruleSolution EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1507:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolution_in_entryRuleSolution3136);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolution3146); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1514:1: ruleSolution returns [EObject current=null] : ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1517:28: ( ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1518:1: ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1518:1: ( () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1518:2: () otherlv_1= 'Solution' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )? (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1518:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSolutionAccess().getSolutionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSolution3192); 

                	newLeafNode(otherlv_1, grammarAccess.getSolutionAccess().getSolutionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3204); 

                	newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1532:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1532:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSolution3217); 

                        	newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1536:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1537:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1537:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1538:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3238);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1554:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1554:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolution3253); 

                        	newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1558:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1559:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1559:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1560:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3274);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1576:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1576:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolution3289); 

                        	newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1580:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1581:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1581:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1582:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3310);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1598:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1598:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSolution3325); 

                        	newLeafNode(otherlv_9, grammarAccess.getSolutionAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3337); 

                        	newLeafNode(otherlv_10, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1606:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1607:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1607:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1608:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3360);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1621:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==19) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1621:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3373); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSolutionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1625:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1626:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1626:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1627:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3396);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3410); 

                        	newLeafNode(otherlv_14, grammarAccess.getSolutionAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1644:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1644:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSolution3425); 

                        	newLeafNode(otherlv_15, grammarAccess.getSolutionAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSolution3437); 

                        	newLeafNode(otherlv_16, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1652:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1653:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1653:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1654:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3460);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1667:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==19) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1667:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3473); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSolutionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1671:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1672:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1672:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1673:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSolutionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolution3496);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSolution3510); 

                        	newLeafNode(otherlv_20, grammarAccess.getSolutionAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1690:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1690:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolution3525); 

                        	newLeafNode(otherlv_21, grammarAccess.getSolutionAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3537); 

                        	newLeafNode(otherlv_22, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1698:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1699:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1699:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1700:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3558);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1716:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==19) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1716:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3571); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getSolutionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1720:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1721:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1721:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1722:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleSolution3592);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3606); 

                        	newLeafNode(otherlv_26, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1742:3: (otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1742:5: otherlv_27= 'solutionEvidence' otherlv_28= '{' ( (lv_solutionEvidence_29_0= ruleEvidence ) ) (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSolution3621); 

                        	newLeafNode(otherlv_27, grammarAccess.getSolutionAccess().getSolutionEvidenceKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3633); 

                        	newLeafNode(otherlv_28, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1750:1: ( (lv_solutionEvidence_29_0= ruleEvidence ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1751:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1751:1: (lv_solutionEvidence_29_0= ruleEvidence )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1752:3: lv_solutionEvidence_29_0= ruleEvidence
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3654);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1768:2: (otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==19) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1768:4: otherlv_30= ',' ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3667); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getSolutionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1772:1: ( (lv_solutionEvidence_31_0= ruleEvidence ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1773:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1773:1: (lv_solutionEvidence_31_0= ruleEvidence )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1774:3: lv_solutionEvidence_31_0= ruleEvidence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionEvidenceEvidenceParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_ruleSolution3688);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3702); 

                        	newLeafNode(otherlv_32, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1794:3: (otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1794:5: otherlv_33= 'solutionContexts' otherlv_34= '{' ( (lv_solutionContexts_35_0= ruleContext ) ) (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSolution3717); 

                        	newLeafNode(otherlv_33, grammarAccess.getSolutionAccess().getSolutionContextsKeyword_10_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSolution3729); 

                        	newLeafNode(otherlv_34, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1802:1: ( (lv_solutionContexts_35_0= ruleContext ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1803:1: (lv_solutionContexts_35_0= ruleContext )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1803:1: (lv_solutionContexts_35_0= ruleContext )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1804:3: lv_solutionContexts_35_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3750);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1820:2: (otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==19) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1820:4: otherlv_36= ',' ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    {
                    	    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolution3763); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getSolutionAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1824:1: ( (lv_solutionContexts_37_0= ruleContext ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:1: (lv_solutionContexts_37_0= ruleContext )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1825:1: (lv_solutionContexts_37_0= ruleContext )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1826:3: lv_solutionContexts_37_0= ruleContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSolutionAccess().getSolutionContextsContextParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleSolution3784);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3798); 

                        	newLeafNode(otherlv_38, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolution3812); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1858:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1859:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1860:2: iv_ruleJustification= ruleJustification EOF
            {
             newCompositeNode(grammarAccess.getJustificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJustification_in_entryRuleJustification3848);
            iv_ruleJustification=ruleJustification();

            state._fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJustification3858); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1867:1: ruleJustification returns [EObject current=null] : ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1870:28: ( ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1871:1: ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1871:1: ( () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1871:2: () otherlv_1= 'Justification' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1871:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJustificationAccess().getJustificationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleJustification3904); 

                	newLeafNode(otherlv_1, grammarAccess.getJustificationAccess().getJustificationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification3916); 

                	newLeafNode(otherlv_2, grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1885:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==14) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1885:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleJustification3929); 

                        	newLeafNode(otherlv_3, grammarAccess.getJustificationAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1889:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1890:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1890:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1891:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification3950);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1907:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==15) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1907:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleJustification3965); 

                        	newLeafNode(otherlv_5, grammarAccess.getJustificationAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1911:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1912:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1912:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1913:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification3986);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1929:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1929:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleJustification4001); 

                        	newLeafNode(otherlv_7, grammarAccess.getJustificationAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1933:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1934:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1934:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1935:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJustification4022);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1951:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==18) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1951:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleJustification4037); 

                        	newLeafNode(otherlv_9, grammarAccess.getJustificationAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleJustification4049); 

                        	newLeafNode(otherlv_10, grammarAccess.getJustificationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1959:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1960:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1960:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1961:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification4070);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1977:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==19) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1977:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleJustification4083); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getJustificationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1981:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1982:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1982:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:1983:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJustificationAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleJustification4104);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification4118); 

                        	newLeafNode(otherlv_14, grammarAccess.getJustificationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleJustification4132); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2015:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2016:2: (iv_ruleEvidence= ruleEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2017:2: iv_ruleEvidence= ruleEvidence EOF
            {
             newCompositeNode(grammarAccess.getEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidence_in_entryRuleEvidence4168);
            iv_ruleEvidence=ruleEvidence();

            state._fsp--;

             current =iv_ruleEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidence4178); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2024:1: ruleEvidence returns [EObject current=null] : ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2027:28: ( ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2028:1: ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2028:1: ( () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2028:2: () otherlv_1= 'Evidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2028:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2029:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvidenceAccess().getEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEvidence4224); 

                	newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence4236); 

                	newLeafNode(otherlv_2, grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2042:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==14) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2042:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidence4249); 

                        	newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2046:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2047:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2047:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2048:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4270);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2064:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2064:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidence4285); 

                        	newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2068:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2069:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2069:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2070:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4306);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2086:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2086:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidence4321); 

                        	newLeafNode(otherlv_7, grammarAccess.getEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2090:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2091:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2091:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2092:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4342);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2108:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==39) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2108:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEvidence4357); 

                        	newLeafNode(otherlv_9, grammarAccess.getEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4369); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2116:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2117:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2117:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2118:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4392);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2131:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==19) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2131:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4405); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2135:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2136:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2136:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2137:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4428);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4442); 

                        	newLeafNode(otherlv_14, grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2154:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2154:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEvidence4457); 

                        	newLeafNode(otherlv_15, grammarAccess.getEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEvidence4469); 

                        	newLeafNode(otherlv_16, grammarAccess.getEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2162:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2163:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2163:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2164:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4492);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2177:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==19) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2177:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4505); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2181:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2182:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2182:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2183:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidence4528);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEvidence4542); 

                        	newLeafNode(otherlv_20, grammarAccess.getEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2200:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==18) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2200:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidence4557); 

                        	newLeafNode(otherlv_21, grammarAccess.getEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidence4569); 

                        	newLeafNode(otherlv_22, grammarAccess.getEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2208:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2209:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2209:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2210:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4590);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2226:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==19) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2226:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidence4603); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2230:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2231:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2231:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2232:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidence4624);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4638); 

                        	newLeafNode(otherlv_26, grammarAccess.getEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidence4652); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2264:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2265:2: (iv_ruleArgument= ruleArgument EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2266:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgument_in_entryRuleArgument4688);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgument4698); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2273:1: ruleArgument returns [EObject current=null] : ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2276:28: ( ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2277:1: ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2277:1: ( () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2277:2: () otherlv_1= 'Argument' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )? (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )? (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2277:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2278:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArgumentAccess().getArgumentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleArgument4744); 

                	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getArgumentKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4756); 

                	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2291:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==14) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2291:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArgument4769); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2295:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2296:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2296:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2297:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4790);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2313:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==15) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2313:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArgument4805); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2317:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2318:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2318:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2319:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4826);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2335:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==16) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2335:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArgument4841); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2339:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2340:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2340:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2341:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgument4862);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2357:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==18) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2357:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArgument4877); 

                        	newLeafNode(otherlv_9, grammarAccess.getArgumentAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4889); 

                        	newLeafNode(otherlv_10, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2365:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2366:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2366:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2367:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument4910);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2383:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==19) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2383:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument4923); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getArgumentAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2387:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2388:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2388:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2389:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgument4944);
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument4958); 

                        	newLeafNode(otherlv_14, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2409:3: (otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==48) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2409:5: otherlv_15= 'containsArgumentElement' otherlv_16= '{' ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) ) (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleArgument4973); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentAccess().getContainsArgumentElementKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument4985); 

                        	newLeafNode(otherlv_16, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2417:1: ( (lv_containsArgumentElement_17_0= ruleArgumentElement ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2418:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2418:1: (lv_containsArgumentElement_17_0= ruleArgumentElement )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2419:3: lv_containsArgumentElement_17_0= ruleArgumentElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument5006);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2435:2: (otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==19) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2435:4: otherlv_18= ',' ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5019); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getArgumentAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2439:1: ( (lv_containsArgumentElement_19_0= ruleArgumentElement ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2440:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2440:1: (lv_containsArgumentElement_19_0= ruleArgumentElement )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2441:3: lv_containsArgumentElement_19_0= ruleArgumentElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentElementArgumentElementParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentElement_in_ruleArgument5040);
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5054); 

                        	newLeafNode(otherlv_20, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2461:3: (otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==49) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2461:5: otherlv_21= 'containsArgumentLink' otherlv_22= '{' ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) ) (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleArgument5069); 

                        	newLeafNode(otherlv_21, grammarAccess.getArgumentAccess().getContainsArgumentLinkKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument5081); 

                        	newLeafNode(otherlv_22, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2469:1: ( (lv_containsArgumentLink_23_0= ruleArgumentLink ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2470:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2470:1: (lv_containsArgumentLink_23_0= ruleArgumentLink )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2471:3: lv_containsArgumentLink_23_0= ruleArgumentLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument5102);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2487:2: (otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==19) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2487:4: otherlv_24= ',' ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5115); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getArgumentAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2491:1: ( (lv_containsArgumentLink_25_0= ruleArgumentLink ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2492:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2492:1: (lv_containsArgumentLink_25_0= ruleArgumentLink )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2493:3: lv_containsArgumentLink_25_0= ruleArgumentLink
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentLinkArgumentLinkParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentLink_in_ruleArgument5136);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5150); 

                        	newLeafNode(otherlv_26, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2513:3: (otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2513:5: otherlv_27= 'containsArgument' otherlv_28= '{' ( (lv_containsArgument_29_0= ruleArgument ) ) (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleArgument5165); 

                        	newLeafNode(otherlv_27, grammarAccess.getArgumentAccess().getContainsArgumentKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgument5177); 

                        	newLeafNode(otherlv_28, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2521:1: ( (lv_containsArgument_29_0= ruleArgument ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2522:1: (lv_containsArgument_29_0= ruleArgument )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2522:1: (lv_containsArgument_29_0= ruleArgument )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2523:3: lv_containsArgument_29_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument5198);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2539:2: (otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==19) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2539:4: otherlv_30= ',' ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    {
                    	    otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgument5211); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getArgumentAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2543:1: ( (lv_containsArgument_31_0= ruleArgument ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2544:1: (lv_containsArgument_31_0= ruleArgument )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2544:1: (lv_containsArgument_31_0= ruleArgument )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2545:3: lv_containsArgument_31_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentAccess().getContainsArgumentArgumentParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgument_in_ruleArgument5232);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5246); 

                        	newLeafNode(otherlv_32, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgument5260); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2577:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2578:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2579:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation5296);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation5306); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2586:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2589:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2590:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2590:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2590:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2590:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAnnotation5352); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5364); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2604:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==14) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2604:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation5377); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2608:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2609:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2609:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2610:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5398);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2626:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==15) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2626:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation5413); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2630:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2631:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2631:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2632:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5434);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2648:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==16) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2648:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation5449); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2652:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2653:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2653:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2654:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5470);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2670:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==39) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2670:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAnnotation5485); 

                        	newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5497); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2678:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2679:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2679:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2680:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5520);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2693:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==19) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2693:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5533); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2697:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2698:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2698:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2699:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5556);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5570); 

                        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2716:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==42) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2716:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation5585); 

                        	newLeafNode(otherlv_15, grammarAccess.getAnnotationAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation5597); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2724:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2725:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2725:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2726:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5620);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2739:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==19) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2739:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5633); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2743:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2744:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2744:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2745:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation5656);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation5670); 

                        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2762:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==18) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2762:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation5685); 

                        	newLeafNode(otherlv_21, grammarAccess.getAnnotationAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation5697); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2770:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2771:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2771:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2772:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5718);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2788:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==19) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2788:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation5731); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2792:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2793:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2793:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2794:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAnnotation5752);
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
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5766); 

                        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation5780); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2826:1: entryRuleAssertedInference returns [EObject current=null] : iv_ruleAssertedInference= ruleAssertedInference EOF ;
    public final EObject entryRuleAssertedInference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedInference = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2827:2: (iv_ruleAssertedInference= ruleAssertedInference EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2828:2: iv_ruleAssertedInference= ruleAssertedInference EOF
            {
             newCompositeNode(grammarAccess.getAssertedInferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5816);
            iv_ruleAssertedInference=ruleAssertedInference();

            state._fsp--;

             current =iv_ruleAssertedInference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedInference5826); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2835:1: ruleAssertedInference returns [EObject current=null] : ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2838:28: ( ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:1: ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:1: ( () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:2: () otherlv_1= 'AssertedInference' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2839:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2840:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedInferenceAccess().getAssertedInferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAssertedInference5872); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedInferenceAccess().getAssertedInferenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference5884); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2853:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==14) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2853:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedInference5897); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedInferenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2857:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2858:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2858:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2859:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5918);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2875:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==15) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2875:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedInference5933); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedInferenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2879:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2880:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2880:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2881:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5954);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2897:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==16) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2897:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedInference5969); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedInferenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2901:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2902:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2902:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2903:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference5990);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedInferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2919:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==39) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2919:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedInference6005); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedInferenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference6017); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2927:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2928:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2928:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2929:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6040);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2942:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==19) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2942:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6053); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2946:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2947:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2947:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2948:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6076);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference6090); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2965:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==42) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2965:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedInference6105); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedInferenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedInference6117); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedInferenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2973:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2974:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2974:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2975:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6140);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2988:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==19) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2988:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6153); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2992:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2993:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2993:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:2994:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedInferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedInference6176);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedInference6190); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedInferenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3011:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==18) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3011:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedInference6205); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedInferenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedInference6217); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedInferenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3019:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3020:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3020:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3021:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference6238);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3037:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==19) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3037:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedInference6251); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedInferenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3041:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3042:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3042:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3043:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedInferenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedInference6272);
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
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference6286); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedInferenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedInference6300); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3075:1: entryRuleAssertedEvidence returns [EObject current=null] : iv_ruleAssertedEvidence= ruleAssertedEvidence EOF ;
    public final EObject entryRuleAssertedEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3076:2: (iv_ruleAssertedEvidence= ruleAssertedEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3077:2: iv_ruleAssertedEvidence= ruleAssertedEvidence EOF
            {
             newCompositeNode(grammarAccess.getAssertedEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence6336);
            iv_ruleAssertedEvidence=ruleAssertedEvidence();

            state._fsp--;

             current =iv_ruleAssertedEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedEvidence6346); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3084:1: ruleAssertedEvidence returns [EObject current=null] : ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3087:28: ( ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3088:1: ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3088:1: ( () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3088:2: () otherlv_1= 'AssertedEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3088:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3089:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAssertedEvidence6392); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedEvidenceAccess().getAssertedEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6404); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3102:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==14) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3102:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedEvidence6417); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3106:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3107:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3107:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3108:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6438);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3124:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==15) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3124:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedEvidence6453); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3128:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3129:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3129:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3130:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6474);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3146:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==16) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3146:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedEvidence6489); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3150:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3151:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3151:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3152:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6510);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3168:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==39) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3168:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedEvidence6525); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6537); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3176:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3177:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3177:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3178:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6560);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3191:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==19) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3191:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6573); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3195:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3196:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3196:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3197:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6596);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6610); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3214:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==42) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3214:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedEvidence6625); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedEvidence6637); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3222:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3223:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3223:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3224:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6660);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3237:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==19) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3237:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6673); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3241:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3242:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3242:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3243:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedEvidence6696);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedEvidence6710); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3260:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==18) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3260:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedEvidence6725); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedEvidence6737); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3268:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3269:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3269:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3270:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6758);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3286:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==19) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3286:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedEvidence6771); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3290:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3291:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3291:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3292:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6792);
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
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6806); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedEvidence6820); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3324:1: entryRuleAssertedContext returns [EObject current=null] : iv_ruleAssertedContext= ruleAssertedContext EOF ;
    public final EObject entryRuleAssertedContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedContext = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3325:2: (iv_ruleAssertedContext= ruleAssertedContext EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3326:2: iv_ruleAssertedContext= ruleAssertedContext EOF
            {
             newCompositeNode(grammarAccess.getAssertedContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6856);
            iv_ruleAssertedContext=ruleAssertedContext();

            state._fsp--;

             current =iv_ruleAssertedContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedContext6866); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3333:1: ruleAssertedContext returns [EObject current=null] : ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3336:28: ( ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3337:1: ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3337:1: ( () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3337:2: () otherlv_1= 'AssertedContext' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3337:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3338:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedContextAccess().getAssertedContextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAssertedContext6912); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedContextAccess().getAssertedContextKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext6924); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3351:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==14) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3351:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedContext6937); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedContextAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3355:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3356:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3356:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3357:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6958);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3373:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==15) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3373:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedContext6973); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedContextAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3377:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3378:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3378:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3379:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext6994);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3395:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==16) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3395:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedContext7009); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedContextAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3399:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3400:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3400:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3401:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7030);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedContextRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3417:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==39) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3417:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedContext7045); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedContextAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext7057); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3425:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3426:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3426:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3427:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7080);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3440:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==19) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3440:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7093); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedContextAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3444:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3445:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3445:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3446:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7116);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext7130); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3463:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==42) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3463:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedContext7145); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedContextAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedContext7157); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedContextAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3471:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3472:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3472:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3473:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7180);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3486:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==19) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3486:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7193); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedContextAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3490:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3491:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3491:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3492:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedContext7216);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedContext7230); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedContextAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3509:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==18) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3509:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedContext7245); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedContextAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedContext7257); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedContextAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3517:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3518:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3518:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3519:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext7278);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3535:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==19) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3535:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedContext7291); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedContextAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3539:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3540:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3540:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3541:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedContextAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedContext7312);
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
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext7326); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedContextAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedContext7340); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3573:1: entryRuleAssertedCounterEvidence returns [EObject current=null] : iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF ;
    public final EObject entryRuleAssertedCounterEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedCounterEvidence = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3574:2: (iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3575:2: iv_ruleAssertedCounterEvidence= ruleAssertedCounterEvidence EOF
            {
             newCompositeNode(grammarAccess.getAssertedCounterEvidenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence7376);
            iv_ruleAssertedCounterEvidence=ruleAssertedCounterEvidence();

            state._fsp--;

             current =iv_ruleAssertedCounterEvidence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedCounterEvidence7386); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3582:1: ruleAssertedCounterEvidence returns [EObject current=null] : ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3585:28: ( ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3586:1: ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3586:1: ( () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3586:2: () otherlv_1= 'AssertedCounterEvidence' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3586:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAssertedCounterEvidence7432); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedCounterEvidenceAccess().getAssertedCounterEvidenceKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence7444); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3600:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==14) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3600:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedCounterEvidence7457); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3604:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3605:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3605:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3606:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7478);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3622:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==15) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3622:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedCounterEvidence7493); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3626:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3627:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3627:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3628:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7514);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3644:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==16) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3644:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedCounterEvidence7529); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedCounterEvidenceAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3648:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3649:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3649:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3650:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7550);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3666:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==39) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3666:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedCounterEvidence7565); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedCounterEvidenceAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7577); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3674:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3675:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3675:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3676:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7600);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3689:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==19) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3689:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7613); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3693:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3694:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3694:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3695:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7636);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7650); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3712:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==42) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3712:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedCounterEvidence7665); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedCounterEvidenceAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedCounterEvidence7677); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedCounterEvidenceAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3720:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3721:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3721:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3722:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7700);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3735:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==19) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3735:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7713); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3739:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3740:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3740:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3741:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedCounterEvidenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7736);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedCounterEvidence7750); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedCounterEvidenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3758:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==18) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3758:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedCounterEvidence7765); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedCounterEvidence7777); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedCounterEvidenceAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3766:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3767:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3767:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3768:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7798);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3784:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==19) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3784:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedCounterEvidence7811); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedCounterEvidenceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3788:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3789:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3789:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3790:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedCounterEvidenceAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7832);
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
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7846); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedCounterEvidenceAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedCounterEvidence7860); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3822:1: entryRuleAssertedChallenge returns [EObject current=null] : iv_ruleAssertedChallenge= ruleAssertedChallenge EOF ;
    public final EObject entryRuleAssertedChallenge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertedChallenge = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3823:2: (iv_ruleAssertedChallenge= ruleAssertedChallenge EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3824:2: iv_ruleAssertedChallenge= ruleAssertedChallenge EOF
            {
             newCompositeNode(grammarAccess.getAssertedChallengeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7896);
            iv_ruleAssertedChallenge=ruleAssertedChallenge();

            state._fsp--;

             current =iv_ruleAssertedChallenge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssertedChallenge7906); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3831:1: ruleAssertedChallenge returns [EObject current=null] : ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3834:28: ( ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3835:1: ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3835:1: ( () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3835:2: () otherlv_1= 'AssertedChallenge' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3835:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3836:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssertedChallengeAccess().getAssertedChallengeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAssertedChallenge7952); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertedChallengeAccess().getAssertedChallengeKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge7964); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3849:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==14) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3849:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssertedChallenge7977); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssertedChallengeAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3853:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3854:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3854:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3855:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge7998);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3871:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==15) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3871:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssertedChallenge8013); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssertedChallengeAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3875:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3876:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3876:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3877:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8034);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3893:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==16) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3893:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssertedChallenge8049); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssertedChallengeAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3897:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3898:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3898:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3899:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8070);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertedChallengeRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3915:4: (otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==39) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3915:6: otherlv_9= 'target' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssertedChallenge8085); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssertedChallengeAccess().getTargetKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge8097); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3923:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3924:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3924:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3925:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8120);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3938:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==19) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3938:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8133); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3942:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3943:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3943:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3944:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getTargetModelElementCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8156);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge8170); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3961:3: (otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==42) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3961:5: otherlv_15= 'source' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAssertedChallenge8185); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssertedChallengeAccess().getSourceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssertedChallenge8197); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssertedChallengeAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3969:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3970:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3970:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3971:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8220);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3984:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==19) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3984:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8233); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3988:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3989:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3989:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:3990:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAssertedChallengeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getSourceModelElementCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssertedChallenge8256);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssertedChallenge8270); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssertedChallengeAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4007:3: (otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==18) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4007:5: otherlv_21= 'isTagged' otherlv_22= '{' ( (lv_isTagged_23_0= ruleTaggedValue ) ) (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssertedChallenge8285); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssertedChallengeAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssertedChallenge8297); 

                        	newLeafNode(otherlv_22, grammarAccess.getAssertedChallengeAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4015:1: ( (lv_isTagged_23_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4016:1: (lv_isTagged_23_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4016:1: (lv_isTagged_23_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4017:3: lv_isTagged_23_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8318);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4033:2: (otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==19) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4033:4: otherlv_24= ',' ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssertedChallenge8331); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAssertedChallengeAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4037:1: ( (lv_isTagged_25_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4038:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4038:1: (lv_isTagged_25_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4039:3: lv_isTagged_25_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssertedChallengeAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8352);
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
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge8366); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssertedChallengeAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssertedChallenge8380); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4071:1: entryRuleClaim_Impl returns [EObject current=null] : iv_ruleClaim_Impl= ruleClaim_Impl EOF ;
    public final EObject entryRuleClaim_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim_Impl = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4072:2: (iv_ruleClaim_Impl= ruleClaim_Impl EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4073:2: iv_ruleClaim_Impl= ruleClaim_Impl EOF
            {
             newCompositeNode(grammarAccess.getClaim_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl8416);
            iv_ruleClaim_Impl=ruleClaim_Impl();

            state._fsp--;

             current =iv_ruleClaim_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClaim_Impl8426); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4080:1: ruleClaim_Impl returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4083:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4084:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4084:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4084:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'Claim' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4084:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4085:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClaim_ImplAccess().getClaimAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4090:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==11) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4091:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4091:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4092:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleClaim_Impl8478); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getClaim_ImplAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClaim_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleClaim_Impl8504); 

                	newLeafNode(otherlv_2, grammarAccess.getClaim_ImplAccess().getClaimKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl8516); 

                	newLeafNode(otherlv_3, grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4113:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==14) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4113:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClaim_Impl8529); 

                        	newLeafNode(otherlv_4, grammarAccess.getClaim_ImplAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4117:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4118:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4118:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4119:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIdentifierEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8550);
                    lv_identifier_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4135:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==15) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4135:6: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClaim_Impl8565); 

                        	newLeafNode(otherlv_6, grammarAccess.getClaim_ImplAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4139:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4140:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4140:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4141:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8586);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4157:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==16) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4157:6: otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClaim_Impl8601); 

                        	newLeafNode(otherlv_8, grammarAccess.getClaim_ImplAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4161:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4162:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4162:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4163:3: lv_content_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getContentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClaim_Impl8622);
                    lv_content_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClaim_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4179:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==17) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4179:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClaim_Impl8637); 

                        	newLeafNode(otherlv_10, grammarAccess.getClaim_ImplAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4183:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4184:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4184:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4185:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleClaim_Impl8658);
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

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4201:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==18) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4201:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClaim_Impl8673); 

                        	newLeafNode(otherlv_12, grammarAccess.getClaim_ImplAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClaim_Impl8685); 

                        	newLeafNode(otherlv_13, grammarAccess.getClaim_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4209:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4210:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4210:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4211:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8706);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4227:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==19) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4227:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClaim_Impl8719); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getClaim_ImplAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4231:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4232:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4232:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4233:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClaim_ImplAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8740);
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
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8754); 

                        	newLeafNode(otherlv_17, grammarAccess.getClaim_ImplAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClaim_Impl8768); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4265:1: entryRuleEvidenceAssertion returns [EObject current=null] : iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF ;
    public final EObject entryRuleEvidenceAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidenceAssertion = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4266:2: (iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4267:2: iv_ruleEvidenceAssertion= ruleEvidenceAssertion EOF
            {
             newCompositeNode(grammarAccess.getEvidenceAssertionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8804);
            iv_ruleEvidenceAssertion=ruleEvidenceAssertion();

            state._fsp--;

             current =iv_ruleEvidenceAssertion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvidenceAssertion8814); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4274:1: ruleEvidenceAssertion returns [EObject current=null] : ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4277:28: ( ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4278:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4278:1: ( () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4278:2: () ( (lv_assumed_1_0= 'assumed' ) )? otherlv_2= 'EvidenceAssertion' otherlv_3= '{' (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )? (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )? (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4278:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4279:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionAction_0(),
                        current);
                

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4284:2: ( (lv_assumed_1_0= 'assumed' ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==11) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4285:1: (lv_assumed_1_0= 'assumed' )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4285:1: (lv_assumed_1_0= 'assumed' )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4286:3: lv_assumed_1_0= 'assumed'
                    {
                    lv_assumed_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEvidenceAssertion8866); 

                            newLeafNode(lv_assumed_1_0, grammarAccess.getEvidenceAssertionAccess().getAssumedAssumedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		setWithLastConsumed(current, "assumed", true, "assumed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEvidenceAssertion8892); 

                	newLeafNode(otherlv_2, grammarAccess.getEvidenceAssertionAccess().getEvidenceAssertionKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion8904); 

                	newLeafNode(otherlv_3, grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4307:1: (otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==14) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4307:3: otherlv_4= 'identifier' ( (lv_identifier_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvidenceAssertion8917); 

                        	newLeafNode(otherlv_4, grammarAccess.getEvidenceAssertionAccess().getIdentifierKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4311:1: ( (lv_identifier_5_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4312:1: (lv_identifier_5_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4312:1: (lv_identifier_5_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4313:3: lv_identifier_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIdentifierEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion8938);
                    lv_identifier_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4329:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==15) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4329:6: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvidenceAssertion8953); 

                        	newLeafNode(otherlv_6, grammarAccess.getEvidenceAssertionAccess().getDescriptionKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4333:1: ( (lv_description_7_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4334:1: (lv_description_7_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4334:1: (lv_description_7_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4335:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion8974);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4351:4: (otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==16) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4351:6: otherlv_8= 'content' ( (lv_content_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvidenceAssertion8989); 

                        	newLeafNode(otherlv_8, grammarAccess.getEvidenceAssertionAccess().getContentKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4355:1: ( (lv_content_9_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4356:1: (lv_content_9_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4356:1: (lv_content_9_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4357:3: lv_content_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getContentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvidenceAssertion9010);
                    lv_content_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvidenceAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4373:4: (otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==17) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4373:6: otherlv_10= 'toBeSupported' ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvidenceAssertion9025); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvidenceAssertionAccess().getToBeSupportedKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4377:1: ( (lv_toBeSupported_11_0= ruleEBoolean ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4378:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4378:1: (lv_toBeSupported_11_0= ruleEBoolean )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4379:3: lv_toBeSupported_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getToBeSupportedEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion9046);
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

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4395:4: (otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==18) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4395:6: otherlv_12= 'isTagged' otherlv_13= '{' ( (lv_isTagged_14_0= ruleTaggedValue ) ) (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvidenceAssertion9061); 

                        	newLeafNode(otherlv_12, grammarAccess.getEvidenceAssertionAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvidenceAssertion9073); 

                        	newLeafNode(otherlv_13, grammarAccess.getEvidenceAssertionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4403:1: ( (lv_isTagged_14_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4404:1: (lv_isTagged_14_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4404:1: (lv_isTagged_14_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4405:3: lv_isTagged_14_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9094);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4421:2: (otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==19) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4421:4: otherlv_15= ',' ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvidenceAssertion9107); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getEvidenceAssertionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4425:1: ( (lv_isTagged_16_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4426:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4426:1: (lv_isTagged_16_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4427:3: lv_isTagged_16_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvidenceAssertionAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9128);
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
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion9142); 

                        	newLeafNode(otherlv_17, grammarAccess.getEvidenceAssertionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvidenceAssertion9156); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4459:1: entryRuleInformationElement returns [EObject current=null] : iv_ruleInformationElement= ruleInformationElement EOF ;
    public final EObject entryRuleInformationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4460:2: (iv_ruleInformationElement= ruleInformationElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4461:2: iv_ruleInformationElement= ruleInformationElement EOF
            {
             newCompositeNode(grammarAccess.getInformationElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInformationElement_in_entryRuleInformationElement9192);
            iv_ruleInformationElement=ruleInformationElement();

            state._fsp--;

             current =iv_ruleInformationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInformationElement9202); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4468:1: ruleInformationElement returns [EObject current=null] : ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4471:28: ( ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:1: ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:1: ( () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:2: () otherlv_1= 'InformationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4472:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4473:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInformationElementAccess().getInformationElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleInformationElement9248); 

                	newLeafNode(otherlv_1, grammarAccess.getInformationElementAccess().getInformationElementKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement9260); 

                	newLeafNode(otherlv_2, grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4486:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==14) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4486:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInformationElement9273); 

                        	newLeafNode(otherlv_3, grammarAccess.getInformationElementAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4490:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4491:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4491:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4492:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement9294);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4508:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==15) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4508:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInformationElement9309); 

                        	newLeafNode(otherlv_5, grammarAccess.getInformationElementAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4512:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4513:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4513:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4514:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement9330);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4530:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==16) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4530:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInformationElement9345); 

                        	newLeafNode(otherlv_7, grammarAccess.getInformationElementAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4534:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4535:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4535:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4536:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInformationElement9366);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4552:4: (otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==18) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4552:6: otherlv_9= 'isTagged' otherlv_10= '{' ( (lv_isTagged_11_0= ruleTaggedValue ) ) (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInformationElement9381); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformationElementAccess().getIsTaggedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInformationElement9393); 

                        	newLeafNode(otherlv_10, grammarAccess.getInformationElementAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4560:1: ( (lv_isTagged_11_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4561:1: (lv_isTagged_11_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4561:1: (lv_isTagged_11_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4562:3: lv_isTagged_11_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement9414);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4578:2: (otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==19) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4578:4: otherlv_12= ',' ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInformationElement9427); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getInformationElementAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4582:1: ( (lv_isTagged_13_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4583:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4583:1: (lv_isTagged_13_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4584:3: lv_isTagged_13_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformationElementAccess().getIsTaggedTaggedValueParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleInformationElement9448);
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
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement9462); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformationElementAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInformationElement9476); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4616:1: entryRuleArgumentReasoning returns [EObject current=null] : iv_ruleArgumentReasoning= ruleArgumentReasoning EOF ;
    public final EObject entryRuleArgumentReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentReasoning = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4617:2: (iv_ruleArgumentReasoning= ruleArgumentReasoning EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4618:2: iv_ruleArgumentReasoning= ruleArgumentReasoning EOF
            {
             newCompositeNode(grammarAccess.getArgumentReasoningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning9512);
            iv_ruleArgumentReasoning=ruleArgumentReasoning();

            state._fsp--;

             current =iv_ruleArgumentReasoning; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentReasoning9522); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4625:1: ruleArgumentReasoning returns [EObject current=null] : ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4628:28: ( ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4629:1: ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4629:1: ( () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4629:2: () otherlv_1= 'ArgumentReasoning' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )? (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4629:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4630:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArgumentReasoningAccess().getArgumentReasoningAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleArgumentReasoning9568); 

                	newLeafNode(otherlv_1, grammarAccess.getArgumentReasoningAccess().getArgumentReasoningKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning9580); 

                	newLeafNode(otherlv_2, grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4643:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==14) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4643:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArgumentReasoning9593); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentReasoningAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4647:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4648:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4648:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4649:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9614);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4665:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==15) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4665:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArgumentReasoning9629); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentReasoningAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4669:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4670:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4670:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4671:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9650);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4687:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==16) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4687:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArgumentReasoning9665); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentReasoningAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4691:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4692:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4692:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4693:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9686);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentReasoningRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4709:4: (otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==61) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4709:6: otherlv_9= 'describes' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleArgumentReasoning9701); 

                        	newLeafNode(otherlv_9, grammarAccess.getArgumentReasoningAccess().getDescribesKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleArgumentReasoning9713); 

                        	newLeafNode(otherlv_10, grammarAccess.getArgumentReasoningAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4717:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4718:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4718:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4719:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9736);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4732:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==19) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4732:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9749); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getArgumentReasoningAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4736:1: ( ( ruleEString ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4737:1: ( ruleEString )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4737:1: ( ruleEString )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4738:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getDescribesAssertedInferenceCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9772);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleArgumentReasoning9786); 

                        	newLeafNode(otherlv_14, grammarAccess.getArgumentReasoningAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4755:3: (otherlv_15= 'hasStructure' ( ( ruleEString ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==62) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4755:5: otherlv_15= 'hasStructure' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleArgumentReasoning9801); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentReasoningAccess().getHasStructureKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4759:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4760:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4760:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4761:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentReasoningRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getHasStructureArgumentCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArgumentReasoning9824);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4774:4: (otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==18) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4774:6: otherlv_17= 'isTagged' otherlv_18= '{' ( (lv_isTagged_19_0= ruleTaggedValue ) ) (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArgumentReasoning9839); 

                        	newLeafNode(otherlv_17, grammarAccess.getArgumentReasoningAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArgumentReasoning9851); 

                        	newLeafNode(otherlv_18, grammarAccess.getArgumentReasoningAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4782:1: ( (lv_isTagged_19_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4783:1: (lv_isTagged_19_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4783:1: (lv_isTagged_19_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4784:3: lv_isTagged_19_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9872);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4800:2: (otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) ) )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==19) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4800:4: otherlv_20= ',' ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArgumentReasoning9885); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getArgumentReasoningAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4804:1: ( (lv_isTagged_21_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4805:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4805:1: (lv_isTagged_21_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4806:3: lv_isTagged_21_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentReasoningAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9906);
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
                    	    break loop164;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning9920); 

                        	newLeafNode(otherlv_22, grammarAccess.getArgumentReasoningAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArgumentReasoning9934); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4838:1: entryRuleCitationElement returns [EObject current=null] : iv_ruleCitationElement= ruleCitationElement EOF ;
    public final EObject entryRuleCitationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCitationElement = null;


        try {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4839:2: (iv_ruleCitationElement= ruleCitationElement EOF )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4840:2: iv_ruleCitationElement= ruleCitationElement EOF
            {
             newCompositeNode(grammarAccess.getCitationElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCitationElement_in_entryRuleCitationElement9970);
            iv_ruleCitationElement=ruleCitationElement();

            state._fsp--;

             current =iv_ruleCitationElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCitationElement9980); 

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
    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4847:1: ruleCitationElement returns [EObject current=null] : ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4850:28: ( ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4851:1: ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4851:1: ( () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4851:2: () otherlv_1= 'CitationElement' otherlv_2= '{' (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )? (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )? (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )? (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4851:2: ()
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4852:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCitationElementAccess().getCitationElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCitationElement10026); 

                	newLeafNode(otherlv_1, grammarAccess.getCitationElementAccess().getCitationElementKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement10038); 

                	newLeafNode(otherlv_2, grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4865:1: (otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==14) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4865:3: otherlv_3= 'identifier' ( (lv_identifier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCitationElement10051); 

                        	newLeafNode(otherlv_3, grammarAccess.getCitationElementAccess().getIdentifierKeyword_3_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4869:1: ( (lv_identifier_4_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4870:1: (lv_identifier_4_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4870:1: (lv_identifier_4_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4871:3: lv_identifier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIdentifierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10072);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4887:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==15) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4887:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCitationElement10087); 

                        	newLeafNode(otherlv_5, grammarAccess.getCitationElementAccess().getDescriptionKeyword_4_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4891:1: ( (lv_description_6_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4892:1: (lv_description_6_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4892:1: (lv_description_6_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4893:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10108);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4909:4: (otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==16) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4909:6: otherlv_7= 'content' ( (lv_content_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCitationElement10123); 

                        	newLeafNode(otherlv_7, grammarAccess.getCitationElementAccess().getContentKeyword_5_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4913:1: ( (lv_content_8_0= ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4914:1: (lv_content_8_0= ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4914:1: (lv_content_8_0= ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4915:3: lv_content_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getContentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10144);
                    lv_content_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCitationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4931:4: (otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==64) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4931:6: otherlv_9= 'refersToArgumentElement' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCitationElement10159); 

                        	newLeafNode(otherlv_9, grammarAccess.getCitationElementAccess().getRefersToArgumentElementKeyword_6_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4935:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4936:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4936:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4937:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCitationElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentElementArgumentElementCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10182);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4950:4: (otherlv_11= 'refersToArgument' ( ( ruleEString ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==65) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4950:6: otherlv_11= 'refersToArgument' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCitationElement10197); 

                        	newLeafNode(otherlv_11, grammarAccess.getCitationElementAccess().getRefersToArgumentKeyword_7_0());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4954:1: ( ( ruleEString ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4955:1: ( ruleEString )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4955:1: ( ruleEString )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4956:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCitationElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getRefersToArgumentArgumentCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCitationElement10220);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4969:4: (otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}' )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==18) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4969:6: otherlv_13= 'isTagged' otherlv_14= '{' ( (lv_isTagged_15_0= ruleTaggedValue ) ) (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCitationElement10235); 

                        	newLeafNode(otherlv_13, grammarAccess.getCitationElementAccess().getIsTaggedKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCitationElement10247); 

                        	newLeafNode(otherlv_14, grammarAccess.getCitationElementAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4977:1: ( (lv_isTagged_15_0= ruleTaggedValue ) )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4978:1: (lv_isTagged_15_0= ruleTaggedValue )
                    {
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4978:1: (lv_isTagged_15_0= ruleTaggedValue )
                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4979:3: lv_isTagged_15_0= ruleTaggedValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement10268);
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

                    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4995:2: (otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==19) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4995:4: otherlv_16= ',' ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCitationElement10281); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getCitationElementAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:4999:1: ( (lv_isTagged_17_0= ruleTaggedValue ) )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5000:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    {
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5000:1: (lv_isTagged_17_0= ruleTaggedValue )
                    	    // ../net.certware.argument.gsn.dsl/src-gen/net/certware/argument/gsn/parser/antlr/internal/InternalGsnDsl.g:5001:3: lv_isTagged_17_0= ruleTaggedValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCitationElementAccess().getIsTaggedTaggedValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaggedValue_in_ruleCitationElement10302);
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
                    	    break loop171;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement10316); 

                        	newLeafNode(otherlv_18, grammarAccess.getCitationElementAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCitationElement10330); 

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
        public static final BitSet FOLLOW_ruleModelGoal_in_entryRuleModelGoal75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelGoal85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModelGoal137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModelGoal163 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal175 = new BitSet(new long[]{0x0000000003F7C000L});
        public static final BitSet FOLLOW_14_in_ruleModelGoal188 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelGoal209 = new BitSet(new long[]{0x0000000003F78000L});
        public static final BitSet FOLLOW_15_in_ruleModelGoal224 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelGoal245 = new BitSet(new long[]{0x0000000003F70000L});
        public static final BitSet FOLLOW_16_in_ruleModelGoal260 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelGoal281 = new BitSet(new long[]{0x0000000003F60000L});
        public static final BitSet FOLLOW_17_in_ruleModelGoal296 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleModelGoal317 = new BitSet(new long[]{0x0000000003F40000L});
        public static final BitSet FOLLOW_18_in_ruleModelGoal332 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal344 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleModelGoal365 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal378 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleModelGoal399 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal413 = new BitSet(new long[]{0x0000000003F00000L});
        public static final BitSet FOLLOW_21_in_ruleModelGoal428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal440 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleModelGoal_in_ruleModelGoal461 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal474 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleModelGoal_in_ruleModelGoal495 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal509 = new BitSet(new long[]{0x0000000003D00000L});
        public static final BitSet FOLLOW_22_in_ruleModelGoal524 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal536 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleModelGoal557 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal570 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleModelGoal591 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal605 = new BitSet(new long[]{0x0000000003900000L});
        public static final BitSet FOLLOW_23_in_ruleModelGoal620 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal632 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleModelGoal653 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal666 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleModelGoal687 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal701 = new BitSet(new long[]{0x0000000003100000L});
        public static final BitSet FOLLOW_24_in_ruleModelGoal716 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal728 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleModelGoal749 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal762 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAssumption_in_ruleModelGoal783 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal797 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleModelGoal812 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModelGoal824 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleModelGoal845 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleModelGoal858 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleModelGoal879 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal893 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleModelGoal907 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleTaggedValue_in_entryRuleTaggedValue1372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaggedValue1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTaggedValue1428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaggedValue1440 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_27_in_ruleTaggedValue1453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaggedValue1474 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleTaggedValue1489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaggedValue1510 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaggedValue1524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEBoolean1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy1792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleStrategy1848 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1860 = new BitSet(new long[]{0x0000000F0015C000L});
        public static final BitSet FOLLOW_14_in_ruleStrategy1873 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1894 = new BitSet(new long[]{0x0000000F00158000L});
        public static final BitSet FOLLOW_15_in_ruleStrategy1909 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1930 = new BitSet(new long[]{0x0000000F00150000L});
        public static final BitSet FOLLOW_16_in_ruleStrategy1945 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStrategy1966 = new BitSet(new long[]{0x0000000F00140000L});
        public static final BitSet FOLLOW_18_in_ruleStrategy1981 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy1993 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy2014 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2027 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleStrategy2048 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2062 = new BitSet(new long[]{0x0000000F00100000L});
        public static final BitSet FOLLOW_32_in_ruleStrategy2077 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2089 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleModelGoal_in_ruleStrategy2110 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2123 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleModelGoal_in_ruleStrategy2144 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2158 = new BitSet(new long[]{0x0000000E00100000L});
        public static final BitSet FOLLOW_33_in_ruleStrategy2173 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2185 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2206 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2219 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleJustification_in_ruleStrategy2240 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2254 = new BitSet(new long[]{0x0000000C00100000L});
        public static final BitSet FOLLOW_34_in_ruleStrategy2269 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2281 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2302 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2315 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleStrategy2336 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2350 = new BitSet(new long[]{0x0000000800100000L});
        public static final BitSet FOLLOW_35_in_ruleStrategy2365 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStrategy2377 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2398 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleStrategy2411 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleSolution_in_ruleStrategy2432 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2446 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStrategy2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext2496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleContext2552 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2564 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleContext2577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2598 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleContext2613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2634 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleContext2649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext2670 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleContext2685 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext2697 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2718 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleContext2731 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleContext2752 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleContext2766 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleContext2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption2816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssumption2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAssumption2872 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption2884 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssumption2897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2918 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssumption2933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2954 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssumption2969 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssumption2990 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssumption3005 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssumption3017 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption3038 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssumption3051 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssumption3072 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption3086 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssumption3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolution_in_entryRuleSolution3136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolution3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSolution3192 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3204 = new BitSet(new long[]{0x00001C800015C000L});
        public static final BitSet FOLLOW_14_in_ruleSolution3217 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3238 = new BitSet(new long[]{0x00001C8000158000L});
        public static final BitSet FOLLOW_15_in_ruleSolution3253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3274 = new BitSet(new long[]{0x00001C8000150000L});
        public static final BitSet FOLLOW_16_in_ruleSolution3289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3310 = new BitSet(new long[]{0x00001C8000140000L});
        public static final BitSet FOLLOW_39_in_ruleSolution3325 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3337 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3360 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3373 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3396 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3410 = new BitSet(new long[]{0x00001C0000140000L});
        public static final BitSet FOLLOW_42_in_ruleSolution3425 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSolution3437 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3460 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolution3496 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleSolution3510 = new BitSet(new long[]{0x0000180000140000L});
        public static final BitSet FOLLOW_18_in_ruleSolution3525 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3537 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3558 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3571 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleSolution3592 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3606 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_43_in_ruleSolution3621 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3633 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3654 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3667 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEvidence_in_ruleSolution3688 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3702 = new BitSet(new long[]{0x0000100000100000L});
        public static final BitSet FOLLOW_44_in_ruleSolution3717 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSolution3729 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3750 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleSolution3763 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleContext_in_ruleSolution3784 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3798 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSolution3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification3848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJustification3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleJustification3904 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification3916 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleJustification3929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification3950 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleJustification3965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification3986 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleJustification4001 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJustification4022 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleJustification4037 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJustification4049 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification4070 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleJustification4083 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleJustification4104 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleJustification4118 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleJustification4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidence_in_entryRuleEvidence4168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidence4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEvidence4224 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence4236 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidence4249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4270 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleEvidence4285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4306 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleEvidence4321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4342 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleEvidence4357 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4369 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4392 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4405 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4428 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4442 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleEvidence4457 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEvidence4469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4492 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4505 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidence4528 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleEvidence4542 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidence4557 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidence4569 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4590 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidence4603 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidence4624 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4638 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidence4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument4688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgument4698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleArgument4744 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4756 = new BitSet(new long[]{0x000700000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgument4769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4790 = new BitSet(new long[]{0x0007000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgument4805 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4826 = new BitSet(new long[]{0x0007000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgument4841 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgument4862 = new BitSet(new long[]{0x0007000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgument4877 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4889 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument4910 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument4923 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgument4944 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument4958 = new BitSet(new long[]{0x0007000000100000L});
        public static final BitSet FOLLOW_48_in_ruleArgument4973 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument4985 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument5006 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5019 = new BitSet(new long[]{0x9E00000000000800L});
        public static final BitSet FOLLOW_ruleArgumentElement_in_ruleArgument5040 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5054 = new BitSet(new long[]{0x0006000000100000L});
        public static final BitSet FOLLOW_49_in_ruleArgument5069 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument5081 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument5102 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5115 = new BitSet(new long[]{0x01F8000000000000L});
        public static final BitSet FOLLOW_ruleArgumentLink_in_ruleArgument5136 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5150 = new BitSet(new long[]{0x0004000000100000L});
        public static final BitSet FOLLOW_50_in_ruleArgument5165 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgument5177 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument5198 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgument5211 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleArgument_in_ruleArgument5232 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5246 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgument5260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAnnotation5352 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5364 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation5377 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5398 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation5413 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5434 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation5449 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5470 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAnnotation5485 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5497 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5520 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5533 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5556 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5570 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation5585 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation5597 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5620 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5633 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation5656 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation5670 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation5685 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation5697 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5718 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation5731 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAnnotation5752 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5766 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation5780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedInference_in_entryRuleAssertedInference5816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedInference5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAssertedInference5872 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference5884 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedInference5897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5918 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedInference5933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5954 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedInference5969 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference5990 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedInference6005 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference6017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6040 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6076 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference6090 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedInference6105 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedInference6117 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6140 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedInference6176 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedInference6190 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedInference6205 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedInference6217 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference6238 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedInference6251 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedInference6272 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference6286 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedInference6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedEvidence_in_entryRuleAssertedEvidence6336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedEvidence6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAssertedEvidence6392 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6404 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedEvidence6417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6438 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedEvidence6453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6474 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedEvidence6489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6510 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedEvidence6525 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6560 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6596 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6610 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedEvidence6625 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedEvidence6637 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6660 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6673 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedEvidence6696 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedEvidence6710 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedEvidence6725 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedEvidence6737 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6758 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedEvidence6771 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedEvidence6792 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6806 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedEvidence6820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedContext_in_entryRuleAssertedContext6856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedContext6866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAssertedContext6912 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext6924 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedContext6937 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6958 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedContext6973 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext6994 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedContext7009 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7030 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedContext7045 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext7057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7080 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7116 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext7130 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedContext7145 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedContext7157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7180 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7193 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedContext7216 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedContext7230 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedContext7245 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedContext7257 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext7278 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedContext7291 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedContext7312 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext7326 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedContext7340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedCounterEvidence_in_entryRuleAssertedCounterEvidence7376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedCounterEvidence7386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAssertedCounterEvidence7432 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence7444 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedCounterEvidence7457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7478 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedCounterEvidence7493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7514 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedCounterEvidence7529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7550 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedCounterEvidence7565 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7600 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7636 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7650 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedCounterEvidence7665 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedCounterEvidence7677 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7700 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedCounterEvidence7736 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedCounterEvidence7750 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedCounterEvidence7765 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedCounterEvidence7777 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7798 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedCounterEvidence7811 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedCounterEvidence7832 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7846 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedCounterEvidence7860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssertedChallenge_in_entryRuleAssertedChallenge7896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssertedChallenge7906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAssertedChallenge7952 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge7964 = new BitSet(new long[]{0x000004800015C000L});
        public static final BitSet FOLLOW_14_in_ruleAssertedChallenge7977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge7998 = new BitSet(new long[]{0x0000048000158000L});
        public static final BitSet FOLLOW_15_in_ruleAssertedChallenge8013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8034 = new BitSet(new long[]{0x0000048000150000L});
        public static final BitSet FOLLOW_16_in_ruleAssertedChallenge8049 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8070 = new BitSet(new long[]{0x0000048000140000L});
        public static final BitSet FOLLOW_39_in_ruleAssertedChallenge8085 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge8097 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8120 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8156 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge8170 = new BitSet(new long[]{0x0000040000140000L});
        public static final BitSet FOLLOW_42_in_ruleAssertedChallenge8185 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAssertedChallenge8197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8220 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8233 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssertedChallenge8256 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleAssertedChallenge8270 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssertedChallenge8285 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssertedChallenge8297 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8318 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAssertedChallenge8331 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleAssertedChallenge8352 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge8366 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAssertedChallenge8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClaim_Impl_in_entryRuleClaim_Impl8416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClaim_Impl8426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleClaim_Impl8478 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleClaim_Impl8504 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl8516 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleClaim_Impl8529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8550 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleClaim_Impl8565 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8586 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleClaim_Impl8601 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClaim_Impl8622 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleClaim_Impl8637 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleClaim_Impl8658 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleClaim_Impl8673 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClaim_Impl8685 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8706 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleClaim_Impl8719 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleClaim_Impl8740 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8754 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleClaim_Impl8768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvidenceAssertion_in_entryRuleEvidenceAssertion8804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvidenceAssertion8814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEvidenceAssertion8866 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleEvidenceAssertion8892 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion8904 = new BitSet(new long[]{0x000000000017C000L});
        public static final BitSet FOLLOW_14_in_ruleEvidenceAssertion8917 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion8938 = new BitSet(new long[]{0x0000000000178000L});
        public static final BitSet FOLLOW_15_in_ruleEvidenceAssertion8953 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion8974 = new BitSet(new long[]{0x0000000000170000L});
        public static final BitSet FOLLOW_16_in_ruleEvidenceAssertion8989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvidenceAssertion9010 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleEvidenceAssertion9025 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEvidenceAssertion9046 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEvidenceAssertion9061 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvidenceAssertion9073 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9094 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleEvidenceAssertion9107 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleEvidenceAssertion9128 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion9142 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvidenceAssertion9156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInformationElement_in_entryRuleInformationElement9192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInformationElement9202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleInformationElement9248 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement9260 = new BitSet(new long[]{0x000000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleInformationElement9273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement9294 = new BitSet(new long[]{0x0000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleInformationElement9309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement9330 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleInformationElement9345 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInformationElement9366 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleInformationElement9381 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInformationElement9393 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement9414 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleInformationElement9427 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleInformationElement9448 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement9462 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInformationElement9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentReasoning_in_entryRuleArgumentReasoning9512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentReasoning9522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleArgumentReasoning9568 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning9580 = new BitSet(new long[]{0x600000000015C000L});
        public static final BitSet FOLLOW_14_in_ruleArgumentReasoning9593 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9614 = new BitSet(new long[]{0x6000000000158000L});
        public static final BitSet FOLLOW_15_in_ruleArgumentReasoning9629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9650 = new BitSet(new long[]{0x6000000000150000L});
        public static final BitSet FOLLOW_16_in_ruleArgumentReasoning9665 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9686 = new BitSet(new long[]{0x6000000000140000L});
        public static final BitSet FOLLOW_61_in_ruleArgumentReasoning9701 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleArgumentReasoning9713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9736 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9749 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9772 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_41_in_ruleArgumentReasoning9786 = new BitSet(new long[]{0x4000000000140000L});
        public static final BitSet FOLLOW_62_in_ruleArgumentReasoning9801 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArgumentReasoning9824 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArgumentReasoning9839 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArgumentReasoning9851 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9872 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArgumentReasoning9885 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleArgumentReasoning9906 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning9920 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleArgumentReasoning9934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCitationElement_in_entryRuleCitationElement9970 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCitationElement9980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCitationElement10026 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement10038 = new BitSet(new long[]{0x000000000015C000L,0x0000000000000003L});
        public static final BitSet FOLLOW_14_in_ruleCitationElement10051 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10072 = new BitSet(new long[]{0x0000000000158000L,0x0000000000000003L});
        public static final BitSet FOLLOW_15_in_ruleCitationElement10087 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10108 = new BitSet(new long[]{0x0000000000150000L,0x0000000000000003L});
        public static final BitSet FOLLOW_16_in_ruleCitationElement10123 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10144 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64_in_ruleCitationElement10159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10182 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCitationElement10197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCitationElement10220 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleCitationElement10235 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCitationElement10247 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement10268 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleCitationElement10281 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTaggedValue_in_ruleCitationElement10302 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement10316 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCitationElement10330 = new BitSet(new long[]{0x0000000000000002L});
    }


}