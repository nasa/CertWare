package net.certware.argument.analysis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnalysisDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SATISFIABLE", "RULE_UNSATISFIABLE", "RULE_IDENTIFIER", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'('", "')'", "','"
    };
    public static final int RULE_UNSATISFIABLE=5;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_SATISFIABLE=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAnalysisDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnalysisDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnalysisDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnalysisDSL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AnalysisDSLGrammarAccess grammarAccess;
     	
        public InternalAnalysisDSLParser(TokenStream input, AnalysisDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Output";	
       	}
       	
       	@Override
       	protected AnalysisDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOutput"
    // InternalAnalysisDSL.g:73:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAnalysisDSL.g:74:2: (iv_ruleOutput= ruleOutput EOF )
            // InternalAnalysisDSL.g:75:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnalysisDSL.g:82:1: ruleOutput returns [EObject current=null] : ( ( (lv_lines_0_0= ruleLine ) )* (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token this_SATISFIABLE_1=null;
        Token this_UNSATISFIABLE_2=null;
        EObject lv_lines_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:85:28: ( ( ( (lv_lines_0_0= ruleLine ) )* (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) ) )
            // InternalAnalysisDSL.g:86:1: ( ( (lv_lines_0_0= ruleLine ) )* (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) )
            {
            // InternalAnalysisDSL.g:86:1: ( ( (lv_lines_0_0= ruleLine ) )* (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE ) )
            // InternalAnalysisDSL.g:86:2: ( (lv_lines_0_0= ruleLine ) )* (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE )
            {
            // InternalAnalysisDSL.g:86:2: ( (lv_lines_0_0= ruleLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENTIFIER||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnalysisDSL.g:87:1: (lv_lines_0_0= ruleLine )
            	    {
            	    // InternalAnalysisDSL.g:87:1: (lv_lines_0_0= ruleLine )
            	    // InternalAnalysisDSL.g:88:3: lv_lines_0_0= ruleLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_lines_0_0=ruleLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOutputRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_0_0, 
            	              		"net.certware.argument.analysis.AnalysisDSL.Line");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAnalysisDSL.g:104:3: (this_SATISFIABLE_1= RULE_SATISFIABLE | this_UNSATISFIABLE_2= RULE_UNSATISFIABLE )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SATISFIABLE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNSATISFIABLE) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAnalysisDSL.g:104:4: this_SATISFIABLE_1= RULE_SATISFIABLE
                    {
                    this_SATISFIABLE_1=(Token)match(input,RULE_SATISFIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SATISFIABLE_1, grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAnalysisDSL.g:109:6: this_UNSATISFIABLE_2= RULE_UNSATISFIABLE
                    {
                    this_UNSATISFIABLE_2=(Token)match(input,RULE_UNSATISFIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNSATISFIABLE_2, grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLine"
    // InternalAnalysisDSL.g:121:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalAnalysisDSL.g:122:2: (iv_ruleLine= ruleLine EOF )
            // InternalAnalysisDSL.g:123:2: iv_ruleLine= ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalAnalysisDSL.g:130:1: ruleLine returns [EObject current=null] : ( (lv_items_0_0= ruleClassicLiteral ) )+ ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:133:28: ( ( (lv_items_0_0= ruleClassicLiteral ) )+ )
            // InternalAnalysisDSL.g:134:1: ( (lv_items_0_0= ruleClassicLiteral ) )+
            {
            // InternalAnalysisDSL.g:134:1: ( (lv_items_0_0= ruleClassicLiteral ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3_InternalAnalysisDSL()) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==RULE_IDENTIFIER) ) {
                    int LA3_3 = input.LA(2);

                    if ( (synpred3_InternalAnalysisDSL()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnalysisDSL.g:135:1: (lv_items_0_0= ruleClassicLiteral )
            	    {
            	    // InternalAnalysisDSL.g:135:1: (lv_items_0_0= ruleClassicLiteral )
            	    // InternalAnalysisDSL.g:136:3: lv_items_0_0= ruleClassicLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_items_0_0=ruleClassicLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLineRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_0_0, 
            	              		"net.certware.argument.analysis.AnalysisDSL.ClassicLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleClassicLiteral"
    // InternalAnalysisDSL.g:160:1: entryRuleClassicLiteral returns [EObject current=null] : iv_ruleClassicLiteral= ruleClassicLiteral EOF ;
    public final EObject entryRuleClassicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicLiteral = null;


        try {
            // InternalAnalysisDSL.g:161:2: (iv_ruleClassicLiteral= ruleClassicLiteral EOF )
            // InternalAnalysisDSL.g:162:2: iv_ruleClassicLiteral= ruleClassicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassicLiteral=ruleClassicLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassicLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassicLiteral"


    // $ANTLR start "ruleClassicLiteral"
    // InternalAnalysisDSL.g:169:1: ruleClassicLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleClassicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_atom_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:172:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalAnalysisDSL.g:173:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalAnalysisDSL.g:173:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalAnalysisDSL.g:173:2: ( (lv_neg_0_0= '-' ) )? ( (lv_atom_1_0= ruleAtom ) )
            {
            // InternalAnalysisDSL.g:173:2: ( (lv_neg_0_0= '-' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnalysisDSL.g:174:1: (lv_neg_0_0= '-' )
                    {
                    // InternalAnalysisDSL.g:174:1: (lv_neg_0_0= '-' )
                    // InternalAnalysisDSL.g:175:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_neg_0_0, grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassicLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "neg", lv_neg_0_0, "-");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAnalysisDSL.g:188:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalAnalysisDSL.g:189:1: (lv_atom_1_0= ruleAtom )
            {
            // InternalAnalysisDSL.g:189:1: (lv_atom_1_0= ruleAtom )
            // InternalAnalysisDSL.g:190:3: lv_atom_1_0= ruleAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_atom_1_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassicLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"atom",
                      		lv_atom_1_0, 
                      		"net.certware.argument.analysis.AnalysisDSL.Atom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassicLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalAnalysisDSL.g:214:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalAnalysisDSL.g:215:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalAnalysisDSL.g:216:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalAnalysisDSL.g:223:1: ruleAtom returns [EObject current=null] : ( ( (lv_name_0_0= rulePREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:226:28: ( ( ( (lv_name_0_0= rulePREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? ) )
            // InternalAnalysisDSL.g:227:1: ( ( (lv_name_0_0= rulePREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? )
            {
            // InternalAnalysisDSL.g:227:1: ( ( (lv_name_0_0= rulePREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )? )
            // InternalAnalysisDSL.g:227:2: ( (lv_name_0_0= rulePREDICATE_NAME ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )?
            {
            // InternalAnalysisDSL.g:227:2: ( (lv_name_0_0= rulePREDICATE_NAME ) )
            // InternalAnalysisDSL.g:228:1: (lv_name_0_0= rulePREDICATE_NAME )
            {
            // InternalAnalysisDSL.g:228:1: (lv_name_0_0= rulePREDICATE_NAME )
            // InternalAnalysisDSL.g:229:3: lv_name_0_0= rulePREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAtomAccess().getNamePREDICATE_NAMEParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_name_0_0=rulePREDICATE_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAtomRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"net.certware.argument.analysis.AnalysisDSL.PREDICATE_NAME");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAnalysisDSL.g:245:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnalysisDSL.g:245:4: otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalAnalysisDSL.g:249:1: ( (lv_terms_2_0= ruleTerms ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_IDENTIFIER && LA5_0<=RULE_NUMBER)||LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAnalysisDSL.g:250:1: (lv_terms_2_0= ruleTerms )
                            {
                            // InternalAnalysisDSL.g:250:1: (lv_terms_2_0= ruleTerms )
                            // InternalAnalysisDSL.g:251:3: lv_terms_2_0= ruleTerms
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_7);
                            lv_terms_2_0=ruleTerms();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"terms",
                                      		lv_terms_2_0, 
                                      		"net.certware.argument.analysis.AnalysisDSL.Terms");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRulePREDICATE_NAME"
    // InternalAnalysisDSL.g:279:1: entryRulePREDICATE_NAME returns [String current=null] : iv_rulePREDICATE_NAME= rulePREDICATE_NAME EOF ;
    public final String entryRulePREDICATE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREDICATE_NAME = null;


        try {
            // InternalAnalysisDSL.g:280:2: (iv_rulePREDICATE_NAME= rulePREDICATE_NAME EOF )
            // InternalAnalysisDSL.g:281:2: iv_rulePREDICATE_NAME= rulePREDICATE_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPREDICATE_NAMERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePREDICATE_NAME=rulePREDICATE_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePREDICATE_NAME.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePREDICATE_NAME"


    // $ANTLR start "rulePREDICATE_NAME"
    // InternalAnalysisDSL.g:288:1: rulePREDICATE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulePREDICATE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:291:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:292:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getPREDICATE_NAMEAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePREDICATE_NAME"


    // $ANTLR start "entryRuleTerms"
    // InternalAnalysisDSL.g:307:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // InternalAnalysisDSL.g:308:2: (iv_ruleTerms= ruleTerms EOF )
            // InternalAnalysisDSL.g:309:2: iv_ruleTerms= ruleTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerms=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerms; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // InternalAnalysisDSL.g:316:1: ruleTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:319:28: ( ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) )
            // InternalAnalysisDSL.g:320:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            {
            // InternalAnalysisDSL.g:320:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            // InternalAnalysisDSL.g:320:2: ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            {
            // InternalAnalysisDSL.g:320:2: ( (lv_car_0_0= ruleTerm ) )
            // InternalAnalysisDSL.g:321:1: (lv_car_0_0= ruleTerm )
            {
            // InternalAnalysisDSL.g:321:1: (lv_car_0_0= ruleTerm )
            // InternalAnalysisDSL.g:322:3: lv_car_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_car_0_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTermsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"net.certware.argument.analysis.AnalysisDSL.Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAnalysisDSL.g:338:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnalysisDSL.g:338:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalAnalysisDSL.g:342:1: ( (lv_cdr_2_0= ruleTerm ) )
            	    // InternalAnalysisDSL.g:343:1: (lv_cdr_2_0= ruleTerm )
            	    {
            	    // InternalAnalysisDSL.g:343:1: (lv_cdr_2_0= ruleTerm )
            	    // InternalAnalysisDSL.g:344:3: lv_cdr_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_cdr_2_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTermsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"net.certware.argument.analysis.AnalysisDSL.Term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // InternalAnalysisDSL.g:368:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalAnalysisDSL.g:369:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalAnalysisDSL.g:370:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalAnalysisDSL.g:377:1: ruleTerm returns [EObject current=null] : ( ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_sign_1_0=null;
        Token lv_n_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_cs_0_0 = null;

        AntlrDatatypeRuleToken lv_fs_3_0 = null;

        EObject lv_terms_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:380:28: ( ( ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) ) )
            // InternalAnalysisDSL.g:381:1: ( ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) )
            {
            // InternalAnalysisDSL.g:381:1: ( ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) ) | ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) ) | ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=17 && LA9_1<=18)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==16) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_NUMBER||LA9_0==15) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisDSL.g:381:2: ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) )
                    {
                    // InternalAnalysisDSL.g:381:2: ( (lv_cs_0_0= ruleCONSTANT_SYMBOL ) )
                    // InternalAnalysisDSL.g:382:1: (lv_cs_0_0= ruleCONSTANT_SYMBOL )
                    {
                    // InternalAnalysisDSL.g:382:1: (lv_cs_0_0= ruleCONSTANT_SYMBOL )
                    // InternalAnalysisDSL.g:383:3: lv_cs_0_0= ruleCONSTANT_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_cs_0_0=ruleCONSTANT_SYMBOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermRule());
                      	        }
                             		set(
                             			current, 
                             			"cs",
                              		lv_cs_0_0, 
                              		"net.certware.argument.analysis.AnalysisDSL.CONSTANT_SYMBOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisDSL.g:400:6: ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) )
                    {
                    // InternalAnalysisDSL.g:400:6: ( ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) ) )
                    // InternalAnalysisDSL.g:400:7: ( (lv_sign_1_0= '-' ) )? ( (lv_n_2_0= RULE_NUMBER ) )
                    {
                    // InternalAnalysisDSL.g:400:7: ( (lv_sign_1_0= '-' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==15) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAnalysisDSL.g:401:1: (lv_sign_1_0= '-' )
                            {
                            // InternalAnalysisDSL.g:401:1: (lv_sign_1_0= '-' )
                            // InternalAnalysisDSL.g:402:3: lv_sign_1_0= '-'
                            {
                            lv_sign_1_0=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_sign_1_0, grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTermRule());
                              	        }
                                     		setWithLastConsumed(current, "sign", lv_sign_1_0, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalAnalysisDSL.g:415:3: ( (lv_n_2_0= RULE_NUMBER ) )
                    // InternalAnalysisDSL.g:416:1: (lv_n_2_0= RULE_NUMBER )
                    {
                    // InternalAnalysisDSL.g:416:1: (lv_n_2_0= RULE_NUMBER )
                    // InternalAnalysisDSL.g:417:3: lv_n_2_0= RULE_NUMBER
                    {
                    lv_n_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_n_2_0, grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"n",
                              		lv_n_2_0, 
                              		"net.certware.argument.analysis.AnalysisDSL.NUMBER");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisDSL.g:434:6: ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )
                    {
                    // InternalAnalysisDSL.g:434:6: ( ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )
                    // InternalAnalysisDSL.g:434:7: ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) ) otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')'
                    {
                    // InternalAnalysisDSL.g:434:7: ( (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL ) )
                    // InternalAnalysisDSL.g:435:1: (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL )
                    {
                    // InternalAnalysisDSL.g:435:1: (lv_fs_3_0= ruleFUNCTIONAL_SYMBOL )
                    // InternalAnalysisDSL.g:436:3: lv_fs_3_0= ruleFUNCTIONAL_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_fs_3_0=ruleFUNCTIONAL_SYMBOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermRule());
                      	        }
                             		set(
                             			current, 
                             			"fs",
                              		lv_fs_3_0, 
                              		"net.certware.argument.analysis.AnalysisDSL.FUNCTIONAL_SYMBOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // InternalAnalysisDSL.g:456:1: ( (lv_terms_5_0= ruleTerms ) )
                    // InternalAnalysisDSL.g:457:1: (lv_terms_5_0= ruleTerms )
                    {
                    // InternalAnalysisDSL.g:457:1: (lv_terms_5_0= ruleTerms )
                    // InternalAnalysisDSL.g:458:3: lv_terms_5_0= ruleTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_terms_5_0=ruleTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_5_0, 
                              		"net.certware.argument.analysis.AnalysisDSL.Terms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleCONSTANT_SYMBOL"
    // InternalAnalysisDSL.g:486:1: entryRuleCONSTANT_SYMBOL returns [String current=null] : iv_ruleCONSTANT_SYMBOL= ruleCONSTANT_SYMBOL EOF ;
    public final String entryRuleCONSTANT_SYMBOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONSTANT_SYMBOL = null;


        try {
            // InternalAnalysisDSL.g:487:2: (iv_ruleCONSTANT_SYMBOL= ruleCONSTANT_SYMBOL EOF )
            // InternalAnalysisDSL.g:488:2: iv_ruleCONSTANT_SYMBOL= ruleCONSTANT_SYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONSTANT_SYMBOLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCONSTANT_SYMBOL=ruleCONSTANT_SYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONSTANT_SYMBOL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCONSTANT_SYMBOL"


    // $ANTLR start "ruleCONSTANT_SYMBOL"
    // InternalAnalysisDSL.g:495:1: ruleCONSTANT_SYMBOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleCONSTANT_SYMBOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:498:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:499:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getCONSTANT_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCONSTANT_SYMBOL"


    // $ANTLR start "entryRuleFUNCTIONAL_SYMBOL"
    // InternalAnalysisDSL.g:514:1: entryRuleFUNCTIONAL_SYMBOL returns [String current=null] : iv_ruleFUNCTIONAL_SYMBOL= ruleFUNCTIONAL_SYMBOL EOF ;
    public final String entryRuleFUNCTIONAL_SYMBOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTIONAL_SYMBOL = null;


        try {
            // InternalAnalysisDSL.g:515:2: (iv_ruleFUNCTIONAL_SYMBOL= ruleFUNCTIONAL_SYMBOL EOF )
            // InternalAnalysisDSL.g:516:2: iv_ruleFUNCTIONAL_SYMBOL= ruleFUNCTIONAL_SYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFUNCTIONAL_SYMBOLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFUNCTIONAL_SYMBOL=ruleFUNCTIONAL_SYMBOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFUNCTIONAL_SYMBOL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFUNCTIONAL_SYMBOL"


    // $ANTLR start "ruleFUNCTIONAL_SYMBOL"
    // InternalAnalysisDSL.g:523:1: ruleFUNCTIONAL_SYMBOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFUNCTIONAL_SYMBOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // InternalAnalysisDSL.g:526:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:527:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IDENTIFIER_0, grammarAccess.getFUNCTIONAL_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFUNCTIONAL_SYMBOL"

    // $ANTLR start synpred3_InternalAnalysisDSL
    public final void synpred3_InternalAnalysisDSL_fragment() throws RecognitionException {   
        EObject lv_items_0_0 = null;


        // InternalAnalysisDSL.g:135:1: ( (lv_items_0_0= ruleClassicLiteral ) )
        // InternalAnalysisDSL.g:135:1: (lv_items_0_0= ruleClassicLiteral )
        {
        // InternalAnalysisDSL.g:135:1: (lv_items_0_0= ruleClassicLiteral )
        // InternalAnalysisDSL.g:136:3: lv_items_0_0= ruleClassicLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_items_0_0=ruleClassicLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalAnalysisDSL

    // Delegated rules

    public final boolean synpred3_InternalAnalysisDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAnalysisDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008072L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000280C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});

}