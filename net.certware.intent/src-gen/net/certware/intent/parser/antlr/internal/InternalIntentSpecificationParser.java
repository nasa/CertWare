package net.certware.intent.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.intent.services.IntentSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIntentSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'refinement'", "'basic'", "'purpose'", "'principles'", "'models'", "'design'", "'implementation'", "'operation'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'environment'", "'operator'", "'system'", "'verification'", "'condition'", "'figure'", "'break'", "'model'", "'paragraph'", "'section'", "'table'", "';'", "'output'", "'mode'", "'state'", "'macro'", "'function'", "'input'", "'requirement'", "'goal'", "'hazard'", "'constraint'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalIntentSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIntentSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIntentSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIntentSpecification.g"; }



     	private IntentSpecificationGrammarAccess grammarAccess;
     	
        public InternalIntentSpecificationParser(TokenStream input, IntentSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected IntentSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecification"
    // InternalIntentSpecification.g:67:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalIntentSpecification.g:68:2: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalIntentSpecification.g:69:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalIntentSpecification.g:76:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) ( (lv_refinements_2_0= ruleRefinement ) )+ ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_refinements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:79:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) ( (lv_refinements_2_0= ruleRefinement ) )+ ) )
            // InternalIntentSpecification.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) ( (lv_refinements_2_0= ruleRefinement ) )+ )
            {
            // InternalIntentSpecification.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) ( (lv_refinements_2_0= ruleRefinement ) )+ )
            // InternalIntentSpecification.g:80:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) ( (lv_refinements_2_0= ruleRefinement ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                
            // InternalIntentSpecification.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:102:2: ( (lv_refinements_2_0= ruleRefinement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIntentSpecification.g:103:1: (lv_refinements_2_0= ruleRefinement )
            	    {
            	    // InternalIntentSpecification.g:103:1: (lv_refinements_2_0= ruleRefinement )
            	    // InternalIntentSpecification.g:104:3: lv_refinements_2_0= ruleRefinement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getRefinementsRefinementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_refinements_2_0=ruleRefinement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refinements",
            	            		lv_refinements_2_0, 
            	            		"net.certware.intent.IntentSpecification.Refinement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleRefinement"
    // InternalIntentSpecification.g:128:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalIntentSpecification.g:129:2: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalIntentSpecification.g:130:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalIntentSpecification.g:137:1: ruleRefinement returns [EObject current=null] : (otherlv_0= 'refinement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_intents_3_0= ruleIntent ) )+ ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_intents_3_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:140:28: ( (otherlv_0= 'refinement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_intents_3_0= ruleIntent ) )+ ) )
            // InternalIntentSpecification.g:141:1: (otherlv_0= 'refinement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_intents_3_0= ruleIntent ) )+ )
            {
            // InternalIntentSpecification.g:141:1: (otherlv_0= 'refinement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_intents_3_0= ruleIntent ) )+ )
            // InternalIntentSpecification.g:141:3: otherlv_0= 'refinement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_intents_3_0= ruleIntent ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRefinementAccess().getRefinementKeyword_0());
                
            // InternalIntentSpecification.g:145:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:146:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:146:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:147:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:163:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:164:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:164:1: (lv_desc_2_0= RULE_STRING )
            // InternalIntentSpecification.g:165:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getRefinementAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalIntentSpecification.g:181:2: ( (lv_intents_3_0= ruleIntent ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIntentSpecification.g:182:1: (lv_intents_3_0= ruleIntent )
            	    {
            	    // InternalIntentSpecification.g:182:1: (lv_intents_3_0= ruleIntent )
            	    // InternalIntentSpecification.g:183:3: lv_intents_3_0= ruleIntent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefinementAccess().getIntentsIntentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
            	    lv_intents_3_0=ruleIntent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefinementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intents",
            	            		lv_intents_3_0, 
            	            		"net.certware.intent.IntentSpecification.Intent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleIntent"
    // InternalIntentSpecification.g:207:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // InternalIntentSpecification.g:208:2: (iv_ruleIntent= ruleIntent EOF )
            // InternalIntentSpecification.g:209:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalIntentSpecification.g:216:1: ruleIntent returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntentType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_decompositions_3_0= ruleDecomposition ) )+ ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_decompositions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:219:28: ( ( ( (lv_type_0_0= ruleIntentType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_decompositions_3_0= ruleDecomposition ) )+ ) )
            // InternalIntentSpecification.g:220:1: ( ( (lv_type_0_0= ruleIntentType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_decompositions_3_0= ruleDecomposition ) )+ )
            {
            // InternalIntentSpecification.g:220:1: ( ( (lv_type_0_0= ruleIntentType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_decompositions_3_0= ruleDecomposition ) )+ )
            // InternalIntentSpecification.g:220:2: ( (lv_type_0_0= ruleIntentType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) ( (lv_decompositions_3_0= ruleDecomposition ) )+
            {
            // InternalIntentSpecification.g:220:2: ( (lv_type_0_0= ruleIntentType ) )
            // InternalIntentSpecification.g:221:1: (lv_type_0_0= ruleIntentType )
            {
            // InternalIntentSpecification.g:221:1: (lv_type_0_0= ruleIntentType )
            // InternalIntentSpecification.g:222:3: lv_type_0_0= ruleIntentType
            {
             
            	        newCompositeNode(grammarAccess.getIntentAccess().getTypeIntentTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleIntentType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"net.certware.intent.IntentSpecification.IntentType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalIntentSpecification.g:238:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:239:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:239:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:256:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:257:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:257:1: (lv_desc_2_0= RULE_STRING )
            // InternalIntentSpecification.g:258:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getIntentAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalIntentSpecification.g:274:2: ( (lv_decompositions_3_0= ruleDecomposition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=26 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIntentSpecification.g:275:1: (lv_decompositions_3_0= ruleDecomposition )
            	    {
            	    // InternalIntentSpecification.g:275:1: (lv_decompositions_3_0= ruleDecomposition )
            	    // InternalIntentSpecification.g:276:3: lv_decompositions_3_0= ruleDecomposition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntentAccess().getDecompositionsDecompositionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_decompositions_3_0=ruleDecomposition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decompositions",
            	            		lv_decompositions_3_0, 
            	            		"net.certware.intent.IntentSpecification.Decomposition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleIntentType"
    // InternalIntentSpecification.g:300:1: entryRuleIntentType returns [EObject current=null] : iv_ruleIntentType= ruleIntentType EOF ;
    public final EObject entryRuleIntentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentType = null;


        try {
            // InternalIntentSpecification.g:301:2: (iv_ruleIntentType= ruleIntentType EOF )
            // InternalIntentSpecification.g:302:2: iv_ruleIntentType= ruleIntentType EOF
            {
             newCompositeNode(grammarAccess.getIntentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntentType=ruleIntentType();

            state._fsp--;

             current =iv_ruleIntentType; 
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
    // $ANTLR end "entryRuleIntentType"


    // $ANTLR start "ruleIntentType"
    // InternalIntentSpecification.g:309:1: ruleIntentType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) ) ) ;
    public final EObject ruleIntentType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;
        Token lv_typeName_0_6=null;
        Token lv_typeName_0_7=null;

         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:312:28: ( ( ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) ) ) )
            // InternalIntentSpecification.g:313:1: ( ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) ) )
            {
            // InternalIntentSpecification.g:313:1: ( ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) ) )
            // InternalIntentSpecification.g:314:1: ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) )
            {
            // InternalIntentSpecification.g:314:1: ( (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' ) )
            // InternalIntentSpecification.g:315:1: (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' )
            {
            // InternalIntentSpecification.g:315:1: (lv_typeName_0_1= 'basic' | lv_typeName_0_2= 'purpose' | lv_typeName_0_3= 'principles' | lv_typeName_0_4= 'models' | lv_typeName_0_5= 'design' | lv_typeName_0_6= 'implementation' | lv_typeName_0_7= 'operation' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalIntentSpecification.g:316:3: lv_typeName_0_1= 'basic'
                    {
                    lv_typeName_0_1=(Token)match(input,13,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getIntentTypeAccess().getTypeNameBasicKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:328:8: lv_typeName_0_2= 'purpose'
                    {
                    lv_typeName_0_2=(Token)match(input,14,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getIntentTypeAccess().getTypeNamePurposeKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:340:8: lv_typeName_0_3= 'principles'
                    {
                    lv_typeName_0_3=(Token)match(input,15,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getIntentTypeAccess().getTypeNamePrinciplesKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:352:8: lv_typeName_0_4= 'models'
                    {
                    lv_typeName_0_4=(Token)match(input,16,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getIntentTypeAccess().getTypeNameModelsKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:364:8: lv_typeName_0_5= 'design'
                    {
                    lv_typeName_0_5=(Token)match(input,17,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getIntentTypeAccess().getTypeNameDesignKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:376:8: lv_typeName_0_6= 'implementation'
                    {
                    lv_typeName_0_6=(Token)match(input,18,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_6, grammarAccess.getIntentTypeAccess().getTypeNameImplementationKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // InternalIntentSpecification.g:388:8: lv_typeName_0_7= 'operation'
                    {
                    lv_typeName_0_7=(Token)match(input,19,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_7, grammarAccess.getIntentTypeAccess().getTypeNameOperationKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_7, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleIntentType"


    // $ANTLR start "entryRuleDecomposition"
    // InternalIntentSpecification.g:411:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalIntentSpecification.g:412:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalIntentSpecification.g:413:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
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
    // $ANTLR end "entryRuleDecomposition"


    // $ANTLR start "ruleDecomposition"
    // InternalIntentSpecification.g:420:1: ruleDecomposition returns [EObject current=null] : ( ( (lv_type_0_0= ruleDecompositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )? (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )? (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )? ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_type_0_0 = null;

        EObject lv_documents_4_0 = null;

        EObject lv_models_7_0 = null;

        EObject lv_items_10_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:423:28: ( ( ( (lv_type_0_0= ruleDecompositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )? (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )? (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )? ) )
            // InternalIntentSpecification.g:424:1: ( ( (lv_type_0_0= ruleDecompositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )? (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )? (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )? )
            {
            // InternalIntentSpecification.g:424:1: ( ( (lv_type_0_0= ruleDecompositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )? (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )? (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )? )
            // InternalIntentSpecification.g:424:2: ( (lv_type_0_0= ruleDecompositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )? (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )? (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )?
            {
            // InternalIntentSpecification.g:424:2: ( (lv_type_0_0= ruleDecompositionType ) )
            // InternalIntentSpecification.g:425:1: (lv_type_0_0= ruleDecompositionType )
            {
            // InternalIntentSpecification.g:425:1: (lv_type_0_0= ruleDecompositionType )
            // InternalIntentSpecification.g:426:3: lv_type_0_0= ruleDecompositionType
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getTypeDecompositionTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleDecompositionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"net.certware.intent.IntentSpecification.DecompositionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalIntentSpecification.g:442:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:443:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:443:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:444:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDecompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:460:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:461:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:461:1: (lv_desc_2_0= RULE_STRING )
            // InternalIntentSpecification.g:462:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getDecompositionAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalIntentSpecification.g:478:2: (otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIntentSpecification.g:478:4: otherlv_3= '{' ( (lv_documents_4_0= ruleDocument ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalIntentSpecification.g:482:1: ( (lv_documents_4_0= ruleDocument ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:483:1: (lv_documents_4_0= ruleDocument )
                    	    {
                    	    // InternalIntentSpecification.g:483:1: (lv_documents_4_0= ruleDocument )
                    	    // InternalIntentSpecification.g:484:3: lv_documents_4_0= ruleDocument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDocumentsDocumentParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_12);
                    	    lv_documents_4_0=ruleDocument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"documents",
                    	            		lv_documents_4_0, 
                    	            		"net.certware.intent.IntentSpecification.Document");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                        	newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // InternalIntentSpecification.g:504:3: (otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIntentSpecification.g:504:5: otherlv_6= '[' ( (lv_models_7_0= ruleModelItem ) )* otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_14); 

                        	newLeafNode(otherlv_6, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // InternalIntentSpecification.g:508:1: ( (lv_models_7_0= ruleModelItem ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=38 && LA7_0<=43)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:509:1: (lv_models_7_0= ruleModelItem )
                    	    {
                    	    // InternalIntentSpecification.g:509:1: (lv_models_7_0= ruleModelItem )
                    	    // InternalIntentSpecification.g:510:3: lv_models_7_0= ruleModelItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getModelsModelItemParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_14);
                    	    lv_models_7_0=ruleModelItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"models",
                    	            		lv_models_7_0, 
                    	            		"net.certware.intent.IntentSpecification.ModelItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_15); 

                        	newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalIntentSpecification.g:530:3: (otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIntentSpecification.g:530:5: otherlv_9= '(' ( (lv_items_10_0= ruleListItem ) )* otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_16); 

                        	newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0());
                        
                    // InternalIntentSpecification.g:534:1: ( (lv_items_10_0= ruleListItem ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=44 && LA9_0<=47)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:535:1: (lv_items_10_0= ruleListItem )
                    	    {
                    	    // InternalIntentSpecification.g:535:1: (lv_items_10_0= ruleListItem )
                    	    // InternalIntentSpecification.g:536:3: lv_items_10_0= ruleListItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getItemsListItemParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_16);
                    	    lv_items_10_0=ruleListItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_10_0, 
                    	            		"net.certware.intent.IntentSpecification.ListItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2());
                        

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
    // $ANTLR end "ruleDecomposition"


    // $ANTLR start "entryRuleDecompositionType"
    // InternalIntentSpecification.g:564:1: entryRuleDecompositionType returns [EObject current=null] : iv_ruleDecompositionType= ruleDecompositionType EOF ;
    public final EObject entryRuleDecompositionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionType = null;


        try {
            // InternalIntentSpecification.g:565:2: (iv_ruleDecompositionType= ruleDecompositionType EOF )
            // InternalIntentSpecification.g:566:2: iv_ruleDecompositionType= ruleDecompositionType EOF
            {
             newCompositeNode(grammarAccess.getDecompositionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecompositionType=ruleDecompositionType();

            state._fsp--;

             current =iv_ruleDecompositionType; 
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
    // $ANTLR end "entryRuleDecompositionType"


    // $ANTLR start "ruleDecompositionType"
    // InternalIntentSpecification.g:573:1: ruleDecompositionType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) ) ) ;
    public final EObject ruleDecompositionType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;

         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:576:28: ( ( ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) ) ) )
            // InternalIntentSpecification.g:577:1: ( ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) ) )
            {
            // InternalIntentSpecification.g:577:1: ( ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) ) )
            // InternalIntentSpecification.g:578:1: ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) )
            {
            // InternalIntentSpecification.g:578:1: ( (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' ) )
            // InternalIntentSpecification.g:579:1: (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' )
            {
            // InternalIntentSpecification.g:579:1: (lv_typeName_0_1= 'environment' | lv_typeName_0_2= 'operator' | lv_typeName_0_3= 'system' | lv_typeName_0_4= 'verification' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalIntentSpecification.g:580:3: lv_typeName_0_1= 'environment'
                    {
                    lv_typeName_0_1=(Token)match(input,26,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getDecompositionTypeAccess().getTypeNameEnvironmentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecompositionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:592:8: lv_typeName_0_2= 'operator'
                    {
                    lv_typeName_0_2=(Token)match(input,27,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getDecompositionTypeAccess().getTypeNameOperatorKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecompositionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:604:8: lv_typeName_0_3= 'system'
                    {
                    lv_typeName_0_3=(Token)match(input,28,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getDecompositionTypeAccess().getTypeNameSystemKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecompositionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:616:8: lv_typeName_0_4= 'verification'
                    {
                    lv_typeName_0_4=(Token)match(input,29,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getDecompositionTypeAccess().getTypeNameVerificationKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecompositionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleDecompositionType"


    // $ANTLR start "entryRuleDocument"
    // InternalIntentSpecification.g:639:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalIntentSpecification.g:640:2: (iv_ruleDocument= ruleDocument EOF )
            // InternalIntentSpecification.g:641:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalIntentSpecification.g:648:1: ruleDocument returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= ruleDocItem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:651:28: ( (otherlv_0= '{' ( (lv_entries_1_0= ruleDocItem ) )+ otherlv_2= '}' ) )
            // InternalIntentSpecification.g:652:1: (otherlv_0= '{' ( (lv_entries_1_0= ruleDocItem ) )+ otherlv_2= '}' )
            {
            // InternalIntentSpecification.g:652:1: (otherlv_0= '{' ( (lv_entries_1_0= ruleDocItem ) )+ otherlv_2= '}' )
            // InternalIntentSpecification.g:652:3: otherlv_0= '{' ( (lv_entries_1_0= ruleDocItem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalIntentSpecification.g:656:1: ( (lv_entries_1_0= ruleDocItem ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=30 && LA12_0<=36)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIntentSpecification.g:657:1: (lv_entries_1_0= ruleDocItem )
            	    {
            	    // InternalIntentSpecification.g:657:1: (lv_entries_1_0= ruleDocItem )
            	    // InternalIntentSpecification.g:658:3: lv_entries_1_0= ruleDocItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getEntriesDocItemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
            	    lv_entries_1_0=ruleDocItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_1_0, 
            	            		"net.certware.intent.IntentSpecification.DocItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDocItemType"
    // InternalIntentSpecification.g:686:1: entryRuleDocItemType returns [EObject current=null] : iv_ruleDocItemType= ruleDocItemType EOF ;
    public final EObject entryRuleDocItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocItemType = null;


        try {
            // InternalIntentSpecification.g:687:2: (iv_ruleDocItemType= ruleDocItemType EOF )
            // InternalIntentSpecification.g:688:2: iv_ruleDocItemType= ruleDocItemType EOF
            {
             newCompositeNode(grammarAccess.getDocItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocItemType=ruleDocItemType();

            state._fsp--;

             current =iv_ruleDocItemType; 
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
    // $ANTLR end "entryRuleDocItemType"


    // $ANTLR start "ruleDocItemType"
    // InternalIntentSpecification.g:695:1: ruleDocItemType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) ) ) ;
    public final EObject ruleDocItemType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;
        Token lv_typeName_0_6=null;
        Token lv_typeName_0_7=null;

         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:698:28: ( ( ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) ) ) )
            // InternalIntentSpecification.g:699:1: ( ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) ) )
            {
            // InternalIntentSpecification.g:699:1: ( ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) ) )
            // InternalIntentSpecification.g:700:1: ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) )
            {
            // InternalIntentSpecification.g:700:1: ( (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' ) )
            // InternalIntentSpecification.g:701:1: (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' )
            {
            // InternalIntentSpecification.g:701:1: (lv_typeName_0_1= 'condition' | lv_typeName_0_2= 'figure' | lv_typeName_0_3= 'break' | lv_typeName_0_4= 'model' | lv_typeName_0_5= 'paragraph' | lv_typeName_0_6= 'section' | lv_typeName_0_7= 'table' )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            case 35:
                {
                alt13=6;
                }
                break;
            case 36:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalIntentSpecification.g:702:3: lv_typeName_0_1= 'condition'
                    {
                    lv_typeName_0_1=(Token)match(input,30,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getDocItemTypeAccess().getTypeNameConditionKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:714:8: lv_typeName_0_2= 'figure'
                    {
                    lv_typeName_0_2=(Token)match(input,31,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getDocItemTypeAccess().getTypeNameFigureKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:726:8: lv_typeName_0_3= 'break'
                    {
                    lv_typeName_0_3=(Token)match(input,32,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getDocItemTypeAccess().getTypeNameBreakKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:738:8: lv_typeName_0_4= 'model'
                    {
                    lv_typeName_0_4=(Token)match(input,33,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getDocItemTypeAccess().getTypeNameModelKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:750:8: lv_typeName_0_5= 'paragraph'
                    {
                    lv_typeName_0_5=(Token)match(input,34,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getDocItemTypeAccess().getTypeNameParagraphKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:762:8: lv_typeName_0_6= 'section'
                    {
                    lv_typeName_0_6=(Token)match(input,35,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_6, grammarAccess.getDocItemTypeAccess().getTypeNameSectionKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // InternalIntentSpecification.g:774:8: lv_typeName_0_7= 'table'
                    {
                    lv_typeName_0_7=(Token)match(input,36,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_7, grammarAccess.getDocItemTypeAccess().getTypeNameTableKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_7, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleDocItemType"


    // $ANTLR start "entryRuleDocItem"
    // InternalIntentSpecification.g:797:1: entryRuleDocItem returns [EObject current=null] : iv_ruleDocItem= ruleDocItem EOF ;
    public final EObject entryRuleDocItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocItem = null;


        try {
            // InternalIntentSpecification.g:798:2: (iv_ruleDocItem= ruleDocItem EOF )
            // InternalIntentSpecification.g:799:2: iv_ruleDocItem= ruleDocItem EOF
            {
             newCompositeNode(grammarAccess.getDocItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocItem=ruleDocItem();

            state._fsp--;

             current =iv_ruleDocItem; 
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
    // $ANTLR end "entryRuleDocItem"


    // $ANTLR start "ruleDocItem"
    // InternalIntentSpecification.g:806:1: ruleDocItem returns [EObject current=null] : ( ( (lv_type_0_0= ruleDocItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleDocItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_ref_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:809:28: ( ( ( (lv_type_0_0= ruleDocItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalIntentSpecification.g:810:1: ( ( (lv_type_0_0= ruleDocItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalIntentSpecification.g:810:1: ( ( (lv_type_0_0= ruleDocItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalIntentSpecification.g:810:2: ( (lv_type_0_0= ruleDocItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // InternalIntentSpecification.g:810:2: ( (lv_type_0_0= ruleDocItemType ) )
            // InternalIntentSpecification.g:811:1: (lv_type_0_0= ruleDocItemType )
            {
            // InternalIntentSpecification.g:811:1: (lv_type_0_0= ruleDocItemType )
            // InternalIntentSpecification.g:812:3: lv_type_0_0= ruleDocItemType
            {
             
            	        newCompositeNode(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleDocItemType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocItemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"net.certware.intent.IntentSpecification.DocItemType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalIntentSpecification.g:828:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:829:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:829:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:830:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:846:2: ( (lv_ref_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:847:1: (lv_ref_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:847:1: (lv_ref_2_0= RULE_STRING )
            // InternalIntentSpecification.g:848:3: lv_ref_2_0= RULE_STRING
            {
            lv_ref_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_ref_2_0, grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getDocItemAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleDocItem"


    // $ANTLR start "entryRuleModelType"
    // InternalIntentSpecification.g:876:1: entryRuleModelType returns [EObject current=null] : iv_ruleModelType= ruleModelType EOF ;
    public final EObject entryRuleModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelType = null;


        try {
            // InternalIntentSpecification.g:877:2: (iv_ruleModelType= ruleModelType EOF )
            // InternalIntentSpecification.g:878:2: iv_ruleModelType= ruleModelType EOF
            {
             newCompositeNode(grammarAccess.getModelTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelType=ruleModelType();

            state._fsp--;

             current =iv_ruleModelType; 
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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // InternalIntentSpecification.g:885:1: ruleModelType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) ) ) ;
    public final EObject ruleModelType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;
        Token lv_typeName_0_6=null;

         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:888:28: ( ( ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) ) ) )
            // InternalIntentSpecification.g:889:1: ( ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) ) )
            {
            // InternalIntentSpecification.g:889:1: ( ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) ) )
            // InternalIntentSpecification.g:890:1: ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) )
            {
            // InternalIntentSpecification.g:890:1: ( (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' ) )
            // InternalIntentSpecification.g:891:1: (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' )
            {
            // InternalIntentSpecification.g:891:1: (lv_typeName_0_1= 'output' | lv_typeName_0_2= 'mode' | lv_typeName_0_3= 'state' | lv_typeName_0_4= 'macro' | lv_typeName_0_5= 'function' | lv_typeName_0_6= 'input' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            case 41:
                {
                alt14=4;
                }
                break;
            case 42:
                {
                alt14=5;
                }
                break;
            case 43:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalIntentSpecification.g:892:3: lv_typeName_0_1= 'output'
                    {
                    lv_typeName_0_1=(Token)match(input,38,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getModelTypeAccess().getTypeNameOutputKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:904:8: lv_typeName_0_2= 'mode'
                    {
                    lv_typeName_0_2=(Token)match(input,39,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getModelTypeAccess().getTypeNameModeKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:916:8: lv_typeName_0_3= 'state'
                    {
                    lv_typeName_0_3=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getModelTypeAccess().getTypeNameStateKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:928:8: lv_typeName_0_4= 'macro'
                    {
                    lv_typeName_0_4=(Token)match(input,41,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getModelTypeAccess().getTypeNameMacroKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:940:8: lv_typeName_0_5= 'function'
                    {
                    lv_typeName_0_5=(Token)match(input,42,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getModelTypeAccess().getTypeNameFunctionKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:952:8: lv_typeName_0_6= 'input'
                    {
                    lv_typeName_0_6=(Token)match(input,43,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_6, grammarAccess.getModelTypeAccess().getTypeNameInputKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_6, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleModelItem"
    // InternalIntentSpecification.g:975:1: entryRuleModelItem returns [EObject current=null] : iv_ruleModelItem= ruleModelItem EOF ;
    public final EObject entryRuleModelItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelItem = null;


        try {
            // InternalIntentSpecification.g:976:2: (iv_ruleModelItem= ruleModelItem EOF )
            // InternalIntentSpecification.g:977:2: iv_ruleModelItem= ruleModelItem EOF
            {
             newCompositeNode(grammarAccess.getModelItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelItem=ruleModelItem();

            state._fsp--;

             current =iv_ruleModelItem; 
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
    // $ANTLR end "entryRuleModelItem"


    // $ANTLR start "ruleModelItem"
    // InternalIntentSpecification.g:984:1: ruleModelItem returns [EObject current=null] : ( ( (lv_type_0_0= ruleModelType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleModelItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:987:28: ( ( ( (lv_type_0_0= ruleModelType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalIntentSpecification.g:988:1: ( ( (lv_type_0_0= ruleModelType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalIntentSpecification.g:988:1: ( ( (lv_type_0_0= ruleModelType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalIntentSpecification.g:988:2: ( (lv_type_0_0= ruleModelType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // InternalIntentSpecification.g:988:2: ( (lv_type_0_0= ruleModelType ) )
            // InternalIntentSpecification.g:989:1: (lv_type_0_0= ruleModelType )
            {
            // InternalIntentSpecification.g:989:1: (lv_type_0_0= ruleModelType )
            // InternalIntentSpecification.g:990:3: lv_type_0_0= ruleModelType
            {
             
            	        newCompositeNode(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleModelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelItemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"net.certware.intent.IntentSpecification.ModelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalIntentSpecification.g:1006:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:1007:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:1007:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:1008:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:1024:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:1025:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:1025:1: (lv_desc_2_0= RULE_STRING )
            // InternalIntentSpecification.g:1026:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getModelItemAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleModelItem"


    // $ANTLR start "entryRuleListItemType"
    // InternalIntentSpecification.g:1054:1: entryRuleListItemType returns [EObject current=null] : iv_ruleListItemType= ruleListItemType EOF ;
    public final EObject entryRuleListItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItemType = null;


        try {
            // InternalIntentSpecification.g:1055:2: (iv_ruleListItemType= ruleListItemType EOF )
            // InternalIntentSpecification.g:1056:2: iv_ruleListItemType= ruleListItemType EOF
            {
             newCompositeNode(grammarAccess.getListItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListItemType=ruleListItemType();

            state._fsp--;

             current =iv_ruleListItemType; 
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
    // $ANTLR end "entryRuleListItemType"


    // $ANTLR start "ruleListItemType"
    // InternalIntentSpecification.g:1063:1: ruleListItemType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) ) ) ;
    public final EObject ruleListItemType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;

         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:1066:28: ( ( ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) ) ) )
            // InternalIntentSpecification.g:1067:1: ( ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) ) )
            {
            // InternalIntentSpecification.g:1067:1: ( ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) ) )
            // InternalIntentSpecification.g:1068:1: ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) )
            {
            // InternalIntentSpecification.g:1068:1: ( (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' ) )
            // InternalIntentSpecification.g:1069:1: (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' )
            {
            // InternalIntentSpecification.g:1069:1: (lv_typeName_0_1= 'requirement' | lv_typeName_0_2= 'goal' | lv_typeName_0_3= 'hazard' | lv_typeName_0_4= 'constraint' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt15=1;
                }
                break;
            case 45:
                {
                alt15=2;
                }
                break;
            case 46:
                {
                alt15=3;
                }
                break;
            case 47:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalIntentSpecification.g:1070:3: lv_typeName_0_1= 'requirement'
                    {
                    lv_typeName_0_1=(Token)match(input,44,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getListItemTypeAccess().getTypeNameRequirementKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:1082:8: lv_typeName_0_2= 'goal'
                    {
                    lv_typeName_0_2=(Token)match(input,45,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getListItemTypeAccess().getTypeNameGoalKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:1094:8: lv_typeName_0_3= 'hazard'
                    {
                    lv_typeName_0_3=(Token)match(input,46,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getListItemTypeAccess().getTypeNameHazardKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:1106:8: lv_typeName_0_4= 'constraint'
                    {
                    lv_typeName_0_4=(Token)match(input,47,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getListItemTypeAccess().getTypeNameConstraintKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListItemTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleListItemType"


    // $ANTLR start "entryRuleListItem"
    // InternalIntentSpecification.g:1129:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalIntentSpecification.g:1130:2: (iv_ruleListItem= ruleListItem EOF )
            // InternalIntentSpecification.g:1131:2: iv_ruleListItem= ruleListItem EOF
            {
             newCompositeNode(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListItem=ruleListItem();

            state._fsp--;

             current =iv_ruleListItem; 
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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalIntentSpecification.g:1138:1: ruleListItem returns [EObject current=null] : ( ( (lv_type_0_0= ruleListItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )? otherlv_12= ';' ) ;
    public final EObject ruleListItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalIntentSpecification.g:1141:28: ( ( ( (lv_type_0_0= ruleListItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )? otherlv_12= ';' ) )
            // InternalIntentSpecification.g:1142:1: ( ( (lv_type_0_0= ruleListItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )? otherlv_12= ';' )
            {
            // InternalIntentSpecification.g:1142:1: ( ( (lv_type_0_0= ruleListItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )? otherlv_12= ';' )
            // InternalIntentSpecification.g:1142:2: ( (lv_type_0_0= ruleListItemType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )? otherlv_12= ';'
            {
            // InternalIntentSpecification.g:1142:2: ( (lv_type_0_0= ruleListItemType ) )
            // InternalIntentSpecification.g:1143:1: (lv_type_0_0= ruleListItemType )
            {
            // InternalIntentSpecification.g:1143:1: (lv_type_0_0= ruleListItemType )
            // InternalIntentSpecification.g:1144:3: lv_type_0_0= ruleListItemType
            {
             
            	        newCompositeNode(grammarAccess.getListItemAccess().getTypeListItemTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleListItemType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListItemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"net.certware.intent.IntentSpecification.ListItemType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalIntentSpecification.g:1160:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalIntentSpecification.g:1161:1: (lv_name_1_0= RULE_ID )
            {
            // InternalIntentSpecification.g:1161:1: (lv_name_1_0= RULE_ID )
            // InternalIntentSpecification.g:1162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getListItemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalIntentSpecification.g:1178:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalIntentSpecification.g:1179:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalIntentSpecification.g:1179:1: (lv_desc_2_0= RULE_STRING )
            // InternalIntentSpecification.g:1180:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getListItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalIntentSpecification.g:1196:2: (otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIntentSpecification.g:1196:4: otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                        	newLeafNode(otherlv_3, grammarAccess.getListItemAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalIntentSpecification.g:1200:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:1201:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalIntentSpecification.g:1201:1: (otherlv_4= RULE_ID )
                    	    // InternalIntentSpecification.g:1202:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getListItemRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getListItemAccess().getDocReferencesDocItemCrossReference_3_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_22); 

                        	newLeafNode(otherlv_5, grammarAccess.getListItemAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // InternalIntentSpecification.g:1217:3: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIntentSpecification.g:1217:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getListItemAccess().getLeftParenthesisKeyword_4_0());
                        
                    // InternalIntentSpecification.g:1221:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:1222:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIntentSpecification.g:1222:1: (otherlv_7= RULE_ID )
                    	    // InternalIntentSpecification.g:1223:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getListItemRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getListItemAccess().getItemReferencesListItemCrossReference_4_1_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,25,FOLLOW_24); 

                        	newLeafNode(otherlv_8, grammarAccess.getListItemAccess().getRightParenthesisKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalIntentSpecification.g:1238:3: (otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIntentSpecification.g:1238:5: otherlv_9= '[' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_3); 

                        	newLeafNode(otherlv_9, grammarAccess.getListItemAccess().getLeftSquareBracketKeyword_5_0());
                        
                    // InternalIntentSpecification.g:1242:1: ( (otherlv_10= RULE_ID ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalIntentSpecification.g:1243:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalIntentSpecification.g:1243:1: (otherlv_10= RULE_ID )
                    	    // InternalIntentSpecification.g:1244:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getListItemRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getListItemAccess().getModelReferencesModelItemCrossReference_5_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_19); 

                        	newLeafNode(otherlv_11, grammarAccess.getListItemAccess().getRightSquareBracketKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getListItemAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleListItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001500002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000FC000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000F00002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001FC0200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002001500000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002001400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800010L});

}