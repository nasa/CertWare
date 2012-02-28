package net.certware.argument.sfp.ui.contentassist.antlr.internal; 

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
import net.certware.argument.sfp.services.SemiFormalProofGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemiFormalProofParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unknown'", "'valid'", "'invalid'", "'Theorem'", "':'", "'('", "')'", "','", "'->'", "'^'", "'.'", "'{'", "'}'", "'hypothesis'", "'epsilon'"
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
    public String getGrammarFileName() { return "../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g"; }


     
     	private SemiFormalProofGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SemiFormalProofGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProof"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:60:1: entryRuleProof : ruleProof EOF ;
    public final void entryRuleProof() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:61:1: ( ruleProof EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:62:1: ruleProof EOF
            {
             before(grammarAccess.getProofRule()); 
            pushFollow(FOLLOW_ruleProof_in_entryRuleProof61);
            ruleProof();

            state._fsp--;

             after(grammarAccess.getProofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProof68); 

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
    // $ANTLR end "entryRuleProof"


    // $ANTLR start "ruleProof"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:69:1: ruleProof : ( ( rule__Proof__Group__0 ) ) ;
    public final void ruleProof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:73:2: ( ( ( rule__Proof__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:74:1: ( ( rule__Proof__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:74:1: ( ( rule__Proof__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:75:1: ( rule__Proof__Group__0 )
            {
             before(grammarAccess.getProofAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:76:1: ( rule__Proof__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:76:2: rule__Proof__Group__0
            {
            pushFollow(FOLLOW_rule__Proof__Group__0_in_ruleProof94);
            rule__Proof__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProofAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProof"


    // $ANTLR start "entryRuleText"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:88:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:89:1: ( ruleText EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:90:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText121);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText128); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:97:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:101:2: ( ( RULE_STRING ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:102:1: ( RULE_STRING )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:102:1: ( RULE_STRING )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:103:1: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText154); 
             after(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleJustifications"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:116:1: entryRuleJustifications : ruleJustifications EOF ;
    public final void entryRuleJustifications() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:117:1: ( ruleJustifications EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:118:1: ruleJustifications EOF
            {
             before(grammarAccess.getJustificationsRule()); 
            pushFollow(FOLLOW_ruleJustifications_in_entryRuleJustifications180);
            ruleJustifications();

            state._fsp--;

             after(grammarAccess.getJustificationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustifications187); 

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
    // $ANTLR end "entryRuleJustifications"


    // $ANTLR start "ruleJustifications"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:125:1: ruleJustifications : ( ( rule__Justifications__Group__0 ) ) ;
    public final void ruleJustifications() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:129:2: ( ( ( rule__Justifications__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:130:1: ( ( rule__Justifications__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:130:1: ( ( rule__Justifications__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:131:1: ( rule__Justifications__Group__0 )
            {
             before(grammarAccess.getJustificationsAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:132:1: ( rule__Justifications__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:132:2: rule__Justifications__Group__0
            {
            pushFollow(FOLLOW_rule__Justifications__Group__0_in_ruleJustifications213);
            rule__Justifications__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJustifications"


    // $ANTLR start "entryRuleJustification"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:144:1: entryRuleJustification : ruleJustification EOF ;
    public final void entryRuleJustification() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:145:1: ( ruleJustification EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:146:1: ruleJustification EOF
            {
             before(grammarAccess.getJustificationRule()); 
            pushFollow(FOLLOW_ruleJustification_in_entryRuleJustification240);
            ruleJustification();

            state._fsp--;

             after(grammarAccess.getJustificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustification247); 

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
    // $ANTLR end "entryRuleJustification"


    // $ANTLR start "ruleJustification"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:153:1: ruleJustification : ( ( rule__Justification__Alternatives ) ) ;
    public final void ruleJustification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:157:2: ( ( ( rule__Justification__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:158:1: ( ( rule__Justification__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:158:1: ( ( rule__Justification__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:159:1: ( rule__Justification__Alternatives )
            {
             before(grammarAccess.getJustificationAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:160:1: ( rule__Justification__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:160:2: rule__Justification__Alternatives
            {
            pushFollow(FOLLOW_rule__Justification__Alternatives_in_ruleJustification273);
            rule__Justification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJustificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJustification"


    // $ANTLR start "entryRuleQuotedAssertion"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:172:1: entryRuleQuotedAssertion : ruleQuotedAssertion EOF ;
    public final void entryRuleQuotedAssertion() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:173:1: ( ruleQuotedAssertion EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:174:1: ruleQuotedAssertion EOF
            {
             before(grammarAccess.getQuotedAssertionRule()); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion300);
            ruleQuotedAssertion();

            state._fsp--;

             after(grammarAccess.getQuotedAssertionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedAssertion307); 

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
    // $ANTLR end "entryRuleQuotedAssertion"


    // $ANTLR start "ruleQuotedAssertion"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:181:1: ruleQuotedAssertion : ( ( rule__QuotedAssertion__Group__0 ) ) ;
    public final void ruleQuotedAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:185:2: ( ( ( rule__QuotedAssertion__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:186:1: ( ( rule__QuotedAssertion__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:186:1: ( ( rule__QuotedAssertion__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:187:1: ( rule__QuotedAssertion__Group__0 )
            {
             before(grammarAccess.getQuotedAssertionAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:188:1: ( rule__QuotedAssertion__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:188:2: rule__QuotedAssertion__Group__0
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__0_in_ruleQuotedAssertion333);
            rule__QuotedAssertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuotedAssertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedAssertion"


    // $ANTLR start "entryRuleEntailment"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:200:1: entryRuleEntailment : ruleEntailment EOF ;
    public final void entryRuleEntailment() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:201:1: ( ruleEntailment EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:202:1: ruleEntailment EOF
            {
             before(grammarAccess.getEntailmentRule()); 
            pushFollow(FOLLOW_ruleEntailment_in_entryRuleEntailment360);
            ruleEntailment();

            state._fsp--;

             after(grammarAccess.getEntailmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntailment367); 

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
    // $ANTLR end "entryRuleEntailment"


    // $ANTLR start "ruleEntailment"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:209:1: ruleEntailment : ( ( rule__Entailment__Group__0 ) ) ;
    public final void ruleEntailment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:213:2: ( ( ( rule__Entailment__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:214:1: ( ( rule__Entailment__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:214:1: ( ( rule__Entailment__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:215:1: ( rule__Entailment__Group__0 )
            {
             before(grammarAccess.getEntailmentAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:216:1: ( rule__Entailment__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:216:2: rule__Entailment__Group__0
            {
            pushFollow(FOLLOW_rule__Entailment__Group__0_in_ruleEntailment393);
            rule__Entailment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntailmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntailment"


    // $ANTLR start "entryRuleConjunction"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:228:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:229:1: ( ruleConjunction EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:230:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction420);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction427); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:237:1: ruleConjunction : ( ( rule__Conjunction__Alternatives ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:241:2: ( ( ( rule__Conjunction__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:242:1: ( ( rule__Conjunction__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:242:1: ( ( rule__Conjunction__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:243:1: ( rule__Conjunction__Alternatives )
            {
             before(grammarAccess.getConjunctionAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:244:1: ( rule__Conjunction__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:244:2: rule__Conjunction__Alternatives
            {
            pushFollow(FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction453);
            rule__Conjunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNumeral"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:256:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:257:1: ( ruleNumeral EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:258:1: ruleNumeral EOF
            {
             before(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral480);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getNumeralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeral487); 

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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:265:1: ruleNumeral : ( RULE_INT ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:269:2: ( ( RULE_INT ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:270:1: ( RULE_INT )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:270:1: ( RULE_INT )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:271:1: RULE_INT
            {
             before(grammarAccess.getNumeralAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumeral513); 
             after(grammarAccess.getNumeralAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "entryRuleProofSteps"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:284:1: entryRuleProofSteps : ruleProofSteps EOF ;
    public final void entryRuleProofSteps() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:285:1: ( ruleProofSteps EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:286:1: ruleProofSteps EOF
            {
             before(grammarAccess.getProofStepsRule()); 
            pushFollow(FOLLOW_ruleProofSteps_in_entryRuleProofSteps539);
            ruleProofSteps();

            state._fsp--;

             after(grammarAccess.getProofStepsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProofSteps546); 

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
    // $ANTLR end "entryRuleProofSteps"


    // $ANTLR start "ruleProofSteps"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:293:1: ruleProofSteps : ( ( rule__ProofSteps__Alternatives ) ) ;
    public final void ruleProofSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:297:2: ( ( ( rule__ProofSteps__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:298:1: ( ( rule__ProofSteps__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:298:1: ( ( rule__ProofSteps__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:299:1: ( rule__ProofSteps__Alternatives )
            {
             before(grammarAccess.getProofStepsAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:300:1: ( rule__ProofSteps__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:300:2: rule__ProofSteps__Alternatives
            {
            pushFollow(FOLLOW_rule__ProofSteps__Alternatives_in_ruleProofSteps572);
            rule__ProofSteps__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProofStepsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProofSteps"


    // $ANTLR start "entryRuleStatement"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:312:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:313:1: ( ruleStatement EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:314:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement599);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement606); 

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
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:321:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:325:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:326:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:326:1: ( ( rule__Statement__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:327:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:328:1: ( rule__Statement__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:328:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement632);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValidation"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:340:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:341:1: ( ruleValidation EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:342:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_ruleValidation_in_entryRuleValidation659);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidation666); 

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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:349:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:353:2: ( ( ( rule__Validation__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:354:1: ( ( rule__Validation__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:354:1: ( ( rule__Validation__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:355:1: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:356:1: ( rule__Validation__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:356:2: rule__Validation__Group__0
            {
            pushFollow(FOLLOW_rule__Validation__Group__0_in_ruleValidation692);
            rule__Validation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "ruleValidationKind"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:369:1: ruleValidationKind : ( ( rule__ValidationKind__Alternatives ) ) ;
    public final void ruleValidationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:373:1: ( ( ( rule__ValidationKind__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:374:1: ( ( rule__ValidationKind__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:374:1: ( ( rule__ValidationKind__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:375:1: ( rule__ValidationKind__Alternatives )
            {
             before(grammarAccess.getValidationKindAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:376:1: ( rule__ValidationKind__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:376:2: rule__ValidationKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidationKind__Alternatives_in_ruleValidationKind729);
            rule__ValidationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidationKind"


    // $ANTLR start "rule__Justification__Alternatives"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:387:1: rule__Justification__Alternatives : ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__EpsilonAssignment_1 ) ) | ( ( rule__Justification__NumeralAssignment_2 ) ) | ( ( rule__Justification__AssertionAssignment_3 ) ) | ( ( rule__Justification__EntailmentAssignment_4 ) ) );
    public final void rule__Justification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:391:1: ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__EpsilonAssignment_1 ) ) | ( ( rule__Justification__NumeralAssignment_2 ) ) | ( ( rule__Justification__AssertionAssignment_3 ) ) | ( ( rule__Justification__EntailmentAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==EOF||(LA1_3>=17 && LA1_3<=18)) ) {
                    alt1=3;
                }
                else if ( ((LA1_3>=19 && LA1_3<=20)) ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:392:1: ( ( rule__Justification__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:392:1: ( ( rule__Justification__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:393:1: ( rule__Justification__Group_0__0 )
                    {
                     before(grammarAccess.getJustificationAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:394:1: ( rule__Justification__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:394:2: rule__Justification__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Justification__Group_0__0_in_rule__Justification__Alternatives764);
                    rule__Justification__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:398:6: ( ( rule__Justification__EpsilonAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:398:6: ( ( rule__Justification__EpsilonAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:399:1: ( rule__Justification__EpsilonAssignment_1 )
                    {
                     before(grammarAccess.getJustificationAccess().getEpsilonAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:400:1: ( rule__Justification__EpsilonAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:400:2: rule__Justification__EpsilonAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Justification__EpsilonAssignment_1_in_rule__Justification__Alternatives782);
                    rule__Justification__EpsilonAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getEpsilonAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:404:6: ( ( rule__Justification__NumeralAssignment_2 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:404:6: ( ( rule__Justification__NumeralAssignment_2 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:405:1: ( rule__Justification__NumeralAssignment_2 )
                    {
                     before(grammarAccess.getJustificationAccess().getNumeralAssignment_2()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:406:1: ( rule__Justification__NumeralAssignment_2 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:406:2: rule__Justification__NumeralAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Justification__NumeralAssignment_2_in_rule__Justification__Alternatives800);
                    rule__Justification__NumeralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getNumeralAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:410:6: ( ( rule__Justification__AssertionAssignment_3 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:410:6: ( ( rule__Justification__AssertionAssignment_3 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:411:1: ( rule__Justification__AssertionAssignment_3 )
                    {
                     before(grammarAccess.getJustificationAccess().getAssertionAssignment_3()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:412:1: ( rule__Justification__AssertionAssignment_3 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:412:2: rule__Justification__AssertionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Justification__AssertionAssignment_3_in_rule__Justification__Alternatives818);
                    rule__Justification__AssertionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getAssertionAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:416:6: ( ( rule__Justification__EntailmentAssignment_4 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:416:6: ( ( rule__Justification__EntailmentAssignment_4 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:417:1: ( rule__Justification__EntailmentAssignment_4 )
                    {
                     before(grammarAccess.getJustificationAccess().getEntailmentAssignment_4()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:418:1: ( rule__Justification__EntailmentAssignment_4 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:418:2: rule__Justification__EntailmentAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Justification__EntailmentAssignment_4_in_rule__Justification__Alternatives836);
                    rule__Justification__EntailmentAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getEntailmentAssignment_4()); 

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
    // $ANTLR end "rule__Justification__Alternatives"


    // $ANTLR start "rule__Conjunction__Alternatives"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:427:1: rule__Conjunction__Alternatives : ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) );
    public final void rule__Conjunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:431:1: ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==19) ) {
                    alt2=2;
                }
                else if ( (LA2_1==20) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:432:1: ( ( rule__Conjunction__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:432:1: ( ( rule__Conjunction__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:433:1: ( rule__Conjunction__Group_0__0 )
                    {
                     before(grammarAccess.getConjunctionAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:434:1: ( rule__Conjunction__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:434:2: rule__Conjunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Conjunction__Group_0__0_in_rule__Conjunction__Alternatives869);
                    rule__Conjunction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConjunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:438:6: ( ( rule__Conjunction__LhsAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:438:6: ( ( rule__Conjunction__LhsAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:439:1: ( rule__Conjunction__LhsAssignment_1 )
                    {
                     before(grammarAccess.getConjunctionAccess().getLhsAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:440:1: ( rule__Conjunction__LhsAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:440:2: rule__Conjunction__LhsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Conjunction__LhsAssignment_1_in_rule__Conjunction__Alternatives887);
                    rule__Conjunction__LhsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConjunctionAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__Conjunction__Alternatives"


    // $ANTLR start "rule__ProofSteps__Alternatives"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:449:1: rule__ProofSteps__Alternatives : ( ( ( rule__ProofSteps__Group_0__0 ) ) | ( ( rule__ProofSteps__EpsilonAssignment_1 ) ) );
    public final void rule__ProofSteps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:453:1: ( ( ( rule__ProofSteps__Group_0__0 ) ) | ( ( rule__ProofSteps__EpsilonAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:454:1: ( ( rule__ProofSteps__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:454:1: ( ( rule__ProofSteps__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:455:1: ( rule__ProofSteps__Group_0__0 )
                    {
                     before(grammarAccess.getProofStepsAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:456:1: ( rule__ProofSteps__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:456:2: rule__ProofSteps__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__Group_0__0_in_rule__ProofSteps__Alternatives920);
                    rule__ProofSteps__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProofStepsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:460:6: ( ( rule__ProofSteps__EpsilonAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:460:6: ( ( rule__ProofSteps__EpsilonAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:461:1: ( rule__ProofSteps__EpsilonAssignment_1 )
                    {
                     before(grammarAccess.getProofStepsAccess().getEpsilonAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:462:1: ( rule__ProofSteps__EpsilonAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:462:2: rule__ProofSteps__EpsilonAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__EpsilonAssignment_1_in_rule__ProofSteps__Alternatives938);
                    rule__ProofSteps__EpsilonAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProofStepsAccess().getEpsilonAssignment_1()); 

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
    // $ANTLR end "rule__ProofSteps__Alternatives"


    // $ANTLR start "rule__ValidationKind__Alternatives"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:471:1: rule__ValidationKind__Alternatives : ( ( ( 'unknown' ) ) | ( ( 'valid' ) ) | ( ( 'invalid' ) ) );
    public final void rule__ValidationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:475:1: ( ( ( 'unknown' ) ) | ( ( 'valid' ) ) | ( ( 'invalid' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:476:1: ( ( 'unknown' ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:476:1: ( ( 'unknown' ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:477:1: ( 'unknown' )
                    {
                     before(grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:478:1: ( 'unknown' )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:478:3: 'unknown'
                    {
                    match(input,11,FOLLOW_11_in_rule__ValidationKind__Alternatives972); 

                    }

                     after(grammarAccess.getValidationKindAccess().getUNKNOWNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:483:6: ( ( 'valid' ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:483:6: ( ( 'valid' ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:484:1: ( 'valid' )
                    {
                     before(grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:485:1: ( 'valid' )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:485:3: 'valid'
                    {
                    match(input,12,FOLLOW_12_in_rule__ValidationKind__Alternatives993); 

                    }

                     after(grammarAccess.getValidationKindAccess().getVALIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:490:6: ( ( 'invalid' ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:490:6: ( ( 'invalid' ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:491:1: ( 'invalid' )
                    {
                     before(grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:492:1: ( 'invalid' )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:492:3: 'invalid'
                    {
                    match(input,13,FOLLOW_13_in_rule__ValidationKind__Alternatives1014); 

                    }

                     after(grammarAccess.getValidationKindAccess().getINVALIDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ValidationKind__Alternatives"


    // $ANTLR start "rule__Proof__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:504:1: rule__Proof__Group__0 : rule__Proof__Group__0__Impl rule__Proof__Group__1 ;
    public final void rule__Proof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:508:1: ( rule__Proof__Group__0__Impl rule__Proof__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:509:2: rule__Proof__Group__0__Impl rule__Proof__Group__1
            {
            pushFollow(FOLLOW_rule__Proof__Group__0__Impl_in_rule__Proof__Group__01047);
            rule__Proof__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__1_in_rule__Proof__Group__01050);
            rule__Proof__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__0"


    // $ANTLR start "rule__Proof__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:516:1: rule__Proof__Group__0__Impl : ( 'Theorem' ) ;
    public final void rule__Proof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:520:1: ( ( 'Theorem' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:521:1: ( 'Theorem' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:521:1: ( 'Theorem' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:522:1: 'Theorem'
            {
             before(grammarAccess.getProofAccess().getTheoremKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Proof__Group__0__Impl1078); 
             after(grammarAccess.getProofAccess().getTheoremKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__0__Impl"


    // $ANTLR start "rule__Proof__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:535:1: rule__Proof__Group__1 : rule__Proof__Group__1__Impl rule__Proof__Group__2 ;
    public final void rule__Proof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:539:1: ( rule__Proof__Group__1__Impl rule__Proof__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:540:2: rule__Proof__Group__1__Impl rule__Proof__Group__2
            {
            pushFollow(FOLLOW_rule__Proof__Group__1__Impl_in_rule__Proof__Group__11109);
            rule__Proof__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__2_in_rule__Proof__Group__11112);
            rule__Proof__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__1"


    // $ANTLR start "rule__Proof__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:547:1: rule__Proof__Group__1__Impl : ( ':' ) ;
    public final void rule__Proof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:551:1: ( ( ':' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:552:1: ( ':' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:552:1: ( ':' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:553:1: ':'
            {
             before(grammarAccess.getProofAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Proof__Group__1__Impl1140); 
             after(grammarAccess.getProofAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__1__Impl"


    // $ANTLR start "rule__Proof__Group__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:566:1: rule__Proof__Group__2 : rule__Proof__Group__2__Impl rule__Proof__Group__3 ;
    public final void rule__Proof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:570:1: ( rule__Proof__Group__2__Impl rule__Proof__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:571:2: rule__Proof__Group__2__Impl rule__Proof__Group__3
            {
            pushFollow(FOLLOW_rule__Proof__Group__2__Impl_in_rule__Proof__Group__21171);
            rule__Proof__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__3_in_rule__Proof__Group__21174);
            rule__Proof__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__2"


    // $ANTLR start "rule__Proof__Group__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:578:1: rule__Proof__Group__2__Impl : ( ( rule__Proof__TitleAssignment_2 ) ) ;
    public final void rule__Proof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:582:1: ( ( ( rule__Proof__TitleAssignment_2 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:583:1: ( ( rule__Proof__TitleAssignment_2 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:583:1: ( ( rule__Proof__TitleAssignment_2 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:584:1: ( rule__Proof__TitleAssignment_2 )
            {
             before(grammarAccess.getProofAccess().getTitleAssignment_2()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:585:1: ( rule__Proof__TitleAssignment_2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:585:2: rule__Proof__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Proof__TitleAssignment_2_in_rule__Proof__Group__2__Impl1201);
            rule__Proof__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProofAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__2__Impl"


    // $ANTLR start "rule__Proof__Group__3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:595:1: rule__Proof__Group__3 : rule__Proof__Group__3__Impl rule__Proof__Group__4 ;
    public final void rule__Proof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:599:1: ( rule__Proof__Group__3__Impl rule__Proof__Group__4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:600:2: rule__Proof__Group__3__Impl rule__Proof__Group__4
            {
            pushFollow(FOLLOW_rule__Proof__Group__3__Impl_in_rule__Proof__Group__31231);
            rule__Proof__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__4_in_rule__Proof__Group__31234);
            rule__Proof__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__3"


    // $ANTLR start "rule__Proof__Group__3__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:607:1: rule__Proof__Group__3__Impl : ( '(' ) ;
    public final void rule__Proof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:611:1: ( ( '(' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:612:1: ( '(' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:612:1: ( '(' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:613:1: '('
            {
             before(grammarAccess.getProofAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Proof__Group__3__Impl1262); 
             after(grammarAccess.getProofAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__3__Impl"


    // $ANTLR start "rule__Proof__Group__4"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:626:1: rule__Proof__Group__4 : rule__Proof__Group__4__Impl rule__Proof__Group__5 ;
    public final void rule__Proof__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:630:1: ( rule__Proof__Group__4__Impl rule__Proof__Group__5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:631:2: rule__Proof__Group__4__Impl rule__Proof__Group__5
            {
            pushFollow(FOLLOW_rule__Proof__Group__4__Impl_in_rule__Proof__Group__41293);
            rule__Proof__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__5_in_rule__Proof__Group__41296);
            rule__Proof__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__4"


    // $ANTLR start "rule__Proof__Group__4__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:638:1: rule__Proof__Group__4__Impl : ( ( rule__Proof__JustificationsAssignment_4 ) ) ;
    public final void rule__Proof__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:642:1: ( ( ( rule__Proof__JustificationsAssignment_4 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:643:1: ( ( rule__Proof__JustificationsAssignment_4 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:643:1: ( ( rule__Proof__JustificationsAssignment_4 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:644:1: ( rule__Proof__JustificationsAssignment_4 )
            {
             before(grammarAccess.getProofAccess().getJustificationsAssignment_4()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:645:1: ( rule__Proof__JustificationsAssignment_4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:645:2: rule__Proof__JustificationsAssignment_4
            {
            pushFollow(FOLLOW_rule__Proof__JustificationsAssignment_4_in_rule__Proof__Group__4__Impl1323);
            rule__Proof__JustificationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProofAccess().getJustificationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__4__Impl"


    // $ANTLR start "rule__Proof__Group__5"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:655:1: rule__Proof__Group__5 : rule__Proof__Group__5__Impl rule__Proof__Group__6 ;
    public final void rule__Proof__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:659:1: ( rule__Proof__Group__5__Impl rule__Proof__Group__6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:660:2: rule__Proof__Group__5__Impl rule__Proof__Group__6
            {
            pushFollow(FOLLOW_rule__Proof__Group__5__Impl_in_rule__Proof__Group__51353);
            rule__Proof__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__6_in_rule__Proof__Group__51356);
            rule__Proof__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__5"


    // $ANTLR start "rule__Proof__Group__5__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:667:1: rule__Proof__Group__5__Impl : ( ')' ) ;
    public final void rule__Proof__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:671:1: ( ( ')' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:672:1: ( ')' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:672:1: ( ')' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:673:1: ')'
            {
             before(grammarAccess.getProofAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Proof__Group__5__Impl1384); 
             after(grammarAccess.getProofAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__5__Impl"


    // $ANTLR start "rule__Proof__Group__6"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:686:1: rule__Proof__Group__6 : rule__Proof__Group__6__Impl ;
    public final void rule__Proof__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:690:1: ( rule__Proof__Group__6__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:691:2: rule__Proof__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Proof__Group__6__Impl_in_rule__Proof__Group__61415);
            rule__Proof__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__6"


    // $ANTLR start "rule__Proof__Group__6__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:697:1: rule__Proof__Group__6__Impl : ( ( rule__Proof__ProofStepsAssignment_6 ) ) ;
    public final void rule__Proof__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:701:1: ( ( ( rule__Proof__ProofStepsAssignment_6 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:702:1: ( ( rule__Proof__ProofStepsAssignment_6 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:702:1: ( ( rule__Proof__ProofStepsAssignment_6 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:703:1: ( rule__Proof__ProofStepsAssignment_6 )
            {
             before(grammarAccess.getProofAccess().getProofStepsAssignment_6()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:704:1: ( rule__Proof__ProofStepsAssignment_6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:704:2: rule__Proof__ProofStepsAssignment_6
            {
            pushFollow(FOLLOW_rule__Proof__ProofStepsAssignment_6_in_rule__Proof__Group__6__Impl1442);
            rule__Proof__ProofStepsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProofAccess().getProofStepsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__Group__6__Impl"


    // $ANTLR start "rule__Justifications__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:728:1: rule__Justifications__Group__0 : rule__Justifications__Group__0__Impl rule__Justifications__Group__1 ;
    public final void rule__Justifications__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:732:1: ( rule__Justifications__Group__0__Impl rule__Justifications__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:733:2: rule__Justifications__Group__0__Impl rule__Justifications__Group__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group__0__Impl_in_rule__Justifications__Group__01486);
            rule__Justifications__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group__1_in_rule__Justifications__Group__01489);
            rule__Justifications__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group__0"


    // $ANTLR start "rule__Justifications__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:740:1: rule__Justifications__Group__0__Impl : ( () ) ;
    public final void rule__Justifications__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:744:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:745:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:745:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:746:1: ()
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:747:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:749:1: 
            {
            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group__0__Impl"


    // $ANTLR start "rule__Justifications__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:759:1: rule__Justifications__Group__1 : rule__Justifications__Group__1__Impl ;
    public final void rule__Justifications__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:763:1: ( rule__Justifications__Group__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:764:2: rule__Justifications__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group__1__Impl_in_rule__Justifications__Group__11547);
            rule__Justifications__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group__1"


    // $ANTLR start "rule__Justifications__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:770:1: rule__Justifications__Group__1__Impl : ( ( rule__Justifications__Group_1__0 )? ) ;
    public final void rule__Justifications__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:774:1: ( ( ( rule__Justifications__Group_1__0 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:775:1: ( ( rule__Justifications__Group_1__0 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:775:1: ( ( rule__Justifications__Group_1__0 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:776:1: ( rule__Justifications__Group_1__0 )?
            {
             before(grammarAccess.getJustificationsAccess().getGroup_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:777:1: ( rule__Justifications__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||(LA5_0>=24 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:777:2: rule__Justifications__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Justifications__Group_1__0_in_rule__Justifications__Group__1__Impl1574);
                    rule__Justifications__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJustificationsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group__1__Impl"


    // $ANTLR start "rule__Justifications__Group_1__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:791:1: rule__Justifications__Group_1__0 : rule__Justifications__Group_1__0__Impl rule__Justifications__Group_1__1 ;
    public final void rule__Justifications__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:795:1: ( rule__Justifications__Group_1__0__Impl rule__Justifications__Group_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:796:2: rule__Justifications__Group_1__0__Impl rule__Justifications__Group_1__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group_1__0__Impl_in_rule__Justifications__Group_1__01609);
            rule__Justifications__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group_1__1_in_rule__Justifications__Group_1__01612);
            rule__Justifications__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1__0"


    // $ANTLR start "rule__Justifications__Group_1__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:803:1: rule__Justifications__Group_1__0__Impl : ( ( rule__Justifications__JustificationsAssignment_1_0 ) ) ;
    public final void rule__Justifications__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:807:1: ( ( ( rule__Justifications__JustificationsAssignment_1_0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:808:1: ( ( rule__Justifications__JustificationsAssignment_1_0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:808:1: ( ( rule__Justifications__JustificationsAssignment_1_0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:809:1: ( rule__Justifications__JustificationsAssignment_1_0 )
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAssignment_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:810:1: ( rule__Justifications__JustificationsAssignment_1_0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:810:2: rule__Justifications__JustificationsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Justifications__JustificationsAssignment_1_0_in_rule__Justifications__Group_1__0__Impl1639);
            rule__Justifications__JustificationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1__0__Impl"


    // $ANTLR start "rule__Justifications__Group_1__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:820:1: rule__Justifications__Group_1__1 : rule__Justifications__Group_1__1__Impl ;
    public final void rule__Justifications__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:824:1: ( rule__Justifications__Group_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:825:2: rule__Justifications__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group_1__1__Impl_in_rule__Justifications__Group_1__11669);
            rule__Justifications__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1__1"


    // $ANTLR start "rule__Justifications__Group_1__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:831:1: rule__Justifications__Group_1__1__Impl : ( ( rule__Justifications__Group_1_1__0 )* ) ;
    public final void rule__Justifications__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:835:1: ( ( ( rule__Justifications__Group_1_1__0 )* ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:836:1: ( ( rule__Justifications__Group_1_1__0 )* )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:836:1: ( ( rule__Justifications__Group_1_1__0 )* )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:837:1: ( rule__Justifications__Group_1_1__0 )*
            {
             before(grammarAccess.getJustificationsAccess().getGroup_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:838:1: ( rule__Justifications__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:838:2: rule__Justifications__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Justifications__Group_1_1__0_in_rule__Justifications__Group_1__1__Impl1696);
            	    rule__Justifications__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJustificationsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1__1__Impl"


    // $ANTLR start "rule__Justifications__Group_1_1__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:852:1: rule__Justifications__Group_1_1__0 : rule__Justifications__Group_1_1__0__Impl rule__Justifications__Group_1_1__1 ;
    public final void rule__Justifications__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:856:1: ( rule__Justifications__Group_1_1__0__Impl rule__Justifications__Group_1_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:857:2: rule__Justifications__Group_1_1__0__Impl rule__Justifications__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group_1_1__0__Impl_in_rule__Justifications__Group_1_1__01731);
            rule__Justifications__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group_1_1__1_in_rule__Justifications__Group_1_1__01734);
            rule__Justifications__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1_1__0"


    // $ANTLR start "rule__Justifications__Group_1_1__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:864:1: rule__Justifications__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Justifications__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:868:1: ( ( ',' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:869:1: ( ',' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:869:1: ( ',' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:870:1: ','
            {
             before(grammarAccess.getJustificationsAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Justifications__Group_1_1__0__Impl1762); 
             after(grammarAccess.getJustificationsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1_1__0__Impl"


    // $ANTLR start "rule__Justifications__Group_1_1__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:883:1: rule__Justifications__Group_1_1__1 : rule__Justifications__Group_1_1__1__Impl ;
    public final void rule__Justifications__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:887:1: ( rule__Justifications__Group_1_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:888:2: rule__Justifications__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group_1_1__1__Impl_in_rule__Justifications__Group_1_1__11793);
            rule__Justifications__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1_1__1"


    // $ANTLR start "rule__Justifications__Group_1_1__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:894:1: rule__Justifications__Group_1_1__1__Impl : ( ( rule__Justifications__JustificationsAssignment_1_1_1 ) ) ;
    public final void rule__Justifications__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:898:1: ( ( ( rule__Justifications__JustificationsAssignment_1_1_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:899:1: ( ( rule__Justifications__JustificationsAssignment_1_1_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:899:1: ( ( rule__Justifications__JustificationsAssignment_1_1_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:900:1: ( rule__Justifications__JustificationsAssignment_1_1_1 )
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAssignment_1_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:901:1: ( rule__Justifications__JustificationsAssignment_1_1_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:901:2: rule__Justifications__JustificationsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Justifications__JustificationsAssignment_1_1_1_in_rule__Justifications__Group_1_1__1__Impl1820);
            rule__Justifications__JustificationsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__Group_1_1__1__Impl"


    // $ANTLR start "rule__Justification__Group_0__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:915:1: rule__Justification__Group_0__0 : rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1 ;
    public final void rule__Justification__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:919:1: ( rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:920:2: rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1
            {
            pushFollow(FOLLOW_rule__Justification__Group_0__0__Impl_in_rule__Justification__Group_0__01854);
            rule__Justification__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Justification__Group_0__1_in_rule__Justification__Group_0__01857);
            rule__Justification__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__Group_0__0"


    // $ANTLR start "rule__Justification__Group_0__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:927:1: rule__Justification__Group_0__0__Impl : ( () ) ;
    public final void rule__Justification__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:931:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:932:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:932:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:933:1: ()
            {
             before(grammarAccess.getJustificationAccess().getJustificationAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:934:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:936:1: 
            {
            }

             after(grammarAccess.getJustificationAccess().getJustificationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__Group_0__0__Impl"


    // $ANTLR start "rule__Justification__Group_0__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:946:1: rule__Justification__Group_0__1 : rule__Justification__Group_0__1__Impl ;
    public final void rule__Justification__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:950:1: ( rule__Justification__Group_0__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:951:2: rule__Justification__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Justification__Group_0__1__Impl_in_rule__Justification__Group_0__11915);
            rule__Justification__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__Group_0__1"


    // $ANTLR start "rule__Justification__Group_0__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:957:1: rule__Justification__Group_0__1__Impl : ( ( rule__Justification__HypothesisAssignment_0_1 ) ) ;
    public final void rule__Justification__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:961:1: ( ( ( rule__Justification__HypothesisAssignment_0_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:962:1: ( ( rule__Justification__HypothesisAssignment_0_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:962:1: ( ( rule__Justification__HypothesisAssignment_0_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:963:1: ( rule__Justification__HypothesisAssignment_0_1 )
            {
             before(grammarAccess.getJustificationAccess().getHypothesisAssignment_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:964:1: ( rule__Justification__HypothesisAssignment_0_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:964:2: rule__Justification__HypothesisAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Justification__HypothesisAssignment_0_1_in_rule__Justification__Group_0__1__Impl1942);
            rule__Justification__HypothesisAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJustificationAccess().getHypothesisAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__Group_0__1__Impl"


    // $ANTLR start "rule__QuotedAssertion__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:978:1: rule__QuotedAssertion__Group__0 : rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1 ;
    public final void rule__QuotedAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:982:1: ( rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:983:2: rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__0__Impl_in_rule__QuotedAssertion__Group__01976);
            rule__QuotedAssertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuotedAssertion__Group__1_in_rule__QuotedAssertion__Group__01979);
            rule__QuotedAssertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedAssertion__Group__0"


    // $ANTLR start "rule__QuotedAssertion__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:990:1: rule__QuotedAssertion__Group__0__Impl : ( () ) ;
    public final void rule__QuotedAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:994:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:995:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:995:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:996:1: ()
            {
             before(grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:997:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:999:1: 
            {
            }

             after(grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedAssertion__Group__0__Impl"


    // $ANTLR start "rule__QuotedAssertion__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1009:1: rule__QuotedAssertion__Group__1 : rule__QuotedAssertion__Group__1__Impl ;
    public final void rule__QuotedAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1013:1: ( rule__QuotedAssertion__Group__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1014:2: rule__QuotedAssertion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__1__Impl_in_rule__QuotedAssertion__Group__12037);
            rule__QuotedAssertion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedAssertion__Group__1"


    // $ANTLR start "rule__QuotedAssertion__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1020:1: rule__QuotedAssertion__Group__1__Impl : ( ( rule__QuotedAssertion__TextAssignment_1 ) ) ;
    public final void rule__QuotedAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1024:1: ( ( ( rule__QuotedAssertion__TextAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1025:1: ( ( rule__QuotedAssertion__TextAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1025:1: ( ( rule__QuotedAssertion__TextAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1026:1: ( rule__QuotedAssertion__TextAssignment_1 )
            {
             before(grammarAccess.getQuotedAssertionAccess().getTextAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1027:1: ( rule__QuotedAssertion__TextAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1027:2: rule__QuotedAssertion__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__TextAssignment_1_in_rule__QuotedAssertion__Group__1__Impl2064);
            rule__QuotedAssertion__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedAssertionAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedAssertion__Group__1__Impl"


    // $ANTLR start "rule__Entailment__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1041:1: rule__Entailment__Group__0 : rule__Entailment__Group__0__Impl rule__Entailment__Group__1 ;
    public final void rule__Entailment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1045:1: ( rule__Entailment__Group__0__Impl rule__Entailment__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1046:2: rule__Entailment__Group__0__Impl rule__Entailment__Group__1
            {
            pushFollow(FOLLOW_rule__Entailment__Group__0__Impl_in_rule__Entailment__Group__02098);
            rule__Entailment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__1_in_rule__Entailment__Group__02101);
            rule__Entailment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__0"


    // $ANTLR start "rule__Entailment__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1053:1: rule__Entailment__Group__0__Impl : ( () ) ;
    public final void rule__Entailment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1057:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1058:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1058:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1059:1: ()
            {
             before(grammarAccess.getEntailmentAccess().getEntailmentAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1060:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1062:1: 
            {
            }

             after(grammarAccess.getEntailmentAccess().getEntailmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__0__Impl"


    // $ANTLR start "rule__Entailment__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1072:1: rule__Entailment__Group__1 : rule__Entailment__Group__1__Impl rule__Entailment__Group__2 ;
    public final void rule__Entailment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1076:1: ( rule__Entailment__Group__1__Impl rule__Entailment__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1077:2: rule__Entailment__Group__1__Impl rule__Entailment__Group__2
            {
            pushFollow(FOLLOW_rule__Entailment__Group__1__Impl_in_rule__Entailment__Group__12159);
            rule__Entailment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__2_in_rule__Entailment__Group__12162);
            rule__Entailment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__1"


    // $ANTLR start "rule__Entailment__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1084:1: rule__Entailment__Group__1__Impl : ( ( rule__Entailment__HeadAssignment_1 ) ) ;
    public final void rule__Entailment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1088:1: ( ( ( rule__Entailment__HeadAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1089:1: ( ( rule__Entailment__HeadAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1089:1: ( ( rule__Entailment__HeadAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1090:1: ( rule__Entailment__HeadAssignment_1 )
            {
             before(grammarAccess.getEntailmentAccess().getHeadAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1091:1: ( rule__Entailment__HeadAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1091:2: rule__Entailment__HeadAssignment_1
            {
            pushFollow(FOLLOW_rule__Entailment__HeadAssignment_1_in_rule__Entailment__Group__1__Impl2189);
            rule__Entailment__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntailmentAccess().getHeadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__1__Impl"


    // $ANTLR start "rule__Entailment__Group__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1101:1: rule__Entailment__Group__2 : rule__Entailment__Group__2__Impl rule__Entailment__Group__3 ;
    public final void rule__Entailment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1105:1: ( rule__Entailment__Group__2__Impl rule__Entailment__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1106:2: rule__Entailment__Group__2__Impl rule__Entailment__Group__3
            {
            pushFollow(FOLLOW_rule__Entailment__Group__2__Impl_in_rule__Entailment__Group__22219);
            rule__Entailment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__3_in_rule__Entailment__Group__22222);
            rule__Entailment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__2"


    // $ANTLR start "rule__Entailment__Group__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1113:1: rule__Entailment__Group__2__Impl : ( '->' ) ;
    public final void rule__Entailment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1117:1: ( ( '->' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1118:1: ( '->' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1118:1: ( '->' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1119:1: '->'
            {
             before(grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Entailment__Group__2__Impl2250); 
             after(grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__2__Impl"


    // $ANTLR start "rule__Entailment__Group__3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1132:1: rule__Entailment__Group__3 : rule__Entailment__Group__3__Impl ;
    public final void rule__Entailment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1136:1: ( rule__Entailment__Group__3__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1137:2: rule__Entailment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entailment__Group__3__Impl_in_rule__Entailment__Group__32281);
            rule__Entailment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__3"


    // $ANTLR start "rule__Entailment__Group__3__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1143:1: rule__Entailment__Group__3__Impl : ( ( rule__Entailment__TailAssignment_3 ) ) ;
    public final void rule__Entailment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1147:1: ( ( ( rule__Entailment__TailAssignment_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1148:1: ( ( rule__Entailment__TailAssignment_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1148:1: ( ( rule__Entailment__TailAssignment_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1149:1: ( rule__Entailment__TailAssignment_3 )
            {
             before(grammarAccess.getEntailmentAccess().getTailAssignment_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1150:1: ( rule__Entailment__TailAssignment_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1150:2: rule__Entailment__TailAssignment_3
            {
            pushFollow(FOLLOW_rule__Entailment__TailAssignment_3_in_rule__Entailment__Group__3__Impl2308);
            rule__Entailment__TailAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntailmentAccess().getTailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__Group__3__Impl"


    // $ANTLR start "rule__Conjunction__Group_0__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1168:1: rule__Conjunction__Group_0__0 : rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1 ;
    public final void rule__Conjunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1172:1: ( rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1173:2: rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__0__Impl_in_rule__Conjunction__Group_0__02346);
            rule__Conjunction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__1_in_rule__Conjunction__Group_0__02349);
            rule__Conjunction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__0"


    // $ANTLR start "rule__Conjunction__Group_0__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1180:1: rule__Conjunction__Group_0__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1184:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1185:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1185:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1186:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1187:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1189:1: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getConjunctionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_0__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1199:1: rule__Conjunction__Group_0__1 : rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2 ;
    public final void rule__Conjunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1203:1: ( rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1204:2: rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__1__Impl_in_rule__Conjunction__Group_0__12407);
            rule__Conjunction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__2_in_rule__Conjunction__Group_0__12410);
            rule__Conjunction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__1"


    // $ANTLR start "rule__Conjunction__Group_0__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1211:1: rule__Conjunction__Group_0__1__Impl : ( ( rule__Conjunction__LhsAssignment_0_1 ) ) ;
    public final void rule__Conjunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1215:1: ( ( ( rule__Conjunction__LhsAssignment_0_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1216:1: ( ( rule__Conjunction__LhsAssignment_0_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1216:1: ( ( rule__Conjunction__LhsAssignment_0_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1217:1: ( rule__Conjunction__LhsAssignment_0_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLhsAssignment_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1218:1: ( rule__Conjunction__LhsAssignment_0_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1218:2: rule__Conjunction__LhsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Conjunction__LhsAssignment_0_1_in_rule__Conjunction__Group_0__1__Impl2437);
            rule__Conjunction__LhsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getLhsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_0__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1228:1: rule__Conjunction__Group_0__2 : rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3 ;
    public final void rule__Conjunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1232:1: ( rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1233:2: rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__2__Impl_in_rule__Conjunction__Group_0__22467);
            rule__Conjunction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__3_in_rule__Conjunction__Group_0__22470);
            rule__Conjunction__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__2"


    // $ANTLR start "rule__Conjunction__Group_0__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1240:1: rule__Conjunction__Group_0__2__Impl : ( '^' ) ;
    public final void rule__Conjunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1244:1: ( ( '^' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1245:1: ( '^' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1245:1: ( '^' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1246:1: '^'
            {
             before(grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Conjunction__Group_0__2__Impl2498); 
             after(grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__2__Impl"


    // $ANTLR start "rule__Conjunction__Group_0__3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1259:1: rule__Conjunction__Group_0__3 : rule__Conjunction__Group_0__3__Impl ;
    public final void rule__Conjunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1263:1: ( rule__Conjunction__Group_0__3__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1264:2: rule__Conjunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__3__Impl_in_rule__Conjunction__Group_0__32529);
            rule__Conjunction__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__3"


    // $ANTLR start "rule__Conjunction__Group_0__3__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1270:1: rule__Conjunction__Group_0__3__Impl : ( ( rule__Conjunction__RhsAssignment_0_3 ) ) ;
    public final void rule__Conjunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1274:1: ( ( ( rule__Conjunction__RhsAssignment_0_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1275:1: ( ( rule__Conjunction__RhsAssignment_0_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1275:1: ( ( rule__Conjunction__RhsAssignment_0_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1276:1: ( rule__Conjunction__RhsAssignment_0_3 )
            {
             before(grammarAccess.getConjunctionAccess().getRhsAssignment_0_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1277:1: ( rule__Conjunction__RhsAssignment_0_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1277:2: rule__Conjunction__RhsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Conjunction__RhsAssignment_0_3_in_rule__Conjunction__Group_0__3__Impl2556);
            rule__Conjunction__RhsAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRhsAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_0__3__Impl"


    // $ANTLR start "rule__ProofSteps__Group_0__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1295:1: rule__ProofSteps__Group_0__0 : rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1 ;
    public final void rule__ProofSteps__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1299:1: ( rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1300:2: rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0__0__Impl_in_rule__ProofSteps__Group_0__02594);
            rule__ProofSteps__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProofSteps__Group_0__1_in_rule__ProofSteps__Group_0__02597);
            rule__ProofSteps__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0__0"


    // $ANTLR start "rule__ProofSteps__Group_0__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1307:1: rule__ProofSteps__Group_0__0__Impl : ( () ) ;
    public final void rule__ProofSteps__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1311:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1312:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1312:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1313:1: ()
            {
             before(grammarAccess.getProofStepsAccess().getProofStepsAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1314:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1316:1: 
            {
            }

             after(grammarAccess.getProofStepsAccess().getProofStepsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0__0__Impl"


    // $ANTLR start "rule__ProofSteps__Group_0__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1326:1: rule__ProofSteps__Group_0__1 : rule__ProofSteps__Group_0__1__Impl ;
    public final void rule__ProofSteps__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1330:1: ( rule__ProofSteps__Group_0__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1331:2: rule__ProofSteps__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0__1__Impl_in_rule__ProofSteps__Group_0__12655);
            rule__ProofSteps__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0__1"


    // $ANTLR start "rule__ProofSteps__Group_0__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1337:1: rule__ProofSteps__Group_0__1__Impl : ( ( rule__ProofSteps__Group_0_1__0 )? ) ;
    public final void rule__ProofSteps__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1341:1: ( ( ( rule__ProofSteps__Group_0_1__0 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1342:1: ( ( rule__ProofSteps__Group_0_1__0 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1342:1: ( ( rule__ProofSteps__Group_0_1__0 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1343:1: ( rule__ProofSteps__Group_0_1__0 )?
            {
             before(grammarAccess.getProofStepsAccess().getGroup_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1344:1: ( rule__ProofSteps__Group_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1344:2: rule__ProofSteps__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__0_in_rule__ProofSteps__Group_0__1__Impl2682);
                    rule__ProofSteps__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProofStepsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0__1__Impl"


    // $ANTLR start "rule__ProofSteps__Group_0_1__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1358:1: rule__ProofSteps__Group_0_1__0 : rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1 ;
    public final void rule__ProofSteps__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1362:1: ( rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1363:2: rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__0__Impl_in_rule__ProofSteps__Group_0_1__02717);
            rule__ProofSteps__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__1_in_rule__ProofSteps__Group_0_1__02720);
            rule__ProofSteps__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0_1__0"


    // $ANTLR start "rule__ProofSteps__Group_0_1__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1370:1: rule__ProofSteps__Group_0_1__0__Impl : ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) ) ;
    public final void rule__ProofSteps__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1374:1: ( ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1375:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1375:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1376:1: ( rule__ProofSteps__StatementsAssignment_0_1_0 )
            {
             before(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1377:1: ( rule__ProofSteps__StatementsAssignment_0_1_0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1377:2: rule__ProofSteps__StatementsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_0_in_rule__ProofSteps__Group_0_1__0__Impl2747);
            rule__ProofSteps__StatementsAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0_1__0__Impl"


    // $ANTLR start "rule__ProofSteps__Group_0_1__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1387:1: rule__ProofSteps__Group_0_1__1 : rule__ProofSteps__Group_0_1__1__Impl ;
    public final void rule__ProofSteps__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1391:1: ( rule__ProofSteps__Group_0_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1392:2: rule__ProofSteps__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__1__Impl_in_rule__ProofSteps__Group_0_1__12777);
            rule__ProofSteps__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0_1__1"


    // $ANTLR start "rule__ProofSteps__Group_0_1__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1398:1: rule__ProofSteps__Group_0_1__1__Impl : ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* ) ;
    public final void rule__ProofSteps__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1402:1: ( ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1403:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1403:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1404:1: ( rule__ProofSteps__StatementsAssignment_0_1_1 )*
            {
             before(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1405:1: ( rule__ProofSteps__StatementsAssignment_0_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1405:2: rule__ProofSteps__StatementsAssignment_0_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_1_in_rule__ProofSteps__Group_0_1__1__Impl2804);
            	    rule__ProofSteps__StatementsAssignment_0_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__Group_0_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1419:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1423:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1424:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02839);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02842);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1431:1: rule__Statement__Group__0__Impl : ( () ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1435:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1436:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1436:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1437:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1438:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1440:1: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1450:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1454:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1455:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12900);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12903);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1462:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__IdAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1466:1: ( ( ( rule__Statement__IdAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1467:1: ( ( rule__Statement__IdAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1467:1: ( ( rule__Statement__IdAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1468:1: ( rule__Statement__IdAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getIdAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1469:1: ( rule__Statement__IdAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1469:2: rule__Statement__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__IdAssignment_1_in_rule__Statement__Group__1__Impl2930);
            rule__Statement__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1479:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1483:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1484:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22960);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22963);
            rule__Statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1491:1: rule__Statement__Group__2__Impl : ( '.' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1495:1: ( ( '.' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1496:1: ( '.' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1496:1: ( '.' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1497:1: '.'
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group__2__Impl2991); 
             after(grammarAccess.getStatementAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1510:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1514:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1515:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__33022);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__33025);
            rule__Statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1522:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__StatementAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1526:1: ( ( ( rule__Statement__StatementAssignment_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1527:1: ( ( rule__Statement__StatementAssignment_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1527:1: ( ( rule__Statement__StatementAssignment_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1528:1: ( rule__Statement__StatementAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1529:1: ( rule__Statement__StatementAssignment_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1529:2: rule__Statement__StatementAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_3_in_rule__Statement__Group__3__Impl3052);
            rule__Statement__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__4"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1539:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1543:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1544:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__43082);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__43085);
            rule__Statement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1551:1: rule__Statement__Group__4__Impl : ( '(' ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1555:1: ( ( '(' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1556:1: ( '(' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1556:1: ( '(' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1557:1: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Statement__Group__4__Impl3113); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Statement__Group__5"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1570:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl rule__Statement__Group__6 ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1574:1: ( rule__Statement__Group__5__Impl rule__Statement__Group__6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1575:2: rule__Statement__Group__5__Impl rule__Statement__Group__6
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__53144);
            rule__Statement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__6_in_rule__Statement__Group__53147);
            rule__Statement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5"


    // $ANTLR start "rule__Statement__Group__5__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1582:1: rule__Statement__Group__5__Impl : ( ( rule__Statement__JustificationAssignment_5 ) ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1586:1: ( ( ( rule__Statement__JustificationAssignment_5 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1587:1: ( ( rule__Statement__JustificationAssignment_5 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1587:1: ( ( rule__Statement__JustificationAssignment_5 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1588:1: ( rule__Statement__JustificationAssignment_5 )
            {
             before(grammarAccess.getStatementAccess().getJustificationAssignment_5()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1589:1: ( rule__Statement__JustificationAssignment_5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1589:2: rule__Statement__JustificationAssignment_5
            {
            pushFollow(FOLLOW_rule__Statement__JustificationAssignment_5_in_rule__Statement__Group__5__Impl3174);
            rule__Statement__JustificationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getJustificationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group__6"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1599:1: rule__Statement__Group__6 : rule__Statement__Group__6__Impl rule__Statement__Group__7 ;
    public final void rule__Statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1603:1: ( rule__Statement__Group__6__Impl rule__Statement__Group__7 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1604:2: rule__Statement__Group__6__Impl rule__Statement__Group__7
            {
            pushFollow(FOLLOW_rule__Statement__Group__6__Impl_in_rule__Statement__Group__63204);
            rule__Statement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__7_in_rule__Statement__Group__63207);
            rule__Statement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__6"


    // $ANTLR start "rule__Statement__Group__6__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1611:1: rule__Statement__Group__6__Impl : ( ')' ) ;
    public final void rule__Statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1615:1: ( ( ')' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1616:1: ( ')' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1616:1: ( ')' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1617:1: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Statement__Group__6__Impl3235); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__6__Impl"


    // $ANTLR start "rule__Statement__Group__7"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1630:1: rule__Statement__Group__7 : rule__Statement__Group__7__Impl ;
    public final void rule__Statement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1634:1: ( rule__Statement__Group__7__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1635:2: rule__Statement__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__7__Impl_in_rule__Statement__Group__73266);
            rule__Statement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__7"


    // $ANTLR start "rule__Statement__Group__7__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1641:1: rule__Statement__Group__7__Impl : ( ( rule__Statement__Group_7__0 )? ) ;
    public final void rule__Statement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1645:1: ( ( ( rule__Statement__Group_7__0 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1646:1: ( ( rule__Statement__Group_7__0 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1646:1: ( ( rule__Statement__Group_7__0 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1647:1: ( rule__Statement__Group_7__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_7()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1648:1: ( rule__Statement__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1648:2: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Group__7__Impl3293);
                    rule__Statement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__7__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1674:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1678:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1679:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__03340);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__03343);
            rule__Statement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1686:1: rule__Statement__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1690:1: ( ( '{' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1691:1: ( '{' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1691:1: ( '{' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1692:1: '{'
            {
             before(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,22,FOLLOW_22_in_rule__Statement__Group_7__0__Impl3371); 
             after(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1705:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1709:1: ( rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1710:2: rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__13402);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__13405);
            rule__Statement__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1717:1: rule__Statement__Group_7__1__Impl : ( ( rule__Statement__ValidationAssignment_7_1 ) ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1721:1: ( ( ( rule__Statement__ValidationAssignment_7_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1722:1: ( ( rule__Statement__ValidationAssignment_7_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1722:1: ( ( rule__Statement__ValidationAssignment_7_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1723:1: ( rule__Statement__ValidationAssignment_7_1 )
            {
             before(grammarAccess.getStatementAccess().getValidationAssignment_7_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1724:1: ( rule__Statement__ValidationAssignment_7_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1724:2: rule__Statement__ValidationAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Statement__ValidationAssignment_7_1_in_rule__Statement__Group_7__1__Impl3432);
            rule__Statement__ValidationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValidationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1734:1: rule__Statement__Group_7__2 : rule__Statement__Group_7__2__Impl ;
    public final void rule__Statement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1738:1: ( rule__Statement__Group_7__2__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1739:2: rule__Statement__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__23462);
            rule__Statement__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__2"


    // $ANTLR start "rule__Statement__Group_7__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1745:1: rule__Statement__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Statement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1749:1: ( ( '}' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1750:1: ( '}' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1750:1: ( '}' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1751:1: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,23,FOLLOW_23_in_rule__Statement__Group_7__2__Impl3490); 
             after(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__2__Impl"


    // $ANTLR start "rule__Validation__Group__0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1770:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1774:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1775:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_rule__Validation__Group__0__Impl_in_rule__Validation__Group__03527);
            rule__Validation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Validation__Group__1_in_rule__Validation__Group__03530);
            rule__Validation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0"


    // $ANTLR start "rule__Validation__Group__0__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1782:1: rule__Validation__Group__0__Impl : ( () ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1786:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1787:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1787:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1788:1: ()
            {
             before(grammarAccess.getValidationAccess().getValidationAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1789:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1791:1: 
            {
            }

             after(grammarAccess.getValidationAccess().getValidationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0__Impl"


    // $ANTLR start "rule__Validation__Group__1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1801:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl rule__Validation__Group__2 ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1805:1: ( rule__Validation__Group__1__Impl rule__Validation__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1806:2: rule__Validation__Group__1__Impl rule__Validation__Group__2
            {
            pushFollow(FOLLOW_rule__Validation__Group__1__Impl_in_rule__Validation__Group__13588);
            rule__Validation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Validation__Group__2_in_rule__Validation__Group__13591);
            rule__Validation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1"


    // $ANTLR start "rule__Validation__Group__1__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1813:1: rule__Validation__Group__1__Impl : ( ( rule__Validation__AuthorAssignment_1 ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1817:1: ( ( ( rule__Validation__AuthorAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1818:1: ( ( rule__Validation__AuthorAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1818:1: ( ( rule__Validation__AuthorAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1819:1: ( rule__Validation__AuthorAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getAuthorAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1820:1: ( rule__Validation__AuthorAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1820:2: rule__Validation__AuthorAssignment_1
            {
            pushFollow(FOLLOW_rule__Validation__AuthorAssignment_1_in_rule__Validation__Group__1__Impl3618);
            rule__Validation__AuthorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getAuthorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1__Impl"


    // $ANTLR start "rule__Validation__Group__2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1830:1: rule__Validation__Group__2 : rule__Validation__Group__2__Impl rule__Validation__Group__3 ;
    public final void rule__Validation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1834:1: ( rule__Validation__Group__2__Impl rule__Validation__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1835:2: rule__Validation__Group__2__Impl rule__Validation__Group__3
            {
            pushFollow(FOLLOW_rule__Validation__Group__2__Impl_in_rule__Validation__Group__23648);
            rule__Validation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Validation__Group__3_in_rule__Validation__Group__23651);
            rule__Validation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__2"


    // $ANTLR start "rule__Validation__Group__2__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1842:1: rule__Validation__Group__2__Impl : ( ( rule__Validation__TimeStampAssignment_2 )? ) ;
    public final void rule__Validation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1846:1: ( ( ( rule__Validation__TimeStampAssignment_2 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1847:1: ( ( rule__Validation__TimeStampAssignment_2 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1847:1: ( ( rule__Validation__TimeStampAssignment_2 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1848:1: ( rule__Validation__TimeStampAssignment_2 )?
            {
             before(grammarAccess.getValidationAccess().getTimeStampAssignment_2()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1849:1: ( rule__Validation__TimeStampAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1849:2: rule__Validation__TimeStampAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Validation__TimeStampAssignment_2_in_rule__Validation__Group__2__Impl3678);
                    rule__Validation__TimeStampAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidationAccess().getTimeStampAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__2__Impl"


    // $ANTLR start "rule__Validation__Group__3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1859:1: rule__Validation__Group__3 : rule__Validation__Group__3__Impl ;
    public final void rule__Validation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1863:1: ( rule__Validation__Group__3__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1864:2: rule__Validation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Validation__Group__3__Impl_in_rule__Validation__Group__33709);
            rule__Validation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__3"


    // $ANTLR start "rule__Validation__Group__3__Impl"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1870:1: rule__Validation__Group__3__Impl : ( ( rule__Validation__StateAssignment_3 ) ) ;
    public final void rule__Validation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1874:1: ( ( ( rule__Validation__StateAssignment_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1875:1: ( ( rule__Validation__StateAssignment_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1875:1: ( ( rule__Validation__StateAssignment_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1876:1: ( rule__Validation__StateAssignment_3 )
            {
             before(grammarAccess.getValidationAccess().getStateAssignment_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1877:1: ( rule__Validation__StateAssignment_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1877:2: rule__Validation__StateAssignment_3
            {
            pushFollow(FOLLOW_rule__Validation__StateAssignment_3_in_rule__Validation__Group__3__Impl3736);
            rule__Validation__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__3__Impl"


    // $ANTLR start "rule__Proof__TitleAssignment_2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1896:1: rule__Proof__TitleAssignment_2 : ( ruleText ) ;
    public final void rule__Proof__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1900:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1901:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1901:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1902:1: ruleText
            {
             before(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Proof__TitleAssignment_23779);
            ruleText();

            state._fsp--;

             after(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__TitleAssignment_2"


    // $ANTLR start "rule__Proof__JustificationsAssignment_4"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1911:1: rule__Proof__JustificationsAssignment_4 : ( ruleJustifications ) ;
    public final void rule__Proof__JustificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1915:1: ( ( ruleJustifications ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1916:1: ( ruleJustifications )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1916:1: ( ruleJustifications )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1917:1: ruleJustifications
            {
             before(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleJustifications_in_rule__Proof__JustificationsAssignment_43810);
            ruleJustifications();

            state._fsp--;

             after(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__JustificationsAssignment_4"


    // $ANTLR start "rule__Proof__ProofStepsAssignment_6"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1926:1: rule__Proof__ProofStepsAssignment_6 : ( ruleProofSteps ) ;
    public final void rule__Proof__ProofStepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1930:1: ( ( ruleProofSteps ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1931:1: ( ruleProofSteps )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1931:1: ( ruleProofSteps )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1932:1: ruleProofSteps
            {
             before(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleProofSteps_in_rule__Proof__ProofStepsAssignment_63841);
            ruleProofSteps();

            state._fsp--;

             after(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proof__ProofStepsAssignment_6"


    // $ANTLR start "rule__Justifications__JustificationsAssignment_1_0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1941:1: rule__Justifications__JustificationsAssignment_1_0 : ( ruleJustification ) ;
    public final void rule__Justifications__JustificationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1945:1: ( ( ruleJustification ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1946:1: ( ruleJustification )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1946:1: ( ruleJustification )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1947:1: ruleJustification
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_1_03872);
            ruleJustification();

            state._fsp--;

             after(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__JustificationsAssignment_1_0"


    // $ANTLR start "rule__Justifications__JustificationsAssignment_1_1_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1956:1: rule__Justifications__JustificationsAssignment_1_1_1 : ( ruleJustification ) ;
    public final void rule__Justifications__JustificationsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1960:1: ( ( ruleJustification ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1961:1: ( ruleJustification )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1961:1: ( ruleJustification )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1962:1: ruleJustification
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_1_1_13903);
            ruleJustification();

            state._fsp--;

             after(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justifications__JustificationsAssignment_1_1_1"


    // $ANTLR start "rule__Justification__HypothesisAssignment_0_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1971:1: rule__Justification__HypothesisAssignment_0_1 : ( ( 'hypothesis' ) ) ;
    public final void rule__Justification__HypothesisAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1975:1: ( ( ( 'hypothesis' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1976:1: ( ( 'hypothesis' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1976:1: ( ( 'hypothesis' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1977:1: ( 'hypothesis' )
            {
             before(grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1978:1: ( 'hypothesis' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1979:1: 'hypothesis'
            {
             before(grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Justification__HypothesisAssignment_0_13939); 
             after(grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0()); 

            }

             after(grammarAccess.getJustificationAccess().getHypothesisHypothesisKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__HypothesisAssignment_0_1"


    // $ANTLR start "rule__Justification__EpsilonAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1994:1: rule__Justification__EpsilonAssignment_1 : ( ( 'epsilon' ) ) ;
    public final void rule__Justification__EpsilonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1998:1: ( ( ( 'epsilon' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1999:1: ( ( 'epsilon' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1999:1: ( ( 'epsilon' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2000:1: ( 'epsilon' )
            {
             before(grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2001:1: ( 'epsilon' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2002:1: 'epsilon'
            {
             before(grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Justification__EpsilonAssignment_13983); 
             after(grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0()); 

            }

             after(grammarAccess.getJustificationAccess().getEpsilonEpsilonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__EpsilonAssignment_1"


    // $ANTLR start "rule__Justification__NumeralAssignment_2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2017:1: rule__Justification__NumeralAssignment_2 : ( ruleNumeral ) ;
    public final void rule__Justification__NumeralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2021:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2022:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2022:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2023:1: ruleNumeral
            {
             before(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Justification__NumeralAssignment_24022);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__NumeralAssignment_2"


    // $ANTLR start "rule__Justification__AssertionAssignment_3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2032:1: rule__Justification__AssertionAssignment_3 : ( ruleQuotedAssertion ) ;
    public final void rule__Justification__AssertionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2036:1: ( ( ruleQuotedAssertion ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2037:1: ( ruleQuotedAssertion )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2037:1: ( ruleQuotedAssertion )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2038:1: ruleQuotedAssertion
            {
             before(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_rule__Justification__AssertionAssignment_34053);
            ruleQuotedAssertion();

            state._fsp--;

             after(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__AssertionAssignment_3"


    // $ANTLR start "rule__Justification__EntailmentAssignment_4"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2047:1: rule__Justification__EntailmentAssignment_4 : ( ruleEntailment ) ;
    public final void rule__Justification__EntailmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2051:1: ( ( ruleEntailment ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2052:1: ( ruleEntailment )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2052:1: ( ruleEntailment )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2053:1: ruleEntailment
            {
             before(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntailment_in_rule__Justification__EntailmentAssignment_44084);
            ruleEntailment();

            state._fsp--;

             after(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Justification__EntailmentAssignment_4"


    // $ANTLR start "rule__QuotedAssertion__TextAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2062:1: rule__QuotedAssertion__TextAssignment_1 : ( ruleText ) ;
    public final void rule__QuotedAssertion__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2066:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2067:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2067:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2068:1: ruleText
            {
             before(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__QuotedAssertion__TextAssignment_14115);
            ruleText();

            state._fsp--;

             after(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedAssertion__TextAssignment_1"


    // $ANTLR start "rule__Entailment__HeadAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2077:1: rule__Entailment__HeadAssignment_1 : ( ruleConjunction ) ;
    public final void rule__Entailment__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2081:1: ( ( ruleConjunction ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2082:1: ( ruleConjunction )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2082:1: ( ruleConjunction )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2083:1: ruleConjunction
            {
             before(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Entailment__HeadAssignment_14146);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__HeadAssignment_1"


    // $ANTLR start "rule__Entailment__TailAssignment_3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2092:1: rule__Entailment__TailAssignment_3 : ( ruleNumeral ) ;
    public final void rule__Entailment__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2096:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2097:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2097:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2098:1: ruleNumeral
            {
             before(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Entailment__TailAssignment_34177);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entailment__TailAssignment_3"


    // $ANTLR start "rule__Conjunction__LhsAssignment_0_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2107:1: rule__Conjunction__LhsAssignment_0_1 : ( ruleNumeral ) ;
    public final void rule__Conjunction__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2111:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2112:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2112:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2113:1: ruleNumeral
            {
             before(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_0_14208);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__LhsAssignment_0_1"


    // $ANTLR start "rule__Conjunction__RhsAssignment_0_3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2122:1: rule__Conjunction__RhsAssignment_0_3 : ( ruleConjunction ) ;
    public final void rule__Conjunction__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2126:1: ( ( ruleConjunction ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2127:1: ( ruleConjunction )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2127:1: ( ruleConjunction )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2128:1: ruleConjunction
            {
             before(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Conjunction__RhsAssignment_0_34239);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RhsAssignment_0_3"


    // $ANTLR start "rule__Conjunction__LhsAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2137:1: rule__Conjunction__LhsAssignment_1 : ( ruleNumeral ) ;
    public final void rule__Conjunction__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2141:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2142:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2142:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2143:1: ruleNumeral
            {
             before(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_14270);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__LhsAssignment_1"


    // $ANTLR start "rule__ProofSteps__StatementsAssignment_0_1_0"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2152:1: rule__ProofSteps__StatementsAssignment_0_1_0 : ( ruleStatement ) ;
    public final void rule__ProofSteps__StatementsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2156:1: ( ( ruleStatement ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2157:1: ( ruleStatement )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2157:1: ( ruleStatement )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2158:1: ruleStatement
            {
             before(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_04301);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__StatementsAssignment_0_1_0"


    // $ANTLR start "rule__ProofSteps__StatementsAssignment_0_1_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2167:1: rule__ProofSteps__StatementsAssignment_0_1_1 : ( ruleStatement ) ;
    public final void rule__ProofSteps__StatementsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2171:1: ( ( ruleStatement ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2172:1: ( ruleStatement )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2172:1: ( ruleStatement )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2173:1: ruleStatement
            {
             before(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_14332);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__StatementsAssignment_0_1_1"


    // $ANTLR start "rule__ProofSteps__EpsilonAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2182:1: rule__ProofSteps__EpsilonAssignment_1 : ( ( 'epsilon' ) ) ;
    public final void rule__ProofSteps__EpsilonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2186:1: ( ( ( 'epsilon' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2187:1: ( ( 'epsilon' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2187:1: ( ( 'epsilon' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2188:1: ( 'epsilon' )
            {
             before(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2189:1: ( 'epsilon' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2190:1: 'epsilon'
            {
             before(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__ProofSteps__EpsilonAssignment_14368); 
             after(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 

            }

             after(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofSteps__EpsilonAssignment_1"


    // $ANTLR start "rule__Statement__IdAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2205:1: rule__Statement__IdAssignment_1 : ( ruleNumeral ) ;
    public final void rule__Statement__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2209:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2210:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2210:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2211:1: ruleNumeral
            {
             before(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Statement__IdAssignment_14407);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__IdAssignment_1"


    // $ANTLR start "rule__Statement__StatementAssignment_3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2220:1: rule__Statement__StatementAssignment_3 : ( ruleText ) ;
    public final void rule__Statement__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2224:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2225:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2225:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2226:1: ruleText
            {
             before(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Statement__StatementAssignment_34438);
            ruleText();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_3"


    // $ANTLR start "rule__Statement__JustificationAssignment_5"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2235:1: rule__Statement__JustificationAssignment_5 : ( ruleJustifications ) ;
    public final void rule__Statement__JustificationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2239:1: ( ( ruleJustifications ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2240:1: ( ruleJustifications )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2240:1: ( ruleJustifications )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2241:1: ruleJustifications
            {
             before(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleJustifications_in_rule__Statement__JustificationAssignment_54469);
            ruleJustifications();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__JustificationAssignment_5"


    // $ANTLR start "rule__Statement__ValidationAssignment_7_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2250:1: rule__Statement__ValidationAssignment_7_1 : ( ruleValidation ) ;
    public final void rule__Statement__ValidationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2254:1: ( ( ruleValidation ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2255:1: ( ruleValidation )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2255:1: ( ruleValidation )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2256:1: ruleValidation
            {
             before(grammarAccess.getStatementAccess().getValidationValidationParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleValidation_in_rule__Statement__ValidationAssignment_7_14500);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValidationValidationParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ValidationAssignment_7_1"


    // $ANTLR start "rule__Validation__AuthorAssignment_1"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2265:1: rule__Validation__AuthorAssignment_1 : ( ruleText ) ;
    public final void rule__Validation__AuthorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2269:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2270:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2270:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2271:1: ruleText
            {
             before(grammarAccess.getValidationAccess().getAuthorTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Validation__AuthorAssignment_14531);
            ruleText();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getAuthorTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__AuthorAssignment_1"


    // $ANTLR start "rule__Validation__TimeStampAssignment_2"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2280:1: rule__Validation__TimeStampAssignment_2 : ( ruleText ) ;
    public final void rule__Validation__TimeStampAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2284:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2285:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2285:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2286:1: ruleText
            {
             before(grammarAccess.getValidationAccess().getTimeStampTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Validation__TimeStampAssignment_24562);
            ruleText();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getTimeStampTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__TimeStampAssignment_2"


    // $ANTLR start "rule__Validation__StateAssignment_3"
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2295:1: rule__Validation__StateAssignment_3 : ( ruleValidationKind ) ;
    public final void rule__Validation__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2299:1: ( ( ruleValidationKind ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2300:1: ( ruleValidationKind )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2300:1: ( ruleValidationKind )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:2301:1: ruleValidationKind
            {
             before(grammarAccess.getValidationAccess().getStateValidationKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValidationKind_in_rule__Validation__StateAssignment_34593);
            ruleValidationKind();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getStateValidationKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__StateAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProof_in_entryRuleProof61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProof68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__0_in_ruleProof94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_entryRuleJustifications180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifications187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group__0_in_ruleJustifications213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_entryRuleJustification240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustification247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Alternatives_in_ruleJustification273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedAssertion307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__0_in_ruleQuotedAssertion333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_entryRuleEntailment360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntailment367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__0_in_ruleEntailment393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_entryRuleNumeral480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeral487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumeral513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_entryRuleProofSteps539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProofSteps546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Alternatives_in_ruleProofSteps572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidation_in_entryRuleValidation659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidation666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__Group__0_in_ruleValidation692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidationKind__Alternatives_in_ruleValidationKind729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__0_in_rule__Justification__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__EpsilonAssignment_1_in_rule__Justification__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__NumeralAssignment_2_in_rule__Justification__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__AssertionAssignment_3_in_rule__Justification__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__EntailmentAssignment_4_in_rule__Justification__Alternatives836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__0_in_rule__Conjunction__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__LhsAssignment_1_in_rule__Conjunction__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__0_in_rule__ProofSteps__Alternatives920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__EpsilonAssignment_1_in_rule__ProofSteps__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ValidationKind__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ValidationKind__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ValidationKind__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__0__Impl_in_rule__Proof__Group__01047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Proof__Group__1_in_rule__Proof__Group__01050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Proof__Group__0__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__1__Impl_in_rule__Proof__Group__11109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Proof__Group__2_in_rule__Proof__Group__11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Proof__Group__1__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__2__Impl_in_rule__Proof__Group__21171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Proof__Group__3_in_rule__Proof__Group__21174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__TitleAssignment_2_in_rule__Proof__Group__2__Impl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__3__Impl_in_rule__Proof__Group__31231 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Proof__Group__4_in_rule__Proof__Group__31234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Proof__Group__3__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__4__Impl_in_rule__Proof__Group__41293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Proof__Group__5_in_rule__Proof__Group__41296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__JustificationsAssignment_4_in_rule__Proof__Group__4__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__5__Impl_in_rule__Proof__Group__51353 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Proof__Group__6_in_rule__Proof__Group__51356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Proof__Group__5__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__6__Impl_in_rule__Proof__Group__61415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__ProofStepsAssignment_6_in_rule__Proof__Group__6__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group__0__Impl_in_rule__Justifications__Group__01486 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Justifications__Group__1_in_rule__Justifications__Group__01489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group__1__Impl_in_rule__Justifications__Group__11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1__0_in_rule__Justifications__Group__1__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1__0__Impl_in_rule__Justifications__Group_1__01609 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1__1_in_rule__Justifications__Group_1__01612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__JustificationsAssignment_1_0_in_rule__Justifications__Group_1__0__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1__1__Impl_in_rule__Justifications__Group_1__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1_1__0_in_rule__Justifications__Group_1__1__Impl1696 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1_1__0__Impl_in_rule__Justifications__Group_1_1__01731 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1_1__1_in_rule__Justifications__Group_1_1__01734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Justifications__Group_1_1__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_1_1__1__Impl_in_rule__Justifications__Group_1_1__11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__JustificationsAssignment_1_1_1_in_rule__Justifications__Group_1_1__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__0__Impl_in_rule__Justification__Group_0__01854 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__1_in_rule__Justification__Group_0__01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__1__Impl_in_rule__Justification__Group_0__11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__HypothesisAssignment_0_1_in_rule__Justification__Group_0__1__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__0__Impl_in_rule__QuotedAssertion__Group__01976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__1_in_rule__QuotedAssertion__Group__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__1__Impl_in_rule__QuotedAssertion__Group__12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__TextAssignment_1_in_rule__QuotedAssertion__Group__1__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__0__Impl_in_rule__Entailment__Group__02098 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Entailment__Group__1_in_rule__Entailment__Group__02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__1__Impl_in_rule__Entailment__Group__12159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Entailment__Group__2_in_rule__Entailment__Group__12162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__HeadAssignment_1_in_rule__Entailment__Group__1__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__2__Impl_in_rule__Entailment__Group__22219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entailment__Group__3_in_rule__Entailment__Group__22222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entailment__Group__2__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__3__Impl_in_rule__Entailment__Group__32281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__TailAssignment_3_in_rule__Entailment__Group__3__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__0__Impl_in_rule__Conjunction__Group_0__02346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__1_in_rule__Conjunction__Group_0__02349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__1__Impl_in_rule__Conjunction__Group_0__12407 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__2_in_rule__Conjunction__Group_0__12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__LhsAssignment_0_1_in_rule__Conjunction__Group_0__1__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__2__Impl_in_rule__Conjunction__Group_0__22467 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__3_in_rule__Conjunction__Group_0__22470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Conjunction__Group_0__2__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__3__Impl_in_rule__Conjunction__Group_0__32529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RhsAssignment_0_3_in_rule__Conjunction__Group_0__3__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__0__Impl_in_rule__ProofSteps__Group_0__02594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__1_in_rule__ProofSteps__Group_0__02597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__1__Impl_in_rule__ProofSteps__Group_0__12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__0_in_rule__ProofSteps__Group_0__1__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__0__Impl_in_rule__ProofSteps__Group_0_1__02717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__1_in_rule__ProofSteps__Group_0_1__02720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_0_in_rule__ProofSteps__Group_0_1__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__1__Impl_in_rule__ProofSteps__Group_0_1__12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_1_in_rule__ProofSteps__Group_0_1__1__Impl2804 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12900 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IdAssignment_1_in_rule__Statement__Group__1__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group__2__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__33022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__33025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_3_in_rule__Statement__Group__3__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__43082 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__43085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group__4__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__53144 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Statement__Group__6_in_rule__Statement__Group__53147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__JustificationAssignment_5_in_rule__Statement__Group__5__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__6__Impl_in_rule__Statement__Group__63204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Statement__Group__7_in_rule__Statement__Group__63207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Statement__Group__6__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__7__Impl_in_rule__Statement__Group__73266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Group__7__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__03340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__03343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_7__0__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__13402 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValidationAssignment_7_1_in_rule__Statement__Group_7__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__23462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement__Group_7__2__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__Group__0__Impl_in_rule__Validation__Group__03527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Validation__Group__1_in_rule__Validation__Group__03530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__Group__1__Impl_in_rule__Validation__Group__13588 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Validation__Group__2_in_rule__Validation__Group__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__AuthorAssignment_1_in_rule__Validation__Group__1__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__Group__2__Impl_in_rule__Validation__Group__23648 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Validation__Group__3_in_rule__Validation__Group__23651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__TimeStampAssignment_2_in_rule__Validation__Group__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__Group__3__Impl_in_rule__Validation__Group__33709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Validation__StateAssignment_3_in_rule__Validation__Group__3__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Proof__TitleAssignment_23779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_rule__Proof__JustificationsAssignment_43810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_rule__Proof__ProofStepsAssignment_63841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_1_03872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_1_1_13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Justification__HypothesisAssignment_0_13939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Justification__EpsilonAssignment_13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Justification__NumeralAssignment_24022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_rule__Justification__AssertionAssignment_34053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_rule__Justification__EntailmentAssignment_44084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__QuotedAssertion__TextAssignment_14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Entailment__HeadAssignment_14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Entailment__TailAssignment_34177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_0_14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Conjunction__RhsAssignment_0_34239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_14270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_04301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_14332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProofSteps__EpsilonAssignment_14368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Statement__IdAssignment_14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Statement__StatementAssignment_34438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_rule__Statement__JustificationAssignment_54469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidation_in_rule__Statement__ValidationAssignment_7_14500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Validation__AuthorAssignment_14531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Validation__TimeStampAssignment_24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationKind_in_rule__Validation__StateAssignment_34593 = new BitSet(new long[]{0x0000000000000002L});

}