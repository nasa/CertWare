package net.certware.planning.cpn.ui.contentassist.antlr.internal; 

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
import net.certware.planning.cpn.services.CpnDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpnDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argumentmodel'", "'cost'", "'duration'", "'team'", "'facility'", "'plan'", "'element'", "'estimated'", "'('", "')'", "'actual'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalCpnDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g"; }


     
     	private CpnDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CpnDslGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRulePlans
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:61:1: entryRulePlans : rulePlans EOF ;
    public final void entryRulePlans() throws RecognitionException {
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:62:1: ( rulePlans EOF )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:63:1: rulePlans EOF
            {
             before(grammarAccess.getPlansRule()); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans61);
            rulePlans();
            _fsp--;

             after(grammarAccess.getPlansRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlans68); 

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
    // $ANTLR end entryRulePlans


    // $ANTLR start rulePlans
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:70:1: rulePlans : ( ( rule__Plans__Group__0 ) ) ;
    public final void rulePlans() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:74:2: ( ( ( rule__Plans__Group__0 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:75:1: ( ( rule__Plans__Group__0 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:75:1: ( ( rule__Plans__Group__0 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:76:1: ( rule__Plans__Group__0 )
            {
             before(grammarAccess.getPlansAccess().getGroup()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:77:1: ( rule__Plans__Group__0 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:77:2: rule__Plans__Group__0
            {
            pushFollow(FOLLOW_rule__Plans__Group__0_in_rulePlans94);
            rule__Plans__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPlansAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlans


    // $ANTLR start entryRuleArgumentModels
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:89:1: entryRuleArgumentModels : ruleArgumentModels EOF ;
    public final void entryRuleArgumentModels() throws RecognitionException {
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:90:1: ( ruleArgumentModels EOF )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:91:1: ruleArgumentModels EOF
            {
             before(grammarAccess.getArgumentModelsRule()); 
            pushFollow(FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels121);
            ruleArgumentModels();
            _fsp--;

             after(grammarAccess.getArgumentModelsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentModels128); 

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
    // $ANTLR end entryRuleArgumentModels


    // $ANTLR start ruleArgumentModels
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:98:1: ruleArgumentModels : ( ( rule__ArgumentModels__Group__0 ) ) ;
    public final void ruleArgumentModels() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:102:2: ( ( ( rule__ArgumentModels__Group__0 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:103:1: ( ( rule__ArgumentModels__Group__0 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:103:1: ( ( rule__ArgumentModels__Group__0 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:104:1: ( rule__ArgumentModels__Group__0 )
            {
             before(grammarAccess.getArgumentModelsAccess().getGroup()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:105:1: ( rule__ArgumentModels__Group__0 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:105:2: rule__ArgumentModels__Group__0
            {
            pushFollow(FOLLOW_rule__ArgumentModels__Group__0_in_ruleArgumentModels154);
            rule__ArgumentModels__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentModelsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgumentModels


    // $ANTLR start entryRuleAllocation
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:117:1: entryRuleAllocation : ruleAllocation EOF ;
    public final void entryRuleAllocation() throws RecognitionException {
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:118:1: ( ruleAllocation EOF )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:119:1: ruleAllocation EOF
            {
             before(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_ruleAllocation_in_entryRuleAllocation181);
            ruleAllocation();
            _fsp--;

             after(grammarAccess.getAllocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllocation188); 

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
    // $ANTLR end entryRuleAllocation


    // $ANTLR start ruleAllocation
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:126:1: ruleAllocation : ( ( rule__Allocation__Group__0 ) ) ;
    public final void ruleAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:130:2: ( ( ( rule__Allocation__Group__0 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:131:1: ( ( rule__Allocation__Group__0 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:131:1: ( ( rule__Allocation__Group__0 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:132:1: ( rule__Allocation__Group__0 )
            {
             before(grammarAccess.getAllocationAccess().getGroup()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:133:1: ( rule__Allocation__Group__0 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:133:2: rule__Allocation__Group__0
            {
            pushFollow(FOLLOW_rule__Allocation__Group__0_in_ruleAllocation214);
            rule__Allocation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAllocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAllocation


    // $ANTLR start entryRulePlan
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:145:1: entryRulePlan : rulePlan EOF ;
    public final void entryRulePlan() throws RecognitionException {
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:146:1: ( rulePlan EOF )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:147:1: rulePlan EOF
            {
             before(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan241);
            rulePlan();
            _fsp--;

             after(grammarAccess.getPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan248); 

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
    // $ANTLR end entryRulePlan


    // $ANTLR start rulePlan
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:154:1: rulePlan : ( ( rule__Plan__Group__0 ) ) ;
    public final void rulePlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:158:2: ( ( ( rule__Plan__Group__0 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:159:1: ( ( rule__Plan__Group__0 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:159:1: ( ( rule__Plan__Group__0 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:160:1: ( rule__Plan__Group__0 )
            {
             before(grammarAccess.getPlanAccess().getGroup()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:161:1: ( rule__Plan__Group__0 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:161:2: rule__Plan__Group__0
            {
            pushFollow(FOLLOW_rule__Plan__Group__0_in_rulePlan274);
            rule__Plan__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPlanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlan


    // $ANTLR start rule__Plans__Group__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:175:1: rule__Plans__Group__0 : rule__Plans__Group__0__Impl rule__Plans__Group__1 ;
    public final void rule__Plans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:179:1: ( rule__Plans__Group__0__Impl rule__Plans__Group__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:180:2: rule__Plans__Group__0__Impl rule__Plans__Group__1
            {
            pushFollow(FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__0308);
            rule__Plans__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__0311);
            rule__Plans__Group__1();
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
    // $ANTLR end rule__Plans__Group__0


    // $ANTLR start rule__Plans__Group__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:187:1: rule__Plans__Group__0__Impl : ( ( rule__Plans__ArgumentmodelsAssignment_0 )* ) ;
    public final void rule__Plans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:191:1: ( ( ( rule__Plans__ArgumentmodelsAssignment_0 )* ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:192:1: ( ( rule__Plans__ArgumentmodelsAssignment_0 )* )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:192:1: ( ( rule__Plans__ArgumentmodelsAssignment_0 )* )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:193:1: ( rule__Plans__ArgumentmodelsAssignment_0 )*
            {
             before(grammarAccess.getPlansAccess().getArgumentmodelsAssignment_0()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:194:1: ( rule__Plans__ArgumentmodelsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:194:2: rule__Plans__ArgumentmodelsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Plans__ArgumentmodelsAssignment_0_in_rule__Plans__Group__0__Impl338);
            	    rule__Plans__ArgumentmodelsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPlansAccess().getArgumentmodelsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plans__Group__0__Impl


    // $ANTLR start rule__Plans__Group__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:204:1: rule__Plans__Group__1 : rule__Plans__Group__1__Impl ;
    public final void rule__Plans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:208:1: ( rule__Plans__Group__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:209:2: rule__Plans__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__1369);
            rule__Plans__Group__1__Impl();
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
    // $ANTLR end rule__Plans__Group__1


    // $ANTLR start rule__Plans__Group__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:215:1: rule__Plans__Group__1__Impl : ( ( rule__Plans__PlansAssignment_1 )* ) ;
    public final void rule__Plans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:219:1: ( ( ( rule__Plans__PlansAssignment_1 )* ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:220:1: ( ( rule__Plans__PlansAssignment_1 )* )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:220:1: ( ( rule__Plans__PlansAssignment_1 )* )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:221:1: ( rule__Plans__PlansAssignment_1 )*
            {
             before(grammarAccess.getPlansAccess().getPlansAssignment_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:222:1: ( rule__Plans__PlansAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:222:2: rule__Plans__PlansAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl396);
            	    rule__Plans__PlansAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPlansAccess().getPlansAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plans__Group__1__Impl


    // $ANTLR start rule__ArgumentModels__Group__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:236:1: rule__ArgumentModels__Group__0 : rule__ArgumentModels__Group__0__Impl rule__ArgumentModels__Group__1 ;
    public final void rule__ArgumentModels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:240:1: ( rule__ArgumentModels__Group__0__Impl rule__ArgumentModels__Group__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:241:2: rule__ArgumentModels__Group__0__Impl rule__ArgumentModels__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentModels__Group__0__Impl_in_rule__ArgumentModels__Group__0431);
            rule__ArgumentModels__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentModels__Group__1_in_rule__ArgumentModels__Group__0434);
            rule__ArgumentModels__Group__1();
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
    // $ANTLR end rule__ArgumentModels__Group__0


    // $ANTLR start rule__ArgumentModels__Group__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:248:1: rule__ArgumentModels__Group__0__Impl : ( 'argumentmodel' ) ;
    public final void rule__ArgumentModels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:252:1: ( ( 'argumentmodel' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:253:1: ( 'argumentmodel' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:253:1: ( 'argumentmodel' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:254:1: 'argumentmodel'
            {
             before(grammarAccess.getArgumentModelsAccess().getArgumentmodelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ArgumentModels__Group__0__Impl462); 
             after(grammarAccess.getArgumentModelsAccess().getArgumentmodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentModels__Group__0__Impl


    // $ANTLR start rule__ArgumentModels__Group__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:267:1: rule__ArgumentModels__Group__1 : rule__ArgumentModels__Group__1__Impl ;
    public final void rule__ArgumentModels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:271:1: ( rule__ArgumentModels__Group__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:272:2: rule__ArgumentModels__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentModels__Group__1__Impl_in_rule__ArgumentModels__Group__1493);
            rule__ArgumentModels__Group__1__Impl();
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
    // $ANTLR end rule__ArgumentModels__Group__1


    // $ANTLR start rule__ArgumentModels__Group__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:278:1: rule__ArgumentModels__Group__1__Impl : ( ( rule__ArgumentModels__ImportURIAssignment_1 ) ) ;
    public final void rule__ArgumentModels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:282:1: ( ( ( rule__ArgumentModels__ImportURIAssignment_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:283:1: ( ( rule__ArgumentModels__ImportURIAssignment_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:283:1: ( ( rule__ArgumentModels__ImportURIAssignment_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:284:1: ( rule__ArgumentModels__ImportURIAssignment_1 )
            {
             before(grammarAccess.getArgumentModelsAccess().getImportURIAssignment_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:285:1: ( rule__ArgumentModels__ImportURIAssignment_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:285:2: rule__ArgumentModels__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ArgumentModels__ImportURIAssignment_1_in_rule__ArgumentModels__Group__1__Impl520);
            rule__ArgumentModels__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentModelsAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentModels__Group__1__Impl


    // $ANTLR start rule__Allocation__Group__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:299:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:303:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:304:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
            {
            pushFollow(FOLLOW_rule__Allocation__Group__0__Impl_in_rule__Allocation__Group__0554);
            rule__Allocation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group__1_in_rule__Allocation__Group__0557);
            rule__Allocation__Group__1();
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
    // $ANTLR end rule__Allocation__Group__0


    // $ANTLR start rule__Allocation__Group__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:311:1: rule__Allocation__Group__0__Impl : ( () ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:315:1: ( ( () ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:316:1: ( () )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:316:1: ( () )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:317:1: ()
            {
             before(grammarAccess.getAllocationAccess().getAllocationAction_0()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:318:1: ()
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:320:1: 
            {
            }

             after(grammarAccess.getAllocationAccess().getAllocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group__0__Impl


    // $ANTLR start rule__Allocation__Group__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:330:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:334:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:335:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
            {
            pushFollow(FOLLOW_rule__Allocation__Group__1__Impl_in_rule__Allocation__Group__1615);
            rule__Allocation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group__2_in_rule__Allocation__Group__1618);
            rule__Allocation__Group__2();
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
    // $ANTLR end rule__Allocation__Group__1


    // $ANTLR start rule__Allocation__Group__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:342:1: rule__Allocation__Group__1__Impl : ( ( rule__Allocation__Group_1__0 )? ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:346:1: ( ( ( rule__Allocation__Group_1__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:347:1: ( ( rule__Allocation__Group_1__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:347:1: ( ( rule__Allocation__Group_1__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:348:1: ( rule__Allocation__Group_1__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:349:1: ( rule__Allocation__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:349:2: rule__Allocation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Allocation__Group_1__0_in_rule__Allocation__Group__1__Impl645);
                    rule__Allocation__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group__1__Impl


    // $ANTLR start rule__Allocation__Group__2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:359:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:363:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:364:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
            {
            pushFollow(FOLLOW_rule__Allocation__Group__2__Impl_in_rule__Allocation__Group__2676);
            rule__Allocation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group__3_in_rule__Allocation__Group__2679);
            rule__Allocation__Group__3();
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
    // $ANTLR end rule__Allocation__Group__2


    // $ANTLR start rule__Allocation__Group__2__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:371:1: rule__Allocation__Group__2__Impl : ( ( rule__Allocation__Group_2__0 )? ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:375:1: ( ( ( rule__Allocation__Group_2__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:376:1: ( ( rule__Allocation__Group_2__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:376:1: ( ( rule__Allocation__Group_2__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:377:1: ( rule__Allocation__Group_2__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_2()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:378:1: ( rule__Allocation__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:378:2: rule__Allocation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Allocation__Group_2__0_in_rule__Allocation__Group__2__Impl706);
                    rule__Allocation__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group__2__Impl


    // $ANTLR start rule__Allocation__Group__3
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:388:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:392:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:393:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
            {
            pushFollow(FOLLOW_rule__Allocation__Group__3__Impl_in_rule__Allocation__Group__3737);
            rule__Allocation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group__4_in_rule__Allocation__Group__3740);
            rule__Allocation__Group__4();
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
    // $ANTLR end rule__Allocation__Group__3


    // $ANTLR start rule__Allocation__Group__3__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:400:1: rule__Allocation__Group__3__Impl : ( ( rule__Allocation__Group_3__0 )? ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:404:1: ( ( ( rule__Allocation__Group_3__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:405:1: ( ( rule__Allocation__Group_3__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:405:1: ( ( rule__Allocation__Group_3__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:406:1: ( rule__Allocation__Group_3__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_3()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:407:1: ( rule__Allocation__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:407:2: rule__Allocation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Allocation__Group_3__0_in_rule__Allocation__Group__3__Impl767);
                    rule__Allocation__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group__3__Impl


    // $ANTLR start rule__Allocation__Group__4
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:417:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:421:1: ( rule__Allocation__Group__4__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:422:2: rule__Allocation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Allocation__Group__4__Impl_in_rule__Allocation__Group__4798);
            rule__Allocation__Group__4__Impl();
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
    // $ANTLR end rule__Allocation__Group__4


    // $ANTLR start rule__Allocation__Group__4__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:428:1: rule__Allocation__Group__4__Impl : ( ( rule__Allocation__Group_4__0 )? ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:432:1: ( ( ( rule__Allocation__Group_4__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:433:1: ( ( rule__Allocation__Group_4__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:433:1: ( ( rule__Allocation__Group_4__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:434:1: ( rule__Allocation__Group_4__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_4()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:435:1: ( rule__Allocation__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:435:2: rule__Allocation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Allocation__Group_4__0_in_rule__Allocation__Group__4__Impl825);
                    rule__Allocation__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group__4__Impl


    // $ANTLR start rule__Allocation__Group_1__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:455:1: rule__Allocation__Group_1__0 : rule__Allocation__Group_1__0__Impl rule__Allocation__Group_1__1 ;
    public final void rule__Allocation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:459:1: ( rule__Allocation__Group_1__0__Impl rule__Allocation__Group_1__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:460:2: rule__Allocation__Group_1__0__Impl rule__Allocation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Allocation__Group_1__0__Impl_in_rule__Allocation__Group_1__0866);
            rule__Allocation__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group_1__1_in_rule__Allocation__Group_1__0869);
            rule__Allocation__Group_1__1();
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
    // $ANTLR end rule__Allocation__Group_1__0


    // $ANTLR start rule__Allocation__Group_1__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:467:1: rule__Allocation__Group_1__0__Impl : ( 'cost' ) ;
    public final void rule__Allocation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:471:1: ( ( 'cost' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:472:1: ( 'cost' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:472:1: ( 'cost' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:473:1: 'cost'
            {
             before(grammarAccess.getAllocationAccess().getCostKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Allocation__Group_1__0__Impl897); 
             after(grammarAccess.getAllocationAccess().getCostKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_1__0__Impl


    // $ANTLR start rule__Allocation__Group_1__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:486:1: rule__Allocation__Group_1__1 : rule__Allocation__Group_1__1__Impl ;
    public final void rule__Allocation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:490:1: ( rule__Allocation__Group_1__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:491:2: rule__Allocation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Allocation__Group_1__1__Impl_in_rule__Allocation__Group_1__1928);
            rule__Allocation__Group_1__1__Impl();
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
    // $ANTLR end rule__Allocation__Group_1__1


    // $ANTLR start rule__Allocation__Group_1__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:497:1: rule__Allocation__Group_1__1__Impl : ( ( rule__Allocation__CostAssignment_1_1 ) ) ;
    public final void rule__Allocation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:501:1: ( ( ( rule__Allocation__CostAssignment_1_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:502:1: ( ( rule__Allocation__CostAssignment_1_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:502:1: ( ( rule__Allocation__CostAssignment_1_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:503:1: ( rule__Allocation__CostAssignment_1_1 )
            {
             before(grammarAccess.getAllocationAccess().getCostAssignment_1_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:504:1: ( rule__Allocation__CostAssignment_1_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:504:2: rule__Allocation__CostAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Allocation__CostAssignment_1_1_in_rule__Allocation__Group_1__1__Impl955);
            rule__Allocation__CostAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAllocationAccess().getCostAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_1__1__Impl


    // $ANTLR start rule__Allocation__Group_2__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:518:1: rule__Allocation__Group_2__0 : rule__Allocation__Group_2__0__Impl rule__Allocation__Group_2__1 ;
    public final void rule__Allocation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:522:1: ( rule__Allocation__Group_2__0__Impl rule__Allocation__Group_2__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:523:2: rule__Allocation__Group_2__0__Impl rule__Allocation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Allocation__Group_2__0__Impl_in_rule__Allocation__Group_2__0989);
            rule__Allocation__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group_2__1_in_rule__Allocation__Group_2__0992);
            rule__Allocation__Group_2__1();
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
    // $ANTLR end rule__Allocation__Group_2__0


    // $ANTLR start rule__Allocation__Group_2__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:530:1: rule__Allocation__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Allocation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:534:1: ( ( 'duration' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:535:1: ( 'duration' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:535:1: ( 'duration' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:536:1: 'duration'
            {
             before(grammarAccess.getAllocationAccess().getDurationKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Allocation__Group_2__0__Impl1020); 
             after(grammarAccess.getAllocationAccess().getDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_2__0__Impl


    // $ANTLR start rule__Allocation__Group_2__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:549:1: rule__Allocation__Group_2__1 : rule__Allocation__Group_2__1__Impl ;
    public final void rule__Allocation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:553:1: ( rule__Allocation__Group_2__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:554:2: rule__Allocation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Allocation__Group_2__1__Impl_in_rule__Allocation__Group_2__11051);
            rule__Allocation__Group_2__1__Impl();
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
    // $ANTLR end rule__Allocation__Group_2__1


    // $ANTLR start rule__Allocation__Group_2__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:560:1: rule__Allocation__Group_2__1__Impl : ( ( rule__Allocation__DurationAssignment_2_1 ) ) ;
    public final void rule__Allocation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:564:1: ( ( ( rule__Allocation__DurationAssignment_2_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:565:1: ( ( rule__Allocation__DurationAssignment_2_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:565:1: ( ( rule__Allocation__DurationAssignment_2_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:566:1: ( rule__Allocation__DurationAssignment_2_1 )
            {
             before(grammarAccess.getAllocationAccess().getDurationAssignment_2_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:567:1: ( rule__Allocation__DurationAssignment_2_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:567:2: rule__Allocation__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Allocation__DurationAssignment_2_1_in_rule__Allocation__Group_2__1__Impl1078);
            rule__Allocation__DurationAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAllocationAccess().getDurationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_2__1__Impl


    // $ANTLR start rule__Allocation__Group_3__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:581:1: rule__Allocation__Group_3__0 : rule__Allocation__Group_3__0__Impl rule__Allocation__Group_3__1 ;
    public final void rule__Allocation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:585:1: ( rule__Allocation__Group_3__0__Impl rule__Allocation__Group_3__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:586:2: rule__Allocation__Group_3__0__Impl rule__Allocation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Allocation__Group_3__0__Impl_in_rule__Allocation__Group_3__01112);
            rule__Allocation__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group_3__1_in_rule__Allocation__Group_3__01115);
            rule__Allocation__Group_3__1();
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
    // $ANTLR end rule__Allocation__Group_3__0


    // $ANTLR start rule__Allocation__Group_3__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:593:1: rule__Allocation__Group_3__0__Impl : ( 'team' ) ;
    public final void rule__Allocation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:597:1: ( ( 'team' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:598:1: ( 'team' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:598:1: ( 'team' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:599:1: 'team'
            {
             before(grammarAccess.getAllocationAccess().getTeamKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Allocation__Group_3__0__Impl1143); 
             after(grammarAccess.getAllocationAccess().getTeamKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_3__0__Impl


    // $ANTLR start rule__Allocation__Group_3__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:612:1: rule__Allocation__Group_3__1 : rule__Allocation__Group_3__1__Impl ;
    public final void rule__Allocation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:616:1: ( rule__Allocation__Group_3__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:617:2: rule__Allocation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Allocation__Group_3__1__Impl_in_rule__Allocation__Group_3__11174);
            rule__Allocation__Group_3__1__Impl();
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
    // $ANTLR end rule__Allocation__Group_3__1


    // $ANTLR start rule__Allocation__Group_3__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:623:1: rule__Allocation__Group_3__1__Impl : ( ( rule__Allocation__TeamAssignment_3_1 ) ) ;
    public final void rule__Allocation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:627:1: ( ( ( rule__Allocation__TeamAssignment_3_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:628:1: ( ( rule__Allocation__TeamAssignment_3_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:628:1: ( ( rule__Allocation__TeamAssignment_3_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:629:1: ( rule__Allocation__TeamAssignment_3_1 )
            {
             before(grammarAccess.getAllocationAccess().getTeamAssignment_3_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:630:1: ( rule__Allocation__TeamAssignment_3_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:630:2: rule__Allocation__TeamAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Allocation__TeamAssignment_3_1_in_rule__Allocation__Group_3__1__Impl1201);
            rule__Allocation__TeamAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getAllocationAccess().getTeamAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_3__1__Impl


    // $ANTLR start rule__Allocation__Group_4__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:644:1: rule__Allocation__Group_4__0 : rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 ;
    public final void rule__Allocation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:648:1: ( rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:649:2: rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Allocation__Group_4__0__Impl_in_rule__Allocation__Group_4__01235);
            rule__Allocation__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Allocation__Group_4__1_in_rule__Allocation__Group_4__01238);
            rule__Allocation__Group_4__1();
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
    // $ANTLR end rule__Allocation__Group_4__0


    // $ANTLR start rule__Allocation__Group_4__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:656:1: rule__Allocation__Group_4__0__Impl : ( 'facility' ) ;
    public final void rule__Allocation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:660:1: ( ( 'facility' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:661:1: ( 'facility' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:661:1: ( 'facility' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:662:1: 'facility'
            {
             before(grammarAccess.getAllocationAccess().getFacilityKeyword_4_0()); 
            match(input,15,FOLLOW_15_in_rule__Allocation__Group_4__0__Impl1266); 
             after(grammarAccess.getAllocationAccess().getFacilityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_4__0__Impl


    // $ANTLR start rule__Allocation__Group_4__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:675:1: rule__Allocation__Group_4__1 : rule__Allocation__Group_4__1__Impl ;
    public final void rule__Allocation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:679:1: ( rule__Allocation__Group_4__1__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:680:2: rule__Allocation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Allocation__Group_4__1__Impl_in_rule__Allocation__Group_4__11297);
            rule__Allocation__Group_4__1__Impl();
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
    // $ANTLR end rule__Allocation__Group_4__1


    // $ANTLR start rule__Allocation__Group_4__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:686:1: rule__Allocation__Group_4__1__Impl : ( ( rule__Allocation__FacilityAssignment_4_1 ) ) ;
    public final void rule__Allocation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:690:1: ( ( ( rule__Allocation__FacilityAssignment_4_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:691:1: ( ( rule__Allocation__FacilityAssignment_4_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:691:1: ( ( rule__Allocation__FacilityAssignment_4_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:692:1: ( rule__Allocation__FacilityAssignment_4_1 )
            {
             before(grammarAccess.getAllocationAccess().getFacilityAssignment_4_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:693:1: ( rule__Allocation__FacilityAssignment_4_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:693:2: rule__Allocation__FacilityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Allocation__FacilityAssignment_4_1_in_rule__Allocation__Group_4__1__Impl1324);
            rule__Allocation__FacilityAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getAllocationAccess().getFacilityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__Group_4__1__Impl


    // $ANTLR start rule__Plan__Group__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:707:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:711:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:712:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01358);
            rule__Plan__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01361);
            rule__Plan__Group__1();
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
    // $ANTLR end rule__Plan__Group__0


    // $ANTLR start rule__Plan__Group__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:719:1: rule__Plan__Group__0__Impl : ( 'plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:723:1: ( ( 'plan' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:724:1: ( 'plan' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:724:1: ( 'plan' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:725:1: 'plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Plan__Group__0__Impl1389); 
             after(grammarAccess.getPlanAccess().getPlanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__0__Impl


    // $ANTLR start rule__Plan__Group__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:738:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:742:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:743:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11420);
            rule__Plan__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11423);
            rule__Plan__Group__2();
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
    // $ANTLR end rule__Plan__Group__1


    // $ANTLR start rule__Plan__Group__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:750:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__IdAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:754:1: ( ( ( rule__Plan__IdAssignment_1 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:755:1: ( ( rule__Plan__IdAssignment_1 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:755:1: ( ( rule__Plan__IdAssignment_1 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:756:1: ( rule__Plan__IdAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getIdAssignment_1()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:757:1: ( rule__Plan__IdAssignment_1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:757:2: rule__Plan__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__IdAssignment_1_in_rule__Plan__Group__1__Impl1450);
            rule__Plan__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPlanAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__1__Impl


    // $ANTLR start rule__Plan__Group__2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:767:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:771:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:772:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21480);
            rule__Plan__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21483);
            rule__Plan__Group__3();
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
    // $ANTLR end rule__Plan__Group__2


    // $ANTLR start rule__Plan__Group__2__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:779:1: rule__Plan__Group__2__Impl : ( 'element' ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:783:1: ( ( 'element' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:784:1: ( 'element' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:784:1: ( 'element' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:785:1: 'element'
            {
             before(grammarAccess.getPlanAccess().getElementKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Plan__Group__2__Impl1511); 
             after(grammarAccess.getPlanAccess().getElementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__2__Impl


    // $ANTLR start rule__Plan__Group__3
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:798:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:802:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:803:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31542);
            rule__Plan__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31545);
            rule__Plan__Group__4();
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
    // $ANTLR end rule__Plan__Group__3


    // $ANTLR start rule__Plan__Group__3__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:810:1: rule__Plan__Group__3__Impl : ( ( rule__Plan__ElementAssignment_3 ) ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:814:1: ( ( ( rule__Plan__ElementAssignment_3 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:815:1: ( ( rule__Plan__ElementAssignment_3 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:815:1: ( ( rule__Plan__ElementAssignment_3 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:816:1: ( rule__Plan__ElementAssignment_3 )
            {
             before(grammarAccess.getPlanAccess().getElementAssignment_3()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:817:1: ( rule__Plan__ElementAssignment_3 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:817:2: rule__Plan__ElementAssignment_3
            {
            pushFollow(FOLLOW_rule__Plan__ElementAssignment_3_in_rule__Plan__Group__3__Impl1572);
            rule__Plan__ElementAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPlanAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__3__Impl


    // $ANTLR start rule__Plan__Group__4
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:827:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:831:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:832:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41602);
            rule__Plan__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41605);
            rule__Plan__Group__5();
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
    // $ANTLR end rule__Plan__Group__4


    // $ANTLR start rule__Plan__Group__4__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:839:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__Group_4__0 )? ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:843:1: ( ( ( rule__Plan__Group_4__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:844:1: ( ( rule__Plan__Group_4__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:844:1: ( ( rule__Plan__Group_4__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:845:1: ( rule__Plan__Group_4__0 )?
            {
             before(grammarAccess.getPlanAccess().getGroup_4()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:846:1: ( rule__Plan__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:846:2: rule__Plan__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Plan__Group_4__0_in_rule__Plan__Group__4__Impl1632);
                    rule__Plan__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlanAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__4__Impl


    // $ANTLR start rule__Plan__Group__5
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:856:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:860:1: ( rule__Plan__Group__5__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:861:2: rule__Plan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51663);
            rule__Plan__Group__5__Impl();
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
    // $ANTLR end rule__Plan__Group__5


    // $ANTLR start rule__Plan__Group__5__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:867:1: rule__Plan__Group__5__Impl : ( ( rule__Plan__Group_5__0 )? ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:871:1: ( ( ( rule__Plan__Group_5__0 )? ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:872:1: ( ( rule__Plan__Group_5__0 )? )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:872:1: ( ( rule__Plan__Group_5__0 )? )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:873:1: ( rule__Plan__Group_5__0 )?
            {
             before(grammarAccess.getPlanAccess().getGroup_5()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:874:1: ( rule__Plan__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:874:2: rule__Plan__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Plan__Group_5__0_in_rule__Plan__Group__5__Impl1690);
                    rule__Plan__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlanAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group__5__Impl


    // $ANTLR start rule__Plan__Group_4__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:896:1: rule__Plan__Group_4__0 : rule__Plan__Group_4__0__Impl rule__Plan__Group_4__1 ;
    public final void rule__Plan__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:900:1: ( rule__Plan__Group_4__0__Impl rule__Plan__Group_4__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:901:2: rule__Plan__Group_4__0__Impl rule__Plan__Group_4__1
            {
            pushFollow(FOLLOW_rule__Plan__Group_4__0__Impl_in_rule__Plan__Group_4__01733);
            rule__Plan__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_4__1_in_rule__Plan__Group_4__01736);
            rule__Plan__Group_4__1();
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
    // $ANTLR end rule__Plan__Group_4__0


    // $ANTLR start rule__Plan__Group_4__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:908:1: rule__Plan__Group_4__0__Impl : ( 'estimated' ) ;
    public final void rule__Plan__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:912:1: ( ( 'estimated' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:913:1: ( 'estimated' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:913:1: ( 'estimated' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:914:1: 'estimated'
            {
             before(grammarAccess.getPlanAccess().getEstimatedKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Plan__Group_4__0__Impl1764); 
             after(grammarAccess.getPlanAccess().getEstimatedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_4__0__Impl


    // $ANTLR start rule__Plan__Group_4__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:927:1: rule__Plan__Group_4__1 : rule__Plan__Group_4__1__Impl rule__Plan__Group_4__2 ;
    public final void rule__Plan__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:931:1: ( rule__Plan__Group_4__1__Impl rule__Plan__Group_4__2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:932:2: rule__Plan__Group_4__1__Impl rule__Plan__Group_4__2
            {
            pushFollow(FOLLOW_rule__Plan__Group_4__1__Impl_in_rule__Plan__Group_4__11795);
            rule__Plan__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_4__2_in_rule__Plan__Group_4__11798);
            rule__Plan__Group_4__2();
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
    // $ANTLR end rule__Plan__Group_4__1


    // $ANTLR start rule__Plan__Group_4__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:939:1: rule__Plan__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Plan__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:943:1: ( ( '(' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:944:1: ( '(' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:944:1: ( '(' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:945:1: '('
            {
             before(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,19,FOLLOW_19_in_rule__Plan__Group_4__1__Impl1826); 
             after(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_4__1__Impl


    // $ANTLR start rule__Plan__Group_4__2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:958:1: rule__Plan__Group_4__2 : rule__Plan__Group_4__2__Impl rule__Plan__Group_4__3 ;
    public final void rule__Plan__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:962:1: ( rule__Plan__Group_4__2__Impl rule__Plan__Group_4__3 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:963:2: rule__Plan__Group_4__2__Impl rule__Plan__Group_4__3
            {
            pushFollow(FOLLOW_rule__Plan__Group_4__2__Impl_in_rule__Plan__Group_4__21857);
            rule__Plan__Group_4__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_4__3_in_rule__Plan__Group_4__21860);
            rule__Plan__Group_4__3();
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
    // $ANTLR end rule__Plan__Group_4__2


    // $ANTLR start rule__Plan__Group_4__2__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:970:1: rule__Plan__Group_4__2__Impl : ( ( rule__Plan__EstimatedAssignment_4_2 ) ) ;
    public final void rule__Plan__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:974:1: ( ( ( rule__Plan__EstimatedAssignment_4_2 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:975:1: ( ( rule__Plan__EstimatedAssignment_4_2 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:975:1: ( ( rule__Plan__EstimatedAssignment_4_2 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:976:1: ( rule__Plan__EstimatedAssignment_4_2 )
            {
             before(grammarAccess.getPlanAccess().getEstimatedAssignment_4_2()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:977:1: ( rule__Plan__EstimatedAssignment_4_2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:977:2: rule__Plan__EstimatedAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Plan__EstimatedAssignment_4_2_in_rule__Plan__Group_4__2__Impl1887);
            rule__Plan__EstimatedAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getPlanAccess().getEstimatedAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_4__2__Impl


    // $ANTLR start rule__Plan__Group_4__3
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:987:1: rule__Plan__Group_4__3 : rule__Plan__Group_4__3__Impl ;
    public final void rule__Plan__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:991:1: ( rule__Plan__Group_4__3__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:992:2: rule__Plan__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group_4__3__Impl_in_rule__Plan__Group_4__31917);
            rule__Plan__Group_4__3__Impl();
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
    // $ANTLR end rule__Plan__Group_4__3


    // $ANTLR start rule__Plan__Group_4__3__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:998:1: rule__Plan__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Plan__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1002:1: ( ( ')' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1003:1: ( ')' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1003:1: ( ')' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1004:1: ')'
            {
             before(grammarAccess.getPlanAccess().getRightParenthesisKeyword_4_3()); 
            match(input,20,FOLLOW_20_in_rule__Plan__Group_4__3__Impl1945); 
             after(grammarAccess.getPlanAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_4__3__Impl


    // $ANTLR start rule__Plan__Group_5__0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1025:1: rule__Plan__Group_5__0 : rule__Plan__Group_5__0__Impl rule__Plan__Group_5__1 ;
    public final void rule__Plan__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1029:1: ( rule__Plan__Group_5__0__Impl rule__Plan__Group_5__1 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1030:2: rule__Plan__Group_5__0__Impl rule__Plan__Group_5__1
            {
            pushFollow(FOLLOW_rule__Plan__Group_5__0__Impl_in_rule__Plan__Group_5__01984);
            rule__Plan__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_5__1_in_rule__Plan__Group_5__01987);
            rule__Plan__Group_5__1();
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
    // $ANTLR end rule__Plan__Group_5__0


    // $ANTLR start rule__Plan__Group_5__0__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1037:1: rule__Plan__Group_5__0__Impl : ( 'actual' ) ;
    public final void rule__Plan__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1041:1: ( ( 'actual' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1042:1: ( 'actual' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1042:1: ( 'actual' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1043:1: 'actual'
            {
             before(grammarAccess.getPlanAccess().getActualKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Plan__Group_5__0__Impl2015); 
             after(grammarAccess.getPlanAccess().getActualKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_5__0__Impl


    // $ANTLR start rule__Plan__Group_5__1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1056:1: rule__Plan__Group_5__1 : rule__Plan__Group_5__1__Impl rule__Plan__Group_5__2 ;
    public final void rule__Plan__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1060:1: ( rule__Plan__Group_5__1__Impl rule__Plan__Group_5__2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1061:2: rule__Plan__Group_5__1__Impl rule__Plan__Group_5__2
            {
            pushFollow(FOLLOW_rule__Plan__Group_5__1__Impl_in_rule__Plan__Group_5__12046);
            rule__Plan__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_5__2_in_rule__Plan__Group_5__12049);
            rule__Plan__Group_5__2();
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
    // $ANTLR end rule__Plan__Group_5__1


    // $ANTLR start rule__Plan__Group_5__1__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1068:1: rule__Plan__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Plan__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1072:1: ( ( '(' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1073:1: ( '(' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1073:1: ( '(' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1074:1: '('
            {
             before(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,19,FOLLOW_19_in_rule__Plan__Group_5__1__Impl2077); 
             after(grammarAccess.getPlanAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_5__1__Impl


    // $ANTLR start rule__Plan__Group_5__2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1087:1: rule__Plan__Group_5__2 : rule__Plan__Group_5__2__Impl rule__Plan__Group_5__3 ;
    public final void rule__Plan__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1091:1: ( rule__Plan__Group_5__2__Impl rule__Plan__Group_5__3 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1092:2: rule__Plan__Group_5__2__Impl rule__Plan__Group_5__3
            {
            pushFollow(FOLLOW_rule__Plan__Group_5__2__Impl_in_rule__Plan__Group_5__22108);
            rule__Plan__Group_5__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plan__Group_5__3_in_rule__Plan__Group_5__22111);
            rule__Plan__Group_5__3();
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
    // $ANTLR end rule__Plan__Group_5__2


    // $ANTLR start rule__Plan__Group_5__2__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1099:1: rule__Plan__Group_5__2__Impl : ( ( rule__Plan__ActualAssignment_5_2 ) ) ;
    public final void rule__Plan__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1103:1: ( ( ( rule__Plan__ActualAssignment_5_2 ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1104:1: ( ( rule__Plan__ActualAssignment_5_2 ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1104:1: ( ( rule__Plan__ActualAssignment_5_2 ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1105:1: ( rule__Plan__ActualAssignment_5_2 )
            {
             before(grammarAccess.getPlanAccess().getActualAssignment_5_2()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1106:1: ( rule__Plan__ActualAssignment_5_2 )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1106:2: rule__Plan__ActualAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Plan__ActualAssignment_5_2_in_rule__Plan__Group_5__2__Impl2138);
            rule__Plan__ActualAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getPlanAccess().getActualAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_5__2__Impl


    // $ANTLR start rule__Plan__Group_5__3
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1116:1: rule__Plan__Group_5__3 : rule__Plan__Group_5__3__Impl ;
    public final void rule__Plan__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1120:1: ( rule__Plan__Group_5__3__Impl )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1121:2: rule__Plan__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group_5__3__Impl_in_rule__Plan__Group_5__32168);
            rule__Plan__Group_5__3__Impl();
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
    // $ANTLR end rule__Plan__Group_5__3


    // $ANTLR start rule__Plan__Group_5__3__Impl
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1127:1: rule__Plan__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Plan__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1131:1: ( ( ')' ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1132:1: ( ')' )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1132:1: ( ')' )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1133:1: ')'
            {
             before(grammarAccess.getPlanAccess().getRightParenthesisKeyword_5_3()); 
            match(input,20,FOLLOW_20_in_rule__Plan__Group_5__3__Impl2196); 
             after(grammarAccess.getPlanAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__Group_5__3__Impl


    // $ANTLR start rule__Plans__ArgumentmodelsAssignment_0
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1155:1: rule__Plans__ArgumentmodelsAssignment_0 : ( ruleArgumentModels ) ;
    public final void rule__Plans__ArgumentmodelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1159:1: ( ( ruleArgumentModels ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1160:1: ( ruleArgumentModels )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1160:1: ( ruleArgumentModels )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1161:1: ruleArgumentModels
            {
             before(grammarAccess.getPlansAccess().getArgumentmodelsArgumentModelsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleArgumentModels_in_rule__Plans__ArgumentmodelsAssignment_02240);
            ruleArgumentModels();
            _fsp--;

             after(grammarAccess.getPlansAccess().getArgumentmodelsArgumentModelsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plans__ArgumentmodelsAssignment_0


    // $ANTLR start rule__Plans__PlansAssignment_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1170:1: rule__Plans__PlansAssignment_1 : ( rulePlan ) ;
    public final void rule__Plans__PlansAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1174:1: ( ( rulePlan ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1175:1: ( rulePlan )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1175:1: ( rulePlan )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1176:1: rulePlan
            {
             before(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_12271);
            rulePlan();
            _fsp--;

             after(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plans__PlansAssignment_1


    // $ANTLR start rule__ArgumentModels__ImportURIAssignment_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1185:1: rule__ArgumentModels__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ArgumentModels__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1189:1: ( ( RULE_STRING ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1190:1: ( RULE_STRING )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1190:1: ( RULE_STRING )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1191:1: RULE_STRING
            {
             before(grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArgumentModels__ImportURIAssignment_12302); 
             after(grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentModels__ImportURIAssignment_1


    // $ANTLR start rule__Allocation__CostAssignment_1_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1200:1: rule__Allocation__CostAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Allocation__CostAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1204:1: ( ( RULE_INT ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1205:1: ( RULE_INT )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1205:1: ( RULE_INT )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1206:1: RULE_INT
            {
             before(grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Allocation__CostAssignment_1_12333); 
             after(grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__CostAssignment_1_1


    // $ANTLR start rule__Allocation__DurationAssignment_2_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1215:1: rule__Allocation__DurationAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Allocation__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1219:1: ( ( RULE_INT ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1220:1: ( RULE_INT )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1220:1: ( RULE_INT )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1221:1: RULE_INT
            {
             before(grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Allocation__DurationAssignment_2_12364); 
             after(grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__DurationAssignment_2_1


    // $ANTLR start rule__Allocation__TeamAssignment_3_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1230:1: rule__Allocation__TeamAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Allocation__TeamAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1234:1: ( ( RULE_STRING ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1235:1: ( RULE_STRING )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1235:1: ( RULE_STRING )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1236:1: RULE_STRING
            {
             before(grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Allocation__TeamAssignment_3_12395); 
             after(grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__TeamAssignment_3_1


    // $ANTLR start rule__Allocation__FacilityAssignment_4_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1245:1: rule__Allocation__FacilityAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Allocation__FacilityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1249:1: ( ( RULE_STRING ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1250:1: ( RULE_STRING )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1250:1: ( RULE_STRING )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1251:1: RULE_STRING
            {
             before(grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Allocation__FacilityAssignment_4_12426); 
             after(grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Allocation__FacilityAssignment_4_1


    // $ANTLR start rule__Plan__IdAssignment_1
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1260:1: rule__Plan__IdAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Plan__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1264:1: ( ( RULE_STRING ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1265:1: ( RULE_STRING )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1265:1: ( RULE_STRING )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1266:1: RULE_STRING
            {
             before(grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Plan__IdAssignment_12457); 
             after(grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__IdAssignment_1


    // $ANTLR start rule__Plan__ElementAssignment_3
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1275:1: rule__Plan__ElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Plan__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1279:1: ( ( ( RULE_ID ) ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1280:1: ( ( RULE_ID ) )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1280:1: ( ( RULE_ID ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1281:1: ( RULE_ID )
            {
             before(grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0()); 
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1282:1: ( RULE_ID )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1283:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getElementModelElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__ElementAssignment_32492); 
             after(grammarAccess.getPlanAccess().getElementModelElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__ElementAssignment_3


    // $ANTLR start rule__Plan__EstimatedAssignment_4_2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1294:1: rule__Plan__EstimatedAssignment_4_2 : ( ruleAllocation ) ;
    public final void rule__Plan__EstimatedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1298:1: ( ( ruleAllocation ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1299:1: ( ruleAllocation )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1299:1: ( ruleAllocation )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1300:1: ruleAllocation
            {
             before(grammarAccess.getPlanAccess().getEstimatedAllocationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAllocation_in_rule__Plan__EstimatedAssignment_4_22527);
            ruleAllocation();
            _fsp--;

             after(grammarAccess.getPlanAccess().getEstimatedAllocationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__EstimatedAssignment_4_2


    // $ANTLR start rule__Plan__ActualAssignment_5_2
    // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1309:1: rule__Plan__ActualAssignment_5_2 : ( ruleAllocation ) ;
    public final void rule__Plan__ActualAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1313:1: ( ( ruleAllocation ) )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1314:1: ( ruleAllocation )
            {
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1314:1: ( ruleAllocation )
            // ../net.certware.planning.cpn.ui/src-gen/net/certware/planning/cpn/ui/contentassist/antlr/internal/InternalCpnDsl.g:1315:1: ruleAllocation
            {
             before(grammarAccess.getPlanAccess().getActualAllocationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleAllocation_in_rule__Plan__ActualAssignment_5_22558);
            ruleAllocation();
            _fsp--;

             after(grammarAccess.getPlanAccess().getActualAllocationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plan__ActualAssignment_5_2


 

    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0_in_rulePlans94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_entryRuleArgumentModels121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentModels128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentModels__Group__0_in_ruleArgumentModels154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllocation_in_entryRuleAllocation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllocation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__0_in_ruleAllocation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0_in_rulePlan274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__0308 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__ArgumentmodelsAssignment_0_in_rule__Plans__Group__0__Impl338 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl396 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ArgumentModels__Group__0__Impl_in_rule__ArgumentModels__Group__0431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentModels__Group__1_in_rule__ArgumentModels__Group__0434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ArgumentModels__Group__0__Impl462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentModels__Group__1__Impl_in_rule__ArgumentModels__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentModels__ImportURIAssignment_1_in_rule__ArgumentModels__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__0__Impl_in_rule__Allocation__Group__0554 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__1_in_rule__Allocation__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__1__Impl_in_rule__Allocation__Group__1615 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__2_in_rule__Allocation__Group__1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_1__0_in_rule__Allocation__Group__1__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__2__Impl_in_rule__Allocation__Group__2676 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__3_in_rule__Allocation__Group__2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_2__0_in_rule__Allocation__Group__2__Impl706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__3__Impl_in_rule__Allocation__Group__3737 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__4_in_rule__Allocation__Group__3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_3__0_in_rule__Allocation__Group__3__Impl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group__4__Impl_in_rule__Allocation__Group__4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_4__0_in_rule__Allocation__Group__4__Impl825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_1__0__Impl_in_rule__Allocation__Group_1__0866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Allocation__Group_1__1_in_rule__Allocation__Group_1__0869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Allocation__Group_1__0__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_1__1__Impl_in_rule__Allocation__Group_1__1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__CostAssignment_1_1_in_rule__Allocation__Group_1__1__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_2__0__Impl_in_rule__Allocation__Group_2__0989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Allocation__Group_2__1_in_rule__Allocation__Group_2__0992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Allocation__Group_2__0__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_2__1__Impl_in_rule__Allocation__Group_2__11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__DurationAssignment_2_1_in_rule__Allocation__Group_2__1__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_3__0__Impl_in_rule__Allocation__Group_3__01112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Allocation__Group_3__1_in_rule__Allocation__Group_3__01115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Allocation__Group_3__0__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_3__1__Impl_in_rule__Allocation__Group_3__11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__TeamAssignment_3_1_in_rule__Allocation__Group_3__1__Impl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_4__0__Impl_in_rule__Allocation__Group_4__01235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Allocation__Group_4__1_in_rule__Allocation__Group_4__01238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Allocation__Group_4__0__Impl1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__Group_4__1__Impl_in_rule__Allocation__Group_4__11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Allocation__FacilityAssignment_4_1_in_rule__Allocation__Group_4__1__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__01358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Plan__Group__0__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__11420 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__IdAssignment_1_in_rule__Plan__Group__1__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__21480 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__21483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Plan__Group__2__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__31542 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__31545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__ElementAssignment_3_in_rule__Plan__Group__3__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__41602 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__41605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__0_in_rule__Plan__Group__4__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__51663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__0_in_rule__Plan__Group__5__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__0__Impl_in_rule__Plan__Group_4__01733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__1_in_rule__Plan__Group_4__01736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plan__Group_4__0__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__1__Impl_in_rule__Plan__Group_4__11795 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__2_in_rule__Plan__Group_4__11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Plan__Group_4__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__2__Impl_in_rule__Plan__Group_4__21857 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__3_in_rule__Plan__Group_4__21860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__EstimatedAssignment_4_2_in_rule__Plan__Group_4__2__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_4__3__Impl_in_rule__Plan__Group_4__31917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Plan__Group_4__3__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__0__Impl_in_rule__Plan__Group_5__01984 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__1_in_rule__Plan__Group_5__01987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Plan__Group_5__0__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__1__Impl_in_rule__Plan__Group_5__12046 = new BitSet(new long[]{0x000000000010F000L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__2_in_rule__Plan__Group_5__12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Plan__Group_5__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__2__Impl_in_rule__Plan__Group_5__22108 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__3_in_rule__Plan__Group_5__22111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__ActualAssignment_5_2_in_rule__Plan__Group_5__2__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group_5__3__Impl_in_rule__Plan__Group_5__32168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Plan__Group_5__3__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentModels_in_rule__Plans__ArgumentmodelsAssignment_02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArgumentModels__ImportURIAssignment_12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Allocation__CostAssignment_1_12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Allocation__DurationAssignment_2_12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Allocation__TeamAssignment_3_12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Allocation__FacilityAssignment_4_12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Plan__IdAssignment_12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__ElementAssignment_32492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllocation_in_rule__Plan__EstimatedAssignment_4_22527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllocation_in_rule__Plan__ActualAssignment_5_22558 = new BitSet(new long[]{0x0000000000000002L});

}