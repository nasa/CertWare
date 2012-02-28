package net.certware.argument.sfp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.sfp.services.SemiFormalProofGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemiFormalProofParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Theorem'", "':'", "'('", "')'", "','", "'hypothesis'", "'epsilon'", "'->'", "'^'", "'.'", "'{'", "'}'", "'unknown'", "'valid'", "'invalid'"
    };
    public static final int RULE_ID=6;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
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


        public InternalSemiFormalProofParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemiFormalProofParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemiFormalProofParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g"; }



     	private SemiFormalProofGrammarAccess grammarAccess;
     	
        public InternalSemiFormalProofParser(TokenStream input, SemiFormalProofGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Proof";	
       	}
       	
       	@Override
       	protected SemiFormalProofGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProof"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:68:1: entryRuleProof returns [EObject current=null] : iv_ruleProof= ruleProof EOF ;
    public final EObject entryRuleProof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProof = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:69:2: (iv_ruleProof= ruleProof EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:70:2: iv_ruleProof= ruleProof EOF
            {
             newCompositeNode(grammarAccess.getProofRule()); 
            pushFollow(FOLLOW_ruleProof_in_entryRuleProof75);
            iv_ruleProof=ruleProof();

            state._fsp--;

             current =iv_ruleProof; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProof85); 

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
    // $ANTLR end "entryRuleProof"


    // $ANTLR start "ruleProof"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:77:1: ruleProof returns [EObject current=null] : (otherlv_0= 'Theorem' otherlv_1= ':' ( (lv_title_2_0= ruleText ) ) otherlv_3= '(' ( (lv_justifications_4_0= ruleJustifications ) ) otherlv_5= ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) ;
    public final EObject ruleProof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_justifications_4_0 = null;

        EObject lv_proofSteps_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:80:28: ( (otherlv_0= 'Theorem' otherlv_1= ':' ( (lv_title_2_0= ruleText ) ) otherlv_3= '(' ( (lv_justifications_4_0= ruleJustifications ) ) otherlv_5= ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:81:1: (otherlv_0= 'Theorem' otherlv_1= ':' ( (lv_title_2_0= ruleText ) ) otherlv_3= '(' ( (lv_justifications_4_0= ruleJustifications ) ) otherlv_5= ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:81:1: (otherlv_0= 'Theorem' otherlv_1= ':' ( (lv_title_2_0= ruleText ) ) otherlv_3= '(' ( (lv_justifications_4_0= ruleJustifications ) ) otherlv_5= ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:81:3: otherlv_0= 'Theorem' otherlv_1= ':' ( (lv_title_2_0= ruleText ) ) otherlv_3= '(' ( (lv_justifications_4_0= ruleJustifications ) ) otherlv_5= ')' ( (lv_proofSteps_6_0= ruleProofSteps ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProof122); 

                	newLeafNode(otherlv_0, grammarAccess.getProofAccess().getTheoremKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProof134); 

                	newLeafNode(otherlv_1, grammarAccess.getProofAccess().getColonKeyword_1());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:89:1: ( (lv_title_2_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:90:1: (lv_title_2_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:90:1: (lv_title_2_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:91:3: lv_title_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleProof155);
            lv_title_2_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProofRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProof167); 

                	newLeafNode(otherlv_3, grammarAccess.getProofAccess().getLeftParenthesisKeyword_3());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:111:1: ( (lv_justifications_4_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:112:1: (lv_justifications_4_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:112:1: (lv_justifications_4_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:113:3: lv_justifications_4_0= ruleJustifications
            {
             
            	        newCompositeNode(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleJustifications_in_ruleProof188);
            lv_justifications_4_0=ruleJustifications();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProofRule());
            	        }
                   		set(
                   			current, 
                   			"justifications",
                    		lv_justifications_4_0, 
                    		"Justifications");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProof200); 

                	newLeafNode(otherlv_5, grammarAccess.getProofAccess().getRightParenthesisKeyword_5());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:133:1: ( (lv_proofSteps_6_0= ruleProofSteps ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:134:1: (lv_proofSteps_6_0= ruleProofSteps )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:134:1: (lv_proofSteps_6_0= ruleProofSteps )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:135:3: lv_proofSteps_6_0= ruleProofSteps
            {
             
            	        newCompositeNode(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleProofSteps_in_ruleProof221);
            lv_proofSteps_6_0=ruleProofSteps();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProofRule());
            	        }
                   		set(
                   			current, 
                   			"proofSteps",
                    		lv_proofSteps_6_0, 
                    		"ProofSteps");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleProof"


    // $ANTLR start "entryRuleText"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:159:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:160:2: (iv_ruleText= ruleText EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:161:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText258);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText269); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:168:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:171:28: (this_STRING_0= RULE_STRING )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:172:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText308); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleJustifications"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:187:1: entryRuleJustifications returns [EObject current=null] : iv_ruleJustifications= ruleJustifications EOF ;
    public final EObject entryRuleJustifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustifications = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:188:2: (iv_ruleJustifications= ruleJustifications EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:189:2: iv_ruleJustifications= ruleJustifications EOF
            {
             newCompositeNode(grammarAccess.getJustificationsRule()); 
            pushFollow(FOLLOW_ruleJustifications_in_entryRuleJustifications352);
            iv_ruleJustifications=ruleJustifications();

            state._fsp--;

             current =iv_ruleJustifications; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustifications362); 

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
    // $ANTLR end "entryRuleJustifications"


    // $ANTLR start "ruleJustifications"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:196:1: ruleJustifications returns [EObject current=null] : ( () ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) ;
    public final EObject ruleJustifications() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_justifications_1_0 = null;

        EObject lv_justifications_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:199:28: ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:200:1: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:200:1: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:200:2: () ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:200:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:201:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJustificationsAccess().getJustificationsAction_0(),
                        current);
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:206:2: ( ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)||(LA2_0>=16 && LA2_0<=17)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:206:3: ( (lv_justifications_1_0= ruleJustification ) ) (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:206:3: ( (lv_justifications_1_0= ruleJustification ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:207:1: (lv_justifications_1_0= ruleJustification )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:207:1: (lv_justifications_1_0= ruleJustification )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:208:3: lv_justifications_1_0= ruleJustification
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJustification_in_ruleJustifications418);
                    lv_justifications_1_0=ruleJustification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationsRule());
                    	        }
                           		add(
                           			current, 
                           			"justifications",
                            		lv_justifications_1_0, 
                            		"Justification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:224:2: (otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:224:4: otherlv_2= ',' ( (lv_justifications_3_0= ruleJustification ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJustifications431); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJustificationsAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:228:1: ( (lv_justifications_3_0= ruleJustification ) )
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:229:1: (lv_justifications_3_0= ruleJustification )
                    	    {
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:229:1: (lv_justifications_3_0= ruleJustification )
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:230:3: lv_justifications_3_0= ruleJustification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJustification_in_ruleJustifications452);
                    	    lv_justifications_3_0=ruleJustification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJustificationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"justifications",
                    	            		lv_justifications_3_0, 
                    	            		"Justification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleJustifications"


    // $ANTLR start "entryRuleJustification"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:254:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:255:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:256:2: iv_ruleJustification= ruleJustification EOF
            {
             newCompositeNode(grammarAccess.getJustificationRule()); 
            pushFollow(FOLLOW_ruleJustification_in_entryRuleJustification492);
            iv_ruleJustification=ruleJustification();

            state._fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustification502); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:263:1: ruleJustification returns [EObject current=null] : ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) ) ;
    public final EObject ruleJustification() throws RecognitionException {
        EObject current = null;

        Token lv_hypothesis_1_0=null;
        Token lv_epsilon_2_0=null;
        AntlrDatatypeRuleToken lv_numeral_3_0 = null;

        EObject lv_assertion_4_0 = null;

        EObject lv_entailment_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:266:28: ( ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=18 && LA3_3<=19)) ) {
                    alt3=5;
                }
                else if ( (LA3_3==EOF||(LA3_3>=14 && LA3_3<=15)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:2: ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:2: ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:3: () ( (lv_hypothesis_1_0= 'hypothesis' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:267:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:268:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getJustificationAccess().getJustificationAction_0_0(),
                                current);
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:273:2: ( (lv_hypothesis_1_0= 'hypothesis' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:274:1: (lv_hypothesis_1_0= 'hypothesis' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:274:1: (lv_hypothesis_1_0= 'hypothesis' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:275:3: lv_hypothesis_1_0= 'hypothesis'
                    {
                    lv_hypothesis_1_0=(Token)match(input,16,FOLLOW_16_in_ruleJustification555); 

                            newLeafNode(lv_hypothesis_1_0, grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJustificationRule());
                    	        }
                           		setWithLastConsumed(current, "hypothesis", true, "hypothesis");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:289:6: ( (lv_epsilon_2_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:289:6: ( (lv_epsilon_2_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:290:1: (lv_epsilon_2_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:290:1: (lv_epsilon_2_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:291:3: lv_epsilon_2_0= 'epsilon'
                    {
                    lv_epsilon_2_0=(Token)match(input,17,FOLLOW_17_in_ruleJustification593); 

                            newLeafNode(lv_epsilon_2_0, grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJustificationRule());
                    	        }
                           		setWithLastConsumed(current, "epsilon", true, "epsilon");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:305:6: ( (lv_numeral_3_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:305:6: ( (lv_numeral_3_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:306:1: (lv_numeral_3_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:306:1: (lv_numeral_3_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:307:3: lv_numeral_3_0= ruleNumeral
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleJustification633);
                    lv_numeral_3_0=ruleNumeral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"numeral",
                            		lv_numeral_3_0, 
                            		"Numeral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:324:6: ( (lv_assertion_4_0= ruleQuotedAssertion ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:324:6: ( (lv_assertion_4_0= ruleQuotedAssertion ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:325:1: (lv_assertion_4_0= ruleQuotedAssertion )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:325:1: (lv_assertion_4_0= ruleQuotedAssertion )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:326:3: lv_assertion_4_0= ruleQuotedAssertion
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuotedAssertion_in_ruleJustification660);
                    lv_assertion_4_0=ruleQuotedAssertion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"assertion",
                            		lv_assertion_4_0, 
                            		"QuotedAssertion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:343:6: ( (lv_entailment_5_0= ruleEntailment ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:343:6: ( (lv_entailment_5_0= ruleEntailment ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:344:1: (lv_entailment_5_0= ruleEntailment )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:344:1: (lv_entailment_5_0= ruleEntailment )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:345:3: lv_entailment_5_0= ruleEntailment
                    {
                     
                    	        newCompositeNode(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntailment_in_ruleJustification687);
                    lv_entailment_5_0=ruleEntailment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJustificationRule());
                    	        }
                           		set(
                           			current, 
                           			"entailment",
                            		lv_entailment_5_0, 
                            		"Entailment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleJustification"


    // $ANTLR start "entryRuleQuotedAssertion"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:369:1: entryRuleQuotedAssertion returns [EObject current=null] : iv_ruleQuotedAssertion= ruleQuotedAssertion EOF ;
    public final EObject entryRuleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedAssertion = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:370:2: (iv_ruleQuotedAssertion= ruleQuotedAssertion EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:371:2: iv_ruleQuotedAssertion= ruleQuotedAssertion EOF
            {
             newCompositeNode(grammarAccess.getQuotedAssertionRule()); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion723);
            iv_ruleQuotedAssertion=ruleQuotedAssertion();

            state._fsp--;

             current =iv_ruleQuotedAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedAssertion733); 

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
    // $ANTLR end "entryRuleQuotedAssertion"


    // $ANTLR start "ruleQuotedAssertion"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:378:1: ruleQuotedAssertion returns [EObject current=null] : ( () ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:381:28: ( ( () ( (lv_text_1_0= ruleText ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:382:1: ( () ( (lv_text_1_0= ruleText ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:382:1: ( () ( (lv_text_1_0= ruleText ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:382:2: () ( (lv_text_1_0= ruleText ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:382:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:383:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0(),
                        current);
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:388:2: ( (lv_text_1_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:389:1: (lv_text_1_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:389:1: (lv_text_1_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:390:3: lv_text_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleQuotedAssertion788);
            lv_text_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuotedAssertionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleQuotedAssertion"


    // $ANTLR start "entryRuleEntailment"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:414:1: entryRuleEntailment returns [EObject current=null] : iv_ruleEntailment= ruleEntailment EOF ;
    public final EObject entryRuleEntailment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntailment = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:415:2: (iv_ruleEntailment= ruleEntailment EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:416:2: iv_ruleEntailment= ruleEntailment EOF
            {
             newCompositeNode(grammarAccess.getEntailmentRule()); 
            pushFollow(FOLLOW_ruleEntailment_in_entryRuleEntailment824);
            iv_ruleEntailment=ruleEntailment();

            state._fsp--;

             current =iv_ruleEntailment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntailment834); 

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
    // $ANTLR end "entryRuleEntailment"


    // $ANTLR start "ruleEntailment"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:423:1: ruleEntailment returns [EObject current=null] : ( () ( (lv_head_1_0= ruleConjunction ) ) otherlv_2= '->' ( (lv_tail_3_0= ruleNumeral ) ) ) ;
    public final EObject ruleEntailment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_head_1_0 = null;

        AntlrDatatypeRuleToken lv_tail_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:426:28: ( ( () ( (lv_head_1_0= ruleConjunction ) ) otherlv_2= '->' ( (lv_tail_3_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:427:1: ( () ( (lv_head_1_0= ruleConjunction ) ) otherlv_2= '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:427:1: ( () ( (lv_head_1_0= ruleConjunction ) ) otherlv_2= '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:427:2: () ( (lv_head_1_0= ruleConjunction ) ) otherlv_2= '->' ( (lv_tail_3_0= ruleNumeral ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:427:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:428:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntailmentAccess().getEntailmentAction_0(),
                        current);
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:433:2: ( (lv_head_1_0= ruleConjunction ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:434:1: (lv_head_1_0= ruleConjunction )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:434:1: (lv_head_1_0= ruleConjunction )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:435:3: lv_head_1_0= ruleConjunction
            {
             
            	        newCompositeNode(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConjunction_in_ruleEntailment889);
            lv_head_1_0=ruleConjunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntailmentRule());
            	        }
                   		set(
                   			current, 
                   			"head",
                    		lv_head_1_0, 
                    		"Conjunction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEntailment901); 

                	newLeafNode(otherlv_2, grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:455:1: ( (lv_tail_3_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:456:1: (lv_tail_3_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:456:1: (lv_tail_3_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:457:3: lv_tail_3_0= ruleNumeral
            {
             
            	        newCompositeNode(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleEntailment922);
            lv_tail_3_0=ruleNumeral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntailmentRule());
            	        }
                   		set(
                   			current, 
                   			"tail",
                    		lv_tail_3_0, 
                    		"Numeral");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEntailment"


    // $ANTLR start "entryRuleConjunction"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:481:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:482:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:483:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction958);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction968); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:490:1: ruleConjunction returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        AntlrDatatypeRuleToken lv_lhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:493:28: ( ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==18) ) {
                    alt4=2;
                }
                else if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:3: () ( (lv_lhs_1_0= ruleNumeral ) ) otherlv_2= '^' ( (lv_rhs_3_0= ruleConjunction ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:494:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:495:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConjunctionAccess().getConjunctionAction_0_0(),
                                current);
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:500:2: ( (lv_lhs_1_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:501:1: (lv_lhs_1_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:501:1: (lv_lhs_1_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:502:3: lv_lhs_1_0= ruleNumeral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1024);
                    lv_lhs_1_0=ruleNumeral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_0, 
                            		"Numeral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConjunction1036); 

                        	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2());
                        
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:522:1: ( (lv_rhs_3_0= ruleConjunction ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:523:1: (lv_rhs_3_0= ruleConjunction )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:523:1: (lv_rhs_3_0= ruleConjunction )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:524:3: lv_rhs_3_0= ruleConjunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction1057);
                    lv_rhs_3_0=ruleConjunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_0, 
                            		"Conjunction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:541:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:541:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:542:1: (lv_lhs_4_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:542:1: (lv_lhs_4_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:543:3: lv_lhs_4_0= ruleNumeral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1085);
                    lv_lhs_4_0=ruleNumeral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_4_0, 
                            		"Numeral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNumeral"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:567:1: entryRuleNumeral returns [String current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final String entryRuleNumeral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeral = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:568:2: (iv_ruleNumeral= ruleNumeral EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:569:2: iv_ruleNumeral= ruleNumeral EOF
            {
             newCompositeNode(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral1122);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;

             current =iv_ruleNumeral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral1133); 

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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:576:1: ruleNumeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:579:28: (this_INT_0= RULE_INT )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:580:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumeral1172); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumeralAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "entryRuleProofSteps"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:595:1: entryRuleProofSteps returns [EObject current=null] : iv_ruleProofSteps= ruleProofSteps EOF ;
    public final EObject entryRuleProofSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProofSteps = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:596:2: (iv_ruleProofSteps= ruleProofSteps EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:597:2: iv_ruleProofSteps= ruleProofSteps EOF
            {
             newCompositeNode(grammarAccess.getProofStepsRule()); 
            pushFollow(FOLLOW_ruleProofSteps_in_entryRuleProofSteps1216);
            iv_ruleProofSteps=ruleProofSteps();

            state._fsp--;

             current =iv_ruleProofSteps; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProofSteps1226); 

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
    // $ANTLR end "entryRuleProofSteps"


    // $ANTLR start "ruleProofSteps"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:604:1: ruleProofSteps returns [EObject current=null] : ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) ;
    public final EObject ruleProofSteps() throws RecognitionException {
        EObject current = null;

        Token lv_epsilon_3_0=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:607:28: ( ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:3: () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:608:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:609:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getProofStepsAccess().getProofStepsAction_0_0(),
                                current);
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:614:2: ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:614:3: ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )*
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:614:3: ( (lv_statements_1_0= ruleStatement ) )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:1: (lv_statements_1_0= ruleStatement )
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:1: (lv_statements_1_0= ruleStatement )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:3: lv_statements_1_0= ruleStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1283);
                            lv_statements_1_0=ruleStatement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProofStepsRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"statements",
                                    		lv_statements_1_0, 
                                    		"Statement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:632:2: ( (lv_statements_2_0= ruleStatement ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_INT) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:633:1: (lv_statements_2_0= ruleStatement )
                            	    {
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:633:1: (lv_statements_2_0= ruleStatement )
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:634:3: lv_statements_2_0= ruleStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1304);
                            	    lv_statements_2_0=ruleStatement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProofStepsRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"statements",
                            	            		lv_statements_2_0, 
                            	            		"Statement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:651:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:651:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:652:1: (lv_epsilon_3_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:652:1: (lv_epsilon_3_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:653:3: lv_epsilon_3_0= 'epsilon'
                    {
                    lv_epsilon_3_0=(Token)match(input,17,FOLLOW_17_in_ruleProofSteps1332); 

                            newLeafNode(lv_epsilon_3_0, grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProofStepsRule());
                    	        }
                           		setWithLastConsumed(current, "epsilon", true, "epsilon");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleProofSteps"


    // $ANTLR start "entryRuleStatement"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:674:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:675:2: (iv_ruleStatement= ruleStatement EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:676:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1381);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1391); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:683:1: ruleStatement returns [EObject current=null] : ( () ( (lv_id_1_0= ruleNumeral ) ) otherlv_2= '.' ( (lv_statement_3_0= ruleText ) ) otherlv_4= '(' ( (lv_justification_5_0= ruleJustifications ) ) otherlv_6= ')' (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_statement_3_0 = null;

        EObject lv_justification_5_0 = null;

        EObject lv_validation_8_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:686:28: ( ( () ( (lv_id_1_0= ruleNumeral ) ) otherlv_2= '.' ( (lv_statement_3_0= ruleText ) ) otherlv_4= '(' ( (lv_justification_5_0= ruleJustifications ) ) otherlv_6= ')' (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )? ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:687:1: ( () ( (lv_id_1_0= ruleNumeral ) ) otherlv_2= '.' ( (lv_statement_3_0= ruleText ) ) otherlv_4= '(' ( (lv_justification_5_0= ruleJustifications ) ) otherlv_6= ')' (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )? )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:687:1: ( () ( (lv_id_1_0= ruleNumeral ) ) otherlv_2= '.' ( (lv_statement_3_0= ruleText ) ) otherlv_4= '(' ( (lv_justification_5_0= ruleJustifications ) ) otherlv_6= ')' (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )? )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:687:2: () ( (lv_id_1_0= ruleNumeral ) ) otherlv_2= '.' ( (lv_statement_3_0= ruleText ) ) otherlv_4= '(' ( (lv_justification_5_0= ruleJustifications ) ) otherlv_6= ')' (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )?
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:687:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatementAccess().getStatementAction_0(),
                        current);
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:693:2: ( (lv_id_1_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:694:1: (lv_id_1_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:694:1: (lv_id_1_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:695:3: lv_id_1_0= ruleNumeral
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleStatement1446);
            lv_id_1_0=ruleNumeral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"Numeral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStatement1458); 

                	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_2());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:715:1: ( (lv_statement_3_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:716:1: (lv_statement_3_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:716:1: (lv_statement_3_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:717:3: lv_statement_3_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleStatement1479);
            lv_statement_3_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_3_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStatement1491); 

                	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:737:1: ( (lv_justification_5_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:738:1: (lv_justification_5_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:738:1: (lv_justification_5_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:739:3: lv_justification_5_0= ruleJustifications
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleJustifications_in_ruleStatement1512);
            lv_justification_5_0=ruleJustifications();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"justification",
                    		lv_justification_5_0, 
                    		"Justifications");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleStatement1524); 

                	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getRightParenthesisKeyword_6());
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:759:1: (otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:759:3: otherlv_7= '{' ( (lv_validation_8_0= ruleValidation ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleStatement1537); 

                        	newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:763:1: ( (lv_validation_8_0= ruleValidation ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:764:1: (lv_validation_8_0= ruleValidation )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:764:1: (lv_validation_8_0= ruleValidation )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:765:3: lv_validation_8_0= ruleValidation
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getValidationValidationParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidation_in_ruleStatement1558);
                    lv_validation_8_0=ruleValidation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"validation",
                            		lv_validation_8_0, 
                            		"Validation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleStatement1570); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_7_2());
                        

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleValidation"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:793:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:794:2: (iv_ruleValidation= ruleValidation EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:795:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_ruleValidation_in_entryRuleValidation1608);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidation1618); 

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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:802:1: ruleValidation returns [EObject current=null] : ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_author_1_0 = null;

        AntlrDatatypeRuleToken lv_timeStamp_2_0 = null;

        Enumerator lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:805:28: ( ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:806:1: ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:806:1: ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:806:2: () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:806:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:807:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValidationAccess().getValidationAction_0(),
                        current);
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:812:2: ( (lv_author_1_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:813:1: (lv_author_1_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:813:1: (lv_author_1_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:814:3: lv_author_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getValidationAccess().getAuthorTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleValidation1673);
            lv_author_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidationRule());
            	        }
                   		set(
                   			current, 
                   			"author",
                    		lv_author_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:830:2: ( (lv_timeStamp_2_0= ruleText ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:831:1: (lv_timeStamp_2_0= ruleText )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:831:1: (lv_timeStamp_2_0= ruleText )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:832:3: lv_timeStamp_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidationAccess().getTimeStampTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleValidation1694);
                    lv_timeStamp_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidationRule());
                    	        }
                           		set(
                           			current, 
                           			"timeStamp",
                            		lv_timeStamp_2_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:848:3: ( (lv_state_3_0= ruleValidationKind ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:849:1: (lv_state_3_0= ruleValidationKind )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:849:1: (lv_state_3_0= ruleValidationKind )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:850:3: lv_state_3_0= ruleValidationKind
            {
             
            	        newCompositeNode(grammarAccess.getValidationAccess().getStateValidationKindEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValidationKind_in_ruleValidation1716);
            lv_state_3_0=ruleValidationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidationRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_3_0, 
                    		"ValidationKind");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "ruleValidationKind"
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:874:1: ruleValidationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'valid' ) | (enumLiteral_2= 'invalid' ) ) ;
    public final Enumerator ruleValidationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:876:28: ( ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'valid' ) | (enumLiteral_2= 'invalid' ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:877:1: ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'valid' ) | (enumLiteral_2= 'invalid' ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:877:1: ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'valid' ) | (enumLiteral_2= 'invalid' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:877:2: (enumLiteral_0= 'unknown' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:877:2: (enumLiteral_0= 'unknown' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:877:4: enumLiteral_0= 'unknown'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleValidationKind1766); 

                            current = grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:883:6: (enumLiteral_1= 'valid' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:883:6: (enumLiteral_1= 'valid' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:883:8: enumLiteral_1= 'valid'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleValidationKind1783); 

                            current = grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:889:6: (enumLiteral_2= 'invalid' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:889:6: (enumLiteral_2= 'invalid' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:889:8: enumLiteral_2= 'invalid'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleValidationKind1800); 

                            current = grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleValidationKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProof_in_entryRuleProof75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProof85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProof122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProof134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleText_in_ruleProof155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProof167 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_ruleJustifications_in_ruleProof188 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProof200 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleProofSteps_in_ruleProof221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_entryRuleJustifications352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifications362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications418 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleJustifications431 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications452 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustification502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJustification555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleJustification593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleJustification633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_ruleJustification660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_ruleJustification687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedAssertion733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleQuotedAssertion788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_entryRuleEntailment824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntailment834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleEntailment889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntailment901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleEntailment922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConjunction1036 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumeral1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_entryRuleProofSteps1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProofSteps1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1283 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1304 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17_in_ruleProofSteps1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleStatement1446 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement1458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleText_in_ruleStatement1479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement1491 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_ruleJustifications_in_ruleStatement1512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatement1524 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleStatement1537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidation_in_ruleStatement1558 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStatement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidation_in_entryRuleValidation1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidation1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleValidation1673 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_ruleText_in_ruleValidation1694 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_ruleValidationKind_in_ruleValidation1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValidationKind1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValidationKind1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValidationKind1800 = new BitSet(new long[]{0x0000000000000002L});

}