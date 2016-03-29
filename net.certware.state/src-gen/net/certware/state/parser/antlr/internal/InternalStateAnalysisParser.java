package net.certware.state.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.state.services.StateAnalysisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateAnalysisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'subsystems'", "'{'", "'}'", "'Subsystem'", "'sets'", "'DeploymentSet'", "'deployments'", "'QosPolicy'", "'policy'", "'DataProduct'", "'content'", "'DataCollection'", "'policies'", "'products'", "'Deployment'", "'components'", "'catalogs '", "'Component'", "'variables'", "'controllers'", "'estimators'", "'adapters'", "'TIMELINE'", "'DERIVED'", "'GRAPH'", "'StateVariable'", "'type'", "'in'", "'out'", "'updates'", "'influenced'", "'Controller'", "'delegates'", "'constraints'", "'commands'", "'Estimator'", "'distills'", "'measurement'", "'Constraint'", "'StateUpdate'", "'HardwareCommand'", "'HardwareMeasurement'", "'DeviceCommand'", "'DeviceMeasurement'", "'HardwareAdapter'", "'hardwareCommands'", "'hardwareMeasurements'", "'deviceCommands'", "'deviceMeasurements'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalStateAnalysisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateAnalysisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateAnalysisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateAnalysis.g"; }



     	private StateAnalysisGrammarAccess grammarAccess;
     	
        public InternalStateAnalysisParser(TokenStream input, StateAnalysisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "System";	
       	}
       	
       	@Override
       	protected StateAnalysisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSystem"
    // InternalStateAnalysis.g:67:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalStateAnalysis.g:68:2: (iv_ruleSystem= ruleSystem EOF )
            // InternalStateAnalysis.g:69:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStateAnalysis.g:76:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'subsystems' otherlv_4= '{' ( (lv_subsystems_5_0= ruleSubsystem ) )* otherlv_6= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_subsystems_5_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:79:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'subsystems' otherlv_4= '{' ( (lv_subsystems_5_0= ruleSubsystem ) )* otherlv_6= '}' ) )
            // InternalStateAnalysis.g:80:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'subsystems' otherlv_4= '{' ( (lv_subsystems_5_0= ruleSubsystem ) )* otherlv_6= '}' )
            {
            // InternalStateAnalysis.g:80:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'subsystems' otherlv_4= '{' ( (lv_subsystems_5_0= ruleSubsystem ) )* otherlv_6= '}' )
            // InternalStateAnalysis.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'subsystems' otherlv_4= '{' ( (lv_subsystems_5_0= ruleSubsystem ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // InternalStateAnalysis.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:102:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:103:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:103:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:104:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(lv_description_2_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getSubsystemsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_7); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:128:1: ( (lv_subsystems_5_0= ruleSubsystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateAnalysis.g:129:1: (lv_subsystems_5_0= ruleSubsystem )
            	    {
            	    // InternalStateAnalysis.g:129:1: (lv_subsystems_5_0= ruleSubsystem )
            	    // InternalStateAnalysis.g:130:3: lv_subsystems_5_0= ruleSubsystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getSubsystemsSubsystemParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_subsystems_5_0=ruleSubsystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subsystems",
            	            		lv_subsystems_5_0, 
            	            		"net.certware.state.StateAnalysis.Subsystem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSubsystem"
    // InternalStateAnalysis.g:158:1: entryRuleSubsystem returns [EObject current=null] : iv_ruleSubsystem= ruleSubsystem EOF ;
    public final EObject entryRuleSubsystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsystem = null;


        try {
            // InternalStateAnalysis.g:159:2: (iv_ruleSubsystem= ruleSubsystem EOF )
            // InternalStateAnalysis.g:160:2: iv_ruleSubsystem= ruleSubsystem EOF
            {
             newCompositeNode(grammarAccess.getSubsystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsystem=ruleSubsystem();

            state._fsp--;

             current =iv_ruleSubsystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubsystem"


    // $ANTLR start "ruleSubsystem"
    // InternalStateAnalysis.g:167:1: ruleSubsystem returns [EObject current=null] : (otherlv_0= 'Subsystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'sets' otherlv_4= '{' ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )* otherlv_6= '}' ) ;
    public final EObject ruleSubsystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_deploymentSets_5_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:170:28: ( (otherlv_0= 'Subsystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'sets' otherlv_4= '{' ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )* otherlv_6= '}' ) )
            // InternalStateAnalysis.g:171:1: (otherlv_0= 'Subsystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'sets' otherlv_4= '{' ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )* otherlv_6= '}' )
            {
            // InternalStateAnalysis.g:171:1: (otherlv_0= 'Subsystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'sets' otherlv_4= '{' ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )* otherlv_6= '}' )
            // InternalStateAnalysis.g:171:3: otherlv_0= 'Subsystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'sets' otherlv_4= '{' ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsystemAccess().getSubsystemKeyword_0());
                
            // InternalStateAnalysis.g:175:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:176:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:176:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubsystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:193:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:194:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:194:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:195:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			newLeafNode(lv_description_2_0, grammarAccess.getSubsystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubsystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getSubsystemAccess().getSetsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

                	newLeafNode(otherlv_4, grammarAccess.getSubsystemAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:219:1: ( (lv_deploymentSets_5_0= ruleDeploymentSet ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateAnalysis.g:220:1: (lv_deploymentSets_5_0= ruleDeploymentSet )
            	    {
            	    // InternalStateAnalysis.g:220:1: (lv_deploymentSets_5_0= ruleDeploymentSet )
            	    // InternalStateAnalysis.g:221:3: lv_deploymentSets_5_0= ruleDeploymentSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsystemAccess().getDeploymentSetsDeploymentSetParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_9);
            	    lv_deploymentSets_5_0=ruleDeploymentSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deploymentSets",
            	            		lv_deploymentSets_5_0, 
            	            		"net.certware.state.StateAnalysis.DeploymentSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getSubsystemAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSubsystem"


    // $ANTLR start "entryRuleDeploymentSet"
    // InternalStateAnalysis.g:249:1: entryRuleDeploymentSet returns [EObject current=null] : iv_ruleDeploymentSet= ruleDeploymentSet EOF ;
    public final EObject entryRuleDeploymentSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentSet = null;


        try {
            // InternalStateAnalysis.g:250:2: (iv_ruleDeploymentSet= ruleDeploymentSet EOF )
            // InternalStateAnalysis.g:251:2: iv_ruleDeploymentSet= ruleDeploymentSet EOF
            {
             newCompositeNode(grammarAccess.getDeploymentSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentSet=ruleDeploymentSet();

            state._fsp--;

             current =iv_ruleDeploymentSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeploymentSet"


    // $ANTLR start "ruleDeploymentSet"
    // InternalStateAnalysis.g:258:1: ruleDeploymentSet returns [EObject current=null] : (otherlv_0= 'DeploymentSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'deployments' otherlv_4= '{' ( (lv_deployments_5_0= ruleDeployment ) )* otherlv_6= '}' ) ;
    public final EObject ruleDeploymentSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_deployments_5_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:261:28: ( (otherlv_0= 'DeploymentSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'deployments' otherlv_4= '{' ( (lv_deployments_5_0= ruleDeployment ) )* otherlv_6= '}' ) )
            // InternalStateAnalysis.g:262:1: (otherlv_0= 'DeploymentSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'deployments' otherlv_4= '{' ( (lv_deployments_5_0= ruleDeployment ) )* otherlv_6= '}' )
            {
            // InternalStateAnalysis.g:262:1: (otherlv_0= 'DeploymentSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'deployments' otherlv_4= '{' ( (lv_deployments_5_0= ruleDeployment ) )* otherlv_6= '}' )
            // InternalStateAnalysis.g:262:3: otherlv_0= 'DeploymentSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'deployments' otherlv_4= '{' ( (lv_deployments_5_0= ruleDeployment ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentSetAccess().getDeploymentSetKeyword_0());
                
            // InternalStateAnalysis.g:266:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:267:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:267:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:268:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeploymentSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:284:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:285:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:285:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:286:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDeploymentSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getDeploymentSetAccess().getDeploymentsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_11); 

                	newLeafNode(otherlv_4, grammarAccess.getDeploymentSetAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:310:1: ( (lv_deployments_5_0= ruleDeployment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateAnalysis.g:311:1: (lv_deployments_5_0= ruleDeployment )
            	    {
            	    // InternalStateAnalysis.g:311:1: (lv_deployments_5_0= ruleDeployment )
            	    // InternalStateAnalysis.g:312:3: lv_deployments_5_0= ruleDeployment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentSetAccess().getDeploymentsDeploymentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_deployments_5_0=ruleDeployment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeploymentSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deployments",
            	            		lv_deployments_5_0, 
            	            		"net.certware.state.StateAnalysis.Deployment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getDeploymentSetAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDeploymentSet"


    // $ANTLR start "entryRuleQosPolicy"
    // InternalStateAnalysis.g:340:1: entryRuleQosPolicy returns [EObject current=null] : iv_ruleQosPolicy= ruleQosPolicy EOF ;
    public final EObject entryRuleQosPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQosPolicy = null;


        try {
            // InternalStateAnalysis.g:341:2: (iv_ruleQosPolicy= ruleQosPolicy EOF )
            // InternalStateAnalysis.g:342:2: iv_ruleQosPolicy= ruleQosPolicy EOF
            {
             newCompositeNode(grammarAccess.getQosPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQosPolicy=ruleQosPolicy();

            state._fsp--;

             current =iv_ruleQosPolicy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQosPolicy"


    // $ANTLR start "ruleQosPolicy"
    // InternalStateAnalysis.g:349:1: ruleQosPolicy returns [EObject current=null] : (otherlv_0= 'QosPolicy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policy' ( (lv_policy_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleQosPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_policy_4_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:352:28: ( (otherlv_0= 'QosPolicy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policy' ( (lv_policy_4_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:353:1: (otherlv_0= 'QosPolicy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policy' ( (lv_policy_4_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:353:1: (otherlv_0= 'QosPolicy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policy' ( (lv_policy_4_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:353:3: otherlv_0= 'QosPolicy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policy' ( (lv_policy_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getQosPolicyAccess().getQosPolicyKeyword_0());
                
            // InternalStateAnalysis.g:357:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:358:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:358:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:359:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQosPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQosPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:375:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:376:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:376:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:377:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            			newLeafNode(lv_description_2_0, grammarAccess.getQosPolicyAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQosPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getQosPolicyAccess().getPolicyKeyword_3());
                
            // InternalStateAnalysis.g:397:1: ( (lv_policy_4_0= RULE_STRING ) )
            // InternalStateAnalysis.g:398:1: (lv_policy_4_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:398:1: (lv_policy_4_0= RULE_STRING )
            // InternalStateAnalysis.g:399:3: lv_policy_4_0= RULE_STRING
            {
            lv_policy_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_policy_4_0, grammarAccess.getQosPolicyAccess().getPolicySTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQosPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"policy",
                    		lv_policy_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleQosPolicy"


    // $ANTLR start "entryRuleDataProduct"
    // InternalStateAnalysis.g:423:1: entryRuleDataProduct returns [EObject current=null] : iv_ruleDataProduct= ruleDataProduct EOF ;
    public final EObject entryRuleDataProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProduct = null;


        try {
            // InternalStateAnalysis.g:424:2: (iv_ruleDataProduct= ruleDataProduct EOF )
            // InternalStateAnalysis.g:425:2: iv_ruleDataProduct= ruleDataProduct EOF
            {
             newCompositeNode(grammarAccess.getDataProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProduct=ruleDataProduct();

            state._fsp--;

             current =iv_ruleDataProduct; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataProduct"


    // $ANTLR start "ruleDataProduct"
    // InternalStateAnalysis.g:432:1: ruleDataProduct returns [EObject current=null] : (otherlv_0= 'DataProduct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:435:28: ( (otherlv_0= 'DataProduct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:436:1: (otherlv_0= 'DataProduct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:436:1: (otherlv_0= 'DataProduct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:436:3: otherlv_0= 'DataProduct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDataProductAccess().getDataProductKeyword_0());
                
            // InternalStateAnalysis.g:440:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:441:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:441:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:442:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataProductAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:458:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:459:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:459:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:460:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDataProductAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getDataProductAccess().getContentKeyword_3());
                
            // InternalStateAnalysis.g:480:1: ( (lv_content_4_0= RULE_STRING ) )
            // InternalStateAnalysis.g:481:1: (lv_content_4_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:481:1: (lv_content_4_0= RULE_STRING )
            // InternalStateAnalysis.g:482:3: lv_content_4_0= RULE_STRING
            {
            lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_content_4_0, grammarAccess.getDataProductAccess().getContentSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleDataProduct"


    // $ANTLR start "entryRuleDataCollection"
    // InternalStateAnalysis.g:506:1: entryRuleDataCollection returns [EObject current=null] : iv_ruleDataCollection= ruleDataCollection EOF ;
    public final EObject entryRuleDataCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataCollection = null;


        try {
            // InternalStateAnalysis.g:507:2: (iv_ruleDataCollection= ruleDataCollection EOF )
            // InternalStateAnalysis.g:508:2: iv_ruleDataCollection= ruleDataCollection EOF
            {
             newCompositeNode(grammarAccess.getDataCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataCollection=ruleDataCollection();

            state._fsp--;

             current =iv_ruleDataCollection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataCollection"


    // $ANTLR start "ruleDataCollection"
    // InternalStateAnalysis.g:515:1: ruleDataCollection returns [EObject current=null] : (otherlv_0= 'DataCollection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policies' otherlv_4= '{' ( (lv_policies_5_0= ruleQosPolicy ) )* otherlv_6= '}' otherlv_7= 'products' otherlv_8= '{' ( (lv_products_9_0= ruleDataProduct ) )* otherlv_10= '}' ) ;
    public final EObject ruleDataCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_policies_5_0 = null;

        EObject lv_products_9_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:518:28: ( (otherlv_0= 'DataCollection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policies' otherlv_4= '{' ( (lv_policies_5_0= ruleQosPolicy ) )* otherlv_6= '}' otherlv_7= 'products' otherlv_8= '{' ( (lv_products_9_0= ruleDataProduct ) )* otherlv_10= '}' ) )
            // InternalStateAnalysis.g:519:1: (otherlv_0= 'DataCollection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policies' otherlv_4= '{' ( (lv_policies_5_0= ruleQosPolicy ) )* otherlv_6= '}' otherlv_7= 'products' otherlv_8= '{' ( (lv_products_9_0= ruleDataProduct ) )* otherlv_10= '}' )
            {
            // InternalStateAnalysis.g:519:1: (otherlv_0= 'DataCollection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policies' otherlv_4= '{' ( (lv_policies_5_0= ruleQosPolicy ) )* otherlv_6= '}' otherlv_7= 'products' otherlv_8= '{' ( (lv_products_9_0= ruleDataProduct ) )* otherlv_10= '}' )
            // InternalStateAnalysis.g:519:3: otherlv_0= 'DataCollection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'policies' otherlv_4= '{' ( (lv_policies_5_0= ruleQosPolicy ) )* otherlv_6= '}' otherlv_7= 'products' otherlv_8= '{' ( (lv_products_9_0= ruleDataProduct ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDataCollectionAccess().getDataCollectionKeyword_0());
                
            // InternalStateAnalysis.g:523:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:524:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:524:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:525:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataCollectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:541:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:542:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:542:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:543:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDataCollectionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getDataCollectionAccess().getPoliciesKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_15); 

                	newLeafNode(otherlv_4, grammarAccess.getDataCollectionAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:567:1: ( (lv_policies_5_0= ruleQosPolicy ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateAnalysis.g:568:1: (lv_policies_5_0= ruleQosPolicy )
            	    {
            	    // InternalStateAnalysis.g:568:1: (lv_policies_5_0= ruleQosPolicy )
            	    // InternalStateAnalysis.g:569:3: lv_policies_5_0= ruleQosPolicy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataCollectionAccess().getPoliciesQosPolicyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_policies_5_0=ruleQosPolicy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataCollectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"policies",
            	            		lv_policies_5_0, 
            	            		"net.certware.state.StateAnalysis.QosPolicy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_16); 

                	newLeafNode(otherlv_6, grammarAccess.getDataCollectionAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,25,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getDataCollectionAccess().getProductsKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_17); 

                	newLeafNode(otherlv_8, grammarAccess.getDataCollectionAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:597:1: ( (lv_products_9_0= ruleDataProduct ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStateAnalysis.g:598:1: (lv_products_9_0= ruleDataProduct )
            	    {
            	    // InternalStateAnalysis.g:598:1: (lv_products_9_0= ruleDataProduct )
            	    // InternalStateAnalysis.g:599:3: lv_products_9_0= ruleDataProduct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataCollectionAccess().getProductsDataProductParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_products_9_0=ruleDataProduct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataCollectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"products",
            	            		lv_products_9_0, 
            	            		"net.certware.state.StateAnalysis.DataProduct");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getDataCollectionAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleDataCollection"


    // $ANTLR start "entryRuleDeployment"
    // InternalStateAnalysis.g:627:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalStateAnalysis.g:628:2: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalStateAnalysis.g:629:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalStateAnalysis.g:636:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'Deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) )* otherlv_6= '}' otherlv_7= 'catalogs ' otherlv_8= '{' ( (lv_catalogs_9_0= ruleDataCollection ) )* otherlv_10= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_components_5_0 = null;

        EObject lv_catalogs_9_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:639:28: ( (otherlv_0= 'Deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) )* otherlv_6= '}' otherlv_7= 'catalogs ' otherlv_8= '{' ( (lv_catalogs_9_0= ruleDataCollection ) )* otherlv_10= '}' ) )
            // InternalStateAnalysis.g:640:1: (otherlv_0= 'Deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) )* otherlv_6= '}' otherlv_7= 'catalogs ' otherlv_8= '{' ( (lv_catalogs_9_0= ruleDataCollection ) )* otherlv_10= '}' )
            {
            // InternalStateAnalysis.g:640:1: (otherlv_0= 'Deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) )* otherlv_6= '}' otherlv_7= 'catalogs ' otherlv_8= '{' ( (lv_catalogs_9_0= ruleDataCollection ) )* otherlv_10= '}' )
            // InternalStateAnalysis.g:640:3: otherlv_0= 'Deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) )* otherlv_6= '}' otherlv_7= 'catalogs ' otherlv_8= '{' ( (lv_catalogs_9_0= ruleDataCollection ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
                
            // InternalStateAnalysis.g:644:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:645:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:645:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:646:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeploymentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:662:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:663:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:663:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:664:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDeploymentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getComponentsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_19); 

                	newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:688:1: ( (lv_components_5_0= ruleComponent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateAnalysis.g:689:1: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalStateAnalysis.g:689:1: (lv_components_5_0= ruleComponent )
            	    // InternalStateAnalysis.g:690:3: lv_components_5_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentAccess().getComponentsComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_5_0, 
            	            		"net.certware.state.StateAnalysis.Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_20); 

                	newLeafNode(otherlv_6, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,28,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getCatalogsKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_21); 

                	newLeafNode(otherlv_8, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:718:1: ( (lv_catalogs_9_0= ruleDataCollection ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateAnalysis.g:719:1: (lv_catalogs_9_0= ruleDataCollection )
            	    {
            	    // InternalStateAnalysis.g:719:1: (lv_catalogs_9_0= ruleDataCollection )
            	    // InternalStateAnalysis.g:720:3: lv_catalogs_9_0= ruleDataCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentAccess().getCatalogsDataCollectionParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_catalogs_9_0=ruleDataCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"catalogs",
            	            		lv_catalogs_9_0, 
            	            		"net.certware.state.StateAnalysis.DataCollection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleComponent"
    // InternalStateAnalysis.g:748:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalStateAnalysis.g:749:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalStateAnalysis.g:750:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStateAnalysis.g:757:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'variables' otherlv_4= '{' ( (lv_stateVariables_5_0= ruleStateVariable ) )+ otherlv_6= '}' otherlv_7= 'controllers' otherlv_8= '{' ( (lv_controllers_9_0= ruleController ) )+ otherlv_10= '}' otherlv_11= 'estimators' otherlv_12= '{' ( (lv_estimators_13_0= ruleEstimator ) )+ otherlv_14= '}' otherlv_15= 'adapters' otherlv_16= '{' ( (lv_adapters_17_0= ruleHardwareAdapter ) )+ otherlv_18= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_stateVariables_5_0 = null;

        EObject lv_controllers_9_0 = null;

        EObject lv_estimators_13_0 = null;

        EObject lv_adapters_17_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:760:28: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'variables' otherlv_4= '{' ( (lv_stateVariables_5_0= ruleStateVariable ) )+ otherlv_6= '}' otherlv_7= 'controllers' otherlv_8= '{' ( (lv_controllers_9_0= ruleController ) )+ otherlv_10= '}' otherlv_11= 'estimators' otherlv_12= '{' ( (lv_estimators_13_0= ruleEstimator ) )+ otherlv_14= '}' otherlv_15= 'adapters' otherlv_16= '{' ( (lv_adapters_17_0= ruleHardwareAdapter ) )+ otherlv_18= '}' ) )
            // InternalStateAnalysis.g:761:1: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'variables' otherlv_4= '{' ( (lv_stateVariables_5_0= ruleStateVariable ) )+ otherlv_6= '}' otherlv_7= 'controllers' otherlv_8= '{' ( (lv_controllers_9_0= ruleController ) )+ otherlv_10= '}' otherlv_11= 'estimators' otherlv_12= '{' ( (lv_estimators_13_0= ruleEstimator ) )+ otherlv_14= '}' otherlv_15= 'adapters' otherlv_16= '{' ( (lv_adapters_17_0= ruleHardwareAdapter ) )+ otherlv_18= '}' )
            {
            // InternalStateAnalysis.g:761:1: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'variables' otherlv_4= '{' ( (lv_stateVariables_5_0= ruleStateVariable ) )+ otherlv_6= '}' otherlv_7= 'controllers' otherlv_8= '{' ( (lv_controllers_9_0= ruleController ) )+ otherlv_10= '}' otherlv_11= 'estimators' otherlv_12= '{' ( (lv_estimators_13_0= ruleEstimator ) )+ otherlv_14= '}' otherlv_15= 'adapters' otherlv_16= '{' ( (lv_adapters_17_0= ruleHardwareAdapter ) )+ otherlv_18= '}' )
            // InternalStateAnalysis.g:761:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'variables' otherlv_4= '{' ( (lv_stateVariables_5_0= ruleStateVariable ) )+ otherlv_6= '}' otherlv_7= 'controllers' otherlv_8= '{' ( (lv_controllers_9_0= ruleController ) )+ otherlv_10= '}' otherlv_11= 'estimators' otherlv_12= '{' ( (lv_estimators_13_0= ruleEstimator ) )+ otherlv_14= '}' otherlv_15= 'adapters' otherlv_16= '{' ( (lv_adapters_17_0= ruleHardwareAdapter ) )+ otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // InternalStateAnalysis.g:765:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:766:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:766:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:767:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:783:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:784:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:784:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:785:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            			newLeafNode(lv_description_2_0, grammarAccess.getComponentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getVariablesKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_23); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:809:1: ( (lv_stateVariables_5_0= ruleStateVariable ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStateAnalysis.g:810:1: (lv_stateVariables_5_0= ruleStateVariable )
            	    {
            	    // InternalStateAnalysis.g:810:1: (lv_stateVariables_5_0= ruleStateVariable )
            	    // InternalStateAnalysis.g:811:3: lv_stateVariables_5_0= ruleStateVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getStateVariablesStateVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_stateVariables_5_0=ruleStateVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateVariables",
            	            		lv_stateVariables_5_0, 
            	            		"net.certware.state.StateAnalysis.StateVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_25); 

                	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,31,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getControllersKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_26); 

                	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:839:1: ( (lv_controllers_9_0= ruleController ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStateAnalysis.g:840:1: (lv_controllers_9_0= ruleController )
            	    {
            	    // InternalStateAnalysis.g:840:1: (lv_controllers_9_0= ruleController )
            	    // InternalStateAnalysis.g:841:3: lv_controllers_9_0= ruleController
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getControllersControllerParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_27);
            	    lv_controllers_9_0=ruleController();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controllers",
            	            		lv_controllers_9_0, 
            	            		"net.certware.state.StateAnalysis.Controller");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_28); 

                	newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,32,FOLLOW_6); 

                	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getEstimatorsKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_29); 

                	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_12());
                
            // InternalStateAnalysis.g:869:1: ( (lv_estimators_13_0= ruleEstimator ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==47) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStateAnalysis.g:870:1: (lv_estimators_13_0= ruleEstimator )
            	    {
            	    // InternalStateAnalysis.g:870:1: (lv_estimators_13_0= ruleEstimator )
            	    // InternalStateAnalysis.g:871:3: lv_estimators_13_0= ruleEstimator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getEstimatorsEstimatorParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_30);
            	    lv_estimators_13_0=ruleEstimator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"estimators",
            	            		lv_estimators_13_0, 
            	            		"net.certware.state.StateAnalysis.Estimator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_31); 

                	newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,33,FOLLOW_6); 

                	newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getAdaptersKeyword_15());
                
            otherlv_16=(Token)match(input,13,FOLLOW_32); 

                	newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_16());
                
            // InternalStateAnalysis.g:899:1: ( (lv_adapters_17_0= ruleHardwareAdapter ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==56) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateAnalysis.g:900:1: (lv_adapters_17_0= ruleHardwareAdapter )
            	    {
            	    // InternalStateAnalysis.g:900:1: (lv_adapters_17_0= ruleHardwareAdapter )
            	    // InternalStateAnalysis.g:901:3: lv_adapters_17_0= ruleHardwareAdapter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getAdaptersHardwareAdapterParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_33);
            	    lv_adapters_17_0=ruleHardwareAdapter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"adapters",
            	            		lv_adapters_17_0, 
            	            		"net.certware.state.StateAnalysis.HardwareAdapter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_18());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleStateRepresentationType"
    // InternalStateAnalysis.g:929:1: entryRuleStateRepresentationType returns [String current=null] : iv_ruleStateRepresentationType= ruleStateRepresentationType EOF ;
    public final String entryRuleStateRepresentationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStateRepresentationType = null;


        try {
            // InternalStateAnalysis.g:930:2: (iv_ruleStateRepresentationType= ruleStateRepresentationType EOF )
            // InternalStateAnalysis.g:931:2: iv_ruleStateRepresentationType= ruleStateRepresentationType EOF
            {
             newCompositeNode(grammarAccess.getStateRepresentationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateRepresentationType=ruleStateRepresentationType();

            state._fsp--;

             current =iv_ruleStateRepresentationType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateRepresentationType"


    // $ANTLR start "ruleStateRepresentationType"
    // InternalStateAnalysis.g:938:1: ruleStateRepresentationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TIMELINE' | kw= 'DERIVED' | kw= 'GRAPH' ) ;
    public final AntlrDatatypeRuleToken ruleStateRepresentationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:941:28: ( (kw= 'TIMELINE' | kw= 'DERIVED' | kw= 'GRAPH' ) )
            // InternalStateAnalysis.g:942:1: (kw= 'TIMELINE' | kw= 'DERIVED' | kw= 'GRAPH' )
            {
            // InternalStateAnalysis.g:942:1: (kw= 'TIMELINE' | kw= 'DERIVED' | kw= 'GRAPH' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalStateAnalysis.g:943:2: kw= 'TIMELINE'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStateRepresentationTypeAccess().getTIMELINEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalStateAnalysis.g:950:2: kw= 'DERIVED'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStateRepresentationTypeAccess().getDERIVEDKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalStateAnalysis.g:957:2: kw= 'GRAPH'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStateRepresentationTypeAccess().getGRAPHKeyword_2()); 
                        

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
    // $ANTLR end "ruleStateRepresentationType"


    // $ANTLR start "entryRuleStateVariable"
    // InternalStateAnalysis.g:970:1: entryRuleStateVariable returns [EObject current=null] : iv_ruleStateVariable= ruleStateVariable EOF ;
    public final EObject entryRuleStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariable = null;


        try {
            // InternalStateAnalysis.g:971:2: (iv_ruleStateVariable= ruleStateVariable EOF )
            // InternalStateAnalysis.g:972:2: iv_ruleStateVariable= ruleStateVariable EOF
            {
             newCompositeNode(grammarAccess.getStateVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateVariable=ruleStateVariable();

            state._fsp--;

             current =iv_ruleStateVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateVariable"


    // $ANTLR start "ruleStateVariable"
    // InternalStateAnalysis.g:979:1: ruleStateVariable returns [EObject current=null] : (otherlv_0= 'StateVariable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_representationType_4_0= ruleStateRepresentationType ) ) otherlv_5= 'in' otherlv_6= '{' ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )* otherlv_8= '}' otherlv_9= 'out' otherlv_10= '{' ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )* otherlv_12= '}' otherlv_13= 'updates' otherlv_14= '{' ( (lv_stateUpdates_15_0= ruleStateUpdate ) )* otherlv_16= '}' otherlv_17= 'influenced' otherlv_18= '{' ( (lv_influencedBy_19_0= ruleStateVariable ) )* otherlv_20= '}' ) ;
    public final EObject ruleStateVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_representationType_4_0 = null;

        EObject lv_inStateConstraints_7_0 = null;

        EObject lv_outStateConstraints_11_0 = null;

        EObject lv_stateUpdates_15_0 = null;

        EObject lv_influencedBy_19_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:982:28: ( (otherlv_0= 'StateVariable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_representationType_4_0= ruleStateRepresentationType ) ) otherlv_5= 'in' otherlv_6= '{' ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )* otherlv_8= '}' otherlv_9= 'out' otherlv_10= '{' ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )* otherlv_12= '}' otherlv_13= 'updates' otherlv_14= '{' ( (lv_stateUpdates_15_0= ruleStateUpdate ) )* otherlv_16= '}' otherlv_17= 'influenced' otherlv_18= '{' ( (lv_influencedBy_19_0= ruleStateVariable ) )* otherlv_20= '}' ) )
            // InternalStateAnalysis.g:983:1: (otherlv_0= 'StateVariable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_representationType_4_0= ruleStateRepresentationType ) ) otherlv_5= 'in' otherlv_6= '{' ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )* otherlv_8= '}' otherlv_9= 'out' otherlv_10= '{' ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )* otherlv_12= '}' otherlv_13= 'updates' otherlv_14= '{' ( (lv_stateUpdates_15_0= ruleStateUpdate ) )* otherlv_16= '}' otherlv_17= 'influenced' otherlv_18= '{' ( (lv_influencedBy_19_0= ruleStateVariable ) )* otherlv_20= '}' )
            {
            // InternalStateAnalysis.g:983:1: (otherlv_0= 'StateVariable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_representationType_4_0= ruleStateRepresentationType ) ) otherlv_5= 'in' otherlv_6= '{' ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )* otherlv_8= '}' otherlv_9= 'out' otherlv_10= '{' ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )* otherlv_12= '}' otherlv_13= 'updates' otherlv_14= '{' ( (lv_stateUpdates_15_0= ruleStateUpdate ) )* otherlv_16= '}' otherlv_17= 'influenced' otherlv_18= '{' ( (lv_influencedBy_19_0= ruleStateVariable ) )* otherlv_20= '}' )
            // InternalStateAnalysis.g:983:3: otherlv_0= 'StateVariable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_representationType_4_0= ruleStateRepresentationType ) ) otherlv_5= 'in' otherlv_6= '{' ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )* otherlv_8= '}' otherlv_9= 'out' otherlv_10= '{' ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )* otherlv_12= '}' otherlv_13= 'updates' otherlv_14= '{' ( (lv_stateUpdates_15_0= ruleStateUpdate ) )* otherlv_16= '}' otherlv_17= 'influenced' otherlv_18= '{' ( (lv_influencedBy_19_0= ruleStateVariable ) )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateVariableAccess().getStateVariableKeyword_0());
                
            // InternalStateAnalysis.g:987:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:988:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:988:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:989:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1005:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1006:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1006:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1007:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            			newLeafNode(lv_description_2_0, grammarAccess.getStateVariableAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_35); 

                	newLeafNode(otherlv_3, grammarAccess.getStateVariableAccess().getTypeKeyword_3());
                
            // InternalStateAnalysis.g:1027:1: ( (lv_representationType_4_0= ruleStateRepresentationType ) )
            // InternalStateAnalysis.g:1028:1: (lv_representationType_4_0= ruleStateRepresentationType )
            {
            // InternalStateAnalysis.g:1028:1: (lv_representationType_4_0= ruleStateRepresentationType )
            // InternalStateAnalysis.g:1029:3: lv_representationType_4_0= ruleStateRepresentationType
            {
             
            	        newCompositeNode(grammarAccess.getStateVariableAccess().getRepresentationTypeStateRepresentationTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_36);
            lv_representationType_4_0=ruleStateRepresentationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	        }
                   		set(
                   			current, 
                   			"representationType",
                    		lv_representationType_4_0, 
                    		"net.certware.state.StateAnalysis.StateRepresentationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getStateVariableAccess().getInKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_37); 

                	newLeafNode(otherlv_6, grammarAccess.getStateVariableAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalStateAnalysis.g:1053:1: ( (lv_inStateConstraints_7_0= ruleStateConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==50) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStateAnalysis.g:1054:1: (lv_inStateConstraints_7_0= ruleStateConstraint )
            	    {
            	    // InternalStateAnalysis.g:1054:1: (lv_inStateConstraints_7_0= ruleStateConstraint )
            	    // InternalStateAnalysis.g:1055:3: lv_inStateConstraints_7_0= ruleStateConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateVariableAccess().getInStateConstraintsStateConstraintParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_37);
            	    lv_inStateConstraints_7_0=ruleStateConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inStateConstraints",
            	            		lv_inStateConstraints_7_0, 
            	            		"net.certware.state.StateAnalysis.StateConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_38); 

                	newLeafNode(otherlv_8, grammarAccess.getStateVariableAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_9=(Token)match(input,40,FOLLOW_6); 

                	newLeafNode(otherlv_9, grammarAccess.getStateVariableAccess().getOutKeyword_9());
                
            otherlv_10=(Token)match(input,13,FOLLOW_37); 

                	newLeafNode(otherlv_10, grammarAccess.getStateVariableAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalStateAnalysis.g:1083:1: ( (lv_outStateConstraints_11_0= ruleStateConstraint ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStateAnalysis.g:1084:1: (lv_outStateConstraints_11_0= ruleStateConstraint )
            	    {
            	    // InternalStateAnalysis.g:1084:1: (lv_outStateConstraints_11_0= ruleStateConstraint )
            	    // InternalStateAnalysis.g:1085:3: lv_outStateConstraints_11_0= ruleStateConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateVariableAccess().getOutStateConstraintsStateConstraintParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_37);
            	    lv_outStateConstraints_11_0=ruleStateConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outStateConstraints",
            	            		lv_outStateConstraints_11_0, 
            	            		"net.certware.state.StateAnalysis.StateConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_39); 

                	newLeafNode(otherlv_12, grammarAccess.getStateVariableAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,41,FOLLOW_6); 

                	newLeafNode(otherlv_13, grammarAccess.getStateVariableAccess().getUpdatesKeyword_13());
                
            otherlv_14=(Token)match(input,13,FOLLOW_40); 

                	newLeafNode(otherlv_14, grammarAccess.getStateVariableAccess().getLeftCurlyBracketKeyword_14());
                
            // InternalStateAnalysis.g:1113:1: ( (lv_stateUpdates_15_0= ruleStateUpdate ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==51) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStateAnalysis.g:1114:1: (lv_stateUpdates_15_0= ruleStateUpdate )
            	    {
            	    // InternalStateAnalysis.g:1114:1: (lv_stateUpdates_15_0= ruleStateUpdate )
            	    // InternalStateAnalysis.g:1115:3: lv_stateUpdates_15_0= ruleStateUpdate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateVariableAccess().getStateUpdatesStateUpdateParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_40);
            	    lv_stateUpdates_15_0=ruleStateUpdate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateUpdates",
            	            		lv_stateUpdates_15_0, 
            	            		"net.certware.state.StateAnalysis.StateUpdate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_41); 

                	newLeafNode(otherlv_16, grammarAccess.getStateVariableAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_17=(Token)match(input,42,FOLLOW_6); 

                	newLeafNode(otherlv_17, grammarAccess.getStateVariableAccess().getInfluencedKeyword_17());
                
            otherlv_18=(Token)match(input,13,FOLLOW_24); 

                	newLeafNode(otherlv_18, grammarAccess.getStateVariableAccess().getLeftCurlyBracketKeyword_18());
                
            // InternalStateAnalysis.g:1143:1: ( (lv_influencedBy_19_0= ruleStateVariable ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStateAnalysis.g:1144:1: (lv_influencedBy_19_0= ruleStateVariable )
            	    {
            	    // InternalStateAnalysis.g:1144:1: (lv_influencedBy_19_0= ruleStateVariable )
            	    // InternalStateAnalysis.g:1145:3: lv_influencedBy_19_0= ruleStateVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateVariableAccess().getInfluencedByStateVariableParserRuleCall_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_influencedBy_19_0=ruleStateVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"influencedBy",
            	            		lv_influencedBy_19_0, 
            	            		"net.certware.state.StateAnalysis.StateVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_20=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_20, grammarAccess.getStateVariableAccess().getRightCurlyBracketKeyword_20());
                

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
    // $ANTLR end "ruleStateVariable"


    // $ANTLR start "entryRuleController"
    // InternalStateAnalysis.g:1173:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalStateAnalysis.g:1174:2: (iv_ruleController= ruleController EOF )
            // InternalStateAnalysis.g:1175:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalStateAnalysis.g:1182:1: ruleController returns [EObject current=null] : (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'delegates' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+ otherlv_10= '}' otherlv_11= 'commands' otherlv_12= '{' ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+ otherlv_14= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_stateConstraint_9_0 = null;

        EObject lv_hardwareCommand_13_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1185:28: ( (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'delegates' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+ otherlv_10= '}' otherlv_11= 'commands' otherlv_12= '{' ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+ otherlv_14= '}' ) )
            // InternalStateAnalysis.g:1186:1: (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'delegates' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+ otherlv_10= '}' otherlv_11= 'commands' otherlv_12= '{' ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+ otherlv_14= '}' )
            {
            // InternalStateAnalysis.g:1186:1: (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'delegates' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+ otherlv_10= '}' otherlv_11= 'commands' otherlv_12= '{' ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+ otherlv_14= '}' )
            // InternalStateAnalysis.g:1186:3: otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'delegates' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+ otherlv_10= '}' otherlv_11= 'commands' otherlv_12= '{' ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
                
            // InternalStateAnalysis.g:1190:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1191:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1191:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1192:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControllerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1208:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1209:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1209:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1210:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            			newLeafNode(lv_description_2_0, grammarAccess.getControllerAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControllerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getDelegatesKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_43); 

                	newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:1234:1: ( (otherlv_5= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStateAnalysis.g:1235:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalStateAnalysis.g:1235:1: (otherlv_5= RULE_ID )
            	    // InternalStateAnalysis.g:1236:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getControllerRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    		newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getDelegatesControllerCrossReference_5_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_44); 

                	newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,45,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getConstraintsKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_45); 

                	newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:1259:1: ( (lv_stateConstraint_9_0= ruleStateConstraint ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStateAnalysis.g:1260:1: (lv_stateConstraint_9_0= ruleStateConstraint )
            	    {
            	    // InternalStateAnalysis.g:1260:1: (lv_stateConstraint_9_0= ruleStateConstraint )
            	    // InternalStateAnalysis.g:1261:3: lv_stateConstraint_9_0= ruleStateConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControllerAccess().getStateConstraintStateConstraintParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_37);
            	    lv_stateConstraint_9_0=ruleStateConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateConstraint",
            	            		lv_stateConstraint_9_0, 
            	            		"net.certware.state.StateAnalysis.StateConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_46); 

                	newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,46,FOLLOW_6); 

                	newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getCommandsKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_47); 

                	newLeafNode(otherlv_12, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_12());
                
            // InternalStateAnalysis.g:1289:1: ( (lv_hardwareCommand_13_0= ruleHardwareCommand ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStateAnalysis.g:1290:1: (lv_hardwareCommand_13_0= ruleHardwareCommand )
            	    {
            	    // InternalStateAnalysis.g:1290:1: (lv_hardwareCommand_13_0= ruleHardwareCommand )
            	    // InternalStateAnalysis.g:1291:3: lv_hardwareCommand_13_0= ruleHardwareCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControllerAccess().getHardwareCommandHardwareCommandParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_48);
            	    lv_hardwareCommand_13_0=ruleHardwareCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hardwareCommand",
            	            		lv_hardwareCommand_13_0, 
            	            		"net.certware.state.StateAnalysis.HardwareCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_14, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEstimator"
    // InternalStateAnalysis.g:1319:1: entryRuleEstimator returns [EObject current=null] : iv_ruleEstimator= ruleEstimator EOF ;
    public final EObject entryRuleEstimator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimator = null;


        try {
            // InternalStateAnalysis.g:1320:2: (iv_ruleEstimator= ruleEstimator EOF )
            // InternalStateAnalysis.g:1321:2: iv_ruleEstimator= ruleEstimator EOF
            {
             newCompositeNode(grammarAccess.getEstimatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstimator=ruleEstimator();

            state._fsp--;

             current =iv_ruleEstimator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEstimator"


    // $ANTLR start "ruleEstimator"
    // InternalStateAnalysis.g:1328:1: ruleEstimator returns [EObject current=null] : (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'distills' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraints_9_0= ruleStateConstraint ) )* otherlv_10= '}' otherlv_11= 'updates' otherlv_12= '{' ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+ otherlv_14= '}' otherlv_15= 'measurement' otherlv_16= '{' ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+ otherlv_18= '}' ) ;
    public final EObject ruleEstimator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_stateConstraints_9_0 = null;

        EObject lv_stateUpdates_13_0 = null;

        EObject lv_hardwareMeasurement_17_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1331:28: ( (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'distills' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraints_9_0= ruleStateConstraint ) )* otherlv_10= '}' otherlv_11= 'updates' otherlv_12= '{' ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+ otherlv_14= '}' otherlv_15= 'measurement' otherlv_16= '{' ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+ otherlv_18= '}' ) )
            // InternalStateAnalysis.g:1332:1: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'distills' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraints_9_0= ruleStateConstraint ) )* otherlv_10= '}' otherlv_11= 'updates' otherlv_12= '{' ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+ otherlv_14= '}' otherlv_15= 'measurement' otherlv_16= '{' ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+ otherlv_18= '}' )
            {
            // InternalStateAnalysis.g:1332:1: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'distills' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraints_9_0= ruleStateConstraint ) )* otherlv_10= '}' otherlv_11= 'updates' otherlv_12= '{' ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+ otherlv_14= '}' otherlv_15= 'measurement' otherlv_16= '{' ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+ otherlv_18= '}' )
            // InternalStateAnalysis.g:1332:3: otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'distills' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_stateConstraints_9_0= ruleStateConstraint ) )* otherlv_10= '}' otherlv_11= 'updates' otherlv_12= '{' ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+ otherlv_14= '}' otherlv_15= 'measurement' otherlv_16= '{' ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+ otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getEstimatorAccess().getEstimatorKeyword_0());
                
            // InternalStateAnalysis.g:1336:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1337:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1337:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1338:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEstimatorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEstimatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1354:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1355:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1355:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1356:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            			newLeafNode(lv_description_2_0, grammarAccess.getEstimatorAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEstimatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getEstimatorAccess().getDistillsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_43); 

                	newLeafNode(otherlv_4, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:1380:1: ( (otherlv_5= RULE_ID ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStateAnalysis.g:1381:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalStateAnalysis.g:1381:1: (otherlv_5= RULE_ID )
            	    // InternalStateAnalysis.g:1382:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEstimatorRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEstimatorAccess().getDistilledMeasurementsEstimatorCrossReference_5_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_44); 

                	newLeafNode(otherlv_6, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,45,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getEstimatorAccess().getConstraintsKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_37); 

                	newLeafNode(otherlv_8, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:1405:1: ( (lv_stateConstraints_9_0= ruleStateConstraint ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStateAnalysis.g:1406:1: (lv_stateConstraints_9_0= ruleStateConstraint )
            	    {
            	    // InternalStateAnalysis.g:1406:1: (lv_stateConstraints_9_0= ruleStateConstraint )
            	    // InternalStateAnalysis.g:1407:3: lv_stateConstraints_9_0= ruleStateConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEstimatorAccess().getStateConstraintsStateConstraintParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_37);
            	    lv_stateConstraints_9_0=ruleStateConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateConstraints",
            	            		lv_stateConstraints_9_0, 
            	            		"net.certware.state.StateAnalysis.StateConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_39); 

                	newLeafNode(otherlv_10, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,41,FOLLOW_6); 

                	newLeafNode(otherlv_11, grammarAccess.getEstimatorAccess().getUpdatesKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_50); 

                	newLeafNode(otherlv_12, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_12());
                
            // InternalStateAnalysis.g:1435:1: ( (lv_stateUpdates_13_0= ruleStateUpdate ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStateAnalysis.g:1436:1: (lv_stateUpdates_13_0= ruleStateUpdate )
            	    {
            	    // InternalStateAnalysis.g:1436:1: (lv_stateUpdates_13_0= ruleStateUpdate )
            	    // InternalStateAnalysis.g:1437:3: lv_stateUpdates_13_0= ruleStateUpdate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEstimatorAccess().getStateUpdatesStateUpdateParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_40);
            	    lv_stateUpdates_13_0=ruleStateUpdate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateUpdates",
            	            		lv_stateUpdates_13_0, 
            	            		"net.certware.state.StateAnalysis.StateUpdate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_51); 

                	newLeafNode(otherlv_14, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,49,FOLLOW_6); 

                	newLeafNode(otherlv_15, grammarAccess.getEstimatorAccess().getMeasurementKeyword_15());
                
            otherlv_16=(Token)match(input,13,FOLLOW_52); 

                	newLeafNode(otherlv_16, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_16());
                
            // InternalStateAnalysis.g:1465:1: ( (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStateAnalysis.g:1466:1: (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement )
            	    {
            	    // InternalStateAnalysis.g:1466:1: (lv_hardwareMeasurement_17_0= ruleHardwareMeasurement )
            	    // InternalStateAnalysis.g:1467:3: lv_hardwareMeasurement_17_0= ruleHardwareMeasurement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEstimatorAccess().getHardwareMeasurementHardwareMeasurementParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_53);
            	    lv_hardwareMeasurement_17_0=ruleHardwareMeasurement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hardwareMeasurement",
            	            		lv_hardwareMeasurement_17_0, 
            	            		"net.certware.state.StateAnalysis.HardwareMeasurement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_18());
                

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
    // $ANTLR end "ruleEstimator"


    // $ANTLR start "entryRuleStateConstraint"
    // InternalStateAnalysis.g:1495:1: entryRuleStateConstraint returns [EObject current=null] : iv_ruleStateConstraint= ruleStateConstraint EOF ;
    public final EObject entryRuleStateConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateConstraint = null;


        try {
            // InternalStateAnalysis.g:1496:2: (iv_ruleStateConstraint= ruleStateConstraint EOF )
            // InternalStateAnalysis.g:1497:2: iv_ruleStateConstraint= ruleStateConstraint EOF
            {
             newCompositeNode(grammarAccess.getStateConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateConstraint=ruleStateConstraint();

            state._fsp--;

             current =iv_ruleStateConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateConstraint"


    // $ANTLR start "ruleStateConstraint"
    // InternalStateAnalysis.g:1504:1: ruleStateConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStateConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1507:28: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1508:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1508:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1508:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateConstraintAccess().getConstraintKeyword_0());
                
            // InternalStateAnalysis.g:1512:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1513:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1513:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1530:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1531:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1531:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1532:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getStateConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleStateConstraint"


    // $ANTLR start "entryRuleStateUpdate"
    // InternalStateAnalysis.g:1556:1: entryRuleStateUpdate returns [EObject current=null] : iv_ruleStateUpdate= ruleStateUpdate EOF ;
    public final EObject entryRuleStateUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateUpdate = null;


        try {
            // InternalStateAnalysis.g:1557:2: (iv_ruleStateUpdate= ruleStateUpdate EOF )
            // InternalStateAnalysis.g:1558:2: iv_ruleStateUpdate= ruleStateUpdate EOF
            {
             newCompositeNode(grammarAccess.getStateUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateUpdate=ruleStateUpdate();

            state._fsp--;

             current =iv_ruleStateUpdate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateUpdate"


    // $ANTLR start "ruleStateUpdate"
    // InternalStateAnalysis.g:1565:1: ruleStateUpdate returns [EObject current=null] : (otherlv_0= 'StateUpdate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStateUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1568:28: ( (otherlv_0= 'StateUpdate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1569:1: (otherlv_0= 'StateUpdate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1569:1: (otherlv_0= 'StateUpdate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1569:3: otherlv_0= 'StateUpdate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateUpdateAccess().getStateUpdateKeyword_0());
                
            // InternalStateAnalysis.g:1573:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1574:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1574:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1575:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateUpdateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateUpdateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1591:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1592:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1592:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1593:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getStateUpdateAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateUpdateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleStateUpdate"


    // $ANTLR start "entryRuleHardwareCommand"
    // InternalStateAnalysis.g:1617:1: entryRuleHardwareCommand returns [EObject current=null] : iv_ruleHardwareCommand= ruleHardwareCommand EOF ;
    public final EObject entryRuleHardwareCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareCommand = null;


        try {
            // InternalStateAnalysis.g:1618:2: (iv_ruleHardwareCommand= ruleHardwareCommand EOF )
            // InternalStateAnalysis.g:1619:2: iv_ruleHardwareCommand= ruleHardwareCommand EOF
            {
             newCompositeNode(grammarAccess.getHardwareCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHardwareCommand=ruleHardwareCommand();

            state._fsp--;

             current =iv_ruleHardwareCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHardwareCommand"


    // $ANTLR start "ruleHardwareCommand"
    // InternalStateAnalysis.g:1626:1: ruleHardwareCommand returns [EObject current=null] : (otherlv_0= 'HardwareCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHardwareCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1629:28: ( (otherlv_0= 'HardwareCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1630:1: (otherlv_0= 'HardwareCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1630:1: (otherlv_0= 'HardwareCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1630:3: otherlv_0= 'HardwareCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getHardwareCommandAccess().getHardwareCommandKeyword_0());
                
            // InternalStateAnalysis.g:1634:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1635:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1635:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1636:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHardwareCommandAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1652:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1653:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1653:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1654:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getHardwareCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleHardwareCommand"


    // $ANTLR start "entryRuleHardwareMeasurement"
    // InternalStateAnalysis.g:1678:1: entryRuleHardwareMeasurement returns [EObject current=null] : iv_ruleHardwareMeasurement= ruleHardwareMeasurement EOF ;
    public final EObject entryRuleHardwareMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareMeasurement = null;


        try {
            // InternalStateAnalysis.g:1679:2: (iv_ruleHardwareMeasurement= ruleHardwareMeasurement EOF )
            // InternalStateAnalysis.g:1680:2: iv_ruleHardwareMeasurement= ruleHardwareMeasurement EOF
            {
             newCompositeNode(grammarAccess.getHardwareMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHardwareMeasurement=ruleHardwareMeasurement();

            state._fsp--;

             current =iv_ruleHardwareMeasurement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHardwareMeasurement"


    // $ANTLR start "ruleHardwareMeasurement"
    // InternalStateAnalysis.g:1687:1: ruleHardwareMeasurement returns [EObject current=null] : (otherlv_0= 'HardwareMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHardwareMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1690:28: ( (otherlv_0= 'HardwareMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1691:1: (otherlv_0= 'HardwareMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1691:1: (otherlv_0= 'HardwareMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1691:3: otherlv_0= 'HardwareMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getHardwareMeasurementAccess().getHardwareMeasurementKeyword_0());
                
            // InternalStateAnalysis.g:1695:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1696:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1696:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1697:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHardwareMeasurementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1713:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1714:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1714:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1715:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getHardwareMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleHardwareMeasurement"


    // $ANTLR start "entryRuleDeviceCommand"
    // InternalStateAnalysis.g:1741:1: entryRuleDeviceCommand returns [EObject current=null] : iv_ruleDeviceCommand= ruleDeviceCommand EOF ;
    public final EObject entryRuleDeviceCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceCommand = null;


        try {
            // InternalStateAnalysis.g:1742:2: (iv_ruleDeviceCommand= ruleDeviceCommand EOF )
            // InternalStateAnalysis.g:1743:2: iv_ruleDeviceCommand= ruleDeviceCommand EOF
            {
             newCompositeNode(grammarAccess.getDeviceCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceCommand=ruleDeviceCommand();

            state._fsp--;

             current =iv_ruleDeviceCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceCommand"


    // $ANTLR start "ruleDeviceCommand"
    // InternalStateAnalysis.g:1750:1: ruleDeviceCommand returns [EObject current=null] : (otherlv_0= 'DeviceCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeviceCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1753:28: ( (otherlv_0= 'DeviceCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1754:1: (otherlv_0= 'DeviceCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1754:1: (otherlv_0= 'DeviceCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1754:3: otherlv_0= 'DeviceCommand' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceCommandAccess().getDeviceCommandKeyword_0());
                
            // InternalStateAnalysis.g:1758:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1759:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1759:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1760:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeviceCommandAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1776:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1777:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1777:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1778:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDeviceCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleDeviceCommand"


    // $ANTLR start "entryRuleDeviceMeasurement"
    // InternalStateAnalysis.g:1802:1: entryRuleDeviceMeasurement returns [EObject current=null] : iv_ruleDeviceMeasurement= ruleDeviceMeasurement EOF ;
    public final EObject entryRuleDeviceMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMeasurement = null;


        try {
            // InternalStateAnalysis.g:1803:2: (iv_ruleDeviceMeasurement= ruleDeviceMeasurement EOF )
            // InternalStateAnalysis.g:1804:2: iv_ruleDeviceMeasurement= ruleDeviceMeasurement EOF
            {
             newCompositeNode(grammarAccess.getDeviceMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceMeasurement=ruleDeviceMeasurement();

            state._fsp--;

             current =iv_ruleDeviceMeasurement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeviceMeasurement"


    // $ANTLR start "ruleDeviceMeasurement"
    // InternalStateAnalysis.g:1811:1: ruleDeviceMeasurement returns [EObject current=null] : (otherlv_0= 'DeviceMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeviceMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1814:28: ( (otherlv_0= 'DeviceMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalStateAnalysis.g:1815:1: (otherlv_0= 'DeviceMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalStateAnalysis.g:1815:1: (otherlv_0= 'DeviceMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalStateAnalysis.g:1815:3: otherlv_0= 'DeviceMeasurement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceMeasurementAccess().getDeviceMeasurementKeyword_0());
                
            // InternalStateAnalysis.g:1819:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1820:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1820:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1821:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeviceMeasurementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1837:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1838:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1838:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1839:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDeviceMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleDeviceMeasurement"


    // $ANTLR start "entryRuleHardwareAdapter"
    // InternalStateAnalysis.g:1863:1: entryRuleHardwareAdapter returns [EObject current=null] : iv_ruleHardwareAdapter= ruleHardwareAdapter EOF ;
    public final EObject entryRuleHardwareAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareAdapter = null;


        try {
            // InternalStateAnalysis.g:1864:2: (iv_ruleHardwareAdapter= ruleHardwareAdapter EOF )
            // InternalStateAnalysis.g:1865:2: iv_ruleHardwareAdapter= ruleHardwareAdapter EOF
            {
             newCompositeNode(grammarAccess.getHardwareAdapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHardwareAdapter=ruleHardwareAdapter();

            state._fsp--;

             current =iv_ruleHardwareAdapter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHardwareAdapter"


    // $ANTLR start "ruleHardwareAdapter"
    // InternalStateAnalysis.g:1872:1: ruleHardwareAdapter returns [EObject current=null] : (otherlv_0= 'HardwareAdapter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'hardwareCommands' otherlv_4= '{' ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )* otherlv_6= '}' otherlv_7= 'hardwareMeasurements' otherlv_8= '{' ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )* otherlv_10= '}' otherlv_11= 'deviceCommands' otherlv_12= '{' ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )* otherlv_14= '}' otherlv_15= 'deviceMeasurements' otherlv_16= '{' ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )* otherlv_18= '}' ) ;
    public final EObject ruleHardwareAdapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_hardwareCommands_5_0 = null;

        EObject lv_hardwareMeasurements_9_0 = null;

        EObject lv_deviceCommands_13_0 = null;

        EObject lv_deviceMeasurements_17_0 = null;


         enterRule(); 
            
        try {
            // InternalStateAnalysis.g:1875:28: ( (otherlv_0= 'HardwareAdapter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'hardwareCommands' otherlv_4= '{' ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )* otherlv_6= '}' otherlv_7= 'hardwareMeasurements' otherlv_8= '{' ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )* otherlv_10= '}' otherlv_11= 'deviceCommands' otherlv_12= '{' ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )* otherlv_14= '}' otherlv_15= 'deviceMeasurements' otherlv_16= '{' ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )* otherlv_18= '}' ) )
            // InternalStateAnalysis.g:1876:1: (otherlv_0= 'HardwareAdapter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'hardwareCommands' otherlv_4= '{' ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )* otherlv_6= '}' otherlv_7= 'hardwareMeasurements' otherlv_8= '{' ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )* otherlv_10= '}' otherlv_11= 'deviceCommands' otherlv_12= '{' ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )* otherlv_14= '}' otherlv_15= 'deviceMeasurements' otherlv_16= '{' ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )* otherlv_18= '}' )
            {
            // InternalStateAnalysis.g:1876:1: (otherlv_0= 'HardwareAdapter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'hardwareCommands' otherlv_4= '{' ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )* otherlv_6= '}' otherlv_7= 'hardwareMeasurements' otherlv_8= '{' ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )* otherlv_10= '}' otherlv_11= 'deviceCommands' otherlv_12= '{' ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )* otherlv_14= '}' otherlv_15= 'deviceMeasurements' otherlv_16= '{' ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )* otherlv_18= '}' )
            // InternalStateAnalysis.g:1876:3: otherlv_0= 'HardwareAdapter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'hardwareCommands' otherlv_4= '{' ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )* otherlv_6= '}' otherlv_7= 'hardwareMeasurements' otherlv_8= '{' ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )* otherlv_10= '}' otherlv_11= 'deviceCommands' otherlv_12= '{' ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )* otherlv_14= '}' otherlv_15= 'deviceMeasurements' otherlv_16= '{' ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getHardwareAdapterAccess().getHardwareAdapterKeyword_0());
                
            // InternalStateAnalysis.g:1880:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateAnalysis.g:1881:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateAnalysis.g:1881:1: (lv_name_1_0= RULE_ID )
            // InternalStateAnalysis.g:1882:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHardwareAdapterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareAdapterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateAnalysis.g:1898:2: ( (lv_description_2_0= RULE_STRING ) )
            // InternalStateAnalysis.g:1899:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalStateAnalysis.g:1899:1: (lv_description_2_0= RULE_STRING )
            // InternalStateAnalysis.g:1900:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

            			newLeafNode(lv_description_2_0, grammarAccess.getHardwareAdapterAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHardwareAdapterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getHardwareAdapterAccess().getHardwareCommandsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_48); 

                	newLeafNode(otherlv_4, grammarAccess.getHardwareAdapterAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalStateAnalysis.g:1924:1: ( (lv_hardwareCommands_5_0= ruleHardwareCommand ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalStateAnalysis.g:1925:1: (lv_hardwareCommands_5_0= ruleHardwareCommand )
            	    {
            	    // InternalStateAnalysis.g:1925:1: (lv_hardwareCommands_5_0= ruleHardwareCommand )
            	    // InternalStateAnalysis.g:1926:3: lv_hardwareCommands_5_0= ruleHardwareCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHardwareAdapterAccess().getHardwareCommandsHardwareCommandParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_48);
            	    lv_hardwareCommands_5_0=ruleHardwareCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHardwareAdapterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hardwareCommands",
            	            		lv_hardwareCommands_5_0, 
            	            		"net.certware.state.StateAnalysis.HardwareCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_55); 

                	newLeafNode(otherlv_6, grammarAccess.getHardwareAdapterAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_6); 

                	newLeafNode(otherlv_7, grammarAccess.getHardwareAdapterAccess().getHardwareMeasurementsKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_53); 

                	newLeafNode(otherlv_8, grammarAccess.getHardwareAdapterAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalStateAnalysis.g:1954:1: ( (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalStateAnalysis.g:1955:1: (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement )
            	    {
            	    // InternalStateAnalysis.g:1955:1: (lv_hardwareMeasurements_9_0= ruleHardwareMeasurement )
            	    // InternalStateAnalysis.g:1956:3: lv_hardwareMeasurements_9_0= ruleHardwareMeasurement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHardwareAdapterAccess().getHardwareMeasurementsHardwareMeasurementParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_53);
            	    lv_hardwareMeasurements_9_0=ruleHardwareMeasurement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHardwareAdapterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hardwareMeasurements",
            	            		lv_hardwareMeasurements_9_0, 
            	            		"net.certware.state.StateAnalysis.HardwareMeasurement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_56); 

                	newLeafNode(otherlv_10, grammarAccess.getHardwareAdapterAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,59,FOLLOW_6); 

                	newLeafNode(otherlv_11, grammarAccess.getHardwareAdapterAccess().getDeviceCommandsKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_57); 

                	newLeafNode(otherlv_12, grammarAccess.getHardwareAdapterAccess().getLeftCurlyBracketKeyword_12());
                
            // InternalStateAnalysis.g:1984:1: ( (lv_deviceCommands_13_0= ruleDeviceCommand ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalStateAnalysis.g:1985:1: (lv_deviceCommands_13_0= ruleDeviceCommand )
            	    {
            	    // InternalStateAnalysis.g:1985:1: (lv_deviceCommands_13_0= ruleDeviceCommand )
            	    // InternalStateAnalysis.g:1986:3: lv_deviceCommands_13_0= ruleDeviceCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHardwareAdapterAccess().getDeviceCommandsDeviceCommandParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_57);
            	    lv_deviceCommands_13_0=ruleDeviceCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHardwareAdapterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deviceCommands",
            	            		lv_deviceCommands_13_0, 
            	            		"net.certware.state.StateAnalysis.DeviceCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_58); 

                	newLeafNode(otherlv_14, grammarAccess.getHardwareAdapterAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,60,FOLLOW_6); 

                	newLeafNode(otherlv_15, grammarAccess.getHardwareAdapterAccess().getDeviceMeasurementsKeyword_15());
                
            otherlv_16=(Token)match(input,13,FOLLOW_59); 

                	newLeafNode(otherlv_16, grammarAccess.getHardwareAdapterAccess().getLeftCurlyBracketKeyword_16());
                
            // InternalStateAnalysis.g:2014:1: ( (lv_deviceMeasurements_17_0= ruleDeviceMeasurement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalStateAnalysis.g:2015:1: (lv_deviceMeasurements_17_0= ruleDeviceMeasurement )
            	    {
            	    // InternalStateAnalysis.g:2015:1: (lv_deviceMeasurements_17_0= ruleDeviceMeasurement )
            	    // InternalStateAnalysis.g:2016:3: lv_deviceMeasurements_17_0= ruleDeviceMeasurement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHardwareAdapterAccess().getDeviceMeasurementsDeviceMeasurementParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_59);
            	    lv_deviceMeasurements_17_0=ruleDeviceMeasurement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHardwareAdapterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deviceMeasurements",
            	            		lv_deviceMeasurements_17_0, 
            	            		"net.certware.state.StateAnalysis.DeviceMeasurement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getHardwareAdapterAccess().getRightCurlyBracketKeyword_18());
                

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
    // $ANTLR end "ruleHardwareAdapter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000004000L});

}