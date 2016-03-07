package net.certware.argument.analysis.ui.contentassist.antlr.internal; 

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
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnalysisDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_SATISFIABLE", "RULE_UNSATISFIABLE", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'-'"
    };
    public static final int RULE_UNSATISFIABLE=6;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_SATISFIABLE=5;
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


     
     	private AnalysisDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnalysisDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleOutput"
    // InternalAnalysisDSL.g:61:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:62:1: ( ruleOutput EOF )
            // InternalAnalysisDSL.g:63:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnalysisDSL.g:70:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:74:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalAnalysisDSL.g:75:1: ( ( rule__Output__Group__0 ) )
            {
            // InternalAnalysisDSL.g:75:1: ( ( rule__Output__Group__0 ) )
            // InternalAnalysisDSL.g:76:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // InternalAnalysisDSL.g:77:1: ( rule__Output__Group__0 )
            // InternalAnalysisDSL.g:77:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLine"
    // InternalAnalysisDSL.g:89:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:90:1: ( ruleLine EOF )
            // InternalAnalysisDSL.g:91:1: ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineRule()); 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalAnalysisDSL.g:98:1: ruleLine : ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:102:2: ( ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) ) )
            // InternalAnalysisDSL.g:103:1: ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) )
            {
            // InternalAnalysisDSL.g:103:1: ( ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* ) )
            // InternalAnalysisDSL.g:104:1: ( ( rule__Line__ItemsAssignment ) ) ( ( rule__Line__ItemsAssignment )* )
            {
            // InternalAnalysisDSL.g:104:1: ( ( rule__Line__ItemsAssignment ) )
            // InternalAnalysisDSL.g:105:1: ( rule__Line__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineAccess().getItemsAssignment()); 
            }
            // InternalAnalysisDSL.g:106:1: ( rule__Line__ItemsAssignment )
            // InternalAnalysisDSL.g:106:2: rule__Line__ItemsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Line__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineAccess().getItemsAssignment()); 
            }

            }

            // InternalAnalysisDSL.g:109:1: ( ( rule__Line__ItemsAssignment )* )
            // InternalAnalysisDSL.g:110:1: ( rule__Line__ItemsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineAccess().getItemsAssignment()); 
            }
            // InternalAnalysisDSL.g:111:1: ( rule__Line__ItemsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_IDENTIFIER) ) {
                        int LA1_3 = input.LA(3);

                        if ( (synpred1_InternalAnalysisDSL()) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==RULE_IDENTIFIER) ) {
                    int LA1_3 = input.LA(2);

                    if ( (synpred1_InternalAnalysisDSL()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnalysisDSL.g:111:2: rule__Line__ItemsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Line__ItemsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineAccess().getItemsAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleClassicLiteral"
    // InternalAnalysisDSL.g:124:1: entryRuleClassicLiteral : ruleClassicLiteral EOF ;
    public final void entryRuleClassicLiteral() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:125:1: ( ruleClassicLiteral EOF )
            // InternalAnalysisDSL.g:126:1: ruleClassicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassicLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralRule()); 
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
    // $ANTLR end "entryRuleClassicLiteral"


    // $ANTLR start "ruleClassicLiteral"
    // InternalAnalysisDSL.g:133:1: ruleClassicLiteral : ( ( rule__ClassicLiteral__Group__0 ) ) ;
    public final void ruleClassicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:137:2: ( ( ( rule__ClassicLiteral__Group__0 ) ) )
            // InternalAnalysisDSL.g:138:1: ( ( rule__ClassicLiteral__Group__0 ) )
            {
            // InternalAnalysisDSL.g:138:1: ( ( rule__ClassicLiteral__Group__0 ) )
            // InternalAnalysisDSL.g:139:1: ( rule__ClassicLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getGroup()); 
            }
            // InternalAnalysisDSL.g:140:1: ( rule__ClassicLiteral__Group__0 )
            // InternalAnalysisDSL.g:140:2: rule__ClassicLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassicLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassicLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalAnalysisDSL.g:152:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:153:1: ( ruleAtom EOF )
            // InternalAnalysisDSL.g:154:1: ruleAtom EOF
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
    // InternalAnalysisDSL.g:161:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:165:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalAnalysisDSL.g:166:1: ( ( rule__Atom__Group__0 ) )
            {
            // InternalAnalysisDSL.g:166:1: ( ( rule__Atom__Group__0 ) )
            // InternalAnalysisDSL.g:167:1: ( rule__Atom__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getGroup()); 
            }
            // InternalAnalysisDSL.g:168:1: ( rule__Atom__Group__0 )
            // InternalAnalysisDSL.g:168:2: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRulePREDICATE_NAME"
    // InternalAnalysisDSL.g:180:1: entryRulePREDICATE_NAME : rulePREDICATE_NAME EOF ;
    public final void entryRulePREDICATE_NAME() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:181:1: ( rulePREDICATE_NAME EOF )
            // InternalAnalysisDSL.g:182:1: rulePREDICATE_NAME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPREDICATE_NAMERule()); 
            }
            pushFollow(FOLLOW_1);
            rulePREDICATE_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPREDICATE_NAMERule()); 
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
    // $ANTLR end "entryRulePREDICATE_NAME"


    // $ANTLR start "rulePREDICATE_NAME"
    // InternalAnalysisDSL.g:189:1: rulePREDICATE_NAME : ( RULE_IDENTIFIER ) ;
    public final void rulePREDICATE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:193:2: ( ( RULE_IDENTIFIER ) )
            // InternalAnalysisDSL.g:194:1: ( RULE_IDENTIFIER )
            {
            // InternalAnalysisDSL.g:194:1: ( RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:195:1: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPREDICATE_NAMEAccess().getIDENTIFIERTerminalRuleCall()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPREDICATE_NAMEAccess().getIDENTIFIERTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePREDICATE_NAME"


    // $ANTLR start "entryRuleTerms"
    // InternalAnalysisDSL.g:208:1: entryRuleTerms : ruleTerms EOF ;
    public final void entryRuleTerms() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:209:1: ( ruleTerms EOF )
            // InternalAnalysisDSL.g:210:1: ruleTerms EOF
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
    // InternalAnalysisDSL.g:217:1: ruleTerms : ( ( rule__Terms__Group__0 ) ) ;
    public final void ruleTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:221:2: ( ( ( rule__Terms__Group__0 ) ) )
            // InternalAnalysisDSL.g:222:1: ( ( rule__Terms__Group__0 ) )
            {
            // InternalAnalysisDSL.g:222:1: ( ( rule__Terms__Group__0 ) )
            // InternalAnalysisDSL.g:223:1: ( rule__Terms__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getGroup()); 
            }
            // InternalAnalysisDSL.g:224:1: ( rule__Terms__Group__0 )
            // InternalAnalysisDSL.g:224:2: rule__Terms__Group__0
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


    // $ANTLR start "entryRuleTerm"
    // InternalAnalysisDSL.g:236:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:237:1: ( ruleTerm EOF )
            // InternalAnalysisDSL.g:238:1: ruleTerm EOF
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
    // InternalAnalysisDSL.g:245:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:249:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalAnalysisDSL.g:250:1: ( ( rule__Term__Alternatives ) )
            {
            // InternalAnalysisDSL.g:250:1: ( ( rule__Term__Alternatives ) )
            // InternalAnalysisDSL.g:251:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // InternalAnalysisDSL.g:252:1: ( rule__Term__Alternatives )
            // InternalAnalysisDSL.g:252:2: rule__Term__Alternatives
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


    // $ANTLR start "entryRuleCONSTANT_SYMBOL"
    // InternalAnalysisDSL.g:264:1: entryRuleCONSTANT_SYMBOL : ruleCONSTANT_SYMBOL EOF ;
    public final void entryRuleCONSTANT_SYMBOL() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:265:1: ( ruleCONSTANT_SYMBOL EOF )
            // InternalAnalysisDSL.g:266:1: ruleCONSTANT_SYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONSTANT_SYMBOLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCONSTANT_SYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONSTANT_SYMBOLRule()); 
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
    // $ANTLR end "entryRuleCONSTANT_SYMBOL"


    // $ANTLR start "ruleCONSTANT_SYMBOL"
    // InternalAnalysisDSL.g:273:1: ruleCONSTANT_SYMBOL : ( RULE_IDENTIFIER ) ;
    public final void ruleCONSTANT_SYMBOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:277:2: ( ( RULE_IDENTIFIER ) )
            // InternalAnalysisDSL.g:278:1: ( RULE_IDENTIFIER )
            {
            // InternalAnalysisDSL.g:278:1: ( RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:279:1: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONSTANT_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONSTANT_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONSTANT_SYMBOL"


    // $ANTLR start "entryRuleFUNCTIONAL_SYMBOL"
    // InternalAnalysisDSL.g:292:1: entryRuleFUNCTIONAL_SYMBOL : ruleFUNCTIONAL_SYMBOL EOF ;
    public final void entryRuleFUNCTIONAL_SYMBOL() throws RecognitionException {
        try {
            // InternalAnalysisDSL.g:293:1: ( ruleFUNCTIONAL_SYMBOL EOF )
            // InternalAnalysisDSL.g:294:1: ruleFUNCTIONAL_SYMBOL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFUNCTIONAL_SYMBOLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFUNCTIONAL_SYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFUNCTIONAL_SYMBOLRule()); 
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
    // $ANTLR end "entryRuleFUNCTIONAL_SYMBOL"


    // $ANTLR start "ruleFUNCTIONAL_SYMBOL"
    // InternalAnalysisDSL.g:301:1: ruleFUNCTIONAL_SYMBOL : ( RULE_IDENTIFIER ) ;
    public final void ruleFUNCTIONAL_SYMBOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:305:2: ( ( RULE_IDENTIFIER ) )
            // InternalAnalysisDSL.g:306:1: ( RULE_IDENTIFIER )
            {
            // InternalAnalysisDSL.g:306:1: ( RULE_IDENTIFIER )
            // InternalAnalysisDSL.g:307:1: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFUNCTIONAL_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFUNCTIONAL_SYMBOLAccess().getIDENTIFIERTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFUNCTIONAL_SYMBOL"


    // $ANTLR start "rule__Output__Alternatives_1"
    // InternalAnalysisDSL.g:320:1: rule__Output__Alternatives_1 : ( ( RULE_SATISFIABLE ) | ( RULE_UNSATISFIABLE ) );
    public final void rule__Output__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:324:1: ( ( RULE_SATISFIABLE ) | ( RULE_UNSATISFIABLE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SATISFIABLE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNSATISFIABLE) ) {
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
                    // InternalAnalysisDSL.g:325:1: ( RULE_SATISFIABLE )
                    {
                    // InternalAnalysisDSL.g:325:1: ( RULE_SATISFIABLE )
                    // InternalAnalysisDSL.g:326:1: RULE_SATISFIABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_SATISFIABLE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getSATISFIABLETerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisDSL.g:331:6: ( RULE_UNSATISFIABLE )
                    {
                    // InternalAnalysisDSL.g:331:6: ( RULE_UNSATISFIABLE )
                    // InternalAnalysisDSL.g:332:1: RULE_UNSATISFIABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_UNSATISFIABLE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getUNSATISFIABLETerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Output__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalAnalysisDSL.g:342:1: rule__Term__Alternatives : ( ( ( rule__Term__CsAssignment_0 ) ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:346:1: ( ( ( rule__Term__CsAssignment_0 ) ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=16 && LA3_1<=17)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==15) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_NUMBER||LA3_0==18) ) {
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
                    // InternalAnalysisDSL.g:347:1: ( ( rule__Term__CsAssignment_0 ) )
                    {
                    // InternalAnalysisDSL.g:347:1: ( ( rule__Term__CsAssignment_0 ) )
                    // InternalAnalysisDSL.g:348:1: ( rule__Term__CsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getCsAssignment_0()); 
                    }
                    // InternalAnalysisDSL.g:349:1: ( rule__Term__CsAssignment_0 )
                    // InternalAnalysisDSL.g:349:2: rule__Term__CsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__CsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getCsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisDSL.g:353:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // InternalAnalysisDSL.g:353:6: ( ( rule__Term__Group_1__0 ) )
                    // InternalAnalysisDSL.g:354:1: ( rule__Term__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1()); 
                    }
                    // InternalAnalysisDSL.g:355:1: ( rule__Term__Group_1__0 )
                    // InternalAnalysisDSL.g:355:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisDSL.g:359:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // InternalAnalysisDSL.g:359:6: ( ( rule__Term__Group_2__0 ) )
                    // InternalAnalysisDSL.g:360:1: ( rule__Term__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_2()); 
                    }
                    // InternalAnalysisDSL.g:361:1: ( rule__Term__Group_2__0 )
                    // InternalAnalysisDSL.g:361:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_2()); 
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


    // $ANTLR start "rule__Output__Group__0"
    // InternalAnalysisDSL.g:372:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:376:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnalysisDSL.g:377:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalAnalysisDSL.g:384:1: rule__Output__Group__0__Impl : ( ( rule__Output__LinesAssignment_0 )* ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:388:1: ( ( ( rule__Output__LinesAssignment_0 )* ) )
            // InternalAnalysisDSL.g:389:1: ( ( rule__Output__LinesAssignment_0 )* )
            {
            // InternalAnalysisDSL.g:389:1: ( ( rule__Output__LinesAssignment_0 )* )
            // InternalAnalysisDSL.g:390:1: ( rule__Output__LinesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLinesAssignment_0()); 
            }
            // InternalAnalysisDSL.g:391:1: ( rule__Output__LinesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_IDENTIFIER||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnalysisDSL.g:391:2: rule__Output__LinesAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Output__LinesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getLinesAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalAnalysisDSL.g:401:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:405:1: ( rule__Output__Group__1__Impl )
            // InternalAnalysisDSL.g:406:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__1__Impl();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalAnalysisDSL.g:412:1: rule__Output__Group__1__Impl : ( ( rule__Output__Alternatives_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:416:1: ( ( ( rule__Output__Alternatives_1 ) ) )
            // InternalAnalysisDSL.g:417:1: ( ( rule__Output__Alternatives_1 ) )
            {
            // InternalAnalysisDSL.g:417:1: ( ( rule__Output__Alternatives_1 ) )
            // InternalAnalysisDSL.g:418:1: ( rule__Output__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getAlternatives_1()); 
            }
            // InternalAnalysisDSL.g:419:1: ( rule__Output__Alternatives_1 )
            // InternalAnalysisDSL.g:419:2: rule__Output__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__ClassicLiteral__Group__0"
    // InternalAnalysisDSL.g:433:1: rule__ClassicLiteral__Group__0 : rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1 ;
    public final void rule__ClassicLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:437:1: ( rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1 )
            // InternalAnalysisDSL.g:438:2: rule__ClassicLiteral__Group__0__Impl rule__ClassicLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassicLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassicLiteral__Group__1();

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
    // $ANTLR end "rule__ClassicLiteral__Group__0"


    // $ANTLR start "rule__ClassicLiteral__Group__0__Impl"
    // InternalAnalysisDSL.g:445:1: rule__ClassicLiteral__Group__0__Impl : ( ( rule__ClassicLiteral__NegAssignment_0 )? ) ;
    public final void rule__ClassicLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:449:1: ( ( ( rule__ClassicLiteral__NegAssignment_0 )? ) )
            // InternalAnalysisDSL.g:450:1: ( ( rule__ClassicLiteral__NegAssignment_0 )? )
            {
            // InternalAnalysisDSL.g:450:1: ( ( rule__ClassicLiteral__NegAssignment_0 )? )
            // InternalAnalysisDSL.g:451:1: ( rule__ClassicLiteral__NegAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getNegAssignment_0()); 
            }
            // InternalAnalysisDSL.g:452:1: ( rule__ClassicLiteral__NegAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnalysisDSL.g:452:2: rule__ClassicLiteral__NegAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicLiteral__NegAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getNegAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicLiteral__Group__0__Impl"


    // $ANTLR start "rule__ClassicLiteral__Group__1"
    // InternalAnalysisDSL.g:462:1: rule__ClassicLiteral__Group__1 : rule__ClassicLiteral__Group__1__Impl ;
    public final void rule__ClassicLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:466:1: ( rule__ClassicLiteral__Group__1__Impl )
            // InternalAnalysisDSL.g:467:2: rule__ClassicLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__ClassicLiteral__Group__1"


    // $ANTLR start "rule__ClassicLiteral__Group__1__Impl"
    // InternalAnalysisDSL.g:473:1: rule__ClassicLiteral__Group__1__Impl : ( ( rule__ClassicLiteral__AtomAssignment_1 ) ) ;
    public final void rule__ClassicLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:477:1: ( ( ( rule__ClassicLiteral__AtomAssignment_1 ) ) )
            // InternalAnalysisDSL.g:478:1: ( ( rule__ClassicLiteral__AtomAssignment_1 ) )
            {
            // InternalAnalysisDSL.g:478:1: ( ( rule__ClassicLiteral__AtomAssignment_1 ) )
            // InternalAnalysisDSL.g:479:1: ( rule__ClassicLiteral__AtomAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getAtomAssignment_1()); 
            }
            // InternalAnalysisDSL.g:480:1: ( rule__ClassicLiteral__AtomAssignment_1 )
            // InternalAnalysisDSL.g:480:2: rule__ClassicLiteral__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicLiteral__AtomAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getAtomAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicLiteral__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group__0"
    // InternalAnalysisDSL.g:494:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:498:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalAnalysisDSL.g:499:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Atom__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group__1();

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
    // $ANTLR end "rule__Atom__Group__0"


    // $ANTLR start "rule__Atom__Group__0__Impl"
    // InternalAnalysisDSL.g:506:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__NameAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:510:1: ( ( ( rule__Atom__NameAssignment_0 ) ) )
            // InternalAnalysisDSL.g:511:1: ( ( rule__Atom__NameAssignment_0 ) )
            {
            // InternalAnalysisDSL.g:511:1: ( ( rule__Atom__NameAssignment_0 ) )
            // InternalAnalysisDSL.g:512:1: ( rule__Atom__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            }
            // InternalAnalysisDSL.g:513:1: ( rule__Atom__NameAssignment_0 )
            // InternalAnalysisDSL.g:513:2: rule__Atom__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0__Impl"


    // $ANTLR start "rule__Atom__Group__1"
    // InternalAnalysisDSL.g:523:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:527:1: ( rule__Atom__Group__1__Impl )
            // InternalAnalysisDSL.g:528:2: rule__Atom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__1__Impl();

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
    // $ANTLR end "rule__Atom__Group__1"


    // $ANTLR start "rule__Atom__Group__1__Impl"
    // InternalAnalysisDSL.g:534:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__Group_1__0 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:538:1: ( ( ( rule__Atom__Group_1__0 )? ) )
            // InternalAnalysisDSL.g:539:1: ( ( rule__Atom__Group_1__0 )? )
            {
            // InternalAnalysisDSL.g:539:1: ( ( rule__Atom__Group_1__0 )? )
            // InternalAnalysisDSL.g:540:1: ( rule__Atom__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getGroup_1()); 
            }
            // InternalAnalysisDSL.g:541:1: ( rule__Atom__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnalysisDSL.g:541:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // InternalAnalysisDSL.g:555:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:559:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalAnalysisDSL.g:560:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__1();

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
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // InternalAnalysisDSL.g:567:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:571:1: ( ( '(' ) )
            // InternalAnalysisDSL.g:572:1: ( '(' )
            {
            // InternalAnalysisDSL.g:572:1: ( '(' )
            // InternalAnalysisDSL.g:573:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // InternalAnalysisDSL.g:586:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:590:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalAnalysisDSL.g:591:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2();

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
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // InternalAnalysisDSL.g:598:1: rule__Atom__Group_1__1__Impl : ( ( rule__Atom__TermsAssignment_1_1 )? ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:602:1: ( ( ( rule__Atom__TermsAssignment_1_1 )? ) )
            // InternalAnalysisDSL.g:603:1: ( ( rule__Atom__TermsAssignment_1_1 )? )
            {
            // InternalAnalysisDSL.g:603:1: ( ( rule__Atom__TermsAssignment_1_1 )? )
            // InternalAnalysisDSL.g:604:1: ( rule__Atom__TermsAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getTermsAssignment_1_1()); 
            }
            // InternalAnalysisDSL.g:605:1: ( rule__Atom__TermsAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENTIFIER||LA7_0==RULE_NUMBER||LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnalysisDSL.g:605:2: rule__Atom__TermsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__TermsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getTermsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // InternalAnalysisDSL.g:615:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:619:1: ( rule__Atom__Group_1__2__Impl )
            // InternalAnalysisDSL.g:620:2: rule__Atom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // InternalAnalysisDSL.g:626:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:630:1: ( ( ')' ) )
            // InternalAnalysisDSL.g:631:1: ( ')' )
            {
            // InternalAnalysisDSL.g:631:1: ( ')' )
            // InternalAnalysisDSL.g:632:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Terms__Group__0"
    // InternalAnalysisDSL.g:651:1: rule__Terms__Group__0 : rule__Terms__Group__0__Impl rule__Terms__Group__1 ;
    public final void rule__Terms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:655:1: ( rule__Terms__Group__0__Impl rule__Terms__Group__1 )
            // InternalAnalysisDSL.g:656:2: rule__Terms__Group__0__Impl rule__Terms__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnalysisDSL.g:663:1: rule__Terms__Group__0__Impl : ( ( rule__Terms__CarAssignment_0 ) ) ;
    public final void rule__Terms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:667:1: ( ( ( rule__Terms__CarAssignment_0 ) ) )
            // InternalAnalysisDSL.g:668:1: ( ( rule__Terms__CarAssignment_0 ) )
            {
            // InternalAnalysisDSL.g:668:1: ( ( rule__Terms__CarAssignment_0 ) )
            // InternalAnalysisDSL.g:669:1: ( rule__Terms__CarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCarAssignment_0()); 
            }
            // InternalAnalysisDSL.g:670:1: ( rule__Terms__CarAssignment_0 )
            // InternalAnalysisDSL.g:670:2: rule__Terms__CarAssignment_0
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
    // InternalAnalysisDSL.g:680:1: rule__Terms__Group__1 : rule__Terms__Group__1__Impl ;
    public final void rule__Terms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:684:1: ( rule__Terms__Group__1__Impl )
            // InternalAnalysisDSL.g:685:2: rule__Terms__Group__1__Impl
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
    // InternalAnalysisDSL.g:691:1: rule__Terms__Group__1__Impl : ( ( rule__Terms__Group_1__0 )* ) ;
    public final void rule__Terms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:695:1: ( ( ( rule__Terms__Group_1__0 )* ) )
            // InternalAnalysisDSL.g:696:1: ( ( rule__Terms__Group_1__0 )* )
            {
            // InternalAnalysisDSL.g:696:1: ( ( rule__Terms__Group_1__0 )* )
            // InternalAnalysisDSL.g:697:1: ( rule__Terms__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getGroup_1()); 
            }
            // InternalAnalysisDSL.g:698:1: ( rule__Terms__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnalysisDSL.g:698:2: rule__Terms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Terms__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAnalysisDSL.g:712:1: rule__Terms__Group_1__0 : rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 ;
    public final void rule__Terms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:716:1: ( rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1 )
            // InternalAnalysisDSL.g:717:2: rule__Terms__Group_1__0__Impl rule__Terms__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAnalysisDSL.g:724:1: rule__Terms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Terms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:728:1: ( ( ',' ) )
            // InternalAnalysisDSL.g:729:1: ( ',' )
            {
            // InternalAnalysisDSL.g:729:1: ( ',' )
            // InternalAnalysisDSL.g:730:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCommaKeyword_1_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalAnalysisDSL.g:743:1: rule__Terms__Group_1__1 : rule__Terms__Group_1__1__Impl ;
    public final void rule__Terms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:747:1: ( rule__Terms__Group_1__1__Impl )
            // InternalAnalysisDSL.g:748:2: rule__Terms__Group_1__1__Impl
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
    // InternalAnalysisDSL.g:754:1: rule__Terms__Group_1__1__Impl : ( ( rule__Terms__CdrAssignment_1_1 ) ) ;
    public final void rule__Terms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:758:1: ( ( ( rule__Terms__CdrAssignment_1_1 ) ) )
            // InternalAnalysisDSL.g:759:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            {
            // InternalAnalysisDSL.g:759:1: ( ( rule__Terms__CdrAssignment_1_1 ) )
            // InternalAnalysisDSL.g:760:1: ( rule__Terms__CdrAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermsAccess().getCdrAssignment_1_1()); 
            }
            // InternalAnalysisDSL.g:761:1: ( rule__Terms__CdrAssignment_1_1 )
            // InternalAnalysisDSL.g:761:2: rule__Terms__CdrAssignment_1_1
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


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalAnalysisDSL.g:775:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:779:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalAnalysisDSL.g:780:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalAnalysisDSL.g:787:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__SignAssignment_1_0 )? ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:791:1: ( ( ( rule__Term__SignAssignment_1_0 )? ) )
            // InternalAnalysisDSL.g:792:1: ( ( rule__Term__SignAssignment_1_0 )? )
            {
            // InternalAnalysisDSL.g:792:1: ( ( rule__Term__SignAssignment_1_0 )? )
            // InternalAnalysisDSL.g:793:1: ( rule__Term__SignAssignment_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSignAssignment_1_0()); 
            }
            // InternalAnalysisDSL.g:794:1: ( rule__Term__SignAssignment_1_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisDSL.g:794:2: rule__Term__SignAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__SignAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSignAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalAnalysisDSL.g:804:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:808:1: ( rule__Term__Group_1__1__Impl )
            // InternalAnalysisDSL.g:809:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalAnalysisDSL.g:815:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__NAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:819:1: ( ( ( rule__Term__NAssignment_1_1 ) ) )
            // InternalAnalysisDSL.g:820:1: ( ( rule__Term__NAssignment_1_1 ) )
            {
            // InternalAnalysisDSL.g:820:1: ( ( rule__Term__NAssignment_1_1 ) )
            // InternalAnalysisDSL.g:821:1: ( rule__Term__NAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getNAssignment_1_1()); 
            }
            // InternalAnalysisDSL.g:822:1: ( rule__Term__NAssignment_1_1 )
            // InternalAnalysisDSL.g:822:2: rule__Term__NAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__NAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getNAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // InternalAnalysisDSL.g:836:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:840:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // InternalAnalysisDSL.g:841:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_2__1();

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
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // InternalAnalysisDSL.g:848:1: rule__Term__Group_2__0__Impl : ( ( rule__Term__FsAssignment_2_0 ) ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:852:1: ( ( ( rule__Term__FsAssignment_2_0 ) ) )
            // InternalAnalysisDSL.g:853:1: ( ( rule__Term__FsAssignment_2_0 ) )
            {
            // InternalAnalysisDSL.g:853:1: ( ( rule__Term__FsAssignment_2_0 ) )
            // InternalAnalysisDSL.g:854:1: ( rule__Term__FsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFsAssignment_2_0()); 
            }
            // InternalAnalysisDSL.g:855:1: ( rule__Term__FsAssignment_2_0 )
            // InternalAnalysisDSL.g:855:2: rule__Term__FsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // InternalAnalysisDSL.g:865:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl rule__Term__Group_2__2 ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:869:1: ( rule__Term__Group_2__1__Impl rule__Term__Group_2__2 )
            // InternalAnalysisDSL.g:870:2: rule__Term__Group_2__1__Impl rule__Term__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Term__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_2__2();

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
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // InternalAnalysisDSL.g:877:1: rule__Term__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:881:1: ( ( '(' ) )
            // InternalAnalysisDSL.g:882:1: ( '(' )
            {
            // InternalAnalysisDSL.g:882:1: ( '(' )
            // InternalAnalysisDSL.g:883:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_2__2"
    // InternalAnalysisDSL.g:896:1: rule__Term__Group_2__2 : rule__Term__Group_2__2__Impl rule__Term__Group_2__3 ;
    public final void rule__Term__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:900:1: ( rule__Term__Group_2__2__Impl rule__Term__Group_2__3 )
            // InternalAnalysisDSL.g:901:2: rule__Term__Group_2__2__Impl rule__Term__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_2__3();

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
    // $ANTLR end "rule__Term__Group_2__2"


    // $ANTLR start "rule__Term__Group_2__2__Impl"
    // InternalAnalysisDSL.g:908:1: rule__Term__Group_2__2__Impl : ( ( rule__Term__TermsAssignment_2_2 ) ) ;
    public final void rule__Term__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:912:1: ( ( ( rule__Term__TermsAssignment_2_2 ) ) )
            // InternalAnalysisDSL.g:913:1: ( ( rule__Term__TermsAssignment_2_2 ) )
            {
            // InternalAnalysisDSL.g:913:1: ( ( rule__Term__TermsAssignment_2_2 ) )
            // InternalAnalysisDSL.g:914:1: ( rule__Term__TermsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermsAssignment_2_2()); 
            }
            // InternalAnalysisDSL.g:915:1: ( rule__Term__TermsAssignment_2_2 )
            // InternalAnalysisDSL.g:915:2: rule__Term__TermsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTermsAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__2__Impl"


    // $ANTLR start "rule__Term__Group_2__3"
    // InternalAnalysisDSL.g:925:1: rule__Term__Group_2__3 : rule__Term__Group_2__3__Impl ;
    public final void rule__Term__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:929:1: ( rule__Term__Group_2__3__Impl )
            // InternalAnalysisDSL.g:930:2: rule__Term__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_2__3__Impl();

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
    // $ANTLR end "rule__Term__Group_2__3"


    // $ANTLR start "rule__Term__Group_2__3__Impl"
    // InternalAnalysisDSL.g:936:1: rule__Term__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:940:1: ( ( ')' ) )
            // InternalAnalysisDSL.g:941:1: ( ')' )
            {
            // InternalAnalysisDSL.g:941:1: ( ')' )
            // InternalAnalysisDSL.g:942:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__3__Impl"


    // $ANTLR start "rule__Output__LinesAssignment_0"
    // InternalAnalysisDSL.g:964:1: rule__Output__LinesAssignment_0 : ( ruleLine ) ;
    public final void rule__Output__LinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:968:1: ( ( ruleLine ) )
            // InternalAnalysisDSL.g:969:1: ( ruleLine )
            {
            // InternalAnalysisDSL.g:969:1: ( ruleLine )
            // InternalAnalysisDSL.g:970:1: ruleLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getLinesLineParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__LinesAssignment_0"


    // $ANTLR start "rule__Line__ItemsAssignment"
    // InternalAnalysisDSL.g:979:1: rule__Line__ItemsAssignment : ( ruleClassicLiteral ) ;
    public final void rule__Line__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:983:1: ( ( ruleClassicLiteral ) )
            // InternalAnalysisDSL.g:984:1: ( ruleClassicLiteral )
            {
            // InternalAnalysisDSL.g:984:1: ( ruleClassicLiteral )
            // InternalAnalysisDSL.g:985:1: ruleClassicLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassicLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineAccess().getItemsClassicLiteralParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__ItemsAssignment"


    // $ANTLR start "rule__ClassicLiteral__NegAssignment_0"
    // InternalAnalysisDSL.g:994:1: rule__ClassicLiteral__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__ClassicLiteral__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:998:1: ( ( ( '-' ) ) )
            // InternalAnalysisDSL.g:999:1: ( ( '-' ) )
            {
            // InternalAnalysisDSL.g:999:1: ( ( '-' ) )
            // InternalAnalysisDSL.g:1000:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            }
            // InternalAnalysisDSL.g:1001:1: ( '-' )
            // InternalAnalysisDSL.g:1002:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicLiteral__NegAssignment_0"


    // $ANTLR start "rule__ClassicLiteral__AtomAssignment_1"
    // InternalAnalysisDSL.g:1017:1: rule__ClassicLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__ClassicLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1021:1: ( ( ruleAtom ) )
            // InternalAnalysisDSL.g:1022:1: ( ruleAtom )
            {
            // InternalAnalysisDSL.g:1022:1: ( ruleAtom )
            // InternalAnalysisDSL.g:1023:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassicLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicLiteral__AtomAssignment_1"


    // $ANTLR start "rule__Atom__NameAssignment_0"
    // InternalAnalysisDSL.g:1032:1: rule__Atom__NameAssignment_0 : ( rulePREDICATE_NAME ) ;
    public final void rule__Atom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1036:1: ( ( rulePREDICATE_NAME ) )
            // InternalAnalysisDSL.g:1037:1: ( rulePREDICATE_NAME )
            {
            // InternalAnalysisDSL.g:1037:1: ( rulePREDICATE_NAME )
            // InternalAnalysisDSL.g:1038:1: rulePREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getNamePREDICATE_NAMEParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePREDICATE_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getNamePREDICATE_NAMEParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__NameAssignment_0"


    // $ANTLR start "rule__Atom__TermsAssignment_1_1"
    // InternalAnalysisDSL.g:1047:1: rule__Atom__TermsAssignment_1_1 : ( ruleTerms ) ;
    public final void rule__Atom__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1051:1: ( ( ruleTerms ) )
            // InternalAnalysisDSL.g:1052:1: ( ruleTerms )
            {
            // InternalAnalysisDSL.g:1052:1: ( ruleTerms )
            // InternalAnalysisDSL.g:1053:1: ruleTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getTermsTermsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__TermsAssignment_1_1"


    // $ANTLR start "rule__Terms__CarAssignment_0"
    // InternalAnalysisDSL.g:1062:1: rule__Terms__CarAssignment_0 : ( ruleTerm ) ;
    public final void rule__Terms__CarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1066:1: ( ( ruleTerm ) )
            // InternalAnalysisDSL.g:1067:1: ( ruleTerm )
            {
            // InternalAnalysisDSL.g:1067:1: ( ruleTerm )
            // InternalAnalysisDSL.g:1068:1: ruleTerm
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
    // InternalAnalysisDSL.g:1077:1: rule__Terms__CdrAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__Terms__CdrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1081:1: ( ( ruleTerm ) )
            // InternalAnalysisDSL.g:1082:1: ( ruleTerm )
            {
            // InternalAnalysisDSL.g:1082:1: ( ruleTerm )
            // InternalAnalysisDSL.g:1083:1: ruleTerm
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


    // $ANTLR start "rule__Term__CsAssignment_0"
    // InternalAnalysisDSL.g:1092:1: rule__Term__CsAssignment_0 : ( ruleCONSTANT_SYMBOL ) ;
    public final void rule__Term__CsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1096:1: ( ( ruleCONSTANT_SYMBOL ) )
            // InternalAnalysisDSL.g:1097:1: ( ruleCONSTANT_SYMBOL )
            {
            // InternalAnalysisDSL.g:1097:1: ( ruleCONSTANT_SYMBOL )
            // InternalAnalysisDSL.g:1098:1: ruleCONSTANT_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCONSTANT_SYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getCsCONSTANT_SYMBOLParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__CsAssignment_0"


    // $ANTLR start "rule__Term__SignAssignment_1_0"
    // InternalAnalysisDSL.g:1107:1: rule__Term__SignAssignment_1_0 : ( ( '-' ) ) ;
    public final void rule__Term__SignAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1111:1: ( ( ( '-' ) ) )
            // InternalAnalysisDSL.g:1112:1: ( ( '-' ) )
            {
            // InternalAnalysisDSL.g:1112:1: ( ( '-' ) )
            // InternalAnalysisDSL.g:1113:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            }
            // InternalAnalysisDSL.g:1114:1: ( '-' )
            // InternalAnalysisDSL.g:1115:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSignHyphenMinusKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__SignAssignment_1_0"


    // $ANTLR start "rule__Term__NAssignment_1_1"
    // InternalAnalysisDSL.g:1130:1: rule__Term__NAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Term__NAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1134:1: ( ( RULE_NUMBER ) )
            // InternalAnalysisDSL.g:1135:1: ( RULE_NUMBER )
            {
            // InternalAnalysisDSL.g:1135:1: ( RULE_NUMBER )
            // InternalAnalysisDSL.g:1136:1: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getNNUMBERTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NAssignment_1_1"


    // $ANTLR start "rule__Term__FsAssignment_2_0"
    // InternalAnalysisDSL.g:1145:1: rule__Term__FsAssignment_2_0 : ( ruleFUNCTIONAL_SYMBOL ) ;
    public final void rule__Term__FsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1149:1: ( ( ruleFUNCTIONAL_SYMBOL ) )
            // InternalAnalysisDSL.g:1150:1: ( ruleFUNCTIONAL_SYMBOL )
            {
            // InternalAnalysisDSL.g:1150:1: ( ruleFUNCTIONAL_SYMBOL )
            // InternalAnalysisDSL.g:1151:1: ruleFUNCTIONAL_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFUNCTIONAL_SYMBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFsFUNCTIONAL_SYMBOLParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FsAssignment_2_0"


    // $ANTLR start "rule__Term__TermsAssignment_2_2"
    // InternalAnalysisDSL.g:1160:1: rule__Term__TermsAssignment_2_2 : ( ruleTerms ) ;
    public final void rule__Term__TermsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnalysisDSL.g:1164:1: ( ( ruleTerms ) )
            // InternalAnalysisDSL.g:1165:1: ( ruleTerms )
            {
            // InternalAnalysisDSL.g:1165:1: ( ruleTerms )
            // InternalAnalysisDSL.g:1166:1: ruleTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTermsTermsParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermsAssignment_2_2"

    // $ANTLR start synpred1_InternalAnalysisDSL
    public final void synpred1_InternalAnalysisDSL_fragment() throws RecognitionException {   
        // InternalAnalysisDSL.g:111:2: ( rule__Line__ItemsAssignment )
        // InternalAnalysisDSL.g:111:2: rule__Line__ItemsAssignment
        {
        pushFollow(FOLLOW_2);
        rule__Line__ItemsAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAnalysisDSL

    // Delegated rules

    public final boolean synpred1_InternalAnalysisDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAnalysisDSL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050090L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}