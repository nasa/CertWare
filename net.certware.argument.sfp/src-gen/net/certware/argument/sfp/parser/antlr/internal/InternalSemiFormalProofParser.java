package net.certware.argument.sfp.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSemiFormalProofParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g"; }



     	private SemiFormalProofGrammarAccess grammarAccess;
     	
        public InternalSemiFormalProofParser(TokenStream input, IAstFactory factory, SemiFormalProofGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Proof";	
       	}
       	
       	@Override
       	protected SemiFormalProofGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProof
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:78:1: entryRuleProof returns [EObject current=null] : iv_ruleProof= ruleProof EOF ;
    public final EObject entryRuleProof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProof = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:79:2: (iv_ruleProof= ruleProof EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:80:2: iv_ruleProof= ruleProof EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProofRule(), currentNode); 
            pushFollow(FOLLOW_ruleProof_in_entryRuleProof75);
            iv_ruleProof=ruleProof();
            _fsp--;

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
    // $ANTLR end entryRuleProof


    // $ANTLR start ruleProof
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:87:1: ruleProof returns [EObject current=null] : ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) ;
    public final EObject ruleProof() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_justifications_4_0 = null;

        EObject lv_proofSteps_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:92:6: ( ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:93:1: ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:93:1: ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:93:3: 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) )
            {
            match(input,11,FOLLOW_11_in_ruleProof120); 

                    createLeafNode(grammarAccess.getProofAccess().getTheoremKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProof130); 

                    createLeafNode(grammarAccess.getProofAccess().getColonKeyword_1(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:101:1: ( (lv_title_2_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:102:1: (lv_title_2_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:102:1: (lv_title_2_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:103:3: lv_title_2_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleProof151);
            lv_title_2_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProofRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_2_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleProof161); 

                    createLeafNode(grammarAccess.getProofAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:129:1: ( (lv_justifications_4_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:130:1: (lv_justifications_4_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:130:1: (lv_justifications_4_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:131:3: lv_justifications_4_0= ruleJustifications
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJustifications_in_ruleProof182);
            lv_justifications_4_0=ruleJustifications();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProofRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"justifications",
            	        		lv_justifications_4_0, 
            	        		"Justifications", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleProof192); 

                    createLeafNode(grammarAccess.getProofAccess().getRightParenthesisKeyword_5(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:157:1: ( (lv_proofSteps_6_0= ruleProofSteps ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:158:1: (lv_proofSteps_6_0= ruleProofSteps )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:158:1: (lv_proofSteps_6_0= ruleProofSteps )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:159:3: lv_proofSteps_6_0= ruleProofSteps
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProofSteps_in_ruleProof213);
            lv_proofSteps_6_0=ruleProofSteps();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProofRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"proofSteps",
            	        		lv_proofSteps_6_0, 
            	        		"ProofSteps", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleProof


    // $ANTLR start entryRuleText
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:189:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:190:2: (iv_ruleText= ruleText EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:191:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText250);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText261); 

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:198:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:203:6: (this_STRING_0= RULE_STRING )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:204:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText300); 

            		current.merge(this_STRING_0);
                
             
                createLeafNode(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall(), null); 
                

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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleJustifications
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:219:1: entryRuleJustifications returns [EObject current=null] : iv_ruleJustifications= ruleJustifications EOF ;
    public final EObject entryRuleJustifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustifications = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:220:2: (iv_ruleJustifications= ruleJustifications EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:221:2: iv_ruleJustifications= ruleJustifications EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJustificationsRule(), currentNode); 
            pushFollow(FOLLOW_ruleJustifications_in_entryRuleJustifications344);
            iv_ruleJustifications=ruleJustifications();
            _fsp--;

             current =iv_ruleJustifications; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustifications354); 

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
    // $ANTLR end entryRuleJustifications


    // $ANTLR start ruleJustifications
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:228:1: ruleJustifications returns [EObject current=null] : ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) ;
    public final EObject ruleJustifications() throws RecognitionException {
        EObject current = null;

        EObject lv_justifications_1_0 = null;

        EObject lv_justifications_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:6: ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:234:1: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:234:1: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:234:2: () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:234:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:235:5: 
            {
             
                    temp=factory.create(grammarAccess.getJustificationsAccess().getJustificationsAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:245:2: ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)||(LA2_0>=16 && LA2_0<=17)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:245:3: ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:245:3: ( (lv_justifications_1_0= ruleJustification ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:246:1: (lv_justifications_1_0= ruleJustification )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:246:1: (lv_justifications_1_0= ruleJustification )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:247:3: lv_justifications_1_0= ruleJustification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleJustification_in_ruleJustifications410);
                    lv_justifications_1_0=ruleJustification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"justifications",
                    	        		lv_justifications_1_0, 
                    	        		"Justification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:269:2: ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:269:4: ',' ( (lv_justifications_3_0= ruleJustification ) )
                    	    {
                    	    match(input,15,FOLLOW_15_in_ruleJustifications421); 

                    	            createLeafNode(grammarAccess.getJustificationsAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:273:1: ( (lv_justifications_3_0= ruleJustification ) )
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:274:1: (lv_justifications_3_0= ruleJustification )
                    	    {
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:274:1: (lv_justifications_3_0= ruleJustification )
                    	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:275:3: lv_justifications_3_0= ruleJustification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJustification_in_ruleJustifications442);
                    	    lv_justifications_3_0=ruleJustification();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getJustificationsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"justifications",
                    	    	        		lv_justifications_3_0, 
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
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end ruleJustifications


    // $ANTLR start entryRuleJustification
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:305:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:306:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:307:2: iv_ruleJustification= ruleJustification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJustificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleJustification_in_entryRuleJustification482);
            iv_ruleJustification=ruleJustification();
            _fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustification492); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:314:1: ruleJustification returns [EObject current=null] : ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) ) ;
    public final EObject ruleJustification() throws RecognitionException {
        EObject current = null;

        Token lv_hypothesis_1_0=null;
        Token lv_epsilon_2_0=null;
        AntlrDatatypeRuleToken lv_numeral_3_0 = null;

        EObject lv_assertion_4_0 = null;

        EObject lv_entailment_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:319:6: ( ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )
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

                if ( (LA3_3==EOF||(LA3_3>=14 && LA3_3<=15)) ) {
                    alt3=3;
                }
                else if ( ((LA3_3>=18 && LA3_3<=19)) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("320:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )", 3, 3, input);

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
                    new NoViableAltException("320:1: ( ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) ) | ( (lv_epsilon_2_0= 'epsilon' ) ) | ( (lv_numeral_3_0= ruleNumeral ) ) | ( (lv_assertion_4_0= ruleQuotedAssertion ) ) | ( (lv_entailment_5_0= ruleEntailment ) ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:2: ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:2: ( () ( (lv_hypothesis_1_0= 'hypothesis' ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:3: () ( (lv_hypothesis_1_0= 'hypothesis' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:321:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getJustificationAccess().getJustificationAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getJustificationAccess().getJustificationAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:331:2: ( (lv_hypothesis_1_0= 'hypothesis' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:332:1: (lv_hypothesis_1_0= 'hypothesis' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:332:1: (lv_hypothesis_1_0= 'hypothesis' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:333:3: lv_hypothesis_1_0= 'hypothesis'
                    {
                    lv_hypothesis_1_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleJustification545); 

                            createLeafNode(grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0(), "hypothesis"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hypothesis", true, "hypothesis", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:353:6: ( (lv_epsilon_2_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:353:6: ( (lv_epsilon_2_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:354:1: (lv_epsilon_2_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:354:1: (lv_epsilon_2_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:355:3: lv_epsilon_2_0= 'epsilon'
                    {
                    lv_epsilon_2_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleJustification583); 

                            createLeafNode(grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0(), "epsilon"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "epsilon", true, "epsilon", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:375:6: ( (lv_numeral_3_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:375:6: ( (lv_numeral_3_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:376:1: (lv_numeral_3_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:376:1: (lv_numeral_3_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:377:3: lv_numeral_3_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleJustification623);
                    lv_numeral_3_0=ruleNumeral();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"numeral",
                    	        		lv_numeral_3_0, 
                    	        		"Numeral", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:400:6: ( (lv_assertion_4_0= ruleQuotedAssertion ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:400:6: ( (lv_assertion_4_0= ruleQuotedAssertion ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:401:1: (lv_assertion_4_0= ruleQuotedAssertion )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:401:1: (lv_assertion_4_0= ruleQuotedAssertion )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:402:3: lv_assertion_4_0= ruleQuotedAssertion
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQuotedAssertion_in_ruleJustification650);
                    lv_assertion_4_0=ruleQuotedAssertion();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assertion",
                    	        		lv_assertion_4_0, 
                    	        		"QuotedAssertion", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:425:6: ( (lv_entailment_5_0= ruleEntailment ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:425:6: ( (lv_entailment_5_0= ruleEntailment ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:426:1: (lv_entailment_5_0= ruleEntailment )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:426:1: (lv_entailment_5_0= ruleEntailment )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:427:3: lv_entailment_5_0= ruleEntailment
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEntailment_in_ruleJustification677);
                    lv_entailment_5_0=ruleEntailment();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"entailment",
                    	        		lv_entailment_5_0, 
                    	        		"Entailment", 
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


    // $ANTLR start entryRuleQuotedAssertion
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:457:1: entryRuleQuotedAssertion returns [EObject current=null] : iv_ruleQuotedAssertion= ruleQuotedAssertion EOF ;
    public final EObject entryRuleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedAssertion = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:458:2: (iv_ruleQuotedAssertion= ruleQuotedAssertion EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:459:2: iv_ruleQuotedAssertion= ruleQuotedAssertion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQuotedAssertionRule(), currentNode); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion713);
            iv_ruleQuotedAssertion=ruleQuotedAssertion();
            _fsp--;

             current =iv_ruleQuotedAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedAssertion723); 

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
    // $ANTLR end entryRuleQuotedAssertion


    // $ANTLR start ruleQuotedAssertion
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:466:1: ruleQuotedAssertion returns [EObject current=null] : ( () ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:471:6: ( ( () ( (lv_text_1_0= ruleText ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:472:1: ( () ( (lv_text_1_0= ruleText ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:472:1: ( () ( (lv_text_1_0= ruleText ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:472:2: () ( (lv_text_1_0= ruleText ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:472:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:473:5: 
            {
             
                    temp=factory.create(grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:483:2: ( (lv_text_1_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:484:1: (lv_text_1_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:484:1: (lv_text_1_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:485:3: lv_text_1_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleQuotedAssertion778);
            lv_text_1_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQuotedAssertionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_1_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleQuotedAssertion


    // $ANTLR start entryRuleEntailment
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:515:1: entryRuleEntailment returns [EObject current=null] : iv_ruleEntailment= ruleEntailment EOF ;
    public final EObject entryRuleEntailment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntailment = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:516:2: (iv_ruleEntailment= ruleEntailment EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:517:2: iv_ruleEntailment= ruleEntailment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntailmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntailment_in_entryRuleEntailment814);
            iv_ruleEntailment=ruleEntailment();
            _fsp--;

             current =iv_ruleEntailment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntailment824); 

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
    // $ANTLR end entryRuleEntailment


    // $ANTLR start ruleEntailment
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:524:1: ruleEntailment returns [EObject current=null] : ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) ) ;
    public final EObject ruleEntailment() throws RecognitionException {
        EObject current = null;

        EObject lv_head_1_0 = null;

        AntlrDatatypeRuleToken lv_tail_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:529:6: ( ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:530:1: ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:530:1: ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:530:2: () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:530:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:531:5: 
            {
             
                    temp=factory.create(grammarAccess.getEntailmentAccess().getEntailmentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEntailmentAccess().getEntailmentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:541:2: ( (lv_head_1_0= ruleConjunction ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:542:1: (lv_head_1_0= ruleConjunction )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:542:1: (lv_head_1_0= ruleConjunction )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:543:3: lv_head_1_0= ruleConjunction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConjunction_in_ruleEntailment879);
            lv_head_1_0=ruleConjunction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntailmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"head",
            	        		lv_head_1_0, 
            	        		"Conjunction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleEntailment889); 

                    createLeafNode(grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:569:1: ( (lv_tail_3_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:570:1: (lv_tail_3_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:570:1: (lv_tail_3_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:571:3: lv_tail_3_0= ruleNumeral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleEntailment910);
            lv_tail_3_0=ruleNumeral();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntailmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"tail",
            	        		lv_tail_3_0, 
            	        		"Numeral", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleEntailment


    // $ANTLR start entryRuleConjunction
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:601:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:602:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:603:2: iv_ruleConjunction= ruleConjunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConjunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction946);
            iv_ruleConjunction=ruleConjunction();
            _fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction956); 

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
    // $ANTLR end entryRuleConjunction


    // $ANTLR start ruleConjunction
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:610:1: ruleConjunction returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        AntlrDatatypeRuleToken lv_lhs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:6: ( ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==18) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("616:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("616:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:3: () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:617:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getConjunctionAccess().getConjunctionAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getConjunctionAccess().getConjunctionAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:627:2: ( (lv_lhs_1_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:628:1: (lv_lhs_1_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:628:1: (lv_lhs_1_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:629:3: lv_lhs_1_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1012);
                    lv_lhs_1_0=ruleNumeral();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConjunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lhs",
                    	        		lv_lhs_1_0, 
                    	        		"Numeral", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleConjunction1022); 

                            createLeafNode(grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2(), null); 
                        
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:655:1: ( (lv_rhs_3_0= ruleConjunction ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:656:1: (lv_rhs_3_0= ruleConjunction )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:656:1: (lv_rhs_3_0= ruleConjunction )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:657:3: lv_rhs_3_0= ruleConjunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction1043);
                    lv_rhs_3_0=ruleConjunction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConjunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"rhs",
                    	        		lv_rhs_3_0, 
                    	        		"Conjunction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:680:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:680:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:681:1: (lv_lhs_4_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:681:1: (lv_lhs_4_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:682:3: lv_lhs_4_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1071);
                    lv_lhs_4_0=ruleNumeral();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConjunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lhs",
                    	        		lv_lhs_4_0, 
                    	        		"Numeral", 
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
    // $ANTLR end ruleConjunction


    // $ANTLR start entryRuleNumeral
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:712:1: entryRuleNumeral returns [String current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final String entryRuleNumeral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeral = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:713:2: (iv_ruleNumeral= ruleNumeral EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:714:2: iv_ruleNumeral= ruleNumeral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNumeralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral1108);
            iv_ruleNumeral=ruleNumeral();
            _fsp--;

             current =iv_ruleNumeral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral1119); 

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
    // $ANTLR end entryRuleNumeral


    // $ANTLR start ruleNumeral
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:721:1: ruleNumeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:726:6: (this_INT_0= RULE_INT )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:727:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumeral1158); 

            		current.merge(this_INT_0);
                
             
                createLeafNode(grammarAccess.getNumeralAccess().getINTTerminalRuleCall(), null); 
                

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
    // $ANTLR end ruleNumeral


    // $ANTLR start entryRuleProofSteps
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:742:1: entryRuleProofSteps returns [EObject current=null] : iv_ruleProofSteps= ruleProofSteps EOF ;
    public final EObject entryRuleProofSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProofSteps = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:743:2: (iv_ruleProofSteps= ruleProofSteps EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:744:2: iv_ruleProofSteps= ruleProofSteps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProofStepsRule(), currentNode); 
            pushFollow(FOLLOW_ruleProofSteps_in_entryRuleProofSteps1202);
            iv_ruleProofSteps=ruleProofSteps();
            _fsp--;

             current =iv_ruleProofSteps; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProofSteps1212); 

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
    // $ANTLR end entryRuleProofSteps


    // $ANTLR start ruleProofSteps
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:751:1: ruleProofSteps returns [EObject current=null] : ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) ;
    public final EObject ruleProofSteps() throws RecognitionException {
        EObject current = null;

        Token lv_epsilon_3_0=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:6: ( ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
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
                    new NoViableAltException("757:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:3: () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:758:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getProofStepsAccess().getProofStepsAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getProofStepsAccess().getProofStepsAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:768:2: ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:768:3: ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )*
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:768:3: ( (lv_statements_1_0= ruleStatement ) )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:769:1: (lv_statements_1_0= ruleStatement )
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:769:1: (lv_statements_1_0= ruleStatement )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:770:3: lv_statements_1_0= ruleStatement
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1269);
                            lv_statements_1_0=ruleStatement();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getProofStepsRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"statements",
                            	        		lv_statements_1_0, 
                            	        		"Statement", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:792:2: ( (lv_statements_2_0= ruleStatement ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_INT) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:793:1: (lv_statements_2_0= ruleStatement )
                            	    {
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:793:1: (lv_statements_2_0= ruleStatement )
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:794:3: lv_statements_2_0= ruleStatement
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1290);
                            	    lv_statements_2_0=ruleStatement();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getProofStepsRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"statements",
                            	    	        		lv_statements_2_0, 
                            	    	        		"Statement", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

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
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:817:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:817:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:818:1: (lv_epsilon_3_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:818:1: (lv_epsilon_3_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:819:3: lv_epsilon_3_0= 'epsilon'
                    {
                    lv_epsilon_3_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleProofSteps1318); 

                            createLeafNode(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0(), "epsilon"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProofStepsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "epsilon", true, "epsilon", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


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
    // $ANTLR end ruleProofSteps


    // $ANTLR start entryRuleStatement
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:846:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:847:2: (iv_ruleStatement= ruleStatement EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:848:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1367);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1377); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:855:1: ruleStatement returns [EObject current=null] : ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_statement_3_0 = null;

        EObject lv_justification_5_0 = null;

        EObject lv_validation_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:860:6: ( ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )? ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:861:1: ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )? )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:861:1: ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )? )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:861:2: () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )?
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:861:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:862:5: 
            {
             
                    temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:872:2: ( (lv_id_1_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:873:1: (lv_id_1_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:873:1: (lv_id_1_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:874:3: lv_id_1_0= ruleNumeral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleStatement1432);
            lv_id_1_0=ruleNumeral();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"Numeral", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleStatement1442); 

                    createLeafNode(grammarAccess.getStatementAccess().getFullStopKeyword_2(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:900:1: ( (lv_statement_3_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:901:1: (lv_statement_3_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:901:1: (lv_statement_3_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:902:3: lv_statement_3_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleStatement1463);
            lv_statement_3_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"statement",
            	        		lv_statement_3_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleStatement1473); 

                    createLeafNode(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:928:1: ( (lv_justification_5_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:929:1: (lv_justification_5_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:929:1: (lv_justification_5_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:930:3: lv_justification_5_0= ruleJustifications
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJustifications_in_ruleStatement1494);
            lv_justification_5_0=ruleJustifications();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"justification",
            	        		lv_justification_5_0, 
            	        		"Justifications", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleStatement1504); 

                    createLeafNode(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:956:1: ( '{' ( (lv_validation_8_0= ruleValidation ) ) '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:956:3: '{' ( (lv_validation_8_0= ruleValidation ) ) '}'
                    {
                    match(input,21,FOLLOW_21_in_ruleStatement1515); 

                            createLeafNode(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_7_0(), null); 
                        
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:960:1: ( (lv_validation_8_0= ruleValidation ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:961:1: (lv_validation_8_0= ruleValidation )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:961:1: (lv_validation_8_0= ruleValidation )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:962:3: lv_validation_8_0= ruleValidation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getValidationValidationParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValidation_in_ruleStatement1536);
                    lv_validation_8_0=ruleValidation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"validation",
                    	        		lv_validation_8_0, 
                    	        		"Validation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleStatement1546); 

                            createLeafNode(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_7_2(), null); 
                        

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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleValidation
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:996:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:997:2: (iv_ruleValidation= ruleValidation EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:998:2: iv_ruleValidation= ruleValidation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValidationRule(), currentNode); 
            pushFollow(FOLLOW_ruleValidation_in_entryRuleValidation1584);
            iv_ruleValidation=ruleValidation();
            _fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidation1594); 

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
    // $ANTLR end entryRuleValidation


    // $ANTLR start ruleValidation
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1005:1: ruleValidation returns [EObject current=null] : ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_author_1_0 = null;

        AntlrDatatypeRuleToken lv_timeStamp_2_0 = null;

        Enumerator lv_state_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1010:6: ( ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1011:1: ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1011:1: ( () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1011:2: () ( (lv_author_1_0= ruleText ) ) ( (lv_timeStamp_2_0= ruleText ) )? ( (lv_state_3_0= ruleValidationKind ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1011:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1012:5: 
            {
             
                    temp=factory.create(grammarAccess.getValidationAccess().getValidationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getValidationAccess().getValidationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1022:2: ( (lv_author_1_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1023:1: (lv_author_1_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1023:1: (lv_author_1_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1024:3: lv_author_1_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValidationAccess().getAuthorTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleValidation1649);
            lv_author_1_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getValidationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"author",
            	        		lv_author_1_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1046:2: ( (lv_timeStamp_2_0= ruleText ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1047:1: (lv_timeStamp_2_0= ruleText )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1047:1: (lv_timeStamp_2_0= ruleText )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1048:3: lv_timeStamp_2_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getValidationAccess().getTimeStampTextParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleValidation1670);
                    lv_timeStamp_2_0=ruleText();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getValidationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"timeStamp",
                    	        		lv_timeStamp_2_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1070:3: ( (lv_state_3_0= ruleValidationKind ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1071:1: (lv_state_3_0= ruleValidationKind )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1071:1: (lv_state_3_0= ruleValidationKind )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1072:3: lv_state_3_0= ruleValidationKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValidationAccess().getStateValidationKindEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValidationKind_in_ruleValidation1692);
            lv_state_3_0=ruleValidationKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getValidationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"state",
            	        		lv_state_3_0, 
            	        		"ValidationKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleValidation


    // $ANTLR start ruleValidationKind
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1102:1: ruleValidationKind returns [Enumerator current=null] : ( ( 'unknown' ) | ( 'valid' ) | ( 'invalid' ) ) ;
    public final Enumerator ruleValidationKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1106:6: ( ( ( 'unknown' ) | ( 'valid' ) | ( 'invalid' ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1107:1: ( ( 'unknown' ) | ( 'valid' ) | ( 'invalid' ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1107:1: ( ( 'unknown' ) | ( 'valid' ) | ( 'invalid' ) )
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
                    new NoViableAltException("1107:1: ( ( 'unknown' ) | ( 'valid' ) | ( 'invalid' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1107:2: ( 'unknown' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1107:2: ( 'unknown' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1107:4: 'unknown'
                    {
                    match(input,23,FOLLOW_23_in_ruleValidationKind1740); 

                            current = grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1113:6: ( 'valid' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1113:6: ( 'valid' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1113:8: 'valid'
                    {
                    match(input,24,FOLLOW_24_in_ruleValidationKind1755); 

                            current = grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1119:6: ( 'invalid' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1119:6: ( 'invalid' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:1119:8: 'invalid'
                    {
                    match(input,25,FOLLOW_25_in_ruleValidationKind1770); 

                            current = grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2(), null); 
                        

                    }


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
    // $ANTLR end ruleValidationKind


 

    public static final BitSet FOLLOW_ruleProof_in_entryRuleProof75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProof85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProof120 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProof130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleText_in_ruleProof151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProof161 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_ruleJustifications_in_ruleProof182 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProof192 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_ruleProofSteps_in_ruleProof213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_entryRuleJustifications344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifications354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications410 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleJustifications421 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications442 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustification492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJustification545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleJustification583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleJustification623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_ruleJustification650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_ruleJustification677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedAssertion723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleQuotedAssertion778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_entryRuleEntailment814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntailment824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleEntailment879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntailment889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleEntailment910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1012 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConjunction1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumeral1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_entryRuleProofSteps1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProofSteps1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1269 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1290 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17_in_ruleProofSteps1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleStatement1432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleText_in_ruleStatement1463 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement1473 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_ruleJustifications_in_ruleStatement1494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatement1504 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleStatement1515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidation_in_ruleStatement1536 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStatement1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidation_in_entryRuleValidation1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidation1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleValidation1649 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_ruleText_in_ruleValidation1670 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleValidationKind_in_ruleValidation1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValidationKind1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValidationKind1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValidationKind1770 = new BitSet(new long[]{0x0000000000000002L});

}