package net.certware.planning.cpn.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.planning.cpn.services.CpnDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpnDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argumentmodel'", "'cost'", "'duration'", "'team'", "'facility'", "'plan'", "'element'", "'estimated'", "'('", "')'", "'actual'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCpnDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCpnDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCpnDslParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g"; }



     	private CpnDslGrammarAccess grammarAccess;
     	
        public InternalCpnDslParser(TokenStream input, CpnDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Plans";	
       	}
       	
       	@Override
       	protected CpnDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePlans"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:67:1: entryRulePlans returns [EObject current=null] : iv_rulePlans= rulePlans EOF ;
    public final EObject entryRulePlans() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlans = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:68:2: (iv_rulePlans= rulePlans EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:69:2: iv_rulePlans= rulePlans EOF
            {
             newCompositeNode(grammarAccess.getPlansRule()); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans75);
            iv_rulePlans=rulePlans();

            state._fsp--;

             current =iv_rulePlans; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlans85); 

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
    // $ANTLR end "entryRulePlans"


    // $ANTLR start "rulePlans"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:76:1: rulePlans returns [EObject current=null] : ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* ) ;
    public final EObject rulePlans() throws RecognitionException {
        EObject current = null;

        EObject lv_argumentmodels_0_0 = null;

        EObject lv_plans_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:79:28: ( ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:80:1: ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:80:1: ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:80:2: ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )*
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:80:2: ( (lv_argumentmodels_0_0= ruleArgumentModels ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:81:1: (lv_argumentmodels_0_0= ruleArgumentModels )
            	    {
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:81:1: (lv_argumentmodels_0_0= ruleArgumentModels )
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:82:3: lv_argumentmodels_0_0= ruleArgumentModels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlansAccess().getArgumentmodelsArgumentModelsParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgumentModels_in_rulePlans131);
            	    lv_argumentmodels_0_0=ruleArgumentModels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlansRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"argumentmodels",
            	            		lv_argumentmodels_0_0, 
            	            		"ArgumentModels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:98:3: ( (lv_plans_1_0= rulePlan ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:99:1: (lv_plans_1_0= rulePlan )
            	    {
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:99:1: (lv_plans_1_0= rulePlan )
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:100:3: lv_plans_1_0= rulePlan
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlan_in_rulePlans153);
            	    lv_plans_1_0=rulePlan();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlansRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_1_0, 
            	            		"Plan");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "rulePlans"


    // $ANTLR start "entryRuleArgumentModels"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:124:1: entryRuleArgumentModels returns [EObject current=null] : iv_ruleArgumentModels= ruleArgumentModels EOF ;
    public final EObject entryRuleArgumentModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentModels = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:125:2: (iv_ruleArgumentModels= ruleArgumentModels EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:126:2: iv_ruleArgumentModels= ruleArgumentModels EOF
            {
             newCompositeNode(grammarAccess.getArgumentModelsRule()); 
            pushFollow(FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels190);
            iv_ruleArgumentModels=ruleArgumentModels();

            state._fsp--;

             current =iv_ruleArgumentModels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentModels200); 

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
    // $ANTLR end "entryRuleArgumentModels"


    // $ANTLR start "ruleArgumentModels"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:133:1: ruleArgumentModels returns [EObject current=null] : (otherlv_0= 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgumentModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:136:28: ( (otherlv_0= 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:137:1: (otherlv_0= 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:137:1: (otherlv_0= 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:137:3: otherlv_0= 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleArgumentModels237); 

                	newLeafNode(otherlv_0, grammarAccess.getArgumentModelsAccess().getArgumentmodelKeyword_0());
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:141:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:142:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:142:1: (lv_importURI_1_0= RULE_STRING )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:143:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgumentModels254); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentModelsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleArgumentModels"


    // $ANTLR start "entryRuleAllocation"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:167:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:168:2: (iv_ruleAllocation= ruleAllocation EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:169:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_ruleAllocation_in_entryRuleAllocation295);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllocation305); 

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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:176:1: ruleAllocation returns [EObject current=null] : ( () (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )? (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cost_2_0=null;
        Token otherlv_3=null;
        Token lv_duration_4_0=null;
        Token otherlv_5=null;
        Token lv_team_6_0=null;
        Token otherlv_7=null;
        Token lv_facility_8_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:179:28: ( ( () (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )? (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:180:1: ( () (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )? (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:180:1: ( () (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )? (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:180:2: () (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )? (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )?
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:180:2: ()
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAllocationAccess().getAllocationAction_0(),
                        current);
                

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:186:2: (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:186:4: otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAllocation352); 

                        	newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getCostKeyword_1_0());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:190:1: ( (lv_cost_2_0= RULE_INT ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:191:1: (lv_cost_2_0= RULE_INT )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:191:1: (lv_cost_2_0= RULE_INT )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:192:3: lv_cost_2_0= RULE_INT
                    {
                    lv_cost_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllocation369); 

                    			newLeafNode(lv_cost_2_0, grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllocationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cost",
                            		lv_cost_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:208:4: (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:208:6: otherlv_3= 'duration' ( (lv_duration_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAllocation389); 

                        	newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getDurationKeyword_2_0());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:212:1: ( (lv_duration_4_0= RULE_INT ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:213:1: (lv_duration_4_0= RULE_INT )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:213:1: (lv_duration_4_0= RULE_INT )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:214:3: lv_duration_4_0= RULE_INT
                    {
                    lv_duration_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllocation406); 

                    			newLeafNode(lv_duration_4_0, grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllocationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:230:4: (otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:230:6: otherlv_5= 'team' ( (lv_team_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAllocation426); 

                        	newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getTeamKeyword_3_0());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:234:1: ( (lv_team_6_0= RULE_STRING ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:235:1: (lv_team_6_0= RULE_STRING )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:235:1: (lv_team_6_0= RULE_STRING )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:236:3: lv_team_6_0= RULE_STRING
                    {
                    lv_team_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllocation443); 

                    			newLeafNode(lv_team_6_0, grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllocationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"team",
                            		lv_team_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:252:4: (otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:252:6: otherlv_7= 'facility' ( (lv_facility_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleAllocation463); 

                        	newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getFacilityKeyword_4_0());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:256:1: ( (lv_facility_8_0= RULE_STRING ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:257:1: (lv_facility_8_0= RULE_STRING )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:257:1: (lv_facility_8_0= RULE_STRING )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:258:3: lv_facility_8_0= RULE_STRING
                    {
                    lv_facility_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllocation480); 

                    			newLeafNode(lv_facility_8_0, grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllocationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"facility",
                            		lv_facility_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRulePlan"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:282:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:283:2: (iv_rulePlan= rulePlan EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:284:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan523);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan533); 

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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:291:1: rulePlan returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'element' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )? (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )? ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_estimated_6_0 = null;

        EObject lv_actual_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:294:28: ( (otherlv_0= 'plan' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'element' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )? (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )? ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:295:1: (otherlv_0= 'plan' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'element' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )? (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )? )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:295:1: (otherlv_0= 'plan' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'element' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )? (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )? )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:295:3: otherlv_0= 'plan' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'element' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )? (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePlan570); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:299:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:300:1: (lv_id_1_0= RULE_STRING )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:300:1: (lv_id_1_0= RULE_STRING )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:301:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlan587); 

            			newLeafNode(lv_id_1_0, grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePlan604); 

                	newLeafNode(otherlv_2, grammarAccess.getPlanAccess().getElementKeyword_2());
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:321:1: ( (otherlv_3= RULE_ID ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:322:1: (otherlv_3= RULE_ID )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:322:1: (otherlv_3= RULE_ID )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:323:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan624); 

            		newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0()); 
            	

            }


            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:334:2: (otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:334:4: otherlv_4= 'estimated' otherlv_5= '(' ( (lv_estimated_6_0= ruleAllocation ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePlan637); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlanAccess().getEstimatedKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePlan649); 

                        	newLeafNode(otherlv_5, grammarAccess.getPlanAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:342:1: ( (lv_estimated_6_0= ruleAllocation ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:343:1: (lv_estimated_6_0= ruleAllocation )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:343:1: (lv_estimated_6_0= ruleAllocation )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:344:3: lv_estimated_6_0= ruleAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlanAccess().getEstimatedAllocationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAllocation_in_rulePlan670);
                    lv_estimated_6_0=ruleAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"estimated",
                            		lv_estimated_6_0, 
                            		"Allocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_rulePlan682); 

                        	newLeafNode(otherlv_7, grammarAccess.getPlanAccess().getRightParenthesisKeyword_4_3());
                        

                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:364:3: (otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:364:5: otherlv_8= 'actual' otherlv_9= '(' ( (lv_actual_10_0= ruleAllocation ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_rulePlan697); 

                        	newLeafNode(otherlv_8, grammarAccess.getPlanAccess().getActualKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_rulePlan709); 

                        	newLeafNode(otherlv_9, grammarAccess.getPlanAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:372:1: ( (lv_actual_10_0= ruleAllocation ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:373:1: (lv_actual_10_0= ruleAllocation )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:373:1: (lv_actual_10_0= ruleAllocation )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:374:3: lv_actual_10_0= ruleAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlanAccess().getActualAllocationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAllocation_in_rulePlan730);
                    lv_actual_10_0=ruleAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"actual",
                            		lv_actual_10_0, 
                            		"Allocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_rulePlan742); 

                        	newLeafNode(otherlv_11, grammarAccess.getPlanAccess().getRightParenthesisKeyword_5_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "rulePlan"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_rulePlans131 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_rulePlan_in_rulePlans153 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentModels200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentModels237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgumentModels254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllocation_in_entryRuleAllocation295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllocation305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAllocation352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllocation369 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_13_in_ruleAllocation389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllocation406 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleAllocation426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllocation443 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAllocation463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllocation480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePlan570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlan587 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlan604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan624 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_rulePlan637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlan649 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_ruleAllocation_in_rulePlan670 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlan682 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePlan697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlan709 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_ruleAllocation_in_rulePlan730 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlan742 = new BitSet(new long[]{0x0000000000000002L});

}