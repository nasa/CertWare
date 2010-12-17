package net.certware.argument.sfp.parser.antlr.internal; 

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
import net.certware.argument.sfp.services.SemiFormalProofGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemiFormalProofParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Theorem'", "':'", "'('", "')'", "','", "'hypothesis'", "'epsilon'", "'->'", "'^'", "'.'"
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:77:1: entryRuleProof returns [EObject current=null] : iv_ruleProof= ruleProof EOF ;
    public final EObject entryRuleProof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProof = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:78:2: (iv_ruleProof= ruleProof EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:79:2: iv_ruleProof= ruleProof EOF
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:86:1: ruleProof returns [EObject current=null] : ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) ;
    public final EObject ruleProof() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_justifications_4_0 = null;

        EObject lv_proofSteps_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:91:6: ( ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:92:1: ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:92:1: ( 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:92:3: 'Theorem' ':' ( (lv_title_2_0= ruleText ) ) '(' ( (lv_justifications_4_0= ruleJustifications ) ) ')' ( (lv_proofSteps_6_0= ruleProofSteps ) )
            {
            match(input,11,FOLLOW_11_in_ruleProof120); 

                    createLeafNode(grammarAccess.getProofAccess().getTheoremKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProof130); 

                    createLeafNode(grammarAccess.getProofAccess().getColonKeyword_1(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:100:1: ( (lv_title_2_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:101:1: (lv_title_2_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:101:1: (lv_title_2_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:102:3: lv_title_2_0= ruleText
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
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:128:1: ( (lv_justifications_4_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:129:1: (lv_justifications_4_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:129:1: (lv_justifications_4_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:130:3: lv_justifications_4_0= ruleJustifications
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
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:156:1: ( (lv_proofSteps_6_0= ruleProofSteps ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:157:1: (lv_proofSteps_6_0= ruleProofSteps )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:157:1: (lv_proofSteps_6_0= ruleProofSteps )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:158:3: lv_proofSteps_6_0= ruleProofSteps
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:188:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:189:2: (iv_ruleText= ruleText EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:190:2: iv_ruleText= ruleText EOF
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:197:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:202:6: (this_STRING_0= RULE_STRING )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:203:5: this_STRING_0= RULE_STRING
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:218:1: entryRuleJustifications returns [EObject current=null] : iv_ruleJustifications= ruleJustifications EOF ;
    public final EObject entryRuleJustifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustifications = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:219:2: (iv_ruleJustifications= ruleJustifications EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:220:2: iv_ruleJustifications= ruleJustifications EOF
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:227:1: ruleJustifications returns [EObject current=null] : ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) | ( (lv_hypothesis_4_0= 'hypothesis' ) ) | ( (lv_epsilon_5_0= 'epsilon' ) ) ) ;
    public final EObject ruleJustifications() throws RecognitionException {
        EObject current = null;

        Token lv_hypothesis_4_0=null;
        Token lv_epsilon_5_0=null;
        EObject lv_justifications_1_0 = null;

        EObject lv_justifications_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:232:6: ( ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) | ( (lv_hypothesis_4_0= 'hypothesis' ) ) | ( (lv_epsilon_5_0= 'epsilon' ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:1: ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) | ( (lv_hypothesis_4_0= 'hypothesis' ) ) | ( (lv_epsilon_5_0= 'epsilon' ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:1: ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) | ( (lv_hypothesis_4_0= 'hypothesis' ) ) | ( (lv_epsilon_5_0= 'epsilon' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_STRING:
            case RULE_INT:
            case 14:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("233:1: ( ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? ) | ( (lv_hypothesis_4_0= 'hypothesis' ) ) | ( (lv_epsilon_5_0= 'epsilon' ) ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:2: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:2: ( () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )? )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:3: () ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:233:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:234:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getJustificationsAccess().getJustificationsAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:244:2: ( ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:244:3: ( (lv_justifications_1_0= ruleJustification ) ) ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:244:3: ( (lv_justifications_1_0= ruleJustification ) )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:245:1: (lv_justifications_1_0= ruleJustification )
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:245:1: (lv_justifications_1_0= ruleJustification )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:246:3: lv_justifications_1_0= ruleJustification
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleJustification_in_ruleJustifications411);
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

                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:268:2: ( ',' ( (lv_justifications_3_0= ruleJustification ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:268:4: ',' ( (lv_justifications_3_0= ruleJustification ) )
                            	    {
                            	    match(input,15,FOLLOW_15_in_ruleJustifications422); 

                            	            createLeafNode(grammarAccess.getJustificationsAccess().getCommaKeyword_0_1_1_0(), null); 
                            	        
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:272:1: ( (lv_justifications_3_0= ruleJustification ) )
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:273:1: (lv_justifications_3_0= ruleJustification )
                            	    {
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:273:1: (lv_justifications_3_0= ruleJustification )
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:274:3: lv_justifications_3_0= ruleJustification
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleJustification_in_ruleJustifications443);
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
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:297:6: ( (lv_hypothesis_4_0= 'hypothesis' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:297:6: ( (lv_hypothesis_4_0= 'hypothesis' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:298:1: (lv_hypothesis_4_0= 'hypothesis' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:298:1: (lv_hypothesis_4_0= 'hypothesis' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:299:3: lv_hypothesis_4_0= 'hypothesis'
                    {
                    lv_hypothesis_4_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleJustifications472); 

                            createLeafNode(grammarAccess.getJustificationsAccess().getHypothesisHypothesisKeyword_1_0(), "hypothesis"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hypothesis", lv_hypothesis_4_0, "hypothesis", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:319:6: ( (lv_epsilon_5_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:319:6: ( (lv_epsilon_5_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:1: (lv_epsilon_5_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:320:1: (lv_epsilon_5_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:321:3: lv_epsilon_5_0= 'epsilon'
                    {
                    lv_epsilon_5_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleJustifications509); 

                            createLeafNode(grammarAccess.getJustificationsAccess().getEpsilonEpsilonKeyword_2_0(), "epsilon"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "epsilon", lv_epsilon_5_0, "epsilon", lastConsumedNode);
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
    // $ANTLR end ruleJustifications


    // $ANTLR start entryRuleJustification
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:348:1: entryRuleJustification returns [EObject current=null] : iv_ruleJustification= ruleJustification EOF ;
    public final EObject entryRuleJustification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustification = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:349:2: (iv_ruleJustification= ruleJustification EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:350:2: iv_ruleJustification= ruleJustification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJustificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleJustification_in_entryRuleJustification558);
            iv_ruleJustification=ruleJustification();
            _fsp--;

             current =iv_ruleJustification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustification568); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:357:1: ruleJustification returns [EObject current=null] : ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) ) ;
    public final EObject ruleJustification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numeral_1_0 = null;

        EObject lv_assertion_2_0 = null;

        EObject lv_entailment_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:362:6: ( ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:1: ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:1: ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=18 && LA4_1<=19)) ) {
                    alt4=3;
                }
                else if ( (LA4_1==EOF||(LA4_1>=14 && LA4_1<=15)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("363:1: ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) )", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("363:1: ( ( () ( (lv_numeral_1_0= ruleNumeral ) ) ) | ( (lv_assertion_2_0= ruleQuotedAssertion ) ) | ( (lv_entailment_3_0= ruleEntailment ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:2: ( () ( (lv_numeral_1_0= ruleNumeral ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:2: ( () ( (lv_numeral_1_0= ruleNumeral ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:3: () ( (lv_numeral_1_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:363:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:364:5: 
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

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:374:2: ( (lv_numeral_1_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:375:1: (lv_numeral_1_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:375:1: (lv_numeral_1_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:376:3: lv_numeral_1_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleJustification624);
                    lv_numeral_1_0=ruleNumeral();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"numeral",
                    	        		lv_numeral_1_0, 
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
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:399:6: ( (lv_assertion_2_0= ruleQuotedAssertion ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:399:6: ( (lv_assertion_2_0= ruleQuotedAssertion ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:400:1: (lv_assertion_2_0= ruleQuotedAssertion )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:400:1: (lv_assertion_2_0= ruleQuotedAssertion )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:401:3: lv_assertion_2_0= ruleQuotedAssertion
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQuotedAssertion_in_ruleJustification652);
                    lv_assertion_2_0=ruleQuotedAssertion();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assertion",
                    	        		lv_assertion_2_0, 
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
                case 3 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:424:6: ( (lv_entailment_3_0= ruleEntailment ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:424:6: ( (lv_entailment_3_0= ruleEntailment ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:425:1: (lv_entailment_3_0= ruleEntailment )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:425:1: (lv_entailment_3_0= ruleEntailment )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:426:3: lv_entailment_3_0= ruleEntailment
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEntailment_in_ruleJustification679);
                    lv_entailment_3_0=ruleEntailment();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJustificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"entailment",
                    	        		lv_entailment_3_0, 
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:456:1: entryRuleQuotedAssertion returns [EObject current=null] : iv_ruleQuotedAssertion= ruleQuotedAssertion EOF ;
    public final EObject entryRuleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedAssertion = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:457:2: (iv_ruleQuotedAssertion= ruleQuotedAssertion EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:458:2: iv_ruleQuotedAssertion= ruleQuotedAssertion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQuotedAssertionRule(), currentNode); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion715);
            iv_ruleQuotedAssertion=ruleQuotedAssertion();
            _fsp--;

             current =iv_ruleQuotedAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedAssertion725); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:465:1: ruleQuotedAssertion returns [EObject current=null] : ( () ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleQuotedAssertion() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:470:6: ( ( () ( (lv_text_1_0= ruleText ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:471:1: ( () ( (lv_text_1_0= ruleText ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:471:1: ( () ( (lv_text_1_0= ruleText ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:471:2: () ( (lv_text_1_0= ruleText ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:471:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:472:5: 
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

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:482:2: ( (lv_text_1_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:483:1: (lv_text_1_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:483:1: (lv_text_1_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:484:3: lv_text_1_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleQuotedAssertion780);
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:514:1: entryRuleEntailment returns [EObject current=null] : iv_ruleEntailment= ruleEntailment EOF ;
    public final EObject entryRuleEntailment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntailment = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:515:2: (iv_ruleEntailment= ruleEntailment EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:516:2: iv_ruleEntailment= ruleEntailment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntailmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntailment_in_entryRuleEntailment816);
            iv_ruleEntailment=ruleEntailment();
            _fsp--;

             current =iv_ruleEntailment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntailment826); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:523:1: ruleEntailment returns [EObject current=null] : ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) ) ;
    public final EObject ruleEntailment() throws RecognitionException {
        EObject current = null;

        EObject lv_head_1_0 = null;

        AntlrDatatypeRuleToken lv_tail_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:528:6: ( ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:529:1: ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:529:1: ( () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:529:2: () ( (lv_head_1_0= ruleConjunction ) ) '->' ( (lv_tail_3_0= ruleNumeral ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:529:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:530:5: 
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

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:540:2: ( (lv_head_1_0= ruleConjunction ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:541:1: (lv_head_1_0= ruleConjunction )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:541:1: (lv_head_1_0= ruleConjunction )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:542:3: lv_head_1_0= ruleConjunction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConjunction_in_ruleEntailment881);
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

            match(input,18,FOLLOW_18_in_ruleEntailment891); 

                    createLeafNode(grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:568:1: ( (lv_tail_3_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:569:1: (lv_tail_3_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:569:1: (lv_tail_3_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:570:3: lv_tail_3_0= ruleNumeral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleEntailment912);
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:600:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:601:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:602:2: iv_ruleConjunction= ruleConjunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConjunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction948);
            iv_ruleConjunction=ruleConjunction();
            _fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction958); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:609:1: ruleConjunction returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        AntlrDatatypeRuleToken lv_lhs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:614:6: ( ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==18) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("615:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("615:1: ( ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) ) | ( (lv_lhs_4_0= ruleNumeral ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:2: ( () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:3: () ( (lv_lhs_1_0= ruleNumeral ) ) '^' ( (lv_rhs_3_0= ruleConjunction ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:615:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:616:5: 
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

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:626:2: ( (lv_lhs_1_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:627:1: (lv_lhs_1_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:627:1: (lv_lhs_1_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:628:3: lv_lhs_1_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1014);
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

                    match(input,19,FOLLOW_19_in_ruleConjunction1024); 

                            createLeafNode(grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2(), null); 
                        
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:654:1: ( (lv_rhs_3_0= ruleConjunction ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:655:1: (lv_rhs_3_0= ruleConjunction )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:655:1: (lv_rhs_3_0= ruleConjunction )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:656:3: lv_rhs_3_0= ruleConjunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction1045);
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
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:679:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:679:6: ( (lv_lhs_4_0= ruleNumeral ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:680:1: (lv_lhs_4_0= ruleNumeral )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:680:1: (lv_lhs_4_0= ruleNumeral )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:681:3: lv_lhs_4_0= ruleNumeral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNumeral_in_ruleConjunction1073);
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:711:1: entryRuleNumeral returns [String current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final String entryRuleNumeral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeral = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:712:2: (iv_ruleNumeral= ruleNumeral EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:713:2: iv_ruleNumeral= ruleNumeral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNumeralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral1110);
            iv_ruleNumeral=ruleNumeral();
            _fsp--;

             current =iv_ruleNumeral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral1121); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:720:1: ruleNumeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:725:6: (this_INT_0= RULE_INT )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:726:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumeral1160); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:741:1: entryRuleProofSteps returns [EObject current=null] : iv_ruleProofSteps= ruleProofSteps EOF ;
    public final EObject entryRuleProofSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProofSteps = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:742:2: (iv_ruleProofSteps= ruleProofSteps EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:743:2: iv_ruleProofSteps= ruleProofSteps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProofStepsRule(), currentNode); 
            pushFollow(FOLLOW_ruleProofSteps_in_entryRuleProofSteps1204);
            iv_ruleProofSteps=ruleProofSteps();
            _fsp--;

             current =iv_ruleProofSteps; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProofSteps1214); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:750:1: ruleProofSteps returns [EObject current=null] : ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) ;
    public final EObject ruleProofSteps() throws RecognitionException {
        EObject current = null;

        Token lv_epsilon_3_0=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:755:6: ( ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("756:1: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? ) | ( (lv_epsilon_3_0= 'epsilon' ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )? )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:3: () ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:756:3: ()
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:757:5: 
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

                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:767:2: ( ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:767:3: ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleStatement ) )*
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:767:3: ( (lv_statements_1_0= ruleStatement ) )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:768:1: (lv_statements_1_0= ruleStatement )
                            {
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:768:1: (lv_statements_1_0= ruleStatement )
                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:769:3: lv_statements_1_0= ruleStatement
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1271);
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

                            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:791:2: ( (lv_statements_2_0= ruleStatement ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_INT) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:792:1: (lv_statements_2_0= ruleStatement )
                            	    {
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:792:1: (lv_statements_2_0= ruleStatement )
                            	    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:793:3: lv_statements_2_0= ruleStatement
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleStatement_in_ruleProofSteps1292);
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
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:816:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:816:6: ( (lv_epsilon_3_0= 'epsilon' ) )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:817:1: (lv_epsilon_3_0= 'epsilon' )
                    {
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:817:1: (lv_epsilon_3_0= 'epsilon' )
                    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:818:3: lv_epsilon_3_0= 'epsilon'
                    {
                    lv_epsilon_3_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleProofSteps1320); 

                            createLeafNode(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0(), "epsilon"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProofStepsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "epsilon", lv_epsilon_3_0, "epsilon", lastConsumedNode);
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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:845:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:846:2: (iv_ruleStatement= ruleStatement EOF )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:847:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1369);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1379); 

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
    // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:854:1: ruleStatement returns [EObject current=null] : ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_statement_3_0 = null;

        EObject lv_justification_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:859:6: ( ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:860:1: ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:860:1: ( () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')' )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:860:2: () ( (lv_id_1_0= ruleNumeral ) ) '.' ( (lv_statement_3_0= ruleText ) ) '(' ( (lv_justification_5_0= ruleJustifications ) ) ')'
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:860:2: ()
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:861:5: 
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

            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:871:2: ( (lv_id_1_0= ruleNumeral ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:872:1: (lv_id_1_0= ruleNumeral )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:872:1: (lv_id_1_0= ruleNumeral )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:873:3: lv_id_1_0= ruleNumeral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumeral_in_ruleStatement1434);
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

            match(input,20,FOLLOW_20_in_ruleStatement1444); 

                    createLeafNode(grammarAccess.getStatementAccess().getFullStopKeyword_2(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:899:1: ( (lv_statement_3_0= ruleText ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:900:1: (lv_statement_3_0= ruleText )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:900:1: (lv_statement_3_0= ruleText )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:901:3: lv_statement_3_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleStatement1465);
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

            match(input,13,FOLLOW_13_in_ruleStatement1475); 

                    createLeafNode(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:927:1: ( (lv_justification_5_0= ruleJustifications ) )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:928:1: (lv_justification_5_0= ruleJustifications )
            {
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:928:1: (lv_justification_5_0= ruleJustifications )
            // ../net.certware.argument.sfp/src-gen/net/certware/argument/sfp/parser/antlr/internal/InternalSemiFormalProof.g:929:3: lv_justification_5_0= ruleJustifications
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJustifications_in_ruleStatement1496);
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

            match(input,14,FOLLOW_14_in_ruleStatement1506); 

                    createLeafNode(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6(), null); 
                

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
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications411 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleJustifications422 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifications443 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_16_in_ruleJustifications472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleJustifications509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustification568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleJustification624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_ruleJustification652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_ruleJustification679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedAssertion725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleQuotedAssertion780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_entryRuleEntailment816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntailment826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleEntailment881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntailment891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleEntailment912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1014 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConjunction1024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleConjunction1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumeral1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_entryRuleProofSteps1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProofSteps1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1271 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProofSteps1292 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17_in_ruleProofSteps1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_ruleStatement1434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement1444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleText_in_ruleStatement1465 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement1475 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_ruleJustifications_in_ruleStatement1496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatement1506 = new BitSet(new long[]{0x0000000000000002L});

}