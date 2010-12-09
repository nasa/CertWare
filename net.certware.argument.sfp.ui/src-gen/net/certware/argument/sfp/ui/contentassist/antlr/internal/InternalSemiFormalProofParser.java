package net.certware.argument.sfp.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Theorem'", "':'", "'('", "')'", "','", "'->'", "'^'", "'.'", "'hypothesis'", "'epsilon'"
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




    // $ANTLR start entryRuleProof
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:61:1: entryRuleProof : ruleProof EOF ;
    public final void entryRuleProof() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:62:1: ( ruleProof EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:63:1: ruleProof EOF
            {
             before(grammarAccess.getProofRule()); 
            pushFollow(FOLLOW_ruleProof_in_entryRuleProof61);
            ruleProof();
            _fsp--;

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
    // $ANTLR end entryRuleProof


    // $ANTLR start ruleProof
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:70:1: ruleProof : ( ( rule__Proof__Group__0 ) ) ;
    public final void ruleProof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:74:2: ( ( ( rule__Proof__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:75:1: ( ( rule__Proof__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:75:1: ( ( rule__Proof__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:76:1: ( rule__Proof__Group__0 )
            {
             before(grammarAccess.getProofAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:77:1: ( rule__Proof__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:77:2: rule__Proof__Group__0
            {
            pushFollow(FOLLOW_rule__Proof__Group__0_in_ruleProof94);
            rule__Proof__Group__0();
            _fsp--;


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
    // $ANTLR end ruleProof


    // $ANTLR start entryRuleText
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:89:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:90:1: ( ruleText EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:91:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText121);
            ruleText();
            _fsp--;

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:98:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:102:2: ( ( RULE_STRING ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:103:1: ( RULE_STRING )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:103:1: ( RULE_STRING )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:104:1: RULE_STRING
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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleJustifications
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:117:1: entryRuleJustifications : ruleJustifications EOF ;
    public final void entryRuleJustifications() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:118:1: ( ruleJustifications EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:119:1: ruleJustifications EOF
            {
             before(grammarAccess.getJustificationsRule()); 
            pushFollow(FOLLOW_ruleJustifications_in_entryRuleJustifications180);
            ruleJustifications();
            _fsp--;

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
    // $ANTLR end entryRuleJustifications


    // $ANTLR start ruleJustifications
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:126:1: ruleJustifications : ( ( rule__Justifications__Alternatives ) ) ;
    public final void ruleJustifications() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:130:2: ( ( ( rule__Justifications__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:131:1: ( ( rule__Justifications__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:131:1: ( ( rule__Justifications__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:132:1: ( rule__Justifications__Alternatives )
            {
             before(grammarAccess.getJustificationsAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:133:1: ( rule__Justifications__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:133:2: rule__Justifications__Alternatives
            {
            pushFollow(FOLLOW_rule__Justifications__Alternatives_in_ruleJustifications213);
            rule__Justifications__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJustifications


    // $ANTLR start entryRuleJustification
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:145:1: entryRuleJustification : ruleJustification EOF ;
    public final void entryRuleJustification() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:146:1: ( ruleJustification EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:147:1: ruleJustification EOF
            {
             before(grammarAccess.getJustificationRule()); 
            pushFollow(FOLLOW_ruleJustification_in_entryRuleJustification240);
            ruleJustification();
            _fsp--;

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
    // $ANTLR end entryRuleJustification


    // $ANTLR start ruleJustification
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:154:1: ruleJustification : ( ( rule__Justification__Alternatives ) ) ;
    public final void ruleJustification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:158:2: ( ( ( rule__Justification__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:159:1: ( ( rule__Justification__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:159:1: ( ( rule__Justification__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:160:1: ( rule__Justification__Alternatives )
            {
             before(grammarAccess.getJustificationAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:161:1: ( rule__Justification__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:161:2: rule__Justification__Alternatives
            {
            pushFollow(FOLLOW_rule__Justification__Alternatives_in_ruleJustification273);
            rule__Justification__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleJustification


    // $ANTLR start entryRuleQuotedAssertion
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:173:1: entryRuleQuotedAssertion : ruleQuotedAssertion EOF ;
    public final void entryRuleQuotedAssertion() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:174:1: ( ruleQuotedAssertion EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:175:1: ruleQuotedAssertion EOF
            {
             before(grammarAccess.getQuotedAssertionRule()); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_entryRuleQuotedAssertion300);
            ruleQuotedAssertion();
            _fsp--;

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
    // $ANTLR end entryRuleQuotedAssertion


    // $ANTLR start ruleQuotedAssertion
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:182:1: ruleQuotedAssertion : ( ( rule__QuotedAssertion__Group__0 ) ) ;
    public final void ruleQuotedAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:186:2: ( ( ( rule__QuotedAssertion__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:187:1: ( ( rule__QuotedAssertion__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:187:1: ( ( rule__QuotedAssertion__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:188:1: ( rule__QuotedAssertion__Group__0 )
            {
             before(grammarAccess.getQuotedAssertionAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:189:1: ( rule__QuotedAssertion__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:189:2: rule__QuotedAssertion__Group__0
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__0_in_ruleQuotedAssertion333);
            rule__QuotedAssertion__Group__0();
            _fsp--;


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
    // $ANTLR end ruleQuotedAssertion


    // $ANTLR start entryRuleEntailment
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:201:1: entryRuleEntailment : ruleEntailment EOF ;
    public final void entryRuleEntailment() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:202:1: ( ruleEntailment EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:203:1: ruleEntailment EOF
            {
             before(grammarAccess.getEntailmentRule()); 
            pushFollow(FOLLOW_ruleEntailment_in_entryRuleEntailment360);
            ruleEntailment();
            _fsp--;

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
    // $ANTLR end entryRuleEntailment


    // $ANTLR start ruleEntailment
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:210:1: ruleEntailment : ( ( rule__Entailment__Group__0 ) ) ;
    public final void ruleEntailment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:214:2: ( ( ( rule__Entailment__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:215:1: ( ( rule__Entailment__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:215:1: ( ( rule__Entailment__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:216:1: ( rule__Entailment__Group__0 )
            {
             before(grammarAccess.getEntailmentAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:217:1: ( rule__Entailment__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:217:2: rule__Entailment__Group__0
            {
            pushFollow(FOLLOW_rule__Entailment__Group__0_in_ruleEntailment393);
            rule__Entailment__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEntailment


    // $ANTLR start entryRuleConjunction
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:229:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:230:1: ( ruleConjunction EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:231:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction420);
            ruleConjunction();
            _fsp--;

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
    // $ANTLR end entryRuleConjunction


    // $ANTLR start ruleConjunction
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:238:1: ruleConjunction : ( ( rule__Conjunction__Alternatives ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:242:2: ( ( ( rule__Conjunction__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:243:1: ( ( rule__Conjunction__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:243:1: ( ( rule__Conjunction__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:244:1: ( rule__Conjunction__Alternatives )
            {
             before(grammarAccess.getConjunctionAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:245:1: ( rule__Conjunction__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:245:2: rule__Conjunction__Alternatives
            {
            pushFollow(FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction453);
            rule__Conjunction__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleConjunction


    // $ANTLR start entryRuleNumeral
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:257:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:258:1: ( ruleNumeral EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:259:1: ruleNumeral EOF
            {
             before(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_ruleNumeral_in_entryRuleNumeral480);
            ruleNumeral();
            _fsp--;

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
    // $ANTLR end entryRuleNumeral


    // $ANTLR start ruleNumeral
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:266:1: ruleNumeral : ( RULE_INT ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:270:2: ( ( RULE_INT ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:271:1: ( RULE_INT )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:271:1: ( RULE_INT )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:272:1: RULE_INT
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
    // $ANTLR end ruleNumeral


    // $ANTLR start entryRuleProofSteps
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:285:1: entryRuleProofSteps : ruleProofSteps EOF ;
    public final void entryRuleProofSteps() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:286:1: ( ruleProofSteps EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:287:1: ruleProofSteps EOF
            {
             before(grammarAccess.getProofStepsRule()); 
            pushFollow(FOLLOW_ruleProofSteps_in_entryRuleProofSteps539);
            ruleProofSteps();
            _fsp--;

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
    // $ANTLR end entryRuleProofSteps


    // $ANTLR start ruleProofSteps
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:294:1: ruleProofSteps : ( ( rule__ProofSteps__Alternatives ) ) ;
    public final void ruleProofSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:298:2: ( ( ( rule__ProofSteps__Alternatives ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:299:1: ( ( rule__ProofSteps__Alternatives ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:299:1: ( ( rule__ProofSteps__Alternatives ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:300:1: ( rule__ProofSteps__Alternatives )
            {
             before(grammarAccess.getProofStepsAccess().getAlternatives()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:301:1: ( rule__ProofSteps__Alternatives )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:301:2: rule__ProofSteps__Alternatives
            {
            pushFollow(FOLLOW_rule__ProofSteps__Alternatives_in_ruleProofSteps572);
            rule__ProofSteps__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleProofSteps


    // $ANTLR start entryRuleStatement
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:313:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:314:1: ( ruleStatement EOF )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:315:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement599);
            ruleStatement();
            _fsp--;

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:322:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:326:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:327:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:327:1: ( ( rule__Statement__Group__0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:328:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:329:1: ( rule__Statement__Group__0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:329:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement632);
            rule__Statement__Group__0();
            _fsp--;


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
    // $ANTLR end ruleStatement


    // $ANTLR start rule__Justifications__Alternatives
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:341:1: rule__Justifications__Alternatives : ( ( ( rule__Justifications__Group_0__0 ) ) | ( ( rule__Justifications__HypothesisAssignment_1 ) ) | ( ( rule__Justifications__EpsilonAssignment_2 ) ) );
    public final void rule__Justifications__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:345:1: ( ( ( rule__Justifications__Group_0__0 ) ) | ( ( rule__Justifications__HypothesisAssignment_1 ) ) | ( ( rule__Justifications__EpsilonAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_STRING:
            case RULE_INT:
            case 14:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("341:1: rule__Justifications__Alternatives : ( ( ( rule__Justifications__Group_0__0 ) ) | ( ( rule__Justifications__HypothesisAssignment_1 ) ) | ( ( rule__Justifications__EpsilonAssignment_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:346:1: ( ( rule__Justifications__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:346:1: ( ( rule__Justifications__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:347:1: ( rule__Justifications__Group_0__0 )
                    {
                     before(grammarAccess.getJustificationsAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:348:1: ( rule__Justifications__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:348:2: rule__Justifications__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Justifications__Group_0__0_in_rule__Justifications__Alternatives668);
                    rule__Justifications__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:352:6: ( ( rule__Justifications__HypothesisAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:352:6: ( ( rule__Justifications__HypothesisAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:353:1: ( rule__Justifications__HypothesisAssignment_1 )
                    {
                     before(grammarAccess.getJustificationsAccess().getHypothesisAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:354:1: ( rule__Justifications__HypothesisAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:354:2: rule__Justifications__HypothesisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Justifications__HypothesisAssignment_1_in_rule__Justifications__Alternatives686);
                    rule__Justifications__HypothesisAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationsAccess().getHypothesisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:358:6: ( ( rule__Justifications__EpsilonAssignment_2 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:358:6: ( ( rule__Justifications__EpsilonAssignment_2 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:359:1: ( rule__Justifications__EpsilonAssignment_2 )
                    {
                     before(grammarAccess.getJustificationsAccess().getEpsilonAssignment_2()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:360:1: ( rule__Justifications__EpsilonAssignment_2 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:360:2: rule__Justifications__EpsilonAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Justifications__EpsilonAssignment_2_in_rule__Justifications__Alternatives704);
                    rule__Justifications__EpsilonAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationsAccess().getEpsilonAssignment_2()); 

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
    // $ANTLR end rule__Justifications__Alternatives


    // $ANTLR start rule__Justification__Alternatives
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:369:1: rule__Justification__Alternatives : ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__AssertionAssignment_1 ) ) | ( ( rule__Justification__EntailmentAssignment_2 ) ) );
    public final void rule__Justification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:373:1: ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__AssertionAssignment_1 ) ) | ( ( rule__Justification__EntailmentAssignment_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||(LA2_1>=14 && LA2_1<=15)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("369:1: rule__Justification__Alternatives : ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__AssertionAssignment_1 ) ) | ( ( rule__Justification__EntailmentAssignment_2 ) ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("369:1: rule__Justification__Alternatives : ( ( ( rule__Justification__Group_0__0 ) ) | ( ( rule__Justification__AssertionAssignment_1 ) ) | ( ( rule__Justification__EntailmentAssignment_2 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:374:1: ( ( rule__Justification__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:374:1: ( ( rule__Justification__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:375:1: ( rule__Justification__Group_0__0 )
                    {
                     before(grammarAccess.getJustificationAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:376:1: ( rule__Justification__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:376:2: rule__Justification__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Justification__Group_0__0_in_rule__Justification__Alternatives737);
                    rule__Justification__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:380:6: ( ( rule__Justification__AssertionAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:380:6: ( ( rule__Justification__AssertionAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:381:1: ( rule__Justification__AssertionAssignment_1 )
                    {
                     before(grammarAccess.getJustificationAccess().getAssertionAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:382:1: ( rule__Justification__AssertionAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:382:2: rule__Justification__AssertionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Justification__AssertionAssignment_1_in_rule__Justification__Alternatives755);
                    rule__Justification__AssertionAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getAssertionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:386:6: ( ( rule__Justification__EntailmentAssignment_2 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:386:6: ( ( rule__Justification__EntailmentAssignment_2 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:387:1: ( rule__Justification__EntailmentAssignment_2 )
                    {
                     before(grammarAccess.getJustificationAccess().getEntailmentAssignment_2()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:388:1: ( rule__Justification__EntailmentAssignment_2 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:388:2: rule__Justification__EntailmentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Justification__EntailmentAssignment_2_in_rule__Justification__Alternatives773);
                    rule__Justification__EntailmentAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getJustificationAccess().getEntailmentAssignment_2()); 

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
    // $ANTLR end rule__Justification__Alternatives


    // $ANTLR start rule__Conjunction__Alternatives
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:397:1: rule__Conjunction__Alternatives : ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) );
    public final void rule__Conjunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:401:1: ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==16) ) {
                    alt3=2;
                }
                else if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("397:1: rule__Conjunction__Alternatives : ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("397:1: rule__Conjunction__Alternatives : ( ( ( rule__Conjunction__Group_0__0 ) ) | ( ( rule__Conjunction__LhsAssignment_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:402:1: ( ( rule__Conjunction__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:402:1: ( ( rule__Conjunction__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:403:1: ( rule__Conjunction__Group_0__0 )
                    {
                     before(grammarAccess.getConjunctionAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:404:1: ( rule__Conjunction__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:404:2: rule__Conjunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Conjunction__Group_0__0_in_rule__Conjunction__Alternatives806);
                    rule__Conjunction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getConjunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:408:6: ( ( rule__Conjunction__LhsAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:408:6: ( ( rule__Conjunction__LhsAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:409:1: ( rule__Conjunction__LhsAssignment_1 )
                    {
                     before(grammarAccess.getConjunctionAccess().getLhsAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:410:1: ( rule__Conjunction__LhsAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:410:2: rule__Conjunction__LhsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Conjunction__LhsAssignment_1_in_rule__Conjunction__Alternatives824);
                    rule__Conjunction__LhsAssignment_1();
                    _fsp--;


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
    // $ANTLR end rule__Conjunction__Alternatives


    // $ANTLR start rule__ProofSteps__Alternatives
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:419:1: rule__ProofSteps__Alternatives : ( ( ( rule__ProofSteps__Group_0__0 ) ) | ( ( rule__ProofSteps__EpsilonAssignment_1 ) ) );
    public final void rule__ProofSteps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:423:1: ( ( ( rule__ProofSteps__Group_0__0 ) ) | ( ( rule__ProofSteps__EpsilonAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("419:1: rule__ProofSteps__Alternatives : ( ( ( rule__ProofSteps__Group_0__0 ) ) | ( ( rule__ProofSteps__EpsilonAssignment_1 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:424:1: ( ( rule__ProofSteps__Group_0__0 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:424:1: ( ( rule__ProofSteps__Group_0__0 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:425:1: ( rule__ProofSteps__Group_0__0 )
                    {
                     before(grammarAccess.getProofStepsAccess().getGroup_0()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:426:1: ( rule__ProofSteps__Group_0__0 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:426:2: rule__ProofSteps__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__Group_0__0_in_rule__ProofSteps__Alternatives857);
                    rule__ProofSteps__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProofStepsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:430:6: ( ( rule__ProofSteps__EpsilonAssignment_1 ) )
                    {
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:430:6: ( ( rule__ProofSteps__EpsilonAssignment_1 ) )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:431:1: ( rule__ProofSteps__EpsilonAssignment_1 )
                    {
                     before(grammarAccess.getProofStepsAccess().getEpsilonAssignment_1()); 
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:432:1: ( rule__ProofSteps__EpsilonAssignment_1 )
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:432:2: rule__ProofSteps__EpsilonAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__EpsilonAssignment_1_in_rule__ProofSteps__Alternatives875);
                    rule__ProofSteps__EpsilonAssignment_1();
                    _fsp--;


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
    // $ANTLR end rule__ProofSteps__Alternatives


    // $ANTLR start rule__Proof__Group__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:443:1: rule__Proof__Group__0 : rule__Proof__Group__0__Impl rule__Proof__Group__1 ;
    public final void rule__Proof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:447:1: ( rule__Proof__Group__0__Impl rule__Proof__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:448:2: rule__Proof__Group__0__Impl rule__Proof__Group__1
            {
            pushFollow(FOLLOW_rule__Proof__Group__0__Impl_in_rule__Proof__Group__0906);
            rule__Proof__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__1_in_rule__Proof__Group__0909);
            rule__Proof__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__0


    // $ANTLR start rule__Proof__Group__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:455:1: rule__Proof__Group__0__Impl : ( 'Theorem' ) ;
    public final void rule__Proof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:459:1: ( ( 'Theorem' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:460:1: ( 'Theorem' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:460:1: ( 'Theorem' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:461:1: 'Theorem'
            {
             before(grammarAccess.getProofAccess().getTheoremKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Proof__Group__0__Impl937); 
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
    // $ANTLR end rule__Proof__Group__0__Impl


    // $ANTLR start rule__Proof__Group__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:474:1: rule__Proof__Group__1 : rule__Proof__Group__1__Impl rule__Proof__Group__2 ;
    public final void rule__Proof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:478:1: ( rule__Proof__Group__1__Impl rule__Proof__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:479:2: rule__Proof__Group__1__Impl rule__Proof__Group__2
            {
            pushFollow(FOLLOW_rule__Proof__Group__1__Impl_in_rule__Proof__Group__1968);
            rule__Proof__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__2_in_rule__Proof__Group__1971);
            rule__Proof__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__1


    // $ANTLR start rule__Proof__Group__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:486:1: rule__Proof__Group__1__Impl : ( ':' ) ;
    public final void rule__Proof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:490:1: ( ( ':' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:491:1: ( ':' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:491:1: ( ':' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:492:1: ':'
            {
             before(grammarAccess.getProofAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Proof__Group__1__Impl999); 
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
    // $ANTLR end rule__Proof__Group__1__Impl


    // $ANTLR start rule__Proof__Group__2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:505:1: rule__Proof__Group__2 : rule__Proof__Group__2__Impl rule__Proof__Group__3 ;
    public final void rule__Proof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:509:1: ( rule__Proof__Group__2__Impl rule__Proof__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:510:2: rule__Proof__Group__2__Impl rule__Proof__Group__3
            {
            pushFollow(FOLLOW_rule__Proof__Group__2__Impl_in_rule__Proof__Group__21030);
            rule__Proof__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__3_in_rule__Proof__Group__21033);
            rule__Proof__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__2


    // $ANTLR start rule__Proof__Group__2__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:517:1: rule__Proof__Group__2__Impl : ( ( rule__Proof__TitleAssignment_2 ) ) ;
    public final void rule__Proof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:521:1: ( ( ( rule__Proof__TitleAssignment_2 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:522:1: ( ( rule__Proof__TitleAssignment_2 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:522:1: ( ( rule__Proof__TitleAssignment_2 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:523:1: ( rule__Proof__TitleAssignment_2 )
            {
             before(grammarAccess.getProofAccess().getTitleAssignment_2()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:524:1: ( rule__Proof__TitleAssignment_2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:524:2: rule__Proof__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Proof__TitleAssignment_2_in_rule__Proof__Group__2__Impl1060);
            rule__Proof__TitleAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__Proof__Group__2__Impl


    // $ANTLR start rule__Proof__Group__3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:534:1: rule__Proof__Group__3 : rule__Proof__Group__3__Impl rule__Proof__Group__4 ;
    public final void rule__Proof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:538:1: ( rule__Proof__Group__3__Impl rule__Proof__Group__4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:539:2: rule__Proof__Group__3__Impl rule__Proof__Group__4
            {
            pushFollow(FOLLOW_rule__Proof__Group__3__Impl_in_rule__Proof__Group__31090);
            rule__Proof__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__4_in_rule__Proof__Group__31093);
            rule__Proof__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__3


    // $ANTLR start rule__Proof__Group__3__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:546:1: rule__Proof__Group__3__Impl : ( '(' ) ;
    public final void rule__Proof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:550:1: ( ( '(' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:551:1: ( '(' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:551:1: ( '(' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:552:1: '('
            {
             before(grammarAccess.getProofAccess().getLeftParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Proof__Group__3__Impl1121); 
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
    // $ANTLR end rule__Proof__Group__3__Impl


    // $ANTLR start rule__Proof__Group__4
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:565:1: rule__Proof__Group__4 : rule__Proof__Group__4__Impl rule__Proof__Group__5 ;
    public final void rule__Proof__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:569:1: ( rule__Proof__Group__4__Impl rule__Proof__Group__5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:570:2: rule__Proof__Group__4__Impl rule__Proof__Group__5
            {
            pushFollow(FOLLOW_rule__Proof__Group__4__Impl_in_rule__Proof__Group__41152);
            rule__Proof__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__5_in_rule__Proof__Group__41155);
            rule__Proof__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__4


    // $ANTLR start rule__Proof__Group__4__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:577:1: rule__Proof__Group__4__Impl : ( ( rule__Proof__JustificationsAssignment_4 ) ) ;
    public final void rule__Proof__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:581:1: ( ( ( rule__Proof__JustificationsAssignment_4 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:582:1: ( ( rule__Proof__JustificationsAssignment_4 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:582:1: ( ( rule__Proof__JustificationsAssignment_4 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:583:1: ( rule__Proof__JustificationsAssignment_4 )
            {
             before(grammarAccess.getProofAccess().getJustificationsAssignment_4()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:584:1: ( rule__Proof__JustificationsAssignment_4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:584:2: rule__Proof__JustificationsAssignment_4
            {
            pushFollow(FOLLOW_rule__Proof__JustificationsAssignment_4_in_rule__Proof__Group__4__Impl1182);
            rule__Proof__JustificationsAssignment_4();
            _fsp--;


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
    // $ANTLR end rule__Proof__Group__4__Impl


    // $ANTLR start rule__Proof__Group__5
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:594:1: rule__Proof__Group__5 : rule__Proof__Group__5__Impl rule__Proof__Group__6 ;
    public final void rule__Proof__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:598:1: ( rule__Proof__Group__5__Impl rule__Proof__Group__6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:599:2: rule__Proof__Group__5__Impl rule__Proof__Group__6
            {
            pushFollow(FOLLOW_rule__Proof__Group__5__Impl_in_rule__Proof__Group__51212);
            rule__Proof__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proof__Group__6_in_rule__Proof__Group__51215);
            rule__Proof__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__5


    // $ANTLR start rule__Proof__Group__5__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:606:1: rule__Proof__Group__5__Impl : ( ')' ) ;
    public final void rule__Proof__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:610:1: ( ( ')' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:611:1: ( ')' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:611:1: ( ')' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:612:1: ')'
            {
             before(grammarAccess.getProofAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Proof__Group__5__Impl1243); 
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
    // $ANTLR end rule__Proof__Group__5__Impl


    // $ANTLR start rule__Proof__Group__6
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:625:1: rule__Proof__Group__6 : rule__Proof__Group__6__Impl ;
    public final void rule__Proof__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:629:1: ( rule__Proof__Group__6__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:630:2: rule__Proof__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Proof__Group__6__Impl_in_rule__Proof__Group__61274);
            rule__Proof__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proof__Group__6


    // $ANTLR start rule__Proof__Group__6__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:636:1: rule__Proof__Group__6__Impl : ( ( rule__Proof__ProofStepsAssignment_6 ) ) ;
    public final void rule__Proof__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:640:1: ( ( ( rule__Proof__ProofStepsAssignment_6 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:641:1: ( ( rule__Proof__ProofStepsAssignment_6 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:641:1: ( ( rule__Proof__ProofStepsAssignment_6 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:642:1: ( rule__Proof__ProofStepsAssignment_6 )
            {
             before(grammarAccess.getProofAccess().getProofStepsAssignment_6()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:643:1: ( rule__Proof__ProofStepsAssignment_6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:643:2: rule__Proof__ProofStepsAssignment_6
            {
            pushFollow(FOLLOW_rule__Proof__ProofStepsAssignment_6_in_rule__Proof__Group__6__Impl1301);
            rule__Proof__ProofStepsAssignment_6();
            _fsp--;


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
    // $ANTLR end rule__Proof__Group__6__Impl


    // $ANTLR start rule__Justifications__Group_0__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:667:1: rule__Justifications__Group_0__0 : rule__Justifications__Group_0__0__Impl rule__Justifications__Group_0__1 ;
    public final void rule__Justifications__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:671:1: ( rule__Justifications__Group_0__0__Impl rule__Justifications__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:672:2: rule__Justifications__Group_0__0__Impl rule__Justifications__Group_0__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0__0__Impl_in_rule__Justifications__Group_0__01345);
            rule__Justifications__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group_0__1_in_rule__Justifications__Group_0__01348);
            rule__Justifications__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0__0


    // $ANTLR start rule__Justifications__Group_0__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:679:1: rule__Justifications__Group_0__0__Impl : ( () ) ;
    public final void rule__Justifications__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:683:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:684:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:684:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:685:1: ()
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:686:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:688:1: 
            {
            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0__0__Impl


    // $ANTLR start rule__Justifications__Group_0__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:698:1: rule__Justifications__Group_0__1 : rule__Justifications__Group_0__1__Impl ;
    public final void rule__Justifications__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:702:1: ( rule__Justifications__Group_0__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:703:2: rule__Justifications__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0__1__Impl_in_rule__Justifications__Group_0__11406);
            rule__Justifications__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0__1


    // $ANTLR start rule__Justifications__Group_0__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:709:1: rule__Justifications__Group_0__1__Impl : ( ( rule__Justifications__Group_0_1__0 )? ) ;
    public final void rule__Justifications__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:713:1: ( ( ( rule__Justifications__Group_0_1__0 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:714:1: ( ( rule__Justifications__Group_0_1__0 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:714:1: ( ( rule__Justifications__Group_0_1__0 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:715:1: ( rule__Justifications__Group_0_1__0 )?
            {
             before(grammarAccess.getJustificationsAccess().getGroup_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:716:1: ( rule__Justifications__Group_0_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:716:2: rule__Justifications__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Justifications__Group_0_1__0_in_rule__Justifications__Group_0__1__Impl1433);
                    rule__Justifications__Group_0_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJustificationsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0__1__Impl


    // $ANTLR start rule__Justifications__Group_0_1__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:730:1: rule__Justifications__Group_0_1__0 : rule__Justifications__Group_0_1__0__Impl rule__Justifications__Group_0_1__1 ;
    public final void rule__Justifications__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:734:1: ( rule__Justifications__Group_0_1__0__Impl rule__Justifications__Group_0_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:735:2: rule__Justifications__Group_0_1__0__Impl rule__Justifications__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0_1__0__Impl_in_rule__Justifications__Group_0_1__01468);
            rule__Justifications__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group_0_1__1_in_rule__Justifications__Group_0_1__01471);
            rule__Justifications__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1__0


    // $ANTLR start rule__Justifications__Group_0_1__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:742:1: rule__Justifications__Group_0_1__0__Impl : ( ( rule__Justifications__JustificationsAssignment_0_1_0 ) ) ;
    public final void rule__Justifications__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:746:1: ( ( ( rule__Justifications__JustificationsAssignment_0_1_0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:747:1: ( ( rule__Justifications__JustificationsAssignment_0_1_0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:747:1: ( ( rule__Justifications__JustificationsAssignment_0_1_0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:748:1: ( rule__Justifications__JustificationsAssignment_0_1_0 )
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAssignment_0_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:749:1: ( rule__Justifications__JustificationsAssignment_0_1_0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:749:2: rule__Justifications__JustificationsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__Justifications__JustificationsAssignment_0_1_0_in_rule__Justifications__Group_0_1__0__Impl1498);
            rule__Justifications__JustificationsAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1__0__Impl


    // $ANTLR start rule__Justifications__Group_0_1__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:759:1: rule__Justifications__Group_0_1__1 : rule__Justifications__Group_0_1__1__Impl ;
    public final void rule__Justifications__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:763:1: ( rule__Justifications__Group_0_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:764:2: rule__Justifications__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0_1__1__Impl_in_rule__Justifications__Group_0_1__11528);
            rule__Justifications__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1__1


    // $ANTLR start rule__Justifications__Group_0_1__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:770:1: rule__Justifications__Group_0_1__1__Impl : ( ( rule__Justifications__Group_0_1_1__0 )* ) ;
    public final void rule__Justifications__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:774:1: ( ( ( rule__Justifications__Group_0_1_1__0 )* ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:775:1: ( ( rule__Justifications__Group_0_1_1__0 )* )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:775:1: ( ( rule__Justifications__Group_0_1_1__0 )* )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:776:1: ( rule__Justifications__Group_0_1_1__0 )*
            {
             before(grammarAccess.getJustificationsAccess().getGroup_0_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:777:1: ( rule__Justifications__Group_0_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:777:2: rule__Justifications__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Justifications__Group_0_1_1__0_in_rule__Justifications__Group_0_1__1__Impl1555);
            	    rule__Justifications__Group_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJustificationsAccess().getGroup_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1__1__Impl


    // $ANTLR start rule__Justifications__Group_0_1_1__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:791:1: rule__Justifications__Group_0_1_1__0 : rule__Justifications__Group_0_1_1__0__Impl rule__Justifications__Group_0_1_1__1 ;
    public final void rule__Justifications__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:795:1: ( rule__Justifications__Group_0_1_1__0__Impl rule__Justifications__Group_0_1_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:796:2: rule__Justifications__Group_0_1_1__0__Impl rule__Justifications__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0_1_1__0__Impl_in_rule__Justifications__Group_0_1_1__01590);
            rule__Justifications__Group_0_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Justifications__Group_0_1_1__1_in_rule__Justifications__Group_0_1_1__01593);
            rule__Justifications__Group_0_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1_1__0


    // $ANTLR start rule__Justifications__Group_0_1_1__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:803:1: rule__Justifications__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Justifications__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:807:1: ( ( ',' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:808:1: ( ',' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:808:1: ( ',' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:809:1: ','
            {
             before(grammarAccess.getJustificationsAccess().getCommaKeyword_0_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Justifications__Group_0_1_1__0__Impl1621); 
             after(grammarAccess.getJustificationsAccess().getCommaKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1_1__0__Impl


    // $ANTLR start rule__Justifications__Group_0_1_1__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:822:1: rule__Justifications__Group_0_1_1__1 : rule__Justifications__Group_0_1_1__1__Impl ;
    public final void rule__Justifications__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:826:1: ( rule__Justifications__Group_0_1_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:827:2: rule__Justifications__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Justifications__Group_0_1_1__1__Impl_in_rule__Justifications__Group_0_1_1__11652);
            rule__Justifications__Group_0_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1_1__1


    // $ANTLR start rule__Justifications__Group_0_1_1__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:833:1: rule__Justifications__Group_0_1_1__1__Impl : ( ( rule__Justifications__JustificationsAssignment_0_1_1_1 ) ) ;
    public final void rule__Justifications__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:837:1: ( ( ( rule__Justifications__JustificationsAssignment_0_1_1_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:838:1: ( ( rule__Justifications__JustificationsAssignment_0_1_1_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:838:1: ( ( rule__Justifications__JustificationsAssignment_0_1_1_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:839:1: ( rule__Justifications__JustificationsAssignment_0_1_1_1 )
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsAssignment_0_1_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:840:1: ( rule__Justifications__JustificationsAssignment_0_1_1_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:840:2: rule__Justifications__JustificationsAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__Justifications__JustificationsAssignment_0_1_1_1_in_rule__Justifications__Group_0_1_1__1__Impl1679);
            rule__Justifications__JustificationsAssignment_0_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getJustificationsAccess().getJustificationsAssignment_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__Group_0_1_1__1__Impl


    // $ANTLR start rule__Justification__Group_0__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:854:1: rule__Justification__Group_0__0 : rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1 ;
    public final void rule__Justification__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:858:1: ( rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:859:2: rule__Justification__Group_0__0__Impl rule__Justification__Group_0__1
            {
            pushFollow(FOLLOW_rule__Justification__Group_0__0__Impl_in_rule__Justification__Group_0__01713);
            rule__Justification__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Justification__Group_0__1_in_rule__Justification__Group_0__01716);
            rule__Justification__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__Group_0__0


    // $ANTLR start rule__Justification__Group_0__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:866:1: rule__Justification__Group_0__0__Impl : ( () ) ;
    public final void rule__Justification__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:870:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:871:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:871:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:872:1: ()
            {
             before(grammarAccess.getJustificationAccess().getJustificationAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:873:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:875:1: 
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
    // $ANTLR end rule__Justification__Group_0__0__Impl


    // $ANTLR start rule__Justification__Group_0__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:885:1: rule__Justification__Group_0__1 : rule__Justification__Group_0__1__Impl ;
    public final void rule__Justification__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:889:1: ( rule__Justification__Group_0__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:890:2: rule__Justification__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Justification__Group_0__1__Impl_in_rule__Justification__Group_0__11774);
            rule__Justification__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__Group_0__1


    // $ANTLR start rule__Justification__Group_0__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:896:1: rule__Justification__Group_0__1__Impl : ( ( rule__Justification__NumeralAssignment_0_1 ) ) ;
    public final void rule__Justification__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:900:1: ( ( ( rule__Justification__NumeralAssignment_0_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:901:1: ( ( rule__Justification__NumeralAssignment_0_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:901:1: ( ( rule__Justification__NumeralAssignment_0_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:902:1: ( rule__Justification__NumeralAssignment_0_1 )
            {
             before(grammarAccess.getJustificationAccess().getNumeralAssignment_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:903:1: ( rule__Justification__NumeralAssignment_0_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:903:2: rule__Justification__NumeralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Justification__NumeralAssignment_0_1_in_rule__Justification__Group_0__1__Impl1801);
            rule__Justification__NumeralAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getJustificationAccess().getNumeralAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__Group_0__1__Impl


    // $ANTLR start rule__QuotedAssertion__Group__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:917:1: rule__QuotedAssertion__Group__0 : rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1 ;
    public final void rule__QuotedAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:921:1: ( rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:922:2: rule__QuotedAssertion__Group__0__Impl rule__QuotedAssertion__Group__1
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__0__Impl_in_rule__QuotedAssertion__Group__01835);
            rule__QuotedAssertion__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QuotedAssertion__Group__1_in_rule__QuotedAssertion__Group__01838);
            rule__QuotedAssertion__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QuotedAssertion__Group__0


    // $ANTLR start rule__QuotedAssertion__Group__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:929:1: rule__QuotedAssertion__Group__0__Impl : ( () ) ;
    public final void rule__QuotedAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:933:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:934:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:934:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:935:1: ()
            {
             before(grammarAccess.getQuotedAssertionAccess().getQuotedAssertionAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:936:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:938:1: 
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
    // $ANTLR end rule__QuotedAssertion__Group__0__Impl


    // $ANTLR start rule__QuotedAssertion__Group__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:948:1: rule__QuotedAssertion__Group__1 : rule__QuotedAssertion__Group__1__Impl ;
    public final void rule__QuotedAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:952:1: ( rule__QuotedAssertion__Group__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:953:2: rule__QuotedAssertion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__Group__1__Impl_in_rule__QuotedAssertion__Group__11896);
            rule__QuotedAssertion__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QuotedAssertion__Group__1


    // $ANTLR start rule__QuotedAssertion__Group__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:959:1: rule__QuotedAssertion__Group__1__Impl : ( ( rule__QuotedAssertion__TextAssignment_1 ) ) ;
    public final void rule__QuotedAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:963:1: ( ( ( rule__QuotedAssertion__TextAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:964:1: ( ( rule__QuotedAssertion__TextAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:964:1: ( ( rule__QuotedAssertion__TextAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:965:1: ( rule__QuotedAssertion__TextAssignment_1 )
            {
             before(grammarAccess.getQuotedAssertionAccess().getTextAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:966:1: ( rule__QuotedAssertion__TextAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:966:2: rule__QuotedAssertion__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__QuotedAssertion__TextAssignment_1_in_rule__QuotedAssertion__Group__1__Impl1923);
            rule__QuotedAssertion__TextAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__QuotedAssertion__Group__1__Impl


    // $ANTLR start rule__Entailment__Group__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:980:1: rule__Entailment__Group__0 : rule__Entailment__Group__0__Impl rule__Entailment__Group__1 ;
    public final void rule__Entailment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:984:1: ( rule__Entailment__Group__0__Impl rule__Entailment__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:985:2: rule__Entailment__Group__0__Impl rule__Entailment__Group__1
            {
            pushFollow(FOLLOW_rule__Entailment__Group__0__Impl_in_rule__Entailment__Group__01957);
            rule__Entailment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__1_in_rule__Entailment__Group__01960);
            rule__Entailment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__0


    // $ANTLR start rule__Entailment__Group__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:992:1: rule__Entailment__Group__0__Impl : ( () ) ;
    public final void rule__Entailment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:996:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:997:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:997:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:998:1: ()
            {
             before(grammarAccess.getEntailmentAccess().getEntailmentAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:999:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1001:1: 
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
    // $ANTLR end rule__Entailment__Group__0__Impl


    // $ANTLR start rule__Entailment__Group__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1011:1: rule__Entailment__Group__1 : rule__Entailment__Group__1__Impl rule__Entailment__Group__2 ;
    public final void rule__Entailment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1015:1: ( rule__Entailment__Group__1__Impl rule__Entailment__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1016:2: rule__Entailment__Group__1__Impl rule__Entailment__Group__2
            {
            pushFollow(FOLLOW_rule__Entailment__Group__1__Impl_in_rule__Entailment__Group__12018);
            rule__Entailment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__2_in_rule__Entailment__Group__12021);
            rule__Entailment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__1


    // $ANTLR start rule__Entailment__Group__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1023:1: rule__Entailment__Group__1__Impl : ( ( rule__Entailment__ConjunctionAssignment_1 ) ) ;
    public final void rule__Entailment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1027:1: ( ( ( rule__Entailment__ConjunctionAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1028:1: ( ( rule__Entailment__ConjunctionAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1028:1: ( ( rule__Entailment__ConjunctionAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1029:1: ( rule__Entailment__ConjunctionAssignment_1 )
            {
             before(grammarAccess.getEntailmentAccess().getConjunctionAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1030:1: ( rule__Entailment__ConjunctionAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1030:2: rule__Entailment__ConjunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__Entailment__ConjunctionAssignment_1_in_rule__Entailment__Group__1__Impl2048);
            rule__Entailment__ConjunctionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntailmentAccess().getConjunctionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__1__Impl


    // $ANTLR start rule__Entailment__Group__2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1040:1: rule__Entailment__Group__2 : rule__Entailment__Group__2__Impl rule__Entailment__Group__3 ;
    public final void rule__Entailment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1044:1: ( rule__Entailment__Group__2__Impl rule__Entailment__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1045:2: rule__Entailment__Group__2__Impl rule__Entailment__Group__3
            {
            pushFollow(FOLLOW_rule__Entailment__Group__2__Impl_in_rule__Entailment__Group__22078);
            rule__Entailment__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entailment__Group__3_in_rule__Entailment__Group__22081);
            rule__Entailment__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__2


    // $ANTLR start rule__Entailment__Group__2__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1052:1: rule__Entailment__Group__2__Impl : ( '->' ) ;
    public final void rule__Entailment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1056:1: ( ( '->' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1057:1: ( '->' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1057:1: ( '->' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1058:1: '->'
            {
             before(grammarAccess.getEntailmentAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Entailment__Group__2__Impl2109); 
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
    // $ANTLR end rule__Entailment__Group__2__Impl


    // $ANTLR start rule__Entailment__Group__3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1071:1: rule__Entailment__Group__3 : rule__Entailment__Group__3__Impl ;
    public final void rule__Entailment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1075:1: ( rule__Entailment__Group__3__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1076:2: rule__Entailment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entailment__Group__3__Impl_in_rule__Entailment__Group__32140);
            rule__Entailment__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__3


    // $ANTLR start rule__Entailment__Group__3__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1082:1: rule__Entailment__Group__3__Impl : ( ( rule__Entailment__IdAssignment_3 ) ) ;
    public final void rule__Entailment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1086:1: ( ( ( rule__Entailment__IdAssignment_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1087:1: ( ( rule__Entailment__IdAssignment_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1087:1: ( ( rule__Entailment__IdAssignment_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1088:1: ( rule__Entailment__IdAssignment_3 )
            {
             before(grammarAccess.getEntailmentAccess().getIdAssignment_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1089:1: ( rule__Entailment__IdAssignment_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1089:2: rule__Entailment__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__Entailment__IdAssignment_3_in_rule__Entailment__Group__3__Impl2167);
            rule__Entailment__IdAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEntailmentAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__Group__3__Impl


    // $ANTLR start rule__Conjunction__Group_0__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1107:1: rule__Conjunction__Group_0__0 : rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1 ;
    public final void rule__Conjunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1111:1: ( rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1112:2: rule__Conjunction__Group_0__0__Impl rule__Conjunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__0__Impl_in_rule__Conjunction__Group_0__02205);
            rule__Conjunction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__1_in_rule__Conjunction__Group_0__02208);
            rule__Conjunction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_0__0


    // $ANTLR start rule__Conjunction__Group_0__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1119:1: rule__Conjunction__Group_0__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1123:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1124:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1124:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1125:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1126:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1128:1: 
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
    // $ANTLR end rule__Conjunction__Group_0__0__Impl


    // $ANTLR start rule__Conjunction__Group_0__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1138:1: rule__Conjunction__Group_0__1 : rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2 ;
    public final void rule__Conjunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1142:1: ( rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1143:2: rule__Conjunction__Group_0__1__Impl rule__Conjunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__1__Impl_in_rule__Conjunction__Group_0__12266);
            rule__Conjunction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__2_in_rule__Conjunction__Group_0__12269);
            rule__Conjunction__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_0__1


    // $ANTLR start rule__Conjunction__Group_0__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1150:1: rule__Conjunction__Group_0__1__Impl : ( ( rule__Conjunction__LhsAssignment_0_1 ) ) ;
    public final void rule__Conjunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1154:1: ( ( ( rule__Conjunction__LhsAssignment_0_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1155:1: ( ( rule__Conjunction__LhsAssignment_0_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1155:1: ( ( rule__Conjunction__LhsAssignment_0_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1156:1: ( rule__Conjunction__LhsAssignment_0_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLhsAssignment_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1157:1: ( rule__Conjunction__LhsAssignment_0_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1157:2: rule__Conjunction__LhsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Conjunction__LhsAssignment_0_1_in_rule__Conjunction__Group_0__1__Impl2296);
            rule__Conjunction__LhsAssignment_0_1();
            _fsp--;


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
    // $ANTLR end rule__Conjunction__Group_0__1__Impl


    // $ANTLR start rule__Conjunction__Group_0__2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1167:1: rule__Conjunction__Group_0__2 : rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3 ;
    public final void rule__Conjunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1171:1: ( rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1172:2: rule__Conjunction__Group_0__2__Impl rule__Conjunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__2__Impl_in_rule__Conjunction__Group_0__22326);
            rule__Conjunction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_0__3_in_rule__Conjunction__Group_0__22329);
            rule__Conjunction__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_0__2


    // $ANTLR start rule__Conjunction__Group_0__2__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1179:1: rule__Conjunction__Group_0__2__Impl : ( '^' ) ;
    public final void rule__Conjunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1183:1: ( ( '^' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1184:1: ( '^' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1184:1: ( '^' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1185:1: '^'
            {
             before(grammarAccess.getConjunctionAccess().getCircumflexAccentKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__Conjunction__Group_0__2__Impl2357); 
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
    // $ANTLR end rule__Conjunction__Group_0__2__Impl


    // $ANTLR start rule__Conjunction__Group_0__3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1198:1: rule__Conjunction__Group_0__3 : rule__Conjunction__Group_0__3__Impl ;
    public final void rule__Conjunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1202:1: ( rule__Conjunction__Group_0__3__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1203:2: rule__Conjunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_0__3__Impl_in_rule__Conjunction__Group_0__32388);
            rule__Conjunction__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_0__3


    // $ANTLR start rule__Conjunction__Group_0__3__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1209:1: rule__Conjunction__Group_0__3__Impl : ( ( rule__Conjunction__RhsAssignment_0_3 ) ) ;
    public final void rule__Conjunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1213:1: ( ( ( rule__Conjunction__RhsAssignment_0_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1214:1: ( ( rule__Conjunction__RhsAssignment_0_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1214:1: ( ( rule__Conjunction__RhsAssignment_0_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1215:1: ( rule__Conjunction__RhsAssignment_0_3 )
            {
             before(grammarAccess.getConjunctionAccess().getRhsAssignment_0_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1216:1: ( rule__Conjunction__RhsAssignment_0_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1216:2: rule__Conjunction__RhsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Conjunction__RhsAssignment_0_3_in_rule__Conjunction__Group_0__3__Impl2415);
            rule__Conjunction__RhsAssignment_0_3();
            _fsp--;


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
    // $ANTLR end rule__Conjunction__Group_0__3__Impl


    // $ANTLR start rule__ProofSteps__Group_0__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1234:1: rule__ProofSteps__Group_0__0 : rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1 ;
    public final void rule__ProofSteps__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1238:1: ( rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1239:2: rule__ProofSteps__Group_0__0__Impl rule__ProofSteps__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0__0__Impl_in_rule__ProofSteps__Group_0__02453);
            rule__ProofSteps__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProofSteps__Group_0__1_in_rule__ProofSteps__Group_0__02456);
            rule__ProofSteps__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProofSteps__Group_0__0


    // $ANTLR start rule__ProofSteps__Group_0__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1246:1: rule__ProofSteps__Group_0__0__Impl : ( () ) ;
    public final void rule__ProofSteps__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1250:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1251:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1251:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1252:1: ()
            {
             before(grammarAccess.getProofStepsAccess().getProofStepsAction_0_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1253:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1255:1: 
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
    // $ANTLR end rule__ProofSteps__Group_0__0__Impl


    // $ANTLR start rule__ProofSteps__Group_0__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1265:1: rule__ProofSteps__Group_0__1 : rule__ProofSteps__Group_0__1__Impl ;
    public final void rule__ProofSteps__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1269:1: ( rule__ProofSteps__Group_0__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1270:2: rule__ProofSteps__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0__1__Impl_in_rule__ProofSteps__Group_0__12514);
            rule__ProofSteps__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProofSteps__Group_0__1


    // $ANTLR start rule__ProofSteps__Group_0__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1276:1: rule__ProofSteps__Group_0__1__Impl : ( ( rule__ProofSteps__Group_0_1__0 )? ) ;
    public final void rule__ProofSteps__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1280:1: ( ( ( rule__ProofSteps__Group_0_1__0 )? ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1281:1: ( ( rule__ProofSteps__Group_0_1__0 )? )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1281:1: ( ( rule__ProofSteps__Group_0_1__0 )? )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1282:1: ( rule__ProofSteps__Group_0_1__0 )?
            {
             before(grammarAccess.getProofStepsAccess().getGroup_0_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1283:1: ( rule__ProofSteps__Group_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1283:2: rule__ProofSteps__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__0_in_rule__ProofSteps__Group_0__1__Impl2541);
                    rule__ProofSteps__Group_0_1__0();
                    _fsp--;


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
    // $ANTLR end rule__ProofSteps__Group_0__1__Impl


    // $ANTLR start rule__ProofSteps__Group_0_1__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1297:1: rule__ProofSteps__Group_0_1__0 : rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1 ;
    public final void rule__ProofSteps__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1301:1: ( rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1302:2: rule__ProofSteps__Group_0_1__0__Impl rule__ProofSteps__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__0__Impl_in_rule__ProofSteps__Group_0_1__02576);
            rule__ProofSteps__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__1_in_rule__ProofSteps__Group_0_1__02579);
            rule__ProofSteps__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProofSteps__Group_0_1__0


    // $ANTLR start rule__ProofSteps__Group_0_1__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1309:1: rule__ProofSteps__Group_0_1__0__Impl : ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) ) ;
    public final void rule__ProofSteps__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1313:1: ( ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1314:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1314:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_0 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1315:1: ( rule__ProofSteps__StatementsAssignment_0_1_0 )
            {
             before(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1316:1: ( rule__ProofSteps__StatementsAssignment_0_1_0 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1316:2: rule__ProofSteps__StatementsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_0_in_rule__ProofSteps__Group_0_1__0__Impl2606);
            rule__ProofSteps__StatementsAssignment_0_1_0();
            _fsp--;


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
    // $ANTLR end rule__ProofSteps__Group_0_1__0__Impl


    // $ANTLR start rule__ProofSteps__Group_0_1__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1326:1: rule__ProofSteps__Group_0_1__1 : rule__ProofSteps__Group_0_1__1__Impl ;
    public final void rule__ProofSteps__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1330:1: ( rule__ProofSteps__Group_0_1__1__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1331:2: rule__ProofSteps__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProofSteps__Group_0_1__1__Impl_in_rule__ProofSteps__Group_0_1__12636);
            rule__ProofSteps__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProofSteps__Group_0_1__1


    // $ANTLR start rule__ProofSteps__Group_0_1__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1337:1: rule__ProofSteps__Group_0_1__1__Impl : ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* ) ;
    public final void rule__ProofSteps__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1341:1: ( ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1342:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1342:1: ( ( rule__ProofSteps__StatementsAssignment_0_1_1 )* )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1343:1: ( rule__ProofSteps__StatementsAssignment_0_1_1 )*
            {
             before(grammarAccess.getProofStepsAccess().getStatementsAssignment_0_1_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1344:1: ( rule__ProofSteps__StatementsAssignment_0_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1344:2: rule__ProofSteps__StatementsAssignment_0_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_1_in_rule__ProofSteps__Group_0_1__1__Impl2663);
            	    rule__ProofSteps__StatementsAssignment_0_1_1();
            	    _fsp--;


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
    // $ANTLR end rule__ProofSteps__Group_0_1__1__Impl


    // $ANTLR start rule__Statement__Group__0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1358:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1362:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1363:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02698);
            rule__Statement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02701);
            rule__Statement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__0


    // $ANTLR start rule__Statement__Group__0__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1370:1: rule__Statement__Group__0__Impl : ( () ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1374:1: ( ( () ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1375:1: ( () )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1375:1: ( () )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1376:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1377:1: ()
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1379:1: 
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
    // $ANTLR end rule__Statement__Group__0__Impl


    // $ANTLR start rule__Statement__Group__1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1389:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1393:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1394:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12759);
            rule__Statement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12762);
            rule__Statement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__1


    // $ANTLR start rule__Statement__Group__1__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1401:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__IdAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1405:1: ( ( ( rule__Statement__IdAssignment_1 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1406:1: ( ( rule__Statement__IdAssignment_1 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1406:1: ( ( rule__Statement__IdAssignment_1 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1407:1: ( rule__Statement__IdAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getIdAssignment_1()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1408:1: ( rule__Statement__IdAssignment_1 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1408:2: rule__Statement__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__IdAssignment_1_in_rule__Statement__Group__1__Impl2789);
            rule__Statement__IdAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Statement__Group__1__Impl


    // $ANTLR start rule__Statement__Group__2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1418:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1422:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1423:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22819);
            rule__Statement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22822);
            rule__Statement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__2


    // $ANTLR start rule__Statement__Group__2__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1430:1: rule__Statement__Group__2__Impl : ( '.' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1434:1: ( ( '.' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1435:1: ( '.' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1435:1: ( '.' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1436:1: '.'
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Statement__Group__2__Impl2850); 
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
    // $ANTLR end rule__Statement__Group__2__Impl


    // $ANTLR start rule__Statement__Group__3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1449:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1453:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1454:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32881);
            rule__Statement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32884);
            rule__Statement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__3


    // $ANTLR start rule__Statement__Group__3__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1461:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__StatementAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1465:1: ( ( ( rule__Statement__StatementAssignment_3 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1466:1: ( ( rule__Statement__StatementAssignment_3 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1466:1: ( ( rule__Statement__StatementAssignment_3 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1467:1: ( rule__Statement__StatementAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_3()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1468:1: ( rule__Statement__StatementAssignment_3 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1468:2: rule__Statement__StatementAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_3_in_rule__Statement__Group__3__Impl2911);
            rule__Statement__StatementAssignment_3();
            _fsp--;


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
    // $ANTLR end rule__Statement__Group__3__Impl


    // $ANTLR start rule__Statement__Group__4
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1478:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1482:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1483:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42941);
            rule__Statement__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42944);
            rule__Statement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__4


    // $ANTLR start rule__Statement__Group__4__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1490:1: rule__Statement__Group__4__Impl : ( '(' ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1494:1: ( ( '(' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1495:1: ( '(' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1495:1: ( '(' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1496:1: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Statement__Group__4__Impl2972); 
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
    // $ANTLR end rule__Statement__Group__4__Impl


    // $ANTLR start rule__Statement__Group__5
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1509:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl rule__Statement__Group__6 ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1513:1: ( rule__Statement__Group__5__Impl rule__Statement__Group__6 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1514:2: rule__Statement__Group__5__Impl rule__Statement__Group__6
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__53003);
            rule__Statement__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__6_in_rule__Statement__Group__53006);
            rule__Statement__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__5


    // $ANTLR start rule__Statement__Group__5__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1521:1: rule__Statement__Group__5__Impl : ( ( rule__Statement__JustificationAssignment_5 ) ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1525:1: ( ( ( rule__Statement__JustificationAssignment_5 ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1526:1: ( ( rule__Statement__JustificationAssignment_5 ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1526:1: ( ( rule__Statement__JustificationAssignment_5 ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1527:1: ( rule__Statement__JustificationAssignment_5 )
            {
             before(grammarAccess.getStatementAccess().getJustificationAssignment_5()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1528:1: ( rule__Statement__JustificationAssignment_5 )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1528:2: rule__Statement__JustificationAssignment_5
            {
            pushFollow(FOLLOW_rule__Statement__JustificationAssignment_5_in_rule__Statement__Group__5__Impl3033);
            rule__Statement__JustificationAssignment_5();
            _fsp--;


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
    // $ANTLR end rule__Statement__Group__5__Impl


    // $ANTLR start rule__Statement__Group__6
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1538:1: rule__Statement__Group__6 : rule__Statement__Group__6__Impl ;
    public final void rule__Statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1542:1: ( rule__Statement__Group__6__Impl )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1543:2: rule__Statement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__6__Impl_in_rule__Statement__Group__63063);
            rule__Statement__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__6


    // $ANTLR start rule__Statement__Group__6__Impl
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1549:1: rule__Statement__Group__6__Impl : ( ')' ) ;
    public final void rule__Statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1553:1: ( ( ')' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1554:1: ( ')' )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1554:1: ( ')' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1555:1: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Statement__Group__6__Impl3091); 
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
    // $ANTLR end rule__Statement__Group__6__Impl


    // $ANTLR start rule__Proof__TitleAssignment_2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1583:1: rule__Proof__TitleAssignment_2 : ( ruleText ) ;
    public final void rule__Proof__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1587:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1588:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1588:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1589:1: ruleText
            {
             before(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Proof__TitleAssignment_23141);
            ruleText();
            _fsp--;

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
    // $ANTLR end rule__Proof__TitleAssignment_2


    // $ANTLR start rule__Proof__JustificationsAssignment_4
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1598:1: rule__Proof__JustificationsAssignment_4 : ( ruleJustifications ) ;
    public final void rule__Proof__JustificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1602:1: ( ( ruleJustifications ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1603:1: ( ruleJustifications )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1603:1: ( ruleJustifications )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1604:1: ruleJustifications
            {
             before(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleJustifications_in_rule__Proof__JustificationsAssignment_43172);
            ruleJustifications();
            _fsp--;

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
    // $ANTLR end rule__Proof__JustificationsAssignment_4


    // $ANTLR start rule__Proof__ProofStepsAssignment_6
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1613:1: rule__Proof__ProofStepsAssignment_6 : ( ruleProofSteps ) ;
    public final void rule__Proof__ProofStepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1617:1: ( ( ruleProofSteps ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1618:1: ( ruleProofSteps )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1618:1: ( ruleProofSteps )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1619:1: ruleProofSteps
            {
             before(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleProofSteps_in_rule__Proof__ProofStepsAssignment_63203);
            ruleProofSteps();
            _fsp--;

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
    // $ANTLR end rule__Proof__ProofStepsAssignment_6


    // $ANTLR start rule__Justifications__JustificationsAssignment_0_1_0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1628:1: rule__Justifications__JustificationsAssignment_0_1_0 : ( ruleJustification ) ;
    public final void rule__Justifications__JustificationsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1632:1: ( ( ruleJustification ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1633:1: ( ruleJustification )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1633:1: ( ruleJustification )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1634:1: ruleJustification
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_0_1_03234);
            ruleJustification();
            _fsp--;

             after(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__JustificationsAssignment_0_1_0


    // $ANTLR start rule__Justifications__JustificationsAssignment_0_1_1_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1643:1: rule__Justifications__JustificationsAssignment_0_1_1_1 : ( ruleJustification ) ;
    public final void rule__Justifications__JustificationsAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1647:1: ( ( ruleJustification ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1648:1: ( ruleJustification )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1648:1: ( ruleJustification )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1649:1: ruleJustification
            {
             before(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_0_1_1_13265);
            ruleJustification();
            _fsp--;

             after(grammarAccess.getJustificationsAccess().getJustificationsJustificationParserRuleCall_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__JustificationsAssignment_0_1_1_1


    // $ANTLR start rule__Justifications__HypothesisAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1658:1: rule__Justifications__HypothesisAssignment_1 : ( ( 'hypothesis' ) ) ;
    public final void rule__Justifications__HypothesisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1662:1: ( ( ( 'hypothesis' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1663:1: ( ( 'hypothesis' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1663:1: ( ( 'hypothesis' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1664:1: ( 'hypothesis' )
            {
             before(grammarAccess.getJustificationsAccess().getHypothesisHypothesisKeyword_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1665:1: ( 'hypothesis' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1666:1: 'hypothesis'
            {
             before(grammarAccess.getJustificationsAccess().getHypothesisHypothesisKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Justifications__HypothesisAssignment_13301); 
             after(grammarAccess.getJustificationsAccess().getHypothesisHypothesisKeyword_1_0()); 

            }

             after(grammarAccess.getJustificationsAccess().getHypothesisHypothesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__HypothesisAssignment_1


    // $ANTLR start rule__Justifications__EpsilonAssignment_2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1681:1: rule__Justifications__EpsilonAssignment_2 : ( ( 'epsilon' ) ) ;
    public final void rule__Justifications__EpsilonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1685:1: ( ( ( 'epsilon' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1686:1: ( ( 'epsilon' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1686:1: ( ( 'epsilon' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1687:1: ( 'epsilon' )
            {
             before(grammarAccess.getJustificationsAccess().getEpsilonEpsilonKeyword_2_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1688:1: ( 'epsilon' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1689:1: 'epsilon'
            {
             before(grammarAccess.getJustificationsAccess().getEpsilonEpsilonKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Justifications__EpsilonAssignment_23345); 
             after(grammarAccess.getJustificationsAccess().getEpsilonEpsilonKeyword_2_0()); 

            }

             after(grammarAccess.getJustificationsAccess().getEpsilonEpsilonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justifications__EpsilonAssignment_2


    // $ANTLR start rule__Justification__NumeralAssignment_0_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1704:1: rule__Justification__NumeralAssignment_0_1 : ( ruleNumeral ) ;
    public final void rule__Justification__NumeralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1708:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1709:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1709:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1710:1: ruleNumeral
            {
             before(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Justification__NumeralAssignment_0_13384);
            ruleNumeral();
            _fsp--;

             after(grammarAccess.getJustificationAccess().getNumeralNumeralParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__NumeralAssignment_0_1


    // $ANTLR start rule__Justification__AssertionAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1719:1: rule__Justification__AssertionAssignment_1 : ( ruleQuotedAssertion ) ;
    public final void rule__Justification__AssertionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1723:1: ( ( ruleQuotedAssertion ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1724:1: ( ruleQuotedAssertion )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1724:1: ( ruleQuotedAssertion )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1725:1: ruleQuotedAssertion
            {
             before(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQuotedAssertion_in_rule__Justification__AssertionAssignment_13415);
            ruleQuotedAssertion();
            _fsp--;

             after(grammarAccess.getJustificationAccess().getAssertionQuotedAssertionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__AssertionAssignment_1


    // $ANTLR start rule__Justification__EntailmentAssignment_2
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1734:1: rule__Justification__EntailmentAssignment_2 : ( ruleEntailment ) ;
    public final void rule__Justification__EntailmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1738:1: ( ( ruleEntailment ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1739:1: ( ruleEntailment )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1739:1: ( ruleEntailment )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1740:1: ruleEntailment
            {
             before(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntailment_in_rule__Justification__EntailmentAssignment_23446);
            ruleEntailment();
            _fsp--;

             after(grammarAccess.getJustificationAccess().getEntailmentEntailmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Justification__EntailmentAssignment_2


    // $ANTLR start rule__QuotedAssertion__TextAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1749:1: rule__QuotedAssertion__TextAssignment_1 : ( ruleText ) ;
    public final void rule__QuotedAssertion__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1753:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1754:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1754:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1755:1: ruleText
            {
             before(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__QuotedAssertion__TextAssignment_13477);
            ruleText();
            _fsp--;

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
    // $ANTLR end rule__QuotedAssertion__TextAssignment_1


    // $ANTLR start rule__Entailment__ConjunctionAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1764:1: rule__Entailment__ConjunctionAssignment_1 : ( ruleConjunction ) ;
    public final void rule__Entailment__ConjunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1768:1: ( ( ruleConjunction ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1769:1: ( ruleConjunction )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1769:1: ( ruleConjunction )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1770:1: ruleConjunction
            {
             before(grammarAccess.getEntailmentAccess().getConjunctionConjunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Entailment__ConjunctionAssignment_13508);
            ruleConjunction();
            _fsp--;

             after(grammarAccess.getEntailmentAccess().getConjunctionConjunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__ConjunctionAssignment_1


    // $ANTLR start rule__Entailment__IdAssignment_3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1779:1: rule__Entailment__IdAssignment_3 : ( ruleNumeral ) ;
    public final void rule__Entailment__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1783:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1784:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1784:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1785:1: ruleNumeral
            {
             before(grammarAccess.getEntailmentAccess().getIdNumeralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Entailment__IdAssignment_33539);
            ruleNumeral();
            _fsp--;

             after(grammarAccess.getEntailmentAccess().getIdNumeralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entailment__IdAssignment_3


    // $ANTLR start rule__Conjunction__LhsAssignment_0_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1794:1: rule__Conjunction__LhsAssignment_0_1 : ( ruleNumeral ) ;
    public final void rule__Conjunction__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1798:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1799:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1799:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1800:1: ruleNumeral
            {
             before(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_0_13570);
            ruleNumeral();
            _fsp--;

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
    // $ANTLR end rule__Conjunction__LhsAssignment_0_1


    // $ANTLR start rule__Conjunction__RhsAssignment_0_3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1809:1: rule__Conjunction__RhsAssignment_0_3 : ( ruleConjunction ) ;
    public final void rule__Conjunction__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1813:1: ( ( ruleConjunction ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1814:1: ( ruleConjunction )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1814:1: ( ruleConjunction )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1815:1: ruleConjunction
            {
             before(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Conjunction__RhsAssignment_0_33601);
            ruleConjunction();
            _fsp--;

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
    // $ANTLR end rule__Conjunction__RhsAssignment_0_3


    // $ANTLR start rule__Conjunction__LhsAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1824:1: rule__Conjunction__LhsAssignment_1 : ( ruleNumeral ) ;
    public final void rule__Conjunction__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1828:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1829:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1829:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1830:1: ruleNumeral
            {
             before(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_13632);
            ruleNumeral();
            _fsp--;

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
    // $ANTLR end rule__Conjunction__LhsAssignment_1


    // $ANTLR start rule__ProofSteps__StatementsAssignment_0_1_0
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1839:1: rule__ProofSteps__StatementsAssignment_0_1_0 : ( ruleStatement ) ;
    public final void rule__ProofSteps__StatementsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1843:1: ( ( ruleStatement ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1844:1: ( ruleStatement )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1844:1: ( ruleStatement )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1845:1: ruleStatement
            {
             before(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_03663);
            ruleStatement();
            _fsp--;

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
    // $ANTLR end rule__ProofSteps__StatementsAssignment_0_1_0


    // $ANTLR start rule__ProofSteps__StatementsAssignment_0_1_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1854:1: rule__ProofSteps__StatementsAssignment_0_1_1 : ( ruleStatement ) ;
    public final void rule__ProofSteps__StatementsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1858:1: ( ( ruleStatement ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1859:1: ( ruleStatement )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1859:1: ( ruleStatement )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1860:1: ruleStatement
            {
             before(grammarAccess.getProofStepsAccess().getStatementsStatementParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_13694);
            ruleStatement();
            _fsp--;

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
    // $ANTLR end rule__ProofSteps__StatementsAssignment_0_1_1


    // $ANTLR start rule__ProofSteps__EpsilonAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1869:1: rule__ProofSteps__EpsilonAssignment_1 : ( ( 'epsilon' ) ) ;
    public final void rule__ProofSteps__EpsilonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1873:1: ( ( ( 'epsilon' ) ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1874:1: ( ( 'epsilon' ) )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1874:1: ( ( 'epsilon' ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1875:1: ( 'epsilon' )
            {
             before(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1876:1: ( 'epsilon' )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1877:1: 'epsilon'
            {
             before(grammarAccess.getProofStepsAccess().getEpsilonEpsilonKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__ProofSteps__EpsilonAssignment_13730); 
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
    // $ANTLR end rule__ProofSteps__EpsilonAssignment_1


    // $ANTLR start rule__Statement__IdAssignment_1
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1892:1: rule__Statement__IdAssignment_1 : ( ruleNumeral ) ;
    public final void rule__Statement__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1896:1: ( ( ruleNumeral ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1897:1: ( ruleNumeral )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1897:1: ( ruleNumeral )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1898:1: ruleNumeral
            {
             before(grammarAccess.getStatementAccess().getIdNumeralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumeral_in_rule__Statement__IdAssignment_13769);
            ruleNumeral();
            _fsp--;

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
    // $ANTLR end rule__Statement__IdAssignment_1


    // $ANTLR start rule__Statement__StatementAssignment_3
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1907:1: rule__Statement__StatementAssignment_3 : ( ruleText ) ;
    public final void rule__Statement__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1911:1: ( ( ruleText ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1912:1: ( ruleText )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1912:1: ( ruleText )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1913:1: ruleText
            {
             before(grammarAccess.getStatementAccess().getStatementTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Statement__StatementAssignment_33800);
            ruleText();
            _fsp--;

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
    // $ANTLR end rule__Statement__StatementAssignment_3


    // $ANTLR start rule__Statement__JustificationAssignment_5
    // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1922:1: rule__Statement__JustificationAssignment_5 : ( ruleJustifications ) ;
    public final void rule__Statement__JustificationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1926:1: ( ( ruleJustifications ) )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1927:1: ( ruleJustifications )
            {
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1927:1: ( ruleJustifications )
            // ../net.certware.argument.sfp.ui/src-gen/net/certware/argument/sfp/ui/contentassist/antlr/internal/InternalSemiFormalProof.g:1928:1: ruleJustifications
            {
             before(grammarAccess.getStatementAccess().getJustificationJustificationsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleJustifications_in_rule__Statement__JustificationAssignment_53831);
            ruleJustifications();
            _fsp--;

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
    // $ANTLR end rule__Statement__JustificationAssignment_5


 

    public static final BitSet FOLLOW_ruleProof_in_entryRuleProof61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProof68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__0_in_ruleProof94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_entryRuleJustifications180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifications187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Alternatives_in_ruleJustifications213 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Justifications__Group_0__0_in_rule__Justifications__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__HypothesisAssignment_1_in_rule__Justifications__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__EpsilonAssignment_2_in_rule__Justifications__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__0_in_rule__Justification__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__AssertionAssignment_1_in_rule__Justification__Alternatives755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__EntailmentAssignment_2_in_rule__Justification__Alternatives773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__0_in_rule__Conjunction__Alternatives806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__LhsAssignment_1_in_rule__Conjunction__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__0_in_rule__ProofSteps__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__EpsilonAssignment_1_in_rule__ProofSteps__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__0__Impl_in_rule__Proof__Group__0906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Proof__Group__1_in_rule__Proof__Group__0909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Proof__Group__0__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__1__Impl_in_rule__Proof__Group__1968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Proof__Group__2_in_rule__Proof__Group__1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Proof__Group__1__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__2__Impl_in_rule__Proof__Group__21030 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Proof__Group__3_in_rule__Proof__Group__21033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__TitleAssignment_2_in_rule__Proof__Group__2__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__3__Impl_in_rule__Proof__Group__31090 = new BitSet(new long[]{0x0000000000184030L});
    public static final BitSet FOLLOW_rule__Proof__Group__4_in_rule__Proof__Group__31093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Proof__Group__3__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__4__Impl_in_rule__Proof__Group__41152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Proof__Group__5_in_rule__Proof__Group__41155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__JustificationsAssignment_4_in_rule__Proof__Group__4__Impl1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__5__Impl_in_rule__Proof__Group__51212 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_rule__Proof__Group__6_in_rule__Proof__Group__51215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Proof__Group__5__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__Group__6__Impl_in_rule__Proof__Group__61274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proof__ProofStepsAssignment_6_in_rule__Proof__Group__6__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0__0__Impl_in_rule__Justifications__Group_0__01345 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0__1_in_rule__Justifications__Group_0__01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0__1__Impl_in_rule__Justifications__Group_0__11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1__0_in_rule__Justifications__Group_0__1__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1__0__Impl_in_rule__Justifications__Group_0_1__01468 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1__1_in_rule__Justifications__Group_0_1__01471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__JustificationsAssignment_0_1_0_in_rule__Justifications__Group_0_1__0__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1__1__Impl_in_rule__Justifications__Group_0_1__11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1_1__0_in_rule__Justifications__Group_0_1__1__Impl1555 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1_1__0__Impl_in_rule__Justifications__Group_0_1_1__01590 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1_1__1_in_rule__Justifications__Group_0_1_1__01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Justifications__Group_0_1_1__0__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__Group_0_1_1__1__Impl_in_rule__Justifications__Group_0_1_1__11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justifications__JustificationsAssignment_0_1_1_1_in_rule__Justifications__Group_0_1_1__1__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__0__Impl_in_rule__Justification__Group_0__01713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__1_in_rule__Justification__Group_0__01716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Group_0__1__Impl_in_rule__Justification__Group_0__11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__NumeralAssignment_0_1_in_rule__Justification__Group_0__1__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__0__Impl_in_rule__QuotedAssertion__Group__01835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__1_in_rule__QuotedAssertion__Group__01838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__Group__1__Impl_in_rule__QuotedAssertion__Group__11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuotedAssertion__TextAssignment_1_in_rule__QuotedAssertion__Group__1__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__0__Impl_in_rule__Entailment__Group__01957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entailment__Group__1_in_rule__Entailment__Group__01960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__1__Impl_in_rule__Entailment__Group__12018 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Entailment__Group__2_in_rule__Entailment__Group__12021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__ConjunctionAssignment_1_in_rule__Entailment__Group__1__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__2__Impl_in_rule__Entailment__Group__22078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entailment__Group__3_in_rule__Entailment__Group__22081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entailment__Group__2__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__Group__3__Impl_in_rule__Entailment__Group__32140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entailment__IdAssignment_3_in_rule__Entailment__Group__3__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__0__Impl_in_rule__Conjunction__Group_0__02205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__1_in_rule__Conjunction__Group_0__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__1__Impl_in_rule__Conjunction__Group_0__12266 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__2_in_rule__Conjunction__Group_0__12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__LhsAssignment_0_1_in_rule__Conjunction__Group_0__1__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__2__Impl_in_rule__Conjunction__Group_0__22326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__3_in_rule__Conjunction__Group_0__22329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Conjunction__Group_0__2__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_0__3__Impl_in_rule__Conjunction__Group_0__32388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RhsAssignment_0_3_in_rule__Conjunction__Group_0__3__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__0__Impl_in_rule__ProofSteps__Group_0__02453 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__1_in_rule__ProofSteps__Group_0__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0__1__Impl_in_rule__ProofSteps__Group_0__12514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__0_in_rule__ProofSteps__Group_0__1__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__0__Impl_in_rule__ProofSteps__Group_0_1__02576 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__1_in_rule__ProofSteps__Group_0_1__02579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_0_in_rule__ProofSteps__Group_0_1__0__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__Group_0_1__1__Impl_in_rule__ProofSteps__Group_0_1__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProofSteps__StatementsAssignment_0_1_1_in_rule__ProofSteps__Group_0_1__1__Impl2663 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12759 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IdAssignment_1_in_rule__Statement__Group__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statement__Group__2__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_3_in_rule__Statement__Group__3__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42941 = new BitSet(new long[]{0x0000000000184030L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Statement__Group__4__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__53003 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Statement__Group__6_in_rule__Statement__Group__53006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__JustificationAssignment_5_in_rule__Statement__Group__5__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__6__Impl_in_rule__Statement__Group__63063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statement__Group__6__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Proof__TitleAssignment_23141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_rule__Proof__JustificationsAssignment_43172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProofSteps_in_rule__Proof__ProofStepsAssignment_63203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_0_1_03234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__Justifications__JustificationsAssignment_0_1_1_13265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Justifications__HypothesisAssignment_13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Justifications__EpsilonAssignment_23345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Justification__NumeralAssignment_0_13384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedAssertion_in_rule__Justification__AssertionAssignment_13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntailment_in_rule__Justification__EntailmentAssignment_23446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__QuotedAssertion__TextAssignment_13477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Entailment__ConjunctionAssignment_13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Entailment__IdAssignment_33539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_0_13570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Conjunction__RhsAssignment_0_33601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Conjunction__LhsAssignment_13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_03663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ProofSteps__StatementsAssignment_0_1_13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProofSteps__EpsilonAssignment_13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeral_in_rule__Statement__IdAssignment_13769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Statement__StatementAssignment_33800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifications_in_rule__Statement__JustificationAssignment_53831 = new BitSet(new long[]{0x0000000000000002L});

}