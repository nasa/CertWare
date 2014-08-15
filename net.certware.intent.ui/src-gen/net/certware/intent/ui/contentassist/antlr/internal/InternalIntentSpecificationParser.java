package net.certware.intent.ui.contentassist.antlr.internal; 

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
import net.certware.intent.services.IntentSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIntentSpecificationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'basic'", "'purpose'", "'principles'", "'models'", "'design'", "'implementation'", "'operation'", "'environment'", "'operator'", "'system'", "'verification'", "'condition'", "'figure'", "'break'", "'model'", "'paragraph'", "'section'", "'table'", "'output'", "'mode'", "'state'", "'macro'", "'function'", "'input'", "'requirement'", "'goal'", "'hazard'", "'constraint'", "'specification'", "'refinement'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalIntentSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIntentSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIntentSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g"; }


     
     	private IntentSpecificationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IntentSpecificationGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSpecification"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:60:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:61:1: ( ruleSpecification EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:62:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_ruleSpecification_in_entryRuleSpecification61);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecification68); 

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:69:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:73:2: ( ( ( rule__Specification__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:75:1: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:76:1: ( rule__Specification__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:76:2: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_rule__Specification__Group__0_in_ruleSpecification94);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleRefinement"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:88:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:89:1: ( ruleRefinement EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:90:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement121);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement128); 

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:97:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:101:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:102:1: ( ( rule__Refinement__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:102:1: ( ( rule__Refinement__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:103:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:104:1: ( rule__Refinement__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:104:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0_in_ruleRefinement154);
            rule__Refinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleIntent"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:116:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:117:1: ( ruleIntent EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:118:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent181);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent188); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:125:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:129:2: ( ( ( rule__Intent__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:130:1: ( ( rule__Intent__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:130:1: ( ( rule__Intent__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:131:1: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:132:1: ( rule__Intent__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:132:2: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_rule__Intent__Group__0_in_ruleIntent214);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleIntentType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:144:1: entryRuleIntentType : ruleIntentType EOF ;
    public final void entryRuleIntentType() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:145:1: ( ruleIntentType EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:146:1: ruleIntentType EOF
            {
             before(grammarAccess.getIntentTypeRule()); 
            pushFollow(FOLLOW_ruleIntentType_in_entryRuleIntentType241);
            ruleIntentType();

            state._fsp--;

             after(grammarAccess.getIntentTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentType248); 

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
    // $ANTLR end "entryRuleIntentType"


    // $ANTLR start "ruleIntentType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:153:1: ruleIntentType : ( ( rule__IntentType__TypeNameAssignment ) ) ;
    public final void ruleIntentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:157:2: ( ( ( rule__IntentType__TypeNameAssignment ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:158:1: ( ( rule__IntentType__TypeNameAssignment ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:158:1: ( ( rule__IntentType__TypeNameAssignment ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:159:1: ( rule__IntentType__TypeNameAssignment )
            {
             before(grammarAccess.getIntentTypeAccess().getTypeNameAssignment()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:160:1: ( rule__IntentType__TypeNameAssignment )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:160:2: rule__IntentType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__IntentType__TypeNameAssignment_in_ruleIntentType274);
            rule__IntentType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntentTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntentType"


    // $ANTLR start "entryRuleDecomposition"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:172:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:173:1: ( ruleDecomposition EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:174:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition301);
            ruleDecomposition();

            state._fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition308); 

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
    // $ANTLR end "entryRuleDecomposition"


    // $ANTLR start "ruleDecomposition"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:181:1: ruleDecomposition : ( ( rule__Decomposition__Group__0 ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:185:2: ( ( ( rule__Decomposition__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:186:1: ( ( rule__Decomposition__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:186:1: ( ( rule__Decomposition__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:187:1: ( rule__Decomposition__Group__0 )
            {
             before(grammarAccess.getDecompositionAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:188:1: ( rule__Decomposition__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:188:2: rule__Decomposition__Group__0
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__0_in_ruleDecomposition334);
            rule__Decomposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecomposition"


    // $ANTLR start "entryRuleDecompositionType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:200:1: entryRuleDecompositionType : ruleDecompositionType EOF ;
    public final void entryRuleDecompositionType() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:201:1: ( ruleDecompositionType EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:202:1: ruleDecompositionType EOF
            {
             before(grammarAccess.getDecompositionTypeRule()); 
            pushFollow(FOLLOW_ruleDecompositionType_in_entryRuleDecompositionType361);
            ruleDecompositionType();

            state._fsp--;

             after(grammarAccess.getDecompositionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionType368); 

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
    // $ANTLR end "entryRuleDecompositionType"


    // $ANTLR start "ruleDecompositionType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:209:1: ruleDecompositionType : ( ( rule__DecompositionType__TypeNameAssignment ) ) ;
    public final void ruleDecompositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:213:2: ( ( ( rule__DecompositionType__TypeNameAssignment ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:214:1: ( ( rule__DecompositionType__TypeNameAssignment ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:214:1: ( ( rule__DecompositionType__TypeNameAssignment ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:215:1: ( rule__DecompositionType__TypeNameAssignment )
            {
             before(grammarAccess.getDecompositionTypeAccess().getTypeNameAssignment()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:216:1: ( rule__DecompositionType__TypeNameAssignment )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:216:2: rule__DecompositionType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__DecompositionType__TypeNameAssignment_in_ruleDecompositionType394);
            rule__DecompositionType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecompositionType"


    // $ANTLR start "entryRuleDocument"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:228:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:229:1: ( ruleDocument EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:230:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument421);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument428); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:237:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:241:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:242:1: ( ( rule__Document__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:242:1: ( ( rule__Document__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:243:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:244:1: ( rule__Document__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:244:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument454);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDocItemType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:256:1: entryRuleDocItemType : ruleDocItemType EOF ;
    public final void entryRuleDocItemType() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:257:1: ( ruleDocItemType EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:258:1: ruleDocItemType EOF
            {
             before(grammarAccess.getDocItemTypeRule()); 
            pushFollow(FOLLOW_ruleDocItemType_in_entryRuleDocItemType481);
            ruleDocItemType();

            state._fsp--;

             after(grammarAccess.getDocItemTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocItemType488); 

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
    // $ANTLR end "entryRuleDocItemType"


    // $ANTLR start "ruleDocItemType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:265:1: ruleDocItemType : ( ( rule__DocItemType__TypeNameAssignment ) ) ;
    public final void ruleDocItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:269:2: ( ( ( rule__DocItemType__TypeNameAssignment ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:270:1: ( ( rule__DocItemType__TypeNameAssignment ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:270:1: ( ( rule__DocItemType__TypeNameAssignment ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:271:1: ( rule__DocItemType__TypeNameAssignment )
            {
             before(grammarAccess.getDocItemTypeAccess().getTypeNameAssignment()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:272:1: ( rule__DocItemType__TypeNameAssignment )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:272:2: rule__DocItemType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__DocItemType__TypeNameAssignment_in_ruleDocItemType514);
            rule__DocItemType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDocItemTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocItemType"


    // $ANTLR start "entryRuleDocItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:284:1: entryRuleDocItem : ruleDocItem EOF ;
    public final void entryRuleDocItem() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:285:1: ( ruleDocItem EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:286:1: ruleDocItem EOF
            {
             before(grammarAccess.getDocItemRule()); 
            pushFollow(FOLLOW_ruleDocItem_in_entryRuleDocItem541);
            ruleDocItem();

            state._fsp--;

             after(grammarAccess.getDocItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocItem548); 

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
    // $ANTLR end "entryRuleDocItem"


    // $ANTLR start "ruleDocItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:293:1: ruleDocItem : ( ( rule__DocItem__Group__0 ) ) ;
    public final void ruleDocItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:297:2: ( ( ( rule__DocItem__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:298:1: ( ( rule__DocItem__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:298:1: ( ( rule__DocItem__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:299:1: ( rule__DocItem__Group__0 )
            {
             before(grammarAccess.getDocItemAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:300:1: ( rule__DocItem__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:300:2: rule__DocItem__Group__0
            {
            pushFollow(FOLLOW_rule__DocItem__Group__0_in_ruleDocItem574);
            rule__DocItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocItem"


    // $ANTLR start "entryRuleModelType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:312:1: entryRuleModelType : ruleModelType EOF ;
    public final void entryRuleModelType() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:313:1: ( ruleModelType EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:314:1: ruleModelType EOF
            {
             before(grammarAccess.getModelTypeRule()); 
            pushFollow(FOLLOW_ruleModelType_in_entryRuleModelType601);
            ruleModelType();

            state._fsp--;

             after(grammarAccess.getModelTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelType608); 

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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:321:1: ruleModelType : ( ( rule__ModelType__TypeNameAssignment ) ) ;
    public final void ruleModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:325:2: ( ( ( rule__ModelType__TypeNameAssignment ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:326:1: ( ( rule__ModelType__TypeNameAssignment ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:326:1: ( ( rule__ModelType__TypeNameAssignment ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:327:1: ( rule__ModelType__TypeNameAssignment )
            {
             before(grammarAccess.getModelTypeAccess().getTypeNameAssignment()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:328:1: ( rule__ModelType__TypeNameAssignment )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:328:2: rule__ModelType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__ModelType__TypeNameAssignment_in_ruleModelType634);
            rule__ModelType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleModelItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:340:1: entryRuleModelItem : ruleModelItem EOF ;
    public final void entryRuleModelItem() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:341:1: ( ruleModelItem EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:342:1: ruleModelItem EOF
            {
             before(grammarAccess.getModelItemRule()); 
            pushFollow(FOLLOW_ruleModelItem_in_entryRuleModelItem661);
            ruleModelItem();

            state._fsp--;

             after(grammarAccess.getModelItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelItem668); 

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
    // $ANTLR end "entryRuleModelItem"


    // $ANTLR start "ruleModelItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:349:1: ruleModelItem : ( ( rule__ModelItem__Group__0 ) ) ;
    public final void ruleModelItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:353:2: ( ( ( rule__ModelItem__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:354:1: ( ( rule__ModelItem__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:354:1: ( ( rule__ModelItem__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:355:1: ( rule__ModelItem__Group__0 )
            {
             before(grammarAccess.getModelItemAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:356:1: ( rule__ModelItem__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:356:2: rule__ModelItem__Group__0
            {
            pushFollow(FOLLOW_rule__ModelItem__Group__0_in_ruleModelItem694);
            rule__ModelItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelItem"


    // $ANTLR start "entryRuleListItemType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:368:1: entryRuleListItemType : ruleListItemType EOF ;
    public final void entryRuleListItemType() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:369:1: ( ruleListItemType EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:370:1: ruleListItemType EOF
            {
             before(grammarAccess.getListItemTypeRule()); 
            pushFollow(FOLLOW_ruleListItemType_in_entryRuleListItemType721);
            ruleListItemType();

            state._fsp--;

             after(grammarAccess.getListItemTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListItemType728); 

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
    // $ANTLR end "entryRuleListItemType"


    // $ANTLR start "ruleListItemType"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:377:1: ruleListItemType : ( ( rule__ListItemType__TypeNameAssignment ) ) ;
    public final void ruleListItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:381:2: ( ( ( rule__ListItemType__TypeNameAssignment ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:382:1: ( ( rule__ListItemType__TypeNameAssignment ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:382:1: ( ( rule__ListItemType__TypeNameAssignment ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:383:1: ( rule__ListItemType__TypeNameAssignment )
            {
             before(grammarAccess.getListItemTypeAccess().getTypeNameAssignment()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:384:1: ( rule__ListItemType__TypeNameAssignment )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:384:2: rule__ListItemType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__ListItemType__TypeNameAssignment_in_ruleListItemType754);
            rule__ListItemType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListItemTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListItemType"


    // $ANTLR start "entryRuleListItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:396:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:397:1: ( ruleListItem EOF )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:398:1: ruleListItem EOF
            {
             before(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_ruleListItem_in_entryRuleListItem781);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListItem788); 

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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:405:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:409:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:410:1: ( ( rule__ListItem__Group__0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:410:1: ( ( rule__ListItem__Group__0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:411:1: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:412:1: ( rule__ListItem__Group__0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:412:2: rule__ListItem__Group__0
            {
            pushFollow(FOLLOW_rule__ListItem__Group__0_in_ruleListItem814);
            rule__ListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListItem"


    // $ANTLR start "rule__IntentType__TypeNameAlternatives_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:424:1: rule__IntentType__TypeNameAlternatives_0 : ( ( 'basic' ) | ( 'purpose' ) | ( 'principles' ) | ( 'models' ) | ( 'design' ) | ( 'implementation' ) | ( 'operation' ) );
    public final void rule__IntentType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:428:1: ( ( 'basic' ) | ( 'purpose' ) | ( 'principles' ) | ( 'models' ) | ( 'design' ) | ( 'implementation' ) | ( 'operation' ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:429:1: ( 'basic' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:429:1: ( 'basic' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:430:1: 'basic'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameBasicKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__IntentType__TypeNameAlternatives_0851); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameBasicKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:437:6: ( 'purpose' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:437:6: ( 'purpose' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:438:1: 'purpose'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNamePurposeKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__IntentType__TypeNameAlternatives_0871); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNamePurposeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:445:6: ( 'principles' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:445:6: ( 'principles' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:446:1: 'principles'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNamePrinciplesKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__IntentType__TypeNameAlternatives_0891); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNamePrinciplesKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:453:6: ( 'models' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:453:6: ( 'models' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:454:1: 'models'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameModelsKeyword_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__IntentType__TypeNameAlternatives_0911); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameModelsKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:461:6: ( 'design' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:461:6: ( 'design' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:462:1: 'design'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameDesignKeyword_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__IntentType__TypeNameAlternatives_0931); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameDesignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:469:6: ( 'implementation' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:469:6: ( 'implementation' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:470:1: 'implementation'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameImplementationKeyword_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__IntentType__TypeNameAlternatives_0951); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameImplementationKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:477:6: ( 'operation' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:477:6: ( 'operation' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:478:1: 'operation'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameOperationKeyword_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__IntentType__TypeNameAlternatives_0971); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameOperationKeyword_0_6()); 

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
    // $ANTLR end "rule__IntentType__TypeNameAlternatives_0"


    // $ANTLR start "rule__DecompositionType__TypeNameAlternatives_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:490:1: rule__DecompositionType__TypeNameAlternatives_0 : ( ( 'environment' ) | ( 'operator' ) | ( 'system' ) | ( 'verification' ) );
    public final void rule__DecompositionType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:494:1: ( ( 'environment' ) | ( 'operator' ) | ( 'system' ) | ( 'verification' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:495:1: ( 'environment' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:495:1: ( 'environment' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:496:1: 'environment'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameEnvironmentKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__DecompositionType__TypeNameAlternatives_01006); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameEnvironmentKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:503:6: ( 'operator' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:503:6: ( 'operator' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:504:1: 'operator'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameOperatorKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__DecompositionType__TypeNameAlternatives_01026); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameOperatorKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:511:6: ( 'system' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:511:6: ( 'system' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:512:1: 'system'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameSystemKeyword_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__DecompositionType__TypeNameAlternatives_01046); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameSystemKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:519:6: ( 'verification' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:519:6: ( 'verification' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:520:1: 'verification'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameVerificationKeyword_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__DecompositionType__TypeNameAlternatives_01066); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameVerificationKeyword_0_3()); 

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
    // $ANTLR end "rule__DecompositionType__TypeNameAlternatives_0"


    // $ANTLR start "rule__DocItemType__TypeNameAlternatives_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:532:1: rule__DocItemType__TypeNameAlternatives_0 : ( ( 'condition' ) | ( 'figure' ) | ( 'break' ) | ( 'model' ) | ( 'paragraph' ) | ( 'section' ) | ( 'table' ) );
    public final void rule__DocItemType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:536:1: ( ( 'condition' ) | ( 'figure' ) | ( 'break' ) | ( 'model' ) | ( 'paragraph' ) | ( 'section' ) | ( 'table' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 27:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:537:1: ( 'condition' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:537:1: ( 'condition' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:538:1: 'condition'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameConditionKeyword_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__DocItemType__TypeNameAlternatives_01101); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameConditionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:545:6: ( 'figure' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:545:6: ( 'figure' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:546:1: 'figure'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameFigureKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__DocItemType__TypeNameAlternatives_01121); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameFigureKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:553:6: ( 'break' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:553:6: ( 'break' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:554:1: 'break'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameBreakKeyword_0_2()); 
                    match(input,24,FOLLOW_24_in_rule__DocItemType__TypeNameAlternatives_01141); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameBreakKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:561:6: ( 'model' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:561:6: ( 'model' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:562:1: 'model'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameModelKeyword_0_3()); 
                    match(input,25,FOLLOW_25_in_rule__DocItemType__TypeNameAlternatives_01161); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameModelKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:569:6: ( 'paragraph' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:569:6: ( 'paragraph' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:570:1: 'paragraph'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameParagraphKeyword_0_4()); 
                    match(input,26,FOLLOW_26_in_rule__DocItemType__TypeNameAlternatives_01181); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameParagraphKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:577:6: ( 'section' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:577:6: ( 'section' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:578:1: 'section'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameSectionKeyword_0_5()); 
                    match(input,27,FOLLOW_27_in_rule__DocItemType__TypeNameAlternatives_01201); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameSectionKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:585:6: ( 'table' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:585:6: ( 'table' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:586:1: 'table'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameTableKeyword_0_6()); 
                    match(input,28,FOLLOW_28_in_rule__DocItemType__TypeNameAlternatives_01221); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameTableKeyword_0_6()); 

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
    // $ANTLR end "rule__DocItemType__TypeNameAlternatives_0"


    // $ANTLR start "rule__ModelType__TypeNameAlternatives_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:598:1: rule__ModelType__TypeNameAlternatives_0 : ( ( 'output' ) | ( 'mode' ) | ( 'state' ) | ( 'macro' ) | ( 'function' ) | ( 'input' ) );
    public final void rule__ModelType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:602:1: ( ( 'output' ) | ( 'mode' ) | ( 'state' ) | ( 'macro' ) | ( 'function' ) | ( 'input' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 33:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:603:1: ( 'output' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:603:1: ( 'output' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:604:1: 'output'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameOutputKeyword_0_0()); 
                    match(input,29,FOLLOW_29_in_rule__ModelType__TypeNameAlternatives_01256); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameOutputKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:611:6: ( 'mode' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:611:6: ( 'mode' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:612:1: 'mode'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameModeKeyword_0_1()); 
                    match(input,30,FOLLOW_30_in_rule__ModelType__TypeNameAlternatives_01276); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameModeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:619:6: ( 'state' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:619:6: ( 'state' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:620:1: 'state'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameStateKeyword_0_2()); 
                    match(input,31,FOLLOW_31_in_rule__ModelType__TypeNameAlternatives_01296); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameStateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:627:6: ( 'macro' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:627:6: ( 'macro' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:628:1: 'macro'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameMacroKeyword_0_3()); 
                    match(input,32,FOLLOW_32_in_rule__ModelType__TypeNameAlternatives_01316); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameMacroKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:635:6: ( 'function' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:635:6: ( 'function' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:636:1: 'function'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameFunctionKeyword_0_4()); 
                    match(input,33,FOLLOW_33_in_rule__ModelType__TypeNameAlternatives_01336); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameFunctionKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:643:6: ( 'input' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:643:6: ( 'input' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:644:1: 'input'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameInputKeyword_0_5()); 
                    match(input,34,FOLLOW_34_in_rule__ModelType__TypeNameAlternatives_01356); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameInputKeyword_0_5()); 

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
    // $ANTLR end "rule__ModelType__TypeNameAlternatives_0"


    // $ANTLR start "rule__ListItemType__TypeNameAlternatives_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:656:1: rule__ListItemType__TypeNameAlternatives_0 : ( ( 'requirement' ) | ( 'goal' ) | ( 'hazard' ) | ( 'constraint' ) );
    public final void rule__ListItemType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:660:1: ( ( 'requirement' ) | ( 'goal' ) | ( 'hazard' ) | ( 'constraint' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:661:1: ( 'requirement' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:661:1: ( 'requirement' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:662:1: 'requirement'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameRequirementKeyword_0_0()); 
                    match(input,35,FOLLOW_35_in_rule__ListItemType__TypeNameAlternatives_01391); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameRequirementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:669:6: ( 'goal' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:669:6: ( 'goal' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:670:1: 'goal'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameGoalKeyword_0_1()); 
                    match(input,36,FOLLOW_36_in_rule__ListItemType__TypeNameAlternatives_01411); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameGoalKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:677:6: ( 'hazard' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:677:6: ( 'hazard' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:678:1: 'hazard'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameHazardKeyword_0_2()); 
                    match(input,37,FOLLOW_37_in_rule__ListItemType__TypeNameAlternatives_01431); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameHazardKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:685:6: ( 'constraint' )
                    {
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:685:6: ( 'constraint' )
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:686:1: 'constraint'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameConstraintKeyword_0_3()); 
                    match(input,38,FOLLOW_38_in_rule__ListItemType__TypeNameAlternatives_01451); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameConstraintKeyword_0_3()); 

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
    // $ANTLR end "rule__ListItemType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Specification__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:700:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:704:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:705:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_rule__Specification__Group__0__Impl_in_rule__Specification__Group__01483);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specification__Group__1_in_rule__Specification__Group__01486);
            rule__Specification__Group__1();

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
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:712:1: rule__Specification__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:716:1: ( ( 'specification' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:717:1: ( 'specification' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:717:1: ( 'specification' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:718:1: 'specification'
            {
             before(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Specification__Group__0__Impl1514); 
             after(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:731:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:735:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:736:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_rule__Specification__Group__1__Impl_in_rule__Specification__Group__11545);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specification__Group__2_in_rule__Specification__Group__11548);
            rule__Specification__Group__2();

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
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:743:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__NameAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:747:1: ( ( ( rule__Specification__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:748:1: ( ( rule__Specification__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:748:1: ( ( rule__Specification__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:749:1: ( rule__Specification__NameAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:750:1: ( rule__Specification__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:750:2: rule__Specification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Specification__NameAssignment_1_in_rule__Specification__Group__1__Impl1575);
            rule__Specification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:760:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:764:1: ( rule__Specification__Group__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:765:2: rule__Specification__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Specification__Group__2__Impl_in_rule__Specification__Group__21605);
            rule__Specification__Group__2__Impl();

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
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:771:1: rule__Specification__Group__2__Impl : ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:775:1: ( ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:776:1: ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:776:1: ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:777:1: ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:777:1: ( ( rule__Specification__RefinementsAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:778:1: ( rule__Specification__RefinementsAssignment_2 )
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:779:1: ( rule__Specification__RefinementsAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:779:2: rule__Specification__RefinementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Specification__RefinementsAssignment_2_in_rule__Specification__Group__2__Impl1634);
            rule__Specification__RefinementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:782:1: ( ( rule__Specification__RefinementsAssignment_2 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:783:1: ( rule__Specification__RefinementsAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:784:1: ( rule__Specification__RefinementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:784:2: rule__Specification__RefinementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Specification__RefinementsAssignment_2_in_rule__Specification__Group__2__Impl1646);
            	    rule__Specification__RefinementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Refinement__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:801:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:805:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:806:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__01685);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__01688);
            rule__Refinement__Group__1();

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
    // $ANTLR end "rule__Refinement__Group__0"


    // $ANTLR start "rule__Refinement__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:813:1: rule__Refinement__Group__0__Impl : ( 'refinement' ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:817:1: ( ( 'refinement' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:818:1: ( 'refinement' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:818:1: ( 'refinement' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:819:1: 'refinement'
            {
             before(grammarAccess.getRefinementAccess().getRefinementKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Refinement__Group__0__Impl1716); 
             after(grammarAccess.getRefinementAccess().getRefinementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__0__Impl"


    // $ANTLR start "rule__Refinement__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:832:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl rule__Refinement__Group__2 ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:836:1: ( rule__Refinement__Group__1__Impl rule__Refinement__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:837:2: rule__Refinement__Group__1__Impl rule__Refinement__Group__2
            {
            pushFollow(FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__11747);
            rule__Refinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__2_in_rule__Refinement__Group__11750);
            rule__Refinement__Group__2();

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
    // $ANTLR end "rule__Refinement__Group__1"


    // $ANTLR start "rule__Refinement__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:844:1: rule__Refinement__Group__1__Impl : ( ( rule__Refinement__NameAssignment_1 ) ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:848:1: ( ( ( rule__Refinement__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:849:1: ( ( rule__Refinement__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:849:1: ( ( rule__Refinement__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:850:1: ( rule__Refinement__NameAssignment_1 )
            {
             before(grammarAccess.getRefinementAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:851:1: ( rule__Refinement__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:851:2: rule__Refinement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Refinement__NameAssignment_1_in_rule__Refinement__Group__1__Impl1777);
            rule__Refinement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__1__Impl"


    // $ANTLR start "rule__Refinement__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:861:1: rule__Refinement__Group__2 : rule__Refinement__Group__2__Impl rule__Refinement__Group__3 ;
    public final void rule__Refinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:865:1: ( rule__Refinement__Group__2__Impl rule__Refinement__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:866:2: rule__Refinement__Group__2__Impl rule__Refinement__Group__3
            {
            pushFollow(FOLLOW_rule__Refinement__Group__2__Impl_in_rule__Refinement__Group__21807);
            rule__Refinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refinement__Group__3_in_rule__Refinement__Group__21810);
            rule__Refinement__Group__3();

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
    // $ANTLR end "rule__Refinement__Group__2"


    // $ANTLR start "rule__Refinement__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:873:1: rule__Refinement__Group__2__Impl : ( ( rule__Refinement__DescAssignment_2 ) ) ;
    public final void rule__Refinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:877:1: ( ( ( rule__Refinement__DescAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:878:1: ( ( rule__Refinement__DescAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:878:1: ( ( rule__Refinement__DescAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:879:1: ( rule__Refinement__DescAssignment_2 )
            {
             before(grammarAccess.getRefinementAccess().getDescAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:880:1: ( rule__Refinement__DescAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:880:2: rule__Refinement__DescAssignment_2
            {
            pushFollow(FOLLOW_rule__Refinement__DescAssignment_2_in_rule__Refinement__Group__2__Impl1837);
            rule__Refinement__DescAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getDescAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__2__Impl"


    // $ANTLR start "rule__Refinement__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:890:1: rule__Refinement__Group__3 : rule__Refinement__Group__3__Impl ;
    public final void rule__Refinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:894:1: ( rule__Refinement__Group__3__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:895:2: rule__Refinement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Refinement__Group__3__Impl_in_rule__Refinement__Group__31867);
            rule__Refinement__Group__3__Impl();

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
    // $ANTLR end "rule__Refinement__Group__3"


    // $ANTLR start "rule__Refinement__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:901:1: rule__Refinement__Group__3__Impl : ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) ) ;
    public final void rule__Refinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:905:1: ( ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:906:1: ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:906:1: ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:907:1: ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:907:1: ( ( rule__Refinement__IntentsAssignment_3 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:908:1: ( rule__Refinement__IntentsAssignment_3 )
            {
             before(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:909:1: ( rule__Refinement__IntentsAssignment_3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:909:2: rule__Refinement__IntentsAssignment_3
            {
            pushFollow(FOLLOW_rule__Refinement__IntentsAssignment_3_in_rule__Refinement__Group__3__Impl1896);
            rule__Refinement__IntentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:912:1: ( ( rule__Refinement__IntentsAssignment_3 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:913:1: ( rule__Refinement__IntentsAssignment_3 )*
            {
             before(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:914:1: ( rule__Refinement__IntentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:914:2: rule__Refinement__IntentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Refinement__IntentsAssignment_3_in_rule__Refinement__Group__3__Impl1908);
            	    rule__Refinement__IntentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:933:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:937:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:938:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01949);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01952);
            rule__Intent__Group__1();

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
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:945:1: rule__Intent__Group__0__Impl : ( ( rule__Intent__TypeAssignment_0 ) ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:949:1: ( ( ( rule__Intent__TypeAssignment_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:950:1: ( ( rule__Intent__TypeAssignment_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:950:1: ( ( rule__Intent__TypeAssignment_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:951:1: ( rule__Intent__TypeAssignment_0 )
            {
             before(grammarAccess.getIntentAccess().getTypeAssignment_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:952:1: ( rule__Intent__TypeAssignment_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:952:2: rule__Intent__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Intent__TypeAssignment_0_in_rule__Intent__Group__0__Impl1979);
            rule__Intent__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:962:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:966:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:967:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__12009);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__12012);
            rule__Intent__Group__2();

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
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:974:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:978:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:979:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:979:1: ( ( rule__Intent__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:980:1: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:981:1: ( rule__Intent__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:981:2: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Intent__NameAssignment_1_in_rule__Intent__Group__1__Impl2039);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:991:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:995:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:996:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__22069);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__22072);
            rule__Intent__Group__3();

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
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1003:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__DescAssignment_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1007:1: ( ( ( rule__Intent__DescAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1008:1: ( ( rule__Intent__DescAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1008:1: ( ( rule__Intent__DescAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1009:1: ( rule__Intent__DescAssignment_2 )
            {
             before(grammarAccess.getIntentAccess().getDescAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1010:1: ( rule__Intent__DescAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1010:2: rule__Intent__DescAssignment_2
            {
            pushFollow(FOLLOW_rule__Intent__DescAssignment_2_in_rule__Intent__Group__2__Impl2099);
            rule__Intent__DescAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getDescAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1020:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1024:1: ( rule__Intent__Group__3__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1025:2: rule__Intent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__32129);
            rule__Intent__Group__3__Impl();

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
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1031:1: rule__Intent__Group__3__Impl : ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1035:1: ( ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1036:1: ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1036:1: ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1037:1: ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1037:1: ( ( rule__Intent__DecompositionsAssignment_3 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1038:1: ( rule__Intent__DecompositionsAssignment_3 )
            {
             before(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1039:1: ( rule__Intent__DecompositionsAssignment_3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1039:2: rule__Intent__DecompositionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Intent__DecompositionsAssignment_3_in_rule__Intent__Group__3__Impl2158);
            rule__Intent__DecompositionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1042:1: ( ( rule__Intent__DecompositionsAssignment_3 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1043:1: ( rule__Intent__DecompositionsAssignment_3 )*
            {
             before(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1044:1: ( rule__Intent__DecompositionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1044:2: rule__Intent__DecompositionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Intent__DecompositionsAssignment_3_in_rule__Intent__Group__3__Impl2170);
            	    rule__Intent__DecompositionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Decomposition__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1063:1: rule__Decomposition__Group__0 : rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1 ;
    public final void rule__Decomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1067:1: ( rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1068:2: rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__0__Impl_in_rule__Decomposition__Group__02211);
            rule__Decomposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group__1_in_rule__Decomposition__Group__02214);
            rule__Decomposition__Group__1();

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
    // $ANTLR end "rule__Decomposition__Group__0"


    // $ANTLR start "rule__Decomposition__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1075:1: rule__Decomposition__Group__0__Impl : ( ( rule__Decomposition__TypeAssignment_0 ) ) ;
    public final void rule__Decomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1079:1: ( ( ( rule__Decomposition__TypeAssignment_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1080:1: ( ( rule__Decomposition__TypeAssignment_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1080:1: ( ( rule__Decomposition__TypeAssignment_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1081:1: ( rule__Decomposition__TypeAssignment_0 )
            {
             before(grammarAccess.getDecompositionAccess().getTypeAssignment_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1082:1: ( rule__Decomposition__TypeAssignment_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1082:2: rule__Decomposition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decomposition__TypeAssignment_0_in_rule__Decomposition__Group__0__Impl2241);
            rule__Decomposition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__0__Impl"


    // $ANTLR start "rule__Decomposition__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1092:1: rule__Decomposition__Group__1 : rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2 ;
    public final void rule__Decomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1096:1: ( rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1097:2: rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__1__Impl_in_rule__Decomposition__Group__12271);
            rule__Decomposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group__2_in_rule__Decomposition__Group__12274);
            rule__Decomposition__Group__2();

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
    // $ANTLR end "rule__Decomposition__Group__1"


    // $ANTLR start "rule__Decomposition__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1104:1: rule__Decomposition__Group__1__Impl : ( ( rule__Decomposition__NameAssignment_1 ) ) ;
    public final void rule__Decomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1108:1: ( ( ( rule__Decomposition__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1109:1: ( ( rule__Decomposition__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1109:1: ( ( rule__Decomposition__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1110:1: ( rule__Decomposition__NameAssignment_1 )
            {
             before(grammarAccess.getDecompositionAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1111:1: ( rule__Decomposition__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1111:2: rule__Decomposition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decomposition__NameAssignment_1_in_rule__Decomposition__Group__1__Impl2301);
            rule__Decomposition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__1__Impl"


    // $ANTLR start "rule__Decomposition__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1121:1: rule__Decomposition__Group__2 : rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3 ;
    public final void rule__Decomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1125:1: ( rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1126:2: rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__2__Impl_in_rule__Decomposition__Group__22331);
            rule__Decomposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group__3_in_rule__Decomposition__Group__22334);
            rule__Decomposition__Group__3();

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
    // $ANTLR end "rule__Decomposition__Group__2"


    // $ANTLR start "rule__Decomposition__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1133:1: rule__Decomposition__Group__2__Impl : ( ( rule__Decomposition__DescAssignment_2 ) ) ;
    public final void rule__Decomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1137:1: ( ( ( rule__Decomposition__DescAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1138:1: ( ( rule__Decomposition__DescAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1138:1: ( ( rule__Decomposition__DescAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1139:1: ( rule__Decomposition__DescAssignment_2 )
            {
             before(grammarAccess.getDecompositionAccess().getDescAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1140:1: ( rule__Decomposition__DescAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1140:2: rule__Decomposition__DescAssignment_2
            {
            pushFollow(FOLLOW_rule__Decomposition__DescAssignment_2_in_rule__Decomposition__Group__2__Impl2361);
            rule__Decomposition__DescAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getDescAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__2__Impl"


    // $ANTLR start "rule__Decomposition__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1150:1: rule__Decomposition__Group__3 : rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4 ;
    public final void rule__Decomposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1154:1: ( rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1155:2: rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__3__Impl_in_rule__Decomposition__Group__32391);
            rule__Decomposition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group__4_in_rule__Decomposition__Group__32394);
            rule__Decomposition__Group__4();

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
    // $ANTLR end "rule__Decomposition__Group__3"


    // $ANTLR start "rule__Decomposition__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1162:1: rule__Decomposition__Group__3__Impl : ( ( rule__Decomposition__Group_3__0 )? ) ;
    public final void rule__Decomposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1166:1: ( ( ( rule__Decomposition__Group_3__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1167:1: ( ( rule__Decomposition__Group_3__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1167:1: ( ( rule__Decomposition__Group_3__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1168:1: ( rule__Decomposition__Group_3__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1169:1: ( rule__Decomposition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1169:2: rule__Decomposition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Decomposition__Group_3__0_in_rule__Decomposition__Group__3__Impl2421);
                    rule__Decomposition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecompositionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__3__Impl"


    // $ANTLR start "rule__Decomposition__Group__4"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1179:1: rule__Decomposition__Group__4 : rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5 ;
    public final void rule__Decomposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1183:1: ( rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1184:2: rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__4__Impl_in_rule__Decomposition__Group__42452);
            rule__Decomposition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group__5_in_rule__Decomposition__Group__42455);
            rule__Decomposition__Group__5();

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
    // $ANTLR end "rule__Decomposition__Group__4"


    // $ANTLR start "rule__Decomposition__Group__4__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1191:1: rule__Decomposition__Group__4__Impl : ( ( rule__Decomposition__Group_4__0 )? ) ;
    public final void rule__Decomposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1195:1: ( ( ( rule__Decomposition__Group_4__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1196:1: ( ( rule__Decomposition__Group_4__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1196:1: ( ( rule__Decomposition__Group_4__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1197:1: ( rule__Decomposition__Group_4__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_4()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1198:1: ( rule__Decomposition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1198:2: rule__Decomposition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Decomposition__Group_4__0_in_rule__Decomposition__Group__4__Impl2482);
                    rule__Decomposition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecompositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__4__Impl"


    // $ANTLR start "rule__Decomposition__Group__5"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1208:1: rule__Decomposition__Group__5 : rule__Decomposition__Group__5__Impl ;
    public final void rule__Decomposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1212:1: ( rule__Decomposition__Group__5__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1213:2: rule__Decomposition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Decomposition__Group__5__Impl_in_rule__Decomposition__Group__52513);
            rule__Decomposition__Group__5__Impl();

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
    // $ANTLR end "rule__Decomposition__Group__5"


    // $ANTLR start "rule__Decomposition__Group__5__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1219:1: rule__Decomposition__Group__5__Impl : ( ( rule__Decomposition__Group_5__0 )? ) ;
    public final void rule__Decomposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1223:1: ( ( ( rule__Decomposition__Group_5__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1224:1: ( ( rule__Decomposition__Group_5__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1224:1: ( ( rule__Decomposition__Group_5__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1225:1: ( rule__Decomposition__Group_5__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_5()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1226:1: ( rule__Decomposition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1226:2: rule__Decomposition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Decomposition__Group_5__0_in_rule__Decomposition__Group__5__Impl2540);
                    rule__Decomposition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecompositionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group__5__Impl"


    // $ANTLR start "rule__Decomposition__Group_3__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1248:1: rule__Decomposition__Group_3__0 : rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1 ;
    public final void rule__Decomposition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1252:1: ( rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1253:2: rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_3__0__Impl_in_rule__Decomposition__Group_3__02583);
            rule__Decomposition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_3__1_in_rule__Decomposition__Group_3__02586);
            rule__Decomposition__Group_3__1();

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
    // $ANTLR end "rule__Decomposition__Group_3__0"


    // $ANTLR start "rule__Decomposition__Group_3__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1260:1: rule__Decomposition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Decomposition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1264:1: ( ( '{' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1265:1: ( '{' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1265:1: ( '{' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1266:1: '{'
            {
             before(grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__Decomposition__Group_3__0__Impl2614); 
             after(grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_3__0__Impl"


    // $ANTLR start "rule__Decomposition__Group_3__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1279:1: rule__Decomposition__Group_3__1 : rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2 ;
    public final void rule__Decomposition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1283:1: ( rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1284:2: rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_3__1__Impl_in_rule__Decomposition__Group_3__12645);
            rule__Decomposition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_3__2_in_rule__Decomposition__Group_3__12648);
            rule__Decomposition__Group_3__2();

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
    // $ANTLR end "rule__Decomposition__Group_3__1"


    // $ANTLR start "rule__Decomposition__Group_3__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1291:1: rule__Decomposition__Group_3__1__Impl : ( ( rule__Decomposition__DocumentsAssignment_3_1 )* ) ;
    public final void rule__Decomposition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1295:1: ( ( ( rule__Decomposition__DocumentsAssignment_3_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1296:1: ( ( rule__Decomposition__DocumentsAssignment_3_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1296:1: ( ( rule__Decomposition__DocumentsAssignment_3_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1297:1: ( rule__Decomposition__DocumentsAssignment_3_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getDocumentsAssignment_3_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1298:1: ( rule__Decomposition__DocumentsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1298:2: rule__Decomposition__DocumentsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Decomposition__DocumentsAssignment_3_1_in_rule__Decomposition__Group_3__1__Impl2675);
            	    rule__Decomposition__DocumentsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDecompositionAccess().getDocumentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_3__1__Impl"


    // $ANTLR start "rule__Decomposition__Group_3__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1308:1: rule__Decomposition__Group_3__2 : rule__Decomposition__Group_3__2__Impl ;
    public final void rule__Decomposition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1312:1: ( rule__Decomposition__Group_3__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1313:2: rule__Decomposition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_3__2__Impl_in_rule__Decomposition__Group_3__22706);
            rule__Decomposition__Group_3__2__Impl();

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
    // $ANTLR end "rule__Decomposition__Group_3__2"


    // $ANTLR start "rule__Decomposition__Group_3__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1319:1: rule__Decomposition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Decomposition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1323:1: ( ( '}' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1324:1: ( '}' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1324:1: ( '}' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1325:1: '}'
            {
             before(grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_42_in_rule__Decomposition__Group_3__2__Impl2734); 
             after(grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_3__2__Impl"


    // $ANTLR start "rule__Decomposition__Group_4__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1344:1: rule__Decomposition__Group_4__0 : rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1 ;
    public final void rule__Decomposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1348:1: ( rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1349:2: rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_4__0__Impl_in_rule__Decomposition__Group_4__02771);
            rule__Decomposition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_4__1_in_rule__Decomposition__Group_4__02774);
            rule__Decomposition__Group_4__1();

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
    // $ANTLR end "rule__Decomposition__Group_4__0"


    // $ANTLR start "rule__Decomposition__Group_4__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1356:1: rule__Decomposition__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Decomposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1360:1: ( ( '[' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1361:1: ( '[' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1361:1: ( '[' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1362:1: '['
            {
             before(grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_43_in_rule__Decomposition__Group_4__0__Impl2802); 
             after(grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_4__0__Impl"


    // $ANTLR start "rule__Decomposition__Group_4__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1375:1: rule__Decomposition__Group_4__1 : rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2 ;
    public final void rule__Decomposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1379:1: ( rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1380:2: rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_4__1__Impl_in_rule__Decomposition__Group_4__12833);
            rule__Decomposition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_4__2_in_rule__Decomposition__Group_4__12836);
            rule__Decomposition__Group_4__2();

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
    // $ANTLR end "rule__Decomposition__Group_4__1"


    // $ANTLR start "rule__Decomposition__Group_4__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1387:1: rule__Decomposition__Group_4__1__Impl : ( ( rule__Decomposition__ModelsAssignment_4_1 )* ) ;
    public final void rule__Decomposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1391:1: ( ( ( rule__Decomposition__ModelsAssignment_4_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1392:1: ( ( rule__Decomposition__ModelsAssignment_4_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1392:1: ( ( rule__Decomposition__ModelsAssignment_4_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1393:1: ( rule__Decomposition__ModelsAssignment_4_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getModelsAssignment_4_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1394:1: ( rule__Decomposition__ModelsAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1394:2: rule__Decomposition__ModelsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Decomposition__ModelsAssignment_4_1_in_rule__Decomposition__Group_4__1__Impl2863);
            	    rule__Decomposition__ModelsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDecompositionAccess().getModelsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_4__1__Impl"


    // $ANTLR start "rule__Decomposition__Group_4__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1404:1: rule__Decomposition__Group_4__2 : rule__Decomposition__Group_4__2__Impl ;
    public final void rule__Decomposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1408:1: ( rule__Decomposition__Group_4__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1409:2: rule__Decomposition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_4__2__Impl_in_rule__Decomposition__Group_4__22894);
            rule__Decomposition__Group_4__2__Impl();

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
    // $ANTLR end "rule__Decomposition__Group_4__2"


    // $ANTLR start "rule__Decomposition__Group_4__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1415:1: rule__Decomposition__Group_4__2__Impl : ( ']' ) ;
    public final void rule__Decomposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1419:1: ( ( ']' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1420:1: ( ']' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1420:1: ( ']' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1421:1: ']'
            {
             before(grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__Decomposition__Group_4__2__Impl2922); 
             after(grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_4__2__Impl"


    // $ANTLR start "rule__Decomposition__Group_5__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1440:1: rule__Decomposition__Group_5__0 : rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1 ;
    public final void rule__Decomposition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1444:1: ( rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1445:2: rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_5__0__Impl_in_rule__Decomposition__Group_5__02959);
            rule__Decomposition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_5__1_in_rule__Decomposition__Group_5__02962);
            rule__Decomposition__Group_5__1();

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
    // $ANTLR end "rule__Decomposition__Group_5__0"


    // $ANTLR start "rule__Decomposition__Group_5__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1452:1: rule__Decomposition__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Decomposition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1456:1: ( ( '(' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1457:1: ( '(' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1457:1: ( '(' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1458:1: '('
            {
             before(grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,45,FOLLOW_45_in_rule__Decomposition__Group_5__0__Impl2990); 
             after(grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_5__0__Impl"


    // $ANTLR start "rule__Decomposition__Group_5__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1471:1: rule__Decomposition__Group_5__1 : rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2 ;
    public final void rule__Decomposition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1475:1: ( rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1476:2: rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_5__1__Impl_in_rule__Decomposition__Group_5__13021);
            rule__Decomposition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decomposition__Group_5__2_in_rule__Decomposition__Group_5__13024);
            rule__Decomposition__Group_5__2();

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
    // $ANTLR end "rule__Decomposition__Group_5__1"


    // $ANTLR start "rule__Decomposition__Group_5__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1483:1: rule__Decomposition__Group_5__1__Impl : ( ( rule__Decomposition__ItemsAssignment_5_1 )* ) ;
    public final void rule__Decomposition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1487:1: ( ( ( rule__Decomposition__ItemsAssignment_5_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1488:1: ( ( rule__Decomposition__ItemsAssignment_5_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1488:1: ( ( rule__Decomposition__ItemsAssignment_5_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1489:1: ( rule__Decomposition__ItemsAssignment_5_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getItemsAssignment_5_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1490:1: ( rule__Decomposition__ItemsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1490:2: rule__Decomposition__ItemsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Decomposition__ItemsAssignment_5_1_in_rule__Decomposition__Group_5__1__Impl3051);
            	    rule__Decomposition__ItemsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDecompositionAccess().getItemsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_5__1__Impl"


    // $ANTLR start "rule__Decomposition__Group_5__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1500:1: rule__Decomposition__Group_5__2 : rule__Decomposition__Group_5__2__Impl ;
    public final void rule__Decomposition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1504:1: ( rule__Decomposition__Group_5__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1505:2: rule__Decomposition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Decomposition__Group_5__2__Impl_in_rule__Decomposition__Group_5__23082);
            rule__Decomposition__Group_5__2__Impl();

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
    // $ANTLR end "rule__Decomposition__Group_5__2"


    // $ANTLR start "rule__Decomposition__Group_5__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1511:1: rule__Decomposition__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Decomposition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1515:1: ( ( ')' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1516:1: ( ')' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1516:1: ( ')' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1517:1: ')'
            {
             before(grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,46,FOLLOW_46_in_rule__Decomposition__Group_5__2__Impl3110); 
             after(grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__Group_5__2__Impl"


    // $ANTLR start "rule__Document__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1536:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1540:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1541:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03147);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03150);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1548:1: rule__Document__Group__0__Impl : ( '{' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1552:1: ( ( '{' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1553:1: ( '{' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1553:1: ( '{' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1554:1: '{'
            {
             before(grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Document__Group__0__Impl3178); 
             after(grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1567:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1571:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1572:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13209);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13212);
            rule__Document__Group__2();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1579:1: rule__Document__Group__1__Impl : ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1583:1: ( ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1584:1: ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1584:1: ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1585:1: ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1585:1: ( ( rule__Document__EntriesAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1586:1: ( rule__Document__EntriesAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1587:1: ( rule__Document__EntriesAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1587:2: rule__Document__EntriesAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__EntriesAssignment_1_in_rule__Document__Group__1__Impl3241);
            rule__Document__EntriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1590:1: ( ( rule__Document__EntriesAssignment_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1591:1: ( rule__Document__EntriesAssignment_1 )*
            {
             before(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1592:1: ( rule__Document__EntriesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=22 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1592:2: rule__Document__EntriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Document__EntriesAssignment_1_in_rule__Document__Group__1__Impl3253);
            	    rule__Document__EntriesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1603:1: rule__Document__Group__2 : rule__Document__Group__2__Impl ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1607:1: ( rule__Document__Group__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1608:2: rule__Document__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23286);
            rule__Document__Group__2__Impl();

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
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1614:1: rule__Document__Group__2__Impl : ( '}' ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1618:1: ( ( '}' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1619:1: ( '}' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1619:1: ( '}' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1620:1: '}'
            {
             before(grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Document__Group__2__Impl3314); 
             after(grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__DocItem__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1639:1: rule__DocItem__Group__0 : rule__DocItem__Group__0__Impl rule__DocItem__Group__1 ;
    public final void rule__DocItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1643:1: ( rule__DocItem__Group__0__Impl rule__DocItem__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1644:2: rule__DocItem__Group__0__Impl rule__DocItem__Group__1
            {
            pushFollow(FOLLOW_rule__DocItem__Group__0__Impl_in_rule__DocItem__Group__03351);
            rule__DocItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocItem__Group__1_in_rule__DocItem__Group__03354);
            rule__DocItem__Group__1();

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
    // $ANTLR end "rule__DocItem__Group__0"


    // $ANTLR start "rule__DocItem__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1651:1: rule__DocItem__Group__0__Impl : ( ( rule__DocItem__TypeAssignment_0 ) ) ;
    public final void rule__DocItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1655:1: ( ( ( rule__DocItem__TypeAssignment_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1656:1: ( ( rule__DocItem__TypeAssignment_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1656:1: ( ( rule__DocItem__TypeAssignment_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1657:1: ( rule__DocItem__TypeAssignment_0 )
            {
             before(grammarAccess.getDocItemAccess().getTypeAssignment_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1658:1: ( rule__DocItem__TypeAssignment_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1658:2: rule__DocItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__DocItem__TypeAssignment_0_in_rule__DocItem__Group__0__Impl3381);
            rule__DocItem__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocItemAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__Group__0__Impl"


    // $ANTLR start "rule__DocItem__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1668:1: rule__DocItem__Group__1 : rule__DocItem__Group__1__Impl rule__DocItem__Group__2 ;
    public final void rule__DocItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1672:1: ( rule__DocItem__Group__1__Impl rule__DocItem__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1673:2: rule__DocItem__Group__1__Impl rule__DocItem__Group__2
            {
            pushFollow(FOLLOW_rule__DocItem__Group__1__Impl_in_rule__DocItem__Group__13411);
            rule__DocItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocItem__Group__2_in_rule__DocItem__Group__13414);
            rule__DocItem__Group__2();

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
    // $ANTLR end "rule__DocItem__Group__1"


    // $ANTLR start "rule__DocItem__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1680:1: rule__DocItem__Group__1__Impl : ( ( rule__DocItem__NameAssignment_1 ) ) ;
    public final void rule__DocItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1684:1: ( ( ( rule__DocItem__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1685:1: ( ( rule__DocItem__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1685:1: ( ( rule__DocItem__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1686:1: ( rule__DocItem__NameAssignment_1 )
            {
             before(grammarAccess.getDocItemAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1687:1: ( rule__DocItem__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1687:2: rule__DocItem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DocItem__NameAssignment_1_in_rule__DocItem__Group__1__Impl3441);
            rule__DocItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__Group__1__Impl"


    // $ANTLR start "rule__DocItem__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1697:1: rule__DocItem__Group__2 : rule__DocItem__Group__2__Impl rule__DocItem__Group__3 ;
    public final void rule__DocItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1701:1: ( rule__DocItem__Group__2__Impl rule__DocItem__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1702:2: rule__DocItem__Group__2__Impl rule__DocItem__Group__3
            {
            pushFollow(FOLLOW_rule__DocItem__Group__2__Impl_in_rule__DocItem__Group__23471);
            rule__DocItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocItem__Group__3_in_rule__DocItem__Group__23474);
            rule__DocItem__Group__3();

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
    // $ANTLR end "rule__DocItem__Group__2"


    // $ANTLR start "rule__DocItem__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1709:1: rule__DocItem__Group__2__Impl : ( ( rule__DocItem__RefAssignment_2 ) ) ;
    public final void rule__DocItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1713:1: ( ( ( rule__DocItem__RefAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1714:1: ( ( rule__DocItem__RefAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1714:1: ( ( rule__DocItem__RefAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1715:1: ( rule__DocItem__RefAssignment_2 )
            {
             before(grammarAccess.getDocItemAccess().getRefAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1716:1: ( rule__DocItem__RefAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1716:2: rule__DocItem__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__DocItem__RefAssignment_2_in_rule__DocItem__Group__2__Impl3501);
            rule__DocItem__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocItemAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__Group__2__Impl"


    // $ANTLR start "rule__DocItem__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1726:1: rule__DocItem__Group__3 : rule__DocItem__Group__3__Impl ;
    public final void rule__DocItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1730:1: ( rule__DocItem__Group__3__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1731:2: rule__DocItem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DocItem__Group__3__Impl_in_rule__DocItem__Group__33531);
            rule__DocItem__Group__3__Impl();

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
    // $ANTLR end "rule__DocItem__Group__3"


    // $ANTLR start "rule__DocItem__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1737:1: rule__DocItem__Group__3__Impl : ( ';' ) ;
    public final void rule__DocItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1741:1: ( ( ';' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1742:1: ( ';' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1742:1: ( ';' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1743:1: ';'
            {
             before(grammarAccess.getDocItemAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__DocItem__Group__3__Impl3559); 
             after(grammarAccess.getDocItemAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__Group__3__Impl"


    // $ANTLR start "rule__ModelItem__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1764:1: rule__ModelItem__Group__0 : rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1 ;
    public final void rule__ModelItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1768:1: ( rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1769:2: rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModelItem__Group__0__Impl_in_rule__ModelItem__Group__03598);
            rule__ModelItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelItem__Group__1_in_rule__ModelItem__Group__03601);
            rule__ModelItem__Group__1();

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
    // $ANTLR end "rule__ModelItem__Group__0"


    // $ANTLR start "rule__ModelItem__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1776:1: rule__ModelItem__Group__0__Impl : ( ( rule__ModelItem__TypeAssignment_0 ) ) ;
    public final void rule__ModelItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1780:1: ( ( ( rule__ModelItem__TypeAssignment_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1781:1: ( ( rule__ModelItem__TypeAssignment_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1781:1: ( ( rule__ModelItem__TypeAssignment_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1782:1: ( rule__ModelItem__TypeAssignment_0 )
            {
             before(grammarAccess.getModelItemAccess().getTypeAssignment_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1783:1: ( rule__ModelItem__TypeAssignment_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1783:2: rule__ModelItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelItem__TypeAssignment_0_in_rule__ModelItem__Group__0__Impl3628);
            rule__ModelItem__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelItemAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__Group__0__Impl"


    // $ANTLR start "rule__ModelItem__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1793:1: rule__ModelItem__Group__1 : rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2 ;
    public final void rule__ModelItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1797:1: ( rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1798:2: rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModelItem__Group__1__Impl_in_rule__ModelItem__Group__13658);
            rule__ModelItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelItem__Group__2_in_rule__ModelItem__Group__13661);
            rule__ModelItem__Group__2();

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
    // $ANTLR end "rule__ModelItem__Group__1"


    // $ANTLR start "rule__ModelItem__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1805:1: rule__ModelItem__Group__1__Impl : ( ( rule__ModelItem__NameAssignment_1 ) ) ;
    public final void rule__ModelItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1809:1: ( ( ( rule__ModelItem__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1810:1: ( ( rule__ModelItem__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1810:1: ( ( rule__ModelItem__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1811:1: ( rule__ModelItem__NameAssignment_1 )
            {
             before(grammarAccess.getModelItemAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1812:1: ( rule__ModelItem__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1812:2: rule__ModelItem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModelItem__NameAssignment_1_in_rule__ModelItem__Group__1__Impl3688);
            rule__ModelItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__Group__1__Impl"


    // $ANTLR start "rule__ModelItem__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1822:1: rule__ModelItem__Group__2 : rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3 ;
    public final void rule__ModelItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1826:1: ( rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1827:2: rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3
            {
            pushFollow(FOLLOW_rule__ModelItem__Group__2__Impl_in_rule__ModelItem__Group__23718);
            rule__ModelItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelItem__Group__3_in_rule__ModelItem__Group__23721);
            rule__ModelItem__Group__3();

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
    // $ANTLR end "rule__ModelItem__Group__2"


    // $ANTLR start "rule__ModelItem__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1834:1: rule__ModelItem__Group__2__Impl : ( ( rule__ModelItem__DescAssignment_2 ) ) ;
    public final void rule__ModelItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1838:1: ( ( ( rule__ModelItem__DescAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1839:1: ( ( rule__ModelItem__DescAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1839:1: ( ( rule__ModelItem__DescAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1840:1: ( rule__ModelItem__DescAssignment_2 )
            {
             before(grammarAccess.getModelItemAccess().getDescAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1841:1: ( rule__ModelItem__DescAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1841:2: rule__ModelItem__DescAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelItem__DescAssignment_2_in_rule__ModelItem__Group__2__Impl3748);
            rule__ModelItem__DescAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelItemAccess().getDescAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__Group__2__Impl"


    // $ANTLR start "rule__ModelItem__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1851:1: rule__ModelItem__Group__3 : rule__ModelItem__Group__3__Impl ;
    public final void rule__ModelItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1855:1: ( rule__ModelItem__Group__3__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1856:2: rule__ModelItem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelItem__Group__3__Impl_in_rule__ModelItem__Group__33778);
            rule__ModelItem__Group__3__Impl();

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
    // $ANTLR end "rule__ModelItem__Group__3"


    // $ANTLR start "rule__ModelItem__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1862:1: rule__ModelItem__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1866:1: ( ( ';' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1867:1: ( ';' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1867:1: ( ';' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1868:1: ';'
            {
             before(grammarAccess.getModelItemAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__ModelItem__Group__3__Impl3806); 
             after(grammarAccess.getModelItemAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__Group__3__Impl"


    // $ANTLR start "rule__ListItem__Group__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1889:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1893:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1894:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_rule__ListItem__Group__0__Impl_in_rule__ListItem__Group__03845);
            rule__ListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__1_in_rule__ListItem__Group__03848);
            rule__ListItem__Group__1();

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
    // $ANTLR end "rule__ListItem__Group__0"


    // $ANTLR start "rule__ListItem__Group__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1901:1: rule__ListItem__Group__0__Impl : ( ( rule__ListItem__TypeAssignment_0 ) ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1905:1: ( ( ( rule__ListItem__TypeAssignment_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1906:1: ( ( rule__ListItem__TypeAssignment_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1906:1: ( ( rule__ListItem__TypeAssignment_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1907:1: ( rule__ListItem__TypeAssignment_0 )
            {
             before(grammarAccess.getListItemAccess().getTypeAssignment_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1908:1: ( rule__ListItem__TypeAssignment_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1908:2: rule__ListItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ListItem__TypeAssignment_0_in_rule__ListItem__Group__0__Impl3875);
            rule__ListItem__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__0__Impl"


    // $ANTLR start "rule__ListItem__Group__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1918:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1922:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1923:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
            {
            pushFollow(FOLLOW_rule__ListItem__Group__1__Impl_in_rule__ListItem__Group__13905);
            rule__ListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__2_in_rule__ListItem__Group__13908);
            rule__ListItem__Group__2();

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
    // $ANTLR end "rule__ListItem__Group__1"


    // $ANTLR start "rule__ListItem__Group__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1930:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__NameAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1934:1: ( ( ( rule__ListItem__NameAssignment_1 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1935:1: ( ( rule__ListItem__NameAssignment_1 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1935:1: ( ( rule__ListItem__NameAssignment_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1936:1: ( rule__ListItem__NameAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getNameAssignment_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1937:1: ( rule__ListItem__NameAssignment_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1937:2: rule__ListItem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ListItem__NameAssignment_1_in_rule__ListItem__Group__1__Impl3935);
            rule__ListItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__1__Impl"


    // $ANTLR start "rule__ListItem__Group__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1947:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1951:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1952:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
            {
            pushFollow(FOLLOW_rule__ListItem__Group__2__Impl_in_rule__ListItem__Group__23965);
            rule__ListItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__3_in_rule__ListItem__Group__23968);
            rule__ListItem__Group__3();

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
    // $ANTLR end "rule__ListItem__Group__2"


    // $ANTLR start "rule__ListItem__Group__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1959:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__DescAssignment_2 ) ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1963:1: ( ( ( rule__ListItem__DescAssignment_2 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1964:1: ( ( rule__ListItem__DescAssignment_2 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1964:1: ( ( rule__ListItem__DescAssignment_2 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1965:1: ( rule__ListItem__DescAssignment_2 )
            {
             before(grammarAccess.getListItemAccess().getDescAssignment_2()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1966:1: ( rule__ListItem__DescAssignment_2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1966:2: rule__ListItem__DescAssignment_2
            {
            pushFollow(FOLLOW_rule__ListItem__DescAssignment_2_in_rule__ListItem__Group__2__Impl3995);
            rule__ListItem__DescAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getDescAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__2__Impl"


    // $ANTLR start "rule__ListItem__Group__3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1976:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl rule__ListItem__Group__4 ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1980:1: ( rule__ListItem__Group__3__Impl rule__ListItem__Group__4 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1981:2: rule__ListItem__Group__3__Impl rule__ListItem__Group__4
            {
            pushFollow(FOLLOW_rule__ListItem__Group__3__Impl_in_rule__ListItem__Group__34025);
            rule__ListItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__4_in_rule__ListItem__Group__34028);
            rule__ListItem__Group__4();

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
    // $ANTLR end "rule__ListItem__Group__3"


    // $ANTLR start "rule__ListItem__Group__3__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1988:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__Group_3__0 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1992:1: ( ( ( rule__ListItem__Group_3__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1993:1: ( ( rule__ListItem__Group_3__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1993:1: ( ( rule__ListItem__Group_3__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1994:1: ( rule__ListItem__Group_3__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_3()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1995:1: ( rule__ListItem__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:1995:2: rule__ListItem__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ListItem__Group_3__0_in_rule__ListItem__Group__3__Impl4055);
                    rule__ListItem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListItemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__3__Impl"


    // $ANTLR start "rule__ListItem__Group__4"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2005:1: rule__ListItem__Group__4 : rule__ListItem__Group__4__Impl rule__ListItem__Group__5 ;
    public final void rule__ListItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2009:1: ( rule__ListItem__Group__4__Impl rule__ListItem__Group__5 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2010:2: rule__ListItem__Group__4__Impl rule__ListItem__Group__5
            {
            pushFollow(FOLLOW_rule__ListItem__Group__4__Impl_in_rule__ListItem__Group__44086);
            rule__ListItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__5_in_rule__ListItem__Group__44089);
            rule__ListItem__Group__5();

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
    // $ANTLR end "rule__ListItem__Group__4"


    // $ANTLR start "rule__ListItem__Group__4__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2017:1: rule__ListItem__Group__4__Impl : ( ( rule__ListItem__Group_4__0 )? ) ;
    public final void rule__ListItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2021:1: ( ( ( rule__ListItem__Group_4__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2022:1: ( ( rule__ListItem__Group_4__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2022:1: ( ( rule__ListItem__Group_4__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2023:1: ( rule__ListItem__Group_4__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_4()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2024:1: ( rule__ListItem__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2024:2: rule__ListItem__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ListItem__Group_4__0_in_rule__ListItem__Group__4__Impl4116);
                    rule__ListItem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListItemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__4__Impl"


    // $ANTLR start "rule__ListItem__Group__5"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2034:1: rule__ListItem__Group__5 : rule__ListItem__Group__5__Impl rule__ListItem__Group__6 ;
    public final void rule__ListItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2038:1: ( rule__ListItem__Group__5__Impl rule__ListItem__Group__6 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2039:2: rule__ListItem__Group__5__Impl rule__ListItem__Group__6
            {
            pushFollow(FOLLOW_rule__ListItem__Group__5__Impl_in_rule__ListItem__Group__54147);
            rule__ListItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group__6_in_rule__ListItem__Group__54150);
            rule__ListItem__Group__6();

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
    // $ANTLR end "rule__ListItem__Group__5"


    // $ANTLR start "rule__ListItem__Group__5__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2046:1: rule__ListItem__Group__5__Impl : ( ( rule__ListItem__Group_5__0 )? ) ;
    public final void rule__ListItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2050:1: ( ( ( rule__ListItem__Group_5__0 )? ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2051:1: ( ( rule__ListItem__Group_5__0 )? )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2051:1: ( ( rule__ListItem__Group_5__0 )? )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2052:1: ( rule__ListItem__Group_5__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_5()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2053:1: ( rule__ListItem__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2053:2: rule__ListItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ListItem__Group_5__0_in_rule__ListItem__Group__5__Impl4177);
                    rule__ListItem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListItemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__5__Impl"


    // $ANTLR start "rule__ListItem__Group__6"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2063:1: rule__ListItem__Group__6 : rule__ListItem__Group__6__Impl ;
    public final void rule__ListItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2067:1: ( rule__ListItem__Group__6__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2068:2: rule__ListItem__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ListItem__Group__6__Impl_in_rule__ListItem__Group__64208);
            rule__ListItem__Group__6__Impl();

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
    // $ANTLR end "rule__ListItem__Group__6"


    // $ANTLR start "rule__ListItem__Group__6__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2074:1: rule__ListItem__Group__6__Impl : ( ';' ) ;
    public final void rule__ListItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2078:1: ( ( ';' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2079:1: ( ';' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2079:1: ( ';' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2080:1: ';'
            {
             before(grammarAccess.getListItemAccess().getSemicolonKeyword_6()); 
            match(input,47,FOLLOW_47_in_rule__ListItem__Group__6__Impl4236); 
             after(grammarAccess.getListItemAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__6__Impl"


    // $ANTLR start "rule__ListItem__Group_3__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2107:1: rule__ListItem__Group_3__0 : rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1 ;
    public final void rule__ListItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2111:1: ( rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2112:2: rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListItem__Group_3__0__Impl_in_rule__ListItem__Group_3__04281);
            rule__ListItem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_3__1_in_rule__ListItem__Group_3__04284);
            rule__ListItem__Group_3__1();

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
    // $ANTLR end "rule__ListItem__Group_3__0"


    // $ANTLR start "rule__ListItem__Group_3__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2119:1: rule__ListItem__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ListItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2123:1: ( ( '{' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2124:1: ( '{' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2124:1: ( '{' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2125:1: '{'
            {
             before(grammarAccess.getListItemAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__ListItem__Group_3__0__Impl4312); 
             after(grammarAccess.getListItemAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_3__0__Impl"


    // $ANTLR start "rule__ListItem__Group_3__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2138:1: rule__ListItem__Group_3__1 : rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2 ;
    public final void rule__ListItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2142:1: ( rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2143:2: rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2
            {
            pushFollow(FOLLOW_rule__ListItem__Group_3__1__Impl_in_rule__ListItem__Group_3__14343);
            rule__ListItem__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_3__2_in_rule__ListItem__Group_3__14346);
            rule__ListItem__Group_3__2();

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
    // $ANTLR end "rule__ListItem__Group_3__1"


    // $ANTLR start "rule__ListItem__Group_3__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2150:1: rule__ListItem__Group_3__1__Impl : ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) ) ;
    public final void rule__ListItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2154:1: ( ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2155:1: ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2155:1: ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2156:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2156:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2157:1: ( rule__ListItem__DocReferencesAssignment_3_1 )
            {
             before(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2158:1: ( rule__ListItem__DocReferencesAssignment_3_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2158:2: rule__ListItem__DocReferencesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ListItem__DocReferencesAssignment_3_1_in_rule__ListItem__Group_3__1__Impl4375);
            rule__ListItem__DocReferencesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2161:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2162:1: ( rule__ListItem__DocReferencesAssignment_3_1 )*
            {
             before(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2163:1: ( rule__ListItem__DocReferencesAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2163:2: rule__ListItem__DocReferencesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__ListItem__DocReferencesAssignment_3_1_in_rule__ListItem__Group_3__1__Impl4387);
            	    rule__ListItem__DocReferencesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_3__1__Impl"


    // $ANTLR start "rule__ListItem__Group_3__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2174:1: rule__ListItem__Group_3__2 : rule__ListItem__Group_3__2__Impl ;
    public final void rule__ListItem__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2178:1: ( rule__ListItem__Group_3__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2179:2: rule__ListItem__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ListItem__Group_3__2__Impl_in_rule__ListItem__Group_3__24420);
            rule__ListItem__Group_3__2__Impl();

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
    // $ANTLR end "rule__ListItem__Group_3__2"


    // $ANTLR start "rule__ListItem__Group_3__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2185:1: rule__ListItem__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ListItem__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2189:1: ( ( '}' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2190:1: ( '}' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2190:1: ( '}' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2191:1: '}'
            {
             before(grammarAccess.getListItemAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_42_in_rule__ListItem__Group_3__2__Impl4448); 
             after(grammarAccess.getListItemAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_3__2__Impl"


    // $ANTLR start "rule__ListItem__Group_4__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2210:1: rule__ListItem__Group_4__0 : rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1 ;
    public final void rule__ListItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2214:1: ( rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2215:2: rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1
            {
            pushFollow(FOLLOW_rule__ListItem__Group_4__0__Impl_in_rule__ListItem__Group_4__04485);
            rule__ListItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_4__1_in_rule__ListItem__Group_4__04488);
            rule__ListItem__Group_4__1();

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
    // $ANTLR end "rule__ListItem__Group_4__0"


    // $ANTLR start "rule__ListItem__Group_4__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2222:1: rule__ListItem__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2226:1: ( ( '(' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2227:1: ( '(' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2227:1: ( '(' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2228:1: '('
            {
             before(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__ListItem__Group_4__0__Impl4516); 
             after(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_4__0__Impl"


    // $ANTLR start "rule__ListItem__Group_4__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2241:1: rule__ListItem__Group_4__1 : rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2 ;
    public final void rule__ListItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2245:1: ( rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2246:2: rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2
            {
            pushFollow(FOLLOW_rule__ListItem__Group_4__1__Impl_in_rule__ListItem__Group_4__14547);
            rule__ListItem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_4__2_in_rule__ListItem__Group_4__14550);
            rule__ListItem__Group_4__2();

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
    // $ANTLR end "rule__ListItem__Group_4__1"


    // $ANTLR start "rule__ListItem__Group_4__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2253:1: rule__ListItem__Group_4__1__Impl : ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) ) ;
    public final void rule__ListItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2257:1: ( ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2258:1: ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2258:1: ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2259:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2259:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2260:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )
            {
             before(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2261:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2261:2: rule__ListItem__ItemReferencesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ListItem__ItemReferencesAssignment_4_1_in_rule__ListItem__Group_4__1__Impl4579);
            rule__ListItem__ItemReferencesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2264:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2265:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )*
            {
             before(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2266:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2266:2: rule__ListItem__ItemReferencesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__ListItem__ItemReferencesAssignment_4_1_in_rule__ListItem__Group_4__1__Impl4591);
            	    rule__ListItem__ItemReferencesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_4__1__Impl"


    // $ANTLR start "rule__ListItem__Group_4__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2277:1: rule__ListItem__Group_4__2 : rule__ListItem__Group_4__2__Impl ;
    public final void rule__ListItem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2281:1: ( rule__ListItem__Group_4__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2282:2: rule__ListItem__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ListItem__Group_4__2__Impl_in_rule__ListItem__Group_4__24624);
            rule__ListItem__Group_4__2__Impl();

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
    // $ANTLR end "rule__ListItem__Group_4__2"


    // $ANTLR start "rule__ListItem__Group_4__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2288:1: rule__ListItem__Group_4__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2292:1: ( ( ')' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2293:1: ( ')' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2293:1: ( ')' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2294:1: ')'
            {
             before(grammarAccess.getListItemAccess().getRightParenthesisKeyword_4_2()); 
            match(input,46,FOLLOW_46_in_rule__ListItem__Group_4__2__Impl4652); 
             after(grammarAccess.getListItemAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_4__2__Impl"


    // $ANTLR start "rule__ListItem__Group_5__0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2313:1: rule__ListItem__Group_5__0 : rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1 ;
    public final void rule__ListItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2317:1: ( rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2318:2: rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListItem__Group_5__0__Impl_in_rule__ListItem__Group_5__04689);
            rule__ListItem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_5__1_in_rule__ListItem__Group_5__04692);
            rule__ListItem__Group_5__1();

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
    // $ANTLR end "rule__ListItem__Group_5__0"


    // $ANTLR start "rule__ListItem__Group_5__0__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2325:1: rule__ListItem__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ListItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2329:1: ( ( '[' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2330:1: ( '[' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2330:1: ( '[' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2331:1: '['
            {
             before(grammarAccess.getListItemAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,43,FOLLOW_43_in_rule__ListItem__Group_5__0__Impl4720); 
             after(grammarAccess.getListItemAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_5__0__Impl"


    // $ANTLR start "rule__ListItem__Group_5__1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2344:1: rule__ListItem__Group_5__1 : rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2 ;
    public final void rule__ListItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2348:1: ( rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2349:2: rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2
            {
            pushFollow(FOLLOW_rule__ListItem__Group_5__1__Impl_in_rule__ListItem__Group_5__14751);
            rule__ListItem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItem__Group_5__2_in_rule__ListItem__Group_5__14754);
            rule__ListItem__Group_5__2();

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
    // $ANTLR end "rule__ListItem__Group_5__1"


    // $ANTLR start "rule__ListItem__Group_5__1__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2356:1: rule__ListItem__Group_5__1__Impl : ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) ) ;
    public final void rule__ListItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2360:1: ( ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2361:1: ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2361:1: ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2362:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2362:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2363:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )
            {
             before(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2364:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2364:2: rule__ListItem__ModelReferencesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ListItem__ModelReferencesAssignment_5_1_in_rule__ListItem__Group_5__1__Impl4783);
            rule__ListItem__ModelReferencesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 

            }

            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2367:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2368:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )*
            {
             before(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2369:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2369:2: rule__ListItem__ModelReferencesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ListItem__ModelReferencesAssignment_5_1_in_rule__ListItem__Group_5__1__Impl4795);
            	    rule__ListItem__ModelReferencesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_5__1__Impl"


    // $ANTLR start "rule__ListItem__Group_5__2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2380:1: rule__ListItem__Group_5__2 : rule__ListItem__Group_5__2__Impl ;
    public final void rule__ListItem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2384:1: ( rule__ListItem__Group_5__2__Impl )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2385:2: rule__ListItem__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ListItem__Group_5__2__Impl_in_rule__ListItem__Group_5__24828);
            rule__ListItem__Group_5__2__Impl();

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
    // $ANTLR end "rule__ListItem__Group_5__2"


    // $ANTLR start "rule__ListItem__Group_5__2__Impl"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2391:1: rule__ListItem__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ListItem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2395:1: ( ( ']' ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2396:1: ( ']' )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2396:1: ( ']' )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2397:1: ']'
            {
             before(grammarAccess.getListItemAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,44,FOLLOW_44_in_rule__ListItem__Group_5__2__Impl4856); 
             after(grammarAccess.getListItemAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group_5__2__Impl"


    // $ANTLR start "rule__Specification__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2417:1: rule__Specification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Specification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2421:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2422:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2422:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2423:1: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Specification__NameAssignment_14898); 
             after(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__NameAssignment_1"


    // $ANTLR start "rule__Specification__RefinementsAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2432:1: rule__Specification__RefinementsAssignment_2 : ( ruleRefinement ) ;
    public final void rule__Specification__RefinementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2436:1: ( ( ruleRefinement ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2437:1: ( ruleRefinement )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2437:1: ( ruleRefinement )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2438:1: ruleRefinement
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsRefinementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRefinement_in_rule__Specification__RefinementsAssignment_24929);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRefinementsRefinementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__RefinementsAssignment_2"


    // $ANTLR start "rule__Refinement__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2447:1: rule__Refinement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refinement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2451:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2452:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2452:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2453:1: RULE_ID
            {
             before(grammarAccess.getRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refinement__NameAssignment_14960); 
             after(grammarAccess.getRefinementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__NameAssignment_1"


    // $ANTLR start "rule__Refinement__DescAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2462:1: rule__Refinement__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Refinement__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2466:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2467:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2467:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2468:1: RULE_STRING
            {
             before(grammarAccess.getRefinementAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Refinement__DescAssignment_24991); 
             after(grammarAccess.getRefinementAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__DescAssignment_2"


    // $ANTLR start "rule__Refinement__IntentsAssignment_3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2477:1: rule__Refinement__IntentsAssignment_3 : ( ruleIntent ) ;
    public final void rule__Refinement__IntentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2481:1: ( ( ruleIntent ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2482:1: ( ruleIntent )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2482:1: ( ruleIntent )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2483:1: ruleIntent
            {
             before(grammarAccess.getRefinementAccess().getIntentsIntentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__Refinement__IntentsAssignment_35022);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getRefinementAccess().getIntentsIntentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__IntentsAssignment_3"


    // $ANTLR start "rule__Intent__TypeAssignment_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2492:1: rule__Intent__TypeAssignment_0 : ( ruleIntentType ) ;
    public final void rule__Intent__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2496:1: ( ( ruleIntentType ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2497:1: ( ruleIntentType )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2497:1: ( ruleIntentType )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2498:1: ruleIntentType
            {
             before(grammarAccess.getIntentAccess().getTypeIntentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntentType_in_rule__Intent__TypeAssignment_05053);
            ruleIntentType();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getTypeIntentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__TypeAssignment_0"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2507:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2511:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2512:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2512:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2513:1: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Intent__NameAssignment_15084); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__DescAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2522:1: rule__Intent__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Intent__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2526:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2527:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2527:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2528:1: RULE_STRING
            {
             before(grammarAccess.getIntentAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Intent__DescAssignment_25115); 
             after(grammarAccess.getIntentAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__DescAssignment_2"


    // $ANTLR start "rule__Intent__DecompositionsAssignment_3"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2537:1: rule__Intent__DecompositionsAssignment_3 : ( ruleDecomposition ) ;
    public final void rule__Intent__DecompositionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2541:1: ( ( ruleDecomposition ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2542:1: ( ruleDecomposition )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2542:1: ( ruleDecomposition )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2543:1: ruleDecomposition
            {
             before(grammarAccess.getIntentAccess().getDecompositionsDecompositionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDecomposition_in_rule__Intent__DecompositionsAssignment_35146);
            ruleDecomposition();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getDecompositionsDecompositionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__DecompositionsAssignment_3"


    // $ANTLR start "rule__IntentType__TypeNameAssignment"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2552:1: rule__IntentType__TypeNameAssignment : ( ( rule__IntentType__TypeNameAlternatives_0 ) ) ;
    public final void rule__IntentType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2556:1: ( ( ( rule__IntentType__TypeNameAlternatives_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2557:1: ( ( rule__IntentType__TypeNameAlternatives_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2557:1: ( ( rule__IntentType__TypeNameAlternatives_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2558:1: ( rule__IntentType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getIntentTypeAccess().getTypeNameAlternatives_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2559:1: ( rule__IntentType__TypeNameAlternatives_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2559:2: rule__IntentType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__IntentType__TypeNameAlternatives_0_in_rule__IntentType__TypeNameAssignment5177);
            rule__IntentType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIntentTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntentType__TypeNameAssignment"


    // $ANTLR start "rule__Decomposition__TypeAssignment_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2568:1: rule__Decomposition__TypeAssignment_0 : ( ruleDecompositionType ) ;
    public final void rule__Decomposition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2572:1: ( ( ruleDecompositionType ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2573:1: ( ruleDecompositionType )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2573:1: ( ruleDecompositionType )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2574:1: ruleDecompositionType
            {
             before(grammarAccess.getDecompositionAccess().getTypeDecompositionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDecompositionType_in_rule__Decomposition__TypeAssignment_05210);
            ruleDecompositionType();

            state._fsp--;

             after(grammarAccess.getDecompositionAccess().getTypeDecompositionTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__TypeAssignment_0"


    // $ANTLR start "rule__Decomposition__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2583:1: rule__Decomposition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decomposition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2587:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2588:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2588:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2589:1: RULE_ID
            {
             before(grammarAccess.getDecompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposition__NameAssignment_15241); 
             after(grammarAccess.getDecompositionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__NameAssignment_1"


    // $ANTLR start "rule__Decomposition__DescAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2598:1: rule__Decomposition__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Decomposition__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2602:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2603:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2603:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2604:1: RULE_STRING
            {
             before(grammarAccess.getDecompositionAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decomposition__DescAssignment_25272); 
             after(grammarAccess.getDecompositionAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__DescAssignment_2"


    // $ANTLR start "rule__Decomposition__DocumentsAssignment_3_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2613:1: rule__Decomposition__DocumentsAssignment_3_1 : ( ruleDocument ) ;
    public final void rule__Decomposition__DocumentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2617:1: ( ( ruleDocument ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2618:1: ( ruleDocument )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2618:1: ( ruleDocument )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2619:1: ruleDocument
            {
             before(grammarAccess.getDecompositionAccess().getDocumentsDocumentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDocument_in_rule__Decomposition__DocumentsAssignment_3_15303);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDecompositionAccess().getDocumentsDocumentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__DocumentsAssignment_3_1"


    // $ANTLR start "rule__Decomposition__ModelsAssignment_4_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2628:1: rule__Decomposition__ModelsAssignment_4_1 : ( ruleModelItem ) ;
    public final void rule__Decomposition__ModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2632:1: ( ( ruleModelItem ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2633:1: ( ruleModelItem )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2633:1: ( ruleModelItem )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2634:1: ruleModelItem
            {
             before(grammarAccess.getDecompositionAccess().getModelsModelItemParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModelItem_in_rule__Decomposition__ModelsAssignment_4_15334);
            ruleModelItem();

            state._fsp--;

             after(grammarAccess.getDecompositionAccess().getModelsModelItemParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__ModelsAssignment_4_1"


    // $ANTLR start "rule__Decomposition__ItemsAssignment_5_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2643:1: rule__Decomposition__ItemsAssignment_5_1 : ( ruleListItem ) ;
    public final void rule__Decomposition__ItemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2647:1: ( ( ruleListItem ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2648:1: ( ruleListItem )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2648:1: ( ruleListItem )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2649:1: ruleListItem
            {
             before(grammarAccess.getDecompositionAccess().getItemsListItemParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleListItem_in_rule__Decomposition__ItemsAssignment_5_15365);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getDecompositionAccess().getItemsListItemParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decomposition__ItemsAssignment_5_1"


    // $ANTLR start "rule__DecompositionType__TypeNameAssignment"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2658:1: rule__DecompositionType__TypeNameAssignment : ( ( rule__DecompositionType__TypeNameAlternatives_0 ) ) ;
    public final void rule__DecompositionType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2662:1: ( ( ( rule__DecompositionType__TypeNameAlternatives_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2663:1: ( ( rule__DecompositionType__TypeNameAlternatives_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2663:1: ( ( rule__DecompositionType__TypeNameAlternatives_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2664:1: ( rule__DecompositionType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getDecompositionTypeAccess().getTypeNameAlternatives_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2665:1: ( rule__DecompositionType__TypeNameAlternatives_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2665:2: rule__DecompositionType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__DecompositionType__TypeNameAlternatives_0_in_rule__DecompositionType__TypeNameAssignment5396);
            rule__DecompositionType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecompositionType__TypeNameAssignment"


    // $ANTLR start "rule__Document__EntriesAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2674:1: rule__Document__EntriesAssignment_1 : ( ruleDocItem ) ;
    public final void rule__Document__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2678:1: ( ( ruleDocItem ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2679:1: ( ruleDocItem )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2679:1: ( ruleDocItem )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2680:1: ruleDocItem
            {
             before(grammarAccess.getDocumentAccess().getEntriesDocItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDocItem_in_rule__Document__EntriesAssignment_15429);
            ruleDocItem();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getEntriesDocItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__EntriesAssignment_1"


    // $ANTLR start "rule__DocItemType__TypeNameAssignment"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2689:1: rule__DocItemType__TypeNameAssignment : ( ( rule__DocItemType__TypeNameAlternatives_0 ) ) ;
    public final void rule__DocItemType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2693:1: ( ( ( rule__DocItemType__TypeNameAlternatives_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2694:1: ( ( rule__DocItemType__TypeNameAlternatives_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2694:1: ( ( rule__DocItemType__TypeNameAlternatives_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2695:1: ( rule__DocItemType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getDocItemTypeAccess().getTypeNameAlternatives_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2696:1: ( rule__DocItemType__TypeNameAlternatives_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2696:2: rule__DocItemType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__DocItemType__TypeNameAlternatives_0_in_rule__DocItemType__TypeNameAssignment5460);
            rule__DocItemType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDocItemTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItemType__TypeNameAssignment"


    // $ANTLR start "rule__DocItem__TypeAssignment_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2705:1: rule__DocItem__TypeAssignment_0 : ( ruleDocItemType ) ;
    public final void rule__DocItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2709:1: ( ( ruleDocItemType ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2710:1: ( ruleDocItemType )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2710:1: ( ruleDocItemType )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2711:1: ruleDocItemType
            {
             before(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocItemType_in_rule__DocItem__TypeAssignment_05493);
            ruleDocItemType();

            state._fsp--;

             after(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__TypeAssignment_0"


    // $ANTLR start "rule__DocItem__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2720:1: rule__DocItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DocItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2724:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2725:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2725:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2726:1: RULE_ID
            {
             before(grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DocItem__NameAssignment_15524); 
             after(grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__NameAssignment_1"


    // $ANTLR start "rule__DocItem__RefAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2735:1: rule__DocItem__RefAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DocItem__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2739:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2740:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2740:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2741:1: RULE_STRING
            {
             before(grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DocItem__RefAssignment_25555); 
             after(grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__RefAssignment_2"


    // $ANTLR start "rule__ModelType__TypeNameAssignment"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2750:1: rule__ModelType__TypeNameAssignment : ( ( rule__ModelType__TypeNameAlternatives_0 ) ) ;
    public final void rule__ModelType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2754:1: ( ( ( rule__ModelType__TypeNameAlternatives_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2755:1: ( ( rule__ModelType__TypeNameAlternatives_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2755:1: ( ( rule__ModelType__TypeNameAlternatives_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2756:1: ( rule__ModelType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getModelTypeAccess().getTypeNameAlternatives_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2757:1: ( rule__ModelType__TypeNameAlternatives_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2757:2: rule__ModelType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__ModelType__TypeNameAlternatives_0_in_rule__ModelType__TypeNameAssignment5586);
            rule__ModelType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__TypeNameAssignment"


    // $ANTLR start "rule__ModelItem__TypeAssignment_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2766:1: rule__ModelItem__TypeAssignment_0 : ( ruleModelType ) ;
    public final void rule__ModelItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2770:1: ( ( ruleModelType ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2771:1: ( ruleModelType )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2771:1: ( ruleModelType )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2772:1: ruleModelType
            {
             before(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelType_in_rule__ModelItem__TypeAssignment_05619);
            ruleModelType();

            state._fsp--;

             after(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__TypeAssignment_0"


    // $ANTLR start "rule__ModelItem__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2781:1: rule__ModelItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2785:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2786:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2786:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2787:1: RULE_ID
            {
             before(grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelItem__NameAssignment_15650); 
             after(grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__NameAssignment_1"


    // $ANTLR start "rule__ModelItem__DescAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2796:1: rule__ModelItem__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ModelItem__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2800:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2801:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2801:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2802:1: RULE_STRING
            {
             before(grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ModelItem__DescAssignment_25681); 
             after(grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItem__DescAssignment_2"


    // $ANTLR start "rule__ListItemType__TypeNameAssignment"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2811:1: rule__ListItemType__TypeNameAssignment : ( ( rule__ListItemType__TypeNameAlternatives_0 ) ) ;
    public final void rule__ListItemType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2815:1: ( ( ( rule__ListItemType__TypeNameAlternatives_0 ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2816:1: ( ( rule__ListItemType__TypeNameAlternatives_0 ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2816:1: ( ( rule__ListItemType__TypeNameAlternatives_0 ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2817:1: ( rule__ListItemType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getListItemTypeAccess().getTypeNameAlternatives_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2818:1: ( rule__ListItemType__TypeNameAlternatives_0 )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2818:2: rule__ListItemType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__ListItemType__TypeNameAlternatives_0_in_rule__ListItemType__TypeNameAssignment5712);
            rule__ListItemType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListItemTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItemType__TypeNameAssignment"


    // $ANTLR start "rule__ListItem__TypeAssignment_0"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2827:1: rule__ListItem__TypeAssignment_0 : ( ruleListItemType ) ;
    public final void rule__ListItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2831:1: ( ( ruleListItemType ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2832:1: ( ruleListItemType )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2832:1: ( ruleListItemType )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2833:1: ruleListItemType
            {
             before(grammarAccess.getListItemAccess().getTypeListItemTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleListItemType_in_rule__ListItem__TypeAssignment_05745);
            ruleListItemType();

            state._fsp--;

             after(grammarAccess.getListItemAccess().getTypeListItemTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__TypeAssignment_0"


    // $ANTLR start "rule__ListItem__NameAssignment_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2842:1: rule__ListItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ListItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2846:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2847:1: ( RULE_ID )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2847:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2848:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListItem__NameAssignment_15776); 
             after(grammarAccess.getListItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__NameAssignment_1"


    // $ANTLR start "rule__ListItem__DescAssignment_2"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2857:1: rule__ListItem__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListItem__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2861:1: ( ( RULE_STRING ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2862:1: ( RULE_STRING )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2862:1: ( RULE_STRING )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2863:1: RULE_STRING
            {
             before(grammarAccess.getListItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListItem__DescAssignment_25807); 
             after(grammarAccess.getListItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__DescAssignment_2"


    // $ANTLR start "rule__ListItem__DocReferencesAssignment_3_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2872:1: rule__ListItem__DocReferencesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__DocReferencesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2876:1: ( ( ( RULE_ID ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2877:1: ( ( RULE_ID ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2877:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2878:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getDocReferencesDocItemCrossReference_3_1_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2879:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2880:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getDocReferencesDocItemIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListItem__DocReferencesAssignment_3_15842); 
             after(grammarAccess.getListItemAccess().getDocReferencesDocItemIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getListItemAccess().getDocReferencesDocItemCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__DocReferencesAssignment_3_1"


    // $ANTLR start "rule__ListItem__ItemReferencesAssignment_4_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2891:1: rule__ListItem__ItemReferencesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__ItemReferencesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2895:1: ( ( ( RULE_ID ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2896:1: ( ( RULE_ID ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2896:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2897:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getItemReferencesListItemCrossReference_4_1_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2898:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2899:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getItemReferencesListItemIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListItem__ItemReferencesAssignment_4_15881); 
             after(grammarAccess.getListItemAccess().getItemReferencesListItemIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getListItemAccess().getItemReferencesListItemCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__ItemReferencesAssignment_4_1"


    // $ANTLR start "rule__ListItem__ModelReferencesAssignment_5_1"
    // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2910:1: rule__ListItem__ModelReferencesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__ModelReferencesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2914:1: ( ( ( RULE_ID ) ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2915:1: ( ( RULE_ID ) )
            {
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2915:1: ( ( RULE_ID ) )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2916:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getModelReferencesModelItemCrossReference_5_1_0()); 
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2917:1: ( RULE_ID )
            // ../net.certware.intent.ui/src-gen/net/certware/intent/ui/contentassist/antlr/internal/InternalIntentSpecification.g:2918:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getModelReferencesModelItemIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListItem__ModelReferencesAssignment_5_15920); 
             after(grammarAccess.getListItemAccess().getModelReferencesModelItemIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getListItemAccess().getModelReferencesModelItemCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__ModelReferencesAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__Group__0_in_ruleSpecification94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0_in_ruleRefinement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Group__0_in_ruleIntent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentType_in_entryRuleIntentType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntentType__TypeNameAssignment_in_ruleIntentType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__0_in_ruleDecomposition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_entryRuleDecompositionType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecompositionType__TypeNameAssignment_in_ruleDecompositionType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItemType_in_entryRuleDocItemType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocItemType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItemType__TypeNameAssignment_in_ruleDocItemType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItem_in_entryRuleDocItem541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocItem548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Group__0_in_ruleDocItem574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelType_in_entryRuleModelType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__TypeNameAssignment_in_ruleModelType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelItem_in_entryRuleModelItem661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelItem668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__0_in_ruleModelItem694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemType_in_entryRuleListItemType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListItemType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemType__TypeNameAssignment_in_ruleListItemType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItem_in_entryRuleListItem781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListItem788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__0_in_ruleListItem814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__IntentType__TypeNameAlternatives_0851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__IntentType__TypeNameAlternatives_0871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IntentType__TypeNameAlternatives_0891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IntentType__TypeNameAlternatives_0911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IntentType__TypeNameAlternatives_0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntentType__TypeNameAlternatives_0951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntentType__TypeNameAlternatives_0971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DecompositionType__TypeNameAlternatives_01006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DecompositionType__TypeNameAlternatives_01026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecompositionType__TypeNameAlternatives_01046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecompositionType__TypeNameAlternatives_01066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DocItemType__TypeNameAlternatives_01101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DocItemType__TypeNameAlternatives_01121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DocItemType__TypeNameAlternatives_01141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DocItemType__TypeNameAlternatives_01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DocItemType__TypeNameAlternatives_01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DocItemType__TypeNameAlternatives_01201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DocItemType__TypeNameAlternatives_01221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModelType__TypeNameAlternatives_01256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModelType__TypeNameAlternatives_01276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelType__TypeNameAlternatives_01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelType__TypeNameAlternatives_01316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelType__TypeNameAlternatives_01336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelType__TypeNameAlternatives_01356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ListItemType__TypeNameAlternatives_01391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ListItemType__TypeNameAlternatives_01411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ListItemType__TypeNameAlternatives_01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ListItemType__TypeNameAlternatives_01451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__Group__0__Impl_in_rule__Specification__Group__01483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Specification__Group__1_in_rule__Specification__Group__01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Specification__Group__0__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__Group__1__Impl_in_rule__Specification__Group__11545 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Specification__Group__2_in_rule__Specification__Group__11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__NameAssignment_1_in_rule__Specification__Group__1__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__Group__2__Impl_in_rule__Specification__Group__21605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__RefinementsAssignment_2_in_rule__Specification__Group__2__Impl1634 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Specification__RefinementsAssignment_2_in_rule__Specification__Group__2__Impl1646 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__0__Impl_in_rule__Refinement__Group__01685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1_in_rule__Refinement__Group__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Refinement__Group__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__1__Impl_in_rule__Refinement__Group__11747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refinement__Group__2_in_rule__Refinement__Group__11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__NameAssignment_1_in_rule__Refinement__Group__1__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__2__Impl_in_rule__Refinement__Group__21807 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Refinement__Group__3_in_rule__Refinement__Group__21810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__DescAssignment_2_in_rule__Refinement__Group__2__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__Group__3__Impl_in_rule__Refinement__Group__31867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refinement__IntentsAssignment_3_in_rule__Refinement__Group__3__Impl1896 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_rule__Refinement__IntentsAssignment_3_in_rule__Refinement__Group__3__Impl1908 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_rule__Intent__Group__0__Impl_in_rule__Intent__Group__01949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Intent__Group__1_in_rule__Intent__Group__01952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__TypeAssignment_0_in_rule__Intent__Group__0__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Group__1__Impl_in_rule__Intent__Group__12009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Intent__Group__2_in_rule__Intent__Group__12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__NameAssignment_1_in_rule__Intent__Group__1__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Group__2__Impl_in_rule__Intent__Group__22069 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Intent__Group__3_in_rule__Intent__Group__22072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__DescAssignment_2_in_rule__Intent__Group__2__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Group__3__Impl_in_rule__Intent__Group__32129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__DecompositionsAssignment_3_in_rule__Intent__Group__3__Impl2158 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__Intent__DecompositionsAssignment_3_in_rule__Intent__Group__3__Impl2170 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__0__Impl_in_rule__Decomposition__Group__02211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__1_in_rule__Decomposition__Group__02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__TypeAssignment_0_in_rule__Decomposition__Group__0__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__1__Impl_in_rule__Decomposition__Group__12271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__2_in_rule__Decomposition__Group__12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__NameAssignment_1_in_rule__Decomposition__Group__1__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__2__Impl_in_rule__Decomposition__Group__22331 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__3_in_rule__Decomposition__Group__22334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__DescAssignment_2_in_rule__Decomposition__Group__2__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__3__Impl_in_rule__Decomposition__Group__32391 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__4_in_rule__Decomposition__Group__32394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__0_in_rule__Decomposition__Group__3__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__4__Impl_in_rule__Decomposition__Group__42452 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__5_in_rule__Decomposition__Group__42455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__0_in_rule__Decomposition__Group__4__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group__5__Impl_in_rule__Decomposition__Group__52513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__0_in_rule__Decomposition__Group__5__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__0__Impl_in_rule__Decomposition__Group_3__02583 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__1_in_rule__Decomposition__Group_3__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Decomposition__Group_3__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__1__Impl_in_rule__Decomposition__Group_3__12645 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__2_in_rule__Decomposition__Group_3__12648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__DocumentsAssignment_3_1_in_rule__Decomposition__Group_3__1__Impl2675 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_3__2__Impl_in_rule__Decomposition__Group_3__22706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Decomposition__Group_3__2__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__0__Impl_in_rule__Decomposition__Group_4__02771 = new BitSet(new long[]{0x00001007E0000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__1_in_rule__Decomposition__Group_4__02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Decomposition__Group_4__0__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__1__Impl_in_rule__Decomposition__Group_4__12833 = new BitSet(new long[]{0x00001007E0000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__2_in_rule__Decomposition__Group_4__12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__ModelsAssignment_4_1_in_rule__Decomposition__Group_4__1__Impl2863 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_4__2__Impl_in_rule__Decomposition__Group_4__22894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Decomposition__Group_4__2__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__0__Impl_in_rule__Decomposition__Group_5__02959 = new BitSet(new long[]{0x0000407800000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__1_in_rule__Decomposition__Group_5__02962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Decomposition__Group_5__0__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__1__Impl_in_rule__Decomposition__Group_5__13021 = new BitSet(new long[]{0x0000407800000000L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__2_in_rule__Decomposition__Group_5__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__ItemsAssignment_5_1_in_rule__Decomposition__Group_5__1__Impl3051 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Group_5__2__Impl_in_rule__Decomposition__Group_5__23082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Decomposition__Group_5__2__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03147 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Document__Group__0__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13209 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__EntriesAssignment_1_in_rule__Document__Group__1__Impl3241 = new BitSet(new long[]{0x000000001FC00002L});
    public static final BitSet FOLLOW_rule__Document__EntriesAssignment_1_in_rule__Document__Group__1__Impl3253 = new BitSet(new long[]{0x000000001FC00002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Document__Group__2__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Group__0__Impl_in_rule__DocItem__Group__03351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DocItem__Group__1_in_rule__DocItem__Group__03354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__TypeAssignment_0_in_rule__DocItem__Group__0__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Group__1__Impl_in_rule__DocItem__Group__13411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DocItem__Group__2_in_rule__DocItem__Group__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__NameAssignment_1_in_rule__DocItem__Group__1__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Group__2__Impl_in_rule__DocItem__Group__23471 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DocItem__Group__3_in_rule__DocItem__Group__23474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__RefAssignment_2_in_rule__DocItem__Group__2__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Group__3__Impl_in_rule__DocItem__Group__33531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DocItem__Group__3__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__0__Impl_in_rule__ModelItem__Group__03598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__1_in_rule__ModelItem__Group__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__TypeAssignment_0_in_rule__ModelItem__Group__0__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__1__Impl_in_rule__ModelItem__Group__13658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__2_in_rule__ModelItem__Group__13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__NameAssignment_1_in_rule__ModelItem__Group__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__2__Impl_in_rule__ModelItem__Group__23718 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__3_in_rule__ModelItem__Group__23721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__DescAssignment_2_in_rule__ModelItem__Group__2__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelItem__Group__3__Impl_in_rule__ModelItem__Group__33778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ModelItem__Group__3__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__0__Impl_in_rule__ListItem__Group__03845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListItem__Group__1_in_rule__ListItem__Group__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__TypeAssignment_0_in_rule__ListItem__Group__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__1__Impl_in_rule__ListItem__Group__13905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListItem__Group__2_in_rule__ListItem__Group__13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__NameAssignment_1_in_rule__ListItem__Group__1__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__2__Impl_in_rule__ListItem__Group__23965 = new BitSet(new long[]{0x0000AA0000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group__3_in_rule__ListItem__Group__23968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__DescAssignment_2_in_rule__ListItem__Group__2__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__3__Impl_in_rule__ListItem__Group__34025 = new BitSet(new long[]{0x0000AA0000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group__4_in_rule__ListItem__Group__34028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__0_in_rule__ListItem__Group__3__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__4__Impl_in_rule__ListItem__Group__44086 = new BitSet(new long[]{0x0000AA0000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group__5_in_rule__ListItem__Group__44089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__0_in_rule__ListItem__Group__4__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__5__Impl_in_rule__ListItem__Group__54147 = new BitSet(new long[]{0x0000AA0000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group__6_in_rule__ListItem__Group__54150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__0_in_rule__ListItem__Group__5__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group__6__Impl_in_rule__ListItem__Group__64208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ListItem__Group__6__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__0__Impl_in_rule__ListItem__Group_3__04281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__1_in_rule__ListItem__Group_3__04284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ListItem__Group_3__0__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__1__Impl_in_rule__ListItem__Group_3__14343 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__2_in_rule__ListItem__Group_3__14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__DocReferencesAssignment_3_1_in_rule__ListItem__Group_3__1__Impl4375 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__DocReferencesAssignment_3_1_in_rule__ListItem__Group_3__1__Impl4387 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__Group_3__2__Impl_in_rule__ListItem__Group_3__24420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ListItem__Group_3__2__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__0__Impl_in_rule__ListItem__Group_4__04485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__1_in_rule__ListItem__Group_4__04488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ListItem__Group_4__0__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__1__Impl_in_rule__ListItem__Group_4__14547 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__2_in_rule__ListItem__Group_4__14550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__ItemReferencesAssignment_4_1_in_rule__ListItem__Group_4__1__Impl4579 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__ItemReferencesAssignment_4_1_in_rule__ListItem__Group_4__1__Impl4591 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__Group_4__2__Impl_in_rule__ListItem__Group_4__24624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ListItem__Group_4__2__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__0__Impl_in_rule__ListItem__Group_5__04689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__1_in_rule__ListItem__Group_5__04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ListItem__Group_5__0__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__1__Impl_in_rule__ListItem__Group_5__14751 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__2_in_rule__ListItem__Group_5__14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItem__ModelReferencesAssignment_5_1_in_rule__ListItem__Group_5__1__Impl4783 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__ModelReferencesAssignment_5_1_in_rule__ListItem__Group_5__1__Impl4795 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItem__Group_5__2__Impl_in_rule__ListItem__Group_5__24828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ListItem__Group_5__2__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Specification__NameAssignment_14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_rule__Specification__RefinementsAssignment_24929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refinement__NameAssignment_14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Refinement__DescAssignment_24991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__Refinement__IntentsAssignment_35022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentType_in_rule__Intent__TypeAssignment_05053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Intent__NameAssignment_15084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Intent__DescAssignment_25115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_rule__Intent__DecompositionsAssignment_35146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntentType__TypeNameAlternatives_0_in_rule__IntentType__TypeNameAssignment5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_rule__Decomposition__TypeAssignment_05210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposition__NameAssignment_15241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decomposition__DescAssignment_25272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_rule__Decomposition__DocumentsAssignment_3_15303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelItem_in_rule__Decomposition__ModelsAssignment_4_15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItem_in_rule__Decomposition__ItemsAssignment_5_15365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecompositionType__TypeNameAlternatives_0_in_rule__DecompositionType__TypeNameAssignment5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItem_in_rule__Document__EntriesAssignment_15429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItemType__TypeNameAlternatives_0_in_rule__DocItemType__TypeNameAssignment5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItemType_in_rule__DocItem__TypeAssignment_05493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DocItem__NameAssignment_15524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DocItem__RefAssignment_25555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__TypeNameAlternatives_0_in_rule__ModelType__TypeNameAssignment5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelType_in_rule__ModelItem__TypeAssignment_05619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelItem__NameAssignment_15650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ModelItem__DescAssignment_25681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemType__TypeNameAlternatives_0_in_rule__ListItemType__TypeNameAssignment5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemType_in_rule__ListItem__TypeAssignment_05745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListItem__NameAssignment_15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListItem__DescAssignment_25807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListItem__DocReferencesAssignment_3_15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListItem__ItemReferencesAssignment_4_15881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListItem__ModelReferencesAssignment_5_15920 = new BitSet(new long[]{0x0000000000000002L});

}