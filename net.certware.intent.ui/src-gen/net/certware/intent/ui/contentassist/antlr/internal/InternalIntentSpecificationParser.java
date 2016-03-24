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
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIntentSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIntentSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIntentSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIntentSpecification.g"; }


     
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
    // InternalIntentSpecification.g:60:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:61:1: ( ruleSpecification EOF )
            // InternalIntentSpecification.g:62:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:69:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:73:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalIntentSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            {
            // InternalIntentSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            // InternalIntentSpecification.g:75:1: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalIntentSpecification.g:76:1: ( rule__Specification__Group__0 )
            // InternalIntentSpecification.g:76:2: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:88:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:89:1: ( ruleRefinement EOF )
            // InternalIntentSpecification.g:90:1: ruleRefinement EOF
            {
             before(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefinement();

            state._fsp--;

             after(grammarAccess.getRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:97:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:101:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // InternalIntentSpecification.g:102:1: ( ( rule__Refinement__Group__0 ) )
            {
            // InternalIntentSpecification.g:102:1: ( ( rule__Refinement__Group__0 ) )
            // InternalIntentSpecification.g:103:1: ( rule__Refinement__Group__0 )
            {
             before(grammarAccess.getRefinementAccess().getGroup()); 
            // InternalIntentSpecification.g:104:1: ( rule__Refinement__Group__0 )
            // InternalIntentSpecification.g:104:2: rule__Refinement__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:116:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:117:1: ( ruleIntent EOF )
            // InternalIntentSpecification.g:118:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:125:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:129:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalIntentSpecification.g:130:1: ( ( rule__Intent__Group__0 ) )
            {
            // InternalIntentSpecification.g:130:1: ( ( rule__Intent__Group__0 ) )
            // InternalIntentSpecification.g:131:1: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalIntentSpecification.g:132:1: ( rule__Intent__Group__0 )
            // InternalIntentSpecification.g:132:2: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:144:1: entryRuleIntentType : ruleIntentType EOF ;
    public final void entryRuleIntentType() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:145:1: ( ruleIntentType EOF )
            // InternalIntentSpecification.g:146:1: ruleIntentType EOF
            {
             before(grammarAccess.getIntentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntentType();

            state._fsp--;

             after(grammarAccess.getIntentTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:153:1: ruleIntentType : ( ( rule__IntentType__TypeNameAssignment ) ) ;
    public final void ruleIntentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:157:2: ( ( ( rule__IntentType__TypeNameAssignment ) ) )
            // InternalIntentSpecification.g:158:1: ( ( rule__IntentType__TypeNameAssignment ) )
            {
            // InternalIntentSpecification.g:158:1: ( ( rule__IntentType__TypeNameAssignment ) )
            // InternalIntentSpecification.g:159:1: ( rule__IntentType__TypeNameAssignment )
            {
             before(grammarAccess.getIntentTypeAccess().getTypeNameAssignment()); 
            // InternalIntentSpecification.g:160:1: ( rule__IntentType__TypeNameAssignment )
            // InternalIntentSpecification.g:160:2: rule__IntentType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:172:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:173:1: ( ruleDecomposition EOF )
            // InternalIntentSpecification.g:174:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleDecomposition();

            state._fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:181:1: ruleDecomposition : ( ( rule__Decomposition__Group__0 ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:185:2: ( ( ( rule__Decomposition__Group__0 ) ) )
            // InternalIntentSpecification.g:186:1: ( ( rule__Decomposition__Group__0 ) )
            {
            // InternalIntentSpecification.g:186:1: ( ( rule__Decomposition__Group__0 ) )
            // InternalIntentSpecification.g:187:1: ( rule__Decomposition__Group__0 )
            {
             before(grammarAccess.getDecompositionAccess().getGroup()); 
            // InternalIntentSpecification.g:188:1: ( rule__Decomposition__Group__0 )
            // InternalIntentSpecification.g:188:2: rule__Decomposition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:200:1: entryRuleDecompositionType : ruleDecompositionType EOF ;
    public final void entryRuleDecompositionType() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:201:1: ( ruleDecompositionType EOF )
            // InternalIntentSpecification.g:202:1: ruleDecompositionType EOF
            {
             before(grammarAccess.getDecompositionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDecompositionType();

            state._fsp--;

             after(grammarAccess.getDecompositionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:209:1: ruleDecompositionType : ( ( rule__DecompositionType__TypeNameAssignment ) ) ;
    public final void ruleDecompositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:213:2: ( ( ( rule__DecompositionType__TypeNameAssignment ) ) )
            // InternalIntentSpecification.g:214:1: ( ( rule__DecompositionType__TypeNameAssignment ) )
            {
            // InternalIntentSpecification.g:214:1: ( ( rule__DecompositionType__TypeNameAssignment ) )
            // InternalIntentSpecification.g:215:1: ( rule__DecompositionType__TypeNameAssignment )
            {
             before(grammarAccess.getDecompositionTypeAccess().getTypeNameAssignment()); 
            // InternalIntentSpecification.g:216:1: ( rule__DecompositionType__TypeNameAssignment )
            // InternalIntentSpecification.g:216:2: rule__DecompositionType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:228:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:229:1: ( ruleDocument EOF )
            // InternalIntentSpecification.g:230:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:237:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:241:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalIntentSpecification.g:242:1: ( ( rule__Document__Group__0 ) )
            {
            // InternalIntentSpecification.g:242:1: ( ( rule__Document__Group__0 ) )
            // InternalIntentSpecification.g:243:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // InternalIntentSpecification.g:244:1: ( rule__Document__Group__0 )
            // InternalIntentSpecification.g:244:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:256:1: entryRuleDocItemType : ruleDocItemType EOF ;
    public final void entryRuleDocItemType() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:257:1: ( ruleDocItemType EOF )
            // InternalIntentSpecification.g:258:1: ruleDocItemType EOF
            {
             before(grammarAccess.getDocItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDocItemType();

            state._fsp--;

             after(grammarAccess.getDocItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:265:1: ruleDocItemType : ( ( rule__DocItemType__TypeNameAssignment ) ) ;
    public final void ruleDocItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:269:2: ( ( ( rule__DocItemType__TypeNameAssignment ) ) )
            // InternalIntentSpecification.g:270:1: ( ( rule__DocItemType__TypeNameAssignment ) )
            {
            // InternalIntentSpecification.g:270:1: ( ( rule__DocItemType__TypeNameAssignment ) )
            // InternalIntentSpecification.g:271:1: ( rule__DocItemType__TypeNameAssignment )
            {
             before(grammarAccess.getDocItemTypeAccess().getTypeNameAssignment()); 
            // InternalIntentSpecification.g:272:1: ( rule__DocItemType__TypeNameAssignment )
            // InternalIntentSpecification.g:272:2: rule__DocItemType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:284:1: entryRuleDocItem : ruleDocItem EOF ;
    public final void entryRuleDocItem() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:285:1: ( ruleDocItem EOF )
            // InternalIntentSpecification.g:286:1: ruleDocItem EOF
            {
             before(grammarAccess.getDocItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDocItem();

            state._fsp--;

             after(grammarAccess.getDocItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:293:1: ruleDocItem : ( ( rule__DocItem__Group__0 ) ) ;
    public final void ruleDocItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:297:2: ( ( ( rule__DocItem__Group__0 ) ) )
            // InternalIntentSpecification.g:298:1: ( ( rule__DocItem__Group__0 ) )
            {
            // InternalIntentSpecification.g:298:1: ( ( rule__DocItem__Group__0 ) )
            // InternalIntentSpecification.g:299:1: ( rule__DocItem__Group__0 )
            {
             before(grammarAccess.getDocItemAccess().getGroup()); 
            // InternalIntentSpecification.g:300:1: ( rule__DocItem__Group__0 )
            // InternalIntentSpecification.g:300:2: rule__DocItem__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:312:1: entryRuleModelType : ruleModelType EOF ;
    public final void entryRuleModelType() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:313:1: ( ruleModelType EOF )
            // InternalIntentSpecification.g:314:1: ruleModelType EOF
            {
             before(grammarAccess.getModelTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleModelType();

            state._fsp--;

             after(grammarAccess.getModelTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:321:1: ruleModelType : ( ( rule__ModelType__TypeNameAssignment ) ) ;
    public final void ruleModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:325:2: ( ( ( rule__ModelType__TypeNameAssignment ) ) )
            // InternalIntentSpecification.g:326:1: ( ( rule__ModelType__TypeNameAssignment ) )
            {
            // InternalIntentSpecification.g:326:1: ( ( rule__ModelType__TypeNameAssignment ) )
            // InternalIntentSpecification.g:327:1: ( rule__ModelType__TypeNameAssignment )
            {
             before(grammarAccess.getModelTypeAccess().getTypeNameAssignment()); 
            // InternalIntentSpecification.g:328:1: ( rule__ModelType__TypeNameAssignment )
            // InternalIntentSpecification.g:328:2: rule__ModelType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:340:1: entryRuleModelItem : ruleModelItem EOF ;
    public final void entryRuleModelItem() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:341:1: ( ruleModelItem EOF )
            // InternalIntentSpecification.g:342:1: ruleModelItem EOF
            {
             before(grammarAccess.getModelItemRule()); 
            pushFollow(FOLLOW_1);
            ruleModelItem();

            state._fsp--;

             after(grammarAccess.getModelItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:349:1: ruleModelItem : ( ( rule__ModelItem__Group__0 ) ) ;
    public final void ruleModelItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:353:2: ( ( ( rule__ModelItem__Group__0 ) ) )
            // InternalIntentSpecification.g:354:1: ( ( rule__ModelItem__Group__0 ) )
            {
            // InternalIntentSpecification.g:354:1: ( ( rule__ModelItem__Group__0 ) )
            // InternalIntentSpecification.g:355:1: ( rule__ModelItem__Group__0 )
            {
             before(grammarAccess.getModelItemAccess().getGroup()); 
            // InternalIntentSpecification.g:356:1: ( rule__ModelItem__Group__0 )
            // InternalIntentSpecification.g:356:2: rule__ModelItem__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:368:1: entryRuleListItemType : ruleListItemType EOF ;
    public final void entryRuleListItemType() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:369:1: ( ruleListItemType EOF )
            // InternalIntentSpecification.g:370:1: ruleListItemType EOF
            {
             before(grammarAccess.getListItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListItemType();

            state._fsp--;

             after(grammarAccess.getListItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:377:1: ruleListItemType : ( ( rule__ListItemType__TypeNameAssignment ) ) ;
    public final void ruleListItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:381:2: ( ( ( rule__ListItemType__TypeNameAssignment ) ) )
            // InternalIntentSpecification.g:382:1: ( ( rule__ListItemType__TypeNameAssignment ) )
            {
            // InternalIntentSpecification.g:382:1: ( ( rule__ListItemType__TypeNameAssignment ) )
            // InternalIntentSpecification.g:383:1: ( rule__ListItemType__TypeNameAssignment )
            {
             before(grammarAccess.getListItemTypeAccess().getTypeNameAssignment()); 
            // InternalIntentSpecification.g:384:1: ( rule__ListItemType__TypeNameAssignment )
            // InternalIntentSpecification.g:384:2: rule__ListItemType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:396:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalIntentSpecification.g:397:1: ( ruleListItem EOF )
            // InternalIntentSpecification.g:398:1: ruleListItem EOF
            {
             before(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIntentSpecification.g:405:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:409:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalIntentSpecification.g:410:1: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalIntentSpecification.g:410:1: ( ( rule__ListItem__Group__0 ) )
            // InternalIntentSpecification.g:411:1: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalIntentSpecification.g:412:1: ( rule__ListItem__Group__0 )
            // InternalIntentSpecification.g:412:2: rule__ListItem__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:424:1: rule__IntentType__TypeNameAlternatives_0 : ( ( 'basic' ) | ( 'purpose' ) | ( 'principles' ) | ( 'models' ) | ( 'design' ) | ( 'implementation' ) | ( 'operation' ) );
    public final void rule__IntentType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:428:1: ( ( 'basic' ) | ( 'purpose' ) | ( 'principles' ) | ( 'models' ) | ( 'design' ) | ( 'implementation' ) | ( 'operation' ) )
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
                    // InternalIntentSpecification.g:429:1: ( 'basic' )
                    {
                    // InternalIntentSpecification.g:429:1: ( 'basic' )
                    // InternalIntentSpecification.g:430:1: 'basic'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameBasicKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameBasicKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:437:6: ( 'purpose' )
                    {
                    // InternalIntentSpecification.g:437:6: ( 'purpose' )
                    // InternalIntentSpecification.g:438:1: 'purpose'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNamePurposeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNamePurposeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:445:6: ( 'principles' )
                    {
                    // InternalIntentSpecification.g:445:6: ( 'principles' )
                    // InternalIntentSpecification.g:446:1: 'principles'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNamePrinciplesKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNamePrinciplesKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:453:6: ( 'models' )
                    {
                    // InternalIntentSpecification.g:453:6: ( 'models' )
                    // InternalIntentSpecification.g:454:1: 'models'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameModelsKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameModelsKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:461:6: ( 'design' )
                    {
                    // InternalIntentSpecification.g:461:6: ( 'design' )
                    // InternalIntentSpecification.g:462:1: 'design'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameDesignKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameDesignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:469:6: ( 'implementation' )
                    {
                    // InternalIntentSpecification.g:469:6: ( 'implementation' )
                    // InternalIntentSpecification.g:470:1: 'implementation'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameImplementationKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIntentTypeAccess().getTypeNameImplementationKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIntentSpecification.g:477:6: ( 'operation' )
                    {
                    // InternalIntentSpecification.g:477:6: ( 'operation' )
                    // InternalIntentSpecification.g:478:1: 'operation'
                    {
                     before(grammarAccess.getIntentTypeAccess().getTypeNameOperationKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalIntentSpecification.g:490:1: rule__DecompositionType__TypeNameAlternatives_0 : ( ( 'environment' ) | ( 'operator' ) | ( 'system' ) | ( 'verification' ) );
    public final void rule__DecompositionType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:494:1: ( ( 'environment' ) | ( 'operator' ) | ( 'system' ) | ( 'verification' ) )
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
                    // InternalIntentSpecification.g:495:1: ( 'environment' )
                    {
                    // InternalIntentSpecification.g:495:1: ( 'environment' )
                    // InternalIntentSpecification.g:496:1: 'environment'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameEnvironmentKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameEnvironmentKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:503:6: ( 'operator' )
                    {
                    // InternalIntentSpecification.g:503:6: ( 'operator' )
                    // InternalIntentSpecification.g:504:1: 'operator'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameOperatorKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameOperatorKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:511:6: ( 'system' )
                    {
                    // InternalIntentSpecification.g:511:6: ( 'system' )
                    // InternalIntentSpecification.g:512:1: 'system'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameSystemKeyword_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDecompositionTypeAccess().getTypeNameSystemKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:519:6: ( 'verification' )
                    {
                    // InternalIntentSpecification.g:519:6: ( 'verification' )
                    // InternalIntentSpecification.g:520:1: 'verification'
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getTypeNameVerificationKeyword_0_3()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalIntentSpecification.g:532:1: rule__DocItemType__TypeNameAlternatives_0 : ( ( 'condition' ) | ( 'figure' ) | ( 'break' ) | ( 'model' ) | ( 'paragraph' ) | ( 'section' ) | ( 'table' ) );
    public final void rule__DocItemType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:536:1: ( ( 'condition' ) | ( 'figure' ) | ( 'break' ) | ( 'model' ) | ( 'paragraph' ) | ( 'section' ) | ( 'table' ) )
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
                    // InternalIntentSpecification.g:537:1: ( 'condition' )
                    {
                    // InternalIntentSpecification.g:537:1: ( 'condition' )
                    // InternalIntentSpecification.g:538:1: 'condition'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameConditionKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameConditionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:545:6: ( 'figure' )
                    {
                    // InternalIntentSpecification.g:545:6: ( 'figure' )
                    // InternalIntentSpecification.g:546:1: 'figure'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameFigureKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameFigureKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:553:6: ( 'break' )
                    {
                    // InternalIntentSpecification.g:553:6: ( 'break' )
                    // InternalIntentSpecification.g:554:1: 'break'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameBreakKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameBreakKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:561:6: ( 'model' )
                    {
                    // InternalIntentSpecification.g:561:6: ( 'model' )
                    // InternalIntentSpecification.g:562:1: 'model'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameModelKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameModelKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:569:6: ( 'paragraph' )
                    {
                    // InternalIntentSpecification.g:569:6: ( 'paragraph' )
                    // InternalIntentSpecification.g:570:1: 'paragraph'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameParagraphKeyword_0_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameParagraphKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:577:6: ( 'section' )
                    {
                    // InternalIntentSpecification.g:577:6: ( 'section' )
                    // InternalIntentSpecification.g:578:1: 'section'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameSectionKeyword_0_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDocItemTypeAccess().getTypeNameSectionKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIntentSpecification.g:585:6: ( 'table' )
                    {
                    // InternalIntentSpecification.g:585:6: ( 'table' )
                    // InternalIntentSpecification.g:586:1: 'table'
                    {
                     before(grammarAccess.getDocItemTypeAccess().getTypeNameTableKeyword_0_6()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalIntentSpecification.g:598:1: rule__ModelType__TypeNameAlternatives_0 : ( ( 'output' ) | ( 'mode' ) | ( 'state' ) | ( 'macro' ) | ( 'function' ) | ( 'input' ) );
    public final void rule__ModelType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:602:1: ( ( 'output' ) | ( 'mode' ) | ( 'state' ) | ( 'macro' ) | ( 'function' ) | ( 'input' ) )
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
                    // InternalIntentSpecification.g:603:1: ( 'output' )
                    {
                    // InternalIntentSpecification.g:603:1: ( 'output' )
                    // InternalIntentSpecification.g:604:1: 'output'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameOutputKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameOutputKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:611:6: ( 'mode' )
                    {
                    // InternalIntentSpecification.g:611:6: ( 'mode' )
                    // InternalIntentSpecification.g:612:1: 'mode'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameModeKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameModeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:619:6: ( 'state' )
                    {
                    // InternalIntentSpecification.g:619:6: ( 'state' )
                    // InternalIntentSpecification.g:620:1: 'state'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameStateKeyword_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameStateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:627:6: ( 'macro' )
                    {
                    // InternalIntentSpecification.g:627:6: ( 'macro' )
                    // InternalIntentSpecification.g:628:1: 'macro'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameMacroKeyword_0_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameMacroKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIntentSpecification.g:635:6: ( 'function' )
                    {
                    // InternalIntentSpecification.g:635:6: ( 'function' )
                    // InternalIntentSpecification.g:636:1: 'function'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameFunctionKeyword_0_4()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getModelTypeAccess().getTypeNameFunctionKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIntentSpecification.g:643:6: ( 'input' )
                    {
                    // InternalIntentSpecification.g:643:6: ( 'input' )
                    // InternalIntentSpecification.g:644:1: 'input'
                    {
                     before(grammarAccess.getModelTypeAccess().getTypeNameInputKeyword_0_5()); 
                    match(input,34,FOLLOW_2); 
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
    // InternalIntentSpecification.g:656:1: rule__ListItemType__TypeNameAlternatives_0 : ( ( 'requirement' ) | ( 'goal' ) | ( 'hazard' ) | ( 'constraint' ) );
    public final void rule__ListItemType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:660:1: ( ( 'requirement' ) | ( 'goal' ) | ( 'hazard' ) | ( 'constraint' ) )
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
                    // InternalIntentSpecification.g:661:1: ( 'requirement' )
                    {
                    // InternalIntentSpecification.g:661:1: ( 'requirement' )
                    // InternalIntentSpecification.g:662:1: 'requirement'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameRequirementKeyword_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameRequirementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIntentSpecification.g:669:6: ( 'goal' )
                    {
                    // InternalIntentSpecification.g:669:6: ( 'goal' )
                    // InternalIntentSpecification.g:670:1: 'goal'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameGoalKeyword_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameGoalKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIntentSpecification.g:677:6: ( 'hazard' )
                    {
                    // InternalIntentSpecification.g:677:6: ( 'hazard' )
                    // InternalIntentSpecification.g:678:1: 'hazard'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameHazardKeyword_0_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getListItemTypeAccess().getTypeNameHazardKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIntentSpecification.g:685:6: ( 'constraint' )
                    {
                    // InternalIntentSpecification.g:685:6: ( 'constraint' )
                    // InternalIntentSpecification.g:686:1: 'constraint'
                    {
                     before(grammarAccess.getListItemTypeAccess().getTypeNameConstraintKeyword_0_3()); 
                    match(input,38,FOLLOW_2); 
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
    // InternalIntentSpecification.g:700:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:704:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalIntentSpecification.g:705:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:712:1: rule__Specification__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:716:1: ( ( 'specification' ) )
            // InternalIntentSpecification.g:717:1: ( 'specification' )
            {
            // InternalIntentSpecification.g:717:1: ( 'specification' )
            // InternalIntentSpecification.g:718:1: 'specification'
            {
             before(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalIntentSpecification.g:731:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:735:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalIntentSpecification.g:736:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:743:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__NameAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:747:1: ( ( ( rule__Specification__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:748:1: ( ( rule__Specification__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:748:1: ( ( rule__Specification__NameAssignment_1 ) )
            // InternalIntentSpecification.g:749:1: ( rule__Specification__NameAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:750:1: ( rule__Specification__NameAssignment_1 )
            // InternalIntentSpecification.g:750:2: rule__Specification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:760:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:764:1: ( rule__Specification__Group__2__Impl )
            // InternalIntentSpecification.g:765:2: rule__Specification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:771:1: rule__Specification__Group__2__Impl : ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:775:1: ( ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) ) )
            // InternalIntentSpecification.g:776:1: ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) )
            {
            // InternalIntentSpecification.g:776:1: ( ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* ) )
            // InternalIntentSpecification.g:777:1: ( ( rule__Specification__RefinementsAssignment_2 ) ) ( ( rule__Specification__RefinementsAssignment_2 )* )
            {
            // InternalIntentSpecification.g:777:1: ( ( rule__Specification__RefinementsAssignment_2 ) )
            // InternalIntentSpecification.g:778:1: ( rule__Specification__RefinementsAssignment_2 )
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 
            // InternalIntentSpecification.g:779:1: ( rule__Specification__RefinementsAssignment_2 )
            // InternalIntentSpecification.g:779:2: rule__Specification__RefinementsAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__Specification__RefinementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 

            }

            // InternalIntentSpecification.g:782:1: ( ( rule__Specification__RefinementsAssignment_2 )* )
            // InternalIntentSpecification.g:783:1: ( rule__Specification__RefinementsAssignment_2 )*
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsAssignment_2()); 
            // InternalIntentSpecification.g:784:1: ( rule__Specification__RefinementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIntentSpecification.g:784:2: rule__Specification__RefinementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalIntentSpecification.g:801:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:805:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // InternalIntentSpecification.g:806:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Refinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:813:1: rule__Refinement__Group__0__Impl : ( 'refinement' ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:817:1: ( ( 'refinement' ) )
            // InternalIntentSpecification.g:818:1: ( 'refinement' )
            {
            // InternalIntentSpecification.g:818:1: ( 'refinement' )
            // InternalIntentSpecification.g:819:1: 'refinement'
            {
             before(grammarAccess.getRefinementAccess().getRefinementKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalIntentSpecification.g:832:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl rule__Refinement__Group__2 ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:836:1: ( rule__Refinement__Group__1__Impl rule__Refinement__Group__2 )
            // InternalIntentSpecification.g:837:2: rule__Refinement__Group__1__Impl rule__Refinement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Refinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:844:1: rule__Refinement__Group__1__Impl : ( ( rule__Refinement__NameAssignment_1 ) ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:848:1: ( ( ( rule__Refinement__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:849:1: ( ( rule__Refinement__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:849:1: ( ( rule__Refinement__NameAssignment_1 ) )
            // InternalIntentSpecification.g:850:1: ( rule__Refinement__NameAssignment_1 )
            {
             before(grammarAccess.getRefinementAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:851:1: ( rule__Refinement__NameAssignment_1 )
            // InternalIntentSpecification.g:851:2: rule__Refinement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:861:1: rule__Refinement__Group__2 : rule__Refinement__Group__2__Impl rule__Refinement__Group__3 ;
    public final void rule__Refinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:865:1: ( rule__Refinement__Group__2__Impl rule__Refinement__Group__3 )
            // InternalIntentSpecification.g:866:2: rule__Refinement__Group__2__Impl rule__Refinement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Refinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:873:1: rule__Refinement__Group__2__Impl : ( ( rule__Refinement__DescAssignment_2 ) ) ;
    public final void rule__Refinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:877:1: ( ( ( rule__Refinement__DescAssignment_2 ) ) )
            // InternalIntentSpecification.g:878:1: ( ( rule__Refinement__DescAssignment_2 ) )
            {
            // InternalIntentSpecification.g:878:1: ( ( rule__Refinement__DescAssignment_2 ) )
            // InternalIntentSpecification.g:879:1: ( rule__Refinement__DescAssignment_2 )
            {
             before(grammarAccess.getRefinementAccess().getDescAssignment_2()); 
            // InternalIntentSpecification.g:880:1: ( rule__Refinement__DescAssignment_2 )
            // InternalIntentSpecification.g:880:2: rule__Refinement__DescAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:890:1: rule__Refinement__Group__3 : rule__Refinement__Group__3__Impl ;
    public final void rule__Refinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:894:1: ( rule__Refinement__Group__3__Impl )
            // InternalIntentSpecification.g:895:2: rule__Refinement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:901:1: rule__Refinement__Group__3__Impl : ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) ) ;
    public final void rule__Refinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:905:1: ( ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) ) )
            // InternalIntentSpecification.g:906:1: ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) )
            {
            // InternalIntentSpecification.g:906:1: ( ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* ) )
            // InternalIntentSpecification.g:907:1: ( ( rule__Refinement__IntentsAssignment_3 ) ) ( ( rule__Refinement__IntentsAssignment_3 )* )
            {
            // InternalIntentSpecification.g:907:1: ( ( rule__Refinement__IntentsAssignment_3 ) )
            // InternalIntentSpecification.g:908:1: ( rule__Refinement__IntentsAssignment_3 )
            {
             before(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 
            // InternalIntentSpecification.g:909:1: ( rule__Refinement__IntentsAssignment_3 )
            // InternalIntentSpecification.g:909:2: rule__Refinement__IntentsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Refinement__IntentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 

            }

            // InternalIntentSpecification.g:912:1: ( ( rule__Refinement__IntentsAssignment_3 )* )
            // InternalIntentSpecification.g:913:1: ( rule__Refinement__IntentsAssignment_3 )*
            {
             before(grammarAccess.getRefinementAccess().getIntentsAssignment_3()); 
            // InternalIntentSpecification.g:914:1: ( rule__Refinement__IntentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIntentSpecification.g:914:2: rule__Refinement__IntentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalIntentSpecification.g:933:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:937:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalIntentSpecification.g:938:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:945:1: rule__Intent__Group__0__Impl : ( ( rule__Intent__TypeAssignment_0 ) ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:949:1: ( ( ( rule__Intent__TypeAssignment_0 ) ) )
            // InternalIntentSpecification.g:950:1: ( ( rule__Intent__TypeAssignment_0 ) )
            {
            // InternalIntentSpecification.g:950:1: ( ( rule__Intent__TypeAssignment_0 ) )
            // InternalIntentSpecification.g:951:1: ( rule__Intent__TypeAssignment_0 )
            {
             before(grammarAccess.getIntentAccess().getTypeAssignment_0()); 
            // InternalIntentSpecification.g:952:1: ( rule__Intent__TypeAssignment_0 )
            // InternalIntentSpecification.g:952:2: rule__Intent__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:962:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:966:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalIntentSpecification.g:967:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:974:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:978:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:979:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:979:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalIntentSpecification.g:980:1: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:981:1: ( rule__Intent__NameAssignment_1 )
            // InternalIntentSpecification.g:981:2: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:991:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:995:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalIntentSpecification.g:996:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1003:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__DescAssignment_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1007:1: ( ( ( rule__Intent__DescAssignment_2 ) ) )
            // InternalIntentSpecification.g:1008:1: ( ( rule__Intent__DescAssignment_2 ) )
            {
            // InternalIntentSpecification.g:1008:1: ( ( rule__Intent__DescAssignment_2 ) )
            // InternalIntentSpecification.g:1009:1: ( rule__Intent__DescAssignment_2 )
            {
             before(grammarAccess.getIntentAccess().getDescAssignment_2()); 
            // InternalIntentSpecification.g:1010:1: ( rule__Intent__DescAssignment_2 )
            // InternalIntentSpecification.g:1010:2: rule__Intent__DescAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1020:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1024:1: ( rule__Intent__Group__3__Impl )
            // InternalIntentSpecification.g:1025:2: rule__Intent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1031:1: rule__Intent__Group__3__Impl : ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1035:1: ( ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) ) )
            // InternalIntentSpecification.g:1036:1: ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) )
            {
            // InternalIntentSpecification.g:1036:1: ( ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* ) )
            // InternalIntentSpecification.g:1037:1: ( ( rule__Intent__DecompositionsAssignment_3 ) ) ( ( rule__Intent__DecompositionsAssignment_3 )* )
            {
            // InternalIntentSpecification.g:1037:1: ( ( rule__Intent__DecompositionsAssignment_3 ) )
            // InternalIntentSpecification.g:1038:1: ( rule__Intent__DecompositionsAssignment_3 )
            {
             before(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 
            // InternalIntentSpecification.g:1039:1: ( rule__Intent__DecompositionsAssignment_3 )
            // InternalIntentSpecification.g:1039:2: rule__Intent__DecompositionsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Intent__DecompositionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 

            }

            // InternalIntentSpecification.g:1042:1: ( ( rule__Intent__DecompositionsAssignment_3 )* )
            // InternalIntentSpecification.g:1043:1: ( rule__Intent__DecompositionsAssignment_3 )*
            {
             before(grammarAccess.getIntentAccess().getDecompositionsAssignment_3()); 
            // InternalIntentSpecification.g:1044:1: ( rule__Intent__DecompositionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIntentSpecification.g:1044:2: rule__Intent__DecompositionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalIntentSpecification.g:1063:1: rule__Decomposition__Group__0 : rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1 ;
    public final void rule__Decomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1067:1: ( rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1 )
            // InternalIntentSpecification.g:1068:2: rule__Decomposition__Group__0__Impl rule__Decomposition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Decomposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1075:1: rule__Decomposition__Group__0__Impl : ( ( rule__Decomposition__TypeAssignment_0 ) ) ;
    public final void rule__Decomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1079:1: ( ( ( rule__Decomposition__TypeAssignment_0 ) ) )
            // InternalIntentSpecification.g:1080:1: ( ( rule__Decomposition__TypeAssignment_0 ) )
            {
            // InternalIntentSpecification.g:1080:1: ( ( rule__Decomposition__TypeAssignment_0 ) )
            // InternalIntentSpecification.g:1081:1: ( rule__Decomposition__TypeAssignment_0 )
            {
             before(grammarAccess.getDecompositionAccess().getTypeAssignment_0()); 
            // InternalIntentSpecification.g:1082:1: ( rule__Decomposition__TypeAssignment_0 )
            // InternalIntentSpecification.g:1082:2: rule__Decomposition__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1092:1: rule__Decomposition__Group__1 : rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2 ;
    public final void rule__Decomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1096:1: ( rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2 )
            // InternalIntentSpecification.g:1097:2: rule__Decomposition__Group__1__Impl rule__Decomposition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Decomposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1104:1: rule__Decomposition__Group__1__Impl : ( ( rule__Decomposition__NameAssignment_1 ) ) ;
    public final void rule__Decomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1108:1: ( ( ( rule__Decomposition__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:1109:1: ( ( rule__Decomposition__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:1109:1: ( ( rule__Decomposition__NameAssignment_1 ) )
            // InternalIntentSpecification.g:1110:1: ( rule__Decomposition__NameAssignment_1 )
            {
             before(grammarAccess.getDecompositionAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:1111:1: ( rule__Decomposition__NameAssignment_1 )
            // InternalIntentSpecification.g:1111:2: rule__Decomposition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1121:1: rule__Decomposition__Group__2 : rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3 ;
    public final void rule__Decomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1125:1: ( rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3 )
            // InternalIntentSpecification.g:1126:2: rule__Decomposition__Group__2__Impl rule__Decomposition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Decomposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1133:1: rule__Decomposition__Group__2__Impl : ( ( rule__Decomposition__DescAssignment_2 ) ) ;
    public final void rule__Decomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1137:1: ( ( ( rule__Decomposition__DescAssignment_2 ) ) )
            // InternalIntentSpecification.g:1138:1: ( ( rule__Decomposition__DescAssignment_2 ) )
            {
            // InternalIntentSpecification.g:1138:1: ( ( rule__Decomposition__DescAssignment_2 ) )
            // InternalIntentSpecification.g:1139:1: ( rule__Decomposition__DescAssignment_2 )
            {
             before(grammarAccess.getDecompositionAccess().getDescAssignment_2()); 
            // InternalIntentSpecification.g:1140:1: ( rule__Decomposition__DescAssignment_2 )
            // InternalIntentSpecification.g:1140:2: rule__Decomposition__DescAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1150:1: rule__Decomposition__Group__3 : rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4 ;
    public final void rule__Decomposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1154:1: ( rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4 )
            // InternalIntentSpecification.g:1155:2: rule__Decomposition__Group__3__Impl rule__Decomposition__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Decomposition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1162:1: rule__Decomposition__Group__3__Impl : ( ( rule__Decomposition__Group_3__0 )? ) ;
    public final void rule__Decomposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1166:1: ( ( ( rule__Decomposition__Group_3__0 )? ) )
            // InternalIntentSpecification.g:1167:1: ( ( rule__Decomposition__Group_3__0 )? )
            {
            // InternalIntentSpecification.g:1167:1: ( ( rule__Decomposition__Group_3__0 )? )
            // InternalIntentSpecification.g:1168:1: ( rule__Decomposition__Group_3__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_3()); 
            // InternalIntentSpecification.g:1169:1: ( rule__Decomposition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIntentSpecification.g:1169:2: rule__Decomposition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1179:1: rule__Decomposition__Group__4 : rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5 ;
    public final void rule__Decomposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1183:1: ( rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5 )
            // InternalIntentSpecification.g:1184:2: rule__Decomposition__Group__4__Impl rule__Decomposition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Decomposition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1191:1: rule__Decomposition__Group__4__Impl : ( ( rule__Decomposition__Group_4__0 )? ) ;
    public final void rule__Decomposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1195:1: ( ( ( rule__Decomposition__Group_4__0 )? ) )
            // InternalIntentSpecification.g:1196:1: ( ( rule__Decomposition__Group_4__0 )? )
            {
            // InternalIntentSpecification.g:1196:1: ( ( rule__Decomposition__Group_4__0 )? )
            // InternalIntentSpecification.g:1197:1: ( rule__Decomposition__Group_4__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_4()); 
            // InternalIntentSpecification.g:1198:1: ( rule__Decomposition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIntentSpecification.g:1198:2: rule__Decomposition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1208:1: rule__Decomposition__Group__5 : rule__Decomposition__Group__5__Impl ;
    public final void rule__Decomposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1212:1: ( rule__Decomposition__Group__5__Impl )
            // InternalIntentSpecification.g:1213:2: rule__Decomposition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1219:1: rule__Decomposition__Group__5__Impl : ( ( rule__Decomposition__Group_5__0 )? ) ;
    public final void rule__Decomposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1223:1: ( ( ( rule__Decomposition__Group_5__0 )? ) )
            // InternalIntentSpecification.g:1224:1: ( ( rule__Decomposition__Group_5__0 )? )
            {
            // InternalIntentSpecification.g:1224:1: ( ( rule__Decomposition__Group_5__0 )? )
            // InternalIntentSpecification.g:1225:1: ( rule__Decomposition__Group_5__0 )?
            {
             before(grammarAccess.getDecompositionAccess().getGroup_5()); 
            // InternalIntentSpecification.g:1226:1: ( rule__Decomposition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIntentSpecification.g:1226:2: rule__Decomposition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1248:1: rule__Decomposition__Group_3__0 : rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1 ;
    public final void rule__Decomposition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1252:1: ( rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1 )
            // InternalIntentSpecification.g:1253:2: rule__Decomposition__Group_3__0__Impl rule__Decomposition__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Decomposition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1260:1: rule__Decomposition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Decomposition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1264:1: ( ( '{' ) )
            // InternalIntentSpecification.g:1265:1: ( '{' )
            {
            // InternalIntentSpecification.g:1265:1: ( '{' )
            // InternalIntentSpecification.g:1266:1: '{'
            {
             before(grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1279:1: rule__Decomposition__Group_3__1 : rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2 ;
    public final void rule__Decomposition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1283:1: ( rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2 )
            // InternalIntentSpecification.g:1284:2: rule__Decomposition__Group_3__1__Impl rule__Decomposition__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Decomposition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1291:1: rule__Decomposition__Group_3__1__Impl : ( ( rule__Decomposition__DocumentsAssignment_3_1 )* ) ;
    public final void rule__Decomposition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1295:1: ( ( ( rule__Decomposition__DocumentsAssignment_3_1 )* ) )
            // InternalIntentSpecification.g:1296:1: ( ( rule__Decomposition__DocumentsAssignment_3_1 )* )
            {
            // InternalIntentSpecification.g:1296:1: ( ( rule__Decomposition__DocumentsAssignment_3_1 )* )
            // InternalIntentSpecification.g:1297:1: ( rule__Decomposition__DocumentsAssignment_3_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getDocumentsAssignment_3_1()); 
            // InternalIntentSpecification.g:1298:1: ( rule__Decomposition__DocumentsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIntentSpecification.g:1298:2: rule__Decomposition__DocumentsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalIntentSpecification.g:1308:1: rule__Decomposition__Group_3__2 : rule__Decomposition__Group_3__2__Impl ;
    public final void rule__Decomposition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1312:1: ( rule__Decomposition__Group_3__2__Impl )
            // InternalIntentSpecification.g:1313:2: rule__Decomposition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1319:1: rule__Decomposition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Decomposition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1323:1: ( ( '}' ) )
            // InternalIntentSpecification.g:1324:1: ( '}' )
            {
            // InternalIntentSpecification.g:1324:1: ( '}' )
            // InternalIntentSpecification.g:1325:1: '}'
            {
             before(grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1344:1: rule__Decomposition__Group_4__0 : rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1 ;
    public final void rule__Decomposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1348:1: ( rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1 )
            // InternalIntentSpecification.g:1349:2: rule__Decomposition__Group_4__0__Impl rule__Decomposition__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Decomposition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1356:1: rule__Decomposition__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Decomposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1360:1: ( ( '[' ) )
            // InternalIntentSpecification.g:1361:1: ( '[' )
            {
            // InternalIntentSpecification.g:1361:1: ( '[' )
            // InternalIntentSpecification.g:1362:1: '['
            {
             before(grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1375:1: rule__Decomposition__Group_4__1 : rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2 ;
    public final void rule__Decomposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1379:1: ( rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2 )
            // InternalIntentSpecification.g:1380:2: rule__Decomposition__Group_4__1__Impl rule__Decomposition__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Decomposition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1387:1: rule__Decomposition__Group_4__1__Impl : ( ( rule__Decomposition__ModelsAssignment_4_1 )* ) ;
    public final void rule__Decomposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1391:1: ( ( ( rule__Decomposition__ModelsAssignment_4_1 )* ) )
            // InternalIntentSpecification.g:1392:1: ( ( rule__Decomposition__ModelsAssignment_4_1 )* )
            {
            // InternalIntentSpecification.g:1392:1: ( ( rule__Decomposition__ModelsAssignment_4_1 )* )
            // InternalIntentSpecification.g:1393:1: ( rule__Decomposition__ModelsAssignment_4_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getModelsAssignment_4_1()); 
            // InternalIntentSpecification.g:1394:1: ( rule__Decomposition__ModelsAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIntentSpecification.g:1394:2: rule__Decomposition__ModelsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalIntentSpecification.g:1404:1: rule__Decomposition__Group_4__2 : rule__Decomposition__Group_4__2__Impl ;
    public final void rule__Decomposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1408:1: ( rule__Decomposition__Group_4__2__Impl )
            // InternalIntentSpecification.g:1409:2: rule__Decomposition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1415:1: rule__Decomposition__Group_4__2__Impl : ( ']' ) ;
    public final void rule__Decomposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1419:1: ( ( ']' ) )
            // InternalIntentSpecification.g:1420:1: ( ']' )
            {
            // InternalIntentSpecification.g:1420:1: ( ']' )
            // InternalIntentSpecification.g:1421:1: ']'
            {
             before(grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1440:1: rule__Decomposition__Group_5__0 : rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1 ;
    public final void rule__Decomposition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1444:1: ( rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1 )
            // InternalIntentSpecification.g:1445:2: rule__Decomposition__Group_5__0__Impl rule__Decomposition__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Decomposition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1452:1: rule__Decomposition__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Decomposition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1456:1: ( ( '(' ) )
            // InternalIntentSpecification.g:1457:1: ( '(' )
            {
            // InternalIntentSpecification.g:1457:1: ( '(' )
            // InternalIntentSpecification.g:1458:1: '('
            {
             before(grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1471:1: rule__Decomposition__Group_5__1 : rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2 ;
    public final void rule__Decomposition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1475:1: ( rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2 )
            // InternalIntentSpecification.g:1476:2: rule__Decomposition__Group_5__1__Impl rule__Decomposition__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Decomposition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1483:1: rule__Decomposition__Group_5__1__Impl : ( ( rule__Decomposition__ItemsAssignment_5_1 )* ) ;
    public final void rule__Decomposition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1487:1: ( ( ( rule__Decomposition__ItemsAssignment_5_1 )* ) )
            // InternalIntentSpecification.g:1488:1: ( ( rule__Decomposition__ItemsAssignment_5_1 )* )
            {
            // InternalIntentSpecification.g:1488:1: ( ( rule__Decomposition__ItemsAssignment_5_1 )* )
            // InternalIntentSpecification.g:1489:1: ( rule__Decomposition__ItemsAssignment_5_1 )*
            {
             before(grammarAccess.getDecompositionAccess().getItemsAssignment_5_1()); 
            // InternalIntentSpecification.g:1490:1: ( rule__Decomposition__ItemsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIntentSpecification.g:1490:2: rule__Decomposition__ItemsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalIntentSpecification.g:1500:1: rule__Decomposition__Group_5__2 : rule__Decomposition__Group_5__2__Impl ;
    public final void rule__Decomposition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1504:1: ( rule__Decomposition__Group_5__2__Impl )
            // InternalIntentSpecification.g:1505:2: rule__Decomposition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1511:1: rule__Decomposition__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Decomposition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1515:1: ( ( ')' ) )
            // InternalIntentSpecification.g:1516:1: ( ')' )
            {
            // InternalIntentSpecification.g:1516:1: ( ')' )
            // InternalIntentSpecification.g:1517:1: ')'
            {
             before(grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1536:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1540:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalIntentSpecification.g:1541:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1548:1: rule__Document__Group__0__Impl : ( '{' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1552:1: ( ( '{' ) )
            // InternalIntentSpecification.g:1553:1: ( '{' )
            {
            // InternalIntentSpecification.g:1553:1: ( '{' )
            // InternalIntentSpecification.g:1554:1: '{'
            {
             before(grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1567:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1571:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalIntentSpecification.g:1572:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1579:1: rule__Document__Group__1__Impl : ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1583:1: ( ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) ) )
            // InternalIntentSpecification.g:1584:1: ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) )
            {
            // InternalIntentSpecification.g:1584:1: ( ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* ) )
            // InternalIntentSpecification.g:1585:1: ( ( rule__Document__EntriesAssignment_1 ) ) ( ( rule__Document__EntriesAssignment_1 )* )
            {
            // InternalIntentSpecification.g:1585:1: ( ( rule__Document__EntriesAssignment_1 ) )
            // InternalIntentSpecification.g:1586:1: ( rule__Document__EntriesAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 
            // InternalIntentSpecification.g:1587:1: ( rule__Document__EntriesAssignment_1 )
            // InternalIntentSpecification.g:1587:2: rule__Document__EntriesAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__Document__EntriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 

            }

            // InternalIntentSpecification.g:1590:1: ( ( rule__Document__EntriesAssignment_1 )* )
            // InternalIntentSpecification.g:1591:1: ( rule__Document__EntriesAssignment_1 )*
            {
             before(grammarAccess.getDocumentAccess().getEntriesAssignment_1()); 
            // InternalIntentSpecification.g:1592:1: ( rule__Document__EntriesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=22 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIntentSpecification.g:1592:2: rule__Document__EntriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalIntentSpecification.g:1603:1: rule__Document__Group__2 : rule__Document__Group__2__Impl ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1607:1: ( rule__Document__Group__2__Impl )
            // InternalIntentSpecification.g:1608:2: rule__Document__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1614:1: rule__Document__Group__2__Impl : ( '}' ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1618:1: ( ( '}' ) )
            // InternalIntentSpecification.g:1619:1: ( '}' )
            {
            // InternalIntentSpecification.g:1619:1: ( '}' )
            // InternalIntentSpecification.g:1620:1: '}'
            {
             before(grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1639:1: rule__DocItem__Group__0 : rule__DocItem__Group__0__Impl rule__DocItem__Group__1 ;
    public final void rule__DocItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1643:1: ( rule__DocItem__Group__0__Impl rule__DocItem__Group__1 )
            // InternalIntentSpecification.g:1644:2: rule__DocItem__Group__0__Impl rule__DocItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DocItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1651:1: rule__DocItem__Group__0__Impl : ( ( rule__DocItem__TypeAssignment_0 ) ) ;
    public final void rule__DocItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1655:1: ( ( ( rule__DocItem__TypeAssignment_0 ) ) )
            // InternalIntentSpecification.g:1656:1: ( ( rule__DocItem__TypeAssignment_0 ) )
            {
            // InternalIntentSpecification.g:1656:1: ( ( rule__DocItem__TypeAssignment_0 ) )
            // InternalIntentSpecification.g:1657:1: ( rule__DocItem__TypeAssignment_0 )
            {
             before(grammarAccess.getDocItemAccess().getTypeAssignment_0()); 
            // InternalIntentSpecification.g:1658:1: ( rule__DocItem__TypeAssignment_0 )
            // InternalIntentSpecification.g:1658:2: rule__DocItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1668:1: rule__DocItem__Group__1 : rule__DocItem__Group__1__Impl rule__DocItem__Group__2 ;
    public final void rule__DocItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1672:1: ( rule__DocItem__Group__1__Impl rule__DocItem__Group__2 )
            // InternalIntentSpecification.g:1673:2: rule__DocItem__Group__1__Impl rule__DocItem__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DocItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1680:1: rule__DocItem__Group__1__Impl : ( ( rule__DocItem__NameAssignment_1 ) ) ;
    public final void rule__DocItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1684:1: ( ( ( rule__DocItem__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:1685:1: ( ( rule__DocItem__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:1685:1: ( ( rule__DocItem__NameAssignment_1 ) )
            // InternalIntentSpecification.g:1686:1: ( rule__DocItem__NameAssignment_1 )
            {
             before(grammarAccess.getDocItemAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:1687:1: ( rule__DocItem__NameAssignment_1 )
            // InternalIntentSpecification.g:1687:2: rule__DocItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1697:1: rule__DocItem__Group__2 : rule__DocItem__Group__2__Impl rule__DocItem__Group__3 ;
    public final void rule__DocItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1701:1: ( rule__DocItem__Group__2__Impl rule__DocItem__Group__3 )
            // InternalIntentSpecification.g:1702:2: rule__DocItem__Group__2__Impl rule__DocItem__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__DocItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1709:1: rule__DocItem__Group__2__Impl : ( ( rule__DocItem__RefAssignment_2 ) ) ;
    public final void rule__DocItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1713:1: ( ( ( rule__DocItem__RefAssignment_2 ) ) )
            // InternalIntentSpecification.g:1714:1: ( ( rule__DocItem__RefAssignment_2 ) )
            {
            // InternalIntentSpecification.g:1714:1: ( ( rule__DocItem__RefAssignment_2 ) )
            // InternalIntentSpecification.g:1715:1: ( rule__DocItem__RefAssignment_2 )
            {
             before(grammarAccess.getDocItemAccess().getRefAssignment_2()); 
            // InternalIntentSpecification.g:1716:1: ( rule__DocItem__RefAssignment_2 )
            // InternalIntentSpecification.g:1716:2: rule__DocItem__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1726:1: rule__DocItem__Group__3 : rule__DocItem__Group__3__Impl ;
    public final void rule__DocItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1730:1: ( rule__DocItem__Group__3__Impl )
            // InternalIntentSpecification.g:1731:2: rule__DocItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1737:1: rule__DocItem__Group__3__Impl : ( ';' ) ;
    public final void rule__DocItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1741:1: ( ( ';' ) )
            // InternalIntentSpecification.g:1742:1: ( ';' )
            {
            // InternalIntentSpecification.g:1742:1: ( ';' )
            // InternalIntentSpecification.g:1743:1: ';'
            {
             before(grammarAccess.getDocItemAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1764:1: rule__ModelItem__Group__0 : rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1 ;
    public final void rule__ModelItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1768:1: ( rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1 )
            // InternalIntentSpecification.g:1769:2: rule__ModelItem__Group__0__Impl rule__ModelItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModelItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1776:1: rule__ModelItem__Group__0__Impl : ( ( rule__ModelItem__TypeAssignment_0 ) ) ;
    public final void rule__ModelItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1780:1: ( ( ( rule__ModelItem__TypeAssignment_0 ) ) )
            // InternalIntentSpecification.g:1781:1: ( ( rule__ModelItem__TypeAssignment_0 ) )
            {
            // InternalIntentSpecification.g:1781:1: ( ( rule__ModelItem__TypeAssignment_0 ) )
            // InternalIntentSpecification.g:1782:1: ( rule__ModelItem__TypeAssignment_0 )
            {
             before(grammarAccess.getModelItemAccess().getTypeAssignment_0()); 
            // InternalIntentSpecification.g:1783:1: ( rule__ModelItem__TypeAssignment_0 )
            // InternalIntentSpecification.g:1783:2: rule__ModelItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1793:1: rule__ModelItem__Group__1 : rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2 ;
    public final void rule__ModelItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1797:1: ( rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2 )
            // InternalIntentSpecification.g:1798:2: rule__ModelItem__Group__1__Impl rule__ModelItem__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ModelItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1805:1: rule__ModelItem__Group__1__Impl : ( ( rule__ModelItem__NameAssignment_1 ) ) ;
    public final void rule__ModelItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1809:1: ( ( ( rule__ModelItem__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:1810:1: ( ( rule__ModelItem__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:1810:1: ( ( rule__ModelItem__NameAssignment_1 ) )
            // InternalIntentSpecification.g:1811:1: ( rule__ModelItem__NameAssignment_1 )
            {
             before(grammarAccess.getModelItemAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:1812:1: ( rule__ModelItem__NameAssignment_1 )
            // InternalIntentSpecification.g:1812:2: rule__ModelItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1822:1: rule__ModelItem__Group__2 : rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3 ;
    public final void rule__ModelItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1826:1: ( rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3 )
            // InternalIntentSpecification.g:1827:2: rule__ModelItem__Group__2__Impl rule__ModelItem__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ModelItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1834:1: rule__ModelItem__Group__2__Impl : ( ( rule__ModelItem__DescAssignment_2 ) ) ;
    public final void rule__ModelItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1838:1: ( ( ( rule__ModelItem__DescAssignment_2 ) ) )
            // InternalIntentSpecification.g:1839:1: ( ( rule__ModelItem__DescAssignment_2 ) )
            {
            // InternalIntentSpecification.g:1839:1: ( ( rule__ModelItem__DescAssignment_2 ) )
            // InternalIntentSpecification.g:1840:1: ( rule__ModelItem__DescAssignment_2 )
            {
             before(grammarAccess.getModelItemAccess().getDescAssignment_2()); 
            // InternalIntentSpecification.g:1841:1: ( rule__ModelItem__DescAssignment_2 )
            // InternalIntentSpecification.g:1841:2: rule__ModelItem__DescAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1851:1: rule__ModelItem__Group__3 : rule__ModelItem__Group__3__Impl ;
    public final void rule__ModelItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1855:1: ( rule__ModelItem__Group__3__Impl )
            // InternalIntentSpecification.g:1856:2: rule__ModelItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1862:1: rule__ModelItem__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1866:1: ( ( ';' ) )
            // InternalIntentSpecification.g:1867:1: ( ';' )
            {
            // InternalIntentSpecification.g:1867:1: ( ';' )
            // InternalIntentSpecification.g:1868:1: ';'
            {
             before(grammarAccess.getModelItemAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalIntentSpecification.g:1889:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1893:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalIntentSpecification.g:1894:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1901:1: rule__ListItem__Group__0__Impl : ( ( rule__ListItem__TypeAssignment_0 ) ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1905:1: ( ( ( rule__ListItem__TypeAssignment_0 ) ) )
            // InternalIntentSpecification.g:1906:1: ( ( rule__ListItem__TypeAssignment_0 ) )
            {
            // InternalIntentSpecification.g:1906:1: ( ( rule__ListItem__TypeAssignment_0 ) )
            // InternalIntentSpecification.g:1907:1: ( rule__ListItem__TypeAssignment_0 )
            {
             before(grammarAccess.getListItemAccess().getTypeAssignment_0()); 
            // InternalIntentSpecification.g:1908:1: ( rule__ListItem__TypeAssignment_0 )
            // InternalIntentSpecification.g:1908:2: rule__ListItem__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1918:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1922:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // InternalIntentSpecification.g:1923:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1930:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__NameAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1934:1: ( ( ( rule__ListItem__NameAssignment_1 ) ) )
            // InternalIntentSpecification.g:1935:1: ( ( rule__ListItem__NameAssignment_1 ) )
            {
            // InternalIntentSpecification.g:1935:1: ( ( rule__ListItem__NameAssignment_1 ) )
            // InternalIntentSpecification.g:1936:1: ( rule__ListItem__NameAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getNameAssignment_1()); 
            // InternalIntentSpecification.g:1937:1: ( rule__ListItem__NameAssignment_1 )
            // InternalIntentSpecification.g:1937:2: rule__ListItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1947:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1951:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // InternalIntentSpecification.g:1952:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ListItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1959:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__DescAssignment_2 ) ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1963:1: ( ( ( rule__ListItem__DescAssignment_2 ) ) )
            // InternalIntentSpecification.g:1964:1: ( ( rule__ListItem__DescAssignment_2 ) )
            {
            // InternalIntentSpecification.g:1964:1: ( ( rule__ListItem__DescAssignment_2 ) )
            // InternalIntentSpecification.g:1965:1: ( rule__ListItem__DescAssignment_2 )
            {
             before(grammarAccess.getListItemAccess().getDescAssignment_2()); 
            // InternalIntentSpecification.g:1966:1: ( rule__ListItem__DescAssignment_2 )
            // InternalIntentSpecification.g:1966:2: rule__ListItem__DescAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1976:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl rule__ListItem__Group__4 ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1980:1: ( rule__ListItem__Group__3__Impl rule__ListItem__Group__4 )
            // InternalIntentSpecification.g:1981:2: rule__ListItem__Group__3__Impl rule__ListItem__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ListItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:1988:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__Group_3__0 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:1992:1: ( ( ( rule__ListItem__Group_3__0 )? ) )
            // InternalIntentSpecification.g:1993:1: ( ( rule__ListItem__Group_3__0 )? )
            {
            // InternalIntentSpecification.g:1993:1: ( ( rule__ListItem__Group_3__0 )? )
            // InternalIntentSpecification.g:1994:1: ( rule__ListItem__Group_3__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_3()); 
            // InternalIntentSpecification.g:1995:1: ( rule__ListItem__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIntentSpecification.g:1995:2: rule__ListItem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2005:1: rule__ListItem__Group__4 : rule__ListItem__Group__4__Impl rule__ListItem__Group__5 ;
    public final void rule__ListItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2009:1: ( rule__ListItem__Group__4__Impl rule__ListItem__Group__5 )
            // InternalIntentSpecification.g:2010:2: rule__ListItem__Group__4__Impl rule__ListItem__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ListItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2017:1: rule__ListItem__Group__4__Impl : ( ( rule__ListItem__Group_4__0 )? ) ;
    public final void rule__ListItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2021:1: ( ( ( rule__ListItem__Group_4__0 )? ) )
            // InternalIntentSpecification.g:2022:1: ( ( rule__ListItem__Group_4__0 )? )
            {
            // InternalIntentSpecification.g:2022:1: ( ( rule__ListItem__Group_4__0 )? )
            // InternalIntentSpecification.g:2023:1: ( rule__ListItem__Group_4__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_4()); 
            // InternalIntentSpecification.g:2024:1: ( rule__ListItem__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIntentSpecification.g:2024:2: rule__ListItem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2034:1: rule__ListItem__Group__5 : rule__ListItem__Group__5__Impl rule__ListItem__Group__6 ;
    public final void rule__ListItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2038:1: ( rule__ListItem__Group__5__Impl rule__ListItem__Group__6 )
            // InternalIntentSpecification.g:2039:2: rule__ListItem__Group__5__Impl rule__ListItem__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ListItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2046:1: rule__ListItem__Group__5__Impl : ( ( rule__ListItem__Group_5__0 )? ) ;
    public final void rule__ListItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2050:1: ( ( ( rule__ListItem__Group_5__0 )? ) )
            // InternalIntentSpecification.g:2051:1: ( ( rule__ListItem__Group_5__0 )? )
            {
            // InternalIntentSpecification.g:2051:1: ( ( rule__ListItem__Group_5__0 )? )
            // InternalIntentSpecification.g:2052:1: ( rule__ListItem__Group_5__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_5()); 
            // InternalIntentSpecification.g:2053:1: ( rule__ListItem__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIntentSpecification.g:2053:2: rule__ListItem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2063:1: rule__ListItem__Group__6 : rule__ListItem__Group__6__Impl ;
    public final void rule__ListItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2067:1: ( rule__ListItem__Group__6__Impl )
            // InternalIntentSpecification.g:2068:2: rule__ListItem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2074:1: rule__ListItem__Group__6__Impl : ( ';' ) ;
    public final void rule__ListItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2078:1: ( ( ';' ) )
            // InternalIntentSpecification.g:2079:1: ( ';' )
            {
            // InternalIntentSpecification.g:2079:1: ( ';' )
            // InternalIntentSpecification.g:2080:1: ';'
            {
             before(grammarAccess.getListItemAccess().getSemicolonKeyword_6()); 
            match(input,47,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2107:1: rule__ListItem__Group_3__0 : rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1 ;
    public final void rule__ListItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2111:1: ( rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1 )
            // InternalIntentSpecification.g:2112:2: rule__ListItem__Group_3__0__Impl rule__ListItem__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ListItem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2119:1: rule__ListItem__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ListItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2123:1: ( ( '{' ) )
            // InternalIntentSpecification.g:2124:1: ( '{' )
            {
            // InternalIntentSpecification.g:2124:1: ( '{' )
            // InternalIntentSpecification.g:2125:1: '{'
            {
             before(grammarAccess.getListItemAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2138:1: rule__ListItem__Group_3__1 : rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2 ;
    public final void rule__ListItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2142:1: ( rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2 )
            // InternalIntentSpecification.g:2143:2: rule__ListItem__Group_3__1__Impl rule__ListItem__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__ListItem__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2150:1: rule__ListItem__Group_3__1__Impl : ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) ) ;
    public final void rule__ListItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2154:1: ( ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) ) )
            // InternalIntentSpecification.g:2155:1: ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) )
            {
            // InternalIntentSpecification.g:2155:1: ( ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* ) )
            // InternalIntentSpecification.g:2156:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 ) ) ( ( rule__ListItem__DocReferencesAssignment_3_1 )* )
            {
            // InternalIntentSpecification.g:2156:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 ) )
            // InternalIntentSpecification.g:2157:1: ( rule__ListItem__DocReferencesAssignment_3_1 )
            {
             before(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 
            // InternalIntentSpecification.g:2158:1: ( rule__ListItem__DocReferencesAssignment_3_1 )
            // InternalIntentSpecification.g:2158:2: rule__ListItem__DocReferencesAssignment_3_1
            {
            pushFollow(FOLLOW_23);
            rule__ListItem__DocReferencesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 

            }

            // InternalIntentSpecification.g:2161:1: ( ( rule__ListItem__DocReferencesAssignment_3_1 )* )
            // InternalIntentSpecification.g:2162:1: ( rule__ListItem__DocReferencesAssignment_3_1 )*
            {
             before(grammarAccess.getListItemAccess().getDocReferencesAssignment_3_1()); 
            // InternalIntentSpecification.g:2163:1: ( rule__ListItem__DocReferencesAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIntentSpecification.g:2163:2: rule__ListItem__DocReferencesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalIntentSpecification.g:2174:1: rule__ListItem__Group_3__2 : rule__ListItem__Group_3__2__Impl ;
    public final void rule__ListItem__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2178:1: ( rule__ListItem__Group_3__2__Impl )
            // InternalIntentSpecification.g:2179:2: rule__ListItem__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2185:1: rule__ListItem__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ListItem__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2189:1: ( ( '}' ) )
            // InternalIntentSpecification.g:2190:1: ( '}' )
            {
            // InternalIntentSpecification.g:2190:1: ( '}' )
            // InternalIntentSpecification.g:2191:1: '}'
            {
             before(grammarAccess.getListItemAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2210:1: rule__ListItem__Group_4__0 : rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1 ;
    public final void rule__ListItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2214:1: ( rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1 )
            // InternalIntentSpecification.g:2215:2: rule__ListItem__Group_4__0__Impl rule__ListItem__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ListItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2222:1: rule__ListItem__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2226:1: ( ( '(' ) )
            // InternalIntentSpecification.g:2227:1: ( '(' )
            {
            // InternalIntentSpecification.g:2227:1: ( '(' )
            // InternalIntentSpecification.g:2228:1: '('
            {
             before(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2241:1: rule__ListItem__Group_4__1 : rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2 ;
    public final void rule__ListItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2245:1: ( rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2 )
            // InternalIntentSpecification.g:2246:2: rule__ListItem__Group_4__1__Impl rule__ListItem__Group_4__2
            {
            pushFollow(FOLLOW_24);
            rule__ListItem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2253:1: rule__ListItem__Group_4__1__Impl : ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) ) ;
    public final void rule__ListItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2257:1: ( ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) ) )
            // InternalIntentSpecification.g:2258:1: ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) )
            {
            // InternalIntentSpecification.g:2258:1: ( ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* ) )
            // InternalIntentSpecification.g:2259:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) ) ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* )
            {
            // InternalIntentSpecification.g:2259:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 ) )
            // InternalIntentSpecification.g:2260:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )
            {
             before(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 
            // InternalIntentSpecification.g:2261:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )
            // InternalIntentSpecification.g:2261:2: rule__ListItem__ItemReferencesAssignment_4_1
            {
            pushFollow(FOLLOW_23);
            rule__ListItem__ItemReferencesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 

            }

            // InternalIntentSpecification.g:2264:1: ( ( rule__ListItem__ItemReferencesAssignment_4_1 )* )
            // InternalIntentSpecification.g:2265:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )*
            {
             before(grammarAccess.getListItemAccess().getItemReferencesAssignment_4_1()); 
            // InternalIntentSpecification.g:2266:1: ( rule__ListItem__ItemReferencesAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIntentSpecification.g:2266:2: rule__ListItem__ItemReferencesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalIntentSpecification.g:2277:1: rule__ListItem__Group_4__2 : rule__ListItem__Group_4__2__Impl ;
    public final void rule__ListItem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2281:1: ( rule__ListItem__Group_4__2__Impl )
            // InternalIntentSpecification.g:2282:2: rule__ListItem__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2288:1: rule__ListItem__Group_4__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2292:1: ( ( ')' ) )
            // InternalIntentSpecification.g:2293:1: ( ')' )
            {
            // InternalIntentSpecification.g:2293:1: ( ')' )
            // InternalIntentSpecification.g:2294:1: ')'
            {
             before(grammarAccess.getListItemAccess().getRightParenthesisKeyword_4_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2313:1: rule__ListItem__Group_5__0 : rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1 ;
    public final void rule__ListItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2317:1: ( rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1 )
            // InternalIntentSpecification.g:2318:2: rule__ListItem__Group_5__0__Impl rule__ListItem__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ListItem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2325:1: rule__ListItem__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ListItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2329:1: ( ( '[' ) )
            // InternalIntentSpecification.g:2330:1: ( '[' )
            {
            // InternalIntentSpecification.g:2330:1: ( '[' )
            // InternalIntentSpecification.g:2331:1: '['
            {
             before(grammarAccess.getListItemAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2344:1: rule__ListItem__Group_5__1 : rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2 ;
    public final void rule__ListItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2348:1: ( rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2 )
            // InternalIntentSpecification.g:2349:2: rule__ListItem__Group_5__1__Impl rule__ListItem__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__ListItem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2356:1: rule__ListItem__Group_5__1__Impl : ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) ) ;
    public final void rule__ListItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2360:1: ( ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) ) )
            // InternalIntentSpecification.g:2361:1: ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) )
            {
            // InternalIntentSpecification.g:2361:1: ( ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* ) )
            // InternalIntentSpecification.g:2362:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) ) ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* )
            {
            // InternalIntentSpecification.g:2362:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 ) )
            // InternalIntentSpecification.g:2363:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )
            {
             before(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 
            // InternalIntentSpecification.g:2364:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )
            // InternalIntentSpecification.g:2364:2: rule__ListItem__ModelReferencesAssignment_5_1
            {
            pushFollow(FOLLOW_23);
            rule__ListItem__ModelReferencesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 

            }

            // InternalIntentSpecification.g:2367:1: ( ( rule__ListItem__ModelReferencesAssignment_5_1 )* )
            // InternalIntentSpecification.g:2368:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )*
            {
             before(grammarAccess.getListItemAccess().getModelReferencesAssignment_5_1()); 
            // InternalIntentSpecification.g:2369:1: ( rule__ListItem__ModelReferencesAssignment_5_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIntentSpecification.g:2369:2: rule__ListItem__ModelReferencesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalIntentSpecification.g:2380:1: rule__ListItem__Group_5__2 : rule__ListItem__Group_5__2__Impl ;
    public final void rule__ListItem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2384:1: ( rule__ListItem__Group_5__2__Impl )
            // InternalIntentSpecification.g:2385:2: rule__ListItem__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2391:1: rule__ListItem__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ListItem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2395:1: ( ( ']' ) )
            // InternalIntentSpecification.g:2396:1: ( ']' )
            {
            // InternalIntentSpecification.g:2396:1: ( ']' )
            // InternalIntentSpecification.g:2397:1: ']'
            {
             before(grammarAccess.getListItemAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2417:1: rule__Specification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Specification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2421:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2422:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2422:1: ( RULE_ID )
            // InternalIntentSpecification.g:2423:1: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2432:1: rule__Specification__RefinementsAssignment_2 : ( ruleRefinement ) ;
    public final void rule__Specification__RefinementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2436:1: ( ( ruleRefinement ) )
            // InternalIntentSpecification.g:2437:1: ( ruleRefinement )
            {
            // InternalIntentSpecification.g:2437:1: ( ruleRefinement )
            // InternalIntentSpecification.g:2438:1: ruleRefinement
            {
             before(grammarAccess.getSpecificationAccess().getRefinementsRefinementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2447:1: rule__Refinement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refinement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2451:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2452:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2452:1: ( RULE_ID )
            // InternalIntentSpecification.g:2453:1: RULE_ID
            {
             before(grammarAccess.getRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2462:1: rule__Refinement__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Refinement__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2466:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2467:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2467:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2468:1: RULE_STRING
            {
             before(grammarAccess.getRefinementAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2477:1: rule__Refinement__IntentsAssignment_3 : ( ruleIntent ) ;
    public final void rule__Refinement__IntentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2481:1: ( ( ruleIntent ) )
            // InternalIntentSpecification.g:2482:1: ( ruleIntent )
            {
            // InternalIntentSpecification.g:2482:1: ( ruleIntent )
            // InternalIntentSpecification.g:2483:1: ruleIntent
            {
             before(grammarAccess.getRefinementAccess().getIntentsIntentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2492:1: rule__Intent__TypeAssignment_0 : ( ruleIntentType ) ;
    public final void rule__Intent__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2496:1: ( ( ruleIntentType ) )
            // InternalIntentSpecification.g:2497:1: ( ruleIntentType )
            {
            // InternalIntentSpecification.g:2497:1: ( ruleIntentType )
            // InternalIntentSpecification.g:2498:1: ruleIntentType
            {
             before(grammarAccess.getIntentAccess().getTypeIntentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2507:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2511:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2512:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2512:1: ( RULE_ID )
            // InternalIntentSpecification.g:2513:1: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2522:1: rule__Intent__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Intent__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2526:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2527:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2527:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2528:1: RULE_STRING
            {
             before(grammarAccess.getIntentAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2537:1: rule__Intent__DecompositionsAssignment_3 : ( ruleDecomposition ) ;
    public final void rule__Intent__DecompositionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2541:1: ( ( ruleDecomposition ) )
            // InternalIntentSpecification.g:2542:1: ( ruleDecomposition )
            {
            // InternalIntentSpecification.g:2542:1: ( ruleDecomposition )
            // InternalIntentSpecification.g:2543:1: ruleDecomposition
            {
             before(grammarAccess.getIntentAccess().getDecompositionsDecompositionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2552:1: rule__IntentType__TypeNameAssignment : ( ( rule__IntentType__TypeNameAlternatives_0 ) ) ;
    public final void rule__IntentType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2556:1: ( ( ( rule__IntentType__TypeNameAlternatives_0 ) ) )
            // InternalIntentSpecification.g:2557:1: ( ( rule__IntentType__TypeNameAlternatives_0 ) )
            {
            // InternalIntentSpecification.g:2557:1: ( ( rule__IntentType__TypeNameAlternatives_0 ) )
            // InternalIntentSpecification.g:2558:1: ( rule__IntentType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getIntentTypeAccess().getTypeNameAlternatives_0()); 
            // InternalIntentSpecification.g:2559:1: ( rule__IntentType__TypeNameAlternatives_0 )
            // InternalIntentSpecification.g:2559:2: rule__IntentType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2568:1: rule__Decomposition__TypeAssignment_0 : ( ruleDecompositionType ) ;
    public final void rule__Decomposition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2572:1: ( ( ruleDecompositionType ) )
            // InternalIntentSpecification.g:2573:1: ( ruleDecompositionType )
            {
            // InternalIntentSpecification.g:2573:1: ( ruleDecompositionType )
            // InternalIntentSpecification.g:2574:1: ruleDecompositionType
            {
             before(grammarAccess.getDecompositionAccess().getTypeDecompositionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2583:1: rule__Decomposition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decomposition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2587:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2588:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2588:1: ( RULE_ID )
            // InternalIntentSpecification.g:2589:1: RULE_ID
            {
             before(grammarAccess.getDecompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2598:1: rule__Decomposition__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Decomposition__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2602:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2603:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2603:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2604:1: RULE_STRING
            {
             before(grammarAccess.getDecompositionAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2613:1: rule__Decomposition__DocumentsAssignment_3_1 : ( ruleDocument ) ;
    public final void rule__Decomposition__DocumentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2617:1: ( ( ruleDocument ) )
            // InternalIntentSpecification.g:2618:1: ( ruleDocument )
            {
            // InternalIntentSpecification.g:2618:1: ( ruleDocument )
            // InternalIntentSpecification.g:2619:1: ruleDocument
            {
             before(grammarAccess.getDecompositionAccess().getDocumentsDocumentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2628:1: rule__Decomposition__ModelsAssignment_4_1 : ( ruleModelItem ) ;
    public final void rule__Decomposition__ModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2632:1: ( ( ruleModelItem ) )
            // InternalIntentSpecification.g:2633:1: ( ruleModelItem )
            {
            // InternalIntentSpecification.g:2633:1: ( ruleModelItem )
            // InternalIntentSpecification.g:2634:1: ruleModelItem
            {
             before(grammarAccess.getDecompositionAccess().getModelsModelItemParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2643:1: rule__Decomposition__ItemsAssignment_5_1 : ( ruleListItem ) ;
    public final void rule__Decomposition__ItemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2647:1: ( ( ruleListItem ) )
            // InternalIntentSpecification.g:2648:1: ( ruleListItem )
            {
            // InternalIntentSpecification.g:2648:1: ( ruleListItem )
            // InternalIntentSpecification.g:2649:1: ruleListItem
            {
             before(grammarAccess.getDecompositionAccess().getItemsListItemParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2658:1: rule__DecompositionType__TypeNameAssignment : ( ( rule__DecompositionType__TypeNameAlternatives_0 ) ) ;
    public final void rule__DecompositionType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2662:1: ( ( ( rule__DecompositionType__TypeNameAlternatives_0 ) ) )
            // InternalIntentSpecification.g:2663:1: ( ( rule__DecompositionType__TypeNameAlternatives_0 ) )
            {
            // InternalIntentSpecification.g:2663:1: ( ( rule__DecompositionType__TypeNameAlternatives_0 ) )
            // InternalIntentSpecification.g:2664:1: ( rule__DecompositionType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getDecompositionTypeAccess().getTypeNameAlternatives_0()); 
            // InternalIntentSpecification.g:2665:1: ( rule__DecompositionType__TypeNameAlternatives_0 )
            // InternalIntentSpecification.g:2665:2: rule__DecompositionType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2674:1: rule__Document__EntriesAssignment_1 : ( ruleDocItem ) ;
    public final void rule__Document__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2678:1: ( ( ruleDocItem ) )
            // InternalIntentSpecification.g:2679:1: ( ruleDocItem )
            {
            // InternalIntentSpecification.g:2679:1: ( ruleDocItem )
            // InternalIntentSpecification.g:2680:1: ruleDocItem
            {
             before(grammarAccess.getDocumentAccess().getEntriesDocItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2689:1: rule__DocItemType__TypeNameAssignment : ( ( rule__DocItemType__TypeNameAlternatives_0 ) ) ;
    public final void rule__DocItemType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2693:1: ( ( ( rule__DocItemType__TypeNameAlternatives_0 ) ) )
            // InternalIntentSpecification.g:2694:1: ( ( rule__DocItemType__TypeNameAlternatives_0 ) )
            {
            // InternalIntentSpecification.g:2694:1: ( ( rule__DocItemType__TypeNameAlternatives_0 ) )
            // InternalIntentSpecification.g:2695:1: ( rule__DocItemType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getDocItemTypeAccess().getTypeNameAlternatives_0()); 
            // InternalIntentSpecification.g:2696:1: ( rule__DocItemType__TypeNameAlternatives_0 )
            // InternalIntentSpecification.g:2696:2: rule__DocItemType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2705:1: rule__DocItem__TypeAssignment_0 : ( ruleDocItemType ) ;
    public final void rule__DocItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2709:1: ( ( ruleDocItemType ) )
            // InternalIntentSpecification.g:2710:1: ( ruleDocItemType )
            {
            // InternalIntentSpecification.g:2710:1: ( ruleDocItemType )
            // InternalIntentSpecification.g:2711:1: ruleDocItemType
            {
             before(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2720:1: rule__DocItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DocItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2724:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2725:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2725:1: ( RULE_ID )
            // InternalIntentSpecification.g:2726:1: RULE_ID
            {
             before(grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2735:1: rule__DocItem__RefAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DocItem__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2739:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2740:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2740:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2741:1: RULE_STRING
            {
             before(grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2750:1: rule__ModelType__TypeNameAssignment : ( ( rule__ModelType__TypeNameAlternatives_0 ) ) ;
    public final void rule__ModelType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2754:1: ( ( ( rule__ModelType__TypeNameAlternatives_0 ) ) )
            // InternalIntentSpecification.g:2755:1: ( ( rule__ModelType__TypeNameAlternatives_0 ) )
            {
            // InternalIntentSpecification.g:2755:1: ( ( rule__ModelType__TypeNameAlternatives_0 ) )
            // InternalIntentSpecification.g:2756:1: ( rule__ModelType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getModelTypeAccess().getTypeNameAlternatives_0()); 
            // InternalIntentSpecification.g:2757:1: ( rule__ModelType__TypeNameAlternatives_0 )
            // InternalIntentSpecification.g:2757:2: rule__ModelType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2766:1: rule__ModelItem__TypeAssignment_0 : ( ruleModelType ) ;
    public final void rule__ModelItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2770:1: ( ( ruleModelType ) )
            // InternalIntentSpecification.g:2771:1: ( ruleModelType )
            {
            // InternalIntentSpecification.g:2771:1: ( ruleModelType )
            // InternalIntentSpecification.g:2772:1: ruleModelType
            {
             before(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2781:1: rule__ModelItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2785:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2786:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2786:1: ( RULE_ID )
            // InternalIntentSpecification.g:2787:1: RULE_ID
            {
             before(grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2796:1: rule__ModelItem__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ModelItem__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2800:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2801:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2801:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2802:1: RULE_STRING
            {
             before(grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2811:1: rule__ListItemType__TypeNameAssignment : ( ( rule__ListItemType__TypeNameAlternatives_0 ) ) ;
    public final void rule__ListItemType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2815:1: ( ( ( rule__ListItemType__TypeNameAlternatives_0 ) ) )
            // InternalIntentSpecification.g:2816:1: ( ( rule__ListItemType__TypeNameAlternatives_0 ) )
            {
            // InternalIntentSpecification.g:2816:1: ( ( rule__ListItemType__TypeNameAlternatives_0 ) )
            // InternalIntentSpecification.g:2817:1: ( rule__ListItemType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getListItemTypeAccess().getTypeNameAlternatives_0()); 
            // InternalIntentSpecification.g:2818:1: ( rule__ListItemType__TypeNameAlternatives_0 )
            // InternalIntentSpecification.g:2818:2: rule__ListItemType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2827:1: rule__ListItem__TypeAssignment_0 : ( ruleListItemType ) ;
    public final void rule__ListItem__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2831:1: ( ( ruleListItemType ) )
            // InternalIntentSpecification.g:2832:1: ( ruleListItemType )
            {
            // InternalIntentSpecification.g:2832:1: ( ruleListItemType )
            // InternalIntentSpecification.g:2833:1: ruleListItemType
            {
             before(grammarAccess.getListItemAccess().getTypeListItemTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalIntentSpecification.g:2842:1: rule__ListItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ListItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2846:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2847:1: ( RULE_ID )
            {
            // InternalIntentSpecification.g:2847:1: ( RULE_ID )
            // InternalIntentSpecification.g:2848:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2857:1: rule__ListItem__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListItem__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2861:1: ( ( RULE_STRING ) )
            // InternalIntentSpecification.g:2862:1: ( RULE_STRING )
            {
            // InternalIntentSpecification.g:2862:1: ( RULE_STRING )
            // InternalIntentSpecification.g:2863:1: RULE_STRING
            {
             before(grammarAccess.getListItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2872:1: rule__ListItem__DocReferencesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__DocReferencesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2876:1: ( ( ( RULE_ID ) ) )
            // InternalIntentSpecification.g:2877:1: ( ( RULE_ID ) )
            {
            // InternalIntentSpecification.g:2877:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2878:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getDocReferencesDocItemCrossReference_3_1_0()); 
            // InternalIntentSpecification.g:2879:1: ( RULE_ID )
            // InternalIntentSpecification.g:2880:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getDocReferencesDocItemIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2891:1: rule__ListItem__ItemReferencesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__ItemReferencesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2895:1: ( ( ( RULE_ID ) ) )
            // InternalIntentSpecification.g:2896:1: ( ( RULE_ID ) )
            {
            // InternalIntentSpecification.g:2896:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2897:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getItemReferencesListItemCrossReference_4_1_0()); 
            // InternalIntentSpecification.g:2898:1: ( RULE_ID )
            // InternalIntentSpecification.g:2899:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getItemReferencesListItemIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalIntentSpecification.g:2910:1: rule__ListItem__ModelReferencesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListItem__ModelReferencesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIntentSpecification.g:2914:1: ( ( ( RULE_ID ) ) )
            // InternalIntentSpecification.g:2915:1: ( ( RULE_ID ) )
            {
            // InternalIntentSpecification.g:2915:1: ( ( RULE_ID ) )
            // InternalIntentSpecification.g:2916:1: ( RULE_ID )
            {
             before(grammarAccess.getListItemAccess().getModelReferencesModelItemCrossReference_5_1_0()); 
            // InternalIntentSpecification.g:2917:1: ( RULE_ID )
            // InternalIntentSpecification.g:2918:1: RULE_ID
            {
             before(grammarAccess.getListItemAccess().getModelReferencesModelItemIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001007E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000407800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001FC00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000AA0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});

}