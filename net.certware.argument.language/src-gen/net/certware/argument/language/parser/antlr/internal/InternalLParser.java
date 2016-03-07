package net.certware.argument.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.argument.language.services.LGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UID", "RULE_LID", "RULE_NUMERIC_CONSTANT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "','", "'every'", "'some'", "'const'", "'='", "'.'", "'type'", "'{'", "'}'", "'where'", "'in'", "'\\\\'", "'>'", "'<'", "'>='", "'<='", "'!='", "'or'", "'and'", "'not'", "'maybe'", "'|'", "'if'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_NUMERIC_CONSTANT=6;
    public static final int RULE_LID=5;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UID=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LGrammarAccess grammarAccess;
     	
        public InternalLParser(TokenStream input, LGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected LGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // InternalL.g:73:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalL.g:74:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalL.g:75:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalL.g:82:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:85:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalL.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalL.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_UID && LA1_0<=RULE_NUMERIC_CONSTANT)||LA1_0==19||LA1_0==24||LA1_0==27||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalL.g:87:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalL.g:87:1: (lv_statements_0_0= ruleStatement )
            	    // InternalL.g:88:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"net.certware.argument.language.L.Statement");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBasicTerm"
    // InternalL.g:112:1: entryRuleBasicTerm returns [EObject current=null] : iv_ruleBasicTerm= ruleBasicTerm EOF ;
    public final EObject entryRuleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerm = null;


        try {
            // InternalL.g:113:2: (iv_ruleBasicTerm= ruleBasicTerm EOF )
            // InternalL.g:114:2: iv_ruleBasicTerm= ruleBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicTerm=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerm; 
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
    // $ANTLR end "entryRuleBasicTerm"


    // $ANTLR start "ruleBasicTerm"
    // InternalL.g:121:1: ruleBasicTerm returns [EObject current=null] : (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm ) ;
    public final EObject ruleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject this_TypedVariable_0 = null;

        EObject this_ArithmeticTerm_1 = null;

        EObject this_FunctionalTerm_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:124:28: ( (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm ) )
            // InternalL.g:125:1: (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm )
            {
            // InternalL.g:125:1: (this_TypedVariable_0= ruleTypedVariable | this_ArithmeticTerm_1= ruleArithmeticTerm | this_FunctionalTerm_2= ruleFunctionalTerm )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LID) ) {
                switch ( input.LA(2) ) {
                case RULE_UID:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (synpred2_InternalL()) ) {
                        alt2=1;
                    }
                    else if ( (synpred3_InternalL()) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 20:
                case 21:
                case 25:
                case 26:
                case 30:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==RULE_UID||LA2_0==RULE_NUMERIC_CONSTANT||LA2_0==19) ) {
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
                    // InternalL.g:126:2: this_TypedVariable_0= ruleTypedVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TypedVariable_0=ruleTypedVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedVariable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:139:2: this_ArithmeticTerm_1= ruleArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ArithmeticTerm_1=ruleArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArithmeticTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalL.g:152:2: this_FunctionalTerm_2= ruleFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionalTerm_2=ruleFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionalTerm_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleBasicTerm"


    // $ANTLR start "entryRuleVariable"
    // InternalL.g:171:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalL.g:172:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalL.g:173:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalL.g:180:1: ruleVariable returns [EObject current=null] : ( (lv_identifier_0_0= RULE_UID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         enterRule(); 
            
        try {
            // InternalL.g:183:28: ( ( (lv_identifier_0_0= RULE_UID ) ) )
            // InternalL.g:184:1: ( (lv_identifier_0_0= RULE_UID ) )
            {
            // InternalL.g:184:1: ( (lv_identifier_0_0= RULE_UID ) )
            // InternalL.g:185:1: (lv_identifier_0_0= RULE_UID )
            {
            // InternalL.g:185:1: (lv_identifier_0_0= RULE_UID )
            // InternalL.g:186:3: lv_identifier_0_0= RULE_UID
            {
            lv_identifier_0_0=(Token)match(input,RULE_UID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_0_0, grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_0_0, 
                      		"net.certware.argument.language.L.UID");
              	    
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalL.g:210:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalL.g:211:2: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalL.g:212:2: iv_ruleTypedVariable= ruleTypedVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedVariable=ruleTypedVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedVariable; 
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
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // InternalL.g:219:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_var_1_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:222:28: ( ( ( (lv_name_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) ) )
            // InternalL.g:223:1: ( ( (lv_name_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            {
            // InternalL.g:223:1: ( ( (lv_name_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) ) )
            // InternalL.g:223:2: ( (lv_name_0_0= RULE_LID ) ) ( (lv_var_1_0= ruleVariable ) )
            {
            // InternalL.g:223:2: ( (lv_name_0_0= RULE_LID ) )
            // InternalL.g:224:1: (lv_name_0_0= RULE_LID )
            {
            // InternalL.g:224:1: (lv_name_0_0= RULE_LID )
            // InternalL.g:225:3: lv_name_0_0= RULE_LID
            {
            lv_name_0_0=(Token)match(input,RULE_LID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTypedVariableAccess().getNameLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"net.certware.argument.language.L.LID");
              	    
            }

            }


            }

            // InternalL.g:241:2: ( (lv_var_1_0= ruleVariable ) )
            // InternalL.g:242:1: (lv_var_1_0= ruleVariable )
            {
            // InternalL.g:242:1: (lv_var_1_0= ruleVariable )
            // InternalL.g:243:3: lv_var_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedVariableRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
                      		"net.certware.argument.language.L.Variable");
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
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleArithmeticTerm"
    // InternalL.g:267:1: entryRuleArithmeticTerm returns [EObject current=null] : iv_ruleArithmeticTerm= ruleArithmeticTerm EOF ;
    public final EObject entryRuleArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticTerm = null;


        try {
            // InternalL.g:268:2: (iv_ruleArithmeticTerm= ruleArithmeticTerm EOF )
            // InternalL.g:269:2: iv_ruleArithmeticTerm= ruleArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticTerm=ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticTerm; 
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
    // $ANTLR end "entryRuleArithmeticTerm"


    // $ANTLR start "ruleArithmeticTerm"
    // InternalL.g:276:1: ruleArithmeticTerm returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:279:28: (this_Addition_0= ruleAddition )
            // InternalL.g:281:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleArithmeticTerm"


    // $ANTLR start "entryRuleAddition"
    // InternalL.g:300:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalL.g:301:2: (iv_ruleAddition= ruleAddition EOF )
            // InternalL.g:302:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalL.g:309:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Multiplication_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:312:28: ( (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* ) )
            // InternalL.g:313:1: (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* )
            {
            // InternalL.g:313:1: (this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )* )
            // InternalL.g:314:2: this_Multiplication_0= ruleMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_5);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:325:1: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalL.g:325:2: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleMultiplication ) )
            	    {
            	    // InternalL.g:325:2: ()
            	    // InternalL.g:326:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:334:2: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==15) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalL.g:334:4: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:339:7: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:343:2: ( (lv_rhs_4_0= ruleMultiplication ) )
            	    // InternalL.g:344:1: (lv_rhs_4_0= ruleMultiplication )
            	    {
            	    // InternalL.g:344:1: (lv_rhs_4_0= ruleMultiplication )
            	    // InternalL.g:345:3: lv_rhs_4_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_4_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_4_0, 
            	              		"net.certware.argument.language.L.Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalL.g:369:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalL.g:370:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalL.g:371:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalL.g:378:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:381:28: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // InternalL.g:382:1: (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // InternalL.g:382:1: (this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // InternalL.g:383:2: this_Primary_0= rulePrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_7);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:394:1: ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalL.g:394:2: () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // InternalL.g:394:2: ()
            	    // InternalL.g:395:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:403:2: (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // InternalL.g:403:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:408:7: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalL.g:413:7: otherlv_4= '%'
            	            {
            	            otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:417:2: ( (lv_rhs_5_0= rulePrimary ) )
            	    // InternalL.g:418:1: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // InternalL.g:418:1: (lv_rhs_5_0= rulePrimary )
            	    // InternalL.g:419:3: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_rhs_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_5_0, 
            	              		"net.certware.argument.language.L.Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalL.g:443:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalL.g:444:2: (iv_rulePrimary= rulePrimary EOF )
            // InternalL.g:445:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalL.g:452:1: rulePrimary returns [EObject current=null] : ( ( (lv_term_0_0= ruleArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:455:28: ( ( ( (lv_term_0_0= ruleArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) ) )
            // InternalL.g:456:1: ( ( (lv_term_0_0= ruleArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            {
            // InternalL.g:456:1: ( ( (lv_term_0_0= ruleArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_UID && LA7_0<=RULE_NUMERIC_CONSTANT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalL.g:456:2: ( (lv_term_0_0= ruleArithmeticLiteral ) )
                    {
                    // InternalL.g:456:2: ( (lv_term_0_0= ruleArithmeticLiteral ) )
                    // InternalL.g:457:1: (lv_term_0_0= ruleArithmeticLiteral )
                    {
                    // InternalL.g:457:1: (lv_term_0_0= ruleArithmeticLiteral )
                    // InternalL.g:458:3: lv_term_0_0= ruleArithmeticLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getTermArithmeticLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_term_0_0=ruleArithmeticLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_0_0, 
                              		"net.certware.argument.language.L.ArithmeticLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:475:6: (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' )
                    {
                    // InternalL.g:475:6: (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' )
                    // InternalL.g:475:8: otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalL.g:479:1: ( (lv_term_2_0= ruleAddition ) )
                    // InternalL.g:480:1: (lv_term_2_0= ruleAddition )
                    {
                    // InternalL.g:480:1: (lv_term_2_0= ruleAddition )
                    // InternalL.g:481:3: lv_term_2_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
                    lv_term_2_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_2_0, 
                              		"net.certware.argument.language.L.Addition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArithmeticLiteral"
    // InternalL.g:509:1: entryRuleArithmeticLiteral returns [EObject current=null] : iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF ;
    public final EObject entryRuleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticLiteral = null;


        try {
            // InternalL.g:510:2: (iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF )
            // InternalL.g:511:2: iv_ruleArithmeticLiteral= ruleArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticLiteral=ruleArithmeticLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticLiteral; 
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
    // $ANTLR end "entryRuleArithmeticLiteral"


    // $ANTLR start "ruleArithmeticLiteral"
    // InternalL.g:518:1: ruleArithmeticLiteral returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) ) ) ;
    public final EObject ruleArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_const_2_0=null;
        Token lv_value_3_0=null;
        EObject lv_v_0_0 = null;

        EObject lv_tv_1_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:521:28: ( ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) ) ) )
            // InternalL.g:522:1: ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) ) )
            {
            // InternalL.g:522:1: ( ( (lv_v_0_0= ruleVariable ) ) | ( (lv_tv_1_0= ruleTypedVariable ) ) | ( (lv_const_2_0= RULE_LID ) ) | ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_UID:
                {
                alt8=1;
                }
                break;
            case RULE_LID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||(LA8_2>=14 && LA8_2<=18)||(LA8_2>=20 && LA8_2<=21)||(LA8_2>=25 && LA8_2<=26)||(LA8_2>=29 && LA8_2<=30)||(LA8_2>=33 && LA8_2<=39)||LA8_2==43) ) {
                    alt8=3;
                }
                else if ( (LA8_2==RULE_UID) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMERIC_CONSTANT:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalL.g:522:2: ( (lv_v_0_0= ruleVariable ) )
                    {
                    // InternalL.g:522:2: ( (lv_v_0_0= ruleVariable ) )
                    // InternalL.g:523:1: (lv_v_0_0= ruleVariable )
                    {
                    // InternalL.g:523:1: (lv_v_0_0= ruleVariable )
                    // InternalL.g:524:3: lv_v_0_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticLiteralAccess().getVVariableParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_v_0_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"v",
                              		lv_v_0_0, 
                              		"net.certware.argument.language.L.Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:541:6: ( (lv_tv_1_0= ruleTypedVariable ) )
                    {
                    // InternalL.g:541:6: ( (lv_tv_1_0= ruleTypedVariable ) )
                    // InternalL.g:542:1: (lv_tv_1_0= ruleTypedVariable )
                    {
                    // InternalL.g:542:1: (lv_tv_1_0= ruleTypedVariable )
                    // InternalL.g:543:3: lv_tv_1_0= ruleTypedVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticLiteralAccess().getTvTypedVariableParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_tv_1_0=ruleTypedVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"tv",
                              		lv_tv_1_0, 
                              		"net.certware.argument.language.L.TypedVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:560:6: ( (lv_const_2_0= RULE_LID ) )
                    {
                    // InternalL.g:560:6: ( (lv_const_2_0= RULE_LID ) )
                    // InternalL.g:561:1: (lv_const_2_0= RULE_LID )
                    {
                    // InternalL.g:561:1: (lv_const_2_0= RULE_LID )
                    // InternalL.g:562:3: lv_const_2_0= RULE_LID
                    {
                    lv_const_2_0=(Token)match(input,RULE_LID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_const_2_0, grammarAccess.getArithmeticLiteralAccess().getConstLIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"const",
                              		lv_const_2_0, 
                              		"net.certware.argument.language.L.LID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalL.g:579:6: ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) )
                    {
                    // InternalL.g:579:6: ( (lv_value_3_0= RULE_NUMERIC_CONSTANT ) )
                    // InternalL.g:580:1: (lv_value_3_0= RULE_NUMERIC_CONSTANT )
                    {
                    // InternalL.g:580:1: (lv_value_3_0= RULE_NUMERIC_CONSTANT )
                    // InternalL.g:581:3: lv_value_3_0= RULE_NUMERIC_CONSTANT
                    {
                    lv_value_3_0=(Token)match(input,RULE_NUMERIC_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"net.certware.argument.language.L.NUMERIC_CONSTANT");
                      	    
                    }

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
    // $ANTLR end "ruleArithmeticLiteral"


    // $ANTLR start "entryRuleGroundArithmeticTerm"
    // InternalL.g:605:1: entryRuleGroundArithmeticTerm returns [EObject current=null] : iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF ;
    public final EObject entryRuleGroundArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundArithmeticTerm = null;


        try {
            // InternalL.g:606:2: (iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF )
            // InternalL.g:607:2: iv_ruleGroundArithmeticTerm= ruleGroundArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundArithmeticTerm=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundArithmeticTerm; 
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
    // $ANTLR end "entryRuleGroundArithmeticTerm"


    // $ANTLR start "ruleGroundArithmeticTerm"
    // InternalL.g:614:1: ruleGroundArithmeticTerm returns [EObject current=null] : this_GroundAddition_0= ruleGroundAddition ;
    public final EObject ruleGroundArithmeticTerm() throws RecognitionException {
        EObject current = null;

        EObject this_GroundAddition_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:617:28: (this_GroundAddition_0= ruleGroundAddition )
            // InternalL.g:619:2: this_GroundAddition_0= ruleGroundAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundArithmeticTermAccess().getGroundAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_GroundAddition_0=ruleGroundAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundAddition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleGroundArithmeticTerm"


    // $ANTLR start "entryRuleGroundAddition"
    // InternalL.g:638:1: entryRuleGroundAddition returns [EObject current=null] : iv_ruleGroundAddition= ruleGroundAddition EOF ;
    public final EObject entryRuleGroundAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundAddition = null;


        try {
            // InternalL.g:639:2: (iv_ruleGroundAddition= ruleGroundAddition EOF )
            // InternalL.g:640:2: iv_ruleGroundAddition= ruleGroundAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundAddition=ruleGroundAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundAddition; 
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
    // $ANTLR end "entryRuleGroundAddition"


    // $ANTLR start "ruleGroundAddition"
    // InternalL.g:647:1: ruleGroundAddition returns [EObject current=null] : (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* ) ;
    public final EObject ruleGroundAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_GroundMultiplication_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:650:28: ( (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* ) )
            // InternalL.g:651:1: (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* )
            {
            // InternalL.g:651:1: (this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )* )
            // InternalL.g:652:2: this_GroundMultiplication_0= ruleGroundMultiplication ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundAdditionAccess().getGroundMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_5);
            this_GroundMultiplication_0=ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:663:1: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalL.g:663:2: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_rhs_4_0= ruleGroundMultiplication ) )
            	    {
            	    // InternalL.g:663:2: ()
            	    // InternalL.g:664:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:672:2: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==14) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==15) ) {
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
            	            // InternalL.g:672:4: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getGroundAdditionAccess().getPlusSignKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:677:7: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getGroundAdditionAccess().getHyphenMinusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:681:2: ( (lv_rhs_4_0= ruleGroundMultiplication ) )
            	    // InternalL.g:682:1: (lv_rhs_4_0= ruleGroundMultiplication )
            	    {
            	    // InternalL.g:682:1: (lv_rhs_4_0= ruleGroundMultiplication )
            	    // InternalL.g:683:3: lv_rhs_4_0= ruleGroundMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundAdditionAccess().getRhsGroundMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_4_0=ruleGroundMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_4_0, 
            	              		"net.certware.argument.language.L.GroundMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleGroundAddition"


    // $ANTLR start "entryRuleGroundMultiplication"
    // InternalL.g:707:1: entryRuleGroundMultiplication returns [EObject current=null] : iv_ruleGroundMultiplication= ruleGroundMultiplication EOF ;
    public final EObject entryRuleGroundMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundMultiplication = null;


        try {
            // InternalL.g:708:2: (iv_ruleGroundMultiplication= ruleGroundMultiplication EOF )
            // InternalL.g:709:2: iv_ruleGroundMultiplication= ruleGroundMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundMultiplication=ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundMultiplication; 
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
    // $ANTLR end "entryRuleGroundMultiplication"


    // $ANTLR start "ruleGroundMultiplication"
    // InternalL.g:716:1: ruleGroundMultiplication returns [EObject current=null] : (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleGroundMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_GroundPrimary_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:719:28: ( (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // InternalL.g:720:1: (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // InternalL.g:720:1: (this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // InternalL.g:721:2: this_GroundPrimary_0= ruleGroundPrimary ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundMultiplicationAccess().getGroundPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_7);
            this_GroundPrimary_0=ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:732:1: ( () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=16 && LA12_0<=18)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalL.g:732:2: () (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // InternalL.g:732:2: ()
            	    // InternalL.g:733:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:741:2: (otherlv_2= '*' | otherlv_3= '/' | otherlv_4= '%' )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalL.g:741:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getGroundMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:746:7: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getGroundMultiplicationAccess().getSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalL.g:751:7: otherlv_4= '%'
            	            {
            	            otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getGroundMultiplicationAccess().getPercentSignKeyword_1_1_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:755:2: ( (lv_rhs_5_0= rulePrimary ) )
            	    // InternalL.g:756:1: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // InternalL.g:756:1: (lv_rhs_5_0= rulePrimary )
            	    // InternalL.g:757:3: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_rhs_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rhs",
            	              		lv_rhs_5_0, 
            	              		"net.certware.argument.language.L.Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleGroundMultiplication"


    // $ANTLR start "entryRuleGroundPrimary"
    // InternalL.g:781:1: entryRuleGroundPrimary returns [EObject current=null] : iv_ruleGroundPrimary= ruleGroundPrimary EOF ;
    public final EObject entryRuleGroundPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundPrimary = null;


        try {
            // InternalL.g:782:2: (iv_ruleGroundPrimary= ruleGroundPrimary EOF )
            // InternalL.g:783:2: iv_ruleGroundPrimary= ruleGroundPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundPrimary=ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundPrimary; 
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
    // $ANTLR end "entryRuleGroundPrimary"


    // $ANTLR start "ruleGroundPrimary"
    // InternalL.g:790:1: ruleGroundPrimary returns [EObject current=null] : ( ( (lv_term_0_0= ruleGroundArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleGroundPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:793:28: ( ( ( (lv_term_0_0= ruleGroundArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) ) )
            // InternalL.g:794:1: ( ( (lv_term_0_0= ruleGroundArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            {
            // InternalL.g:794:1: ( ( (lv_term_0_0= ruleGroundArithmeticLiteral ) ) | (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_LID && LA13_0<=RULE_NUMERIC_CONSTANT)) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalL.g:794:2: ( (lv_term_0_0= ruleGroundArithmeticLiteral ) )
                    {
                    // InternalL.g:794:2: ( (lv_term_0_0= ruleGroundArithmeticLiteral ) )
                    // InternalL.g:795:1: (lv_term_0_0= ruleGroundArithmeticLiteral )
                    {
                    // InternalL.g:795:1: (lv_term_0_0= ruleGroundArithmeticLiteral )
                    // InternalL.g:796:3: lv_term_0_0= ruleGroundArithmeticLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroundPrimaryAccess().getTermGroundArithmeticLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_term_0_0=ruleGroundArithmeticLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroundPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_0_0, 
                              		"net.certware.argument.language.L.GroundArithmeticLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:813:6: (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' )
                    {
                    // InternalL.g:813:6: (otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')' )
                    // InternalL.g:813:8: otherlv_1= '(' ( (lv_term_2_0= ruleAddition ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGroundPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalL.g:817:1: ( (lv_term_2_0= ruleAddition ) )
                    // InternalL.g:818:1: (lv_term_2_0= ruleAddition )
                    {
                    // InternalL.g:818:1: (lv_term_2_0= ruleAddition )
                    // InternalL.g:819:3: lv_term_2_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroundPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
                    lv_term_2_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroundPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_2_0, 
                              		"net.certware.argument.language.L.Addition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getGroundPrimaryAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleGroundPrimary"


    // $ANTLR start "entryRuleGroundArithmeticLiteral"
    // InternalL.g:847:1: entryRuleGroundArithmeticLiteral returns [EObject current=null] : iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF ;
    public final EObject entryRuleGroundArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundArithmeticLiteral = null;


        try {
            // InternalL.g:848:2: (iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF )
            // InternalL.g:849:2: iv_ruleGroundArithmeticLiteral= ruleGroundArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundArithmeticLiteral=ruleGroundArithmeticLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundArithmeticLiteral; 
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
    // $ANTLR end "entryRuleGroundArithmeticLiteral"


    // $ANTLR start "ruleGroundArithmeticLiteral"
    // InternalL.g:856:1: ruleGroundArithmeticLiteral returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) ) ) ;
    public final EObject ruleGroundArithmeticLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalL.g:859:28: ( ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) ) ) )
            // InternalL.g:860:1: ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) ) )
            {
            // InternalL.g:860:1: ( ( (lv_identifier_0_0= RULE_LID ) ) | ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_NUMERIC_CONSTANT) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalL.g:860:2: ( (lv_identifier_0_0= RULE_LID ) )
                    {
                    // InternalL.g:860:2: ( (lv_identifier_0_0= RULE_LID ) )
                    // InternalL.g:861:1: (lv_identifier_0_0= RULE_LID )
                    {
                    // InternalL.g:861:1: (lv_identifier_0_0= RULE_LID )
                    // InternalL.g:862:3: lv_identifier_0_0= RULE_LID
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_LID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_0_0, grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierLIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGroundArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_0_0, 
                              		"net.certware.argument.language.L.LID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:879:6: ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) )
                    {
                    // InternalL.g:879:6: ( (lv_value_1_0= RULE_NUMERIC_CONSTANT ) )
                    // InternalL.g:880:1: (lv_value_1_0= RULE_NUMERIC_CONSTANT )
                    {
                    // InternalL.g:880:1: (lv_value_1_0= RULE_NUMERIC_CONSTANT )
                    // InternalL.g:881:3: lv_value_1_0= RULE_NUMERIC_CONSTANT
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMERIC_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getGroundArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGroundArithmeticLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"net.certware.argument.language.L.NUMERIC_CONSTANT");
                      	    
                    }

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
    // $ANTLR end "ruleGroundArithmeticLiteral"


    // $ANTLR start "entryRuleFunctionalTerm"
    // InternalL.g:905:1: entryRuleFunctionalTerm returns [EObject current=null] : iv_ruleFunctionalTerm= ruleFunctionalTerm EOF ;
    public final EObject entryRuleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalTerm = null;


        try {
            // InternalL.g:906:2: (iv_ruleFunctionalTerm= ruleFunctionalTerm EOF )
            // InternalL.g:907:2: iv_ruleFunctionalTerm= ruleFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalTerm=ruleFunctionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionalTerm; 
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
    // $ANTLR end "entryRuleFunctionalTerm"


    // $ANTLR start "ruleFunctionalTerm"
    // InternalL.g:914:1: ruleFunctionalTerm returns [EObject current=null] : (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' ) ;
    public final EObject ruleFunctionalTerm() throws RecognitionException {
        EObject current = null;

        Token this_LID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Terms_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:917:28: ( (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' ) )
            // InternalL.g:918:1: (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' )
            {
            // InternalL.g:918:1: (this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')' )
            // InternalL.g:918:2: this_LID_0= RULE_LID otherlv_1= '(' this_Terms_2= ruleTerms otherlv_3= ')'
            {
            this_LID_0=(Token)match(input,RULE_LID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LID_0, grammarAccess.getFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionalTermAccess().getTermsParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_8);
            this_Terms_2=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Terms_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleFunctionalTerm"


    // $ANTLR start "entryRuleGroundFunctionalTerm"
    // InternalL.g:950:1: entryRuleGroundFunctionalTerm returns [EObject current=null] : iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF ;
    public final EObject entryRuleGroundFunctionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundFunctionalTerm = null;


        try {
            // InternalL.g:951:2: (iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF )
            // InternalL.g:952:2: iv_ruleGroundFunctionalTerm= ruleGroundFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundFunctionalTerm=ruleGroundFunctionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundFunctionalTerm; 
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
    // $ANTLR end "entryRuleGroundFunctionalTerm"


    // $ANTLR start "ruleGroundFunctionalTerm"
    // InternalL.g:959:1: ruleGroundFunctionalTerm returns [EObject current=null] : (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' ) ;
    public final EObject ruleGroundFunctionalTerm() throws RecognitionException {
        EObject current = null;

        Token this_LID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_GroundTerms_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:962:28: ( (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' ) )
            // InternalL.g:963:1: (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' )
            {
            // InternalL.g:963:1: (this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')' )
            // InternalL.g:963:2: this_LID_0= RULE_LID otherlv_1= '(' this_GroundTerms_2= ruleGroundTerms otherlv_3= ')'
            {
            this_LID_0=(Token)match(input,RULE_LID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LID_0, grammarAccess.getGroundFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroundFunctionalTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGroundFunctionalTermAccess().getGroundTermsParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_8);
            this_GroundTerms_2=ruleGroundTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GroundTerms_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGroundFunctionalTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleGroundFunctionalTerm"


    // $ANTLR start "entryRuleBasicTerms"
    // InternalL.g:995:1: entryRuleBasicTerms returns [EObject current=null] : iv_ruleBasicTerms= ruleBasicTerms EOF ;
    public final EObject entryRuleBasicTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerms = null;


        try {
            // InternalL.g:996:2: (iv_ruleBasicTerms= ruleBasicTerms EOF )
            // InternalL.g:997:2: iv_ruleBasicTerms= ruleBasicTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicTerms=ruleBasicTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerms; 
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
    // $ANTLR end "entryRuleBasicTerms"


    // $ANTLR start "ruleBasicTerms"
    // InternalL.g:1004:1: ruleBasicTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) ;
    public final EObject ruleBasicTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1007:28: ( ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* ) )
            // InternalL.g:1008:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            {
            // InternalL.g:1008:1: ( ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )* )
            // InternalL.g:1008:2: ( (lv_car_0_0= ruleBasicTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            {
            // InternalL.g:1008:2: ( (lv_car_0_0= ruleBasicTerm ) )
            // InternalL.g:1009:1: (lv_car_0_0= ruleBasicTerm )
            {
            // InternalL.g:1009:1: (lv_car_0_0= ruleBasicTerm )
            // InternalL.g:1010:3: lv_car_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
            lv_car_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicTermsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"net.certware.argument.language.L.BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:1026:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalL.g:1026:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalL.g:1030:1: ( (lv_cdr_2_0= ruleBasicTerm ) )
            	    // InternalL.g:1031:1: (lv_cdr_2_0= ruleBasicTerm )
            	    {
            	    // InternalL.g:1031:1: (lv_cdr_2_0= ruleBasicTerm )
            	    // InternalL.g:1032:3: lv_cdr_2_0= ruleBasicTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_cdr_2_0=ruleBasicTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBasicTermsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"net.certware.argument.language.L.BasicTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleBasicTerms"


    // $ANTLR start "entryRuleGroundTerms"
    // InternalL.g:1056:1: entryRuleGroundTerms returns [EObject current=null] : iv_ruleGroundTerms= ruleGroundTerms EOF ;
    public final EObject entryRuleGroundTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerms = null;


        try {
            // InternalL.g:1057:2: (iv_ruleGroundTerms= ruleGroundTerms EOF )
            // InternalL.g:1058:2: iv_ruleGroundTerms= ruleGroundTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundTerms=ruleGroundTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundTerms; 
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
    // $ANTLR end "entryRuleGroundTerms"


    // $ANTLR start "ruleGroundTerms"
    // InternalL.g:1065:1: ruleGroundTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* ) ;
    public final EObject ruleGroundTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1068:28: ( ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* ) )
            // InternalL.g:1069:1: ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* )
            {
            // InternalL.g:1069:1: ( ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )* )
            // InternalL.g:1069:2: ( (lv_car_0_0= ruleGroundTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )*
            {
            // InternalL.g:1069:2: ( (lv_car_0_0= ruleGroundTerm ) )
            // InternalL.g:1070:1: (lv_car_0_0= ruleGroundTerm )
            {
            // InternalL.g:1070:1: (lv_car_0_0= ruleGroundTerm )
            // InternalL.g:1071:3: lv_car_0_0= ruleGroundTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroundTermsAccess().getCarGroundTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
            lv_car_0_0=ruleGroundTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroundTermsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"net.certware.argument.language.L.GroundTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:1087:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalL.g:1087:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleGroundTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroundTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalL.g:1091:1: ( (lv_cdr_2_0= ruleGroundTerm ) )
            	    // InternalL.g:1092:1: (lv_cdr_2_0= ruleGroundTerm )
            	    {
            	    // InternalL.g:1092:1: (lv_cdr_2_0= ruleGroundTerm )
            	    // InternalL.g:1093:3: lv_cdr_2_0= ruleGroundTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroundTermsAccess().getCdrGroundTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_cdr_2_0=ruleGroundTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroundTermsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"net.certware.argument.language.L.GroundTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleGroundTerms"


    // $ANTLR start "entryRuleGroundTerm"
    // InternalL.g:1117:1: entryRuleGroundTerm returns [EObject current=null] : iv_ruleGroundTerm= ruleGroundTerm EOF ;
    public final EObject entryRuleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerm = null;


        try {
            // InternalL.g:1118:2: (iv_ruleGroundTerm= ruleGroundTerm EOF )
            // InternalL.g:1119:2: iv_ruleGroundTerm= ruleGroundTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundTerm=ruleGroundTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundTerm; 
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
    // $ANTLR end "entryRuleGroundTerm"


    // $ANTLR start "ruleGroundTerm"
    // InternalL.g:1126:1: ruleGroundTerm returns [EObject current=null] : (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm ) ;
    public final EObject ruleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject this_GroundArithmeticTerm_0 = null;

        EObject this_GroundFunctionalTerm_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1129:28: ( (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm ) )
            // InternalL.g:1130:1: (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm )
            {
            // InternalL.g:1130:1: (this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm | this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||(LA17_1>=14 && LA17_1<=18)||(LA17_1>=20 && LA17_1<=21)||LA17_1==29) ) {
                    alt17=1;
                }
                else if ( (LA17_1==19) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_NUMERIC_CONSTANT||LA17_0==19) ) {
                alt17=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalL.g:1131:2: this_GroundArithmeticTerm_0= ruleGroundArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGroundTermAccess().getGroundArithmeticTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_GroundArithmeticTerm_0=ruleGroundArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GroundArithmeticTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:1144:2: this_GroundFunctionalTerm_1= ruleGroundFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGroundTermAccess().getGroundFunctionalTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_GroundFunctionalTerm_1=ruleGroundFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GroundFunctionalTerm_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleGroundTerm"


    // $ANTLR start "entryRuleQuantifiedTerm"
    // InternalL.g:1163:1: entryRuleQuantifiedTerm returns [EObject current=null] : iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF ;
    public final EObject entryRuleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedTerm = null;


        try {
            // InternalL.g:1164:2: (iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF )
            // InternalL.g:1165:2: iv_ruleQuantifiedTerm= ruleQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuantifiedTerm=ruleQuantifiedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifiedTerm; 
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
    // $ANTLR end "entryRuleQuantifiedTerm"


    // $ANTLR start "ruleQuantifiedTerm"
    // InternalL.g:1172:1: ruleQuantifiedTerm returns [EObject current=null] : (this_UniversalQuantifiedTerm_0= ruleUniversalQuantifiedTerm | this_ExistentialQuantifiedTerm_1= ruleExistentialQuantifiedTerm ) ;
    public final EObject ruleQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject this_UniversalQuantifiedTerm_0 = null;

        EObject this_ExistentialQuantifiedTerm_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1175:28: ( (this_UniversalQuantifiedTerm_0= ruleUniversalQuantifiedTerm | this_ExistentialQuantifiedTerm_1= ruleExistentialQuantifiedTerm ) )
            // InternalL.g:1176:1: (this_UniversalQuantifiedTerm_0= ruleUniversalQuantifiedTerm | this_ExistentialQuantifiedTerm_1= ruleExistentialQuantifiedTerm )
            {
            // InternalL.g:1176:1: (this_UniversalQuantifiedTerm_0= ruleUniversalQuantifiedTerm | this_ExistentialQuantifiedTerm_1= ruleExistentialQuantifiedTerm )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalL.g:1177:2: this_UniversalQuantifiedTerm_0= ruleUniversalQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantifiedTermAccess().getUniversalQuantifiedTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_UniversalQuantifiedTerm_0=ruleUniversalQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UniversalQuantifiedTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:1190:2: this_ExistentialQuantifiedTerm_1= ruleExistentialQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantifiedTermAccess().getExistentialQuantifiedTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ExistentialQuantifiedTerm_1=ruleExistentialQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExistentialQuantifiedTerm_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleQuantifiedTerm"


    // $ANTLR start "entryRuleUniversalQuantifiedTerm"
    // InternalL.g:1209:1: entryRuleUniversalQuantifiedTerm returns [EObject current=null] : iv_ruleUniversalQuantifiedTerm= ruleUniversalQuantifiedTerm EOF ;
    public final EObject entryRuleUniversalQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalQuantifiedTerm = null;


        try {
            // InternalL.g:1210:2: (iv_ruleUniversalQuantifiedTerm= ruleUniversalQuantifiedTerm EOF )
            // InternalL.g:1211:2: iv_ruleUniversalQuantifiedTerm= ruleUniversalQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUniversalQuantifiedTerm=ruleUniversalQuantifiedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalQuantifiedTerm; 
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
    // $ANTLR end "entryRuleUniversalQuantifiedTerm"


    // $ANTLR start "ruleUniversalQuantifiedTerm"
    // InternalL.g:1218:1: ruleUniversalQuantifiedTerm returns [EObject current=null] : (otherlv_0= 'every' ( (lv_name_1_0= ruleTypeId ) ) ) ;
    public final EObject ruleUniversalQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1221:28: ( (otherlv_0= 'every' ( (lv_name_1_0= ruleTypeId ) ) ) )
            // InternalL.g:1222:1: (otherlv_0= 'every' ( (lv_name_1_0= ruleTypeId ) ) )
            {
            // InternalL.g:1222:1: (otherlv_0= 'every' ( (lv_name_1_0= ruleTypeId ) ) )
            // InternalL.g:1222:3: otherlv_0= 'every' ( (lv_name_1_0= ruleTypeId ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUniversalQuantifiedTermAccess().getEveryKeyword_0());
                  
            }
            // InternalL.g:1226:1: ( (lv_name_1_0= ruleTypeId ) )
            // InternalL.g:1227:1: (lv_name_1_0= ruleTypeId )
            {
            // InternalL.g:1227:1: (lv_name_1_0= ruleTypeId )
            // InternalL.g:1228:3: lv_name_1_0= ruleTypeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniversalQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniversalQuantifiedTermRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"net.certware.argument.language.L.TypeId");
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
    // $ANTLR end "ruleUniversalQuantifiedTerm"


    // $ANTLR start "entryRuleExistentialQuantifiedTerm"
    // InternalL.g:1252:1: entryRuleExistentialQuantifiedTerm returns [EObject current=null] : iv_ruleExistentialQuantifiedTerm= ruleExistentialQuantifiedTerm EOF ;
    public final EObject entryRuleExistentialQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistentialQuantifiedTerm = null;


        try {
            // InternalL.g:1253:2: (iv_ruleExistentialQuantifiedTerm= ruleExistentialQuantifiedTerm EOF )
            // InternalL.g:1254:2: iv_ruleExistentialQuantifiedTerm= ruleExistentialQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistentialQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistentialQuantifiedTerm=ruleExistentialQuantifiedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistentialQuantifiedTerm; 
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
    // $ANTLR end "entryRuleExistentialQuantifiedTerm"


    // $ANTLR start "ruleExistentialQuantifiedTerm"
    // InternalL.g:1261:1: ruleExistentialQuantifiedTerm returns [EObject current=null] : (otherlv_0= 'some' ( (lv_name_1_0= ruleTypeId ) ) ) ;
    public final EObject ruleExistentialQuantifiedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1264:28: ( (otherlv_0= 'some' ( (lv_name_1_0= ruleTypeId ) ) ) )
            // InternalL.g:1265:1: (otherlv_0= 'some' ( (lv_name_1_0= ruleTypeId ) ) )
            {
            // InternalL.g:1265:1: (otherlv_0= 'some' ( (lv_name_1_0= ruleTypeId ) ) )
            // InternalL.g:1265:3: otherlv_0= 'some' ( (lv_name_1_0= ruleTypeId ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExistentialQuantifiedTermAccess().getSomeKeyword_0());
                  
            }
            // InternalL.g:1269:1: ( (lv_name_1_0= ruleTypeId ) )
            // InternalL.g:1270:1: (lv_name_1_0= ruleTypeId )
            {
            // InternalL.g:1270:1: (lv_name_1_0= ruleTypeId )
            // InternalL.g:1271:3: lv_name_1_0= ruleTypeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistentialQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistentialQuantifiedTermRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"net.certware.argument.language.L.TypeId");
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
    // $ANTLR end "ruleExistentialQuantifiedTerm"


    // $ANTLR start "entryRuleTerm"
    // InternalL.g:1295:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalL.g:1296:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalL.g:1297:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalL.g:1304:1: ruleTerm returns [EObject current=null] : (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_BasicTerm_0 = null;

        EObject this_QuantifiedTerm_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1307:28: ( (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm ) )
            // InternalL.g:1308:1: (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm )
            {
            // InternalL.g:1308:1: (this_BasicTerm_0= ruleBasicTerm | this_QuantifiedTerm_1= ruleQuantifiedTerm )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_UID && LA19_0<=RULE_NUMERIC_CONSTANT)||LA19_0==19) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=22 && LA19_0<=23)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalL.g:1309:2: this_BasicTerm_0= ruleBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getBasicTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicTerm_0=ruleBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:1322:2: this_QuantifiedTerm_1= ruleQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getQuantifiedTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_QuantifiedTerm_1=ruleQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuantifiedTerm_1; 
                              afterParserOrEnumRuleCall();
                          
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


    // $ANTLR start "entryRuleTerms"
    // InternalL.g:1341:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // InternalL.g:1342:2: (iv_ruleTerms= ruleTerms EOF )
            // InternalL.g:1343:2: iv_ruleTerms= ruleTerms EOF
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
    // InternalL.g:1350:1: ruleTerms returns [EObject current=null] : ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1353:28: ( ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* ) )
            // InternalL.g:1354:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            {
            // InternalL.g:1354:1: ( ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )* )
            // InternalL.g:1354:2: ( (lv_car_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            {
            // InternalL.g:1354:2: ( (lv_car_0_0= ruleTerm ) )
            // InternalL.g:1355:1: (lv_car_0_0= ruleTerm )
            {
            // InternalL.g:1355:1: (lv_car_0_0= ruleTerm )
            // InternalL.g:1356:3: lv_car_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
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
                      		"net.certware.argument.language.L.Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:1372:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalL.g:1372:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalL.g:1376:1: ( (lv_cdr_2_0= ruleTerm ) )
            	    // InternalL.g:1377:1: (lv_cdr_2_0= ruleTerm )
            	    {
            	    // InternalL.g:1377:1: (lv_cdr_2_0= ruleTerm )
            	    // InternalL.g:1378:3: lv_cdr_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
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
            	              		"net.certware.argument.language.L.Term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "entryRuleConstantDeclaration"
    // InternalL.g:1402:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // InternalL.g:1403:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // InternalL.g:1404:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
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
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // InternalL.g:1411:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cv_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1414:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' ) )
            // InternalL.g:1415:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' )
            {
            // InternalL.g:1415:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.' )
            // InternalL.g:1415:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_LID ) ) otherlv_2= '=' ( (lv_cv_3_0= ruleGroundArithmeticTerm ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // InternalL.g:1419:1: ( (lv_name_1_0= RULE_LID ) )
            // InternalL.g:1420:1: (lv_name_1_0= RULE_LID )
            {
            // InternalL.g:1420:1: (lv_name_1_0= RULE_LID )
            // InternalL.g:1421:3: lv_name_1_0= RULE_LID
            {
            lv_name_1_0=(Token)match(input,RULE_LID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDeclarationAccess().getNameLIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"net.certware.argument.language.L.LID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalL.g:1441:1: ( (lv_cv_3_0= ruleGroundArithmeticTerm ) )
            // InternalL.g:1442:1: (lv_cv_3_0= ruleGroundArithmeticTerm )
            {
            // InternalL.g:1442:1: (lv_cv_3_0= ruleGroundArithmeticTerm )
            // InternalL.g:1443:3: lv_cv_3_0= ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getCvGroundArithmeticTermParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_cv_3_0=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"cv",
                      		lv_cv_3_0, 
                      		"net.certware.argument.language.L.GroundArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_4());
                  
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
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleTypeId"
    // InternalL.g:1471:1: entryRuleTypeId returns [EObject current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final EObject entryRuleTypeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeId = null;


        try {
            // InternalL.g:1472:2: (iv_ruleTypeId= ruleTypeId EOF )
            // InternalL.g:1473:2: iv_ruleTypeId= ruleTypeId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeId; 
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
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // InternalL.g:1480:1: ruleTypeId returns [EObject current=null] : ( (lv_name_0_0= RULE_LID ) ) ;
    public final EObject ruleTypeId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalL.g:1483:28: ( ( (lv_name_0_0= RULE_LID ) ) )
            // InternalL.g:1484:1: ( (lv_name_0_0= RULE_LID ) )
            {
            // InternalL.g:1484:1: ( (lv_name_0_0= RULE_LID ) )
            // InternalL.g:1485:1: (lv_name_0_0= RULE_LID )
            {
            // InternalL.g:1485:1: (lv_name_0_0= RULE_LID )
            // InternalL.g:1486:3: lv_name_0_0= RULE_LID
            {
            lv_name_0_0=(Token)match(input,RULE_LID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTypeIdAccess().getNameLIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeIdRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"net.certware.argument.language.L.LID");
              	    
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
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalL.g:1510:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalL.g:1511:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalL.g:1512:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalL.g:1519:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleTypeId ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1522:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleTypeId ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' ) )
            // InternalL.g:1523:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleTypeId ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' )
            {
            // InternalL.g:1523:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleTypeId ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.' )
            // InternalL.g:1523:3: otherlv_0= 'type' ( (lv_name_1_0= ruleTypeId ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSetExpression ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
                  
            }
            // InternalL.g:1527:1: ( (lv_name_1_0= ruleTypeId ) )
            // InternalL.g:1528:1: (lv_name_1_0= ruleTypeId )
            {
            // InternalL.g:1528:1: (lv_name_1_0= ruleTypeId )
            // InternalL.g:1529:3: lv_name_1_0= ruleTypeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getNameTypeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"net.certware.argument.language.L.TypeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalL.g:1549:1: ( (lv_exp_3_0= ruleSetExpression ) )
            // InternalL.g:1550:1: (lv_exp_3_0= ruleSetExpression )
            {
            // InternalL.g:1550:1: (lv_exp_3_0= ruleSetExpression )
            // InternalL.g:1551:3: lv_exp_3_0= ruleSetExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_exp_3_0=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_3_0, 
                      		"net.certware.argument.language.L.SetExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_4());
                  
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleLimit"
    // InternalL.g:1579:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalL.g:1580:2: (iv_ruleLimit= ruleLimit EOF )
            // InternalL.g:1581:2: iv_ruleLimit= ruleLimit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLimitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLimit; 
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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalL.g:1588:1: ruleLimit returns [EObject current=null] : ( (lv_cv_0_0= ruleGroundArithmeticTerm ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_cv_0_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1591:28: ( ( (lv_cv_0_0= ruleGroundArithmeticTerm ) ) )
            // InternalL.g:1592:1: ( (lv_cv_0_0= ruleGroundArithmeticTerm ) )
            {
            // InternalL.g:1592:1: ( (lv_cv_0_0= ruleGroundArithmeticTerm ) )
            // InternalL.g:1593:1: (lv_cv_0_0= ruleGroundArithmeticTerm )
            {
            // InternalL.g:1593:1: (lv_cv_0_0= ruleGroundArithmeticTerm )
            // InternalL.g:1594:3: lv_cv_0_0= ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLimitAccess().getCvGroundArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_cv_0_0=ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLimitRule());
              	        }
                     		set(
                     			current, 
                     			"cv",
                      		lv_cv_0_0, 
                      		"net.certware.argument.language.L.GroundArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSet"
    // InternalL.g:1618:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalL.g:1619:2: (iv_ruleSet= ruleSet EOF )
            // InternalL.g:1620:2: iv_ruleSet= ruleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSet; 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalL.g:1627:1: ruleSet returns [EObject current=null] : ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) ) otherlv_2= '}' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_2=null;
        EObject lv_terms_1_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1630:28: ( ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) ) otherlv_2= '}' ) )
            // InternalL.g:1631:1: ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) ) otherlv_2= '}' )
            {
            // InternalL.g:1631:1: ( ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) ) otherlv_2= '}' )
            // InternalL.g:1631:2: ( (lv_lhs_0_0= '{' ) ) ( (lv_terms_1_0= ruleGroundTerms ) ) otherlv_2= '}'
            {
            // InternalL.g:1631:2: ( (lv_lhs_0_0= '{' ) )
            // InternalL.g:1632:1: (lv_lhs_0_0= '{' )
            {
            // InternalL.g:1632:1: (lv_lhs_0_0= '{' )
            // InternalL.g:1633:3: lv_lhs_0_0= '{'
            {
            lv_lhs_0_0=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_lhs_0_0, grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSetRule());
              	        }
                     		setWithLastConsumed(current, "lhs", lv_lhs_0_0, "{");
              	    
            }

            }


            }

            // InternalL.g:1646:2: ( (lv_terms_1_0= ruleGroundTerms ) )
            // InternalL.g:1647:1: (lv_terms_1_0= ruleGroundTerms )
            {
            // InternalL.g:1647:1: (lv_terms_1_0= ruleGroundTerms )
            // InternalL.g:1648:3: lv_terms_1_0= ruleGroundTerms
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetAccess().getTermsGroundTermsParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_terms_1_0=ruleGroundTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetRule());
              	        }
                     		set(
                     			current, 
                     			"terms",
                      		lv_terms_1_0, 
                      		"net.certware.argument.language.L.GroundTerms");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2());
                  
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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleRange"
    // InternalL.g:1676:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalL.g:1677:2: (iv_ruleRange= ruleRange EOF )
            // InternalL.g:1678:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalL.g:1685:1: ruleRange returns [EObject current=null] : (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1688:28: ( (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' ) )
            // InternalL.g:1689:1: (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' )
            {
            // InternalL.g:1689:1: (otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}' )
            // InternalL.g:1689:3: otherlv_0= '{' ( (lv_lhs_1_0= ruleLimit ) ) otherlv_2= '.' otherlv_3= '.' ( (lv_rhs_4_0= ruleLimit ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalL.g:1693:1: ( (lv_lhs_1_0= ruleLimit ) )
            // InternalL.g:1694:1: (lv_lhs_1_0= ruleLimit )
            {
            // InternalL.g:1694:1: (lv_lhs_1_0= ruleLimit )
            // InternalL.g:1695:3: lv_lhs_1_0= ruleLimit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getLhsLimitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_lhs_1_0=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_1_0, 
                      		"net.certware.argument.language.L.Limit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getFullStopKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopKeyword_3());
                  
            }
            // InternalL.g:1719:1: ( (lv_rhs_4_0= ruleLimit ) )
            // InternalL.g:1720:1: (lv_rhs_4_0= ruleLimit )
            {
            // InternalL.g:1720:1: (lv_rhs_4_0= ruleLimit )
            // InternalL.g:1721:3: lv_rhs_4_0= ruleLimit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getRhsLimitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_rhs_4_0=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_4_0, 
                      		"net.certware.argument.language.L.Limit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleSetExpression"
    // InternalL.g:1749:1: entryRuleSetExpression returns [EObject current=null] : iv_ruleSetExpression= ruleSetExpression EOF ;
    public final EObject entryRuleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpression = null;


        try {
            // InternalL.g:1750:2: (iv_ruleSetExpression= ruleSetExpression EOF )
            // InternalL.g:1751:2: iv_ruleSetExpression= ruleSetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetExpression=ruleSetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetExpression; 
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
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // InternalL.g:1758:1: ruleSetExpression returns [EObject current=null] : this_SetAddition_0= ruleSetAddition ;
    public final EObject ruleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SetAddition_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1761:28: (this_SetAddition_0= ruleSetAddition )
            // InternalL.g:1763:2: this_SetAddition_0= ruleSetAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_SetAddition_0=ruleSetAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetAddition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleSetConstruct"
    // InternalL.g:1782:1: entryRuleSetConstruct returns [EObject current=null] : iv_ruleSetConstruct= ruleSetConstruct EOF ;
    public final EObject entryRuleSetConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetConstruct = null;


        try {
            // InternalL.g:1783:2: (iv_ruleSetConstruct= ruleSetConstruct EOF )
            // InternalL.g:1784:2: iv_ruleSetConstruct= ruleSetConstruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetConstructRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetConstruct=ruleSetConstruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetConstruct; 
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
    // $ANTLR end "entryRuleSetConstruct"


    // $ANTLR start "ruleSetConstruct"
    // InternalL.g:1791:1: ruleSetConstruct returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) ) ;
    public final EObject ruleSetConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1794:28: ( ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) ) )
            // InternalL.g:1795:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) )
            {
            // InternalL.g:1795:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) ) )
            // InternalL.g:1795:2: ( (lv_lhs_0_0= ruleBasicTerm ) ) otherlv_1= 'where' ( (lv_rhs_2_0= ruleTVars ) )
            {
            // InternalL.g:1795:2: ( (lv_lhs_0_0= ruleBasicTerm ) )
            // InternalL.g:1796:1: (lv_lhs_0_0= ruleBasicTerm )
            {
            // InternalL.g:1796:1: (lv_lhs_0_0= ruleBasicTerm )
            // InternalL.g:1797:3: lv_lhs_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetConstructAccess().getLhsBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_lhs_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetConstructRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"net.certware.argument.language.L.BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSetConstructAccess().getWhereKeyword_1());
                  
            }
            // InternalL.g:1817:1: ( (lv_rhs_2_0= ruleTVars ) )
            // InternalL.g:1818:1: (lv_rhs_2_0= ruleTVars )
            {
            // InternalL.g:1818:1: (lv_rhs_2_0= ruleTVars )
            // InternalL.g:1819:3: lv_rhs_2_0= ruleTVars
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetConstructAccess().getRhsTVarsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleTVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetConstructRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"net.certware.argument.language.L.TVars");
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
    // $ANTLR end "ruleSetConstruct"


    // $ANTLR start "entryRuleTVars"
    // InternalL.g:1843:1: entryRuleTVars returns [EObject current=null] : iv_ruleTVars= ruleTVars EOF ;
    public final EObject entryRuleTVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVars = null;


        try {
            // InternalL.g:1844:2: (iv_ruleTVars= ruleTVars EOF )
            // InternalL.g:1845:2: iv_ruleTVars= ruleTVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTVars=ruleTVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVars; 
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
    // $ANTLR end "entryRuleTVars"


    // $ANTLR start "ruleTVars"
    // InternalL.g:1852:1: ruleTVars returns [EObject current=null] : ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) ;
    public final EObject ruleTVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_car_0_0 = null;

        EObject lv_cdr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1855:28: ( ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* ) )
            // InternalL.g:1856:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            {
            // InternalL.g:1856:1: ( ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )* )
            // InternalL.g:1856:2: ( (lv_car_0_0= ruleTVar ) ) (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            {
            // InternalL.g:1856:2: ( (lv_car_0_0= ruleTVar ) )
            // InternalL.g:1857:1: (lv_car_0_0= ruleTVar )
            {
            // InternalL.g:1857:1: (lv_car_0_0= ruleTVar )
            // InternalL.g:1858:3: lv_car_0_0= ruleTVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
            lv_car_0_0=ruleTVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTVarsRule());
              	        }
                     		set(
                     			current, 
                     			"car",
                      		lv_car_0_0, 
                      		"net.certware.argument.language.L.TVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:1874:2: (otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalL.g:1874:4: otherlv_1= ',' ( (lv_cdr_2_0= ruleTVar ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalL.g:1878:1: ( (lv_cdr_2_0= ruleTVar ) )
            	    // InternalL.g:1879:1: (lv_cdr_2_0= ruleTVar )
            	    {
            	    // InternalL.g:1879:1: (lv_cdr_2_0= ruleTVar )
            	    // InternalL.g:1880:3: lv_cdr_2_0= ruleTVar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_cdr_2_0=ruleTVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTVarsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cdr",
            	              		lv_cdr_2_0, 
            	              		"net.certware.argument.language.L.TVar");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleTVars"


    // $ANTLR start "entryRuleTVar"
    // InternalL.g:1904:1: entryRuleTVar returns [EObject current=null] : iv_ruleTVar= ruleTVar EOF ;
    public final EObject entryRuleTVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVar = null;


        try {
            // InternalL.g:1905:2: (iv_ruleTVar= ruleTVar EOF )
            // InternalL.g:1906:2: iv_ruleTVar= ruleTVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTVar=ruleTVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTVar; 
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
    // $ANTLR end "entryRuleTVar"


    // $ANTLR start "ruleTVar"
    // InternalL.g:1913:1: ruleTVar returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= ruleTypeId ) ) ) ;
    public final EObject ruleTVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_id_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1916:28: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= ruleTypeId ) ) ) )
            // InternalL.g:1917:1: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= ruleTypeId ) ) )
            {
            // InternalL.g:1917:1: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= ruleTypeId ) ) )
            // InternalL.g:1917:2: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= 'in' ( (lv_id_2_0= ruleTypeId ) )
            {
            // InternalL.g:1917:2: ( (lv_var_0_0= ruleVariable ) )
            // InternalL.g:1918:1: (lv_var_0_0= ruleVariable )
            {
            // InternalL.g:1918:1: (lv_var_0_0= ruleVariable )
            // InternalL.g:1919:3: lv_var_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarAccess().getVarVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            lv_var_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTVarRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_0_0, 
                      		"net.certware.argument.language.L.Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTVarAccess().getInKeyword_1());
                  
            }
            // InternalL.g:1939:1: ( (lv_id_2_0= ruleTypeId ) )
            // InternalL.g:1940:1: (lv_id_2_0= ruleTypeId )
            {
            // InternalL.g:1940:1: (lv_id_2_0= ruleTypeId )
            // InternalL.g:1941:3: lv_id_2_0= ruleTypeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTVarAccess().getIdTypeIdParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_id_2_0=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTVarRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"net.certware.argument.language.L.TypeId");
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
    // $ANTLR end "ruleTVar"


    // $ANTLR start "entryRuleSetAddition"
    // InternalL.g:1965:1: entryRuleSetAddition returns [EObject current=null] : iv_ruleSetAddition= ruleSetAddition EOF ;
    public final EObject entryRuleSetAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAddition = null;


        try {
            // InternalL.g:1966:2: (iv_ruleSetAddition= ruleSetAddition EOF )
            // InternalL.g:1967:2: iv_ruleSetAddition= ruleSetAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetAddition=ruleSetAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetAddition; 
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
    // $ANTLR end "entryRuleSetAddition"


    // $ANTLR start "ruleSetAddition"
    // InternalL.g:1974:1: ruleSetAddition returns [EObject current=null] : (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) ;
    public final EObject ruleSetAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SetMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:1977:28: ( (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* ) )
            // InternalL.g:1978:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            {
            // InternalL.g:1978:1: (this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )* )
            // InternalL.g:1979:2: this_SetMultiplication_0= ruleSetMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_20);
            this_SetMultiplication_0=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:1990:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalL.g:1990:2: () otherlv_2= '+' ( (lv_right_3_0= ruleSetMultiplication ) )
            	    {
            	    // InternalL.g:1990:2: ()
            	    // InternalL.g:1991:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // InternalL.g:2003:1: ( (lv_right_3_0= ruleSetMultiplication ) )
            	    // InternalL.g:2004:1: (lv_right_3_0= ruleSetMultiplication )
            	    {
            	    // InternalL.g:2004:1: (lv_right_3_0= ruleSetMultiplication )
            	    // InternalL.g:2005:3: lv_right_3_0= ruleSetMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleSetMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSetAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"net.certware.argument.language.L.SetMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleSetAddition"


    // $ANTLR start "entryRuleSetMultiplication"
    // InternalL.g:2029:1: entryRuleSetMultiplication returns [EObject current=null] : iv_ruleSetMultiplication= ruleSetMultiplication EOF ;
    public final EObject entryRuleSetMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMultiplication = null;


        try {
            // InternalL.g:2030:2: (iv_ruleSetMultiplication= ruleSetMultiplication EOF )
            // InternalL.g:2031:2: iv_ruleSetMultiplication= ruleSetMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetMultiplication=ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetMultiplication; 
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
    // $ANTLR end "entryRuleSetMultiplication"


    // $ANTLR start "ruleSetMultiplication"
    // InternalL.g:2038:1: ruleSetMultiplication returns [EObject current=null] : (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) ;
    public final EObject ruleSetMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SetPrimary_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2041:28: ( (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* ) )
            // InternalL.g:2042:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            {
            // InternalL.g:2042:1: (this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )* )
            // InternalL.g:2043:2: this_SetPrimary_0= ruleSetPrimary ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_21);
            this_SetPrimary_0=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:2054:1: ( () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16||LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalL.g:2054:2: () (otherlv_2= '*' | otherlv_3= '\\\\' ) ( (lv_right_4_0= ruleSetPrimary ) )
            	    {
            	    // InternalL.g:2054:2: ()
            	    // InternalL.g:2055:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:2063:2: (otherlv_2= '*' | otherlv_3= '\\\\' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==16) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==32) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalL.g:2063:4: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:2068:7: otherlv_3= '\\\\'
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:2072:2: ( (lv_right_4_0= ruleSetPrimary ) )
            	    // InternalL.g:2073:1: (lv_right_4_0= ruleSetPrimary )
            	    {
            	    // InternalL.g:2073:1: (lv_right_4_0= ruleSetPrimary )
            	    // InternalL.g:2074:3: lv_right_4_0= ruleSetPrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_4_0=ruleSetPrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSetMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"net.certware.argument.language.L.SetPrimary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleSetMultiplication"


    // $ANTLR start "entryRuleSetPrimary"
    // InternalL.g:2098:1: entryRuleSetPrimary returns [EObject current=null] : iv_ruleSetPrimary= ruleSetPrimary EOF ;
    public final EObject entryRuleSetPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPrimary = null;


        try {
            // InternalL.g:2099:2: (iv_ruleSetPrimary= ruleSetPrimary EOF )
            // InternalL.g:2100:2: iv_ruleSetPrimary= ruleSetPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetPrimary=ruleSetPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetPrimary; 
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
    // $ANTLR end "entryRuleSetPrimary"


    // $ANTLR start "ruleSetPrimary"
    // InternalL.g:2107:1: ruleSetPrimary returns [EObject current=null] : (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) ;
    public final EObject ruleSetPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SetLiteral_0 = null;

        EObject this_SetAddition_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2110:28: ( (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) ) )
            // InternalL.g:2111:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            {
            // InternalL.g:2111:1: (this_SetLiteral_0= ruleSetLiteral | (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_UID && LA25_0<=RULE_NUMERIC_CONSTANT)||LA25_0==28) ) {
                alt25=1;
            }
            else if ( (LA25_0==19) ) {
                int LA25_5 = input.LA(2);

                if ( (synpred30_InternalL()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalL.g:2112:2: this_SetLiteral_0= ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SetLiteral_0=ruleSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2124:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    {
                    // InternalL.g:2124:6: (otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')' )
                    // InternalL.g:2124:8: otherlv_1= '(' this_SetAddition_2= ruleSetAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_8);
                    this_SetAddition_2=ruleSetAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetAddition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleSetPrimary"


    // $ANTLR start "entryRuleSetLiteral"
    // InternalL.g:2152:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // InternalL.g:2153:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // InternalL.g:2154:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteral; 
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
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // InternalL.g:2161:1: ruleSetLiteral returns [EObject current=null] : (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token this_LID_3=null;
        EObject this_Set_0 = null;

        EObject this_Range_1 = null;

        EObject this_SetConstruct_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2164:28: ( (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID ) )
            // InternalL.g:2165:1: (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID )
            {
            // InternalL.g:2165:1: (this_Set_0= ruleSet | this_Range_1= ruleRange | this_SetConstruct_2= ruleSetConstruct | this_LID_3= RULE_LID )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA26_1 = input.LA(2);

                if ( (synpred31_InternalL()) ) {
                    alt26=1;
                }
                else if ( (synpred32_InternalL()) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LID:
                {
                int LA26_2 = input.LA(2);

                if ( (synpred33_InternalL()) ) {
                    alt26=3;
                }
                else if ( (true) ) {
                    alt26=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UID:
            case RULE_NUMERIC_CONSTANT:
            case 19:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalL.g:2166:2: this_Set_0= ruleSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Set_0=ruleSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Set_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2179:2: this_Range_1= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getRangeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Range_1=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Range_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalL.g:2192:2: this_SetConstruct_2= ruleSetConstruct
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetLiteralAccess().getSetConstructParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SetConstruct_2=ruleSetConstruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetConstruct_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalL.g:2204:6: this_LID_3= RULE_LID
                    {
                    this_LID_3=(Token)match(input,RULE_LID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LID_3, grammarAccess.getSetLiteralAccess().getLIDTerminalRuleCall_3()); 
                          
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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalL.g:2216:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalL.g:2217:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalL.g:2218:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalL.g:2225:1: ruleAtom returns [EObject current=null] : (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateAtom_0 = null;

        EObject this_BuiltInAtom_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2228:28: ( (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) )
            // InternalL.g:2229:1: (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            {
            // InternalL.g:2229:1: (this_PredicateAtom_0= rulePredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_LID) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred34_InternalL()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==RULE_UID||LA27_0==RULE_NUMERIC_CONSTANT||LA27_0==19) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalL.g:2230:2: this_PredicateAtom_0= rulePredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getPredicateAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_PredicateAtom_0=rulePredicateAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PredicateAtom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2243:2: this_BuiltInAtom_1= ruleBuiltInAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BuiltInAtom_1=ruleBuiltInAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltInAtom_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRulePredicateAtom"
    // InternalL.g:2262:1: entryRulePredicateAtom returns [EObject current=null] : iv_rulePredicateAtom= rulePredicateAtom EOF ;
    public final EObject entryRulePredicateAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtom = null;


        try {
            // InternalL.g:2263:2: (iv_rulePredicateAtom= rulePredicateAtom EOF )
            // InternalL.g:2264:2: iv_rulePredicateAtom= rulePredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateAtom=rulePredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateAtom; 
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
    // $ANTLR end "entryRulePredicateAtom"


    // $ANTLR start "rulePredicateAtom"
    // InternalL.g:2271:1: rulePredicateAtom returns [EObject current=null] : ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePredicateAtom() throws RecognitionException {
        EObject current = null;

        Token lv_fid_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2274:28: ( ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? ) )
            // InternalL.g:2275:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? )
            {
            // InternalL.g:2275:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )? )
            // InternalL.g:2275:2: ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )?
            {
            // InternalL.g:2275:2: ( (lv_fid_0_0= RULE_LID ) )
            // InternalL.g:2276:1: (lv_fid_0_0= RULE_LID )
            {
            // InternalL.g:2276:1: (lv_fid_0_0= RULE_LID )
            // InternalL.g:2277:3: lv_fid_0_0= RULE_LID
            {
            lv_fid_0_0=(Token)match(input,RULE_LID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fid_0_0, grammarAccess.getPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPredicateAtomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fid",
                      		lv_fid_0_0, 
                      		"net.certware.argument.language.L.LID");
              	    
            }

            }


            }

            // InternalL.g:2293:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalL.g:2293:4: otherlv_1= '(' ( (lv_terms_2_0= ruleTerms ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalL.g:2297:1: ( (lv_terms_2_0= ruleTerms ) )
                    // InternalL.g:2298:1: (lv_terms_2_0= ruleTerms )
                    {
                    // InternalL.g:2298:1: (lv_terms_2_0= ruleTerms )
                    // InternalL.g:2299:3: lv_terms_2_0= ruleTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredicateAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
                    lv_terms_2_0=ruleTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPredicateAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_2_0, 
                              		"net.certware.argument.language.L.Terms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "rulePredicateAtom"


    // $ANTLR start "entryRuleBasicPredicateAtom"
    // InternalL.g:2327:1: entryRuleBasicPredicateAtom returns [EObject current=null] : iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF ;
    public final EObject entryRuleBasicPredicateAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicPredicateAtom = null;


        try {
            // InternalL.g:2328:2: (iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF )
            // InternalL.g:2329:2: iv_ruleBasicPredicateAtom= ruleBasicPredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicPredicateAtom=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicPredicateAtom; 
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
    // $ANTLR end "entryRuleBasicPredicateAtom"


    // $ANTLR start "ruleBasicPredicateAtom"
    // InternalL.g:2336:1: ruleBasicPredicateAtom returns [EObject current=null] : ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleBasicPredicateAtom() throws RecognitionException {
        EObject current = null;

        Token lv_fid_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2339:28: ( ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? ) )
            // InternalL.g:2340:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            {
            // InternalL.g:2340:1: ( ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )? )
            // InternalL.g:2340:2: ( (lv_fid_0_0= RULE_LID ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            {
            // InternalL.g:2340:2: ( (lv_fid_0_0= RULE_LID ) )
            // InternalL.g:2341:1: (lv_fid_0_0= RULE_LID )
            {
            // InternalL.g:2341:1: (lv_fid_0_0= RULE_LID )
            // InternalL.g:2342:3: lv_fid_0_0= RULE_LID
            {
            lv_fid_0_0=(Token)match(input,RULE_LID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fid_0_0, grammarAccess.getBasicPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBasicPredicateAtomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fid",
                      		lv_fid_0_0, 
                      		"net.certware.argument.language.L.LID");
              	    
            }

            }


            }

            // InternalL.g:2358:2: (otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalL.g:2358:4: otherlv_1= '(' ( (lv_terms_2_0= ruleBasicTerms ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBasicPredicateAtomAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalL.g:2362:1: ( (lv_terms_2_0= ruleBasicTerms ) )
                    // InternalL.g:2363:1: (lv_terms_2_0= ruleBasicTerms )
                    {
                    // InternalL.g:2363:1: (lv_terms_2_0= ruleBasicTerms )
                    // InternalL.g:2364:3: lv_terms_2_0= ruleBasicTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
                    lv_terms_2_0=ruleBasicTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicPredicateAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"terms",
                              		lv_terms_2_0, 
                              		"net.certware.argument.language.L.BasicTerms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicPredicateAtomAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleBasicPredicateAtom"


    // $ANTLR start "entryRuleBuiltInAtom"
    // InternalL.g:2392:1: entryRuleBuiltInAtom returns [EObject current=null] : iv_ruleBuiltInAtom= ruleBuiltInAtom EOF ;
    public final EObject entryRuleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInAtom = null;


        try {
            // InternalL.g:2393:2: (iv_ruleBuiltInAtom= ruleBuiltInAtom EOF )
            // InternalL.g:2394:2: iv_ruleBuiltInAtom= ruleBuiltInAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuiltInAtom=ruleBuiltInAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInAtom; 
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
    // $ANTLR end "entryRuleBuiltInAtom"


    // $ANTLR start "ruleBuiltInAtom"
    // InternalL.g:2401:1: ruleBuiltInAtom returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) ;
    public final EObject ruleBuiltInAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2404:28: ( ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) ) )
            // InternalL.g:2405:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            {
            // InternalL.g:2405:1: ( ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) ) )
            // InternalL.g:2405:2: ( (lv_lhs_0_0= ruleBasicTerm ) ) ( (lv_op_1_0= ruleAtomOp ) ) ( (lv_rhs_2_0= ruleBasicTerm ) )
            {
            // InternalL.g:2405:2: ( (lv_lhs_0_0= ruleBasicTerm ) )
            // InternalL.g:2406:1: (lv_lhs_0_0= ruleBasicTerm )
            {
            // InternalL.g:2406:1: (lv_lhs_0_0= ruleBasicTerm )
            // InternalL.g:2407:3: lv_lhs_0_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_lhs_0_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"net.certware.argument.language.L.BasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:2423:2: ( (lv_op_1_0= ruleAtomOp ) )
            // InternalL.g:2424:1: (lv_op_1_0= ruleAtomOp )
            {
            // InternalL.g:2424:1: (lv_op_1_0= ruleAtomOp )
            // InternalL.g:2425:3: lv_op_1_0= ruleAtomOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_op_1_0=ruleAtomOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"net.certware.argument.language.L.AtomOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:2441:2: ( (lv_rhs_2_0= ruleBasicTerm ) )
            // InternalL.g:2442:1: (lv_rhs_2_0= ruleBasicTerm )
            {
            // InternalL.g:2442:1: (lv_rhs_2_0= ruleBasicTerm )
            // InternalL.g:2443:3: lv_rhs_2_0= ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuiltInAtomRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"net.certware.argument.language.L.BasicTerm");
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
    // $ANTLR end "ruleBuiltInAtom"


    // $ANTLR start "entryRuleBasicAtom"
    // InternalL.g:2467:1: entryRuleBasicAtom returns [EObject current=null] : iv_ruleBasicAtom= ruleBasicAtom EOF ;
    public final EObject entryRuleBasicAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicAtom = null;


        try {
            // InternalL.g:2468:2: (iv_ruleBasicAtom= ruleBasicAtom EOF )
            // InternalL.g:2469:2: iv_ruleBasicAtom= ruleBasicAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicAtom=ruleBasicAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicAtom; 
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
    // $ANTLR end "entryRuleBasicAtom"


    // $ANTLR start "ruleBasicAtom"
    // InternalL.g:2476:1: ruleBasicAtom returns [EObject current=null] : (this_BasicPredicateAtom_0= ruleBasicPredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) ;
    public final EObject ruleBasicAtom() throws RecognitionException {
        EObject current = null;

        EObject this_BasicPredicateAtom_0 = null;

        EObject this_BuiltInAtom_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2479:28: ( (this_BasicPredicateAtom_0= ruleBasicPredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom ) )
            // InternalL.g:2480:1: (this_BasicPredicateAtom_0= ruleBasicPredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            {
            // InternalL.g:2480:1: (this_BasicPredicateAtom_0= ruleBasicPredicateAtom | this_BuiltInAtom_1= ruleBuiltInAtom )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LID) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred37_InternalL()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==RULE_UID||LA30_0==RULE_NUMERIC_CONSTANT||LA30_0==19) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalL.g:2481:2: this_BasicPredicateAtom_0= ruleBasicPredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicAtomAccess().getBasicPredicateAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicPredicateAtom_0=ruleBasicPredicateAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicPredicateAtom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2494:2: this_BuiltInAtom_1= ruleBuiltInAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BuiltInAtom_1=ruleBuiltInAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltInAtom_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleBasicAtom"


    // $ANTLR start "entryRuleAtomOp"
    // InternalL.g:2513:1: entryRuleAtomOp returns [String current=null] : iv_ruleAtomOp= ruleAtomOp EOF ;
    public final String entryRuleAtomOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomOp = null;


        try {
            // InternalL.g:2514:2: (iv_ruleAtomOp= ruleAtomOp EOF )
            // InternalL.g:2515:2: iv_ruleAtomOp= ruleAtomOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomOp=ruleAtomOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomOp.getText(); 
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
    // $ANTLR end "entryRuleAtomOp"


    // $ANTLR start "ruleAtomOp"
    // InternalL.g:2522:1: ruleAtomOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleAtomOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalL.g:2525:28: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' ) )
            // InternalL.g:2526:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            {
            // InternalL.g:2526:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '!=' )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt31=1;
                }
                break;
            case 34:
                {
                alt31=2;
                }
                break;
            case 35:
                {
                alt31=3;
                }
                break;
            case 36:
                {
                alt31=4;
                }
                break;
            case 25:
                {
                alt31=5;
                }
                break;
            case 37:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalL.g:2527:2: kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2534:2: kw= '<'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalL.g:2541:2: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalL.g:2548:2: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalL.g:2555:2: kw= '='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalL.g:2562:2: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                          
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
    // $ANTLR end "ruleAtomOp"


    // $ANTLR start "entryRuleSentence"
    // InternalL.g:2575:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalL.g:2576:2: (iv_ruleSentence= ruleSentence EOF )
            // InternalL.g:2577:2: iv_ruleSentence= ruleSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentence; 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalL.g:2584:1: ruleSentence returns [EObject current=null] : this_OrSentence_0= ruleOrSentence ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_OrSentence_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2587:28: (this_OrSentence_0= ruleOrSentence )
            // InternalL.g:2589:2: this_OrSentence_0= ruleOrSentence
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_OrSentence_0=ruleOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrSentence_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleOrSentence"
    // InternalL.g:2608:1: entryRuleOrSentence returns [EObject current=null] : iv_ruleOrSentence= ruleOrSentence EOF ;
    public final EObject entryRuleOrSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrSentence = null;


        try {
            // InternalL.g:2609:2: (iv_ruleOrSentence= ruleOrSentence EOF )
            // InternalL.g:2610:2: iv_ruleOrSentence= ruleOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrSentence=ruleOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrSentence; 
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
    // $ANTLR end "entryRuleOrSentence"


    // $ANTLR start "ruleOrSentence"
    // InternalL.g:2617:1: ruleOrSentence returns [EObject current=null] : (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) ;
    public final EObject ruleOrSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2620:28: ( (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* ) )
            // InternalL.g:2621:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            {
            // InternalL.g:2621:1: (this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )* )
            // InternalL.g:2622:2: this_AndSentence_0= ruleAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_24);
            this_AndSentence_0=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:2633:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalL.g:2633:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndSentence ) )
            	    {
            	    // InternalL.g:2633:2: ()
            	    // InternalL.g:2634:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrSentenceAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // InternalL.g:2646:1: ( (lv_right_3_0= ruleAndSentence ) )
            	    // InternalL.g:2647:1: (lv_right_3_0= ruleAndSentence )
            	    {
            	    // InternalL.g:2647:1: (lv_right_3_0= ruleAndSentence )
            	    // InternalL.g:2648:3: lv_right_3_0= ruleAndSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleAndSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"net.certware.argument.language.L.AndSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleOrSentence"


    // $ANTLR start "entryRuleAndSentence"
    // InternalL.g:2672:1: entryRuleAndSentence returns [EObject current=null] : iv_ruleAndSentence= ruleAndSentence EOF ;
    public final EObject entryRuleAndSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndSentence = null;


        try {
            // InternalL.g:2673:2: (iv_ruleAndSentence= ruleAndSentence EOF )
            // InternalL.g:2674:2: iv_ruleAndSentence= ruleAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndSentence=ruleAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndSentence; 
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
    // $ANTLR end "entryRuleAndSentence"


    // $ANTLR start "ruleAndSentence"
    // InternalL.g:2681:1: ruleAndSentence returns [EObject current=null] : (this_PrimarySentence_0= rulePrimarySentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )* ) ;
    public final EObject ruleAndSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_PrimarySentence_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2684:28: ( (this_PrimarySentence_0= rulePrimarySentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )* ) )
            // InternalL.g:2685:1: (this_PrimarySentence_0= rulePrimarySentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )* )
            {
            // InternalL.g:2685:1: (this_PrimarySentence_0= rulePrimarySentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )* )
            // InternalL.g:2686:2: this_PrimarySentence_0= rulePrimarySentence ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_25);
            this_PrimarySentence_0=rulePrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimarySentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:2697:1: ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21||LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalL.g:2697:2: () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_right_4_0= rulePrimarySentence ) )
            	    {
            	    // InternalL.g:2697:2: ()
            	    // InternalL.g:2698:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalL.g:2706:2: (otherlv_2= 'and' | otherlv_3= ',' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==39) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==21) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalL.g:2706:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndSentenceAccess().getAndKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalL.g:2711:7: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndSentenceAccess().getCommaKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalL.g:2715:2: ( (lv_right_4_0= rulePrimarySentence ) )
            	    // InternalL.g:2716:1: (lv_right_4_0= rulePrimarySentence )
            	    {
            	    // InternalL.g:2716:1: (lv_right_4_0= rulePrimarySentence )
            	    // InternalL.g:2717:3: lv_right_4_0= rulePrimarySentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndSentenceAccess().getRightPrimarySentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_4_0=rulePrimarySentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"net.certware.argument.language.L.PrimarySentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleAndSentence"


    // $ANTLR start "entryRulePrimarySentence"
    // InternalL.g:2741:1: entryRulePrimarySentence returns [EObject current=null] : iv_rulePrimarySentence= rulePrimarySentence EOF ;
    public final EObject entryRulePrimarySentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimarySentence = null;


        try {
            // InternalL.g:2742:2: (iv_rulePrimarySentence= rulePrimarySentence EOF )
            // InternalL.g:2743:2: iv_rulePrimarySentence= rulePrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimarySentence=rulePrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimarySentence; 
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
    // $ANTLR end "entryRulePrimarySentence"


    // $ANTLR start "rulePrimarySentence"
    // InternalL.g:2750:1: rulePrimarySentence returns [EObject current=null] : (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) ;
    public final EObject rulePrimarySentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SentenceLiteral_0 = null;

        EObject this_OrSentence_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2753:28: ( (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) ) )
            // InternalL.g:2754:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            {
            // InternalL.g:2754:1: (this_SentenceLiteral_0= ruleSentenceLiteral | (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_UID && LA35_0<=RULE_NUMERIC_CONSTANT)||LA35_0==40) ) {
                alt35=1;
            }
            else if ( (LA35_0==19) ) {
                int LA35_4 = input.LA(2);

                if ( (synpred46_InternalL()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalL.g:2755:2: this_SentenceLiteral_0= ruleSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SentenceLiteral_0=ruleSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SentenceLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2767:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    {
                    // InternalL.g:2767:6: (otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')' )
                    // InternalL.g:2767:8: otherlv_1= '(' this_OrSentence_2= ruleOrSentence otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_8);
                    this_OrSentence_2=ruleOrSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrSentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "rulePrimarySentence"


    // $ANTLR start "entryRuleSentenceLiteral"
    // InternalL.g:2795:1: entryRuleSentenceLiteral returns [EObject current=null] : iv_ruleSentenceLiteral= ruleSentenceLiteral EOF ;
    public final EObject entryRuleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceLiteral = null;


        try {
            // InternalL.g:2796:2: (iv_ruleSentenceLiteral= ruleSentenceLiteral EOF )
            // InternalL.g:2797:2: iv_ruleSentenceLiteral= ruleSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSentenceLiteral=ruleSentenceLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSentenceLiteral; 
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
    // $ANTLR end "entryRuleSentenceLiteral"


    // $ANTLR start "ruleSentenceLiteral"
    // InternalL.g:2804:1: ruleSentenceLiteral returns [EObject current=null] : (this_Atom_0= ruleAtom | (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom ) ) ;
    public final EObject ruleSentenceLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Atom_0 = null;

        EObject this_BasicAtom_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2807:28: ( (this_Atom_0= ruleAtom | (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom ) ) )
            // InternalL.g:2808:1: (this_Atom_0= ruleAtom | (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom ) )
            {
            // InternalL.g:2808:1: (this_Atom_0= ruleAtom | (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_UID && LA36_0<=RULE_NUMERIC_CONSTANT)||LA36_0==19) ) {
                alt36=1;
            }
            else if ( (LA36_0==40) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalL.g:2809:2: this_Atom_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSentenceLiteralAccess().getAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:2821:6: (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom )
                    {
                    // InternalL.g:2821:6: (otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom )
                    // InternalL.g:2821:8: otherlv_1= 'not' this_BasicAtom_2= ruleBasicAtom
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSentenceLiteralAccess().getNotKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSentenceLiteralAccess().getBasicAtomParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicAtom_2=ruleBasicAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicAtom_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleSentenceLiteral"


    // $ANTLR start "entryRulepSentence"
    // InternalL.g:2845:1: entryRulepSentence returns [EObject current=null] : iv_rulepSentence= rulepSentence EOF ;
    public final EObject entryRulepSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepSentence = null;


        try {
            // InternalL.g:2846:2: (iv_rulepSentence= rulepSentence EOF )
            // InternalL.g:2847:2: iv_rulepSentence= rulepSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepSentence=rulepSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepSentence; 
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
    // $ANTLR end "entryRulepSentence"


    // $ANTLR start "rulepSentence"
    // InternalL.g:2854:1: rulepSentence returns [EObject current=null] : this_pOrSentence_0= rulepOrSentence ;
    public final EObject rulepSentence() throws RecognitionException {
        EObject current = null;

        EObject this_pOrSentence_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2857:28: (this_pOrSentence_0= rulepOrSentence )
            // InternalL.g:2859:2: this_pOrSentence_0= rulepOrSentence
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPSentenceAccess().getPOrSentenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_pOrSentence_0=rulepOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pOrSentence_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulepSentence"


    // $ANTLR start "entryRulepOrSentence"
    // InternalL.g:2878:1: entryRulepOrSentence returns [EObject current=null] : iv_rulepOrSentence= rulepOrSentence EOF ;
    public final EObject entryRulepOrSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepOrSentence = null;


        try {
            // InternalL.g:2879:2: (iv_rulepOrSentence= rulepOrSentence EOF )
            // InternalL.g:2880:2: iv_rulepOrSentence= rulepOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPOrSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepOrSentence=rulepOrSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepOrSentence; 
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
    // $ANTLR end "entryRulepOrSentence"


    // $ANTLR start "rulepOrSentence"
    // InternalL.g:2887:1: rulepOrSentence returns [EObject current=null] : (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* ) ;
    public final EObject rulepOrSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_pAndSentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2890:28: ( (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* ) )
            // InternalL.g:2891:1: (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* )
            {
            // InternalL.g:2891:1: (this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )* )
            // InternalL.g:2892:2: this_pAndSentence_0= rulepAndSentence ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPOrSentenceAccess().getPAndSentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_24);
            this_pAndSentence_0=rulepAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pAndSentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:2903:1: ( () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalL.g:2903:2: () otherlv_2= 'or' ( (lv_right_3_0= rulepAndSentence ) )
            	    {
            	    // InternalL.g:2903:2: ()
            	    // InternalL.g:2904:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPOrSentenceAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // InternalL.g:2916:1: ( (lv_right_3_0= rulepAndSentence ) )
            	    // InternalL.g:2917:1: (lv_right_3_0= rulepAndSentence )
            	    {
            	    // InternalL.g:2917:1: (lv_right_3_0= rulepAndSentence )
            	    // InternalL.g:2918:3: lv_right_3_0= rulepAndSentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOrSentenceAccess().getRightPAndSentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=rulepAndSentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOrSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"net.certware.argument.language.L.pAndSentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "rulepOrSentence"


    // $ANTLR start "entryRulepAndSentence"
    // InternalL.g:2942:1: entryRulepAndSentence returns [EObject current=null] : iv_rulepAndSentence= rulepAndSentence EOF ;
    public final EObject entryRulepAndSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepAndSentence = null;


        try {
            // InternalL.g:2943:2: (iv_rulepAndSentence= rulepAndSentence EOF )
            // InternalL.g:2944:2: iv_rulepAndSentence= rulepAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPAndSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepAndSentence=rulepAndSentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepAndSentence; 
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
    // $ANTLR end "entryRulepAndSentence"


    // $ANTLR start "rulepAndSentence"
    // InternalL.g:2951:1: rulepAndSentence returns [EObject current=null] : (this_pPrimarySentence_0= rulepPrimarySentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )* ) ;
    public final EObject rulepAndSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_pPrimarySentence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:2954:28: ( (this_pPrimarySentence_0= rulepPrimarySentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )* ) )
            // InternalL.g:2955:1: (this_pPrimarySentence_0= rulepPrimarySentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )* )
            {
            // InternalL.g:2955:1: (this_pPrimarySentence_0= rulepPrimarySentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )* )
            // InternalL.g:2956:2: this_pPrimarySentence_0= rulepPrimarySentence ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPAndSentenceAccess().getPPrimarySentenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_27);
            this_pPrimarySentence_0=rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_pPrimarySentence_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalL.g:2967:1: ( () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalL.g:2967:2: () otherlv_2= 'and' ( (lv_right_3_0= rulepPrimarySentence ) )
            	    {
            	    // InternalL.g:2967:2: ()
            	    // InternalL.g:2968:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPAndSentenceAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // InternalL.g:2980:1: ( (lv_right_3_0= rulepPrimarySentence ) )
            	    // InternalL.g:2981:1: (lv_right_3_0= rulepPrimarySentence )
            	    {
            	    // InternalL.g:2981:1: (lv_right_3_0= rulepPrimarySentence )
            	    // InternalL.g:2982:3: lv_right_3_0= rulepPrimarySentence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPAndSentenceAccess().getRightPPrimarySentenceParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=rulepPrimarySentence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPAndSentenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"net.certware.argument.language.L.pPrimarySentence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "rulepAndSentence"


    // $ANTLR start "entryRulepPrimarySentence"
    // InternalL.g:3006:1: entryRulepPrimarySentence returns [EObject current=null] : iv_rulepPrimarySentence= rulepPrimarySentence EOF ;
    public final EObject entryRulepPrimarySentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepPrimarySentence = null;


        try {
            // InternalL.g:3007:2: (iv_rulepPrimarySentence= rulepPrimarySentence EOF )
            // InternalL.g:3008:2: iv_rulepPrimarySentence= rulepPrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepPrimarySentence=rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepPrimarySentence; 
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
    // $ANTLR end "entryRulepPrimarySentence"


    // $ANTLR start "rulepPrimarySentence"
    // InternalL.g:3015:1: rulepPrimarySentence returns [EObject current=null] : (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' ) ) ;
    public final EObject rulepPrimarySentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_pSentenceLiteral_0 = null;

        EObject this_pOrSentence_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3018:28: ( (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' ) ) )
            // InternalL.g:3019:1: (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' ) )
            {
            // InternalL.g:3019:1: (this_pSentenceLiteral_0= rulepSentenceLiteral | (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_LID||LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==19) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalL.g:3020:2: this_pSentenceLiteral_0= rulepSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPPrimarySentenceAccess().getPSentenceLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_pSentenceLiteral_0=rulepSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pSentenceLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:3032:6: (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' )
                    {
                    // InternalL.g:3032:6: (otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')' )
                    // InternalL.g:3032:8: otherlv_1= '(' this_pOrSentence_2= rulepOrSentence otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPPrimarySentenceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPPrimarySentenceAccess().getPOrSentenceParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_8);
                    this_pOrSentence_2=rulepOrSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pOrSentence_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPPrimarySentenceAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "rulepPrimarySentence"


    // $ANTLR start "entryRulepSentenceLiteral"
    // InternalL.g:3060:1: entryRulepSentenceLiteral returns [EObject current=null] : iv_rulepSentenceLiteral= rulepSentenceLiteral EOF ;
    public final EObject entryRulepSentenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepSentenceLiteral = null;


        try {
            // InternalL.g:3061:2: (iv_rulepSentenceLiteral= rulepSentenceLiteral EOF )
            // InternalL.g:3062:2: iv_rulepSentenceLiteral= rulepSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepSentenceLiteral=rulepSentenceLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepSentenceLiteral; 
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
    // $ANTLR end "entryRulepSentenceLiteral"


    // $ANTLR start "rulepSentenceLiteral"
    // InternalL.g:3069:1: rulepSentenceLiteral returns [EObject current=null] : (this_PredicateAtom_0= rulePredicateAtom | (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom ) ) ;
    public final EObject rulepSentenceLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PredicateAtom_0 = null;

        EObject this_BasicPredicateAtom_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3072:28: ( (this_PredicateAtom_0= rulePredicateAtom | (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom ) ) )
            // InternalL.g:3073:1: (this_PredicateAtom_0= rulePredicateAtom | (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom ) )
            {
            // InternalL.g:3073:1: (this_PredicateAtom_0= rulePredicateAtom | (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LID) ) {
                alt40=1;
            }
            else if ( (LA40_0==40) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalL.g:3074:2: this_PredicateAtom_0= rulePredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPSentenceLiteralAccess().getPredicateAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_PredicateAtom_0=rulePredicateAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PredicateAtom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:3086:6: (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom )
                    {
                    // InternalL.g:3086:6: (otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom )
                    // InternalL.g:3086:8: otherlv_1= 'not' this_BasicPredicateAtom_2= ruleBasicPredicateAtom
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPSentenceLiteralAccess().getNotKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPSentenceLiteralAccess().getBasicPredicateAtomParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicPredicateAtom_2=ruleBasicPredicateAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicPredicateAtom_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "rulepSentenceLiteral"


    // $ANTLR start "entryRuleMaybeLiteral"
    // InternalL.g:3110:1: entryRuleMaybeLiteral returns [EObject current=null] : iv_ruleMaybeLiteral= ruleMaybeLiteral EOF ;
    public final EObject entryRuleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaybeLiteral = null;


        try {
            // InternalL.g:3111:2: (iv_ruleMaybeLiteral= ruleMaybeLiteral EOF )
            // InternalL.g:3112:2: iv_ruleMaybeLiteral= ruleMaybeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaybeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMaybeLiteral=ruleMaybeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaybeLiteral; 
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
    // $ANTLR end "entryRuleMaybeLiteral"


    // $ANTLR start "ruleMaybeLiteral"
    // InternalL.g:3119:1: ruleMaybeLiteral returns [EObject current=null] : (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom ) ;
    public final EObject ruleMaybeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BasicPredicateAtom_1 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3122:28: ( (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom ) )
            // InternalL.g:3123:1: (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom )
            {
            // InternalL.g:3123:1: (otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom )
            // InternalL.g:3123:3: otherlv_0= 'maybe' this_BasicPredicateAtom_1= ruleBasicPredicateAtom
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMaybeLiteralAccess().getBasicPredicateAtomParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_BasicPredicateAtom_1=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicPredicateAtom_1; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleMaybeLiteral"


    // $ANTLR start "entryRuleCardinalityConstraint"
    // InternalL.g:3147:1: entryRuleCardinalityConstraint returns [EObject current=null] : iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF ;
    public final EObject entryRuleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityConstraint = null;


        try {
            // InternalL.g:3148:2: (iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF )
            // InternalL.g:3149:2: iv_ruleCardinalityConstraint= ruleCardinalityConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityConstraint=ruleCardinalityConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinalityConstraint; 
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
    // $ANTLR end "entryRuleCardinalityConstraint"


    // $ANTLR start "ruleCardinalityConstraint"
    // InternalL.g:3156:1: ruleCardinalityConstraint returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) ) ;
    public final EObject ruleCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_atom_4_0 = null;

        EObject lv_rhs_8_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3159:28: ( ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) ) )
            // InternalL.g:3160:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) )
            {
            // InternalL.g:3160:1: ( ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) ) )
            // InternalL.g:3160:2: ( (lv_lhs_0_0= ruleBound ) ) otherlv_1= '<=' otherlv_2= '|' otherlv_3= '{' ( (lv_atom_4_0= ruleBasicPredicateAtom ) ) otherlv_5= '}' otherlv_6= '|' otherlv_7= '<=' ( (lv_rhs_8_0= ruleBound ) )
            {
            // InternalL.g:3160:2: ( (lv_lhs_0_0= ruleBound ) )
            // InternalL.g:3161:1: (lv_lhs_0_0= ruleBound )
            {
            // InternalL.g:3161:1: (lv_lhs_0_0= ruleBound )
            // InternalL.g:3162:3: lv_lhs_0_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_28);
            lv_lhs_0_0=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"net.certware.argument.language.L.Bound");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalL.g:3190:1: ( (lv_atom_4_0= ruleBasicPredicateAtom ) )
            // InternalL.g:3191:1: (lv_atom_4_0= ruleBasicPredicateAtom )
            {
            // InternalL.g:3191:1: (lv_atom_4_0= ruleBasicPredicateAtom )
            // InternalL.g:3192:3: lv_atom_4_0= ruleBasicPredicateAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getAtomBasicPredicateAtomParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_atom_4_0=ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"atom",
                      		lv_atom_4_0, 
                      		"net.certware.argument.language.L.BasicPredicateAtom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,42,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_7());
                  
            }
            // InternalL.g:3220:1: ( (lv_rhs_8_0= ruleBound ) )
            // InternalL.g:3221:1: (lv_rhs_8_0= ruleBound )
            {
            // InternalL.g:3221:1: (lv_rhs_8_0= ruleBound )
            // InternalL.g:3222:3: lv_rhs_8_0= ruleBound
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_rhs_8_0=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_8_0, 
                      		"net.certware.argument.language.L.Bound");
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
    // $ANTLR end "ruleCardinalityConstraint"


    // $ANTLR start "entryRuleBound"
    // InternalL.g:3246:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // InternalL.g:3247:2: (iv_ruleBound= ruleBound EOF )
            // InternalL.g:3248:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound; 
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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // InternalL.g:3255:1: ruleBound returns [EObject current=null] : ( (lv_av_0_0= ruleArithmeticTerm ) ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        EObject lv_av_0_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3258:28: ( ( (lv_av_0_0= ruleArithmeticTerm ) ) )
            // InternalL.g:3259:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            {
            // InternalL.g:3259:1: ( (lv_av_0_0= ruleArithmeticTerm ) )
            // InternalL.g:3260:1: (lv_av_0_0= ruleArithmeticTerm )
            {
            // InternalL.g:3260:1: (lv_av_0_0= ruleArithmeticTerm )
            // InternalL.g:3261:3: lv_av_0_0= ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_av_0_0=ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBoundRule());
              	        }
                     		set(
                     			current, 
                     			"av",
                      		lv_av_0_0, 
                      		"net.certware.argument.language.L.ArithmeticTerm");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleRule"
    // InternalL.g:3285:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalL.g:3286:2: (iv_ruleRule= ruleRule EOF )
            // InternalL.g:3287:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalL.g:3294:1: ruleRule returns [EObject current=null] : ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_condition_1_0=null;
        Token otherlv_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3297:28: ( ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' ) )
            // InternalL.g:3298:1: ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            {
            // InternalL.g:3298:1: ( ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.' )
            // InternalL.g:3298:2: ( (lv_head_0_0= ruleHead ) ) ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )? otherlv_3= '.'
            {
            // InternalL.g:3298:2: ( (lv_head_0_0= ruleHead ) )
            // InternalL.g:3299:1: (lv_head_0_0= ruleHead )
            {
            // InternalL.g:3299:1: (lv_head_0_0= ruleHead )
            // InternalL.g:3300:3: lv_head_0_0= ruleHead
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
            lv_head_0_0=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"net.certware.argument.language.L.Head");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalL.g:3316:2: ( ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalL.g:3316:3: ( (lv_condition_1_0= 'if' ) ) ( (lv_body_2_0= ruleSentence ) )
                    {
                    // InternalL.g:3316:3: ( (lv_condition_1_0= 'if' ) )
                    // InternalL.g:3317:1: (lv_condition_1_0= 'if' )
                    {
                    // InternalL.g:3317:1: (lv_condition_1_0= 'if' )
                    // InternalL.g:3318:3: lv_condition_1_0= 'if'
                    {
                    lv_condition_1_0=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_condition_1_0, grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRuleRule());
                      	        }
                             		setWithLastConsumed(current, "condition", lv_condition_1_0, "if");
                      	    
                    }

                    }


                    }

                    // InternalL.g:3331:2: ( (lv_body_2_0= ruleSentence ) )
                    // InternalL.g:3332:1: (lv_body_2_0= ruleSentence )
                    {
                    // InternalL.g:3332:1: (lv_body_2_0= ruleSentence )
                    // InternalL.g:3333:3: lv_body_2_0= ruleSentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_body_2_0=ruleSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_2_0, 
                              		"net.certware.argument.language.L.Sentence");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFullStopKeyword_2());
                  
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleHead"
    // InternalL.g:3361:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalL.g:3362:2: (iv_ruleHead= ruleHead EOF )
            // InternalL.g:3363:2: iv_ruleHead= ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalL.g:3370:1: ruleHead returns [EObject current=null] : (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        EObject this_pSentence_0 = null;

        EObject this_MaybeLiteral_1 = null;

        EObject this_CardinalityConstraint_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3373:28: ( (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint ) )
            // InternalL.g:3374:1: (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint )
            {
            // InternalL.g:3374:1: (this_pSentence_0= rulepSentence | this_MaybeLiteral_1= ruleMaybeLiteral | this_CardinalityConstraint_2= ruleCardinalityConstraint )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_LID:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred53_InternalL()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt42=1;
                }
                break;
            case 19:
                {
                int LA42_3 = input.LA(2);

                if ( (synpred53_InternalL()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt42=2;
                }
                break;
            case RULE_UID:
            case RULE_NUMERIC_CONSTANT:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalL.g:3375:2: this_pSentence_0= rulepSentence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getPSentenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_pSentence_0=rulepSentence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_pSentence_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:3388:2: this_MaybeLiteral_1= ruleMaybeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_MaybeLiteral_1=ruleMaybeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaybeLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalL.g:3401:2: this_CardinalityConstraint_2= ruleCardinalityConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_CardinalityConstraint_2=ruleCardinalityConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CardinalityConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleStatement"
    // InternalL.g:3420:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalL.g:3421:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalL.g:3422:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalL.g:3429:1: ruleStatement returns [EObject current=null] : (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;

        EObject this_TypeDeclaration_1 = null;

        EObject this_ConstantDeclaration_2 = null;


         enterRule(); 
            
        try {
            // InternalL.g:3432:28: ( (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration ) )
            // InternalL.g:3433:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            {
            // InternalL.g:3433:1: (this_Rule_0= ruleRule | this_TypeDeclaration_1= ruleTypeDeclaration | this_ConstantDeclaration_2= ruleConstantDeclaration )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_UID:
            case RULE_LID:
            case RULE_NUMERIC_CONSTANT:
            case 19:
            case 40:
            case 41:
                {
                alt43=1;
                }
                break;
            case 27:
                {
                alt43=2;
                }
                break;
            case 24:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalL.g:3434:2: this_Rule_0= ruleRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Rule_0=ruleRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Rule_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalL.g:3447:2: this_TypeDeclaration_1= ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDeclaration_1=ruleTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalL.g:3460:2: this_ConstantDeclaration_2= ruleConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantDeclaration_2=ruleConstantDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleStatement"

    // $ANTLR start synpred2_InternalL
    public final void synpred2_InternalL_fragment() throws RecognitionException {   
        EObject this_TypedVariable_0 = null;


        // InternalL.g:126:2: (this_TypedVariable_0= ruleTypedVariable )
        // InternalL.g:126:2: this_TypedVariable_0= ruleTypedVariable
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_TypedVariable_0=ruleTypedVariable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalL

    // $ANTLR start synpred3_InternalL
    public final void synpred3_InternalL_fragment() throws RecognitionException {   
        EObject this_ArithmeticTerm_1 = null;


        // InternalL.g:139:2: (this_ArithmeticTerm_1= ruleArithmeticTerm )
        // InternalL.g:139:2: this_ArithmeticTerm_1= ruleArithmeticTerm
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_ArithmeticTerm_1=ruleArithmeticTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalL

    // $ANTLR start synpred30_InternalL
    public final void synpred30_InternalL_fragment() throws RecognitionException {   
        EObject this_SetLiteral_0 = null;


        // InternalL.g:2112:2: (this_SetLiteral_0= ruleSetLiteral )
        // InternalL.g:2112:2: this_SetLiteral_0= ruleSetLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_SetLiteral_0=ruleSetLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalL

    // $ANTLR start synpred31_InternalL
    public final void synpred31_InternalL_fragment() throws RecognitionException {   
        EObject this_Set_0 = null;


        // InternalL.g:2166:2: (this_Set_0= ruleSet )
        // InternalL.g:2166:2: this_Set_0= ruleSet
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_Set_0=ruleSet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalL

    // $ANTLR start synpred32_InternalL
    public final void synpred32_InternalL_fragment() throws RecognitionException {   
        EObject this_Range_1 = null;


        // InternalL.g:2179:2: (this_Range_1= ruleRange )
        // InternalL.g:2179:2: this_Range_1= ruleRange
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_Range_1=ruleRange();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalL

    // $ANTLR start synpred33_InternalL
    public final void synpred33_InternalL_fragment() throws RecognitionException {   
        EObject this_SetConstruct_2 = null;


        // InternalL.g:2192:2: (this_SetConstruct_2= ruleSetConstruct )
        // InternalL.g:2192:2: this_SetConstruct_2= ruleSetConstruct
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_SetConstruct_2=ruleSetConstruct();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalL

    // $ANTLR start synpred34_InternalL
    public final void synpred34_InternalL_fragment() throws RecognitionException {   
        EObject this_PredicateAtom_0 = null;


        // InternalL.g:2230:2: (this_PredicateAtom_0= rulePredicateAtom )
        // InternalL.g:2230:2: this_PredicateAtom_0= rulePredicateAtom
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_PredicateAtom_0=rulePredicateAtom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalL

    // $ANTLR start synpred37_InternalL
    public final void synpred37_InternalL_fragment() throws RecognitionException {   
        EObject this_BasicPredicateAtom_0 = null;


        // InternalL.g:2481:2: (this_BasicPredicateAtom_0= ruleBasicPredicateAtom )
        // InternalL.g:2481:2: this_BasicPredicateAtom_0= ruleBasicPredicateAtom
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_BasicPredicateAtom_0=ruleBasicPredicateAtom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalL

    // $ANTLR start synpred46_InternalL
    public final void synpred46_InternalL_fragment() throws RecognitionException {   
        EObject this_SentenceLiteral_0 = null;


        // InternalL.g:2755:2: (this_SentenceLiteral_0= ruleSentenceLiteral )
        // InternalL.g:2755:2: this_SentenceLiteral_0= ruleSentenceLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_SentenceLiteral_0=ruleSentenceLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalL

    // $ANTLR start synpred53_InternalL
    public final void synpred53_InternalL_fragment() throws RecognitionException {   
        EObject this_pSentence_0 = null;


        // InternalL.g:3375:2: (this_pSentence_0= rulepSentence )
        // InternalL.g:3375:2: this_pSentence_0= rulepSentence
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_pSentence_0=rulepSentence();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalL

    // Delegated rules

    public final boolean synpred31_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000030009080072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000030000080070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030000C80070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030010080070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003E02000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000200002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000080020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080004000000L});

}