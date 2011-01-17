package net.certware.planning.cpn.parser.antlr.internal; 

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
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalCpnDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g"; }



     	private CpnDslGrammarAccess grammarAccess;
     	
        public InternalCpnDslParser(TokenStream input, IAstFactory factory, CpnDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Plans";	
       	}
       	
       	@Override
       	protected CpnDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulePlans
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:77:1: entryRulePlans returns [EObject current=null] : iv_rulePlans= rulePlans EOF ;
    public final EObject entryRulePlans() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlans = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:78:2: (iv_rulePlans= rulePlans EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:79:2: iv_rulePlans= rulePlans EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlansRule(), currentNode); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans75);
            iv_rulePlans=rulePlans();
            _fsp--;

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
    // $ANTLR end entryRulePlans


    // $ANTLR start rulePlans
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:86:1: rulePlans returns [EObject current=null] : ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* ) ;
    public final EObject rulePlans() throws RecognitionException {
        EObject current = null;

        EObject lv_argumentmodels_0_0 = null;

        EObject lv_plans_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:91:6: ( ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:92:1: ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:92:1: ( ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )* )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:92:2: ( (lv_argumentmodels_0_0= ruleArgumentModels ) )* ( (lv_plans_1_0= rulePlan ) )*
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:92:2: ( (lv_argumentmodels_0_0= ruleArgumentModels ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:93:1: (lv_argumentmodels_0_0= ruleArgumentModels )
            	    {
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:93:1: (lv_argumentmodels_0_0= ruleArgumentModels )
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:94:3: lv_argumentmodels_0_0= ruleArgumentModels
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPlansAccess().getArgumentmodelsArgumentModelsParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgumentModels_in_rulePlans131);
            	    lv_argumentmodels_0_0=ruleArgumentModels();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPlansRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"argumentmodels",
            	    	        		lv_argumentmodels_0_0, 
            	    	        		"ArgumentModels", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:116:3: ( (lv_plans_1_0= rulePlan ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:117:1: (lv_plans_1_0= rulePlan )
            	    {
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:117:1: (lv_plans_1_0= rulePlan )
            	    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:118:3: lv_plans_1_0= rulePlan
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePlan_in_rulePlans153);
            	    lv_plans_1_0=rulePlan();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPlansRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"plans",
            	    	        		lv_plans_1_0, 
            	    	        		"Plan", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end rulePlans


    // $ANTLR start entryRuleArgumentModels
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:148:1: entryRuleArgumentModels returns [EObject current=null] : iv_ruleArgumentModels= ruleArgumentModels EOF ;
    public final EObject entryRuleArgumentModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentModels = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:149:2: (iv_ruleArgumentModels= ruleArgumentModels EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:150:2: iv_ruleArgumentModels= ruleArgumentModels EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentModelsRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels190);
            iv_ruleArgumentModels=ruleArgumentModels();
            _fsp--;

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
    // $ANTLR end entryRuleArgumentModels


    // $ANTLR start ruleArgumentModels
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:157:1: ruleArgumentModels returns [EObject current=null] : ( 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgumentModels() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:162:6: ( ( 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:163:1: ( 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:163:1: ( 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:163:3: 'argumentmodel' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,11,FOLLOW_11_in_ruleArgumentModels235); 

                    createLeafNode(grammarAccess.getArgumentModelsAccess().getArgumentmodelKeyword_0(), null); 
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:167:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:168:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:168:1: (lv_importURI_1_0= RULE_STRING )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:169:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgumentModels252); 

            			createLeafNode(grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentModelsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


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
    // $ANTLR end ruleArgumentModels


    // $ANTLR start entryRuleAllocation
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:199:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:200:2: (iv_ruleAllocation= ruleAllocation EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:201:2: iv_ruleAllocation= ruleAllocation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAllocationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAllocation_in_entryRuleAllocation293);
            iv_ruleAllocation=ruleAllocation();
            _fsp--;

             current =iv_ruleAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllocation303); 

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
    // $ANTLR end entryRuleAllocation


    // $ANTLR start ruleAllocation
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:208:1: ruleAllocation returns [EObject current=null] : ( () ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )? ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token lv_cost_2_0=null;
        Token lv_duration_4_0=null;
        Token lv_team_6_0=null;
        Token lv_facility_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:213:6: ( ( () ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )? ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:214:1: ( () ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )? ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:214:1: ( () ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )? ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )? )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:214:2: () ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )? ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )? ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )?
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:214:2: ()
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:215:5: 
            {
             
                    temp=factory.create(grammarAccess.getAllocationAccess().getAllocationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAllocationAccess().getAllocationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:225:2: ( 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:225:4: 'cost' ( (lv_cost_2_0= RULE_INT ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleAllocation348); 

                            createLeafNode(grammarAccess.getAllocationAccess().getCostKeyword_1_0(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:229:1: ( (lv_cost_2_0= RULE_INT ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:230:1: (lv_cost_2_0= RULE_INT )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:230:1: (lv_cost_2_0= RULE_INT )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:231:3: lv_cost_2_0= RULE_INT
                    {
                    lv_cost_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllocation365); 

                    			createLeafNode(grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0(), "cost"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllocationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"cost",
                    	        		lv_cost_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:253:4: ( 'duration' ( (lv_duration_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:253:6: 'duration' ( (lv_duration_4_0= RULE_INT ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleAllocation383); 

                            createLeafNode(grammarAccess.getAllocationAccess().getDurationKeyword_2_0(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:257:1: ( (lv_duration_4_0= RULE_INT ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:258:1: (lv_duration_4_0= RULE_INT )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:258:1: (lv_duration_4_0= RULE_INT )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:259:3: lv_duration_4_0= RULE_INT
                    {
                    lv_duration_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllocation400); 

                    			createLeafNode(grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0(), "duration"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllocationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"duration",
                    	        		lv_duration_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:281:4: ( 'team' ( (lv_team_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:281:6: 'team' ( (lv_team_6_0= RULE_STRING ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleAllocation418); 

                            createLeafNode(grammarAccess.getAllocationAccess().getTeamKeyword_3_0(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:285:1: ( (lv_team_6_0= RULE_STRING ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:286:1: (lv_team_6_0= RULE_STRING )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:286:1: (lv_team_6_0= RULE_STRING )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:287:3: lv_team_6_0= RULE_STRING
                    {
                    lv_team_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllocation435); 

                    			createLeafNode(grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0(), "team"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllocationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"team",
                    	        		lv_team_6_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:309:4: ( 'facility' ( (lv_facility_8_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:309:6: 'facility' ( (lv_facility_8_0= RULE_STRING ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleAllocation453); 

                            createLeafNode(grammarAccess.getAllocationAccess().getFacilityKeyword_4_0(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:313:1: ( (lv_facility_8_0= RULE_STRING ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:314:1: (lv_facility_8_0= RULE_STRING )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:314:1: (lv_facility_8_0= RULE_STRING )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:315:3: lv_facility_8_0= RULE_STRING
                    {
                    lv_facility_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllocation470); 

                    			createLeafNode(grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0(), "facility"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllocationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"facility",
                    	        		lv_facility_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end ruleAllocation


    // $ANTLR start entryRulePlan
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:345:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:346:2: (iv_rulePlan= rulePlan EOF )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:347:2: iv_rulePlan= rulePlan EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlanRule(), currentNode); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan513);
            iv_rulePlan=rulePlan();
            _fsp--;

             current =iv_rulePlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan523); 

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
    // $ANTLR end entryRulePlan


    // $ANTLR start rulePlan
    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:354:1: rulePlan returns [EObject current=null] : ( 'plan' ( (lv_id_1_0= RULE_STRING ) ) 'element' ( ( RULE_ID ) ) ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )? ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )? ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_estimated_6_0 = null;

        EObject lv_actual_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:359:6: ( ( 'plan' ( (lv_id_1_0= RULE_STRING ) ) 'element' ( ( RULE_ID ) ) ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )? ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )? ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:360:1: ( 'plan' ( (lv_id_1_0= RULE_STRING ) ) 'element' ( ( RULE_ID ) ) ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )? ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )? )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:360:1: ( 'plan' ( (lv_id_1_0= RULE_STRING ) ) 'element' ( ( RULE_ID ) ) ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )? ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )? )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:360:3: 'plan' ( (lv_id_1_0= RULE_STRING ) ) 'element' ( ( RULE_ID ) ) ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )? ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )?
            {
            match(input,16,FOLLOW_16_in_rulePlan558); 

                    createLeafNode(grammarAccess.getPlanAccess().getPlanKeyword_0(), null); 
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:364:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:365:1: (lv_id_1_0= RULE_STRING )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:365:1: (lv_id_1_0= RULE_STRING )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:366:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlan575); 

            			createLeafNode(grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPlanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_rulePlan590); 

                    createLeafNode(grammarAccess.getPlanAccess().getElementKeyword_2(), null); 
                
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:392:1: ( ( RULE_ID ) )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:393:1: ( RULE_ID )
            {
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:393:1: ( RULE_ID )
            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:394:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPlanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan608); 

            		createLeafNode(grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0(), "element"); 
            	

            }


            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:406:2: ( 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:406:4: 'estimated' '(' ( (lv_estimated_6_0= ruleAllocation ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_rulePlan619); 

                            createLeafNode(grammarAccess.getPlanAccess().getEstimatedKeyword_4_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_rulePlan629); 

                            createLeafNode(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_4_1(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:414:1: ( (lv_estimated_6_0= ruleAllocation ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:415:1: (lv_estimated_6_0= ruleAllocation )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:415:1: (lv_estimated_6_0= ruleAllocation )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:416:3: lv_estimated_6_0= ruleAllocation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPlanAccess().getEstimatedAllocationParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAllocation_in_rulePlan650);
                    lv_estimated_6_0=ruleAllocation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPlanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"estimated",
                    	        		lv_estimated_6_0, 
                    	        		"Allocation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_rulePlan660); 

                            createLeafNode(grammarAccess.getPlanAccess().getRightParenthesisKeyword_4_3(), null); 
                        

                    }
                    break;

            }

            // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:442:3: ( 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:442:5: 'actual' '(' ( (lv_actual_10_0= ruleAllocation ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_rulePlan673); 

                            createLeafNode(grammarAccess.getPlanAccess().getActualKeyword_5_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_rulePlan683); 

                            createLeafNode(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_5_1(), null); 
                        
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:450:1: ( (lv_actual_10_0= ruleAllocation ) )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:451:1: (lv_actual_10_0= ruleAllocation )
                    {
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:451:1: (lv_actual_10_0= ruleAllocation )
                    // ../net.certware.planning.cpn/src-gen/net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.g:452:3: lv_actual_10_0= ruleAllocation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPlanAccess().getActualAllocationParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAllocation_in_rulePlan704);
                    lv_actual_10_0=ruleAllocation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPlanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"actual",
                    	        		lv_actual_10_0, 
                    	        		"Allocation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_rulePlan714); 

                            createLeafNode(grammarAccess.getPlanAccess().getRightParenthesisKeyword_5_3(), null); 
                        

                    }
                    break;

            }


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
    // $ANTLR end rulePlan


 

    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_rulePlans131 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_rulePlan_in_rulePlans153 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentModels200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentModels235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgumentModels252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllocation_in_entryRuleAllocation293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllocation303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAllocation348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllocation365 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_13_in_ruleAllocation383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllocation400 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleAllocation418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllocation435 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAllocation453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllocation470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePlan558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlan575 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlan590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan608 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_rulePlan619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlan629 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_ruleAllocation_in_rulePlan650 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlan660 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePlan673 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlan683 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_ruleAllocation_in_rulePlan704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlan714 = new BitSet(new long[]{0x0000000000000002L});

}