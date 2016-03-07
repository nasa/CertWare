package net.certware.argument.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.certware.argument.language.services.LGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LID", "RULE_UID", "RULE_NUMERIC_CONSTANT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "'\\\\'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'and'", "','", "'('", "')'", "'every'", "'some'", "'const'", "'.'", "'type'", "'}'", "'{'", "'where'", "'in'", "'or'", "'not'", "'maybe'", "'|'", "'if'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_NUMERIC_CONSTANT=6;
    public static final int RULE_LID=4;
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
    public static final int RULE_UID=5;
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


     
     	private LGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // InternalL.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalL.g:62:1: ( ruleProgram EOF )
            // InternalL.g:63:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalL.g:70:1: ruleProgram : ( ( rule__Program__StatementsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:74:2: ( ( ( rule__Program__StatementsAssignment )* ) )
            // InternalL.g:75:1: ( ( rule__Program__StatementsAssignment )* )
            {
            // InternalL.g:75:1: ( ( rule__Program__StatementsAssignment )* )
            // InternalL.g:76:1: ( rule__Program__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            }
            // InternalL.g:77:1: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_LID && LA1_0<=RULE_NUMERIC_CONSTANT)||LA1_0==28||LA1_0==32||LA1_0==34||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalL.g:77:2: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBasicTerm"
    // InternalL.g:89:1: entryRuleBasicTerm : ruleBasicTerm EOF ;
    public final void entryRuleBasicTerm() throws RecognitionException {
        try {
            // InternalL.g:90:1: ( ruleBasicTerm EOF )
            // InternalL.g:91:1: ruleBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicTerm"


    // $ANTLR start "ruleBasicTerm"
    // InternalL.g:98:1: ruleBasicTerm : ( ( rule__BasicTerm__Alternatives ) ) ;
    public final void ruleBasicTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:102:2: ( ( ( rule__BasicTerm__Alternatives ) ) )
            // InternalL.g:103:1: ( ( rule__BasicTerm__Alternatives ) )
            {
            // InternalL.g:103:1: ( ( rule__BasicTerm__Alternatives ) )
            // InternalL.g:104:1: ( rule__BasicTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermAccess().getAlternatives()); 
            }
            // InternalL.g:105:1: ( rule__BasicTerm__Alternatives )
            // InternalL.g:105:2: rule__BasicTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicTerm"


    // $ANTLR start "entryRuleVariable"
    // InternalL.g:117:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalL.g:118:1: ( ruleVariable EOF )
            // InternalL.g:119:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalL.g:126:1: ruleVariable : ( ( rule__Variable__IdentifierAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:130:2: ( ( ( rule__Variable__IdentifierAssignment ) ) )
            // InternalL.g:131:1: ( ( rule__Variable__IdentifierAssignment ) )
            {
            // InternalL.g:131:1: ( ( rule__Variable__IdentifierAssignment ) )
            // InternalL.g:132:1: ( rule__Variable__IdentifierAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getIdentifierAssignment()); 
            }
            // InternalL.g:133:1: ( rule__Variable__IdentifierAssignment )
            // InternalL.g:133:2: rule__Variable__IdentifierAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__IdentifierAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getIdentifierAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalL.g:145:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalL.g:146:1: ( ruleTypedVariable EOF )
            // InternalL.g:147:1: ruleTypedVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // InternalL.g:154:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:158:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // InternalL.g:159:1: ( ( rule__TypedVariable__Group__0 ) )
            {
            // InternalL.g:159:1: ( ( rule__TypedVariable__Group__0 ) )
            // InternalL.g:160:1: ( rule__TypedVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getGroup()); 
            }
            // InternalL.g:161:1: ( rule__TypedVariable__Group__0 )
            // InternalL.g:161:2: rule__TypedVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleArithmeticTerm"
    // InternalL.g:173:1: entryRuleArithmeticTerm : ruleArithmeticTerm EOF ;
    public final void entryRuleArithmeticTerm() throws RecognitionException {
        try {
            // InternalL.g:174:1: ( ruleArithmeticTerm EOF )
            // InternalL.g:175:1: ruleArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticTerm"


    // $ANTLR start "ruleArithmeticTerm"
    // InternalL.g:182:1: ruleArithmeticTerm : ( ruleAddition ) ;
    public final void ruleArithmeticTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:186:2: ( ( ruleAddition ) )
            // InternalL.g:187:1: ( ruleAddition )
            {
            // InternalL.g:187:1: ( ruleAddition )
            // InternalL.g:188:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticTermAccess().getAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticTerm"


    // $ANTLR start "entryRuleAddition"
    // InternalL.g:201:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalL.g:202:1: ( ruleAddition EOF )
            // InternalL.g:203:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalL.g:210:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:214:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalL.g:215:1: ( ( rule__Addition__Group__0 ) )
            {
            // InternalL.g:215:1: ( ( rule__Addition__Group__0 ) )
            // InternalL.g:216:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalL.g:217:1: ( rule__Addition__Group__0 )
            // InternalL.g:217:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalL.g:229:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalL.g:230:1: ( ruleMultiplication EOF )
            // InternalL.g:231:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalL.g:238:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:242:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalL.g:243:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalL.g:243:1: ( ( rule__Multiplication__Group__0 ) )
            // InternalL.g:244:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalL.g:245:1: ( rule__Multiplication__Group__0 )
            // InternalL.g:245:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalL.g:257:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalL.g:258:1: ( rulePrimary EOF )
            // InternalL.g:259:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalL.g:266:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:270:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalL.g:271:1: ( ( rule__Primary__Alternatives ) )
            {
            // InternalL.g:271:1: ( ( rule__Primary__Alternatives ) )
            // InternalL.g:272:1: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalL.g:273:1: ( rule__Primary__Alternatives )
            // InternalL.g:273:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArithmeticLiteral"
    // InternalL.g:285:1: entryRuleArithmeticLiteral : ruleArithmeticLiteral EOF ;
    public final void entryRuleArithmeticLiteral() throws RecognitionException {
        try {
            // InternalL.g:286:1: ( ruleArithmeticLiteral EOF )
            // InternalL.g:287:1: ruleArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArithmeticLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticLiteral"


    // $ANTLR start "ruleArithmeticLiteral"
    // InternalL.g:294:1: ruleArithmeticLiteral : ( ( rule__ArithmeticLiteral__Alternatives ) ) ;
    public final void ruleArithmeticLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:298:2: ( ( ( rule__ArithmeticLiteral__Alternatives ) ) )
            // InternalL.g:299:1: ( ( rule__ArithmeticLiteral__Alternatives ) )
            {
            // InternalL.g:299:1: ( ( rule__ArithmeticLiteral__Alternatives ) )
            // InternalL.g:300:1: ( rule__ArithmeticLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralAccess().getAlternatives()); 
            }
            // InternalL.g:301:1: ( rule__ArithmeticLiteral__Alternatives )
            // InternalL.g:301:2: rule__ArithmeticLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticLiteral"


    // $ANTLR start "entryRuleGroundArithmeticTerm"
    // InternalL.g:313:1: entryRuleGroundArithmeticTerm : ruleGroundArithmeticTerm EOF ;
    public final void entryRuleGroundArithmeticTerm() throws RecognitionException {
        try {
            // InternalL.g:314:1: ( ruleGroundArithmeticTerm EOF )
            // InternalL.g:315:1: ruleGroundArithmeticTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundArithmeticTerm"


    // $ANTLR start "ruleGroundArithmeticTerm"
    // InternalL.g:322:1: ruleGroundArithmeticTerm : ( ruleGroundAddition ) ;
    public final void ruleGroundArithmeticTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:326:2: ( ( ruleGroundAddition ) )
            // InternalL.g:327:1: ( ruleGroundAddition )
            {
            // InternalL.g:327:1: ( ruleGroundAddition )
            // InternalL.g:328:1: ruleGroundAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticTermAccess().getGroundAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticTermAccess().getGroundAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundArithmeticTerm"


    // $ANTLR start "entryRuleGroundAddition"
    // InternalL.g:341:1: entryRuleGroundAddition : ruleGroundAddition EOF ;
    public final void entryRuleGroundAddition() throws RecognitionException {
        try {
            // InternalL.g:342:1: ( ruleGroundAddition EOF )
            // InternalL.g:343:1: ruleGroundAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundAddition"


    // $ANTLR start "ruleGroundAddition"
    // InternalL.g:350:1: ruleGroundAddition : ( ( rule__GroundAddition__Group__0 ) ) ;
    public final void ruleGroundAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:354:2: ( ( ( rule__GroundAddition__Group__0 ) ) )
            // InternalL.g:355:1: ( ( rule__GroundAddition__Group__0 ) )
            {
            // InternalL.g:355:1: ( ( rule__GroundAddition__Group__0 ) )
            // InternalL.g:356:1: ( rule__GroundAddition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getGroup()); 
            }
            // InternalL.g:357:1: ( rule__GroundAddition__Group__0 )
            // InternalL.g:357:2: rule__GroundAddition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundAddition"


    // $ANTLR start "entryRuleGroundMultiplication"
    // InternalL.g:369:1: entryRuleGroundMultiplication : ruleGroundMultiplication EOF ;
    public final void entryRuleGroundMultiplication() throws RecognitionException {
        try {
            // InternalL.g:370:1: ( ruleGroundMultiplication EOF )
            // InternalL.g:371:1: ruleGroundMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundMultiplication"


    // $ANTLR start "ruleGroundMultiplication"
    // InternalL.g:378:1: ruleGroundMultiplication : ( ( rule__GroundMultiplication__Group__0 ) ) ;
    public final void ruleGroundMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:382:2: ( ( ( rule__GroundMultiplication__Group__0 ) ) )
            // InternalL.g:383:1: ( ( rule__GroundMultiplication__Group__0 ) )
            {
            // InternalL.g:383:1: ( ( rule__GroundMultiplication__Group__0 ) )
            // InternalL.g:384:1: ( rule__GroundMultiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getGroup()); 
            }
            // InternalL.g:385:1: ( rule__GroundMultiplication__Group__0 )
            // InternalL.g:385:2: rule__GroundMultiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundMultiplication"


    // $ANTLR start "entryRuleGroundPrimary"
    // InternalL.g:397:1: entryRuleGroundPrimary : ruleGroundPrimary EOF ;
    public final void entryRuleGroundPrimary() throws RecognitionException {
        try {
            // InternalL.g:398:1: ( ruleGroundPrimary EOF )
            // InternalL.g:399:1: ruleGroundPrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundPrimary"


    // $ANTLR start "ruleGroundPrimary"
    // InternalL.g:406:1: ruleGroundPrimary : ( ( rule__GroundPrimary__Alternatives ) ) ;
    public final void ruleGroundPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:410:2: ( ( ( rule__GroundPrimary__Alternatives ) ) )
            // InternalL.g:411:1: ( ( rule__GroundPrimary__Alternatives ) )
            {
            // InternalL.g:411:1: ( ( rule__GroundPrimary__Alternatives ) )
            // InternalL.g:412:1: ( rule__GroundPrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getAlternatives()); 
            }
            // InternalL.g:413:1: ( rule__GroundPrimary__Alternatives )
            // InternalL.g:413:2: rule__GroundPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroundPrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundPrimary"


    // $ANTLR start "entryRuleGroundArithmeticLiteral"
    // InternalL.g:425:1: entryRuleGroundArithmeticLiteral : ruleGroundArithmeticLiteral EOF ;
    public final void entryRuleGroundArithmeticLiteral() throws RecognitionException {
        try {
            // InternalL.g:426:1: ( ruleGroundArithmeticLiteral EOF )
            // InternalL.g:427:1: ruleGroundArithmeticLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundArithmeticLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundArithmeticLiteral"


    // $ANTLR start "ruleGroundArithmeticLiteral"
    // InternalL.g:434:1: ruleGroundArithmeticLiteral : ( ( rule__GroundArithmeticLiteral__Alternatives ) ) ;
    public final void ruleGroundArithmeticLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:438:2: ( ( ( rule__GroundArithmeticLiteral__Alternatives ) ) )
            // InternalL.g:439:1: ( ( rule__GroundArithmeticLiteral__Alternatives ) )
            {
            // InternalL.g:439:1: ( ( rule__GroundArithmeticLiteral__Alternatives ) )
            // InternalL.g:440:1: ( rule__GroundArithmeticLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticLiteralAccess().getAlternatives()); 
            }
            // InternalL.g:441:1: ( rule__GroundArithmeticLiteral__Alternatives )
            // InternalL.g:441:2: rule__GroundArithmeticLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroundArithmeticLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundArithmeticLiteral"


    // $ANTLR start "entryRuleFunctionalTerm"
    // InternalL.g:453:1: entryRuleFunctionalTerm : ruleFunctionalTerm EOF ;
    public final void entryRuleFunctionalTerm() throws RecognitionException {
        try {
            // InternalL.g:454:1: ( ruleFunctionalTerm EOF )
            // InternalL.g:455:1: ruleFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionalTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionalTerm"


    // $ANTLR start "ruleFunctionalTerm"
    // InternalL.g:462:1: ruleFunctionalTerm : ( ( rule__FunctionalTerm__Group__0 ) ) ;
    public final void ruleFunctionalTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:466:2: ( ( ( rule__FunctionalTerm__Group__0 ) ) )
            // InternalL.g:467:1: ( ( rule__FunctionalTerm__Group__0 ) )
            {
            // InternalL.g:467:1: ( ( rule__FunctionalTerm__Group__0 ) )
            // InternalL.g:468:1: ( rule__FunctionalTerm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermAccess().getGroup()); 
            }
            // InternalL.g:469:1: ( rule__FunctionalTerm__Group__0 )
            // InternalL.g:469:2: rule__FunctionalTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalTerm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionalTerm"


    // $ANTLR start "entryRuleGroundFunctionalTerm"
    // InternalL.g:481:1: entryRuleGroundFunctionalTerm : ruleGroundFunctionalTerm EOF ;
    public final void entryRuleGroundFunctionalTerm() throws RecognitionException {
        try {
            // InternalL.g:482:1: ( ruleGroundFunctionalTerm EOF )
            // InternalL.g:483:1: ruleGroundFunctionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundFunctionalTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundFunctionalTerm"


    // $ANTLR start "ruleGroundFunctionalTerm"
    // InternalL.g:490:1: ruleGroundFunctionalTerm : ( ( rule__GroundFunctionalTerm__Group__0 ) ) ;
    public final void ruleGroundFunctionalTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:494:2: ( ( ( rule__GroundFunctionalTerm__Group__0 ) ) )
            // InternalL.g:495:1: ( ( rule__GroundFunctionalTerm__Group__0 ) )
            {
            // InternalL.g:495:1: ( ( rule__GroundFunctionalTerm__Group__0 ) )
            // InternalL.g:496:1: ( rule__GroundFunctionalTerm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermAccess().getGroup()); 
            }
            // InternalL.g:497:1: ( rule__GroundFunctionalTerm__Group__0 )
            // InternalL.g:497:2: rule__GroundFunctionalTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroundFunctionalTerm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundFunctionalTerm"


    // $ANTLR start "entryRuleBasicTerms"
    // InternalL.g:509:1: entryRuleBasicTerms : ruleBasicTerms EOF ;
    public final void entryRuleBasicTerms() throws RecognitionException {
        try {
            // InternalL.g:510:1: ( ruleBasicTerms EOF )
            // InternalL.g:511:1: ruleBasicTerms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicTerms"


    // $ANTLR start "ruleBasicTerms"
    // InternalL.g:518:1: ruleBasicTerms : ( ( rule__BasicTerms__Group__0 ) ) ;
    public final void ruleBasicTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:522:2: ( ( ( rule__BasicTerms__Group__0 ) ) )
            // InternalL.g:523:1: ( ( rule__BasicTerms__Group__0 ) )
            {
            // InternalL.g:523:1: ( ( rule__BasicTerms__Group__0 ) )
            // InternalL.g:524:1: ( rule__BasicTerms__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getGroup()); 
            }
            // InternalL.g:525:1: ( rule__BasicTerms__Group__0 )
            // InternalL.g:525:2: rule__BasicTerms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerms__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicTerms"


    // $ANTLR start "entryRuleGroundTerms"
    // InternalL.g:537:1: entryRuleGroundTerms : ruleGroundTerms EOF ;
    public final void entryRuleGroundTerms() throws RecognitionException {
        try {
            // InternalL.g:538:1: ( ruleGroundTerms EOF )
            // InternalL.g:539:1: ruleGroundTerms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundTerms"


    // $ANTLR start "ruleGroundTerms"
    // InternalL.g:546:1: ruleGroundTerms : ( ( rule__GroundTerms__Group__0 ) ) ;
    public final void ruleGroundTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:550:2: ( ( ( rule__GroundTerms__Group__0 ) ) )
            // InternalL.g:551:1: ( ( rule__GroundTerms__Group__0 ) )
            {
            // InternalL.g:551:1: ( ( rule__GroundTerms__Group__0 ) )
            // InternalL.g:552:1: ( rule__GroundTerms__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getGroup()); 
            }
            // InternalL.g:553:1: ( rule__GroundTerms__Group__0 )
            // InternalL.g:553:2: rule__GroundTerms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerms__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundTerms"


    // $ANTLR start "entryRuleGroundTerm"
    // InternalL.g:565:1: entryRuleGroundTerm : ruleGroundTerm EOF ;
    public final void entryRuleGroundTerm() throws RecognitionException {
        try {
            // InternalL.g:566:1: ( ruleGroundTerm EOF )
            // InternalL.g:567:1: ruleGroundTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroundTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroundTerm"


    // $ANTLR start "ruleGroundTerm"
    // InternalL.g:574:1: ruleGroundTerm : ( ( rule__GroundTerm__Alternatives ) ) ;
    public final void ruleGroundTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:578:2: ( ( ( rule__GroundTerm__Alternatives ) ) )
            // InternalL.g:579:1: ( ( rule__GroundTerm__Alternatives ) )
            {
            // InternalL.g:579:1: ( ( rule__GroundTerm__Alternatives ) )
            // InternalL.g:580:1: ( rule__GroundTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermAccess().getAlternatives()); 
            }
            // InternalL.g:581:1: ( rule__GroundTerm__Alternatives )
            // InternalL.g:581:2: rule__GroundTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundTerm"


    // $ANTLR start "entryRuleQuantifiedTerm"
    // InternalL.g:593:1: entryRuleQuantifiedTerm : ruleQuantifiedTerm EOF ;
    public final void entryRuleQuantifiedTerm() throws RecognitionException {
        try {
            // InternalL.g:594:1: ( ruleQuantifiedTerm EOF )
            // InternalL.g:595:1: ruleQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuantifiedTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuantifiedTerm"


    // $ANTLR start "ruleQuantifiedTerm"
    // InternalL.g:602:1: ruleQuantifiedTerm : ( ( rule__QuantifiedTerm__Alternatives ) ) ;
    public final void ruleQuantifiedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:606:2: ( ( ( rule__QuantifiedTerm__Alternatives ) ) )
            // InternalL.g:607:1: ( ( rule__QuantifiedTerm__Alternatives ) )
            {
            // InternalL.g:607:1: ( ( rule__QuantifiedTerm__Alternatives ) )
            // InternalL.g:608:1: ( rule__QuantifiedTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedTermAccess().getAlternatives()); 
            }
            // InternalL.g:609:1: ( rule__QuantifiedTerm__Alternatives )
            // InternalL.g:609:2: rule__QuantifiedTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuantifiedTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantifiedTerm"


    // $ANTLR start "entryRuleUniversalQuantifiedTerm"
    // InternalL.g:621:1: entryRuleUniversalQuantifiedTerm : ruleUniversalQuantifiedTerm EOF ;
    public final void entryRuleUniversalQuantifiedTerm() throws RecognitionException {
        try {
            // InternalL.g:622:1: ( ruleUniversalQuantifiedTerm EOF )
            // InternalL.g:623:1: ruleUniversalQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUniversalQuantifiedTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalQuantifiedTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniversalQuantifiedTerm"


    // $ANTLR start "ruleUniversalQuantifiedTerm"
    // InternalL.g:630:1: ruleUniversalQuantifiedTerm : ( ( rule__UniversalQuantifiedTerm__Group__0 ) ) ;
    public final void ruleUniversalQuantifiedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:634:2: ( ( ( rule__UniversalQuantifiedTerm__Group__0 ) ) )
            // InternalL.g:635:1: ( ( rule__UniversalQuantifiedTerm__Group__0 ) )
            {
            // InternalL.g:635:1: ( ( rule__UniversalQuantifiedTerm__Group__0 ) )
            // InternalL.g:636:1: ( rule__UniversalQuantifiedTerm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalQuantifiedTermAccess().getGroup()); 
            }
            // InternalL.g:637:1: ( rule__UniversalQuantifiedTerm__Group__0 )
            // InternalL.g:637:2: rule__UniversalQuantifiedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniversalQuantifiedTerm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalQuantifiedTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniversalQuantifiedTerm"


    // $ANTLR start "entryRuleExistentialQuantifiedTerm"
    // InternalL.g:649:1: entryRuleExistentialQuantifiedTerm : ruleExistentialQuantifiedTerm EOF ;
    public final void entryRuleExistentialQuantifiedTerm() throws RecognitionException {
        try {
            // InternalL.g:650:1: ( ruleExistentialQuantifiedTerm EOF )
            // InternalL.g:651:1: ruleExistentialQuantifiedTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistentialQuantifiedTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExistentialQuantifiedTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistentialQuantifiedTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistentialQuantifiedTerm"


    // $ANTLR start "ruleExistentialQuantifiedTerm"
    // InternalL.g:658:1: ruleExistentialQuantifiedTerm : ( ( rule__ExistentialQuantifiedTerm__Group__0 ) ) ;
    public final void ruleExistentialQuantifiedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:662:2: ( ( ( rule__ExistentialQuantifiedTerm__Group__0 ) ) )
            // InternalL.g:663:1: ( ( rule__ExistentialQuantifiedTerm__Group__0 ) )
            {
            // InternalL.g:663:1: ( ( rule__ExistentialQuantifiedTerm__Group__0 ) )
            // InternalL.g:664:1: ( rule__ExistentialQuantifiedTerm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistentialQuantifiedTermAccess().getGroup()); 
            }
            // InternalL.g:665:1: ( rule__ExistentialQuantifiedTerm__Group__0 )
            // InternalL.g:665:2: rule__ExistentialQuantifiedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistentialQuantifiedTerm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistentialQuantifiedTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistentialQuantifiedTerm"


    // $ANTLR start "entryRuleTerm"
    // InternalL.g:677:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalL.g:678:1: ( ruleTerm EOF )
            // InternalL.g:679:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalL.g:686:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:690:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalL.g:691:1: ( ( rule__Term__Alternatives ) )
            {
            // InternalL.g:691:1: ( ( rule__Term__Alternatives ) )
            // InternalL.g:692:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // InternalL.g:693:1: ( rule__Term__Alternatives )
            // InternalL.g:693:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTerms"
    // InternalL.g:705:1: entryRuleTerms : ruleTerms EOF ;
    public final void entryRuleTerms() throws RecognitionException {
        try {
            // InternalL.g:706:1: ( ruleTerms EOF )
            // InternalL.g:707:1: ruleTerms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // InternalL.g:714:1: ruleTerms : ( ( rule__Terms__Group__0 ) ) ;
    public final void ruleTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:718:2: ( ( ( rule__Terms__Group__0 ) ) )
            // InternalL.g:719:1: ( ( rule__Terms__Group__0 ) )
            {
            // InternalL.g:719:1: ( ( rule__Terms__Group__0 ) )
            // InternalL.g:720:1: ( rule__Terms__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getGroup()); 
            }
            // InternalL.g:721:1: ( rule__Terms__Group__0 )
            // InternalL.g:721:2: rule__Terms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terms__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleConstantDeclaration"
    // InternalL.g:733:1: entryRuleConstantDeclaration : ruleConstantDeclaration EOF ;
    public final void entryRuleConstantDeclaration() throws RecognitionException {
        try {
            // InternalL.g:734:1: ( ruleConstantDeclaration EOF )
            // InternalL.g:735:1: ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // InternalL.g:742:1: ruleConstantDeclaration : ( ( rule__ConstantDeclaration__Group__0 ) ) ;
    public final void ruleConstantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:746:2: ( ( ( rule__ConstantDeclaration__Group__0 ) ) )
            // InternalL.g:747:1: ( ( rule__ConstantDeclaration__Group__0 ) )
            {
            // InternalL.g:747:1: ( ( rule__ConstantDeclaration__Group__0 ) )
            // InternalL.g:748:1: ( rule__ConstantDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getGroup()); 
            }
            // InternalL.g:749:1: ( rule__ConstantDeclaration__Group__0 )
            // InternalL.g:749:2: rule__ConstantDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleTypeId"
    // InternalL.g:761:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // InternalL.g:762:1: ( ruleTypeId EOF )
            // InternalL.g:763:1: ruleTypeId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // InternalL.g:770:1: ruleTypeId : ( ( rule__TypeId__NameAssignment ) ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:774:2: ( ( ( rule__TypeId__NameAssignment ) ) )
            // InternalL.g:775:1: ( ( rule__TypeId__NameAssignment ) )
            {
            // InternalL.g:775:1: ( ( rule__TypeId__NameAssignment ) )
            // InternalL.g:776:1: ( rule__TypeId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdAccess().getNameAssignment()); 
            }
            // InternalL.g:777:1: ( rule__TypeId__NameAssignment )
            // InternalL.g:777:2: rule__TypeId__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeId__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalL.g:789:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalL.g:790:1: ( ruleTypeDeclaration EOF )
            // InternalL.g:791:1: ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalL.g:798:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:802:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // InternalL.g:803:1: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // InternalL.g:803:1: ( ( rule__TypeDeclaration__Group__0 ) )
            // InternalL.g:804:1: ( rule__TypeDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            }
            // InternalL.g:805:1: ( rule__TypeDeclaration__Group__0 )
            // InternalL.g:805:2: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleLimit"
    // InternalL.g:817:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalL.g:818:1: ( ruleLimit EOF )
            // InternalL.g:819:1: ruleLimit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLimitRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLimitRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalL.g:826:1: ruleLimit : ( ( rule__Limit__CvAssignment ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:830:2: ( ( ( rule__Limit__CvAssignment ) ) )
            // InternalL.g:831:1: ( ( rule__Limit__CvAssignment ) )
            {
            // InternalL.g:831:1: ( ( rule__Limit__CvAssignment ) )
            // InternalL.g:832:1: ( rule__Limit__CvAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLimitAccess().getCvAssignment()); 
            }
            // InternalL.g:833:1: ( rule__Limit__CvAssignment )
            // InternalL.g:833:2: rule__Limit__CvAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Limit__CvAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLimitAccess().getCvAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSet"
    // InternalL.g:845:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalL.g:846:1: ( ruleSet EOF )
            // InternalL.g:847:1: ruleSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalL.g:854:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:858:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalL.g:859:1: ( ( rule__Set__Group__0 ) )
            {
            // InternalL.g:859:1: ( ( rule__Set__Group__0 ) )
            // InternalL.g:860:1: ( rule__Set__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getGroup()); 
            }
            // InternalL.g:861:1: ( rule__Set__Group__0 )
            // InternalL.g:861:2: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleRange"
    // InternalL.g:873:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalL.g:874:1: ( ruleRange EOF )
            // InternalL.g:875:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalL.g:882:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:886:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalL.g:887:1: ( ( rule__Range__Group__0 ) )
            {
            // InternalL.g:887:1: ( ( rule__Range__Group__0 ) )
            // InternalL.g:888:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // InternalL.g:889:1: ( rule__Range__Group__0 )
            // InternalL.g:889:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleSetExpression"
    // InternalL.g:901:1: entryRuleSetExpression : ruleSetExpression EOF ;
    public final void entryRuleSetExpression() throws RecognitionException {
        try {
            // InternalL.g:902:1: ( ruleSetExpression EOF )
            // InternalL.g:903:1: ruleSetExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // InternalL.g:910:1: ruleSetExpression : ( ruleSetAddition ) ;
    public final void ruleSetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:914:2: ( ( ruleSetAddition ) )
            // InternalL.g:915:1: ( ruleSetAddition )
            {
            // InternalL.g:915:1: ( ruleSetAddition )
            // InternalL.g:916:1: ruleSetAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetExpressionAccess().getSetAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleSetConstruct"
    // InternalL.g:929:1: entryRuleSetConstruct : ruleSetConstruct EOF ;
    public final void entryRuleSetConstruct() throws RecognitionException {
        try {
            // InternalL.g:930:1: ( ruleSetConstruct EOF )
            // InternalL.g:931:1: ruleSetConstruct EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetConstruct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetConstruct"


    // $ANTLR start "ruleSetConstruct"
    // InternalL.g:938:1: ruleSetConstruct : ( ( rule__SetConstruct__Group__0 ) ) ;
    public final void ruleSetConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:942:2: ( ( ( rule__SetConstruct__Group__0 ) ) )
            // InternalL.g:943:1: ( ( rule__SetConstruct__Group__0 ) )
            {
            // InternalL.g:943:1: ( ( rule__SetConstruct__Group__0 ) )
            // InternalL.g:944:1: ( rule__SetConstruct__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getGroup()); 
            }
            // InternalL.g:945:1: ( rule__SetConstruct__Group__0 )
            // InternalL.g:945:2: rule__SetConstruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetConstruct__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetConstruct"


    // $ANTLR start "entryRuleTVars"
    // InternalL.g:957:1: entryRuleTVars : ruleTVars EOF ;
    public final void entryRuleTVars() throws RecognitionException {
        try {
            // InternalL.g:958:1: ( ruleTVars EOF )
            // InternalL.g:959:1: ruleTVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTVars"


    // $ANTLR start "ruleTVars"
    // InternalL.g:966:1: ruleTVars : ( ( rule__TVars__Group__0 ) ) ;
    public final void ruleTVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:970:2: ( ( ( rule__TVars__Group__0 ) ) )
            // InternalL.g:971:1: ( ( rule__TVars__Group__0 ) )
            {
            // InternalL.g:971:1: ( ( rule__TVars__Group__0 ) )
            // InternalL.g:972:1: ( rule__TVars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getGroup()); 
            }
            // InternalL.g:973:1: ( rule__TVars__Group__0 )
            // InternalL.g:973:2: rule__TVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TVars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTVars"


    // $ANTLR start "entryRuleTVar"
    // InternalL.g:985:1: entryRuleTVar : ruleTVar EOF ;
    public final void entryRuleTVar() throws RecognitionException {
        try {
            // InternalL.g:986:1: ( ruleTVar EOF )
            // InternalL.g:987:1: ruleTVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTVar"


    // $ANTLR start "ruleTVar"
    // InternalL.g:994:1: ruleTVar : ( ( rule__TVar__Group__0 ) ) ;
    public final void ruleTVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:998:2: ( ( ( rule__TVar__Group__0 ) ) )
            // InternalL.g:999:1: ( ( rule__TVar__Group__0 ) )
            {
            // InternalL.g:999:1: ( ( rule__TVar__Group__0 ) )
            // InternalL.g:1000:1: ( rule__TVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getGroup()); 
            }
            // InternalL.g:1001:1: ( rule__TVar__Group__0 )
            // InternalL.g:1001:2: rule__TVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTVar"


    // $ANTLR start "entryRuleSetAddition"
    // InternalL.g:1013:1: entryRuleSetAddition : ruleSetAddition EOF ;
    public final void entryRuleSetAddition() throws RecognitionException {
        try {
            // InternalL.g:1014:1: ( ruleSetAddition EOF )
            // InternalL.g:1015:1: ruleSetAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetAddition"


    // $ANTLR start "ruleSetAddition"
    // InternalL.g:1022:1: ruleSetAddition : ( ( rule__SetAddition__Group__0 ) ) ;
    public final void ruleSetAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1026:2: ( ( ( rule__SetAddition__Group__0 ) ) )
            // InternalL.g:1027:1: ( ( rule__SetAddition__Group__0 ) )
            {
            // InternalL.g:1027:1: ( ( rule__SetAddition__Group__0 ) )
            // InternalL.g:1028:1: ( rule__SetAddition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getGroup()); 
            }
            // InternalL.g:1029:1: ( rule__SetAddition__Group__0 )
            // InternalL.g:1029:2: rule__SetAddition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetAddition"


    // $ANTLR start "entryRuleSetMultiplication"
    // InternalL.g:1041:1: entryRuleSetMultiplication : ruleSetMultiplication EOF ;
    public final void entryRuleSetMultiplication() throws RecognitionException {
        try {
            // InternalL.g:1042:1: ( ruleSetMultiplication EOF )
            // InternalL.g:1043:1: ruleSetMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetMultiplication"


    // $ANTLR start "ruleSetMultiplication"
    // InternalL.g:1050:1: ruleSetMultiplication : ( ( rule__SetMultiplication__Group__0 ) ) ;
    public final void ruleSetMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1054:2: ( ( ( rule__SetMultiplication__Group__0 ) ) )
            // InternalL.g:1055:1: ( ( rule__SetMultiplication__Group__0 ) )
            {
            // InternalL.g:1055:1: ( ( rule__SetMultiplication__Group__0 ) )
            // InternalL.g:1056:1: ( rule__SetMultiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getGroup()); 
            }
            // InternalL.g:1057:1: ( rule__SetMultiplication__Group__0 )
            // InternalL.g:1057:2: rule__SetMultiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetMultiplication"


    // $ANTLR start "entryRuleSetPrimary"
    // InternalL.g:1069:1: entryRuleSetPrimary : ruleSetPrimary EOF ;
    public final void entryRuleSetPrimary() throws RecognitionException {
        try {
            // InternalL.g:1070:1: ( ruleSetPrimary EOF )
            // InternalL.g:1071:1: ruleSetPrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetPrimary"


    // $ANTLR start "ruleSetPrimary"
    // InternalL.g:1078:1: ruleSetPrimary : ( ( rule__SetPrimary__Alternatives ) ) ;
    public final void ruleSetPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1082:2: ( ( ( rule__SetPrimary__Alternatives ) ) )
            // InternalL.g:1083:1: ( ( rule__SetPrimary__Alternatives ) )
            {
            // InternalL.g:1083:1: ( ( rule__SetPrimary__Alternatives ) )
            // InternalL.g:1084:1: ( rule__SetPrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetPrimaryAccess().getAlternatives()); 
            }
            // InternalL.g:1085:1: ( rule__SetPrimary__Alternatives )
            // InternalL.g:1085:2: rule__SetPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetPrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetPrimary"


    // $ANTLR start "entryRuleSetLiteral"
    // InternalL.g:1097:1: entryRuleSetLiteral : ruleSetLiteral EOF ;
    public final void entryRuleSetLiteral() throws RecognitionException {
        try {
            // InternalL.g:1098:1: ( ruleSetLiteral EOF )
            // InternalL.g:1099:1: ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // InternalL.g:1106:1: ruleSetLiteral : ( ( rule__SetLiteral__Alternatives ) ) ;
    public final void ruleSetLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1110:2: ( ( ( rule__SetLiteral__Alternatives ) ) )
            // InternalL.g:1111:1: ( ( rule__SetLiteral__Alternatives ) )
            {
            // InternalL.g:1111:1: ( ( rule__SetLiteral__Alternatives ) )
            // InternalL.g:1112:1: ( rule__SetLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetLiteralAccess().getAlternatives()); 
            }
            // InternalL.g:1113:1: ( rule__SetLiteral__Alternatives )
            // InternalL.g:1113:2: rule__SetLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalL.g:1125:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalL.g:1126:1: ( ruleAtom EOF )
            // InternalL.g:1127:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalL.g:1134:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1138:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalL.g:1139:1: ( ( rule__Atom__Alternatives ) )
            {
            // InternalL.g:1139:1: ( ( rule__Atom__Alternatives ) )
            // InternalL.g:1140:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // InternalL.g:1141:1: ( rule__Atom__Alternatives )
            // InternalL.g:1141:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRulePredicateAtom"
    // InternalL.g:1153:1: entryRulePredicateAtom : rulePredicateAtom EOF ;
    public final void entryRulePredicateAtom() throws RecognitionException {
        try {
            // InternalL.g:1154:1: ( rulePredicateAtom EOF )
            // InternalL.g:1155:1: rulePredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicateAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateAtom"


    // $ANTLR start "rulePredicateAtom"
    // InternalL.g:1162:1: rulePredicateAtom : ( ( rule__PredicateAtom__Group__0 ) ) ;
    public final void rulePredicateAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1166:2: ( ( ( rule__PredicateAtom__Group__0 ) ) )
            // InternalL.g:1167:1: ( ( rule__PredicateAtom__Group__0 ) )
            {
            // InternalL.g:1167:1: ( ( rule__PredicateAtom__Group__0 ) )
            // InternalL.g:1168:1: ( rule__PredicateAtom__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getGroup()); 
            }
            // InternalL.g:1169:1: ( rule__PredicateAtom__Group__0 )
            // InternalL.g:1169:2: rule__PredicateAtom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateAtom"


    // $ANTLR start "entryRuleBasicPredicateAtom"
    // InternalL.g:1181:1: entryRuleBasicPredicateAtom : ruleBasicPredicateAtom EOF ;
    public final void entryRuleBasicPredicateAtom() throws RecognitionException {
        try {
            // InternalL.g:1182:1: ( ruleBasicPredicateAtom EOF )
            // InternalL.g:1183:1: ruleBasicPredicateAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicPredicateAtom"


    // $ANTLR start "ruleBasicPredicateAtom"
    // InternalL.g:1190:1: ruleBasicPredicateAtom : ( ( rule__BasicPredicateAtom__Group__0 ) ) ;
    public final void ruleBasicPredicateAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1194:2: ( ( ( rule__BasicPredicateAtom__Group__0 ) ) )
            // InternalL.g:1195:1: ( ( rule__BasicPredicateAtom__Group__0 ) )
            {
            // InternalL.g:1195:1: ( ( rule__BasicPredicateAtom__Group__0 ) )
            // InternalL.g:1196:1: ( rule__BasicPredicateAtom__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getGroup()); 
            }
            // InternalL.g:1197:1: ( rule__BasicPredicateAtom__Group__0 )
            // InternalL.g:1197:2: rule__BasicPredicateAtom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicPredicateAtom"


    // $ANTLR start "entryRuleBuiltInAtom"
    // InternalL.g:1209:1: entryRuleBuiltInAtom : ruleBuiltInAtom EOF ;
    public final void entryRuleBuiltInAtom() throws RecognitionException {
        try {
            // InternalL.g:1210:1: ( ruleBuiltInAtom EOF )
            // InternalL.g:1211:1: ruleBuiltInAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuiltInAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltInAtom"


    // $ANTLR start "ruleBuiltInAtom"
    // InternalL.g:1218:1: ruleBuiltInAtom : ( ( rule__BuiltInAtom__Group__0 ) ) ;
    public final void ruleBuiltInAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1222:2: ( ( ( rule__BuiltInAtom__Group__0 ) ) )
            // InternalL.g:1223:1: ( ( rule__BuiltInAtom__Group__0 ) )
            {
            // InternalL.g:1223:1: ( ( rule__BuiltInAtom__Group__0 ) )
            // InternalL.g:1224:1: ( rule__BuiltInAtom__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getGroup()); 
            }
            // InternalL.g:1225:1: ( rule__BuiltInAtom__Group__0 )
            // InternalL.g:1225:2: rule__BuiltInAtom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltInAtom"


    // $ANTLR start "entryRuleBasicAtom"
    // InternalL.g:1237:1: entryRuleBasicAtom : ruleBasicAtom EOF ;
    public final void entryRuleBasicAtom() throws RecognitionException {
        try {
            // InternalL.g:1238:1: ( ruleBasicAtom EOF )
            // InternalL.g:1239:1: ruleBasicAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicAtom"


    // $ANTLR start "ruleBasicAtom"
    // InternalL.g:1246:1: ruleBasicAtom : ( ( rule__BasicAtom__Alternatives ) ) ;
    public final void ruleBasicAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1250:2: ( ( ( rule__BasicAtom__Alternatives ) ) )
            // InternalL.g:1251:1: ( ( rule__BasicAtom__Alternatives ) )
            {
            // InternalL.g:1251:1: ( ( rule__BasicAtom__Alternatives ) )
            // InternalL.g:1252:1: ( rule__BasicAtom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicAtomAccess().getAlternatives()); 
            }
            // InternalL.g:1253:1: ( rule__BasicAtom__Alternatives )
            // InternalL.g:1253:2: rule__BasicAtom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicAtom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicAtom"


    // $ANTLR start "entryRuleAtomOp"
    // InternalL.g:1265:1: entryRuleAtomOp : ruleAtomOp EOF ;
    public final void entryRuleAtomOp() throws RecognitionException {
        try {
            // InternalL.g:1266:1: ( ruleAtomOp EOF )
            // InternalL.g:1267:1: ruleAtomOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomOp"


    // $ANTLR start "ruleAtomOp"
    // InternalL.g:1274:1: ruleAtomOp : ( ( rule__AtomOp__Alternatives ) ) ;
    public final void ruleAtomOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1278:2: ( ( ( rule__AtomOp__Alternatives ) ) )
            // InternalL.g:1279:1: ( ( rule__AtomOp__Alternatives ) )
            {
            // InternalL.g:1279:1: ( ( rule__AtomOp__Alternatives ) )
            // InternalL.g:1280:1: ( rule__AtomOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomOpAccess().getAlternatives()); 
            }
            // InternalL.g:1281:1: ( rule__AtomOp__Alternatives )
            // InternalL.g:1281:2: rule__AtomOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomOp"


    // $ANTLR start "entryRuleSentence"
    // InternalL.g:1293:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalL.g:1294:1: ( ruleSentence EOF )
            // InternalL.g:1295:1: ruleSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalL.g:1302:1: ruleSentence : ( ruleOrSentence ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1306:2: ( ( ruleOrSentence ) )
            // InternalL.g:1307:1: ( ruleOrSentence )
            {
            // InternalL.g:1307:1: ( ruleOrSentence )
            // InternalL.g:1308:1: ruleOrSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceAccess().getOrSentenceParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleOrSentence"
    // InternalL.g:1321:1: entryRuleOrSentence : ruleOrSentence EOF ;
    public final void entryRuleOrSentence() throws RecognitionException {
        try {
            // InternalL.g:1322:1: ( ruleOrSentence EOF )
            // InternalL.g:1323:1: ruleOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrSentence"


    // $ANTLR start "ruleOrSentence"
    // InternalL.g:1330:1: ruleOrSentence : ( ( rule__OrSentence__Group__0 ) ) ;
    public final void ruleOrSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1334:2: ( ( ( rule__OrSentence__Group__0 ) ) )
            // InternalL.g:1335:1: ( ( rule__OrSentence__Group__0 ) )
            {
            // InternalL.g:1335:1: ( ( rule__OrSentence__Group__0 ) )
            // InternalL.g:1336:1: ( rule__OrSentence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getGroup()); 
            }
            // InternalL.g:1337:1: ( rule__OrSentence__Group__0 )
            // InternalL.g:1337:2: rule__OrSentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrSentence"


    // $ANTLR start "entryRuleAndSentence"
    // InternalL.g:1349:1: entryRuleAndSentence : ruleAndSentence EOF ;
    public final void entryRuleAndSentence() throws RecognitionException {
        try {
            // InternalL.g:1350:1: ( ruleAndSentence EOF )
            // InternalL.g:1351:1: ruleAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndSentence"


    // $ANTLR start "ruleAndSentence"
    // InternalL.g:1358:1: ruleAndSentence : ( ( rule__AndSentence__Group__0 ) ) ;
    public final void ruleAndSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1362:2: ( ( ( rule__AndSentence__Group__0 ) ) )
            // InternalL.g:1363:1: ( ( rule__AndSentence__Group__0 ) )
            {
            // InternalL.g:1363:1: ( ( rule__AndSentence__Group__0 ) )
            // InternalL.g:1364:1: ( rule__AndSentence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getGroup()); 
            }
            // InternalL.g:1365:1: ( rule__AndSentence__Group__0 )
            // InternalL.g:1365:2: rule__AndSentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndSentence"


    // $ANTLR start "entryRulePrimarySentence"
    // InternalL.g:1377:1: entryRulePrimarySentence : rulePrimarySentence EOF ;
    public final void entryRulePrimarySentence() throws RecognitionException {
        try {
            // InternalL.g:1378:1: ( rulePrimarySentence EOF )
            // InternalL.g:1379:1: rulePrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimarySentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimarySentence"


    // $ANTLR start "rulePrimarySentence"
    // InternalL.g:1386:1: rulePrimarySentence : ( ( rule__PrimarySentence__Alternatives ) ) ;
    public final void rulePrimarySentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1390:2: ( ( ( rule__PrimarySentence__Alternatives ) ) )
            // InternalL.g:1391:1: ( ( rule__PrimarySentence__Alternatives ) )
            {
            // InternalL.g:1391:1: ( ( rule__PrimarySentence__Alternatives ) )
            // InternalL.g:1392:1: ( rule__PrimarySentence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimarySentenceAccess().getAlternatives()); 
            }
            // InternalL.g:1393:1: ( rule__PrimarySentence__Alternatives )
            // InternalL.g:1393:2: rule__PrimarySentence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySentence__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimarySentenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimarySentence"


    // $ANTLR start "entryRuleSentenceLiteral"
    // InternalL.g:1405:1: entryRuleSentenceLiteral : ruleSentenceLiteral EOF ;
    public final void entryRuleSentenceLiteral() throws RecognitionException {
        try {
            // InternalL.g:1406:1: ( ruleSentenceLiteral EOF )
            // InternalL.g:1407:1: ruleSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSentenceLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentenceLiteral"


    // $ANTLR start "ruleSentenceLiteral"
    // InternalL.g:1414:1: ruleSentenceLiteral : ( ( rule__SentenceLiteral__Alternatives ) ) ;
    public final void ruleSentenceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1418:2: ( ( ( rule__SentenceLiteral__Alternatives ) ) )
            // InternalL.g:1419:1: ( ( rule__SentenceLiteral__Alternatives ) )
            {
            // InternalL.g:1419:1: ( ( rule__SentenceLiteral__Alternatives ) )
            // InternalL.g:1420:1: ( rule__SentenceLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceLiteralAccess().getAlternatives()); 
            }
            // InternalL.g:1421:1: ( rule__SentenceLiteral__Alternatives )
            // InternalL.g:1421:2: rule__SentenceLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SentenceLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentenceLiteral"


    // $ANTLR start "entryRulepSentence"
    // InternalL.g:1433:1: entryRulepSentence : rulepSentence EOF ;
    public final void entryRulepSentence() throws RecognitionException {
        try {
            // InternalL.g:1434:1: ( rulepSentence EOF )
            // InternalL.g:1435:1: rulepSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepSentence"


    // $ANTLR start "rulepSentence"
    // InternalL.g:1442:1: rulepSentence : ( rulepOrSentence ) ;
    public final void rulepSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1446:2: ( ( rulepOrSentence ) )
            // InternalL.g:1447:1: ( rulepOrSentence )
            {
            // InternalL.g:1447:1: ( rulepOrSentence )
            // InternalL.g:1448:1: rulepOrSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceAccess().getPOrSentenceParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            rulepOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceAccess().getPOrSentenceParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepSentence"


    // $ANTLR start "entryRulepOrSentence"
    // InternalL.g:1461:1: entryRulepOrSentence : rulepOrSentence EOF ;
    public final void entryRulepOrSentence() throws RecognitionException {
        try {
            // InternalL.g:1462:1: ( rulepOrSentence EOF )
            // InternalL.g:1463:1: rulepOrSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepOrSentence"


    // $ANTLR start "rulepOrSentence"
    // InternalL.g:1470:1: rulepOrSentence : ( ( rule__POrSentence__Group__0 ) ) ;
    public final void rulepOrSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1474:2: ( ( ( rule__POrSentence__Group__0 ) ) )
            // InternalL.g:1475:1: ( ( rule__POrSentence__Group__0 ) )
            {
            // InternalL.g:1475:1: ( ( rule__POrSentence__Group__0 ) )
            // InternalL.g:1476:1: ( rule__POrSentence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getGroup()); 
            }
            // InternalL.g:1477:1: ( rule__POrSentence__Group__0 )
            // InternalL.g:1477:2: rule__POrSentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepOrSentence"


    // $ANTLR start "entryRulepAndSentence"
    // InternalL.g:1489:1: entryRulepAndSentence : rulepAndSentence EOF ;
    public final void entryRulepAndSentence() throws RecognitionException {
        try {
            // InternalL.g:1490:1: ( rulepAndSentence EOF )
            // InternalL.g:1491:1: rulepAndSentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepAndSentence"


    // $ANTLR start "rulepAndSentence"
    // InternalL.g:1498:1: rulepAndSentence : ( ( rule__PAndSentence__Group__0 ) ) ;
    public final void rulepAndSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1502:2: ( ( ( rule__PAndSentence__Group__0 ) ) )
            // InternalL.g:1503:1: ( ( rule__PAndSentence__Group__0 ) )
            {
            // InternalL.g:1503:1: ( ( rule__PAndSentence__Group__0 ) )
            // InternalL.g:1504:1: ( rule__PAndSentence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getGroup()); 
            }
            // InternalL.g:1505:1: ( rule__PAndSentence__Group__0 )
            // InternalL.g:1505:2: rule__PAndSentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepAndSentence"


    // $ANTLR start "entryRulepPrimarySentence"
    // InternalL.g:1517:1: entryRulepPrimarySentence : rulepPrimarySentence EOF ;
    public final void entryRulepPrimarySentence() throws RecognitionException {
        try {
            // InternalL.g:1518:1: ( rulepPrimarySentence EOF )
            // InternalL.g:1519:1: rulepPrimarySentence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPPrimarySentenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPPrimarySentenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepPrimarySentence"


    // $ANTLR start "rulepPrimarySentence"
    // InternalL.g:1526:1: rulepPrimarySentence : ( ( rule__PPrimarySentence__Alternatives ) ) ;
    public final void rulepPrimarySentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1530:2: ( ( ( rule__PPrimarySentence__Alternatives ) ) )
            // InternalL.g:1531:1: ( ( rule__PPrimarySentence__Alternatives ) )
            {
            // InternalL.g:1531:1: ( ( rule__PPrimarySentence__Alternatives ) )
            // InternalL.g:1532:1: ( rule__PPrimarySentence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPPrimarySentenceAccess().getAlternatives()); 
            }
            // InternalL.g:1533:1: ( rule__PPrimarySentence__Alternatives )
            // InternalL.g:1533:2: rule__PPrimarySentence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PPrimarySentence__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPPrimarySentenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepPrimarySentence"


    // $ANTLR start "entryRulepSentenceLiteral"
    // InternalL.g:1545:1: entryRulepSentenceLiteral : rulepSentenceLiteral EOF ;
    public final void entryRulepSentenceLiteral() throws RecognitionException {
        try {
            // InternalL.g:1546:1: ( rulepSentenceLiteral EOF )
            // InternalL.g:1547:1: rulepSentenceLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepSentenceLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepSentenceLiteral"


    // $ANTLR start "rulepSentenceLiteral"
    // InternalL.g:1554:1: rulepSentenceLiteral : ( ( rule__PSentenceLiteral__Alternatives ) ) ;
    public final void rulepSentenceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1558:2: ( ( ( rule__PSentenceLiteral__Alternatives ) ) )
            // InternalL.g:1559:1: ( ( rule__PSentenceLiteral__Alternatives ) )
            {
            // InternalL.g:1559:1: ( ( rule__PSentenceLiteral__Alternatives ) )
            // InternalL.g:1560:1: ( rule__PSentenceLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceLiteralAccess().getAlternatives()); 
            }
            // InternalL.g:1561:1: ( rule__PSentenceLiteral__Alternatives )
            // InternalL.g:1561:2: rule__PSentenceLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PSentenceLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepSentenceLiteral"


    // $ANTLR start "entryRuleMaybeLiteral"
    // InternalL.g:1573:1: entryRuleMaybeLiteral : ruleMaybeLiteral EOF ;
    public final void entryRuleMaybeLiteral() throws RecognitionException {
        try {
            // InternalL.g:1574:1: ( ruleMaybeLiteral EOF )
            // InternalL.g:1575:1: ruleMaybeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaybeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMaybeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaybeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaybeLiteral"


    // $ANTLR start "ruleMaybeLiteral"
    // InternalL.g:1582:1: ruleMaybeLiteral : ( ( rule__MaybeLiteral__Group__0 ) ) ;
    public final void ruleMaybeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1586:2: ( ( ( rule__MaybeLiteral__Group__0 ) ) )
            // InternalL.g:1587:1: ( ( rule__MaybeLiteral__Group__0 ) )
            {
            // InternalL.g:1587:1: ( ( rule__MaybeLiteral__Group__0 ) )
            // InternalL.g:1588:1: ( rule__MaybeLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaybeLiteralAccess().getGroup()); 
            }
            // InternalL.g:1589:1: ( rule__MaybeLiteral__Group__0 )
            // InternalL.g:1589:2: rule__MaybeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaybeLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaybeLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaybeLiteral"


    // $ANTLR start "entryRuleCardinalityConstraint"
    // InternalL.g:1601:1: entryRuleCardinalityConstraint : ruleCardinalityConstraint EOF ;
    public final void entryRuleCardinalityConstraint() throws RecognitionException {
        try {
            // InternalL.g:1602:1: ( ruleCardinalityConstraint EOF )
            // InternalL.g:1603:1: ruleCardinalityConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCardinalityConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinalityConstraint"


    // $ANTLR start "ruleCardinalityConstraint"
    // InternalL.g:1610:1: ruleCardinalityConstraint : ( ( rule__CardinalityConstraint__Group__0 ) ) ;
    public final void ruleCardinalityConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1614:2: ( ( ( rule__CardinalityConstraint__Group__0 ) ) )
            // InternalL.g:1615:1: ( ( rule__CardinalityConstraint__Group__0 ) )
            {
            // InternalL.g:1615:1: ( ( rule__CardinalityConstraint__Group__0 ) )
            // InternalL.g:1616:1: ( rule__CardinalityConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getGroup()); 
            }
            // InternalL.g:1617:1: ( rule__CardinalityConstraint__Group__0 )
            // InternalL.g:1617:2: rule__CardinalityConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityConstraint"


    // $ANTLR start "entryRuleBound"
    // InternalL.g:1629:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // InternalL.g:1630:1: ( ruleBound EOF )
            // InternalL.g:1631:1: ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // InternalL.g:1638:1: ruleBound : ( ( rule__Bound__AvAssignment ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1642:2: ( ( ( rule__Bound__AvAssignment ) ) )
            // InternalL.g:1643:1: ( ( rule__Bound__AvAssignment ) )
            {
            // InternalL.g:1643:1: ( ( rule__Bound__AvAssignment ) )
            // InternalL.g:1644:1: ( rule__Bound__AvAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getAvAssignment()); 
            }
            // InternalL.g:1645:1: ( rule__Bound__AvAssignment )
            // InternalL.g:1645:2: rule__Bound__AvAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Bound__AvAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundAccess().getAvAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleRule"
    // InternalL.g:1657:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalL.g:1658:1: ( ruleRule EOF )
            // InternalL.g:1659:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalL.g:1666:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1670:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalL.g:1671:1: ( ( rule__Rule__Group__0 ) )
            {
            // InternalL.g:1671:1: ( ( rule__Rule__Group__0 ) )
            // InternalL.g:1672:1: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalL.g:1673:1: ( rule__Rule__Group__0 )
            // InternalL.g:1673:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleHead"
    // InternalL.g:1685:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // InternalL.g:1686:1: ( ruleHead EOF )
            // InternalL.g:1687:1: ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalL.g:1694:1: ruleHead : ( ( rule__Head__Alternatives ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1698:2: ( ( ( rule__Head__Alternatives ) ) )
            // InternalL.g:1699:1: ( ( rule__Head__Alternatives ) )
            {
            // InternalL.g:1699:1: ( ( rule__Head__Alternatives ) )
            // InternalL.g:1700:1: ( rule__Head__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadAccess().getAlternatives()); 
            }
            // InternalL.g:1701:1: ( rule__Head__Alternatives )
            // InternalL.g:1701:2: rule__Head__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Head__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleStatement"
    // InternalL.g:1713:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalL.g:1714:1: ( ruleStatement EOF )
            // InternalL.g:1715:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalL.g:1722:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1726:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalL.g:1727:1: ( ( rule__Statement__Alternatives ) )
            {
            // InternalL.g:1727:1: ( ( rule__Statement__Alternatives ) )
            // InternalL.g:1728:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalL.g:1729:1: ( rule__Statement__Alternatives )
            // InternalL.g:1729:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "rule__BasicTerm__Alternatives"
    // InternalL.g:1741:1: rule__BasicTerm__Alternatives : ( ( ruleTypedVariable ) | ( ruleArithmeticTerm ) | ( ruleFunctionalTerm ) );
    public final void rule__BasicTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1745:1: ( ( ruleTypedVariable ) | ( ruleArithmeticTerm ) | ( ruleFunctionalTerm ) )
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
                        if (state.backtracking>0) {state.failed=true; return ;}
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
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 29:
                case 33:
                case 37:
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA2_0>=RULE_UID && LA2_0<=RULE_NUMERIC_CONSTANT)||LA2_0==28) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalL.g:1746:1: ( ruleTypedVariable )
                    {
                    // InternalL.g:1746:1: ( ruleTypedVariable )
                    // InternalL.g:1747:1: ruleTypedVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypedVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1752:6: ( ruleArithmeticTerm )
                    {
                    // InternalL.g:1752:6: ( ruleArithmeticTerm )
                    // InternalL.g:1753:1: ruleArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:1758:6: ( ruleFunctionalTerm )
                    {
                    // InternalL.g:1758:6: ( ruleFunctionalTerm )
                    // InternalL.g:1759:1: ruleFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTermAccess().getFunctionalTermParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerm__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_1"
    // InternalL.g:1769:1: rule__Addition__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1773:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalL.g:1774:1: ( '+' )
                    {
                    // InternalL.g:1774:1: ( '+' )
                    // InternalL.g:1775:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1782:6: ( '-' )
                    {
                    // InternalL.g:1782:6: ( '-' )
                    // InternalL.g:1783:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_1"


    // $ANTLR start "rule__Multiplication__Alternatives_1_1"
    // InternalL.g:1795:1: rule__Multiplication__Alternatives_1_1 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__Multiplication__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1799:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalL.g:1800:1: ( '*' )
                    {
                    // InternalL.g:1800:1: ( '*' )
                    // InternalL.g:1801:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1808:6: ( '/' )
                    {
                    // InternalL.g:1808:6: ( '/' )
                    // InternalL.g:1809:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:1816:6: ( '%' )
                    {
                    // InternalL.g:1816:6: ( '%' )
                    // InternalL.g:1817:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalL.g:1829:1: rule__Primary__Alternatives : ( ( ( rule__Primary__TermAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1833:1: ( ( ( rule__Primary__TermAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_LID && LA5_0<=RULE_NUMERIC_CONSTANT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalL.g:1834:1: ( ( rule__Primary__TermAssignment_0 ) )
                    {
                    // InternalL.g:1834:1: ( ( rule__Primary__TermAssignment_0 ) )
                    // InternalL.g:1835:1: ( rule__Primary__TermAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getTermAssignment_0()); 
                    }
                    // InternalL.g:1836:1: ( rule__Primary__TermAssignment_0 )
                    // InternalL.g:1836:2: rule__Primary__TermAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__TermAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getTermAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1840:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalL.g:1840:6: ( ( rule__Primary__Group_1__0 ) )
                    // InternalL.g:1841:1: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalL.g:1842:1: ( rule__Primary__Group_1__0 )
                    // InternalL.g:1842:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__ArithmeticLiteral__Alternatives"
    // InternalL.g:1851:1: rule__ArithmeticLiteral__Alternatives : ( ( ( rule__ArithmeticLiteral__VAssignment_0 ) ) | ( ( rule__ArithmeticLiteral__TvAssignment_1 ) ) | ( ( rule__ArithmeticLiteral__ConstAssignment_2 ) ) | ( ( rule__ArithmeticLiteral__ValueAssignment_3 ) ) );
    public final void rule__ArithmeticLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1855:1: ( ( ( rule__ArithmeticLiteral__VAssignment_0 ) ) | ( ( rule__ArithmeticLiteral__TvAssignment_1 ) ) | ( ( rule__ArithmeticLiteral__ConstAssignment_2 ) ) | ( ( rule__ArithmeticLiteral__ValueAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_UID:
                {
                alt6=1;
                }
                break;
            case RULE_LID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_UID) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||(LA6_2>=14 && LA6_2<=18)||(LA6_2>=20 && LA6_2<=27)||LA6_2==29||LA6_2==33||LA6_2==35||LA6_2==37||LA6_2==39||LA6_2==43) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMERIC_CONSTANT:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalL.g:1856:1: ( ( rule__ArithmeticLiteral__VAssignment_0 ) )
                    {
                    // InternalL.g:1856:1: ( ( rule__ArithmeticLiteral__VAssignment_0 ) )
                    // InternalL.g:1857:1: ( rule__ArithmeticLiteral__VAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticLiteralAccess().getVAssignment_0()); 
                    }
                    // InternalL.g:1858:1: ( rule__ArithmeticLiteral__VAssignment_0 )
                    // InternalL.g:1858:2: rule__ArithmeticLiteral__VAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArithmeticLiteral__VAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticLiteralAccess().getVAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1862:6: ( ( rule__ArithmeticLiteral__TvAssignment_1 ) )
                    {
                    // InternalL.g:1862:6: ( ( rule__ArithmeticLiteral__TvAssignment_1 ) )
                    // InternalL.g:1863:1: ( rule__ArithmeticLiteral__TvAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticLiteralAccess().getTvAssignment_1()); 
                    }
                    // InternalL.g:1864:1: ( rule__ArithmeticLiteral__TvAssignment_1 )
                    // InternalL.g:1864:2: rule__ArithmeticLiteral__TvAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArithmeticLiteral__TvAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticLiteralAccess().getTvAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:1868:6: ( ( rule__ArithmeticLiteral__ConstAssignment_2 ) )
                    {
                    // InternalL.g:1868:6: ( ( rule__ArithmeticLiteral__ConstAssignment_2 ) )
                    // InternalL.g:1869:1: ( rule__ArithmeticLiteral__ConstAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticLiteralAccess().getConstAssignment_2()); 
                    }
                    // InternalL.g:1870:1: ( rule__ArithmeticLiteral__ConstAssignment_2 )
                    // InternalL.g:1870:2: rule__ArithmeticLiteral__ConstAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArithmeticLiteral__ConstAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticLiteralAccess().getConstAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalL.g:1874:6: ( ( rule__ArithmeticLiteral__ValueAssignment_3 ) )
                    {
                    // InternalL.g:1874:6: ( ( rule__ArithmeticLiteral__ValueAssignment_3 ) )
                    // InternalL.g:1875:1: ( rule__ArithmeticLiteral__ValueAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArithmeticLiteralAccess().getValueAssignment_3()); 
                    }
                    // InternalL.g:1876:1: ( rule__ArithmeticLiteral__ValueAssignment_3 )
                    // InternalL.g:1876:2: rule__ArithmeticLiteral__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArithmeticLiteral__ValueAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArithmeticLiteralAccess().getValueAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticLiteral__Alternatives"


    // $ANTLR start "rule__GroundAddition__Alternatives_1_1"
    // InternalL.g:1885:1: rule__GroundAddition__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__GroundAddition__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1889:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalL.g:1890:1: ( '+' )
                    {
                    // InternalL.g:1890:1: ( '+' )
                    // InternalL.g:1891:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundAdditionAccess().getPlusSignKeyword_1_1_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundAdditionAccess().getPlusSignKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1898:6: ( '-' )
                    {
                    // InternalL.g:1898:6: ( '-' )
                    // InternalL.g:1899:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Alternatives_1_1"


    // $ANTLR start "rule__GroundMultiplication__Alternatives_1_1"
    // InternalL.g:1911:1: rule__GroundMultiplication__Alternatives_1_1 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__GroundMultiplication__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1915:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalL.g:1916:1: ( '*' )
                    {
                    // InternalL.g:1916:1: ( '*' )
                    // InternalL.g:1917:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1924:6: ( '/' )
                    {
                    // InternalL.g:1924:6: ( '/' )
                    // InternalL.g:1925:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundMultiplicationAccess().getSolidusKeyword_1_1_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundMultiplicationAccess().getSolidusKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:1932:6: ( '%' )
                    {
                    // InternalL.g:1932:6: ( '%' )
                    // InternalL.g:1933:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundMultiplicationAccess().getPercentSignKeyword_1_1_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundMultiplicationAccess().getPercentSignKeyword_1_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Alternatives_1_1"


    // $ANTLR start "rule__GroundPrimary__Alternatives"
    // InternalL.g:1945:1: rule__GroundPrimary__Alternatives : ( ( ( rule__GroundPrimary__TermAssignment_0 ) ) | ( ( rule__GroundPrimary__Group_1__0 ) ) );
    public final void rule__GroundPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1949:1: ( ( ( rule__GroundPrimary__TermAssignment_0 ) ) | ( ( rule__GroundPrimary__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LID||LA9_0==RULE_NUMERIC_CONSTANT) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalL.g:1950:1: ( ( rule__GroundPrimary__TermAssignment_0 ) )
                    {
                    // InternalL.g:1950:1: ( ( rule__GroundPrimary__TermAssignment_0 ) )
                    // InternalL.g:1951:1: ( rule__GroundPrimary__TermAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundPrimaryAccess().getTermAssignment_0()); 
                    }
                    // InternalL.g:1952:1: ( rule__GroundPrimary__TermAssignment_0 )
                    // InternalL.g:1952:2: rule__GroundPrimary__TermAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroundPrimary__TermAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundPrimaryAccess().getTermAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1956:6: ( ( rule__GroundPrimary__Group_1__0 ) )
                    {
                    // InternalL.g:1956:6: ( ( rule__GroundPrimary__Group_1__0 ) )
                    // InternalL.g:1957:1: ( rule__GroundPrimary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundPrimaryAccess().getGroup_1()); 
                    }
                    // InternalL.g:1958:1: ( rule__GroundPrimary__Group_1__0 )
                    // InternalL.g:1958:2: rule__GroundPrimary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroundPrimary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Alternatives"


    // $ANTLR start "rule__GroundArithmeticLiteral__Alternatives"
    // InternalL.g:1967:1: rule__GroundArithmeticLiteral__Alternatives : ( ( ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 ) ) | ( ( rule__GroundArithmeticLiteral__ValueAssignment_1 ) ) );
    public final void rule__GroundArithmeticLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1971:1: ( ( ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 ) ) | ( ( rule__GroundArithmeticLiteral__ValueAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NUMERIC_CONSTANT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalL.g:1972:1: ( ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 ) )
                    {
                    // InternalL.g:1972:1: ( ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 ) )
                    // InternalL.g:1973:1: ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierAssignment_0()); 
                    }
                    // InternalL.g:1974:1: ( rule__GroundArithmeticLiteral__IdentifierAssignment_0 )
                    // InternalL.g:1974:2: rule__GroundArithmeticLiteral__IdentifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroundArithmeticLiteral__IdentifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:1978:6: ( ( rule__GroundArithmeticLiteral__ValueAssignment_1 ) )
                    {
                    // InternalL.g:1978:6: ( ( rule__GroundArithmeticLiteral__ValueAssignment_1 ) )
                    // InternalL.g:1979:1: ( rule__GroundArithmeticLiteral__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundArithmeticLiteralAccess().getValueAssignment_1()); 
                    }
                    // InternalL.g:1980:1: ( rule__GroundArithmeticLiteral__ValueAssignment_1 )
                    // InternalL.g:1980:2: rule__GroundArithmeticLiteral__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroundArithmeticLiteral__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundArithmeticLiteralAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundArithmeticLiteral__Alternatives"


    // $ANTLR start "rule__GroundTerm__Alternatives"
    // InternalL.g:1989:1: rule__GroundTerm__Alternatives : ( ( ruleGroundArithmeticTerm ) | ( ruleGroundFunctionalTerm ) );
    public final void rule__GroundTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:1993:1: ( ( ruleGroundArithmeticTerm ) | ( ruleGroundFunctionalTerm ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=14 && LA11_1<=18)||LA11_1==27||LA11_1==29||LA11_1==35) ) {
                    alt11=1;
                }
                else if ( (LA11_1==28) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_NUMERIC_CONSTANT||LA11_0==28) ) {
                alt11=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalL.g:1994:1: ( ruleGroundArithmeticTerm )
                    {
                    // InternalL.g:1994:1: ( ruleGroundArithmeticTerm )
                    // InternalL.g:1995:1: ruleGroundArithmeticTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundTermAccess().getGroundArithmeticTermParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroundArithmeticTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundTermAccess().getGroundArithmeticTermParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2000:6: ( ruleGroundFunctionalTerm )
                    {
                    // InternalL.g:2000:6: ( ruleGroundFunctionalTerm )
                    // InternalL.g:2001:1: ruleGroundFunctionalTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGroundTermAccess().getGroundFunctionalTermParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroundFunctionalTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGroundTermAccess().getGroundFunctionalTermParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerm__Alternatives"


    // $ANTLR start "rule__QuantifiedTerm__Alternatives"
    // InternalL.g:2011:1: rule__QuantifiedTerm__Alternatives : ( ( ruleUniversalQuantifiedTerm ) | ( ruleExistentialQuantifiedTerm ) );
    public final void rule__QuantifiedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2015:1: ( ( ruleUniversalQuantifiedTerm ) | ( ruleExistentialQuantifiedTerm ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalL.g:2016:1: ( ruleUniversalQuantifiedTerm )
                    {
                    // InternalL.g:2016:1: ( ruleUniversalQuantifiedTerm )
                    // InternalL.g:2017:1: ruleUniversalQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifiedTermAccess().getUniversalQuantifiedTermParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUniversalQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifiedTermAccess().getUniversalQuantifiedTermParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2022:6: ( ruleExistentialQuantifiedTerm )
                    {
                    // InternalL.g:2022:6: ( ruleExistentialQuantifiedTerm )
                    // InternalL.g:2023:1: ruleExistentialQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifiedTermAccess().getExistentialQuantifiedTermParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExistentialQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifiedTermAccess().getExistentialQuantifiedTermParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedTerm__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalL.g:2033:1: rule__Term__Alternatives : ( ( ruleBasicTerm ) | ( ruleQuantifiedTerm ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2037:1: ( ( ruleBasicTerm ) | ( ruleQuantifiedTerm ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_LID && LA13_0<=RULE_NUMERIC_CONSTANT)||LA13_0==28) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=30 && LA13_0<=31)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalL.g:2038:1: ( ruleBasicTerm )
                    {
                    // InternalL.g:2038:1: ( ruleBasicTerm )
                    // InternalL.g:2039:1: ruleBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getBasicTermParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getBasicTermParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2044:6: ( ruleQuantifiedTerm )
                    {
                    // InternalL.g:2044:6: ( ruleQuantifiedTerm )
                    // InternalL.g:2045:1: ruleQuantifiedTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getQuantifiedTermParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQuantifiedTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getQuantifiedTermParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__SetMultiplication__Alternatives_1_1"
    // InternalL.g:2055:1: rule__SetMultiplication__Alternatives_1_1 : ( ( '*' ) | ( '\\\\' ) );
    public final void rule__SetMultiplication__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2059:1: ( ( '*' ) | ( '\\\\' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalL.g:2060:1: ( '*' )
                    {
                    // InternalL.g:2060:1: ( '*' )
                    // InternalL.g:2061:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetMultiplicationAccess().getAsteriskKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2068:6: ( '\\\\' )
                    {
                    // InternalL.g:2068:6: ( '\\\\' )
                    // InternalL.g:2069:1: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetMultiplicationAccess().getReverseSolidusKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Alternatives_1_1"


    // $ANTLR start "rule__SetPrimary__Alternatives"
    // InternalL.g:2081:1: rule__SetPrimary__Alternatives : ( ( ruleSetLiteral ) | ( ( rule__SetPrimary__Group_1__0 ) ) );
    public final void rule__SetPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2085:1: ( ( ruleSetLiteral ) | ( ( rule__SetPrimary__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_LID && LA15_0<=RULE_NUMERIC_CONSTANT)||LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                int LA15_5 = input.LA(2);

                if ( (synpred20_InternalL()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalL.g:2086:1: ( ruleSetLiteral )
                    {
                    // InternalL.g:2086:1: ( ruleSetLiteral )
                    // InternalL.g:2087:1: ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSetLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2092:6: ( ( rule__SetPrimary__Group_1__0 ) )
                    {
                    // InternalL.g:2092:6: ( ( rule__SetPrimary__Group_1__0 ) )
                    // InternalL.g:2093:1: ( rule__SetPrimary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetPrimaryAccess().getGroup_1()); 
                    }
                    // InternalL.g:2094:1: ( rule__SetPrimary__Group_1__0 )
                    // InternalL.g:2094:2: rule__SetPrimary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetPrimary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Alternatives"


    // $ANTLR start "rule__SetLiteral__Alternatives"
    // InternalL.g:2103:1: rule__SetLiteral__Alternatives : ( ( ruleSet ) | ( ruleRange ) | ( ruleSetConstruct ) | ( RULE_LID ) );
    public final void rule__SetLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2107:1: ( ( ruleSet ) | ( ruleRange ) | ( ruleSetConstruct ) | ( RULE_LID ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred21_InternalL()) ) {
                    alt16=1;
                }
                else if ( (synpred22_InternalL()) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LID:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred23_InternalL()) ) {
                    alt16=3;
                }
                else if ( (true) ) {
                    alt16=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UID:
            case RULE_NUMERIC_CONSTANT:
            case 28:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalL.g:2108:1: ( ruleSet )
                    {
                    // InternalL.g:2108:1: ( ruleSet )
                    // InternalL.g:2109:1: ruleSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetLiteralAccess().getSetParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetLiteralAccess().getSetParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2114:6: ( ruleRange )
                    {
                    // InternalL.g:2114:6: ( ruleRange )
                    // InternalL.g:2115:1: ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetLiteralAccess().getRangeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRange();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetLiteralAccess().getRangeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:2120:6: ( ruleSetConstruct )
                    {
                    // InternalL.g:2120:6: ( ruleSetConstruct )
                    // InternalL.g:2121:1: ruleSetConstruct
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetLiteralAccess().getSetConstructParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSetConstruct();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetLiteralAccess().getSetConstructParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalL.g:2126:6: ( RULE_LID )
                    {
                    // InternalL.g:2126:6: ( RULE_LID )
                    // InternalL.g:2127:1: RULE_LID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetLiteralAccess().getLIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetLiteralAccess().getLIDTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalL.g:2137:1: rule__Atom__Alternatives : ( ( rulePredicateAtom ) | ( ruleBuiltInAtom ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2141:1: ( ( rulePredicateAtom ) | ( ruleBuiltInAtom ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LID) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred24_InternalL()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=RULE_UID && LA17_0<=RULE_NUMERIC_CONSTANT)||LA17_0==28) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalL.g:2142:1: ( rulePredicateAtom )
                    {
                    // InternalL.g:2142:1: ( rulePredicateAtom )
                    // InternalL.g:2143:1: rulePredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getPredicateAtomParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePredicateAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getPredicateAtomParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2148:6: ( ruleBuiltInAtom )
                    {
                    // InternalL.g:2148:6: ( ruleBuiltInAtom )
                    // InternalL.g:2149:1: ruleBuiltInAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBuiltInAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__BasicAtom__Alternatives"
    // InternalL.g:2159:1: rule__BasicAtom__Alternatives : ( ( ruleBasicPredicateAtom ) | ( ruleBuiltInAtom ) );
    public final void rule__BasicAtom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2163:1: ( ( ruleBasicPredicateAtom ) | ( ruleBuiltInAtom ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LID) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred25_InternalL()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA18_0>=RULE_UID && LA18_0<=RULE_NUMERIC_CONSTANT)||LA18_0==28) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalL.g:2164:1: ( ruleBasicPredicateAtom )
                    {
                    // InternalL.g:2164:1: ( ruleBasicPredicateAtom )
                    // InternalL.g:2165:1: ruleBasicPredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicAtomAccess().getBasicPredicateAtomParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicPredicateAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicAtomAccess().getBasicPredicateAtomParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2170:6: ( ruleBuiltInAtom )
                    {
                    // InternalL.g:2170:6: ( ruleBuiltInAtom )
                    // InternalL.g:2171:1: ruleBuiltInAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBuiltInAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicAtomAccess().getBuiltInAtomParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicAtom__Alternatives"


    // $ANTLR start "rule__AtomOp__Alternatives"
    // InternalL.g:2181:1: rule__AtomOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) );
    public final void rule__AtomOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2185:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '!=' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 23:
                {
                alt19=4;
                }
                break;
            case 24:
                {
                alt19=5;
                }
                break;
            case 25:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalL.g:2186:1: ( '>' )
                    {
                    // InternalL.g:2186:1: ( '>' )
                    // InternalL.g:2187:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getGreaterThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2194:6: ( '<' )
                    {
                    // InternalL.g:2194:6: ( '<' )
                    // InternalL.g:2195:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getLessThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:2202:6: ( '>=' )
                    {
                    // InternalL.g:2202:6: ( '>=' )
                    // InternalL.g:2203:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalL.g:2210:6: ( '<=' )
                    {
                    // InternalL.g:2210:6: ( '<=' )
                    // InternalL.g:2211:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalL.g:2218:6: ( '=' )
                    {
                    // InternalL.g:2218:6: ( '=' )
                    // InternalL.g:2219:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalL.g:2226:6: ( '!=' )
                    {
                    // InternalL.g:2226:6: ( '!=' )
                    // InternalL.g:2227:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomOpAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomOp__Alternatives"


    // $ANTLR start "rule__AndSentence__Alternatives_1_1"
    // InternalL.g:2239:1: rule__AndSentence__Alternatives_1_1 : ( ( 'and' ) | ( ',' ) );
    public final void rule__AndSentence__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2243:1: ( ( 'and' ) | ( ',' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==27) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalL.g:2244:1: ( 'and' )
                    {
                    // InternalL.g:2244:1: ( 'and' )
                    // InternalL.g:2245:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndSentenceAccess().getAndKeyword_1_1_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndSentenceAccess().getAndKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2252:6: ( ',' )
                    {
                    // InternalL.g:2252:6: ( ',' )
                    // InternalL.g:2253:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndSentenceAccess().getCommaKeyword_1_1_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndSentenceAccess().getCommaKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Alternatives_1_1"


    // $ANTLR start "rule__PrimarySentence__Alternatives"
    // InternalL.g:2265:1: rule__PrimarySentence__Alternatives : ( ( ruleSentenceLiteral ) | ( ( rule__PrimarySentence__Group_1__0 ) ) );
    public final void rule__PrimarySentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2269:1: ( ( ruleSentenceLiteral ) | ( ( rule__PrimarySentence__Group_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_LID && LA21_0<=RULE_NUMERIC_CONSTANT)||LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                int LA21_4 = input.LA(2);

                if ( (synpred32_InternalL()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalL.g:2270:1: ( ruleSentenceLiteral )
                    {
                    // InternalL.g:2270:1: ( ruleSentenceLiteral )
                    // InternalL.g:2271:1: ruleSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2276:6: ( ( rule__PrimarySentence__Group_1__0 ) )
                    {
                    // InternalL.g:2276:6: ( ( rule__PrimarySentence__Group_1__0 ) )
                    // InternalL.g:2277:1: ( rule__PrimarySentence__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimarySentenceAccess().getGroup_1()); 
                    }
                    // InternalL.g:2278:1: ( rule__PrimarySentence__Group_1__0 )
                    // InternalL.g:2278:2: rule__PrimarySentence__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimarySentence__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimarySentenceAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Alternatives"


    // $ANTLR start "rule__SentenceLiteral__Alternatives"
    // InternalL.g:2287:1: rule__SentenceLiteral__Alternatives : ( ( ruleAtom ) | ( ( rule__SentenceLiteral__Group_1__0 ) ) );
    public final void rule__SentenceLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2291:1: ( ( ruleAtom ) | ( ( rule__SentenceLiteral__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_LID && LA22_0<=RULE_NUMERIC_CONSTANT)||LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalL.g:2292:1: ( ruleAtom )
                    {
                    // InternalL.g:2292:1: ( ruleAtom )
                    // InternalL.g:2293:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSentenceLiteralAccess().getAtomParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSentenceLiteralAccess().getAtomParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2298:6: ( ( rule__SentenceLiteral__Group_1__0 ) )
                    {
                    // InternalL.g:2298:6: ( ( rule__SentenceLiteral__Group_1__0 ) )
                    // InternalL.g:2299:1: ( rule__SentenceLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSentenceLiteralAccess().getGroup_1()); 
                    }
                    // InternalL.g:2300:1: ( rule__SentenceLiteral__Group_1__0 )
                    // InternalL.g:2300:2: rule__SentenceLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SentenceLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSentenceLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceLiteral__Alternatives"


    // $ANTLR start "rule__PPrimarySentence__Alternatives"
    // InternalL.g:2309:1: rule__PPrimarySentence__Alternatives : ( ( rulepSentenceLiteral ) | ( ( rule__PPrimarySentence__Group_1__0 ) ) );
    public final void rule__PPrimarySentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2313:1: ( ( rulepSentenceLiteral ) | ( ( rule__PPrimarySentence__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LID||LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==28) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalL.g:2314:1: ( rulepSentenceLiteral )
                    {
                    // InternalL.g:2314:1: ( rulepSentenceLiteral )
                    // InternalL.g:2315:1: rulepSentenceLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPPrimarySentenceAccess().getPSentenceLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulepSentenceLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPPrimarySentenceAccess().getPSentenceLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2320:6: ( ( rule__PPrimarySentence__Group_1__0 ) )
                    {
                    // InternalL.g:2320:6: ( ( rule__PPrimarySentence__Group_1__0 ) )
                    // InternalL.g:2321:1: ( rule__PPrimarySentence__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPPrimarySentenceAccess().getGroup_1()); 
                    }
                    // InternalL.g:2322:1: ( rule__PPrimarySentence__Group_1__0 )
                    // InternalL.g:2322:2: rule__PPrimarySentence__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PPrimarySentence__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPPrimarySentenceAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Alternatives"


    // $ANTLR start "rule__PSentenceLiteral__Alternatives"
    // InternalL.g:2331:1: rule__PSentenceLiteral__Alternatives : ( ( rulePredicateAtom ) | ( ( rule__PSentenceLiteral__Group_1__0 ) ) );
    public final void rule__PSentenceLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2335:1: ( ( rulePredicateAtom ) | ( ( rule__PSentenceLiteral__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LID) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalL.g:2336:1: ( rulePredicateAtom )
                    {
                    // InternalL.g:2336:1: ( rulePredicateAtom )
                    // InternalL.g:2337:1: rulePredicateAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPSentenceLiteralAccess().getPredicateAtomParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePredicateAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPSentenceLiteralAccess().getPredicateAtomParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2342:6: ( ( rule__PSentenceLiteral__Group_1__0 ) )
                    {
                    // InternalL.g:2342:6: ( ( rule__PSentenceLiteral__Group_1__0 ) )
                    // InternalL.g:2343:1: ( rule__PSentenceLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPSentenceLiteralAccess().getGroup_1()); 
                    }
                    // InternalL.g:2344:1: ( rule__PSentenceLiteral__Group_1__0 )
                    // InternalL.g:2344:2: rule__PSentenceLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PSentenceLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPSentenceLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSentenceLiteral__Alternatives"


    // $ANTLR start "rule__Head__Alternatives"
    // InternalL.g:2353:1: rule__Head__Alternatives : ( ( rulepSentence ) | ( ruleMaybeLiteral ) | ( ruleCardinalityConstraint ) );
    public final void rule__Head__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2357:1: ( ( rulepSentence ) | ( ruleMaybeLiteral ) | ( ruleCardinalityConstraint ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_LID:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred36_InternalL()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt25=1;
                }
                break;
            case 28:
                {
                int LA25_3 = input.LA(2);

                if ( (synpred36_InternalL()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt25=2;
                }
                break;
            case RULE_UID:
            case RULE_NUMERIC_CONSTANT:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalL.g:2358:1: ( rulepSentence )
                    {
                    // InternalL.g:2358:1: ( rulepSentence )
                    // InternalL.g:2359:1: rulepSentence
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeadAccess().getPSentenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulepSentence();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeadAccess().getPSentenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2364:6: ( ruleMaybeLiteral )
                    {
                    // InternalL.g:2364:6: ( ruleMaybeLiteral )
                    // InternalL.g:2365:1: ruleMaybeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMaybeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeadAccess().getMaybeLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:2370:6: ( ruleCardinalityConstraint )
                    {
                    // InternalL.g:2370:6: ( ruleCardinalityConstraint )
                    // InternalL.g:2371:1: ruleCardinalityConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCardinalityConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeadAccess().getCardinalityConstraintParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalL.g:2381:1: rule__Statement__Alternatives : ( ( ruleRule ) | ( ruleTypeDeclaration ) | ( ruleConstantDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2385:1: ( ( ruleRule ) | ( ruleTypeDeclaration ) | ( ruleConstantDeclaration ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_LID:
            case RULE_UID:
            case RULE_NUMERIC_CONSTANT:
            case 28:
            case 40:
            case 41:
                {
                alt26=1;
                }
                break;
            case 34:
                {
                alt26=2;
                }
                break;
            case 32:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalL.g:2386:1: ( ruleRule )
                    {
                    // InternalL.g:2386:1: ( ruleRule )
                    // InternalL.g:2387:1: ruleRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRuleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalL.g:2392:6: ( ruleTypeDeclaration )
                    {
                    // InternalL.g:2392:6: ( ruleTypeDeclaration )
                    // InternalL.g:2393:1: ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTypeDeclarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalL.g:2398:6: ( ruleConstantDeclaration )
                    {
                    // InternalL.g:2398:6: ( ruleConstantDeclaration )
                    // InternalL.g:2399:1: ruleConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConstantDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getConstantDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__TypedVariable__Group__0"
    // InternalL.g:2411:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2415:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // InternalL.g:2416:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypedVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__0"


    // $ANTLR start "rule__TypedVariable__Group__0__Impl"
    // InternalL.g:2423:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__NameAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2427:1: ( ( ( rule__TypedVariable__NameAssignment_0 ) ) )
            // InternalL.g:2428:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            {
            // InternalL.g:2428:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            // InternalL.g:2429:1: ( rule__TypedVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            }
            // InternalL.g:2430:1: ( rule__TypedVariable__NameAssignment_0 )
            // InternalL.g:2430:2: rule__TypedVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__0__Impl"


    // $ANTLR start "rule__TypedVariable__Group__1"
    // InternalL.g:2440:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2444:1: ( rule__TypedVariable__Group__1__Impl )
            // InternalL.g:2445:2: rule__TypedVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__1"


    // $ANTLR start "rule__TypedVariable__Group__1__Impl"
    // InternalL.g:2451:1: rule__TypedVariable__Group__1__Impl : ( ( rule__TypedVariable__VarAssignment_1 ) ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2455:1: ( ( ( rule__TypedVariable__VarAssignment_1 ) ) )
            // InternalL.g:2456:1: ( ( rule__TypedVariable__VarAssignment_1 ) )
            {
            // InternalL.g:2456:1: ( ( rule__TypedVariable__VarAssignment_1 ) )
            // InternalL.g:2457:1: ( rule__TypedVariable__VarAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getVarAssignment_1()); 
            }
            // InternalL.g:2458:1: ( rule__TypedVariable__VarAssignment_1 )
            // InternalL.g:2458:2: rule__TypedVariable__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__VarAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getVarAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalL.g:2472:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2476:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalL.g:2477:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalL.g:2484:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2488:1: ( ( ruleMultiplication ) )
            // InternalL.g:2489:1: ( ruleMultiplication )
            {
            // InternalL.g:2489:1: ( ruleMultiplication )
            // InternalL.g:2490:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalL.g:2501:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2505:1: ( rule__Addition__Group__1__Impl )
            // InternalL.g:2506:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalL.g:2512:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2516:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalL.g:2517:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalL.g:2517:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalL.g:2518:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalL.g:2519:1: ( rule__Addition__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=14 && LA27_0<=15)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalL.g:2519:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalL.g:2533:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2537:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalL.g:2538:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalL.g:2545:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2549:1: ( ( () ) )
            // InternalL.g:2550:1: ( () )
            {
            // InternalL.g:2550:1: ( () )
            // InternalL.g:2551:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0()); 
            }
            // InternalL.g:2552:1: ()
            // InternalL.g:2554:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAdditionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalL.g:2564:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2568:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalL.g:2569:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalL.g:2576:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__Alternatives_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2580:1: ( ( ( rule__Addition__Alternatives_1_1 ) ) )
            // InternalL.g:2581:1: ( ( rule__Addition__Alternatives_1_1 ) )
            {
            // InternalL.g:2581:1: ( ( rule__Addition__Alternatives_1_1 ) )
            // InternalL.g:2582:1: ( rule__Addition__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:2583:1: ( rule__Addition__Alternatives_1_1 )
            // InternalL.g:2583:2: rule__Addition__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalL.g:2593:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2597:1: ( rule__Addition__Group_1__2__Impl )
            // InternalL.g:2598:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalL.g:2604:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RhsAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2608:1: ( ( ( rule__Addition__RhsAssignment_1_2 ) ) )
            // InternalL.g:2609:1: ( ( rule__Addition__RhsAssignment_1_2 ) )
            {
            // InternalL.g:2609:1: ( ( rule__Addition__RhsAssignment_1_2 ) )
            // InternalL.g:2610:1: ( rule__Addition__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRhsAssignment_1_2()); 
            }
            // InternalL.g:2611:1: ( rule__Addition__RhsAssignment_1_2 )
            // InternalL.g:2611:2: rule__Addition__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalL.g:2627:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2631:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalL.g:2632:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalL.g:2639:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2643:1: ( ( rulePrimary ) )
            // InternalL.g:2644:1: ( rulePrimary )
            {
            // InternalL.g:2644:1: ( rulePrimary )
            // InternalL.g:2645:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalL.g:2656:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2660:1: ( rule__Multiplication__Group__1__Impl )
            // InternalL.g:2661:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalL.g:2667:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2671:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalL.g:2672:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalL.g:2672:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalL.g:2673:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalL.g:2674:1: ( rule__Multiplication__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=16 && LA28_0<=18)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalL.g:2674:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalL.g:2688:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2692:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalL.g:2693:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalL.g:2700:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2704:1: ( ( () ) )
            // InternalL.g:2705:1: ( () )
            {
            // InternalL.g:2705:1: ( () )
            // InternalL.g:2706:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0()); 
            }
            // InternalL.g:2707:1: ()
            // InternalL.g:2709:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiplicationLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalL.g:2719:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2723:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalL.g:2724:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalL.g:2731:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__Alternatives_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2735:1: ( ( ( rule__Multiplication__Alternatives_1_1 ) ) )
            // InternalL.g:2736:1: ( ( rule__Multiplication__Alternatives_1_1 ) )
            {
            // InternalL.g:2736:1: ( ( rule__Multiplication__Alternatives_1_1 ) )
            // InternalL.g:2737:1: ( rule__Multiplication__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:2738:1: ( rule__Multiplication__Alternatives_1_1 )
            // InternalL.g:2738:2: rule__Multiplication__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalL.g:2748:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2752:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalL.g:2753:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalL.g:2759:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RhsAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2763:1: ( ( ( rule__Multiplication__RhsAssignment_1_2 ) ) )
            // InternalL.g:2764:1: ( ( rule__Multiplication__RhsAssignment_1_2 ) )
            {
            // InternalL.g:2764:1: ( ( rule__Multiplication__RhsAssignment_1_2 ) )
            // InternalL.g:2765:1: ( rule__Multiplication__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2()); 
            }
            // InternalL.g:2766:1: ( rule__Multiplication__RhsAssignment_1_2 )
            // InternalL.g:2766:2: rule__Multiplication__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalL.g:2782:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2786:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalL.g:2787:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalL.g:2794:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2798:1: ( ( '(' ) )
            // InternalL.g:2799:1: ( '(' )
            {
            // InternalL.g:2799:1: ( '(' )
            // InternalL.g:2800:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalL.g:2813:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2817:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalL.g:2818:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalL.g:2825:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__TermAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2829:1: ( ( ( rule__Primary__TermAssignment_1_1 ) ) )
            // InternalL.g:2830:1: ( ( rule__Primary__TermAssignment_1_1 ) )
            {
            // InternalL.g:2830:1: ( ( rule__Primary__TermAssignment_1_1 ) )
            // InternalL.g:2831:1: ( rule__Primary__TermAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getTermAssignment_1_1()); 
            }
            // InternalL.g:2832:1: ( rule__Primary__TermAssignment_1_1 )
            // InternalL.g:2832:2: rule__Primary__TermAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__TermAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getTermAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalL.g:2842:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2846:1: ( rule__Primary__Group_1__2__Impl )
            // InternalL.g:2847:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalL.g:2853:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2857:1: ( ( ')' ) )
            // InternalL.g:2858:1: ( ')' )
            {
            // InternalL.g:2858:1: ( ')' )
            // InternalL.g:2859:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__GroundAddition__Group__0"
    // InternalL.g:2878:1: rule__GroundAddition__Group__0 : rule__GroundAddition__Group__0__Impl rule__GroundAddition__Group__1 ;
    public final void rule__GroundAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2882:1: ( rule__GroundAddition__Group__0__Impl rule__GroundAddition__Group__1 )
            // InternalL.g:2883:2: rule__GroundAddition__Group__0__Impl rule__GroundAddition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GroundAddition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group__0"


    // $ANTLR start "rule__GroundAddition__Group__0__Impl"
    // InternalL.g:2890:1: rule__GroundAddition__Group__0__Impl : ( ruleGroundMultiplication ) ;
    public final void rule__GroundAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2894:1: ( ( ruleGroundMultiplication ) )
            // InternalL.g:2895:1: ( ruleGroundMultiplication )
            {
            // InternalL.g:2895:1: ( ruleGroundMultiplication )
            // InternalL.g:2896:1: ruleGroundMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getGroundMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getGroundMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group__0__Impl"


    // $ANTLR start "rule__GroundAddition__Group__1"
    // InternalL.g:2907:1: rule__GroundAddition__Group__1 : rule__GroundAddition__Group__1__Impl ;
    public final void rule__GroundAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2911:1: ( rule__GroundAddition__Group__1__Impl )
            // InternalL.g:2912:2: rule__GroundAddition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group__1"


    // $ANTLR start "rule__GroundAddition__Group__1__Impl"
    // InternalL.g:2918:1: rule__GroundAddition__Group__1__Impl : ( ( rule__GroundAddition__Group_1__0 )* ) ;
    public final void rule__GroundAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2922:1: ( ( ( rule__GroundAddition__Group_1__0 )* ) )
            // InternalL.g:2923:1: ( ( rule__GroundAddition__Group_1__0 )* )
            {
            // InternalL.g:2923:1: ( ( rule__GroundAddition__Group_1__0 )* )
            // InternalL.g:2924:1: ( rule__GroundAddition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getGroup_1()); 
            }
            // InternalL.g:2925:1: ( rule__GroundAddition__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=14 && LA29_0<=15)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalL.g:2925:2: rule__GroundAddition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GroundAddition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group__1__Impl"


    // $ANTLR start "rule__GroundAddition__Group_1__0"
    // InternalL.g:2939:1: rule__GroundAddition__Group_1__0 : rule__GroundAddition__Group_1__0__Impl rule__GroundAddition__Group_1__1 ;
    public final void rule__GroundAddition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2943:1: ( rule__GroundAddition__Group_1__0__Impl rule__GroundAddition__Group_1__1 )
            // InternalL.g:2944:2: rule__GroundAddition__Group_1__0__Impl rule__GroundAddition__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__GroundAddition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__0"


    // $ANTLR start "rule__GroundAddition__Group_1__0__Impl"
    // InternalL.g:2951:1: rule__GroundAddition__Group_1__0__Impl : ( () ) ;
    public final void rule__GroundAddition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2955:1: ( ( () ) )
            // InternalL.g:2956:1: ( () )
            {
            // InternalL.g:2956:1: ( () )
            // InternalL.g:2957:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0()); 
            }
            // InternalL.g:2958:1: ()
            // InternalL.g:2960:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getGroundAdditionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__0__Impl"


    // $ANTLR start "rule__GroundAddition__Group_1__1"
    // InternalL.g:2970:1: rule__GroundAddition__Group_1__1 : rule__GroundAddition__Group_1__1__Impl rule__GroundAddition__Group_1__2 ;
    public final void rule__GroundAddition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2974:1: ( rule__GroundAddition__Group_1__1__Impl rule__GroundAddition__Group_1__2 )
            // InternalL.g:2975:2: rule__GroundAddition__Group_1__1__Impl rule__GroundAddition__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__GroundAddition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__1"


    // $ANTLR start "rule__GroundAddition__Group_1__1__Impl"
    // InternalL.g:2982:1: rule__GroundAddition__Group_1__1__Impl : ( ( rule__GroundAddition__Alternatives_1_1 ) ) ;
    public final void rule__GroundAddition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:2986:1: ( ( ( rule__GroundAddition__Alternatives_1_1 ) ) )
            // InternalL.g:2987:1: ( ( rule__GroundAddition__Alternatives_1_1 ) )
            {
            // InternalL.g:2987:1: ( ( rule__GroundAddition__Alternatives_1_1 ) )
            // InternalL.g:2988:1: ( rule__GroundAddition__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:2989:1: ( rule__GroundAddition__Alternatives_1_1 )
            // InternalL.g:2989:2: rule__GroundAddition__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__1__Impl"


    // $ANTLR start "rule__GroundAddition__Group_1__2"
    // InternalL.g:2999:1: rule__GroundAddition__Group_1__2 : rule__GroundAddition__Group_1__2__Impl ;
    public final void rule__GroundAddition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3003:1: ( rule__GroundAddition__Group_1__2__Impl )
            // InternalL.g:3004:2: rule__GroundAddition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundAddition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__2"


    // $ANTLR start "rule__GroundAddition__Group_1__2__Impl"
    // InternalL.g:3010:1: rule__GroundAddition__Group_1__2__Impl : ( ( rule__GroundAddition__RhsAssignment_1_2 ) ) ;
    public final void rule__GroundAddition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3014:1: ( ( ( rule__GroundAddition__RhsAssignment_1_2 ) ) )
            // InternalL.g:3015:1: ( ( rule__GroundAddition__RhsAssignment_1_2 ) )
            {
            // InternalL.g:3015:1: ( ( rule__GroundAddition__RhsAssignment_1_2 ) )
            // InternalL.g:3016:1: ( rule__GroundAddition__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getRhsAssignment_1_2()); 
            }
            // InternalL.g:3017:1: ( rule__GroundAddition__RhsAssignment_1_2 )
            // InternalL.g:3017:2: rule__GroundAddition__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GroundAddition__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__Group_1__2__Impl"


    // $ANTLR start "rule__GroundMultiplication__Group__0"
    // InternalL.g:3033:1: rule__GroundMultiplication__Group__0 : rule__GroundMultiplication__Group__0__Impl rule__GroundMultiplication__Group__1 ;
    public final void rule__GroundMultiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3037:1: ( rule__GroundMultiplication__Group__0__Impl rule__GroundMultiplication__Group__1 )
            // InternalL.g:3038:2: rule__GroundMultiplication__Group__0__Impl rule__GroundMultiplication__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GroundMultiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group__0"


    // $ANTLR start "rule__GroundMultiplication__Group__0__Impl"
    // InternalL.g:3045:1: rule__GroundMultiplication__Group__0__Impl : ( ruleGroundPrimary ) ;
    public final void rule__GroundMultiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3049:1: ( ( ruleGroundPrimary ) )
            // InternalL.g:3050:1: ( ruleGroundPrimary )
            {
            // InternalL.g:3050:1: ( ruleGroundPrimary )
            // InternalL.g:3051:1: ruleGroundPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getGroundPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getGroundPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group__0__Impl"


    // $ANTLR start "rule__GroundMultiplication__Group__1"
    // InternalL.g:3062:1: rule__GroundMultiplication__Group__1 : rule__GroundMultiplication__Group__1__Impl ;
    public final void rule__GroundMultiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3066:1: ( rule__GroundMultiplication__Group__1__Impl )
            // InternalL.g:3067:2: rule__GroundMultiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group__1"


    // $ANTLR start "rule__GroundMultiplication__Group__1__Impl"
    // InternalL.g:3073:1: rule__GroundMultiplication__Group__1__Impl : ( ( rule__GroundMultiplication__Group_1__0 )* ) ;
    public final void rule__GroundMultiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3077:1: ( ( ( rule__GroundMultiplication__Group_1__0 )* ) )
            // InternalL.g:3078:1: ( ( rule__GroundMultiplication__Group_1__0 )* )
            {
            // InternalL.g:3078:1: ( ( rule__GroundMultiplication__Group_1__0 )* )
            // InternalL.g:3079:1: ( rule__GroundMultiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getGroup_1()); 
            }
            // InternalL.g:3080:1: ( rule__GroundMultiplication__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=16 && LA30_0<=18)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalL.g:3080:2: rule__GroundMultiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GroundMultiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group__1__Impl"


    // $ANTLR start "rule__GroundMultiplication__Group_1__0"
    // InternalL.g:3094:1: rule__GroundMultiplication__Group_1__0 : rule__GroundMultiplication__Group_1__0__Impl rule__GroundMultiplication__Group_1__1 ;
    public final void rule__GroundMultiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3098:1: ( rule__GroundMultiplication__Group_1__0__Impl rule__GroundMultiplication__Group_1__1 )
            // InternalL.g:3099:2: rule__GroundMultiplication__Group_1__0__Impl rule__GroundMultiplication__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__GroundMultiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__0"


    // $ANTLR start "rule__GroundMultiplication__Group_1__0__Impl"
    // InternalL.g:3106:1: rule__GroundMultiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__GroundMultiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3110:1: ( ( () ) )
            // InternalL.g:3111:1: ( () )
            {
            // InternalL.g:3111:1: ( () )
            // InternalL.g:3112:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0()); 
            }
            // InternalL.g:3113:1: ()
            // InternalL.g:3115:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getGroundMultiplicationLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__0__Impl"


    // $ANTLR start "rule__GroundMultiplication__Group_1__1"
    // InternalL.g:3125:1: rule__GroundMultiplication__Group_1__1 : rule__GroundMultiplication__Group_1__1__Impl rule__GroundMultiplication__Group_1__2 ;
    public final void rule__GroundMultiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3129:1: ( rule__GroundMultiplication__Group_1__1__Impl rule__GroundMultiplication__Group_1__2 )
            // InternalL.g:3130:2: rule__GroundMultiplication__Group_1__1__Impl rule__GroundMultiplication__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__GroundMultiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__1"


    // $ANTLR start "rule__GroundMultiplication__Group_1__1__Impl"
    // InternalL.g:3137:1: rule__GroundMultiplication__Group_1__1__Impl : ( ( rule__GroundMultiplication__Alternatives_1_1 ) ) ;
    public final void rule__GroundMultiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3141:1: ( ( ( rule__GroundMultiplication__Alternatives_1_1 ) ) )
            // InternalL.g:3142:1: ( ( rule__GroundMultiplication__Alternatives_1_1 ) )
            {
            // InternalL.g:3142:1: ( ( rule__GroundMultiplication__Alternatives_1_1 ) )
            // InternalL.g:3143:1: ( rule__GroundMultiplication__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:3144:1: ( rule__GroundMultiplication__Alternatives_1_1 )
            // InternalL.g:3144:2: rule__GroundMultiplication__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__1__Impl"


    // $ANTLR start "rule__GroundMultiplication__Group_1__2"
    // InternalL.g:3154:1: rule__GroundMultiplication__Group_1__2 : rule__GroundMultiplication__Group_1__2__Impl ;
    public final void rule__GroundMultiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3158:1: ( rule__GroundMultiplication__Group_1__2__Impl )
            // InternalL.g:3159:2: rule__GroundMultiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__2"


    // $ANTLR start "rule__GroundMultiplication__Group_1__2__Impl"
    // InternalL.g:3165:1: rule__GroundMultiplication__Group_1__2__Impl : ( ( rule__GroundMultiplication__RhsAssignment_1_2 ) ) ;
    public final void rule__GroundMultiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3169:1: ( ( ( rule__GroundMultiplication__RhsAssignment_1_2 ) ) )
            // InternalL.g:3170:1: ( ( rule__GroundMultiplication__RhsAssignment_1_2 ) )
            {
            // InternalL.g:3170:1: ( ( rule__GroundMultiplication__RhsAssignment_1_2 ) )
            // InternalL.g:3171:1: ( rule__GroundMultiplication__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getRhsAssignment_1_2()); 
            }
            // InternalL.g:3172:1: ( rule__GroundMultiplication__RhsAssignment_1_2 )
            // InternalL.g:3172:2: rule__GroundMultiplication__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GroundMultiplication__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__Group_1__2__Impl"


    // $ANTLR start "rule__GroundPrimary__Group_1__0"
    // InternalL.g:3188:1: rule__GroundPrimary__Group_1__0 : rule__GroundPrimary__Group_1__0__Impl rule__GroundPrimary__Group_1__1 ;
    public final void rule__GroundPrimary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3192:1: ( rule__GroundPrimary__Group_1__0__Impl rule__GroundPrimary__Group_1__1 )
            // InternalL.g:3193:2: rule__GroundPrimary__Group_1__0__Impl rule__GroundPrimary__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GroundPrimary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundPrimary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__0"


    // $ANTLR start "rule__GroundPrimary__Group_1__0__Impl"
    // InternalL.g:3200:1: rule__GroundPrimary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__GroundPrimary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3204:1: ( ( '(' ) )
            // InternalL.g:3205:1: ( '(' )
            {
            // InternalL.g:3205:1: ( '(' )
            // InternalL.g:3206:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__0__Impl"


    // $ANTLR start "rule__GroundPrimary__Group_1__1"
    // InternalL.g:3219:1: rule__GroundPrimary__Group_1__1 : rule__GroundPrimary__Group_1__1__Impl rule__GroundPrimary__Group_1__2 ;
    public final void rule__GroundPrimary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3223:1: ( rule__GroundPrimary__Group_1__1__Impl rule__GroundPrimary__Group_1__2 )
            // InternalL.g:3224:2: rule__GroundPrimary__Group_1__1__Impl rule__GroundPrimary__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__GroundPrimary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundPrimary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__1"


    // $ANTLR start "rule__GroundPrimary__Group_1__1__Impl"
    // InternalL.g:3231:1: rule__GroundPrimary__Group_1__1__Impl : ( ( rule__GroundPrimary__TermAssignment_1_1 ) ) ;
    public final void rule__GroundPrimary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3235:1: ( ( ( rule__GroundPrimary__TermAssignment_1_1 ) ) )
            // InternalL.g:3236:1: ( ( rule__GroundPrimary__TermAssignment_1_1 ) )
            {
            // InternalL.g:3236:1: ( ( rule__GroundPrimary__TermAssignment_1_1 ) )
            // InternalL.g:3237:1: ( rule__GroundPrimary__TermAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getTermAssignment_1_1()); 
            }
            // InternalL.g:3238:1: ( rule__GroundPrimary__TermAssignment_1_1 )
            // InternalL.g:3238:2: rule__GroundPrimary__TermAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GroundPrimary__TermAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getTermAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__1__Impl"


    // $ANTLR start "rule__GroundPrimary__Group_1__2"
    // InternalL.g:3248:1: rule__GroundPrimary__Group_1__2 : rule__GroundPrimary__Group_1__2__Impl ;
    public final void rule__GroundPrimary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3252:1: ( rule__GroundPrimary__Group_1__2__Impl )
            // InternalL.g:3253:2: rule__GroundPrimary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundPrimary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__2"


    // $ANTLR start "rule__GroundPrimary__Group_1__2__Impl"
    // InternalL.g:3259:1: rule__GroundPrimary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__GroundPrimary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3263:1: ( ( ')' ) )
            // InternalL.g:3264:1: ( ')' )
            {
            // InternalL.g:3264:1: ( ')' )
            // InternalL.g:3265:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__0"
    // InternalL.g:3284:1: rule__FunctionalTerm__Group__0 : rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1 ;
    public final void rule__FunctionalTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3288:1: ( rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1 )
            // InternalL.g:3289:2: rule__FunctionalTerm__Group__0__Impl rule__FunctionalTerm__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FunctionalTerm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionalTerm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__0"


    // $ANTLR start "rule__FunctionalTerm__Group__0__Impl"
    // InternalL.g:3296:1: rule__FunctionalTerm__Group__0__Impl : ( RULE_LID ) ;
    public final void rule__FunctionalTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3300:1: ( ( RULE_LID ) )
            // InternalL.g:3301:1: ( RULE_LID )
            {
            // InternalL.g:3301:1: ( RULE_LID )
            // InternalL.g:3302:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__0__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__1"
    // InternalL.g:3313:1: rule__FunctionalTerm__Group__1 : rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2 ;
    public final void rule__FunctionalTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3317:1: ( rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2 )
            // InternalL.g:3318:2: rule__FunctionalTerm__Group__1__Impl rule__FunctionalTerm__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FunctionalTerm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionalTerm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__1"


    // $ANTLR start "rule__FunctionalTerm__Group__1__Impl"
    // InternalL.g:3325:1: rule__FunctionalTerm__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionalTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3329:1: ( ( '(' ) )
            // InternalL.g:3330:1: ( '(' )
            {
            // InternalL.g:3330:1: ( '(' )
            // InternalL.g:3331:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__1__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__2"
    // InternalL.g:3344:1: rule__FunctionalTerm__Group__2 : rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3 ;
    public final void rule__FunctionalTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3348:1: ( rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3 )
            // InternalL.g:3349:2: rule__FunctionalTerm__Group__2__Impl rule__FunctionalTerm__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__FunctionalTerm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionalTerm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__2"


    // $ANTLR start "rule__FunctionalTerm__Group__2__Impl"
    // InternalL.g:3356:1: rule__FunctionalTerm__Group__2__Impl : ( ruleTerms ) ;
    public final void rule__FunctionalTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3360:1: ( ( ruleTerms ) )
            // InternalL.g:3361:1: ( ruleTerms )
            {
            // InternalL.g:3361:1: ( ruleTerms )
            // InternalL.g:3362:1: ruleTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermAccess().getTermsParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermAccess().getTermsParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__2__Impl"


    // $ANTLR start "rule__FunctionalTerm__Group__3"
    // InternalL.g:3373:1: rule__FunctionalTerm__Group__3 : rule__FunctionalTerm__Group__3__Impl ;
    public final void rule__FunctionalTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3377:1: ( rule__FunctionalTerm__Group__3__Impl )
            // InternalL.g:3378:2: rule__FunctionalTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalTerm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__3"


    // $ANTLR start "rule__FunctionalTerm__Group__3__Impl"
    // InternalL.g:3384:1: rule__FunctionalTerm__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionalTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3388:1: ( ( ')' ) )
            // InternalL.g:3389:1: ( ')' )
            {
            // InternalL.g:3389:1: ( ')' )
            // InternalL.g:3390:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionalTermAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalTerm__Group__3__Impl"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__0"
    // InternalL.g:3411:1: rule__GroundFunctionalTerm__Group__0 : rule__GroundFunctionalTerm__Group__0__Impl rule__GroundFunctionalTerm__Group__1 ;
    public final void rule__GroundFunctionalTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3415:1: ( rule__GroundFunctionalTerm__Group__0__Impl rule__GroundFunctionalTerm__Group__1 )
            // InternalL.g:3416:2: rule__GroundFunctionalTerm__Group__0__Impl rule__GroundFunctionalTerm__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GroundFunctionalTerm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundFunctionalTerm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__0"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__0__Impl"
    // InternalL.g:3423:1: rule__GroundFunctionalTerm__Group__0__Impl : ( RULE_LID ) ;
    public final void rule__GroundFunctionalTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3427:1: ( ( RULE_LID ) )
            // InternalL.g:3428:1: ( RULE_LID )
            {
            // InternalL.g:3428:1: ( RULE_LID )
            // InternalL.g:3429:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermAccess().getLIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__0__Impl"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__1"
    // InternalL.g:3440:1: rule__GroundFunctionalTerm__Group__1 : rule__GroundFunctionalTerm__Group__1__Impl rule__GroundFunctionalTerm__Group__2 ;
    public final void rule__GroundFunctionalTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3444:1: ( rule__GroundFunctionalTerm__Group__1__Impl rule__GroundFunctionalTerm__Group__2 )
            // InternalL.g:3445:2: rule__GroundFunctionalTerm__Group__1__Impl rule__GroundFunctionalTerm__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GroundFunctionalTerm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundFunctionalTerm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__1"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__1__Impl"
    // InternalL.g:3452:1: rule__GroundFunctionalTerm__Group__1__Impl : ( '(' ) ;
    public final void rule__GroundFunctionalTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3456:1: ( ( '(' ) )
            // InternalL.g:3457:1: ( '(' )
            {
            // InternalL.g:3457:1: ( '(' )
            // InternalL.g:3458:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__1__Impl"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__2"
    // InternalL.g:3471:1: rule__GroundFunctionalTerm__Group__2 : rule__GroundFunctionalTerm__Group__2__Impl rule__GroundFunctionalTerm__Group__3 ;
    public final void rule__GroundFunctionalTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3475:1: ( rule__GroundFunctionalTerm__Group__2__Impl rule__GroundFunctionalTerm__Group__3 )
            // InternalL.g:3476:2: rule__GroundFunctionalTerm__Group__2__Impl rule__GroundFunctionalTerm__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GroundFunctionalTerm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundFunctionalTerm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__2"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__2__Impl"
    // InternalL.g:3483:1: rule__GroundFunctionalTerm__Group__2__Impl : ( ruleGroundTerms ) ;
    public final void rule__GroundFunctionalTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3487:1: ( ( ruleGroundTerms ) )
            // InternalL.g:3488:1: ( ruleGroundTerms )
            {
            // InternalL.g:3488:1: ( ruleGroundTerms )
            // InternalL.g:3489:1: ruleGroundTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermAccess().getGroundTermsParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermAccess().getGroundTermsParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__2__Impl"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__3"
    // InternalL.g:3500:1: rule__GroundFunctionalTerm__Group__3 : rule__GroundFunctionalTerm__Group__3__Impl ;
    public final void rule__GroundFunctionalTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3504:1: ( rule__GroundFunctionalTerm__Group__3__Impl )
            // InternalL.g:3505:2: rule__GroundFunctionalTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundFunctionalTerm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__3"


    // $ANTLR start "rule__GroundFunctionalTerm__Group__3__Impl"
    // InternalL.g:3511:1: rule__GroundFunctionalTerm__Group__3__Impl : ( ')' ) ;
    public final void rule__GroundFunctionalTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3515:1: ( ( ')' ) )
            // InternalL.g:3516:1: ( ')' )
            {
            // InternalL.g:3516:1: ( ')' )
            // InternalL.g:3517:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundFunctionalTermAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundFunctionalTermAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundFunctionalTerm__Group__3__Impl"


    // $ANTLR start "rule__BasicTerms__Group__0"
    // InternalL.g:3538:1: rule__BasicTerms__Group__0 : rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1 ;
    public final void rule__BasicTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3542:1: ( rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1 )
            // InternalL.g:3543:2: rule__BasicTerms__Group__0__Impl rule__BasicTerms__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BasicTerms__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicTerms__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group__0"


    // $ANTLR start "rule__BasicTerms__Group__0__Impl"
    // InternalL.g:3550:1: rule__BasicTerms__Group__0__Impl : ( ( rule__BasicTerms__CarAssignment_0 ) ) ;
    public final void rule__BasicTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3554:1: ( ( ( rule__BasicTerms__CarAssignment_0 ) ) )
            // InternalL.g:3555:1: ( ( rule__BasicTerms__CarAssignment_0 ) )
            {
            // InternalL.g:3555:1: ( ( rule__BasicTerms__CarAssignment_0 ) )
            // InternalL.g:3556:1: ( rule__BasicTerms__CarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getCarAssignment_0()); 
            }
            // InternalL.g:3557:1: ( rule__BasicTerms__CarAssignment_0 )
            // InternalL.g:3557:2: rule__BasicTerms__CarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerms__CarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getCarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group__0__Impl"


    // $ANTLR start "rule__BasicTerms__Group__1"
    // InternalL.g:3567:1: rule__BasicTerms__Group__1 : rule__BasicTerms__Group__1__Impl ;
    public final void rule__BasicTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3571:1: ( rule__BasicTerms__Group__1__Impl )
            // InternalL.g:3572:2: rule__BasicTerms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerms__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group__1"


    // $ANTLR start "rule__BasicTerms__Group__1__Impl"
    // InternalL.g:3578:1: rule__BasicTerms__Group__1__Impl : ( ( rule__BasicTerms__Group_1__0 )* ) ;
    public final void rule__BasicTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3582:1: ( ( ( rule__BasicTerms__Group_1__0 )* ) )
            // InternalL.g:3583:1: ( ( rule__BasicTerms__Group_1__0 )* )
            {
            // InternalL.g:3583:1: ( ( rule__BasicTerms__Group_1__0 )* )
            // InternalL.g:3584:1: ( rule__BasicTerms__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getGroup_1()); 
            }
            // InternalL.g:3585:1: ( rule__BasicTerms__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalL.g:3585:2: rule__BasicTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__BasicTerms__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group__1__Impl"


    // $ANTLR start "rule__BasicTerms__Group_1__0"
    // InternalL.g:3599:1: rule__BasicTerms__Group_1__0 : rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1 ;
    public final void rule__BasicTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3603:1: ( rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1 )
            // InternalL.g:3604:2: rule__BasicTerms__Group_1__0__Impl rule__BasicTerms__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__BasicTerms__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicTerms__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group_1__0"


    // $ANTLR start "rule__BasicTerms__Group_1__0__Impl"
    // InternalL.g:3611:1: rule__BasicTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__BasicTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3615:1: ( ( ',' ) )
            // InternalL.g:3616:1: ( ',' )
            {
            // InternalL.g:3616:1: ( ',' )
            // InternalL.g:3617:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group_1__0__Impl"


    // $ANTLR start "rule__BasicTerms__Group_1__1"
    // InternalL.g:3630:1: rule__BasicTerms__Group_1__1 : rule__BasicTerms__Group_1__1__Impl ;
    public final void rule__BasicTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3634:1: ( rule__BasicTerms__Group_1__1__Impl )
            // InternalL.g:3635:2: rule__BasicTerms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerms__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group_1__1"


    // $ANTLR start "rule__BasicTerms__Group_1__1__Impl"
    // InternalL.g:3641:1: rule__BasicTerms__Group_1__1__Impl : ( ( rule__BasicTerms__CdrAssignment_1_1 ) ) ;
    public final void rule__BasicTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3645:1: ( ( ( rule__BasicTerms__CdrAssignment_1_1 ) ) )
            // InternalL.g:3646:1: ( ( rule__BasicTerms__CdrAssignment_1_1 ) )
            {
            // InternalL.g:3646:1: ( ( rule__BasicTerms__CdrAssignment_1_1 ) )
            // InternalL.g:3647:1: ( rule__BasicTerms__CdrAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getCdrAssignment_1_1()); 
            }
            // InternalL.g:3648:1: ( rule__BasicTerms__CdrAssignment_1_1 )
            // InternalL.g:3648:2: rule__BasicTerms__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicTerms__CdrAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getCdrAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__Group_1__1__Impl"


    // $ANTLR start "rule__GroundTerms__Group__0"
    // InternalL.g:3662:1: rule__GroundTerms__Group__0 : rule__GroundTerms__Group__0__Impl rule__GroundTerms__Group__1 ;
    public final void rule__GroundTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3666:1: ( rule__GroundTerms__Group__0__Impl rule__GroundTerms__Group__1 )
            // InternalL.g:3667:2: rule__GroundTerms__Group__0__Impl rule__GroundTerms__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GroundTerms__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundTerms__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group__0"


    // $ANTLR start "rule__GroundTerms__Group__0__Impl"
    // InternalL.g:3674:1: rule__GroundTerms__Group__0__Impl : ( ( rule__GroundTerms__CarAssignment_0 ) ) ;
    public final void rule__GroundTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3678:1: ( ( ( rule__GroundTerms__CarAssignment_0 ) ) )
            // InternalL.g:3679:1: ( ( rule__GroundTerms__CarAssignment_0 ) )
            {
            // InternalL.g:3679:1: ( ( rule__GroundTerms__CarAssignment_0 ) )
            // InternalL.g:3680:1: ( rule__GroundTerms__CarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getCarAssignment_0()); 
            }
            // InternalL.g:3681:1: ( rule__GroundTerms__CarAssignment_0 )
            // InternalL.g:3681:2: rule__GroundTerms__CarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerms__CarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getCarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group__0__Impl"


    // $ANTLR start "rule__GroundTerms__Group__1"
    // InternalL.g:3691:1: rule__GroundTerms__Group__1 : rule__GroundTerms__Group__1__Impl ;
    public final void rule__GroundTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3695:1: ( rule__GroundTerms__Group__1__Impl )
            // InternalL.g:3696:2: rule__GroundTerms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerms__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group__1"


    // $ANTLR start "rule__GroundTerms__Group__1__Impl"
    // InternalL.g:3702:1: rule__GroundTerms__Group__1__Impl : ( ( rule__GroundTerms__Group_1__0 )* ) ;
    public final void rule__GroundTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3706:1: ( ( ( rule__GroundTerms__Group_1__0 )* ) )
            // InternalL.g:3707:1: ( ( rule__GroundTerms__Group_1__0 )* )
            {
            // InternalL.g:3707:1: ( ( rule__GroundTerms__Group_1__0 )* )
            // InternalL.g:3708:1: ( rule__GroundTerms__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getGroup_1()); 
            }
            // InternalL.g:3709:1: ( rule__GroundTerms__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalL.g:3709:2: rule__GroundTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GroundTerms__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group__1__Impl"


    // $ANTLR start "rule__GroundTerms__Group_1__0"
    // InternalL.g:3723:1: rule__GroundTerms__Group_1__0 : rule__GroundTerms__Group_1__0__Impl rule__GroundTerms__Group_1__1 ;
    public final void rule__GroundTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3727:1: ( rule__GroundTerms__Group_1__0__Impl rule__GroundTerms__Group_1__1 )
            // InternalL.g:3728:2: rule__GroundTerms__Group_1__0__Impl rule__GroundTerms__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__GroundTerms__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroundTerms__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group_1__0"


    // $ANTLR start "rule__GroundTerms__Group_1__0__Impl"
    // InternalL.g:3735:1: rule__GroundTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__GroundTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3739:1: ( ( ',' ) )
            // InternalL.g:3740:1: ( ',' )
            {
            // InternalL.g:3740:1: ( ',' )
            // InternalL.g:3741:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group_1__0__Impl"


    // $ANTLR start "rule__GroundTerms__Group_1__1"
    // InternalL.g:3754:1: rule__GroundTerms__Group_1__1 : rule__GroundTerms__Group_1__1__Impl ;
    public final void rule__GroundTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3758:1: ( rule__GroundTerms__Group_1__1__Impl )
            // InternalL.g:3759:2: rule__GroundTerms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerms__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group_1__1"


    // $ANTLR start "rule__GroundTerms__Group_1__1__Impl"
    // InternalL.g:3765:1: rule__GroundTerms__Group_1__1__Impl : ( ( rule__GroundTerms__CdrAssignment_1_1 ) ) ;
    public final void rule__GroundTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3769:1: ( ( ( rule__GroundTerms__CdrAssignment_1_1 ) ) )
            // InternalL.g:3770:1: ( ( rule__GroundTerms__CdrAssignment_1_1 ) )
            {
            // InternalL.g:3770:1: ( ( rule__GroundTerms__CdrAssignment_1_1 ) )
            // InternalL.g:3771:1: ( rule__GroundTerms__CdrAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getCdrAssignment_1_1()); 
            }
            // InternalL.g:3772:1: ( rule__GroundTerms__CdrAssignment_1_1 )
            // InternalL.g:3772:2: rule__GroundTerms__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GroundTerms__CdrAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getCdrAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__Group_1__1__Impl"


    // $ANTLR start "rule__UniversalQuantifiedTerm__Group__0"
    // InternalL.g:3786:1: rule__UniversalQuantifiedTerm__Group__0 : rule__UniversalQuantifiedTerm__Group__0__Impl rule__UniversalQuantifiedTerm__Group__1 ;
    public final void rule__UniversalQuantifiedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3790:1: ( rule__UniversalQuantifiedTerm__Group__0__Impl rule__UniversalQuantifiedTerm__Group__1 )
            // InternalL.g:3791:2: rule__UniversalQuantifiedTerm__Group__0__Impl rule__UniversalQuantifiedTerm__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UniversalQuantifiedTerm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UniversalQuantifiedTerm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalQuantifiedTerm__Group__0"


    // $ANTLR start "rule__UniversalQuantifiedTerm__Group__0__Impl"
    // InternalL.g:3798:1: rule__UniversalQuantifiedTerm__Group__0__Impl : ( 'every' ) ;
    public final void rule__UniversalQuantifiedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3802:1: ( ( 'every' ) )
            // InternalL.g:3803:1: ( 'every' )
            {
            // InternalL.g:3803:1: ( 'every' )
            // InternalL.g:3804:1: 'every'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalQuantifiedTermAccess().getEveryKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalQuantifiedTermAccess().getEveryKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalQuantifiedTerm__Group__0__Impl"


    // $ANTLR start "rule__UniversalQuantifiedTerm__Group__1"
    // InternalL.g:3817:1: rule__UniversalQuantifiedTerm__Group__1 : rule__UniversalQuantifiedTerm__Group__1__Impl ;
    public final void rule__UniversalQuantifiedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3821:1: ( rule__UniversalQuantifiedTerm__Group__1__Impl )
            // InternalL.g:3822:2: rule__UniversalQuantifiedTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniversalQuantifiedTerm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalQuantifiedTerm__Group__1"


    // $ANTLR start "rule__UniversalQuantifiedTerm__Group__1__Impl"
    // InternalL.g:3828:1: rule__UniversalQuantifiedTerm__Group__1__Impl : ( ( rule__UniversalQuantifiedTerm__NameAssignment_1 ) ) ;
    public final void rule__UniversalQuantifiedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3832:1: ( ( ( rule__UniversalQuantifiedTerm__NameAssignment_1 ) ) )
            // InternalL.g:3833:1: ( ( rule__UniversalQuantifiedTerm__NameAssignment_1 ) )
            {
            // InternalL.g:3833:1: ( ( rule__UniversalQuantifiedTerm__NameAssignment_1 ) )
            // InternalL.g:3834:1: ( rule__UniversalQuantifiedTerm__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalQuantifiedTermAccess().getNameAssignment_1()); 
            }
            // InternalL.g:3835:1: ( rule__UniversalQuantifiedTerm__NameAssignment_1 )
            // InternalL.g:3835:2: rule__UniversalQuantifiedTerm__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UniversalQuantifiedTerm__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalQuantifiedTermAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalQuantifiedTerm__Group__1__Impl"


    // $ANTLR start "rule__ExistentialQuantifiedTerm__Group__0"
    // InternalL.g:3849:1: rule__ExistentialQuantifiedTerm__Group__0 : rule__ExistentialQuantifiedTerm__Group__0__Impl rule__ExistentialQuantifiedTerm__Group__1 ;
    public final void rule__ExistentialQuantifiedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3853:1: ( rule__ExistentialQuantifiedTerm__Group__0__Impl rule__ExistentialQuantifiedTerm__Group__1 )
            // InternalL.g:3854:2: rule__ExistentialQuantifiedTerm__Group__0__Impl rule__ExistentialQuantifiedTerm__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExistentialQuantifiedTerm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExistentialQuantifiedTerm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistentialQuantifiedTerm__Group__0"


    // $ANTLR start "rule__ExistentialQuantifiedTerm__Group__0__Impl"
    // InternalL.g:3861:1: rule__ExistentialQuantifiedTerm__Group__0__Impl : ( 'some' ) ;
    public final void rule__ExistentialQuantifiedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3865:1: ( ( 'some' ) )
            // InternalL.g:3866:1: ( 'some' )
            {
            // InternalL.g:3866:1: ( 'some' )
            // InternalL.g:3867:1: 'some'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistentialQuantifiedTermAccess().getSomeKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistentialQuantifiedTermAccess().getSomeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistentialQuantifiedTerm__Group__0__Impl"


    // $ANTLR start "rule__ExistentialQuantifiedTerm__Group__1"
    // InternalL.g:3880:1: rule__ExistentialQuantifiedTerm__Group__1 : rule__ExistentialQuantifiedTerm__Group__1__Impl ;
    public final void rule__ExistentialQuantifiedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3884:1: ( rule__ExistentialQuantifiedTerm__Group__1__Impl )
            // InternalL.g:3885:2: rule__ExistentialQuantifiedTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistentialQuantifiedTerm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistentialQuantifiedTerm__Group__1"


    // $ANTLR start "rule__ExistentialQuantifiedTerm__Group__1__Impl"
    // InternalL.g:3891:1: rule__ExistentialQuantifiedTerm__Group__1__Impl : ( ( rule__ExistentialQuantifiedTerm__NameAssignment_1 ) ) ;
    public final void rule__ExistentialQuantifiedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3895:1: ( ( ( rule__ExistentialQuantifiedTerm__NameAssignment_1 ) ) )
            // InternalL.g:3896:1: ( ( rule__ExistentialQuantifiedTerm__NameAssignment_1 ) )
            {
            // InternalL.g:3896:1: ( ( rule__ExistentialQuantifiedTerm__NameAssignment_1 ) )
            // InternalL.g:3897:1: ( rule__ExistentialQuantifiedTerm__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistentialQuantifiedTermAccess().getNameAssignment_1()); 
            }
            // InternalL.g:3898:1: ( rule__ExistentialQuantifiedTerm__NameAssignment_1 )
            // InternalL.g:3898:2: rule__ExistentialQuantifiedTerm__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistentialQuantifiedTerm__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistentialQuantifiedTermAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistentialQuantifiedTerm__Group__1__Impl"


    // $ANTLR start "rule__Terms__Group__0"
    // InternalL.g:3912:1: rule__Terms__Group__0 : rule__Terms__Group__0__Impl rule__Terms__Group__1 ;
    public final void rule__Terms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3916:1: ( rule__Terms__Group__0__Impl rule__Terms__Group__1 )
            // InternalL.g:3917:2: rule__Terms__Group__0__Impl rule__Terms__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Terms__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terms__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group__0"


    // $ANTLR start "rule__Terms__Group__0__Impl"
    // InternalL.g:3924:1: rule__Terms__Group__0__Impl : ( ( rule__Terms__CarAssignment_0 ) ) ;
    public final void rule__Terms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3928:1: ( ( ( rule__Terms__CarAssignment_0 ) ) )
            // InternalL.g:3929:1: ( ( rule__Terms__CarAssignment_0 ) )
            {
            // InternalL.g:3929:1: ( ( rule__Terms__CarAssignment_0 ) )
            // InternalL.g:3930:1: ( rule__Terms__CarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCarAssignment_0()); 
            }
            // InternalL.g:3931:1: ( rule__Terms__CarAssignment_0 )
            // InternalL.g:3931:2: rule__Terms__CarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Terms__CarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getCarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group__0__Impl"


    // $ANTLR start "rule__Terms__Group__1"
    // InternalL.g:3941:1: rule__Terms__Group__1 : rule__Terms__Group__1__Impl ;
    public final void rule__Terms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3945:1: ( rule__Terms__Group__1__Impl )
            // InternalL.g:3946:2: rule__Terms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terms__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group__1"


    // $ANTLR start "rule__Terms__Group__1__Impl"
    // InternalL.g:3952:1: rule__Terms__Group__1__Impl : ( ( rule__Terms__Group_1__0 )* ) ;
    public final void rule__Terms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3956:1: ( ( ( rule__Terms__Group_1__0 )* ) )
            // InternalL.g:3957:1: ( ( rule__Terms__Group_1__0 )* )
            {
            // InternalL.g:3957:1: ( ( rule__Terms__Group_1__0 )* )
            // InternalL.g:3958:1: ( rule__Terms__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getGroup_1()); 
            }
            // InternalL.g:3959:1: ( rule__Terms__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalL.g:3959:2: rule__Terms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Terms__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group__1__Impl"


    // $ANTLR start "rule__Terms__Group_1__0"
    // InternalL.g:3973:1: rule__Terms__Group_1__0 : rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 ;
    public final void rule__Terms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3977:1: ( rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 )
            // InternalL.g:3978:2: rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Terms__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terms__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group_1__0"


    // $ANTLR start "rule__Terms__Group_1__0__Impl"
    // InternalL.g:3985:1: rule__Terms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Terms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:3989:1: ( ( ',' ) )
            // InternalL.g:3990:1: ( ',' )
            {
            // InternalL.g:3990:1: ( ',' )
            // InternalL.g:3991:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group_1__0__Impl"


    // $ANTLR start "rule__Terms__Group_1__1"
    // InternalL.g:4004:1: rule__Terms__Group_1__1 : rule__Terms__Group_1__1__Impl ;
    public final void rule__Terms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4008:1: ( rule__Terms__Group_1__1__Impl )
            // InternalL.g:4009:2: rule__Terms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terms__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group_1__1"


    // $ANTLR start "rule__Terms__Group_1__1__Impl"
    // InternalL.g:4015:1: rule__Terms__Group_1__1__Impl : ( ( rule__Terms__CdrAssignment_1_1 ) ) ;
    public final void rule__Terms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4019:1: ( ( ( rule__Terms__CdrAssignment_1_1 ) ) )
            // InternalL.g:4020:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            {
            // InternalL.g:4020:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            // InternalL.g:4021:1: ( rule__Terms__CdrAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCdrAssignment_1_1()); 
            }
            // InternalL.g:4022:1: ( rule__Terms__CdrAssignment_1_1 )
            // InternalL.g:4022:2: rule__Terms__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Terms__CdrAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getCdrAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__Group_1__1__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__0"
    // InternalL.g:4036:1: rule__ConstantDeclaration__Group__0 : rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1 ;
    public final void rule__ConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4040:1: ( rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1 )
            // InternalL.g:4041:2: rule__ConstantDeclaration__Group__0__Impl rule__ConstantDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ConstantDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__0"


    // $ANTLR start "rule__ConstantDeclaration__Group__0__Impl"
    // InternalL.g:4048:1: rule__ConstantDeclaration__Group__0__Impl : ( 'const' ) ;
    public final void rule__ConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4052:1: ( ( 'const' ) )
            // InternalL.g:4053:1: ( 'const' )
            {
            // InternalL.g:4053:1: ( 'const' )
            // InternalL.g:4054:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getConstKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__1"
    // InternalL.g:4067:1: rule__ConstantDeclaration__Group__1 : rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2 ;
    public final void rule__ConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4071:1: ( rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2 )
            // InternalL.g:4072:2: rule__ConstantDeclaration__Group__1__Impl rule__ConstantDeclaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ConstantDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__1"


    // $ANTLR start "rule__ConstantDeclaration__Group__1__Impl"
    // InternalL.g:4079:1: rule__ConstantDeclaration__Group__1__Impl : ( ( rule__ConstantDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4083:1: ( ( ( rule__ConstantDeclaration__NameAssignment_1 ) ) )
            // InternalL.g:4084:1: ( ( rule__ConstantDeclaration__NameAssignment_1 ) )
            {
            // InternalL.g:4084:1: ( ( rule__ConstantDeclaration__NameAssignment_1 ) )
            // InternalL.g:4085:1: ( rule__ConstantDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalL.g:4086:1: ( rule__ConstantDeclaration__NameAssignment_1 )
            // InternalL.g:4086:2: rule__ConstantDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__2"
    // InternalL.g:4096:1: rule__ConstantDeclaration__Group__2 : rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3 ;
    public final void rule__ConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4100:1: ( rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3 )
            // InternalL.g:4101:2: rule__ConstantDeclaration__Group__2__Impl rule__ConstantDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ConstantDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__2"


    // $ANTLR start "rule__ConstantDeclaration__Group__2__Impl"
    // InternalL.g:4108:1: rule__ConstantDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__ConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4112:1: ( ( '=' ) )
            // InternalL.g:4113:1: ( '=' )
            {
            // InternalL.g:4113:1: ( '=' )
            // InternalL.g:4114:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__3"
    // InternalL.g:4127:1: rule__ConstantDeclaration__Group__3 : rule__ConstantDeclaration__Group__3__Impl rule__ConstantDeclaration__Group__4 ;
    public final void rule__ConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4131:1: ( rule__ConstantDeclaration__Group__3__Impl rule__ConstantDeclaration__Group__4 )
            // InternalL.g:4132:2: rule__ConstantDeclaration__Group__3__Impl rule__ConstantDeclaration__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ConstantDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__3"


    // $ANTLR start "rule__ConstantDeclaration__Group__3__Impl"
    // InternalL.g:4139:1: rule__ConstantDeclaration__Group__3__Impl : ( ( rule__ConstantDeclaration__CvAssignment_3 ) ) ;
    public final void rule__ConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4143:1: ( ( ( rule__ConstantDeclaration__CvAssignment_3 ) ) )
            // InternalL.g:4144:1: ( ( rule__ConstantDeclaration__CvAssignment_3 ) )
            {
            // InternalL.g:4144:1: ( ( rule__ConstantDeclaration__CvAssignment_3 ) )
            // InternalL.g:4145:1: ( rule__ConstantDeclaration__CvAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getCvAssignment_3()); 
            }
            // InternalL.g:4146:1: ( rule__ConstantDeclaration__CvAssignment_3 )
            // InternalL.g:4146:2: rule__ConstantDeclaration__CvAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__CvAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getCvAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ConstantDeclaration__Group__4"
    // InternalL.g:4156:1: rule__ConstantDeclaration__Group__4 : rule__ConstantDeclaration__Group__4__Impl ;
    public final void rule__ConstantDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4160:1: ( rule__ConstantDeclaration__Group__4__Impl )
            // InternalL.g:4161:2: rule__ConstantDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__4"


    // $ANTLR start "rule__ConstantDeclaration__Group__4__Impl"
    // InternalL.g:4167:1: rule__ConstantDeclaration__Group__4__Impl : ( '.' ) ;
    public final void rule__ConstantDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4171:1: ( ( '.' ) )
            // InternalL.g:4172:1: ( '.' )
            {
            // InternalL.g:4172:1: ( '.' )
            // InternalL.g:4173:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getFullStopKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // InternalL.g:4196:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4200:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // InternalL.g:4201:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // InternalL.g:4208:1: rule__TypeDeclaration__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4212:1: ( ( 'type' ) )
            // InternalL.g:4213:1: ( 'type' )
            {
            // InternalL.g:4213:1: ( 'type' )
            // InternalL.g:4214:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // InternalL.g:4227:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4231:1: ( rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 )
            // InternalL.g:4232:2: rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // InternalL.g:4239:1: rule__TypeDeclaration__Group__1__Impl : ( ( rule__TypeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4243:1: ( ( ( rule__TypeDeclaration__NameAssignment_1 ) ) )
            // InternalL.g:4244:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            {
            // InternalL.g:4244:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            // InternalL.g:4245:1: ( rule__TypeDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalL.g:4246:1: ( rule__TypeDeclaration__NameAssignment_1 )
            // InternalL.g:4246:2: rule__TypeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__2"
    // InternalL.g:4256:1: rule__TypeDeclaration__Group__2 : rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 ;
    public final void rule__TypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4260:1: ( rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 )
            // InternalL.g:4261:2: rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TypeDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2"


    // $ANTLR start "rule__TypeDeclaration__Group__2__Impl"
    // InternalL.g:4268:1: rule__TypeDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4272:1: ( ( '=' ) )
            // InternalL.g:4273:1: ( '=' )
            {
            // InternalL.g:4273:1: ( '=' )
            // InternalL.g:4274:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__3"
    // InternalL.g:4287:1: rule__TypeDeclaration__Group__3 : rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 ;
    public final void rule__TypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4291:1: ( rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 )
            // InternalL.g:4292:2: rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__TypeDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3"


    // $ANTLR start "rule__TypeDeclaration__Group__3__Impl"
    // InternalL.g:4299:1: rule__TypeDeclaration__Group__3__Impl : ( ( rule__TypeDeclaration__ExpAssignment_3 ) ) ;
    public final void rule__TypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4303:1: ( ( ( rule__TypeDeclaration__ExpAssignment_3 ) ) )
            // InternalL.g:4304:1: ( ( rule__TypeDeclaration__ExpAssignment_3 ) )
            {
            // InternalL.g:4304:1: ( ( rule__TypeDeclaration__ExpAssignment_3 ) )
            // InternalL.g:4305:1: ( rule__TypeDeclaration__ExpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getExpAssignment_3()); 
            }
            // InternalL.g:4306:1: ( rule__TypeDeclaration__ExpAssignment_3 )
            // InternalL.g:4306:2: rule__TypeDeclaration__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__ExpAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getExpAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__4"
    // InternalL.g:4316:1: rule__TypeDeclaration__Group__4 : rule__TypeDeclaration__Group__4__Impl ;
    public final void rule__TypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4320:1: ( rule__TypeDeclaration__Group__4__Impl )
            // InternalL.g:4321:2: rule__TypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4"


    // $ANTLR start "rule__TypeDeclaration__Group__4__Impl"
    // InternalL.g:4327:1: rule__TypeDeclaration__Group__4__Impl : ( '.' ) ;
    public final void rule__TypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4331:1: ( ( '.' ) )
            // InternalL.g:4332:1: ( '.' )
            {
            // InternalL.g:4332:1: ( '.' )
            // InternalL.g:4333:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getFullStopKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalL.g:4356:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4360:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalL.g:4361:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Set__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalL.g:4368:1: rule__Set__Group__0__Impl : ( ( rule__Set__LhsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4372:1: ( ( ( rule__Set__LhsAssignment_0 ) ) )
            // InternalL.g:4373:1: ( ( rule__Set__LhsAssignment_0 ) )
            {
            // InternalL.g:4373:1: ( ( rule__Set__LhsAssignment_0 ) )
            // InternalL.g:4374:1: ( rule__Set__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getLhsAssignment_0()); 
            }
            // InternalL.g:4375:1: ( rule__Set__LhsAssignment_0 )
            // InternalL.g:4375:2: rule__Set__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Set__LhsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getLhsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalL.g:4385:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4389:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalL.g:4390:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Set__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalL.g:4397:1: rule__Set__Group__1__Impl : ( ( rule__Set__TermsAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4401:1: ( ( ( rule__Set__TermsAssignment_1 ) ) )
            // InternalL.g:4402:1: ( ( rule__Set__TermsAssignment_1 ) )
            {
            // InternalL.g:4402:1: ( ( rule__Set__TermsAssignment_1 ) )
            // InternalL.g:4403:1: ( rule__Set__TermsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getTermsAssignment_1()); 
            }
            // InternalL.g:4404:1: ( rule__Set__TermsAssignment_1 )
            // InternalL.g:4404:2: rule__Set__TermsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__TermsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getTermsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalL.g:4414:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4418:1: ( rule__Set__Group__2__Impl )
            // InternalL.g:4419:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalL.g:4425:1: rule__Set__Group__2__Impl : ( '}' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4429:1: ( ( '}' ) )
            // InternalL.g:4430:1: ( '}' )
            {
            // InternalL.g:4430:1: ( '}' )
            // InternalL.g:4431:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalL.g:4450:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4454:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalL.g:4455:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalL.g:4462:1: rule__Range__Group__0__Impl : ( '{' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4466:1: ( ( '{' ) )
            // InternalL.g:4467:1: ( '{' )
            {
            // InternalL.g:4467:1: ( '{' )
            // InternalL.g:4468:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalL.g:4481:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4485:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalL.g:4486:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalL.g:4493:1: rule__Range__Group__1__Impl : ( ( rule__Range__LhsAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4497:1: ( ( ( rule__Range__LhsAssignment_1 ) ) )
            // InternalL.g:4498:1: ( ( rule__Range__LhsAssignment_1 ) )
            {
            // InternalL.g:4498:1: ( ( rule__Range__LhsAssignment_1 ) )
            // InternalL.g:4499:1: ( rule__Range__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLhsAssignment_1()); 
            }
            // InternalL.g:4500:1: ( rule__Range__LhsAssignment_1 )
            // InternalL.g:4500:2: rule__Range__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__LhsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLhsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalL.g:4510:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4514:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalL.g:4515:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalL.g:4522:1: rule__Range__Group__2__Impl : ( '.' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4526:1: ( ( '.' ) )
            // InternalL.g:4527:1: ( '.' )
            {
            // InternalL.g:4527:1: ( '.' )
            // InternalL.g:4528:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFullStopKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalL.g:4541:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4545:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalL.g:4546:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Range__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalL.g:4553:1: rule__Range__Group__3__Impl : ( '.' ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4557:1: ( ( '.' ) )
            // InternalL.g:4558:1: ( '.' )
            {
            // InternalL.g:4558:1: ( '.' )
            // InternalL.g:4559:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getFullStopKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getFullStopKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalL.g:4572:1: rule__Range__Group__4 : rule__Range__Group__4__Impl rule__Range__Group__5 ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4576:1: ( rule__Range__Group__4__Impl rule__Range__Group__5 )
            // InternalL.g:4577:2: rule__Range__Group__4__Impl rule__Range__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Range__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalL.g:4584:1: rule__Range__Group__4__Impl : ( ( rule__Range__RhsAssignment_4 ) ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4588:1: ( ( ( rule__Range__RhsAssignment_4 ) ) )
            // InternalL.g:4589:1: ( ( rule__Range__RhsAssignment_4 ) )
            {
            // InternalL.g:4589:1: ( ( rule__Range__RhsAssignment_4 ) )
            // InternalL.g:4590:1: ( rule__Range__RhsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getRhsAssignment_4()); 
            }
            // InternalL.g:4591:1: ( rule__Range__RhsAssignment_4 )
            // InternalL.g:4591:2: rule__Range__RhsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Range__RhsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getRhsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Range__Group__5"
    // InternalL.g:4601:1: rule__Range__Group__5 : rule__Range__Group__5__Impl ;
    public final void rule__Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4605:1: ( rule__Range__Group__5__Impl )
            // InternalL.g:4606:2: rule__Range__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5"


    // $ANTLR start "rule__Range__Group__5__Impl"
    // InternalL.g:4612:1: rule__Range__Group__5__Impl : ( '}' ) ;
    public final void rule__Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4616:1: ( ( '}' ) )
            // InternalL.g:4617:1: ( '}' )
            {
            // InternalL.g:4617:1: ( '}' )
            // InternalL.g:4618:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5__Impl"


    // $ANTLR start "rule__SetConstruct__Group__0"
    // InternalL.g:4643:1: rule__SetConstruct__Group__0 : rule__SetConstruct__Group__0__Impl rule__SetConstruct__Group__1 ;
    public final void rule__SetConstruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4647:1: ( rule__SetConstruct__Group__0__Impl rule__SetConstruct__Group__1 )
            // InternalL.g:4648:2: rule__SetConstruct__Group__0__Impl rule__SetConstruct__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SetConstruct__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetConstruct__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__0"


    // $ANTLR start "rule__SetConstruct__Group__0__Impl"
    // InternalL.g:4655:1: rule__SetConstruct__Group__0__Impl : ( ( rule__SetConstruct__LhsAssignment_0 ) ) ;
    public final void rule__SetConstruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4659:1: ( ( ( rule__SetConstruct__LhsAssignment_0 ) ) )
            // InternalL.g:4660:1: ( ( rule__SetConstruct__LhsAssignment_0 ) )
            {
            // InternalL.g:4660:1: ( ( rule__SetConstruct__LhsAssignment_0 ) )
            // InternalL.g:4661:1: ( rule__SetConstruct__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getLhsAssignment_0()); 
            }
            // InternalL.g:4662:1: ( rule__SetConstruct__LhsAssignment_0 )
            // InternalL.g:4662:2: rule__SetConstruct__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SetConstruct__LhsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getLhsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__0__Impl"


    // $ANTLR start "rule__SetConstruct__Group__1"
    // InternalL.g:4672:1: rule__SetConstruct__Group__1 : rule__SetConstruct__Group__1__Impl rule__SetConstruct__Group__2 ;
    public final void rule__SetConstruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4676:1: ( rule__SetConstruct__Group__1__Impl rule__SetConstruct__Group__2 )
            // InternalL.g:4677:2: rule__SetConstruct__Group__1__Impl rule__SetConstruct__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SetConstruct__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetConstruct__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__1"


    // $ANTLR start "rule__SetConstruct__Group__1__Impl"
    // InternalL.g:4684:1: rule__SetConstruct__Group__1__Impl : ( 'where' ) ;
    public final void rule__SetConstruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4688:1: ( ( 'where' ) )
            // InternalL.g:4689:1: ( 'where' )
            {
            // InternalL.g:4689:1: ( 'where' )
            // InternalL.g:4690:1: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getWhereKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getWhereKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__1__Impl"


    // $ANTLR start "rule__SetConstruct__Group__2"
    // InternalL.g:4703:1: rule__SetConstruct__Group__2 : rule__SetConstruct__Group__2__Impl ;
    public final void rule__SetConstruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4707:1: ( rule__SetConstruct__Group__2__Impl )
            // InternalL.g:4708:2: rule__SetConstruct__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetConstruct__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__2"


    // $ANTLR start "rule__SetConstruct__Group__2__Impl"
    // InternalL.g:4714:1: rule__SetConstruct__Group__2__Impl : ( ( rule__SetConstruct__RhsAssignment_2 ) ) ;
    public final void rule__SetConstruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4718:1: ( ( ( rule__SetConstruct__RhsAssignment_2 ) ) )
            // InternalL.g:4719:1: ( ( rule__SetConstruct__RhsAssignment_2 ) )
            {
            // InternalL.g:4719:1: ( ( rule__SetConstruct__RhsAssignment_2 ) )
            // InternalL.g:4720:1: ( rule__SetConstruct__RhsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getRhsAssignment_2()); 
            }
            // InternalL.g:4721:1: ( rule__SetConstruct__RhsAssignment_2 )
            // InternalL.g:4721:2: rule__SetConstruct__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetConstruct__RhsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getRhsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__Group__2__Impl"


    // $ANTLR start "rule__TVars__Group__0"
    // InternalL.g:4737:1: rule__TVars__Group__0 : rule__TVars__Group__0__Impl rule__TVars__Group__1 ;
    public final void rule__TVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4741:1: ( rule__TVars__Group__0__Impl rule__TVars__Group__1 )
            // InternalL.g:4742:2: rule__TVars__Group__0__Impl rule__TVars__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TVars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TVars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group__0"


    // $ANTLR start "rule__TVars__Group__0__Impl"
    // InternalL.g:4749:1: rule__TVars__Group__0__Impl : ( ( rule__TVars__CarAssignment_0 ) ) ;
    public final void rule__TVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4753:1: ( ( ( rule__TVars__CarAssignment_0 ) ) )
            // InternalL.g:4754:1: ( ( rule__TVars__CarAssignment_0 ) )
            {
            // InternalL.g:4754:1: ( ( rule__TVars__CarAssignment_0 ) )
            // InternalL.g:4755:1: ( rule__TVars__CarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getCarAssignment_0()); 
            }
            // InternalL.g:4756:1: ( rule__TVars__CarAssignment_0 )
            // InternalL.g:4756:2: rule__TVars__CarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TVars__CarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getCarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group__0__Impl"


    // $ANTLR start "rule__TVars__Group__1"
    // InternalL.g:4766:1: rule__TVars__Group__1 : rule__TVars__Group__1__Impl ;
    public final void rule__TVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4770:1: ( rule__TVars__Group__1__Impl )
            // InternalL.g:4771:2: rule__TVars__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TVars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group__1"


    // $ANTLR start "rule__TVars__Group__1__Impl"
    // InternalL.g:4777:1: rule__TVars__Group__1__Impl : ( ( rule__TVars__Group_1__0 )* ) ;
    public final void rule__TVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4781:1: ( ( ( rule__TVars__Group_1__0 )* ) )
            // InternalL.g:4782:1: ( ( rule__TVars__Group_1__0 )* )
            {
            // InternalL.g:4782:1: ( ( rule__TVars__Group_1__0 )* )
            // InternalL.g:4783:1: ( rule__TVars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getGroup_1()); 
            }
            // InternalL.g:4784:1: ( rule__TVars__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalL.g:4784:2: rule__TVars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TVars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group__1__Impl"


    // $ANTLR start "rule__TVars__Group_1__0"
    // InternalL.g:4798:1: rule__TVars__Group_1__0 : rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1 ;
    public final void rule__TVars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4802:1: ( rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1 )
            // InternalL.g:4803:2: rule__TVars__Group_1__0__Impl rule__TVars__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__TVars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TVars__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group_1__0"


    // $ANTLR start "rule__TVars__Group_1__0__Impl"
    // InternalL.g:4810:1: rule__TVars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TVars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4814:1: ( ( ',' ) )
            // InternalL.g:4815:1: ( ',' )
            {
            // InternalL.g:4815:1: ( ',' )
            // InternalL.g:4816:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group_1__0__Impl"


    // $ANTLR start "rule__TVars__Group_1__1"
    // InternalL.g:4829:1: rule__TVars__Group_1__1 : rule__TVars__Group_1__1__Impl ;
    public final void rule__TVars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4833:1: ( rule__TVars__Group_1__1__Impl )
            // InternalL.g:4834:2: rule__TVars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TVars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group_1__1"


    // $ANTLR start "rule__TVars__Group_1__1__Impl"
    // InternalL.g:4840:1: rule__TVars__Group_1__1__Impl : ( ( rule__TVars__CdrAssignment_1_1 ) ) ;
    public final void rule__TVars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4844:1: ( ( ( rule__TVars__CdrAssignment_1_1 ) ) )
            // InternalL.g:4845:1: ( ( rule__TVars__CdrAssignment_1_1 ) )
            {
            // InternalL.g:4845:1: ( ( rule__TVars__CdrAssignment_1_1 ) )
            // InternalL.g:4846:1: ( rule__TVars__CdrAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getCdrAssignment_1_1()); 
            }
            // InternalL.g:4847:1: ( rule__TVars__CdrAssignment_1_1 )
            // InternalL.g:4847:2: rule__TVars__CdrAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TVars__CdrAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getCdrAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__Group_1__1__Impl"


    // $ANTLR start "rule__TVar__Group__0"
    // InternalL.g:4861:1: rule__TVar__Group__0 : rule__TVar__Group__0__Impl rule__TVar__Group__1 ;
    public final void rule__TVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4865:1: ( rule__TVar__Group__0__Impl rule__TVar__Group__1 )
            // InternalL.g:4866:2: rule__TVar__Group__0__Impl rule__TVar__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TVar__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__0"


    // $ANTLR start "rule__TVar__Group__0__Impl"
    // InternalL.g:4873:1: rule__TVar__Group__0__Impl : ( ( rule__TVar__VarAssignment_0 ) ) ;
    public final void rule__TVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4877:1: ( ( ( rule__TVar__VarAssignment_0 ) ) )
            // InternalL.g:4878:1: ( ( rule__TVar__VarAssignment_0 ) )
            {
            // InternalL.g:4878:1: ( ( rule__TVar__VarAssignment_0 ) )
            // InternalL.g:4879:1: ( rule__TVar__VarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getVarAssignment_0()); 
            }
            // InternalL.g:4880:1: ( rule__TVar__VarAssignment_0 )
            // InternalL.g:4880:2: rule__TVar__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TVar__VarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getVarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__0__Impl"


    // $ANTLR start "rule__TVar__Group__1"
    // InternalL.g:4890:1: rule__TVar__Group__1 : rule__TVar__Group__1__Impl rule__TVar__Group__2 ;
    public final void rule__TVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4894:1: ( rule__TVar__Group__1__Impl rule__TVar__Group__2 )
            // InternalL.g:4895:2: rule__TVar__Group__1__Impl rule__TVar__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TVar__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__1"


    // $ANTLR start "rule__TVar__Group__1__Impl"
    // InternalL.g:4902:1: rule__TVar__Group__1__Impl : ( 'in' ) ;
    public final void rule__TVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4906:1: ( ( 'in' ) )
            // InternalL.g:4907:1: ( 'in' )
            {
            // InternalL.g:4907:1: ( 'in' )
            // InternalL.g:4908:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getInKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getInKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__1__Impl"


    // $ANTLR start "rule__TVar__Group__2"
    // InternalL.g:4921:1: rule__TVar__Group__2 : rule__TVar__Group__2__Impl ;
    public final void rule__TVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4925:1: ( rule__TVar__Group__2__Impl )
            // InternalL.g:4926:2: rule__TVar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TVar__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__2"


    // $ANTLR start "rule__TVar__Group__2__Impl"
    // InternalL.g:4932:1: rule__TVar__Group__2__Impl : ( ( rule__TVar__IdAssignment_2 ) ) ;
    public final void rule__TVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4936:1: ( ( ( rule__TVar__IdAssignment_2 ) ) )
            // InternalL.g:4937:1: ( ( rule__TVar__IdAssignment_2 ) )
            {
            // InternalL.g:4937:1: ( ( rule__TVar__IdAssignment_2 ) )
            // InternalL.g:4938:1: ( rule__TVar__IdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getIdAssignment_2()); 
            }
            // InternalL.g:4939:1: ( rule__TVar__IdAssignment_2 )
            // InternalL.g:4939:2: rule__TVar__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TVar__IdAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getIdAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__Group__2__Impl"


    // $ANTLR start "rule__SetAddition__Group__0"
    // InternalL.g:4955:1: rule__SetAddition__Group__0 : rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1 ;
    public final void rule__SetAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4959:1: ( rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1 )
            // InternalL.g:4960:2: rule__SetAddition__Group__0__Impl rule__SetAddition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SetAddition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group__0"


    // $ANTLR start "rule__SetAddition__Group__0__Impl"
    // InternalL.g:4967:1: rule__SetAddition__Group__0__Impl : ( ruleSetMultiplication ) ;
    public final void rule__SetAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4971:1: ( ( ruleSetMultiplication ) )
            // InternalL.g:4972:1: ( ruleSetMultiplication )
            {
            // InternalL.g:4972:1: ( ruleSetMultiplication )
            // InternalL.g:4973:1: ruleSetMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getSetMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group__0__Impl"


    // $ANTLR start "rule__SetAddition__Group__1"
    // InternalL.g:4984:1: rule__SetAddition__Group__1 : rule__SetAddition__Group__1__Impl ;
    public final void rule__SetAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4988:1: ( rule__SetAddition__Group__1__Impl )
            // InternalL.g:4989:2: rule__SetAddition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group__1"


    // $ANTLR start "rule__SetAddition__Group__1__Impl"
    // InternalL.g:4995:1: rule__SetAddition__Group__1__Impl : ( ( rule__SetAddition__Group_1__0 )* ) ;
    public final void rule__SetAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:4999:1: ( ( ( rule__SetAddition__Group_1__0 )* ) )
            // InternalL.g:5000:1: ( ( rule__SetAddition__Group_1__0 )* )
            {
            // InternalL.g:5000:1: ( ( rule__SetAddition__Group_1__0 )* )
            // InternalL.g:5001:1: ( rule__SetAddition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getGroup_1()); 
            }
            // InternalL.g:5002:1: ( rule__SetAddition__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==14) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalL.g:5002:2: rule__SetAddition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SetAddition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group__1__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__0"
    // InternalL.g:5016:1: rule__SetAddition__Group_1__0 : rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1 ;
    public final void rule__SetAddition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5020:1: ( rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1 )
            // InternalL.g:5021:2: rule__SetAddition__Group_1__0__Impl rule__SetAddition__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__SetAddition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__0"


    // $ANTLR start "rule__SetAddition__Group_1__0__Impl"
    // InternalL.g:5028:1: rule__SetAddition__Group_1__0__Impl : ( () ) ;
    public final void rule__SetAddition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5032:1: ( ( () ) )
            // InternalL.g:5033:1: ( () )
            {
            // InternalL.g:5033:1: ( () )
            // InternalL.g:5034:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0()); 
            }
            // InternalL.g:5035:1: ()
            // InternalL.g:5037:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getSetAdditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__0__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__1"
    // InternalL.g:5047:1: rule__SetAddition__Group_1__1 : rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2 ;
    public final void rule__SetAddition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5051:1: ( rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2 )
            // InternalL.g:5052:2: rule__SetAddition__Group_1__1__Impl rule__SetAddition__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__SetAddition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__1"


    // $ANTLR start "rule__SetAddition__Group_1__1__Impl"
    // InternalL.g:5059:1: rule__SetAddition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__SetAddition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5063:1: ( ( '+' ) )
            // InternalL.g:5064:1: ( '+' )
            {
            // InternalL.g:5064:1: ( '+' )
            // InternalL.g:5065:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getPlusSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__1__Impl"


    // $ANTLR start "rule__SetAddition__Group_1__2"
    // InternalL.g:5078:1: rule__SetAddition__Group_1__2 : rule__SetAddition__Group_1__2__Impl ;
    public final void rule__SetAddition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5082:1: ( rule__SetAddition__Group_1__2__Impl )
            // InternalL.g:5083:2: rule__SetAddition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetAddition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__2"


    // $ANTLR start "rule__SetAddition__Group_1__2__Impl"
    // InternalL.g:5089:1: rule__SetAddition__Group_1__2__Impl : ( ( rule__SetAddition__RightAssignment_1_2 ) ) ;
    public final void rule__SetAddition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5093:1: ( ( ( rule__SetAddition__RightAssignment_1_2 ) ) )
            // InternalL.g:5094:1: ( ( rule__SetAddition__RightAssignment_1_2 ) )
            {
            // InternalL.g:5094:1: ( ( rule__SetAddition__RightAssignment_1_2 ) )
            // InternalL.g:5095:1: ( rule__SetAddition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:5096:1: ( rule__SetAddition__RightAssignment_1_2 )
            // InternalL.g:5096:2: rule__SetAddition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SetAddition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__Group_1__2__Impl"


    // $ANTLR start "rule__SetMultiplication__Group__0"
    // InternalL.g:5112:1: rule__SetMultiplication__Group__0 : rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1 ;
    public final void rule__SetMultiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5116:1: ( rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1 )
            // InternalL.g:5117:2: rule__SetMultiplication__Group__0__Impl rule__SetMultiplication__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SetMultiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group__0"


    // $ANTLR start "rule__SetMultiplication__Group__0__Impl"
    // InternalL.g:5124:1: rule__SetMultiplication__Group__0__Impl : ( ruleSetPrimary ) ;
    public final void rule__SetMultiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5128:1: ( ( ruleSetPrimary ) )
            // InternalL.g:5129:1: ( ruleSetPrimary )
            {
            // InternalL.g:5129:1: ( ruleSetPrimary )
            // InternalL.g:5130:1: ruleSetPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getSetPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group__0__Impl"


    // $ANTLR start "rule__SetMultiplication__Group__1"
    // InternalL.g:5141:1: rule__SetMultiplication__Group__1 : rule__SetMultiplication__Group__1__Impl ;
    public final void rule__SetMultiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5145:1: ( rule__SetMultiplication__Group__1__Impl )
            // InternalL.g:5146:2: rule__SetMultiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group__1"


    // $ANTLR start "rule__SetMultiplication__Group__1__Impl"
    // InternalL.g:5152:1: rule__SetMultiplication__Group__1__Impl : ( ( rule__SetMultiplication__Group_1__0 )* ) ;
    public final void rule__SetMultiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5156:1: ( ( ( rule__SetMultiplication__Group_1__0 )* ) )
            // InternalL.g:5157:1: ( ( rule__SetMultiplication__Group_1__0 )* )
            {
            // InternalL.g:5157:1: ( ( rule__SetMultiplication__Group_1__0 )* )
            // InternalL.g:5158:1: ( rule__SetMultiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getGroup_1()); 
            }
            // InternalL.g:5159:1: ( rule__SetMultiplication__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16||LA36_0==19) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalL.g:5159:2: rule__SetMultiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SetMultiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group__1__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__0"
    // InternalL.g:5173:1: rule__SetMultiplication__Group_1__0 : rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1 ;
    public final void rule__SetMultiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5177:1: ( rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1 )
            // InternalL.g:5178:2: rule__SetMultiplication__Group_1__0__Impl rule__SetMultiplication__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SetMultiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__0"


    // $ANTLR start "rule__SetMultiplication__Group_1__0__Impl"
    // InternalL.g:5185:1: rule__SetMultiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__SetMultiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5189:1: ( ( () ) )
            // InternalL.g:5190:1: ( () )
            {
            // InternalL.g:5190:1: ( () )
            // InternalL.g:5191:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0()); 
            }
            // InternalL.g:5192:1: ()
            // InternalL.g:5194:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getSetMultiplicationLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__0__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__1"
    // InternalL.g:5204:1: rule__SetMultiplication__Group_1__1 : rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2 ;
    public final void rule__SetMultiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5208:1: ( rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2 )
            // InternalL.g:5209:2: rule__SetMultiplication__Group_1__1__Impl rule__SetMultiplication__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__SetMultiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__1"


    // $ANTLR start "rule__SetMultiplication__Group_1__1__Impl"
    // InternalL.g:5216:1: rule__SetMultiplication__Group_1__1__Impl : ( ( rule__SetMultiplication__Alternatives_1_1 ) ) ;
    public final void rule__SetMultiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5220:1: ( ( ( rule__SetMultiplication__Alternatives_1_1 ) ) )
            // InternalL.g:5221:1: ( ( rule__SetMultiplication__Alternatives_1_1 ) )
            {
            // InternalL.g:5221:1: ( ( rule__SetMultiplication__Alternatives_1_1 ) )
            // InternalL.g:5222:1: ( rule__SetMultiplication__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:5223:1: ( rule__SetMultiplication__Alternatives_1_1 )
            // InternalL.g:5223:2: rule__SetMultiplication__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__1__Impl"


    // $ANTLR start "rule__SetMultiplication__Group_1__2"
    // InternalL.g:5233:1: rule__SetMultiplication__Group_1__2 : rule__SetMultiplication__Group_1__2__Impl ;
    public final void rule__SetMultiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5237:1: ( rule__SetMultiplication__Group_1__2__Impl )
            // InternalL.g:5238:2: rule__SetMultiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__2"


    // $ANTLR start "rule__SetMultiplication__Group_1__2__Impl"
    // InternalL.g:5244:1: rule__SetMultiplication__Group_1__2__Impl : ( ( rule__SetMultiplication__RightAssignment_1_2 ) ) ;
    public final void rule__SetMultiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5248:1: ( ( ( rule__SetMultiplication__RightAssignment_1_2 ) ) )
            // InternalL.g:5249:1: ( ( rule__SetMultiplication__RightAssignment_1_2 ) )
            {
            // InternalL.g:5249:1: ( ( rule__SetMultiplication__RightAssignment_1_2 ) )
            // InternalL.g:5250:1: ( rule__SetMultiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:5251:1: ( rule__SetMultiplication__RightAssignment_1_2 )
            // InternalL.g:5251:2: rule__SetMultiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SetMultiplication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__Group_1__2__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__0"
    // InternalL.g:5267:1: rule__SetPrimary__Group_1__0 : rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1 ;
    public final void rule__SetPrimary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5271:1: ( rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1 )
            // InternalL.g:5272:2: rule__SetPrimary__Group_1__0__Impl rule__SetPrimary__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__SetPrimary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetPrimary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__0"


    // $ANTLR start "rule__SetPrimary__Group_1__0__Impl"
    // InternalL.g:5279:1: rule__SetPrimary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SetPrimary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5283:1: ( ( '(' ) )
            // InternalL.g:5284:1: ( '(' )
            {
            // InternalL.g:5284:1: ( '(' )
            // InternalL.g:5285:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__0__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__1"
    // InternalL.g:5298:1: rule__SetPrimary__Group_1__1 : rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2 ;
    public final void rule__SetPrimary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5302:1: ( rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2 )
            // InternalL.g:5303:2: rule__SetPrimary__Group_1__1__Impl rule__SetPrimary__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__SetPrimary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetPrimary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__1"


    // $ANTLR start "rule__SetPrimary__Group_1__1__Impl"
    // InternalL.g:5310:1: rule__SetPrimary__Group_1__1__Impl : ( ruleSetAddition ) ;
    public final void rule__SetPrimary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5314:1: ( ( ruleSetAddition ) )
            // InternalL.g:5315:1: ( ruleSetAddition )
            {
            // InternalL.g:5315:1: ( ruleSetAddition )
            // InternalL.g:5316:1: ruleSetAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetPrimaryAccess().getSetAdditionParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__1__Impl"


    // $ANTLR start "rule__SetPrimary__Group_1__2"
    // InternalL.g:5327:1: rule__SetPrimary__Group_1__2 : rule__SetPrimary__Group_1__2__Impl ;
    public final void rule__SetPrimary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5331:1: ( rule__SetPrimary__Group_1__2__Impl )
            // InternalL.g:5332:2: rule__SetPrimary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPrimary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__2"


    // $ANTLR start "rule__SetPrimary__Group_1__2__Impl"
    // InternalL.g:5338:1: rule__SetPrimary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SetPrimary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5342:1: ( ( ')' ) )
            // InternalL.g:5343:1: ( ')' )
            {
            // InternalL.g:5343:1: ( ')' )
            // InternalL.g:5344:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPrimary__Group_1__2__Impl"


    // $ANTLR start "rule__PredicateAtom__Group__0"
    // InternalL.g:5363:1: rule__PredicateAtom__Group__0 : rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1 ;
    public final void rule__PredicateAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5367:1: ( rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1 )
            // InternalL.g:5368:2: rule__PredicateAtom__Group__0__Impl rule__PredicateAtom__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PredicateAtom__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group__0"


    // $ANTLR start "rule__PredicateAtom__Group__0__Impl"
    // InternalL.g:5375:1: rule__PredicateAtom__Group__0__Impl : ( ( rule__PredicateAtom__FidAssignment_0 ) ) ;
    public final void rule__PredicateAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5379:1: ( ( ( rule__PredicateAtom__FidAssignment_0 ) ) )
            // InternalL.g:5380:1: ( ( rule__PredicateAtom__FidAssignment_0 ) )
            {
            // InternalL.g:5380:1: ( ( rule__PredicateAtom__FidAssignment_0 ) )
            // InternalL.g:5381:1: ( rule__PredicateAtom__FidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getFidAssignment_0()); 
            }
            // InternalL.g:5382:1: ( rule__PredicateAtom__FidAssignment_0 )
            // InternalL.g:5382:2: rule__PredicateAtom__FidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__FidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getFidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group__0__Impl"


    // $ANTLR start "rule__PredicateAtom__Group__1"
    // InternalL.g:5392:1: rule__PredicateAtom__Group__1 : rule__PredicateAtom__Group__1__Impl ;
    public final void rule__PredicateAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5396:1: ( rule__PredicateAtom__Group__1__Impl )
            // InternalL.g:5397:2: rule__PredicateAtom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group__1"


    // $ANTLR start "rule__PredicateAtom__Group__1__Impl"
    // InternalL.g:5403:1: rule__PredicateAtom__Group__1__Impl : ( ( rule__PredicateAtom__Group_1__0 )? ) ;
    public final void rule__PredicateAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5407:1: ( ( ( rule__PredicateAtom__Group_1__0 )? ) )
            // InternalL.g:5408:1: ( ( rule__PredicateAtom__Group_1__0 )? )
            {
            // InternalL.g:5408:1: ( ( rule__PredicateAtom__Group_1__0 )? )
            // InternalL.g:5409:1: ( rule__PredicateAtom__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getGroup_1()); 
            }
            // InternalL.g:5410:1: ( rule__PredicateAtom__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalL.g:5410:2: rule__PredicateAtom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateAtom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group__1__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__0"
    // InternalL.g:5424:1: rule__PredicateAtom__Group_1__0 : rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1 ;
    public final void rule__PredicateAtom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5428:1: ( rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1 )
            // InternalL.g:5429:2: rule__PredicateAtom__Group_1__0__Impl rule__PredicateAtom__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__PredicateAtom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__0"


    // $ANTLR start "rule__PredicateAtom__Group_1__0__Impl"
    // InternalL.g:5436:1: rule__PredicateAtom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PredicateAtom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5440:1: ( ( '(' ) )
            // InternalL.g:5441:1: ( '(' )
            {
            // InternalL.g:5441:1: ( '(' )
            // InternalL.g:5442:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__0__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__1"
    // InternalL.g:5455:1: rule__PredicateAtom__Group_1__1 : rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2 ;
    public final void rule__PredicateAtom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5459:1: ( rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2 )
            // InternalL.g:5460:2: rule__PredicateAtom__Group_1__1__Impl rule__PredicateAtom__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__PredicateAtom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__1"


    // $ANTLR start "rule__PredicateAtom__Group_1__1__Impl"
    // InternalL.g:5467:1: rule__PredicateAtom__Group_1__1__Impl : ( ( rule__PredicateAtom__TermsAssignment_1_1 ) ) ;
    public final void rule__PredicateAtom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5471:1: ( ( ( rule__PredicateAtom__TermsAssignment_1_1 ) ) )
            // InternalL.g:5472:1: ( ( rule__PredicateAtom__TermsAssignment_1_1 ) )
            {
            // InternalL.g:5472:1: ( ( rule__PredicateAtom__TermsAssignment_1_1 ) )
            // InternalL.g:5473:1: ( rule__PredicateAtom__TermsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getTermsAssignment_1_1()); 
            }
            // InternalL.g:5474:1: ( rule__PredicateAtom__TermsAssignment_1_1 )
            // InternalL.g:5474:2: rule__PredicateAtom__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__TermsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getTermsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__1__Impl"


    // $ANTLR start "rule__PredicateAtom__Group_1__2"
    // InternalL.g:5484:1: rule__PredicateAtom__Group_1__2 : rule__PredicateAtom__Group_1__2__Impl ;
    public final void rule__PredicateAtom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5488:1: ( rule__PredicateAtom__Group_1__2__Impl )
            // InternalL.g:5489:2: rule__PredicateAtom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateAtom__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__2"


    // $ANTLR start "rule__PredicateAtom__Group_1__2__Impl"
    // InternalL.g:5495:1: rule__PredicateAtom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PredicateAtom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5499:1: ( ( ')' ) )
            // InternalL.g:5500:1: ( ')' )
            {
            // InternalL.g:5500:1: ( ')' )
            // InternalL.g:5501:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__Group_1__2__Impl"


    // $ANTLR start "rule__BasicPredicateAtom__Group__0"
    // InternalL.g:5520:1: rule__BasicPredicateAtom__Group__0 : rule__BasicPredicateAtom__Group__0__Impl rule__BasicPredicateAtom__Group__1 ;
    public final void rule__BasicPredicateAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5524:1: ( rule__BasicPredicateAtom__Group__0__Impl rule__BasicPredicateAtom__Group__1 )
            // InternalL.g:5525:2: rule__BasicPredicateAtom__Group__0__Impl rule__BasicPredicateAtom__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BasicPredicateAtom__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group__0"


    // $ANTLR start "rule__BasicPredicateAtom__Group__0__Impl"
    // InternalL.g:5532:1: rule__BasicPredicateAtom__Group__0__Impl : ( ( rule__BasicPredicateAtom__FidAssignment_0 ) ) ;
    public final void rule__BasicPredicateAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5536:1: ( ( ( rule__BasicPredicateAtom__FidAssignment_0 ) ) )
            // InternalL.g:5537:1: ( ( rule__BasicPredicateAtom__FidAssignment_0 ) )
            {
            // InternalL.g:5537:1: ( ( rule__BasicPredicateAtom__FidAssignment_0 ) )
            // InternalL.g:5538:1: ( rule__BasicPredicateAtom__FidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getFidAssignment_0()); 
            }
            // InternalL.g:5539:1: ( rule__BasicPredicateAtom__FidAssignment_0 )
            // InternalL.g:5539:2: rule__BasicPredicateAtom__FidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__FidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getFidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group__0__Impl"


    // $ANTLR start "rule__BasicPredicateAtom__Group__1"
    // InternalL.g:5549:1: rule__BasicPredicateAtom__Group__1 : rule__BasicPredicateAtom__Group__1__Impl ;
    public final void rule__BasicPredicateAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5553:1: ( rule__BasicPredicateAtom__Group__1__Impl )
            // InternalL.g:5554:2: rule__BasicPredicateAtom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group__1"


    // $ANTLR start "rule__BasicPredicateAtom__Group__1__Impl"
    // InternalL.g:5560:1: rule__BasicPredicateAtom__Group__1__Impl : ( ( rule__BasicPredicateAtom__Group_1__0 )? ) ;
    public final void rule__BasicPredicateAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5564:1: ( ( ( rule__BasicPredicateAtom__Group_1__0 )? ) )
            // InternalL.g:5565:1: ( ( rule__BasicPredicateAtom__Group_1__0 )? )
            {
            // InternalL.g:5565:1: ( ( rule__BasicPredicateAtom__Group_1__0 )? )
            // InternalL.g:5566:1: ( rule__BasicPredicateAtom__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getGroup_1()); 
            }
            // InternalL.g:5567:1: ( rule__BasicPredicateAtom__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalL.g:5567:2: rule__BasicPredicateAtom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicPredicateAtom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group__1__Impl"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__0"
    // InternalL.g:5581:1: rule__BasicPredicateAtom__Group_1__0 : rule__BasicPredicateAtom__Group_1__0__Impl rule__BasicPredicateAtom__Group_1__1 ;
    public final void rule__BasicPredicateAtom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5585:1: ( rule__BasicPredicateAtom__Group_1__0__Impl rule__BasicPredicateAtom__Group_1__1 )
            // InternalL.g:5586:2: rule__BasicPredicateAtom__Group_1__0__Impl rule__BasicPredicateAtom__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__BasicPredicateAtom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__0"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__0__Impl"
    // InternalL.g:5593:1: rule__BasicPredicateAtom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BasicPredicateAtom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5597:1: ( ( '(' ) )
            // InternalL.g:5598:1: ( '(' )
            {
            // InternalL.g:5598:1: ( '(' )
            // InternalL.g:5599:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__0__Impl"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__1"
    // InternalL.g:5612:1: rule__BasicPredicateAtom__Group_1__1 : rule__BasicPredicateAtom__Group_1__1__Impl rule__BasicPredicateAtom__Group_1__2 ;
    public final void rule__BasicPredicateAtom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5616:1: ( rule__BasicPredicateAtom__Group_1__1__Impl rule__BasicPredicateAtom__Group_1__2 )
            // InternalL.g:5617:2: rule__BasicPredicateAtom__Group_1__1__Impl rule__BasicPredicateAtom__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__BasicPredicateAtom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__1"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__1__Impl"
    // InternalL.g:5624:1: rule__BasicPredicateAtom__Group_1__1__Impl : ( ( rule__BasicPredicateAtom__TermsAssignment_1_1 ) ) ;
    public final void rule__BasicPredicateAtom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5628:1: ( ( ( rule__BasicPredicateAtom__TermsAssignment_1_1 ) ) )
            // InternalL.g:5629:1: ( ( rule__BasicPredicateAtom__TermsAssignment_1_1 ) )
            {
            // InternalL.g:5629:1: ( ( rule__BasicPredicateAtom__TermsAssignment_1_1 ) )
            // InternalL.g:5630:1: ( rule__BasicPredicateAtom__TermsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getTermsAssignment_1_1()); 
            }
            // InternalL.g:5631:1: ( rule__BasicPredicateAtom__TermsAssignment_1_1 )
            // InternalL.g:5631:2: rule__BasicPredicateAtom__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__TermsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getTermsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__1__Impl"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__2"
    // InternalL.g:5641:1: rule__BasicPredicateAtom__Group_1__2 : rule__BasicPredicateAtom__Group_1__2__Impl ;
    public final void rule__BasicPredicateAtom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5645:1: ( rule__BasicPredicateAtom__Group_1__2__Impl )
            // InternalL.g:5646:2: rule__BasicPredicateAtom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicPredicateAtom__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__2"


    // $ANTLR start "rule__BasicPredicateAtom__Group_1__2__Impl"
    // InternalL.g:5652:1: rule__BasicPredicateAtom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BasicPredicateAtom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5656:1: ( ( ')' ) )
            // InternalL.g:5657:1: ( ')' )
            {
            // InternalL.g:5657:1: ( ')' )
            // InternalL.g:5658:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__Group_1__2__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__0"
    // InternalL.g:5677:1: rule__BuiltInAtom__Group__0 : rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1 ;
    public final void rule__BuiltInAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5681:1: ( rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1 )
            // InternalL.g:5682:2: rule__BuiltInAtom__Group__0__Impl rule__BuiltInAtom__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BuiltInAtom__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__0"


    // $ANTLR start "rule__BuiltInAtom__Group__0__Impl"
    // InternalL.g:5689:1: rule__BuiltInAtom__Group__0__Impl : ( ( rule__BuiltInAtom__LhsAssignment_0 ) ) ;
    public final void rule__BuiltInAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5693:1: ( ( ( rule__BuiltInAtom__LhsAssignment_0 ) ) )
            // InternalL.g:5694:1: ( ( rule__BuiltInAtom__LhsAssignment_0 ) )
            {
            // InternalL.g:5694:1: ( ( rule__BuiltInAtom__LhsAssignment_0 ) )
            // InternalL.g:5695:1: ( rule__BuiltInAtom__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getLhsAssignment_0()); 
            }
            // InternalL.g:5696:1: ( rule__BuiltInAtom__LhsAssignment_0 )
            // InternalL.g:5696:2: rule__BuiltInAtom__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__LhsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getLhsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__0__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__1"
    // InternalL.g:5706:1: rule__BuiltInAtom__Group__1 : rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2 ;
    public final void rule__BuiltInAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5710:1: ( rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2 )
            // InternalL.g:5711:2: rule__BuiltInAtom__Group__1__Impl rule__BuiltInAtom__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__BuiltInAtom__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__1"


    // $ANTLR start "rule__BuiltInAtom__Group__1__Impl"
    // InternalL.g:5718:1: rule__BuiltInAtom__Group__1__Impl : ( ( rule__BuiltInAtom__OpAssignment_1 ) ) ;
    public final void rule__BuiltInAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5722:1: ( ( ( rule__BuiltInAtom__OpAssignment_1 ) ) )
            // InternalL.g:5723:1: ( ( rule__BuiltInAtom__OpAssignment_1 ) )
            {
            // InternalL.g:5723:1: ( ( rule__BuiltInAtom__OpAssignment_1 ) )
            // InternalL.g:5724:1: ( rule__BuiltInAtom__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getOpAssignment_1()); 
            }
            // InternalL.g:5725:1: ( rule__BuiltInAtom__OpAssignment_1 )
            // InternalL.g:5725:2: rule__BuiltInAtom__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__OpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getOpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__1__Impl"


    // $ANTLR start "rule__BuiltInAtom__Group__2"
    // InternalL.g:5735:1: rule__BuiltInAtom__Group__2 : rule__BuiltInAtom__Group__2__Impl ;
    public final void rule__BuiltInAtom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5739:1: ( rule__BuiltInAtom__Group__2__Impl )
            // InternalL.g:5740:2: rule__BuiltInAtom__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__2"


    // $ANTLR start "rule__BuiltInAtom__Group__2__Impl"
    // InternalL.g:5746:1: rule__BuiltInAtom__Group__2__Impl : ( ( rule__BuiltInAtom__RhsAssignment_2 ) ) ;
    public final void rule__BuiltInAtom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5750:1: ( ( ( rule__BuiltInAtom__RhsAssignment_2 ) ) )
            // InternalL.g:5751:1: ( ( rule__BuiltInAtom__RhsAssignment_2 ) )
            {
            // InternalL.g:5751:1: ( ( rule__BuiltInAtom__RhsAssignment_2 ) )
            // InternalL.g:5752:1: ( rule__BuiltInAtom__RhsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getRhsAssignment_2()); 
            }
            // InternalL.g:5753:1: ( rule__BuiltInAtom__RhsAssignment_2 )
            // InternalL.g:5753:2: rule__BuiltInAtom__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInAtom__RhsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getRhsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__Group__2__Impl"


    // $ANTLR start "rule__OrSentence__Group__0"
    // InternalL.g:5769:1: rule__OrSentence__Group__0 : rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1 ;
    public final void rule__OrSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5773:1: ( rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1 )
            // InternalL.g:5774:2: rule__OrSentence__Group__0__Impl rule__OrSentence__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__OrSentence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group__0"


    // $ANTLR start "rule__OrSentence__Group__0__Impl"
    // InternalL.g:5781:1: rule__OrSentence__Group__0__Impl : ( ruleAndSentence ) ;
    public final void rule__OrSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5785:1: ( ( ruleAndSentence ) )
            // InternalL.g:5786:1: ( ruleAndSentence )
            {
            // InternalL.g:5786:1: ( ruleAndSentence )
            // InternalL.g:5787:1: ruleAndSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getAndSentenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group__0__Impl"


    // $ANTLR start "rule__OrSentence__Group__1"
    // InternalL.g:5798:1: rule__OrSentence__Group__1 : rule__OrSentence__Group__1__Impl ;
    public final void rule__OrSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5802:1: ( rule__OrSentence__Group__1__Impl )
            // InternalL.g:5803:2: rule__OrSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group__1"


    // $ANTLR start "rule__OrSentence__Group__1__Impl"
    // InternalL.g:5809:1: rule__OrSentence__Group__1__Impl : ( ( rule__OrSentence__Group_1__0 )* ) ;
    public final void rule__OrSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5813:1: ( ( ( rule__OrSentence__Group_1__0 )* ) )
            // InternalL.g:5814:1: ( ( rule__OrSentence__Group_1__0 )* )
            {
            // InternalL.g:5814:1: ( ( rule__OrSentence__Group_1__0 )* )
            // InternalL.g:5815:1: ( rule__OrSentence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getGroup_1()); 
            }
            // InternalL.g:5816:1: ( rule__OrSentence__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalL.g:5816:2: rule__OrSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__OrSentence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group__1__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__0"
    // InternalL.g:5830:1: rule__OrSentence__Group_1__0 : rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1 ;
    public final void rule__OrSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5834:1: ( rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1 )
            // InternalL.g:5835:2: rule__OrSentence__Group_1__0__Impl rule__OrSentence__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__OrSentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__0"


    // $ANTLR start "rule__OrSentence__Group_1__0__Impl"
    // InternalL.g:5842:1: rule__OrSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__OrSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5846:1: ( ( () ) )
            // InternalL.g:5847:1: ( () )
            {
            // InternalL.g:5847:1: ( () )
            // InternalL.g:5848:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0()); 
            }
            // InternalL.g:5849:1: ()
            // InternalL.g:5851:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getOrSentenceLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__0__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__1"
    // InternalL.g:5861:1: rule__OrSentence__Group_1__1 : rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2 ;
    public final void rule__OrSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5865:1: ( rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2 )
            // InternalL.g:5866:2: rule__OrSentence__Group_1__1__Impl rule__OrSentence__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__OrSentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__1"


    // $ANTLR start "rule__OrSentence__Group_1__1__Impl"
    // InternalL.g:5873:1: rule__OrSentence__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5877:1: ( ( 'or' ) )
            // InternalL.g:5878:1: ( 'or' )
            {
            // InternalL.g:5878:1: ( 'or' )
            // InternalL.g:5879:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getOrKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__1__Impl"


    // $ANTLR start "rule__OrSentence__Group_1__2"
    // InternalL.g:5892:1: rule__OrSentence__Group_1__2 : rule__OrSentence__Group_1__2__Impl ;
    public final void rule__OrSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5896:1: ( rule__OrSentence__Group_1__2__Impl )
            // InternalL.g:5897:2: rule__OrSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrSentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__2"


    // $ANTLR start "rule__OrSentence__Group_1__2__Impl"
    // InternalL.g:5903:1: rule__OrSentence__Group_1__2__Impl : ( ( rule__OrSentence__RightAssignment_1_2 ) ) ;
    public final void rule__OrSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5907:1: ( ( ( rule__OrSentence__RightAssignment_1_2 ) ) )
            // InternalL.g:5908:1: ( ( rule__OrSentence__RightAssignment_1_2 ) )
            {
            // InternalL.g:5908:1: ( ( rule__OrSentence__RightAssignment_1_2 ) )
            // InternalL.g:5909:1: ( rule__OrSentence__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:5910:1: ( rule__OrSentence__RightAssignment_1_2 )
            // InternalL.g:5910:2: rule__OrSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrSentence__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__Group_1__2__Impl"


    // $ANTLR start "rule__AndSentence__Group__0"
    // InternalL.g:5926:1: rule__AndSentence__Group__0 : rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1 ;
    public final void rule__AndSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5930:1: ( rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1 )
            // InternalL.g:5931:2: rule__AndSentence__Group__0__Impl rule__AndSentence__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__AndSentence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group__0"


    // $ANTLR start "rule__AndSentence__Group__0__Impl"
    // InternalL.g:5938:1: rule__AndSentence__Group__0__Impl : ( rulePrimarySentence ) ;
    public final void rule__AndSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5942:1: ( ( rulePrimarySentence ) )
            // InternalL.g:5943:1: ( rulePrimarySentence )
            {
            // InternalL.g:5943:1: ( rulePrimarySentence )
            // InternalL.g:5944:1: rulePrimarySentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getPrimarySentenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group__0__Impl"


    // $ANTLR start "rule__AndSentence__Group__1"
    // InternalL.g:5955:1: rule__AndSentence__Group__1 : rule__AndSentence__Group__1__Impl ;
    public final void rule__AndSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5959:1: ( rule__AndSentence__Group__1__Impl )
            // InternalL.g:5960:2: rule__AndSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group__1"


    // $ANTLR start "rule__AndSentence__Group__1__Impl"
    // InternalL.g:5966:1: rule__AndSentence__Group__1__Impl : ( ( rule__AndSentence__Group_1__0 )* ) ;
    public final void rule__AndSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5970:1: ( ( ( rule__AndSentence__Group_1__0 )* ) )
            // InternalL.g:5971:1: ( ( rule__AndSentence__Group_1__0 )* )
            {
            // InternalL.g:5971:1: ( ( rule__AndSentence__Group_1__0 )* )
            // InternalL.g:5972:1: ( rule__AndSentence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getGroup_1()); 
            }
            // InternalL.g:5973:1: ( rule__AndSentence__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=26 && LA40_0<=27)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalL.g:5973:2: rule__AndSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AndSentence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group__1__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__0"
    // InternalL.g:5987:1: rule__AndSentence__Group_1__0 : rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1 ;
    public final void rule__AndSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:5991:1: ( rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1 )
            // InternalL.g:5992:2: rule__AndSentence__Group_1__0__Impl rule__AndSentence__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__AndSentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__0"


    // $ANTLR start "rule__AndSentence__Group_1__0__Impl"
    // InternalL.g:5999:1: rule__AndSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__AndSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6003:1: ( ( () ) )
            // InternalL.g:6004:1: ( () )
            {
            // InternalL.g:6004:1: ( () )
            // InternalL.g:6005:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0()); 
            }
            // InternalL.g:6006:1: ()
            // InternalL.g:6008:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getAndSentenceLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__0__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__1"
    // InternalL.g:6018:1: rule__AndSentence__Group_1__1 : rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2 ;
    public final void rule__AndSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6022:1: ( rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2 )
            // InternalL.g:6023:2: rule__AndSentence__Group_1__1__Impl rule__AndSentence__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AndSentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__1"


    // $ANTLR start "rule__AndSentence__Group_1__1__Impl"
    // InternalL.g:6030:1: rule__AndSentence__Group_1__1__Impl : ( ( rule__AndSentence__Alternatives_1_1 ) ) ;
    public final void rule__AndSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6034:1: ( ( ( rule__AndSentence__Alternatives_1_1 ) ) )
            // InternalL.g:6035:1: ( ( rule__AndSentence__Alternatives_1_1 ) )
            {
            // InternalL.g:6035:1: ( ( rule__AndSentence__Alternatives_1_1 ) )
            // InternalL.g:6036:1: ( rule__AndSentence__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getAlternatives_1_1()); 
            }
            // InternalL.g:6037:1: ( rule__AndSentence__Alternatives_1_1 )
            // InternalL.g:6037:2: rule__AndSentence__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndSentence__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__1__Impl"


    // $ANTLR start "rule__AndSentence__Group_1__2"
    // InternalL.g:6047:1: rule__AndSentence__Group_1__2 : rule__AndSentence__Group_1__2__Impl ;
    public final void rule__AndSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6051:1: ( rule__AndSentence__Group_1__2__Impl )
            // InternalL.g:6052:2: rule__AndSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndSentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__2"


    // $ANTLR start "rule__AndSentence__Group_1__2__Impl"
    // InternalL.g:6058:1: rule__AndSentence__Group_1__2__Impl : ( ( rule__AndSentence__RightAssignment_1_2 ) ) ;
    public final void rule__AndSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6062:1: ( ( ( rule__AndSentence__RightAssignment_1_2 ) ) )
            // InternalL.g:6063:1: ( ( rule__AndSentence__RightAssignment_1_2 ) )
            {
            // InternalL.g:6063:1: ( ( rule__AndSentence__RightAssignment_1_2 ) )
            // InternalL.g:6064:1: ( rule__AndSentence__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:6065:1: ( rule__AndSentence__RightAssignment_1_2 )
            // InternalL.g:6065:2: rule__AndSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndSentence__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__Group_1__2__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__0"
    // InternalL.g:6081:1: rule__PrimarySentence__Group_1__0 : rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1 ;
    public final void rule__PrimarySentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6085:1: ( rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1 )
            // InternalL.g:6086:2: rule__PrimarySentence__Group_1__0__Impl rule__PrimarySentence__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PrimarySentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimarySentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__0"


    // $ANTLR start "rule__PrimarySentence__Group_1__0__Impl"
    // InternalL.g:6093:1: rule__PrimarySentence__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimarySentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6097:1: ( ( '(' ) )
            // InternalL.g:6098:1: ( '(' )
            {
            // InternalL.g:6098:1: ( '(' )
            // InternalL.g:6099:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__0__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__1"
    // InternalL.g:6112:1: rule__PrimarySentence__Group_1__1 : rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2 ;
    public final void rule__PrimarySentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6116:1: ( rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2 )
            // InternalL.g:6117:2: rule__PrimarySentence__Group_1__1__Impl rule__PrimarySentence__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__PrimarySentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimarySentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__1"


    // $ANTLR start "rule__PrimarySentence__Group_1__1__Impl"
    // InternalL.g:6124:1: rule__PrimarySentence__Group_1__1__Impl : ( ruleOrSentence ) ;
    public final void rule__PrimarySentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6128:1: ( ( ruleOrSentence ) )
            // InternalL.g:6129:1: ( ruleOrSentence )
            {
            // InternalL.g:6129:1: ( ruleOrSentence )
            // InternalL.g:6130:1: ruleOrSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimarySentenceAccess().getOrSentenceParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__1__Impl"


    // $ANTLR start "rule__PrimarySentence__Group_1__2"
    // InternalL.g:6141:1: rule__PrimarySentence__Group_1__2 : rule__PrimarySentence__Group_1__2__Impl ;
    public final void rule__PrimarySentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6145:1: ( rule__PrimarySentence__Group_1__2__Impl )
            // InternalL.g:6146:2: rule__PrimarySentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__2"


    // $ANTLR start "rule__PrimarySentence__Group_1__2__Impl"
    // InternalL.g:6152:1: rule__PrimarySentence__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimarySentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6156:1: ( ( ')' ) )
            // InternalL.g:6157:1: ( ')' )
            {
            // InternalL.g:6157:1: ( ')' )
            // InternalL.g:6158:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySentence__Group_1__2__Impl"


    // $ANTLR start "rule__SentenceLiteral__Group_1__0"
    // InternalL.g:6177:1: rule__SentenceLiteral__Group_1__0 : rule__SentenceLiteral__Group_1__0__Impl rule__SentenceLiteral__Group_1__1 ;
    public final void rule__SentenceLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6181:1: ( rule__SentenceLiteral__Group_1__0__Impl rule__SentenceLiteral__Group_1__1 )
            // InternalL.g:6182:2: rule__SentenceLiteral__Group_1__0__Impl rule__SentenceLiteral__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SentenceLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SentenceLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceLiteral__Group_1__0"


    // $ANTLR start "rule__SentenceLiteral__Group_1__0__Impl"
    // InternalL.g:6189:1: rule__SentenceLiteral__Group_1__0__Impl : ( 'not' ) ;
    public final void rule__SentenceLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6193:1: ( ( 'not' ) )
            // InternalL.g:6194:1: ( 'not' )
            {
            // InternalL.g:6194:1: ( 'not' )
            // InternalL.g:6195:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceLiteralAccess().getNotKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceLiteralAccess().getNotKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__SentenceLiteral__Group_1__1"
    // InternalL.g:6208:1: rule__SentenceLiteral__Group_1__1 : rule__SentenceLiteral__Group_1__1__Impl ;
    public final void rule__SentenceLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6212:1: ( rule__SentenceLiteral__Group_1__1__Impl )
            // InternalL.g:6213:2: rule__SentenceLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenceLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceLiteral__Group_1__1"


    // $ANTLR start "rule__SentenceLiteral__Group_1__1__Impl"
    // InternalL.g:6219:1: rule__SentenceLiteral__Group_1__1__Impl : ( ruleBasicAtom ) ;
    public final void rule__SentenceLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6223:1: ( ( ruleBasicAtom ) )
            // InternalL.g:6224:1: ( ruleBasicAtom )
            {
            // InternalL.g:6224:1: ( ruleBasicAtom )
            // InternalL.g:6225:1: ruleBasicAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSentenceLiteralAccess().getBasicAtomParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSentenceLiteralAccess().getBasicAtomParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__POrSentence__Group__0"
    // InternalL.g:6240:1: rule__POrSentence__Group__0 : rule__POrSentence__Group__0__Impl rule__POrSentence__Group__1 ;
    public final void rule__POrSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6244:1: ( rule__POrSentence__Group__0__Impl rule__POrSentence__Group__1 )
            // InternalL.g:6245:2: rule__POrSentence__Group__0__Impl rule__POrSentence__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__POrSentence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group__0"


    // $ANTLR start "rule__POrSentence__Group__0__Impl"
    // InternalL.g:6252:1: rule__POrSentence__Group__0__Impl : ( rulepAndSentence ) ;
    public final void rule__POrSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6256:1: ( ( rulepAndSentence ) )
            // InternalL.g:6257:1: ( rulepAndSentence )
            {
            // InternalL.g:6257:1: ( rulepAndSentence )
            // InternalL.g:6258:1: rulepAndSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getPAndSentenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getPAndSentenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group__0__Impl"


    // $ANTLR start "rule__POrSentence__Group__1"
    // InternalL.g:6269:1: rule__POrSentence__Group__1 : rule__POrSentence__Group__1__Impl ;
    public final void rule__POrSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6273:1: ( rule__POrSentence__Group__1__Impl )
            // InternalL.g:6274:2: rule__POrSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group__1"


    // $ANTLR start "rule__POrSentence__Group__1__Impl"
    // InternalL.g:6280:1: rule__POrSentence__Group__1__Impl : ( ( rule__POrSentence__Group_1__0 )* ) ;
    public final void rule__POrSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6284:1: ( ( ( rule__POrSentence__Group_1__0 )* ) )
            // InternalL.g:6285:1: ( ( rule__POrSentence__Group_1__0 )* )
            {
            // InternalL.g:6285:1: ( ( rule__POrSentence__Group_1__0 )* )
            // InternalL.g:6286:1: ( rule__POrSentence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getGroup_1()); 
            }
            // InternalL.g:6287:1: ( rule__POrSentence__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalL.g:6287:2: rule__POrSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__POrSentence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group__1__Impl"


    // $ANTLR start "rule__POrSentence__Group_1__0"
    // InternalL.g:6301:1: rule__POrSentence__Group_1__0 : rule__POrSentence__Group_1__0__Impl rule__POrSentence__Group_1__1 ;
    public final void rule__POrSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6305:1: ( rule__POrSentence__Group_1__0__Impl rule__POrSentence__Group_1__1 )
            // InternalL.g:6306:2: rule__POrSentence__Group_1__0__Impl rule__POrSentence__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__POrSentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__0"


    // $ANTLR start "rule__POrSentence__Group_1__0__Impl"
    // InternalL.g:6313:1: rule__POrSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__POrSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6317:1: ( ( () ) )
            // InternalL.g:6318:1: ( () )
            {
            // InternalL.g:6318:1: ( () )
            // InternalL.g:6319:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0()); 
            }
            // InternalL.g:6320:1: ()
            // InternalL.g:6322:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getPOrSentenceLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__0__Impl"


    // $ANTLR start "rule__POrSentence__Group_1__1"
    // InternalL.g:6332:1: rule__POrSentence__Group_1__1 : rule__POrSentence__Group_1__1__Impl rule__POrSentence__Group_1__2 ;
    public final void rule__POrSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6336:1: ( rule__POrSentence__Group_1__1__Impl rule__POrSentence__Group_1__2 )
            // InternalL.g:6337:2: rule__POrSentence__Group_1__1__Impl rule__POrSentence__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__POrSentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__1"


    // $ANTLR start "rule__POrSentence__Group_1__1__Impl"
    // InternalL.g:6344:1: rule__POrSentence__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__POrSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6348:1: ( ( 'or' ) )
            // InternalL.g:6349:1: ( 'or' )
            {
            // InternalL.g:6349:1: ( 'or' )
            // InternalL.g:6350:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getOrKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__1__Impl"


    // $ANTLR start "rule__POrSentence__Group_1__2"
    // InternalL.g:6363:1: rule__POrSentence__Group_1__2 : rule__POrSentence__Group_1__2__Impl ;
    public final void rule__POrSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6367:1: ( rule__POrSentence__Group_1__2__Impl )
            // InternalL.g:6368:2: rule__POrSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__POrSentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__2"


    // $ANTLR start "rule__POrSentence__Group_1__2__Impl"
    // InternalL.g:6374:1: rule__POrSentence__Group_1__2__Impl : ( ( rule__POrSentence__RightAssignment_1_2 ) ) ;
    public final void rule__POrSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6378:1: ( ( ( rule__POrSentence__RightAssignment_1_2 ) ) )
            // InternalL.g:6379:1: ( ( rule__POrSentence__RightAssignment_1_2 ) )
            {
            // InternalL.g:6379:1: ( ( rule__POrSentence__RightAssignment_1_2 ) )
            // InternalL.g:6380:1: ( rule__POrSentence__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:6381:1: ( rule__POrSentence__RightAssignment_1_2 )
            // InternalL.g:6381:2: rule__POrSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__POrSentence__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__Group_1__2__Impl"


    // $ANTLR start "rule__PAndSentence__Group__0"
    // InternalL.g:6397:1: rule__PAndSentence__Group__0 : rule__PAndSentence__Group__0__Impl rule__PAndSentence__Group__1 ;
    public final void rule__PAndSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6401:1: ( rule__PAndSentence__Group__0__Impl rule__PAndSentence__Group__1 )
            // InternalL.g:6402:2: rule__PAndSentence__Group__0__Impl rule__PAndSentence__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__PAndSentence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group__0"


    // $ANTLR start "rule__PAndSentence__Group__0__Impl"
    // InternalL.g:6409:1: rule__PAndSentence__Group__0__Impl : ( rulepPrimarySentence ) ;
    public final void rule__PAndSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6413:1: ( ( rulepPrimarySentence ) )
            // InternalL.g:6414:1: ( rulepPrimarySentence )
            {
            // InternalL.g:6414:1: ( rulepPrimarySentence )
            // InternalL.g:6415:1: rulepPrimarySentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getPPrimarySentenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getPPrimarySentenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group__0__Impl"


    // $ANTLR start "rule__PAndSentence__Group__1"
    // InternalL.g:6426:1: rule__PAndSentence__Group__1 : rule__PAndSentence__Group__1__Impl ;
    public final void rule__PAndSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6430:1: ( rule__PAndSentence__Group__1__Impl )
            // InternalL.g:6431:2: rule__PAndSentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group__1"


    // $ANTLR start "rule__PAndSentence__Group__1__Impl"
    // InternalL.g:6437:1: rule__PAndSentence__Group__1__Impl : ( ( rule__PAndSentence__Group_1__0 )* ) ;
    public final void rule__PAndSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6441:1: ( ( ( rule__PAndSentence__Group_1__0 )* ) )
            // InternalL.g:6442:1: ( ( rule__PAndSentence__Group_1__0 )* )
            {
            // InternalL.g:6442:1: ( ( rule__PAndSentence__Group_1__0 )* )
            // InternalL.g:6443:1: ( rule__PAndSentence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getGroup_1()); 
            }
            // InternalL.g:6444:1: ( rule__PAndSentence__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalL.g:6444:2: rule__PAndSentence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__PAndSentence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group__1__Impl"


    // $ANTLR start "rule__PAndSentence__Group_1__0"
    // InternalL.g:6458:1: rule__PAndSentence__Group_1__0 : rule__PAndSentence__Group_1__0__Impl rule__PAndSentence__Group_1__1 ;
    public final void rule__PAndSentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6462:1: ( rule__PAndSentence__Group_1__0__Impl rule__PAndSentence__Group_1__1 )
            // InternalL.g:6463:2: rule__PAndSentence__Group_1__0__Impl rule__PAndSentence__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__PAndSentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__0"


    // $ANTLR start "rule__PAndSentence__Group_1__0__Impl"
    // InternalL.g:6470:1: rule__PAndSentence__Group_1__0__Impl : ( () ) ;
    public final void rule__PAndSentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6474:1: ( ( () ) )
            // InternalL.g:6475:1: ( () )
            {
            // InternalL.g:6475:1: ( () )
            // InternalL.g:6476:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0()); 
            }
            // InternalL.g:6477:1: ()
            // InternalL.g:6479:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getPAndSentenceLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__0__Impl"


    // $ANTLR start "rule__PAndSentence__Group_1__1"
    // InternalL.g:6489:1: rule__PAndSentence__Group_1__1 : rule__PAndSentence__Group_1__1__Impl rule__PAndSentence__Group_1__2 ;
    public final void rule__PAndSentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6493:1: ( rule__PAndSentence__Group_1__1__Impl rule__PAndSentence__Group_1__2 )
            // InternalL.g:6494:2: rule__PAndSentence__Group_1__1__Impl rule__PAndSentence__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__PAndSentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__1"


    // $ANTLR start "rule__PAndSentence__Group_1__1__Impl"
    // InternalL.g:6501:1: rule__PAndSentence__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__PAndSentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6505:1: ( ( 'and' ) )
            // InternalL.g:6506:1: ( 'and' )
            {
            // InternalL.g:6506:1: ( 'and' )
            // InternalL.g:6507:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getAndKeyword_1_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__1__Impl"


    // $ANTLR start "rule__PAndSentence__Group_1__2"
    // InternalL.g:6520:1: rule__PAndSentence__Group_1__2 : rule__PAndSentence__Group_1__2__Impl ;
    public final void rule__PAndSentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6524:1: ( rule__PAndSentence__Group_1__2__Impl )
            // InternalL.g:6525:2: rule__PAndSentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PAndSentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__2"


    // $ANTLR start "rule__PAndSentence__Group_1__2__Impl"
    // InternalL.g:6531:1: rule__PAndSentence__Group_1__2__Impl : ( ( rule__PAndSentence__RightAssignment_1_2 ) ) ;
    public final void rule__PAndSentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6535:1: ( ( ( rule__PAndSentence__RightAssignment_1_2 ) ) )
            // InternalL.g:6536:1: ( ( rule__PAndSentence__RightAssignment_1_2 ) )
            {
            // InternalL.g:6536:1: ( ( rule__PAndSentence__RightAssignment_1_2 ) )
            // InternalL.g:6537:1: ( rule__PAndSentence__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getRightAssignment_1_2()); 
            }
            // InternalL.g:6538:1: ( rule__PAndSentence__RightAssignment_1_2 )
            // InternalL.g:6538:2: rule__PAndSentence__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PAndSentence__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__Group_1__2__Impl"


    // $ANTLR start "rule__PPrimarySentence__Group_1__0"
    // InternalL.g:6554:1: rule__PPrimarySentence__Group_1__0 : rule__PPrimarySentence__Group_1__0__Impl rule__PPrimarySentence__Group_1__1 ;
    public final void rule__PPrimarySentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6558:1: ( rule__PPrimarySentence__Group_1__0__Impl rule__PPrimarySentence__Group_1__1 )
            // InternalL.g:6559:2: rule__PPrimarySentence__Group_1__0__Impl rule__PPrimarySentence__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__PPrimarySentence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PPrimarySentence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__0"


    // $ANTLR start "rule__PPrimarySentence__Group_1__0__Impl"
    // InternalL.g:6566:1: rule__PPrimarySentence__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PPrimarySentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6570:1: ( ( '(' ) )
            // InternalL.g:6571:1: ( '(' )
            {
            // InternalL.g:6571:1: ( '(' )
            // InternalL.g:6572:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPPrimarySentenceAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__0__Impl"


    // $ANTLR start "rule__PPrimarySentence__Group_1__1"
    // InternalL.g:6585:1: rule__PPrimarySentence__Group_1__1 : rule__PPrimarySentence__Group_1__1__Impl rule__PPrimarySentence__Group_1__2 ;
    public final void rule__PPrimarySentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6589:1: ( rule__PPrimarySentence__Group_1__1__Impl rule__PPrimarySentence__Group_1__2 )
            // InternalL.g:6590:2: rule__PPrimarySentence__Group_1__1__Impl rule__PPrimarySentence__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__PPrimarySentence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PPrimarySentence__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__1"


    // $ANTLR start "rule__PPrimarySentence__Group_1__1__Impl"
    // InternalL.g:6597:1: rule__PPrimarySentence__Group_1__1__Impl : ( rulepOrSentence ) ;
    public final void rule__PPrimarySentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6601:1: ( ( rulepOrSentence ) )
            // InternalL.g:6602:1: ( rulepOrSentence )
            {
            // InternalL.g:6602:1: ( rulepOrSentence )
            // InternalL.g:6603:1: rulepOrSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPPrimarySentenceAccess().getPOrSentenceParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            rulepOrSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPPrimarySentenceAccess().getPOrSentenceParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__1__Impl"


    // $ANTLR start "rule__PPrimarySentence__Group_1__2"
    // InternalL.g:6614:1: rule__PPrimarySentence__Group_1__2 : rule__PPrimarySentence__Group_1__2__Impl ;
    public final void rule__PPrimarySentence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6618:1: ( rule__PPrimarySentence__Group_1__2__Impl )
            // InternalL.g:6619:2: rule__PPrimarySentence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PPrimarySentence__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__2"


    // $ANTLR start "rule__PPrimarySentence__Group_1__2__Impl"
    // InternalL.g:6625:1: rule__PPrimarySentence__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PPrimarySentence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6629:1: ( ( ')' ) )
            // InternalL.g:6630:1: ( ')' )
            {
            // InternalL.g:6630:1: ( ')' )
            // InternalL.g:6631:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPPrimarySentenceAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPrimarySentence__Group_1__2__Impl"


    // $ANTLR start "rule__PSentenceLiteral__Group_1__0"
    // InternalL.g:6650:1: rule__PSentenceLiteral__Group_1__0 : rule__PSentenceLiteral__Group_1__0__Impl rule__PSentenceLiteral__Group_1__1 ;
    public final void rule__PSentenceLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6654:1: ( rule__PSentenceLiteral__Group_1__0__Impl rule__PSentenceLiteral__Group_1__1 )
            // InternalL.g:6655:2: rule__PSentenceLiteral__Group_1__0__Impl rule__PSentenceLiteral__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__PSentenceLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSentenceLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSentenceLiteral__Group_1__0"


    // $ANTLR start "rule__PSentenceLiteral__Group_1__0__Impl"
    // InternalL.g:6662:1: rule__PSentenceLiteral__Group_1__0__Impl : ( 'not' ) ;
    public final void rule__PSentenceLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6666:1: ( ( 'not' ) )
            // InternalL.g:6667:1: ( 'not' )
            {
            // InternalL.g:6667:1: ( 'not' )
            // InternalL.g:6668:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceLiteralAccess().getNotKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceLiteralAccess().getNotKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSentenceLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__PSentenceLiteral__Group_1__1"
    // InternalL.g:6681:1: rule__PSentenceLiteral__Group_1__1 : rule__PSentenceLiteral__Group_1__1__Impl ;
    public final void rule__PSentenceLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6685:1: ( rule__PSentenceLiteral__Group_1__1__Impl )
            // InternalL.g:6686:2: rule__PSentenceLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PSentenceLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSentenceLiteral__Group_1__1"


    // $ANTLR start "rule__PSentenceLiteral__Group_1__1__Impl"
    // InternalL.g:6692:1: rule__PSentenceLiteral__Group_1__1__Impl : ( ruleBasicPredicateAtom ) ;
    public final void rule__PSentenceLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6696:1: ( ( ruleBasicPredicateAtom ) )
            // InternalL.g:6697:1: ( ruleBasicPredicateAtom )
            {
            // InternalL.g:6697:1: ( ruleBasicPredicateAtom )
            // InternalL.g:6698:1: ruleBasicPredicateAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSentenceLiteralAccess().getBasicPredicateAtomParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSentenceLiteralAccess().getBasicPredicateAtomParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSentenceLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__0"
    // InternalL.g:6713:1: rule__MaybeLiteral__Group__0 : rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1 ;
    public final void rule__MaybeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6717:1: ( rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1 )
            // InternalL.g:6718:2: rule__MaybeLiteral__Group__0__Impl rule__MaybeLiteral__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MaybeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaybeLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeLiteral__Group__0"


    // $ANTLR start "rule__MaybeLiteral__Group__0__Impl"
    // InternalL.g:6725:1: rule__MaybeLiteral__Group__0__Impl : ( 'maybe' ) ;
    public final void rule__MaybeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6729:1: ( ( 'maybe' ) )
            // InternalL.g:6730:1: ( 'maybe' )
            {
            // InternalL.g:6730:1: ( 'maybe' )
            // InternalL.g:6731:1: 'maybe'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaybeLiteralAccess().getMaybeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeLiteral__Group__0__Impl"


    // $ANTLR start "rule__MaybeLiteral__Group__1"
    // InternalL.g:6744:1: rule__MaybeLiteral__Group__1 : rule__MaybeLiteral__Group__1__Impl ;
    public final void rule__MaybeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6748:1: ( rule__MaybeLiteral__Group__1__Impl )
            // InternalL.g:6749:2: rule__MaybeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaybeLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeLiteral__Group__1"


    // $ANTLR start "rule__MaybeLiteral__Group__1__Impl"
    // InternalL.g:6755:1: rule__MaybeLiteral__Group__1__Impl : ( ruleBasicPredicateAtom ) ;
    public final void rule__MaybeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6759:1: ( ( ruleBasicPredicateAtom ) )
            // InternalL.g:6760:1: ( ruleBasicPredicateAtom )
            {
            // InternalL.g:6760:1: ( ruleBasicPredicateAtom )
            // InternalL.g:6761:1: ruleBasicPredicateAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaybeLiteralAccess().getBasicPredicateAtomParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaybeLiteralAccess().getBasicPredicateAtomParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeLiteral__Group__1__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__0"
    // InternalL.g:6776:1: rule__CardinalityConstraint__Group__0 : rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1 ;
    public final void rule__CardinalityConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6780:1: ( rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1 )
            // InternalL.g:6781:2: rule__CardinalityConstraint__Group__0__Impl rule__CardinalityConstraint__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__CardinalityConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__0"


    // $ANTLR start "rule__CardinalityConstraint__Group__0__Impl"
    // InternalL.g:6788:1: rule__CardinalityConstraint__Group__0__Impl : ( ( rule__CardinalityConstraint__LhsAssignment_0 ) ) ;
    public final void rule__CardinalityConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6792:1: ( ( ( rule__CardinalityConstraint__LhsAssignment_0 ) ) )
            // InternalL.g:6793:1: ( ( rule__CardinalityConstraint__LhsAssignment_0 ) )
            {
            // InternalL.g:6793:1: ( ( rule__CardinalityConstraint__LhsAssignment_0 ) )
            // InternalL.g:6794:1: ( rule__CardinalityConstraint__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getLhsAssignment_0()); 
            }
            // InternalL.g:6795:1: ( rule__CardinalityConstraint__LhsAssignment_0 )
            // InternalL.g:6795:2: rule__CardinalityConstraint__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__LhsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getLhsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__0__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__1"
    // InternalL.g:6805:1: rule__CardinalityConstraint__Group__1 : rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2 ;
    public final void rule__CardinalityConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6809:1: ( rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2 )
            // InternalL.g:6810:2: rule__CardinalityConstraint__Group__1__Impl rule__CardinalityConstraint__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__CardinalityConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__1"


    // $ANTLR start "rule__CardinalityConstraint__Group__1__Impl"
    // InternalL.g:6817:1: rule__CardinalityConstraint__Group__1__Impl : ( '<=' ) ;
    public final void rule__CardinalityConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6821:1: ( ( '<=' ) )
            // InternalL.g:6822:1: ( '<=' )
            {
            // InternalL.g:6822:1: ( '<=' )
            // InternalL.g:6823:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__1__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__2"
    // InternalL.g:6836:1: rule__CardinalityConstraint__Group__2 : rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3 ;
    public final void rule__CardinalityConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6840:1: ( rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3 )
            // InternalL.g:6841:2: rule__CardinalityConstraint__Group__2__Impl rule__CardinalityConstraint__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__CardinalityConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__2"


    // $ANTLR start "rule__CardinalityConstraint__Group__2__Impl"
    // InternalL.g:6848:1: rule__CardinalityConstraint__Group__2__Impl : ( '|' ) ;
    public final void rule__CardinalityConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6852:1: ( ( '|' ) )
            // InternalL.g:6853:1: ( '|' )
            {
            // InternalL.g:6853:1: ( '|' )
            // InternalL.g:6854:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__2__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__3"
    // InternalL.g:6867:1: rule__CardinalityConstraint__Group__3 : rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4 ;
    public final void rule__CardinalityConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6871:1: ( rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4 )
            // InternalL.g:6872:2: rule__CardinalityConstraint__Group__3__Impl rule__CardinalityConstraint__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CardinalityConstraint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__3"


    // $ANTLR start "rule__CardinalityConstraint__Group__3__Impl"
    // InternalL.g:6879:1: rule__CardinalityConstraint__Group__3__Impl : ( '{' ) ;
    public final void rule__CardinalityConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6883:1: ( ( '{' ) )
            // InternalL.g:6884:1: ( '{' )
            {
            // InternalL.g:6884:1: ( '{' )
            // InternalL.g:6885:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__3__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__4"
    // InternalL.g:6898:1: rule__CardinalityConstraint__Group__4 : rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5 ;
    public final void rule__CardinalityConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6902:1: ( rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5 )
            // InternalL.g:6903:2: rule__CardinalityConstraint__Group__4__Impl rule__CardinalityConstraint__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__CardinalityConstraint__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__4"


    // $ANTLR start "rule__CardinalityConstraint__Group__4__Impl"
    // InternalL.g:6910:1: rule__CardinalityConstraint__Group__4__Impl : ( ( rule__CardinalityConstraint__AtomAssignment_4 ) ) ;
    public final void rule__CardinalityConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6914:1: ( ( ( rule__CardinalityConstraint__AtomAssignment_4 ) ) )
            // InternalL.g:6915:1: ( ( rule__CardinalityConstraint__AtomAssignment_4 ) )
            {
            // InternalL.g:6915:1: ( ( rule__CardinalityConstraint__AtomAssignment_4 ) )
            // InternalL.g:6916:1: ( rule__CardinalityConstraint__AtomAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getAtomAssignment_4()); 
            }
            // InternalL.g:6917:1: ( rule__CardinalityConstraint__AtomAssignment_4 )
            // InternalL.g:6917:2: rule__CardinalityConstraint__AtomAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__AtomAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getAtomAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__4__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__5"
    // InternalL.g:6927:1: rule__CardinalityConstraint__Group__5 : rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6 ;
    public final void rule__CardinalityConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6931:1: ( rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6 )
            // InternalL.g:6932:2: rule__CardinalityConstraint__Group__5__Impl rule__CardinalityConstraint__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__CardinalityConstraint__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__5"


    // $ANTLR start "rule__CardinalityConstraint__Group__5__Impl"
    // InternalL.g:6939:1: rule__CardinalityConstraint__Group__5__Impl : ( '}' ) ;
    public final void rule__CardinalityConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6943:1: ( ( '}' ) )
            // InternalL.g:6944:1: ( '}' )
            {
            // InternalL.g:6944:1: ( '}' )
            // InternalL.g:6945:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__5__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__6"
    // InternalL.g:6958:1: rule__CardinalityConstraint__Group__6 : rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7 ;
    public final void rule__CardinalityConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6962:1: ( rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7 )
            // InternalL.g:6963:2: rule__CardinalityConstraint__Group__6__Impl rule__CardinalityConstraint__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__CardinalityConstraint__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__6"


    // $ANTLR start "rule__CardinalityConstraint__Group__6__Impl"
    // InternalL.g:6970:1: rule__CardinalityConstraint__Group__6__Impl : ( '|' ) ;
    public final void rule__CardinalityConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6974:1: ( ( '|' ) )
            // InternalL.g:6975:1: ( '|' )
            {
            // InternalL.g:6975:1: ( '|' )
            // InternalL.g:6976:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_6()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getVerticalLineKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__6__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__7"
    // InternalL.g:6989:1: rule__CardinalityConstraint__Group__7 : rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8 ;
    public final void rule__CardinalityConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:6993:1: ( rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8 )
            // InternalL.g:6994:2: rule__CardinalityConstraint__Group__7__Impl rule__CardinalityConstraint__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__CardinalityConstraint__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__7"


    // $ANTLR start "rule__CardinalityConstraint__Group__7__Impl"
    // InternalL.g:7001:1: rule__CardinalityConstraint__Group__7__Impl : ( '<=' ) ;
    public final void rule__CardinalityConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7005:1: ( ( '<=' ) )
            // InternalL.g:7006:1: ( '<=' )
            {
            // InternalL.g:7006:1: ( '<=' )
            // InternalL.g:7007:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_7()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getLessThanSignEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__7__Impl"


    // $ANTLR start "rule__CardinalityConstraint__Group__8"
    // InternalL.g:7020:1: rule__CardinalityConstraint__Group__8 : rule__CardinalityConstraint__Group__8__Impl ;
    public final void rule__CardinalityConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7024:1: ( rule__CardinalityConstraint__Group__8__Impl )
            // InternalL.g:7025:2: rule__CardinalityConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__8"


    // $ANTLR start "rule__CardinalityConstraint__Group__8__Impl"
    // InternalL.g:7031:1: rule__CardinalityConstraint__Group__8__Impl : ( ( rule__CardinalityConstraint__RhsAssignment_8 ) ) ;
    public final void rule__CardinalityConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7035:1: ( ( ( rule__CardinalityConstraint__RhsAssignment_8 ) ) )
            // InternalL.g:7036:1: ( ( rule__CardinalityConstraint__RhsAssignment_8 ) )
            {
            // InternalL.g:7036:1: ( ( rule__CardinalityConstraint__RhsAssignment_8 ) )
            // InternalL.g:7037:1: ( rule__CardinalityConstraint__RhsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getRhsAssignment_8()); 
            }
            // InternalL.g:7038:1: ( rule__CardinalityConstraint__RhsAssignment_8 )
            // InternalL.g:7038:2: rule__CardinalityConstraint__RhsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityConstraint__RhsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getRhsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalL.g:7066:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7070:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalL.g:7071:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalL.g:7078:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__HeadAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7082:1: ( ( ( rule__Rule__HeadAssignment_0 ) ) )
            // InternalL.g:7083:1: ( ( rule__Rule__HeadAssignment_0 ) )
            {
            // InternalL.g:7083:1: ( ( rule__Rule__HeadAssignment_0 ) )
            // InternalL.g:7084:1: ( rule__Rule__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getHeadAssignment_0()); 
            }
            // InternalL.g:7085:1: ( rule__Rule__HeadAssignment_0 )
            // InternalL.g:7085:2: rule__Rule__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__HeadAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getHeadAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalL.g:7095:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7099:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalL.g:7100:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalL.g:7107:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7111:1: ( ( ( rule__Rule__Group_1__0 )? ) )
            // InternalL.g:7112:1: ( ( rule__Rule__Group_1__0 )? )
            {
            // InternalL.g:7112:1: ( ( rule__Rule__Group_1__0 )? )
            // InternalL.g:7113:1: ( rule__Rule__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_1()); 
            }
            // InternalL.g:7114:1: ( rule__Rule__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalL.g:7114:2: rule__Rule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalL.g:7124:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7128:1: ( rule__Rule__Group__2__Impl )
            // InternalL.g:7129:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalL.g:7135:1: rule__Rule__Group__2__Impl : ( '.' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7139:1: ( ( '.' ) )
            // InternalL.g:7140:1: ( '.' )
            {
            // InternalL.g:7140:1: ( '.' )
            // InternalL.g:7141:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalL.g:7160:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7164:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalL.g:7165:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // InternalL.g:7172:1: rule__Rule__Group_1__0__Impl : ( ( rule__Rule__ConditionAssignment_1_0 ) ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7176:1: ( ( ( rule__Rule__ConditionAssignment_1_0 ) ) )
            // InternalL.g:7177:1: ( ( rule__Rule__ConditionAssignment_1_0 ) )
            {
            // InternalL.g:7177:1: ( ( rule__Rule__ConditionAssignment_1_0 ) )
            // InternalL.g:7178:1: ( rule__Rule__ConditionAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionAssignment_1_0()); 
            }
            // InternalL.g:7179:1: ( rule__Rule__ConditionAssignment_1_0 )
            // InternalL.g:7179:2: rule__Rule__ConditionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // InternalL.g:7189:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7193:1: ( rule__Rule__Group_1__1__Impl )
            // InternalL.g:7194:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // InternalL.g:7200:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__BodyAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7204:1: ( ( ( rule__Rule__BodyAssignment_1_1 ) ) )
            // InternalL.g:7205:1: ( ( rule__Rule__BodyAssignment_1_1 ) )
            {
            // InternalL.g:7205:1: ( ( rule__Rule__BodyAssignment_1_1 ) )
            // InternalL.g:7206:1: ( rule__Rule__BodyAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBodyAssignment_1_1()); 
            }
            // InternalL.g:7207:1: ( rule__Rule__BodyAssignment_1_1 )
            // InternalL.g:7207:2: rule__Rule__BodyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BodyAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBodyAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // InternalL.g:7222:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7226:1: ( ( ruleStatement ) )
            // InternalL.g:7227:1: ( ruleStatement )
            {
            // InternalL.g:7227:1: ( ruleStatement )
            // InternalL.g:7228:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Variable__IdentifierAssignment"
    // InternalL.g:7237:1: rule__Variable__IdentifierAssignment : ( RULE_UID ) ;
    public final void rule__Variable__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7241:1: ( ( RULE_UID ) )
            // InternalL.g:7242:1: ( RULE_UID )
            {
            // InternalL.g:7242:1: ( RULE_UID )
            // InternalL.g:7243:1: RULE_UID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 
            }
            match(input,RULE_UID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getIdentifierUIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__IdentifierAssignment"


    // $ANTLR start "rule__TypedVariable__NameAssignment_0"
    // InternalL.g:7252:1: rule__TypedVariable__NameAssignment_0 : ( RULE_LID ) ;
    public final void rule__TypedVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7256:1: ( ( RULE_LID ) )
            // InternalL.g:7257:1: ( RULE_LID )
            {
            // InternalL.g:7257:1: ( RULE_LID )
            // InternalL.g:7258:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getNameLIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getNameLIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__NameAssignment_0"


    // $ANTLR start "rule__TypedVariable__VarAssignment_1"
    // InternalL.g:7267:1: rule__TypedVariable__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__TypedVariable__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7271:1: ( ( ruleVariable ) )
            // InternalL.g:7272:1: ( ruleVariable )
            {
            // InternalL.g:7272:1: ( ruleVariable )
            // InternalL.g:7273:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getVarVariableParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__VarAssignment_1"


    // $ANTLR start "rule__Addition__RhsAssignment_1_2"
    // InternalL.g:7282:1: rule__Addition__RhsAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7286:1: ( ( ruleMultiplication ) )
            // InternalL.g:7287:1: ( ruleMultiplication )
            {
            // InternalL.g:7287:1: ( ruleMultiplication )
            // InternalL.g:7288:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RhsAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RhsAssignment_1_2"
    // InternalL.g:7297:1: rule__Multiplication__RhsAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7301:1: ( ( rulePrimary ) )
            // InternalL.g:7302:1: ( rulePrimary )
            {
            // InternalL.g:7302:1: ( rulePrimary )
            // InternalL.g:7303:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RhsAssignment_1_2"


    // $ANTLR start "rule__Primary__TermAssignment_0"
    // InternalL.g:7312:1: rule__Primary__TermAssignment_0 : ( ruleArithmeticLiteral ) ;
    public final void rule__Primary__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7316:1: ( ( ruleArithmeticLiteral ) )
            // InternalL.g:7317:1: ( ruleArithmeticLiteral )
            {
            // InternalL.g:7317:1: ( ruleArithmeticLiteral )
            // InternalL.g:7318:1: ruleArithmeticLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getTermArithmeticLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getTermArithmeticLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__TermAssignment_0"


    // $ANTLR start "rule__Primary__TermAssignment_1_1"
    // InternalL.g:7327:1: rule__Primary__TermAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Primary__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7331:1: ( ( ruleAddition ) )
            // InternalL.g:7332:1: ( ruleAddition )
            {
            // InternalL.g:7332:1: ( ruleAddition )
            // InternalL.g:7333:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__TermAssignment_1_1"


    // $ANTLR start "rule__ArithmeticLiteral__VAssignment_0"
    // InternalL.g:7342:1: rule__ArithmeticLiteral__VAssignment_0 : ( ruleVariable ) ;
    public final void rule__ArithmeticLiteral__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7346:1: ( ( ruleVariable ) )
            // InternalL.g:7347:1: ( ruleVariable )
            {
            // InternalL.g:7347:1: ( ruleVariable )
            // InternalL.g:7348:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralAccess().getVVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralAccess().getVVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticLiteral__VAssignment_0"


    // $ANTLR start "rule__ArithmeticLiteral__TvAssignment_1"
    // InternalL.g:7357:1: rule__ArithmeticLiteral__TvAssignment_1 : ( ruleTypedVariable ) ;
    public final void rule__ArithmeticLiteral__TvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7361:1: ( ( ruleTypedVariable ) )
            // InternalL.g:7362:1: ( ruleTypedVariable )
            {
            // InternalL.g:7362:1: ( ruleTypedVariable )
            // InternalL.g:7363:1: ruleTypedVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralAccess().getTvTypedVariableParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralAccess().getTvTypedVariableParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticLiteral__TvAssignment_1"


    // $ANTLR start "rule__ArithmeticLiteral__ConstAssignment_2"
    // InternalL.g:7372:1: rule__ArithmeticLiteral__ConstAssignment_2 : ( RULE_LID ) ;
    public final void rule__ArithmeticLiteral__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7376:1: ( ( RULE_LID ) )
            // InternalL.g:7377:1: ( RULE_LID )
            {
            // InternalL.g:7377:1: ( RULE_LID )
            // InternalL.g:7378:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralAccess().getConstLIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralAccess().getConstLIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticLiteral__ConstAssignment_2"


    // $ANTLR start "rule__ArithmeticLiteral__ValueAssignment_3"
    // InternalL.g:7387:1: rule__ArithmeticLiteral__ValueAssignment_3 : ( RULE_NUMERIC_CONSTANT ) ;
    public final void rule__ArithmeticLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7391:1: ( ( RULE_NUMERIC_CONSTANT ) )
            // InternalL.g:7392:1: ( RULE_NUMERIC_CONSTANT )
            {
            // InternalL.g:7392:1: ( RULE_NUMERIC_CONSTANT )
            // InternalL.g:7393:1: RULE_NUMERIC_CONSTANT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_NUMERIC_CONSTANT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticLiteral__ValueAssignment_3"


    // $ANTLR start "rule__GroundAddition__RhsAssignment_1_2"
    // InternalL.g:7402:1: rule__GroundAddition__RhsAssignment_1_2 : ( ruleGroundMultiplication ) ;
    public final void rule__GroundAddition__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7406:1: ( ( ruleGroundMultiplication ) )
            // InternalL.g:7407:1: ( ruleGroundMultiplication )
            {
            // InternalL.g:7407:1: ( ruleGroundMultiplication )
            // InternalL.g:7408:1: ruleGroundMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundAdditionAccess().getRhsGroundMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundAdditionAccess().getRhsGroundMultiplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundAddition__RhsAssignment_1_2"


    // $ANTLR start "rule__GroundMultiplication__RhsAssignment_1_2"
    // InternalL.g:7417:1: rule__GroundMultiplication__RhsAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__GroundMultiplication__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7421:1: ( ( rulePrimary ) )
            // InternalL.g:7422:1: ( rulePrimary )
            {
            // InternalL.g:7422:1: ( rulePrimary )
            // InternalL.g:7423:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundMultiplicationAccess().getRhsPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundMultiplication__RhsAssignment_1_2"


    // $ANTLR start "rule__GroundPrimary__TermAssignment_0"
    // InternalL.g:7432:1: rule__GroundPrimary__TermAssignment_0 : ( ruleGroundArithmeticLiteral ) ;
    public final void rule__GroundPrimary__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7436:1: ( ( ruleGroundArithmeticLiteral ) )
            // InternalL.g:7437:1: ( ruleGroundArithmeticLiteral )
            {
            // InternalL.g:7437:1: ( ruleGroundArithmeticLiteral )
            // InternalL.g:7438:1: ruleGroundArithmeticLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getTermGroundArithmeticLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundArithmeticLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getTermGroundArithmeticLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__TermAssignment_0"


    // $ANTLR start "rule__GroundPrimary__TermAssignment_1_1"
    // InternalL.g:7447:1: rule__GroundPrimary__TermAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__GroundPrimary__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7451:1: ( ( ruleAddition ) )
            // InternalL.g:7452:1: ( ruleAddition )
            {
            // InternalL.g:7452:1: ( ruleAddition )
            // InternalL.g:7453:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundPrimaryAccess().getTermAdditionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundPrimary__TermAssignment_1_1"


    // $ANTLR start "rule__GroundArithmeticLiteral__IdentifierAssignment_0"
    // InternalL.g:7462:1: rule__GroundArithmeticLiteral__IdentifierAssignment_0 : ( RULE_LID ) ;
    public final void rule__GroundArithmeticLiteral__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7466:1: ( ( RULE_LID ) )
            // InternalL.g:7467:1: ( RULE_LID )
            {
            // InternalL.g:7467:1: ( RULE_LID )
            // InternalL.g:7468:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierLIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticLiteralAccess().getIdentifierLIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundArithmeticLiteral__IdentifierAssignment_0"


    // $ANTLR start "rule__GroundArithmeticLiteral__ValueAssignment_1"
    // InternalL.g:7477:1: rule__GroundArithmeticLiteral__ValueAssignment_1 : ( RULE_NUMERIC_CONSTANT ) ;
    public final void rule__GroundArithmeticLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7481:1: ( ( RULE_NUMERIC_CONSTANT ) )
            // InternalL.g:7482:1: ( RULE_NUMERIC_CONSTANT )
            {
            // InternalL.g:7482:1: ( RULE_NUMERIC_CONSTANT )
            // InternalL.g:7483:1: RULE_NUMERIC_CONSTANT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NUMERIC_CONSTANT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundArithmeticLiteralAccess().getValueNUMERIC_CONSTANTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundArithmeticLiteral__ValueAssignment_1"


    // $ANTLR start "rule__BasicTerms__CarAssignment_0"
    // InternalL.g:7492:1: rule__BasicTerms__CarAssignment_0 : ( ruleBasicTerm ) ;
    public final void rule__BasicTerms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7496:1: ( ( ruleBasicTerm ) )
            // InternalL.g:7497:1: ( ruleBasicTerm )
            {
            // InternalL.g:7497:1: ( ruleBasicTerm )
            // InternalL.g:7498:1: ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getCarBasicTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__CarAssignment_0"


    // $ANTLR start "rule__BasicTerms__CdrAssignment_1_1"
    // InternalL.g:7507:1: rule__BasicTerms__CdrAssignment_1_1 : ( ruleBasicTerm ) ;
    public final void rule__BasicTerms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7511:1: ( ( ruleBasicTerm ) )
            // InternalL.g:7512:1: ( ruleBasicTerm )
            {
            // InternalL.g:7512:1: ( ruleBasicTerm )
            // InternalL.g:7513:1: ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTermsAccess().getCdrBasicTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTerms__CdrAssignment_1_1"


    // $ANTLR start "rule__GroundTerms__CarAssignment_0"
    // InternalL.g:7522:1: rule__GroundTerms__CarAssignment_0 : ( ruleGroundTerm ) ;
    public final void rule__GroundTerms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7526:1: ( ( ruleGroundTerm ) )
            // InternalL.g:7527:1: ( ruleGroundTerm )
            {
            // InternalL.g:7527:1: ( ruleGroundTerm )
            // InternalL.g:7528:1: ruleGroundTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getCarGroundTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getCarGroundTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__CarAssignment_0"


    // $ANTLR start "rule__GroundTerms__CdrAssignment_1_1"
    // InternalL.g:7537:1: rule__GroundTerms__CdrAssignment_1_1 : ( ruleGroundTerm ) ;
    public final void rule__GroundTerms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7541:1: ( ( ruleGroundTerm ) )
            // InternalL.g:7542:1: ( ruleGroundTerm )
            {
            // InternalL.g:7542:1: ( ruleGroundTerm )
            // InternalL.g:7543:1: ruleGroundTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroundTermsAccess().getCdrGroundTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroundTermsAccess().getCdrGroundTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundTerms__CdrAssignment_1_1"


    // $ANTLR start "rule__UniversalQuantifiedTerm__NameAssignment_1"
    // InternalL.g:7552:1: rule__UniversalQuantifiedTerm__NameAssignment_1 : ( ruleTypeId ) ;
    public final void rule__UniversalQuantifiedTerm__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7556:1: ( ( ruleTypeId ) )
            // InternalL.g:7557:1: ( ruleTypeId )
            {
            // InternalL.g:7557:1: ( ruleTypeId )
            // InternalL.g:7558:1: ruleTypeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalQuantifiedTerm__NameAssignment_1"


    // $ANTLR start "rule__ExistentialQuantifiedTerm__NameAssignment_1"
    // InternalL.g:7567:1: rule__ExistentialQuantifiedTerm__NameAssignment_1 : ( ruleTypeId ) ;
    public final void rule__ExistentialQuantifiedTerm__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7571:1: ( ( ruleTypeId ) )
            // InternalL.g:7572:1: ( ruleTypeId )
            {
            // InternalL.g:7572:1: ( ruleTypeId )
            // InternalL.g:7573:1: ruleTypeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistentialQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistentialQuantifiedTermAccess().getNameTypeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistentialQuantifiedTerm__NameAssignment_1"


    // $ANTLR start "rule__Terms__CarAssignment_0"
    // InternalL.g:7582:1: rule__Terms__CarAssignment_0 : ( ruleTerm ) ;
    public final void rule__Terms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7586:1: ( ( ruleTerm ) )
            // InternalL.g:7587:1: ( ruleTerm )
            {
            // InternalL.g:7587:1: ( ruleTerm )
            // InternalL.g:7588:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getCarTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__CarAssignment_0"


    // $ANTLR start "rule__Terms__CdrAssignment_1_1"
    // InternalL.g:7597:1: rule__Terms__CdrAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__Terms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7601:1: ( ( ruleTerm ) )
            // InternalL.g:7602:1: ( ruleTerm )
            {
            // InternalL.g:7602:1: ( ruleTerm )
            // InternalL.g:7603:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermsAccess().getCdrTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terms__CdrAssignment_1_1"


    // $ANTLR start "rule__ConstantDeclaration__NameAssignment_1"
    // InternalL.g:7612:1: rule__ConstantDeclaration__NameAssignment_1 : ( RULE_LID ) ;
    public final void rule__ConstantDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7616:1: ( ( RULE_LID ) )
            // InternalL.g:7617:1: ( RULE_LID )
            {
            // InternalL.g:7617:1: ( RULE_LID )
            // InternalL.g:7618:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getNameLIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getNameLIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ConstantDeclaration__CvAssignment_3"
    // InternalL.g:7627:1: rule__ConstantDeclaration__CvAssignment_3 : ( ruleGroundArithmeticTerm ) ;
    public final void rule__ConstantDeclaration__CvAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7631:1: ( ( ruleGroundArithmeticTerm ) )
            // InternalL.g:7632:1: ( ruleGroundArithmeticTerm )
            {
            // InternalL.g:7632:1: ( ruleGroundArithmeticTerm )
            // InternalL.g:7633:1: ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclarationAccess().getCvGroundArithmeticTermParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclarationAccess().getCvGroundArithmeticTermParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDeclaration__CvAssignment_3"


    // $ANTLR start "rule__TypeId__NameAssignment"
    // InternalL.g:7642:1: rule__TypeId__NameAssignment : ( RULE_LID ) ;
    public final void rule__TypeId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7646:1: ( ( RULE_LID ) )
            // InternalL.g:7647:1: ( RULE_LID )
            {
            // InternalL.g:7647:1: ( RULE_LID )
            // InternalL.g:7648:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdAccess().getNameLIDTerminalRuleCall_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdAccess().getNameLIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__NameAssignment"


    // $ANTLR start "rule__TypeDeclaration__NameAssignment_1"
    // InternalL.g:7657:1: rule__TypeDeclaration__NameAssignment_1 : ( ruleTypeId ) ;
    public final void rule__TypeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7661:1: ( ( ruleTypeId ) )
            // InternalL.g:7662:1: ( ruleTypeId )
            {
            // InternalL.g:7662:1: ( ruleTypeId )
            // InternalL.g:7663:1: ruleTypeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getNameTypeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getNameTypeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__TypeDeclaration__ExpAssignment_3"
    // InternalL.g:7672:1: rule__TypeDeclaration__ExpAssignment_3 : ( ruleSetExpression ) ;
    public final void rule__TypeDeclaration__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7676:1: ( ( ruleSetExpression ) )
            // InternalL.g:7677:1: ( ruleSetExpression )
            {
            // InternalL.g:7677:1: ( ruleSetExpression )
            // InternalL.g:7678:1: ruleSetExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getExpSetExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__ExpAssignment_3"


    // $ANTLR start "rule__Limit__CvAssignment"
    // InternalL.g:7687:1: rule__Limit__CvAssignment : ( ruleGroundArithmeticTerm ) ;
    public final void rule__Limit__CvAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7691:1: ( ( ruleGroundArithmeticTerm ) )
            // InternalL.g:7692:1: ( ruleGroundArithmeticTerm )
            {
            // InternalL.g:7692:1: ( ruleGroundArithmeticTerm )
            // InternalL.g:7693:1: ruleGroundArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLimitAccess().getCvGroundArithmeticTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundArithmeticTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLimitAccess().getCvGroundArithmeticTermParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__CvAssignment"


    // $ANTLR start "rule__Set__LhsAssignment_0"
    // InternalL.g:7702:1: rule__Set__LhsAssignment_0 : ( ( '{' ) ) ;
    public final void rule__Set__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7706:1: ( ( ( '{' ) ) )
            // InternalL.g:7707:1: ( ( '{' ) )
            {
            // InternalL.g:7707:1: ( ( '{' ) )
            // InternalL.g:7708:1: ( '{' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0()); 
            }
            // InternalL.g:7709:1: ( '{' )
            // InternalL.g:7710:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getLhsLeftCurlyBracketKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__LhsAssignment_0"


    // $ANTLR start "rule__Set__TermsAssignment_1"
    // InternalL.g:7725:1: rule__Set__TermsAssignment_1 : ( ruleGroundTerms ) ;
    public final void rule__Set__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7729:1: ( ( ruleGroundTerms ) )
            // InternalL.g:7730:1: ( ruleGroundTerms )
            {
            // InternalL.g:7730:1: ( ruleGroundTerms )
            // InternalL.g:7731:1: ruleGroundTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getTermsGroundTermsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroundTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getTermsGroundTermsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__TermsAssignment_1"


    // $ANTLR start "rule__Range__LhsAssignment_1"
    // InternalL.g:7740:1: rule__Range__LhsAssignment_1 : ( ruleLimit ) ;
    public final void rule__Range__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7744:1: ( ( ruleLimit ) )
            // InternalL.g:7745:1: ( ruleLimit )
            {
            // InternalL.g:7745:1: ( ruleLimit )
            // InternalL.g:7746:1: ruleLimit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLhsLimitParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLhsLimitParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LhsAssignment_1"


    // $ANTLR start "rule__Range__RhsAssignment_4"
    // InternalL.g:7755:1: rule__Range__RhsAssignment_4 : ( ruleLimit ) ;
    public final void rule__Range__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7759:1: ( ( ruleLimit ) )
            // InternalL.g:7760:1: ( ruleLimit )
            {
            // InternalL.g:7760:1: ( ruleLimit )
            // InternalL.g:7761:1: ruleLimit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getRhsLimitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getRhsLimitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__RhsAssignment_4"


    // $ANTLR start "rule__SetConstruct__LhsAssignment_0"
    // InternalL.g:7770:1: rule__SetConstruct__LhsAssignment_0 : ( ruleBasicTerm ) ;
    public final void rule__SetConstruct__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7774:1: ( ( ruleBasicTerm ) )
            // InternalL.g:7775:1: ( ruleBasicTerm )
            {
            // InternalL.g:7775:1: ( ruleBasicTerm )
            // InternalL.g:7776:1: ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getLhsBasicTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getLhsBasicTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__LhsAssignment_0"


    // $ANTLR start "rule__SetConstruct__RhsAssignment_2"
    // InternalL.g:7785:1: rule__SetConstruct__RhsAssignment_2 : ( ruleTVars ) ;
    public final void rule__SetConstruct__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7789:1: ( ( ruleTVars ) )
            // InternalL.g:7790:1: ( ruleTVars )
            {
            // InternalL.g:7790:1: ( ruleTVars )
            // InternalL.g:7791:1: ruleTVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetConstructAccess().getRhsTVarsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetConstructAccess().getRhsTVarsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetConstruct__RhsAssignment_2"


    // $ANTLR start "rule__TVars__CarAssignment_0"
    // InternalL.g:7800:1: rule__TVars__CarAssignment_0 : ( ruleTVar ) ;
    public final void rule__TVars__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7804:1: ( ( ruleTVar ) )
            // InternalL.g:7805:1: ( ruleTVar )
            {
            // InternalL.g:7805:1: ( ruleTVar )
            // InternalL.g:7806:1: ruleTVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getCarTVarParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__CarAssignment_0"


    // $ANTLR start "rule__TVars__CdrAssignment_1_1"
    // InternalL.g:7815:1: rule__TVars__CdrAssignment_1_1 : ( ruleTVar ) ;
    public final void rule__TVars__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7819:1: ( ( ruleTVar ) )
            // InternalL.g:7820:1: ( ruleTVar )
            {
            // InternalL.g:7820:1: ( ruleTVar )
            // InternalL.g:7821:1: ruleTVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarsAccess().getCdrTVarParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVars__CdrAssignment_1_1"


    // $ANTLR start "rule__TVar__VarAssignment_0"
    // InternalL.g:7830:1: rule__TVar__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__TVar__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7834:1: ( ( ruleVariable ) )
            // InternalL.g:7835:1: ( ruleVariable )
            {
            // InternalL.g:7835:1: ( ruleVariable )
            // InternalL.g:7836:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getVarVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getVarVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__VarAssignment_0"


    // $ANTLR start "rule__TVar__IdAssignment_2"
    // InternalL.g:7845:1: rule__TVar__IdAssignment_2 : ( ruleTypeId ) ;
    public final void rule__TVar__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7849:1: ( ( ruleTypeId ) )
            // InternalL.g:7850:1: ( ruleTypeId )
            {
            // InternalL.g:7850:1: ( ruleTypeId )
            // InternalL.g:7851:1: ruleTypeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTVarAccess().getIdTypeIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTVarAccess().getIdTypeIdParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TVar__IdAssignment_2"


    // $ANTLR start "rule__SetAddition__RightAssignment_1_2"
    // InternalL.g:7860:1: rule__SetAddition__RightAssignment_1_2 : ( ruleSetMultiplication ) ;
    public final void rule__SetAddition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7864:1: ( ( ruleSetMultiplication ) )
            // InternalL.g:7865:1: ( ruleSetMultiplication )
            {
            // InternalL.g:7865:1: ( ruleSetMultiplication )
            // InternalL.g:7866:1: ruleSetMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAdditionAccess().getRightSetMultiplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAddition__RightAssignment_1_2"


    // $ANTLR start "rule__SetMultiplication__RightAssignment_1_2"
    // InternalL.g:7875:1: rule__SetMultiplication__RightAssignment_1_2 : ( ruleSetPrimary ) ;
    public final void rule__SetMultiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7879:1: ( ( ruleSetPrimary ) )
            // InternalL.g:7880:1: ( ruleSetPrimary )
            {
            // InternalL.g:7880:1: ( ruleSetPrimary )
            // InternalL.g:7881:1: ruleSetPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetMultiplicationAccess().getRightSetPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetMultiplication__RightAssignment_1_2"


    // $ANTLR start "rule__PredicateAtom__FidAssignment_0"
    // InternalL.g:7890:1: rule__PredicateAtom__FidAssignment_0 : ( RULE_LID ) ;
    public final void rule__PredicateAtom__FidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7894:1: ( ( RULE_LID ) )
            // InternalL.g:7895:1: ( RULE_LID )
            {
            // InternalL.g:7895:1: ( RULE_LID )
            // InternalL.g:7896:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__FidAssignment_0"


    // $ANTLR start "rule__PredicateAtom__TermsAssignment_1_1"
    // InternalL.g:7905:1: rule__PredicateAtom__TermsAssignment_1_1 : ( ruleTerms ) ;
    public final void rule__PredicateAtom__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7909:1: ( ( ruleTerms ) )
            // InternalL.g:7910:1: ( ruleTerms )
            {
            // InternalL.g:7910:1: ( ruleTerms )
            // InternalL.g:7911:1: ruleTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateAtom__TermsAssignment_1_1"


    // $ANTLR start "rule__BasicPredicateAtom__FidAssignment_0"
    // InternalL.g:7920:1: rule__BasicPredicateAtom__FidAssignment_0 : ( RULE_LID ) ;
    public final void rule__BasicPredicateAtom__FidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7924:1: ( ( RULE_LID ) )
            // InternalL.g:7925:1: ( RULE_LID )
            {
            // InternalL.g:7925:1: ( RULE_LID )
            // InternalL.g:7926:1: RULE_LID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_LID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getFidLIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__FidAssignment_0"


    // $ANTLR start "rule__BasicPredicateAtom__TermsAssignment_1_1"
    // InternalL.g:7935:1: rule__BasicPredicateAtom__TermsAssignment_1_1 : ( ruleBasicTerms ) ;
    public final void rule__BasicPredicateAtom__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7939:1: ( ( ruleBasicTerms ) )
            // InternalL.g:7940:1: ( ruleBasicTerms )
            {
            // InternalL.g:7940:1: ( ruleBasicTerms )
            // InternalL.g:7941:1: ruleBasicTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPredicateAtomAccess().getTermsBasicTermsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicPredicateAtom__TermsAssignment_1_1"


    // $ANTLR start "rule__BuiltInAtom__LhsAssignment_0"
    // InternalL.g:7950:1: rule__BuiltInAtom__LhsAssignment_0 : ( ruleBasicTerm ) ;
    public final void rule__BuiltInAtom__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7954:1: ( ( ruleBasicTerm ) )
            // InternalL.g:7955:1: ( ruleBasicTerm )
            {
            // InternalL.g:7955:1: ( ruleBasicTerm )
            // InternalL.g:7956:1: ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getLhsBasicTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__LhsAssignment_0"


    // $ANTLR start "rule__BuiltInAtom__OpAssignment_1"
    // InternalL.g:7965:1: rule__BuiltInAtom__OpAssignment_1 : ( ruleAtomOp ) ;
    public final void rule__BuiltInAtom__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7969:1: ( ( ruleAtomOp ) )
            // InternalL.g:7970:1: ( ruleAtomOp )
            {
            // InternalL.g:7970:1: ( ruleAtomOp )
            // InternalL.g:7971:1: ruleAtomOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getOpAtomOpParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__OpAssignment_1"


    // $ANTLR start "rule__BuiltInAtom__RhsAssignment_2"
    // InternalL.g:7980:1: rule__BuiltInAtom__RhsAssignment_2 : ( ruleBasicTerm ) ;
    public final void rule__BuiltInAtom__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7984:1: ( ( ruleBasicTerm ) )
            // InternalL.g:7985:1: ( ruleBasicTerm )
            {
            // InternalL.g:7985:1: ( ruleBasicTerm )
            // InternalL.g:7986:1: ruleBasicTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInAtomAccess().getRhsBasicTermParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInAtom__RhsAssignment_2"


    // $ANTLR start "rule__OrSentence__RightAssignment_1_2"
    // InternalL.g:7995:1: rule__OrSentence__RightAssignment_1_2 : ( ruleAndSentence ) ;
    public final void rule__OrSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:7999:1: ( ( ruleAndSentence ) )
            // InternalL.g:8000:1: ( ruleAndSentence )
            {
            // InternalL.g:8000:1: ( ruleAndSentence )
            // InternalL.g:8001:1: ruleAndSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrSentenceAccess().getRightAndSentenceParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrSentence__RightAssignment_1_2"


    // $ANTLR start "rule__AndSentence__RightAssignment_1_2"
    // InternalL.g:8010:1: rule__AndSentence__RightAssignment_1_2 : ( rulePrimarySentence ) ;
    public final void rule__AndSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8014:1: ( ( rulePrimarySentence ) )
            // InternalL.g:8015:1: ( rulePrimarySentence )
            {
            // InternalL.g:8015:1: ( rulePrimarySentence )
            // InternalL.g:8016:1: rulePrimarySentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndSentenceAccess().getRightPrimarySentenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndSentenceAccess().getRightPrimarySentenceParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndSentence__RightAssignment_1_2"


    // $ANTLR start "rule__POrSentence__RightAssignment_1_2"
    // InternalL.g:8025:1: rule__POrSentence__RightAssignment_1_2 : ( rulepAndSentence ) ;
    public final void rule__POrSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8029:1: ( ( rulepAndSentence ) )
            // InternalL.g:8030:1: ( rulepAndSentence )
            {
            // InternalL.g:8030:1: ( rulepAndSentence )
            // InternalL.g:8031:1: rulepAndSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPOrSentenceAccess().getRightPAndSentenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepAndSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPOrSentenceAccess().getRightPAndSentenceParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POrSentence__RightAssignment_1_2"


    // $ANTLR start "rule__PAndSentence__RightAssignment_1_2"
    // InternalL.g:8040:1: rule__PAndSentence__RightAssignment_1_2 : ( rulepPrimarySentence ) ;
    public final void rule__PAndSentence__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8044:1: ( ( rulepPrimarySentence ) )
            // InternalL.g:8045:1: ( rulepPrimarySentence )
            {
            // InternalL.g:8045:1: ( rulepPrimarySentence )
            // InternalL.g:8046:1: rulepPrimarySentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPAndSentenceAccess().getRightPPrimarySentenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepPrimarySentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPAndSentenceAccess().getRightPPrimarySentenceParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAndSentence__RightAssignment_1_2"


    // $ANTLR start "rule__CardinalityConstraint__LhsAssignment_0"
    // InternalL.g:8055:1: rule__CardinalityConstraint__LhsAssignment_0 : ( ruleBound ) ;
    public final void rule__CardinalityConstraint__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8059:1: ( ( ruleBound ) )
            // InternalL.g:8060:1: ( ruleBound )
            {
            // InternalL.g:8060:1: ( ruleBound )
            // InternalL.g:8061:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getLhsBoundParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__LhsAssignment_0"


    // $ANTLR start "rule__CardinalityConstraint__AtomAssignment_4"
    // InternalL.g:8070:1: rule__CardinalityConstraint__AtomAssignment_4 : ( ruleBasicPredicateAtom ) ;
    public final void rule__CardinalityConstraint__AtomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8074:1: ( ( ruleBasicPredicateAtom ) )
            // InternalL.g:8075:1: ( ruleBasicPredicateAtom )
            {
            // InternalL.g:8075:1: ( ruleBasicPredicateAtom )
            // InternalL.g:8076:1: ruleBasicPredicateAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getAtomBasicPredicateAtomParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicPredicateAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getAtomBasicPredicateAtomParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__AtomAssignment_4"


    // $ANTLR start "rule__CardinalityConstraint__RhsAssignment_8"
    // InternalL.g:8085:1: rule__CardinalityConstraint__RhsAssignment_8 : ( ruleBound ) ;
    public final void rule__CardinalityConstraint__RhsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8089:1: ( ( ruleBound ) )
            // InternalL.g:8090:1: ( ruleBound )
            {
            // InternalL.g:8090:1: ( ruleBound )
            // InternalL.g:8091:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityConstraintAccess().getRhsBoundParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityConstraint__RhsAssignment_8"


    // $ANTLR start "rule__Bound__AvAssignment"
    // InternalL.g:8100:1: rule__Bound__AvAssignment : ( ruleArithmeticTerm ) ;
    public final void rule__Bound__AvAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8104:1: ( ( ruleArithmeticTerm ) )
            // InternalL.g:8105:1: ( ruleArithmeticTerm )
            {
            // InternalL.g:8105:1: ( ruleArithmeticTerm )
            // InternalL.g:8106:1: ruleArithmeticTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundAccess().getAvArithmeticTermParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__AvAssignment"


    // $ANTLR start "rule__Rule__HeadAssignment_0"
    // InternalL.g:8115:1: rule__Rule__HeadAssignment_0 : ( ruleHead ) ;
    public final void rule__Rule__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8119:1: ( ( ruleHead ) )
            // InternalL.g:8120:1: ( ruleHead )
            {
            // InternalL.g:8120:1: ( ruleHead )
            // InternalL.g:8121:1: ruleHead
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getHeadHeadParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__HeadAssignment_0"


    // $ANTLR start "rule__Rule__ConditionAssignment_1_0"
    // InternalL.g:8130:1: rule__Rule__ConditionAssignment_1_0 : ( ( 'if' ) ) ;
    public final void rule__Rule__ConditionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8134:1: ( ( ( 'if' ) ) )
            // InternalL.g:8135:1: ( ( 'if' ) )
            {
            // InternalL.g:8135:1: ( ( 'if' ) )
            // InternalL.g:8136:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0()); 
            }
            // InternalL.g:8137:1: ( 'if' )
            // InternalL.g:8138:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionIfKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_1_0"


    // $ANTLR start "rule__Rule__BodyAssignment_1_1"
    // InternalL.g:8153:1: rule__Rule__BodyAssignment_1_1 : ( ruleSentence ) ;
    public final void rule__Rule__BodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalL.g:8157:1: ( ( ruleSentence ) )
            // InternalL.g:8158:1: ( ruleSentence )
            {
            // InternalL.g:8158:1: ( ruleSentence )
            // InternalL.g:8159:1: ruleSentence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBodySentenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BodyAssignment_1_1"

    // $ANTLR start synpred2_InternalL
    public final void synpred2_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:1746:1: ( ( ruleTypedVariable ) )
        // InternalL.g:1746:1: ( ruleTypedVariable )
        {
        // InternalL.g:1746:1: ( ruleTypedVariable )
        // InternalL.g:1747:1: ruleTypedVariable
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBasicTermAccess().getTypedVariableParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleTypedVariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalL

    // $ANTLR start synpred3_InternalL
    public final void synpred3_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:1752:6: ( ( ruleArithmeticTerm ) )
        // InternalL.g:1752:6: ( ruleArithmeticTerm )
        {
        // InternalL.g:1752:6: ( ruleArithmeticTerm )
        // InternalL.g:1753:1: ruleArithmeticTerm
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBasicTermAccess().getArithmeticTermParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleArithmeticTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalL

    // $ANTLR start synpred20_InternalL
    public final void synpred20_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2086:1: ( ( ruleSetLiteral ) )
        // InternalL.g:2086:1: ( ruleSetLiteral )
        {
        // InternalL.g:2086:1: ( ruleSetLiteral )
        // InternalL.g:2087:1: ruleSetLiteral
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSetPrimaryAccess().getSetLiteralParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSetLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalL

    // $ANTLR start synpred21_InternalL
    public final void synpred21_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2108:1: ( ( ruleSet ) )
        // InternalL.g:2108:1: ( ruleSet )
        {
        // InternalL.g:2108:1: ( ruleSet )
        // InternalL.g:2109:1: ruleSet
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSetLiteralAccess().getSetParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSet();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalL

    // $ANTLR start synpred22_InternalL
    public final void synpred22_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2114:6: ( ( ruleRange ) )
        // InternalL.g:2114:6: ( ruleRange )
        {
        // InternalL.g:2114:6: ( ruleRange )
        // InternalL.g:2115:1: ruleRange
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSetLiteralAccess().getRangeParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleRange();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalL

    // $ANTLR start synpred23_InternalL
    public final void synpred23_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2120:6: ( ( ruleSetConstruct ) )
        // InternalL.g:2120:6: ( ruleSetConstruct )
        {
        // InternalL.g:2120:6: ( ruleSetConstruct )
        // InternalL.g:2121:1: ruleSetConstruct
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSetLiteralAccess().getSetConstructParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleSetConstruct();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalL

    // $ANTLR start synpred24_InternalL
    public final void synpred24_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2142:1: ( ( rulePredicateAtom ) )
        // InternalL.g:2142:1: ( rulePredicateAtom )
        {
        // InternalL.g:2142:1: ( rulePredicateAtom )
        // InternalL.g:2143:1: rulePredicateAtom
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomAccess().getPredicateAtomParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        rulePredicateAtom();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalL

    // $ANTLR start synpred25_InternalL
    public final void synpred25_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2164:1: ( ( ruleBasicPredicateAtom ) )
        // InternalL.g:2164:1: ( ruleBasicPredicateAtom )
        {
        // InternalL.g:2164:1: ( ruleBasicPredicateAtom )
        // InternalL.g:2165:1: ruleBasicPredicateAtom
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBasicAtomAccess().getBasicPredicateAtomParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleBasicPredicateAtom();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalL

    // $ANTLR start synpred32_InternalL
    public final void synpred32_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2270:1: ( ( ruleSentenceLiteral ) )
        // InternalL.g:2270:1: ( ruleSentenceLiteral )
        {
        // InternalL.g:2270:1: ( ruleSentenceLiteral )
        // InternalL.g:2271:1: ruleSentenceLiteral
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPrimarySentenceAccess().getSentenceLiteralParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSentenceLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalL

    // $ANTLR start synpred36_InternalL
    public final void synpred36_InternalL_fragment() throws RecognitionException {   
        // InternalL.g:2358:1: ( ( rulepSentence ) )
        // InternalL.g:2358:1: ( rulepSentence )
        {
        // InternalL.g:2358:1: ( rulepSentence )
        // InternalL.g:2359:1: rulepSentence
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getHeadAccess().getPSentenceParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        rulepSentence();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalL

    // Delegated rules

    public final boolean synpred36_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalL_fragment(); // can never throw exception
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
    public final boolean synpred23_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalL_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalL_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000030510000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000030010000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000300D0000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000031010000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010010000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080200000000L});

}