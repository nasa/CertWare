package net.certware.evidence.hugin.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.evidence.hugin.services.NetDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNetDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'net'", "'{'", "'}'", "'discrete'", "'continuous'", "'node'", "'decision'", "'utility'", "'function'", "'states'", "'='", "'('", "')'", "';'", "'label'", "'position'", "'subtype'", "'boolean'", "'number'", "'interval'", "'state_values'", "'node_size'", "'potential'", "'|'", "'data'", "'*'", "'model_nodes'", "'samples_per_interval'", "'model_data'", "'class'", "'instance'", "':'", "','", "'+='", "'-='", "'*='", "'/='", "'%='", "'||'", "'&&'", "'!='", "'=='", "'<='", "'<>'", "'>='", "'<'", "'>'", "'+'", "'-'", "'/'", "'!'", "'truncate'", "'Normal'", "'LogNormal'", "'Beta'", "'Gamma'", "'Exponential'", "'Weibull'", "'Uniform'", "'Triangular'", "'PERT'", "'Binomial'", "'Poisson'", "'NegativeBinomial'", "'Geometric'", "'Distribution'", "'NoisyOR'", "'min'", "'max'", "'log'", "'log2'", "'log10'", "'exp'", "'sin'", "'cos'", "'tan'", "'sinh'", "'cosh'", "'tanh'", "'sqrt'", "'abs'", "'floor'", "'ceil'", "'mod'", "'if'", "'and'", "'or'", "'not'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalNetDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNetDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNetDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private NetDSLGrammarAccess grammarAccess;
     	
        public InternalNetDSLParser(TokenStream input, NetDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected NetDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:82:1: ruleModel returns [EObject current=null] : ( (lv_domain_0_0= ruleDomainDefinition ) )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_domain_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:85:28: ( ( (lv_domain_0_0= ruleDomainDefinition ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:86:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:86:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:87:1: (lv_domain_0_0= ruleDomainDefinition )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:87:1: (lv_domain_0_0= ruleDomainDefinition )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:88:3: lv_domain_0_0= ruleDomainDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getDomainDomainDefinitionParserRuleCall_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDomainDefinition_in_ruleModel136);
                    lv_domain_0_0=ruleDomainDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"domain",
                              		lv_domain_0_0, 
                              		"DomainDefinition");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInteger"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:112:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:113:2: (iv_ruleInteger= ruleInteger EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:114:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger172);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger182); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:121:1: ruleInteger returns [EObject current=null] : ( (lv_i_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:124:28: ( ( (lv_i_0_0= RULE_INT ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:125:1: ( (lv_i_0_0= RULE_INT ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:125:1: ( (lv_i_0_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:126:1: (lv_i_0_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:126:1: (lv_i_0_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:127:3: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_i_0_0, grammarAccess.getIntegerAccess().getIINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"i",
                      		lv_i_0_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDomainDefinition"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:151:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:152:2: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:153:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition263);
            iv_ruleDomainDefinition=ruleDomainDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDefinition273); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainDefinition"


    // $ANTLR start "ruleDomainDefinition"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:160:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:163:28: ( ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:164:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:164:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:164:2: ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:164:2: ( (lv_header_0_0= ruleDomainHeader ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:165:1: (lv_header_0_0= ruleDomainHeader )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:165:1: (lv_header_0_0= ruleDomainHeader )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:166:3: lv_header_0_0= ruleDomainHeader
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainDefinitionAccess().getHeaderDomainHeaderParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDomainHeader_in_ruleDomainDefinition319);
            lv_header_0_0=ruleDomainHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDomainDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"header",
                      		lv_header_0_0, 
                      		"DomainHeader");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:182:2: ( (lv_elements_1_0= ruleDomainElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=21)||LA2_0==35||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:183:1: (lv_elements_1_0= ruleDomainElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:183:1: (lv_elements_1_0= ruleDomainElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:184:3: lv_elements_1_0= ruleDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainDefinitionAccess().getElementsDomainElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomainDefinition340);
            	    lv_elements_1_0=ruleDomainElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"DomainElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDomainDefinition"


    // $ANTLR start "entryRuleDomainHeader"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:208:1: entryRuleDomainHeader returns [EObject current=null] : iv_ruleDomainHeader= ruleDomainHeader EOF ;
    public final EObject entryRuleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainHeader = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:209:2: (iv_ruleDomainHeader= ruleDomainHeader EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:210:2: iv_ruleDomainHeader= ruleDomainHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainHeaderRule()); 
            }
            pushFollow(FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader377);
            iv_ruleDomainHeader=ruleDomainHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainHeader; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainHeader387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainHeader"


    // $ANTLR start "ruleDomainHeader"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:217:1: ruleDomainHeader returns [EObject current=null] : ( () otherlv_1= 'net' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:220:28: ( ( () otherlv_1= 'net' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:221:1: ( () otherlv_1= 'net' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:221:1: ( () otherlv_1= 'net' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:221:2: () otherlv_1= 'net' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:221:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:222:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainHeaderAccess().getDomainHeaderAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDomainHeader436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainHeaderAccess().getNetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDomainHeader448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDomainHeaderAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:238:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==22||(LA3_0>=27 && LA3_0<=29)||(LA3_0>=33 && LA3_0<=34)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:240:3: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainHeaderAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainHeader469);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainHeaderRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_3_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDomainHeader482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDomainHeaderAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDomainHeader"


    // $ANTLR start "entryRuleDomainElement"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:268:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:269:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:270:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement518);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement528); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:277:1: ruleDomainElement returns [EObject current=null] : (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicNode_0 = null;

        EObject this_Potential_1 = null;

        EObject this_ClassDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:280:28: ( (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:281:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:281:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:282:2: this_BasicNode_0= ruleBasicNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainElementAccess().getBasicNodeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicNode_in_ruleDomainElement578);
                    this_BasicNode_0=ruleBasicNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicNode_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:295:2: this_Potential_1= rulePotential
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainElementAccess().getPotentialParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePotential_in_ruleDomainElement608);
                    this_Potential_1=rulePotential();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Potential_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:308:2: this_ClassDefinition_2= ruleClassDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainElementAccess().getClassDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassDefinition_in_ruleDomainElement638);
                    this_ClassDefinition_2=ruleClassDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassDefinition_2; 
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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:327:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:328:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:329:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute673);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute683); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:336:1: ruleAttribute returns [EObject current=null] : (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_StatesAttribute_0 = null;

        EObject this_LabelAttribute_1 = null;

        EObject this_PositionAttribute_2 = null;

        EObject this_SubtypeAttribute_3 = null;

        EObject this_StateValuesAttribute_4 = null;

        EObject this_ApplicationAttribute_5 = null;

        EObject this_NodeSizeAttribute_6 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:339:28: ( (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:340:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:340:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case RULE_ID:
                {
                alt5=6;
                }
                break;
            case 34:
                {
                alt5=7;
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:341:2: this_StatesAttribute_0= ruleStatesAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getStatesAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatesAttribute_in_ruleAttribute733);
                    this_StatesAttribute_0=ruleStatesAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatesAttribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:354:2: this_LabelAttribute_1= ruleLabelAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleAttribute763);
                    this_LabelAttribute_1=ruleLabelAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelAttribute_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:367:2: this_PositionAttribute_2= rulePositionAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleAttribute793);
                    this_PositionAttribute_2=rulePositionAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PositionAttribute_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:380:2: this_SubtypeAttribute_3= ruleSubtypeAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getSubtypeAttributeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubtypeAttribute_in_ruleAttribute823);
                    this_SubtypeAttribute_3=ruleSubtypeAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubtypeAttribute_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:393:2: this_StateValuesAttribute_4= ruleStateValuesAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getStateValuesAttributeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateValuesAttribute_in_ruleAttribute853);
                    this_StateValuesAttribute_4=ruleStateValuesAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateValuesAttribute_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:406:2: this_ApplicationAttribute_5= ruleApplicationAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getApplicationAttributeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleAttribute883);
                    this_ApplicationAttribute_5=ruleApplicationAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ApplicationAttribute_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:419:2: this_NodeSizeAttribute_6= ruleNodeSizeAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getNodeSizeAttributeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute913);
                    this_NodeSizeAttribute_6=ruleNodeSizeAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeSizeAttribute_6; 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleBasicNode"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:438:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:439:2: (iv_ruleBasicNode= ruleBasicNode EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:440:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicNodeRule()); 
            }
            pushFollow(FOLLOW_ruleBasicNode_in_entryRuleBasicNode948);
            iv_ruleBasicNode=ruleBasicNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNode958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicNode"


    // $ANTLR start "ruleBasicNode"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:447:1: ruleBasicNode returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:450:28: ( ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:451:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:451:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:451:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:451:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:452:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:452:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:453:3: lv_keyword_0_0= ruleBasicNodeKeyword
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicNodeAccess().getKeywordBasicNodeKeywordParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1004);
            lv_keyword_0_0=ruleBasicNodeKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicNodeRule());
              	        }
                     		set(
                     			current, 
                     			"keyword",
                      		lv_keyword_0_0, 
                      		"BasicNodeKeyword");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:469:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:470:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:470:1: (lv_id_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:471:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicNode1021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getBasicNodeAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicNodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBasicNode1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBasicNodeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:491:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||(LA7_0>=27 && LA7_0<=29)||(LA7_0>=33 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:492:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:492:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:493:3: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBasicNodeAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBasicNode1060);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBasicNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_3_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBasicNode1073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBasicNodeAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleBasicNode"


    // $ANTLR start "entryRuleBasicNodeKeyword"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:521:1: entryRuleBasicNodeKeyword returns [String current=null] : iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF ;
    public final String entryRuleBasicNodeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicNodeKeyword = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:522:2: (iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:523:2: iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicNodeKeywordRule()); 
            }
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1110);
            iv_ruleBasicNodeKeyword=ruleBasicNodeKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicNodeKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNodeKeyword1121); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicNodeKeyword"


    // $ANTLR start "ruleBasicNodeKeyword"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:530:1: ruleBasicNodeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) ;
    public final AntlrDatatypeRuleToken ruleBasicNodeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:533:28: ( ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:3: (kw= 'discrete' | kw= 'continuous' )? kw= 'node'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:3: (kw= 'discrete' | kw= 'continuous' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==17) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:535:2: kw= 'discrete'
                            {
                            kw=(Token)match(input,16,FOLLOW_16_in_ruleBasicNodeKeyword1161); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getDiscreteKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:542:2: kw= 'continuous'
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_ruleBasicNodeKeyword1180); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getContinuousKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_18_in_ruleBasicNodeKeyword1195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getNodeKeyword_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:555:2: kw= 'decision'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleBasicNodeKeyword1215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getDecisionKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:562:2: kw= 'utility'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleBasicNodeKeyword1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getUtilityKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:569:2: kw= 'function'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleBasicNodeKeyword1253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBasicNodeKeywordAccess().getFunctionKeyword_3()); 
                          
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
    // $ANTLR end "ruleBasicNodeKeyword"


    // $ANTLR start "entryRuleStatesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:582:1: entryRuleStatesAttribute returns [EObject current=null] : iv_ruleStatesAttribute= ruleStatesAttribute EOF ;
    public final EObject entryRuleStatesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:583:2: (iv_ruleStatesAttribute= ruleStatesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:584:2: iv_ruleStatesAttribute= ruleStatesAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatesAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1293);
            iv_ruleStatesAttribute=ruleStatesAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatesAttribute1303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatesAttribute"


    // $ANTLR start "ruleStatesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:591:1: ruleStatesAttribute returns [EObject current=null] : ( () otherlv_1= 'states' otherlv_2= '=' otherlv_3= '(' ( (lv_states_4_0= RULE_STRING ) )* otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleStatesAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_states_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:594:28: ( ( () otherlv_1= 'states' otherlv_2= '=' otherlv_3= '(' ( (lv_states_4_0= RULE_STRING ) )* otherlv_5= ')' otherlv_6= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:595:1: ( () otherlv_1= 'states' otherlv_2= '=' otherlv_3= '(' ( (lv_states_4_0= RULE_STRING ) )* otherlv_5= ')' otherlv_6= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:595:1: ( () otherlv_1= 'states' otherlv_2= '=' otherlv_3= '(' ( (lv_states_4_0= RULE_STRING ) )* otherlv_5= ')' otherlv_6= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:595:2: () otherlv_1= 'states' otherlv_2= '=' otherlv_3= '(' ( (lv_states_4_0= RULE_STRING ) )* otherlv_5= ')' otherlv_6= ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:595:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:596:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatesAttributeAccess().getStatesAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStatesAttribute1352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatesAttributeAccess().getStatesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleStatesAttribute1364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatesAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStatesAttribute1376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatesAttributeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:616:1: ( (lv_states_4_0= RULE_STRING ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:617:1: (lv_states_4_0= RULE_STRING )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:617:1: (lv_states_4_0= RULE_STRING )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:618:3: lv_states_4_0= RULE_STRING
            	    {
            	    lv_states_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatesAttribute1393); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_states_4_0, grammarAccess.getStatesAttributeAccess().getStatesSTRINGTerminalRuleCall_4_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStatesAttributeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"states",
            	              		lv_states_4_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleStatesAttribute1411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStatesAttributeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleStatesAttribute1423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStatesAttributeAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleStatesAttribute"


    // $ANTLR start "entryRuleLabelAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:650:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:651:2: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:652:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1459);
            iv_ruleLabelAttribute=ruleLabelAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelAttribute1469); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabelAttribute"


    // $ANTLR start "ruleLabelAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:659:1: ruleLabelAttribute returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:662:28: ( (otherlv_0= 'label' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:663:1: (otherlv_0= 'label' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:663:1: (otherlv_0= 'label' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:663:3: otherlv_0= 'label' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleLabelAttribute1506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelAttributeAccess().getLabelKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLabelAttribute1518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:671:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:672:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:672:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:673:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelAttribute1535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getLabelAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleLabelAttribute1552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLabelAttributeAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleLabelAttribute"


    // $ANTLR start "entryRulePositionAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:701:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:702:2: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:703:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPositionAttributeRule()); 
            }
            pushFollow(FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1588);
            iv_rulePositionAttribute=rulePositionAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePositionAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionAttribute1598); if (state.failed) return current;

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
    // $ANTLR end "entryRulePositionAttribute"


    // $ANTLR start "rulePositionAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:710:1: rulePositionAttribute returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= '=' otherlv_2= '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_x_4_0 = null;

        EObject lv_y_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:713:28: ( (otherlv_0= 'position' otherlv_1= '=' otherlv_2= '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:714:1: (otherlv_0= 'position' otherlv_1= '=' otherlv_2= '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:714:1: (otherlv_0= 'position' otherlv_1= '=' otherlv_2= '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:714:3: otherlv_0= 'position' otherlv_1= '=' otherlv_2= '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePositionAttribute1635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPositionAttributeAccess().getPositionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulePositionAttribute1647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePositionAttribute1659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPositionAttributeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:726:1: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:727:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPositionAttributeAccess().getIntegerLiteralAction_3(),
                          current);
                  
            }

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:735:2: ( (lv_x_4_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:736:1: (lv_x_4_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:736:1: (lv_x_4_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:737:3: lv_x_4_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPositionAttributeAccess().getXIntegerParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1692);
            lv_x_4_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPositionAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"x",
                      		lv_x_4_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:753:2: ( (lv_y_5_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:754:1: (lv_y_5_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:754:1: (lv_y_5_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:755:3: lv_y_5_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPositionAttributeAccess().getYIntegerParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1713);
            lv_y_5_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPositionAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"y",
                      		lv_y_5_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_rulePositionAttribute1725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPositionAttributeAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_rulePositionAttribute1737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "rulePositionAttribute"


    // $ANTLR start "entryRuleSubtypeAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:787:1: entryRuleSubtypeAttribute returns [EObject current=null] : iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF ;
    public final EObject entryRuleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:788:2: (iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:789:2: iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1773);
            iv_ruleSubtypeAttribute=ruleSubtypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeAttribute1783); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubtypeAttribute"


    // $ANTLR start "ruleSubtypeAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:796:1: ruleSubtypeAttribute returns [EObject current=null] : (otherlv_0= 'subtype' otherlv_1= '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_subtype_2_1=null;
        Token lv_subtype_2_2=null;
        Token lv_subtype_2_3=null;
        Token lv_subtype_2_4=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:799:28: ( (otherlv_0= 'subtype' otherlv_1= '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) otherlv_3= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:800:1: (otherlv_0= 'subtype' otherlv_1= '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) otherlv_3= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:800:1: (otherlv_0= 'subtype' otherlv_1= '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) otherlv_3= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:800:3: otherlv_0= 'subtype' otherlv_1= '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSubtypeAttribute1820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubtypeAttributeAccess().getSubtypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSubtypeAttribute1832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubtypeAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:808:1: ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:809:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:809:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:810:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:810:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:811:3: lv_subtype_2_1= 'label'
                    {
                    lv_subtype_2_1=(Token)match(input,27,FOLLOW_27_in_ruleSubtypeAttribute1852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_subtype_2_1, grammarAccess.getSubtypeAttributeAccess().getSubtypeLabelKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubtypeAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "subtype", lv_subtype_2_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:823:8: lv_subtype_2_2= 'boolean'
                    {
                    lv_subtype_2_2=(Token)match(input,30,FOLLOW_30_in_ruleSubtypeAttribute1881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_subtype_2_2, grammarAccess.getSubtypeAttributeAccess().getSubtypeBooleanKeyword_2_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubtypeAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "subtype", lv_subtype_2_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:835:8: lv_subtype_2_3= 'number'
                    {
                    lv_subtype_2_3=(Token)match(input,31,FOLLOW_31_in_ruleSubtypeAttribute1910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_subtype_2_3, grammarAccess.getSubtypeAttributeAccess().getSubtypeNumberKeyword_2_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubtypeAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "subtype", lv_subtype_2_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:847:8: lv_subtype_2_4= 'interval'
                    {
                    lv_subtype_2_4=(Token)match(input,32,FOLLOW_32_in_ruleSubtypeAttribute1939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_subtype_2_4, grammarAccess.getSubtypeAttributeAccess().getSubtypeIntervalKeyword_2_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubtypeAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "subtype", lv_subtype_2_4, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSubtypeAttribute1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubtypeAttributeAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleSubtypeAttribute"


    // $ANTLR start "entryRuleStateValuesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:874:1: entryRuleStateValuesAttribute returns [EObject current=null] : iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF ;
    public final EObject entryRuleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValuesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:875:2: (iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:876:2: iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateValuesAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2003);
            iv_ruleStateValuesAttribute=ruleStateValuesAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateValuesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateValuesAttribute2013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateValuesAttribute"


    // $ANTLR start "ruleStateValuesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:883:1: ruleStateValuesAttribute returns [EObject current=null] : (otherlv_0= 'state_values' otherlv_1= '=' otherlv_2= '(' ( (lv_numbers_3_0= RULE_INT ) )+ otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numbers_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:886:28: ( (otherlv_0= 'state_values' otherlv_1= '=' otherlv_2= '(' ( (lv_numbers_3_0= RULE_INT ) )+ otherlv_4= ')' otherlv_5= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:887:1: (otherlv_0= 'state_values' otherlv_1= '=' otherlv_2= '(' ( (lv_numbers_3_0= RULE_INT ) )+ otherlv_4= ')' otherlv_5= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:887:1: (otherlv_0= 'state_values' otherlv_1= '=' otherlv_2= '(' ( (lv_numbers_3_0= RULE_INT ) )+ otherlv_4= ')' otherlv_5= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:887:3: otherlv_0= 'state_values' otherlv_1= '=' otherlv_2= '(' ( (lv_numbers_3_0= RULE_INT ) )+ otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStateValuesAttribute2050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateValuesAttributeAccess().getState_valuesKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStateValuesAttribute2062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStateValuesAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleStateValuesAttribute2074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateValuesAttributeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:899:1: ( (lv_numbers_3_0= RULE_INT ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:900:1: (lv_numbers_3_0= RULE_INT )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:900:1: (lv_numbers_3_0= RULE_INT )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:901:3: lv_numbers_3_0= RULE_INT
            	    {
            	    lv_numbers_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStateValuesAttribute2091); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_numbers_3_0, grammarAccess.getStateValuesAttributeAccess().getNumbersINTTerminalRuleCall_3_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStateValuesAttributeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"numbers",
            	              		lv_numbers_3_0, 
            	              		"INT");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleStateValuesAttribute2109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStateValuesAttributeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleStateValuesAttribute2121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStateValuesAttributeAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleStateValuesAttribute"


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:933:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:934:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:935:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2157);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute2167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:942:1: ruleApplicationAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:945:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:946:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:946:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:946:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:946:2: ( (lv_key_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:947:1: (lv_key_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:947:1: (lv_key_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:948:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationAttribute2209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getApplicationAttributeAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleApplicationAttribute2226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getApplicationAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:968:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:969:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:969:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:970:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationAttribute2243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getApplicationAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleApplicationAttribute2260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getApplicationAttributeAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleNodeSizeAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:998:1: entryRuleNodeSizeAttribute returns [EObject current=null] : iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF ;
    public final EObject entryRuleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSizeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:999:2: (iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1000:2: iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeSizeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2296);
            iv_ruleNodeSizeAttribute=ruleNodeSizeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeSizeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSizeAttribute2306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeSizeAttribute"


    // $ANTLR start "ruleNodeSizeAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1007:1: ruleNodeSizeAttribute returns [EObject current=null] : (otherlv_0= 'node_size' otherlv_1= '=' otherlv_2= '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token lv_height_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1010:28: ( (otherlv_0= 'node_size' otherlv_1= '=' otherlv_2= '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1011:1: (otherlv_0= 'node_size' otherlv_1= '=' otherlv_2= '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1011:1: (otherlv_0= 'node_size' otherlv_1= '=' otherlv_2= '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1011:3: otherlv_0= 'node_size' otherlv_1= '=' otherlv_2= '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleNodeSizeAttribute2343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeSizeAttributeAccess().getNode_sizeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNodeSizeAttribute2355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeSizeAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleNodeSizeAttribute2367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeSizeAttributeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1023:1: ( (lv_width_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1024:1: (lv_width_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1024:1: (lv_width_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1025:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_width_3_0, grammarAccess.getNodeSizeAttributeAccess().getWidthINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeSizeAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"width",
                      		lv_width_3_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1041:2: ( (lv_height_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1042:1: (lv_height_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1042:1: (lv_height_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1043:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_height_4_0, grammarAccess.getNodeSizeAttributeAccess().getHeightINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeSizeAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"height",
                      		lv_height_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleNodeSizeAttribute2423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeSizeAttributeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleNodeSizeAttribute2435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeSizeAttributeAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleNodeSizeAttribute"


    // $ANTLR start "entryRulePotential"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1075:1: entryRulePotential returns [EObject current=null] : iv_rulePotential= rulePotential EOF ;
    public final EObject entryRulePotential() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotential = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1076:2: (iv_rulePotential= rulePotential EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1077:2: iv_rulePotential= rulePotential EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialRule()); 
            }
            pushFollow(FOLLOW_rulePotential_in_entryRulePotential2471);
            iv_rulePotential=rulePotential();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotential; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotential2481); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotential"


    // $ANTLR start "rulePotential"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1084:1: rulePotential returns [EObject current=null] : (otherlv_0= 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) ;
    public final EObject rulePotential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_graph_1_0 = null;

        EObject lv_model_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1087:28: ( (otherlv_0= 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1088:1: (otherlv_0= 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1088:1: (otherlv_0= 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1088:3: otherlv_0= 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulePotential2518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPotentialAccess().getPotentialKeyword_0());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1092:1: ( (lv_graph_1_0= rulePotentialGraph ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1093:1: (lv_graph_1_0= rulePotentialGraph )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1093:1: (lv_graph_1_0= rulePotentialGraph )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1094:3: lv_graph_1_0= rulePotentialGraph
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePotentialGraph_in_rulePotential2539);
            lv_graph_1_0=rulePotentialGraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPotentialRule());
              	        }
                     		set(
                     			current, 
                     			"graph",
                      		lv_graph_1_0, 
                      		"PotentialGraph");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1110:2: ( (lv_model_2_0= rulePotentialModel ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1111:1: (lv_model_2_0= rulePotentialModel )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1111:1: (lv_model_2_0= rulePotentialModel )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1112:3: lv_model_2_0= rulePotentialModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePotentialModel_in_rulePotential2560);
            lv_model_2_0=rulePotentialModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPotentialRule());
              	        }
                     		set(
                     			current, 
                     			"model",
                      		lv_model_2_0, 
                      		"PotentialModel");
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
    // $ANTLR end "rulePotential"


    // $ANTLR start "entryRulePotentialGraph"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1136:1: entryRulePotentialGraph returns [EObject current=null] : iv_rulePotentialGraph= rulePotentialGraph EOF ;
    public final EObject entryRulePotentialGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialGraph = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1137:2: (iv_rulePotentialGraph= rulePotentialGraph EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1138:2: iv_rulePotentialGraph= rulePotentialGraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialGraphRule()); 
            }
            pushFollow(FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2596);
            iv_rulePotentialGraph=rulePotentialGraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotentialGraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialGraph2606); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotentialGraph"


    // $ANTLR start "rulePotentialGraph"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1145:1: rulePotentialGraph returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_children_2_0= RULE_ID ) )* (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )? otherlv_5= ')' ) ;
    public final EObject rulePotentialGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_children_2_0=null;
        Token otherlv_3=null;
        Token lv_parents_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1148:28: ( ( () otherlv_1= '(' ( (lv_children_2_0= RULE_ID ) )* (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )? otherlv_5= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1149:1: ( () otherlv_1= '(' ( (lv_children_2_0= RULE_ID ) )* (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )? otherlv_5= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1149:1: ( () otherlv_1= '(' ( (lv_children_2_0= RULE_ID ) )* (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )? otherlv_5= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1149:2: () otherlv_1= '(' ( (lv_children_2_0= RULE_ID ) )* (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )? otherlv_5= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1149:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1150:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPotentialGraphAccess().getPotentialGraphAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePotentialGraph2655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPotentialGraphAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1162:1: ( (lv_children_2_0= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1163:1: (lv_children_2_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1163:1: (lv_children_2_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1164:3: lv_children_2_0= RULE_ID
            	    {
            	    lv_children_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2672); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_children_2_0, grammarAccess.getPotentialGraphAccess().getChildrenIDTerminalRuleCall_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPotentialGraphRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"children",
            	              		lv_children_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:3: (otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:5: otherlv_3= '|' ( (lv_parents_4_0= RULE_ID ) )*
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulePotentialGraph2691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0());
                          
                    }
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1184:1: ( (lv_parents_4_0= RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1185:1: (lv_parents_4_0= RULE_ID )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1185:1: (lv_parents_4_0= RULE_ID )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1186:3: lv_parents_4_0= RULE_ID
                    	    {
                    	    lv_parents_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2708); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_parents_4_0, grammarAccess.getPotentialGraphAccess().getParentsIDTerminalRuleCall_3_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPotentialGraphRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"parents",
                    	              		lv_parents_4_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_rulePotentialGraph2728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPotentialGraphAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "rulePotentialGraph"


    // $ANTLR start "entryRulePotentialModel"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1214:1: entryRulePotentialModel returns [EObject current=null] : iv_rulePotentialModel= rulePotentialModel EOF ;
    public final EObject entryRulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1215:2: (iv_rulePotentialModel= rulePotentialModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1216:2: iv_rulePotentialModel= rulePotentialModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialModelRule()); 
            }
            pushFollow(FOLLOW_rulePotentialModel_in_entryRulePotentialModel2764);
            iv_rulePotentialModel=rulePotentialModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotentialModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialModel2774); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotentialModel"


    // $ANTLR start "rulePotentialModel"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1223:1: rulePotentialModel returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* otherlv_3= '}' ) ;
    public final EObject rulePotentialModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1226:28: ( ( () otherlv_1= '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* otherlv_3= '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1227:1: ( () otherlv_1= '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* otherlv_3= '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1227:1: ( () otherlv_1= '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* otherlv_3= '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1227:2: () otherlv_1= '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* otherlv_3= '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1227:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1228:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPotentialModelAccess().getPotentialModelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePotentialModel2823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPotentialModelAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1240:1: ( (lv_attributes_2_0= rulePotentialAttribute ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1241:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1241:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1242:3: lv_attributes_2_0= rulePotentialAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPotentialModelAccess().getAttributesPotentialAttributeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePotentialAttribute_in_rulePotentialModel2844);
            	    lv_attributes_2_0=rulePotentialAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPotentialModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"PotentialAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePotentialModel2857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPotentialModelAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "rulePotentialModel"


    // $ANTLR start "entryRulePotentialAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1270:1: entryRulePotentialAttribute returns [EObject current=null] : iv_rulePotentialAttribute= rulePotentialAttribute EOF ;
    public final EObject entryRulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1271:2: (iv_rulePotentialAttribute= rulePotentialAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1272:2: iv_rulePotentialAttribute= rulePotentialAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialAttributeRule()); 
            }
            pushFollow(FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2893);
            iv_rulePotentialAttribute=rulePotentialAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotentialAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialAttribute2903); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotentialAttribute"


    // $ANTLR start "rulePotentialAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1279:1: rulePotentialAttribute returns [EObject current=null] : (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) ;
    public final EObject rulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PotentialDataAttribute_0 = null;

        EObject this_PotentialTableAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1282:28: ( (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1283:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1283:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==39) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1284:2: this_PotentialDataAttribute_0= rulePotentialDataAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialDataAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2953);
                    this_PotentialDataAttribute_0=rulePotentialDataAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PotentialDataAttribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1297:2: this_PotentialTableAttribute_1= rulePotentialTableAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialTableAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute2983);
                    this_PotentialTableAttribute_1=rulePotentialTableAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PotentialTableAttribute_1; 
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
    // $ANTLR end "rulePotentialAttribute"


    // $ANTLR start "entryRulePotentialDataAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1316:1: entryRulePotentialDataAttribute returns [EObject current=null] : iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF ;
    public final EObject entryRulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1317:2: (iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1318:2: iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialDataAttributeRule()); 
            }
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3018);
            iv_rulePotentialDataAttribute=rulePotentialDataAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotentialDataAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialDataAttribute3028); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotentialDataAttribute"


    // $ANTLR start "rulePotentialDataAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1325:1: rulePotentialDataAttribute returns [EObject current=null] : ( () otherlv_1= 'data' otherlv_2= '=' ( (lv_data_3_0= ruleMatrixRow ) ) otherlv_4= ';' ) ;
    public final EObject rulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_data_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1328:28: ( ( () otherlv_1= 'data' otherlv_2= '=' ( (lv_data_3_0= ruleMatrixRow ) ) otherlv_4= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1329:1: ( () otherlv_1= 'data' otherlv_2= '=' ( (lv_data_3_0= ruleMatrixRow ) ) otherlv_4= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1329:1: ( () otherlv_1= 'data' otherlv_2= '=' ( (lv_data_3_0= ruleMatrixRow ) ) otherlv_4= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1329:2: () otherlv_1= 'data' otherlv_2= '=' ( (lv_data_3_0= ruleMatrixRow ) ) otherlv_4= ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1329:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1330:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPotentialDataAttributeAccess().getPotentialDataAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_rulePotentialDataAttribute3077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPotentialDataAttributeAccess().getDataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePotentialDataAttribute3089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPotentialDataAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:1: ( (lv_data_3_0= ruleMatrixRow ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1347:1: (lv_data_3_0= ruleMatrixRow )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1347:1: (lv_data_3_0= ruleMatrixRow )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1348:3: lv_data_3_0= ruleMatrixRow
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getDataMatrixRowParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMatrixRow_in_rulePotentialDataAttribute3110);
            lv_data_3_0=ruleMatrixRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPotentialDataAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"data",
                      		lv_data_3_0, 
                      		"MatrixRow");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulePotentialDataAttribute3122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPotentialDataAttributeAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "rulePotentialDataAttribute"


    // $ANTLR start "entryRuleMatrixRow"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1376:1: entryRuleMatrixRow returns [EObject current=null] : iv_ruleMatrixRow= ruleMatrixRow EOF ;
    public final EObject entryRuleMatrixRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRow = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1377:2: (iv_ruleMatrixRow= ruleMatrixRow EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1378:2: iv_ruleMatrixRow= ruleMatrixRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatrixRowRule()); 
            }
            pushFollow(FOLLOW_ruleMatrixRow_in_entryRuleMatrixRow3158);
            iv_ruleMatrixRow=ruleMatrixRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatrixRow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRow3168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatrixRow"


    // $ANTLR start "ruleMatrixRow"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1385:1: ruleMatrixRow returns [EObject current=null] : ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) ) ;
    public final EObject ruleMatrixRow() throws RecognitionException {
        EObject current = null;

        EObject lv_r5_1_0 = null;

        EObject lv_r4_3_0 = null;

        EObject lv_r3_5_0 = null;

        EObject lv_r2_7_0 = null;

        EObject lv_r1_9_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1388:28: ( ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:2: ( () ( (lv_r5_1_0= ruleList5 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:2: ( () ( (lv_r5_1_0= ruleList5 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:3: () ( (lv_r5_1_0= ruleList5 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1389:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1390:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatrixRowAccess().getMatrixRowAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1398:2: ( (lv_r5_1_0= ruleList5 ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1399:1: (lv_r5_1_0= ruleList5 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1399:1: (lv_r5_1_0= ruleList5 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1400:3: lv_r5_1_0= ruleList5
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMatrixRowAccess().getR5List5ParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList5_in_ruleMatrixRow3227);
                    	    lv_r5_1_0=ruleList5();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMatrixRowRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"r5",
                    	              		lv_r5_1_0, 
                    	              		"List5");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1417:6: ( () ( (lv_r4_3_0= ruleList4 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1417:6: ( () ( (lv_r4_3_0= ruleList4 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1417:7: () ( (lv_r4_3_0= ruleList4 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1417:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1418:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatrixRowAccess().getMatrixRowAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1426:2: ( (lv_r4_3_0= ruleList4 ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1427:1: (lv_r4_3_0= ruleList4 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1427:1: (lv_r4_3_0= ruleList4 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1428:3: lv_r4_3_0= ruleList4
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMatrixRowAccess().getR4List4ParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList4_in_ruleMatrixRow3269);
                    	    lv_r4_3_0=ruleList4();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMatrixRowRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"r4",
                    	              		lv_r4_3_0, 
                    	              		"List4");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1445:6: ( () ( (lv_r3_5_0= ruleList3 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1445:6: ( () ( (lv_r3_5_0= ruleList3 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1445:7: () ( (lv_r3_5_0= ruleList3 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1445:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatrixRowAccess().getMatrixRowAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1454:2: ( (lv_r3_5_0= ruleList3 ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1455:1: (lv_r3_5_0= ruleList3 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1455:1: (lv_r3_5_0= ruleList3 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1456:3: lv_r3_5_0= ruleList3
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMatrixRowAccess().getR3List3ParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList3_in_ruleMatrixRow3311);
                    	    lv_r3_5_0=ruleList3();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMatrixRowRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"r3",
                    	              		lv_r3_5_0, 
                    	              		"List3");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1473:6: ( () ( (lv_r2_7_0= ruleList2 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1473:6: ( () ( (lv_r2_7_0= ruleList2 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1473:7: () ( (lv_r2_7_0= ruleList2 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1473:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1474:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatrixRowAccess().getMatrixRowAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1482:2: ( (lv_r2_7_0= ruleList2 ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==24) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1483:1: (lv_r2_7_0= ruleList2 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1483:1: (lv_r2_7_0= ruleList2 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1484:3: lv_r2_7_0= ruleList2
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMatrixRowAccess().getR2List2ParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList2_in_ruleMatrixRow3353);
                    	    lv_r2_7_0=ruleList2();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMatrixRowRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"r2",
                    	              		lv_r2_7_0, 
                    	              		"List2");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1501:6: ( () ( (lv_r1_9_0= ruleList1 ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1501:6: ( () ( (lv_r1_9_0= ruleList1 ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1501:7: () ( (lv_r1_9_0= ruleList1 ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1501:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1502:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatrixRowAccess().getMatrixRowAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1510:2: ( (lv_r1_9_0= ruleList1 ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1511:1: (lv_r1_9_0= ruleList1 )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1511:1: (lv_r1_9_0= ruleList1 )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1512:3: lv_r1_9_0= ruleList1
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMatrixRowAccess().getR1List1ParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList1_in_ruleMatrixRow3395);
                    lv_r1_9_0=ruleList1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMatrixRowRule());
                      	        }
                             		set(
                             			current, 
                             			"r1",
                              		lv_r1_9_0, 
                              		"List1");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleMatrixRow"


    // $ANTLR start "entryRuleList5"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1536:1: entryRuleList5 returns [EObject current=null] : iv_ruleList5= ruleList5 EOF ;
    public final EObject entryRuleList5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList5 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1537:2: (iv_ruleList5= ruleList5 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1538:2: iv_ruleList5= ruleList5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getList5Rule()); 
            }
            pushFollow(FOLLOW_ruleList5_in_entryRuleList53432);
            iv_ruleList5=ruleList5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList53442); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList5"


    // $ANTLR start "ruleList5"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:1: ruleList5 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_list_2_0= ruleList4 ) )+ otherlv_3= ')' ) ;
    public final EObject ruleList5() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1548:28: ( ( () otherlv_1= '(' ( (lv_list_2_0= ruleList4 ) )+ otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1549:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList4 ) )+ otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1549:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList4 ) )+ otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1549:2: () otherlv_1= '(' ( (lv_list_2_0= ruleList4 ) )+ otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1549:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1550:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getList5Access().getList5Action_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleList53491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getList5Access().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1562:1: ( (lv_list_2_0= ruleList4 ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1563:1: (lv_list_2_0= ruleList4 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1563:1: (lv_list_2_0= ruleList4 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1564:3: lv_list_2_0= ruleList4
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getList5Access().getListList4ParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList4_in_ruleList53512);
            	    lv_list_2_0=ruleList4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getList5Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"list",
            	              		lv_list_2_0, 
            	              		"List4");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleList53525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getList5Access().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleList5"


    // $ANTLR start "entryRuleList4"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1592:1: entryRuleList4 returns [EObject current=null] : iv_ruleList4= ruleList4 EOF ;
    public final EObject entryRuleList4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList4 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1593:2: (iv_ruleList4= ruleList4 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1594:2: iv_ruleList4= ruleList4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getList4Rule()); 
            }
            pushFollow(FOLLOW_ruleList4_in_entryRuleList43561);
            iv_ruleList4=ruleList4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList43571); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList4"


    // $ANTLR start "ruleList4"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1601:1: ruleList4 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_list_2_0= ruleList3 ) )+ otherlv_3= ')' ) ;
    public final EObject ruleList4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1604:28: ( ( () otherlv_1= '(' ( (lv_list_2_0= ruleList3 ) )+ otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1605:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList3 ) )+ otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1605:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList3 ) )+ otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1605:2: () otherlv_1= '(' ( (lv_list_2_0= ruleList3 ) )+ otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1605:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1606:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getList4Access().getList4Action_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleList43620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getList4Access().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1618:1: ( (lv_list_2_0= ruleList3 ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1619:1: (lv_list_2_0= ruleList3 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1619:1: (lv_list_2_0= ruleList3 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1620:3: lv_list_2_0= ruleList3
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getList4Access().getListList3ParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList3_in_ruleList43641);
            	    lv_list_2_0=ruleList3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getList4Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"list",
            	              		lv_list_2_0, 
            	              		"List3");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleList43654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getList4Access().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleList4"


    // $ANTLR start "entryRuleList3"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:1: entryRuleList3 returns [EObject current=null] : iv_ruleList3= ruleList3 EOF ;
    public final EObject entryRuleList3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList3 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1649:2: (iv_ruleList3= ruleList3 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1650:2: iv_ruleList3= ruleList3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getList3Rule()); 
            }
            pushFollow(FOLLOW_ruleList3_in_entryRuleList33690);
            iv_ruleList3=ruleList3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList33700); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList3"


    // $ANTLR start "ruleList3"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1657:1: ruleList3 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_list_2_0= ruleList2 ) )+ otherlv_3= ')' ) ;
    public final EObject ruleList3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1660:28: ( ( () otherlv_1= '(' ( (lv_list_2_0= ruleList2 ) )+ otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1661:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList2 ) )+ otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1661:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList2 ) )+ otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1661:2: () otherlv_1= '(' ( (lv_list_2_0= ruleList2 ) )+ otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1661:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1662:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getList3Access().getList3Action_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleList33749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getList3Access().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1674:1: ( (lv_list_2_0= ruleList2 ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1675:1: (lv_list_2_0= ruleList2 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1675:1: (lv_list_2_0= ruleList2 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1676:3: lv_list_2_0= ruleList2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getList3Access().getListList2ParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList2_in_ruleList33770);
            	    lv_list_2_0=ruleList2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getList3Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"list",
            	              		lv_list_2_0, 
            	              		"List2");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleList33783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getList3Access().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleList3"


    // $ANTLR start "entryRuleList2"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1704:1: entryRuleList2 returns [EObject current=null] : iv_ruleList2= ruleList2 EOF ;
    public final EObject entryRuleList2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList2 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1705:2: (iv_ruleList2= ruleList2 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1706:2: iv_ruleList2= ruleList2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getList2Rule()); 
            }
            pushFollow(FOLLOW_ruleList2_in_entryRuleList23819);
            iv_ruleList2=ruleList2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList23829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList2"


    // $ANTLR start "ruleList2"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1713:1: ruleList2 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_list_2_0= ruleList1 ) )+ otherlv_3= ')' ) ;
    public final EObject ruleList2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1716:28: ( ( () otherlv_1= '(' ( (lv_list_2_0= ruleList1 ) )+ otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1717:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList1 ) )+ otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1717:1: ( () otherlv_1= '(' ( (lv_list_2_0= ruleList1 ) )+ otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1717:2: () otherlv_1= '(' ( (lv_list_2_0= ruleList1 ) )+ otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1717:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1718:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getList2Access().getList2Action_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleList23878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getList2Access().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1730:1: ( (lv_list_2_0= ruleList1 ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:1: (lv_list_2_0= ruleList1 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:1: (lv_list_2_0= ruleList1 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1732:3: lv_list_2_0= ruleList1
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getList2Access().getListList1ParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList1_in_ruleList23899);
            	    lv_list_2_0=ruleList1();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getList2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"list",
            	              		lv_list_2_0, 
            	              		"List1");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleList23912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getList2Access().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleList2"


    // $ANTLR start "entryRuleList1"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1760:1: entryRuleList1 returns [EObject current=null] : iv_ruleList1= ruleList1 EOF ;
    public final EObject entryRuleList1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList1 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1761:2: (iv_ruleList1= ruleList1 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1762:2: iv_ruleList1= ruleList1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getList1Rule()); 
            }
            pushFollow(FOLLOW_ruleList1_in_entryRuleList13948);
            iv_ruleList1=ruleList1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList13958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList1"


    // $ANTLR start "ruleList1"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1769:1: ruleList1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_items_2_0= ruleunaryExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleList1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1772:28: ( ( () otherlv_1= '(' ( (lv_items_2_0= ruleunaryExpression ) )* otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1773:1: ( () otherlv_1= '(' ( (lv_items_2_0= ruleunaryExpression ) )* otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1773:1: ( () otherlv_1= '(' ( (lv_items_2_0= ruleunaryExpression ) )* otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1773:2: () otherlv_1= '(' ( (lv_items_2_0= ruleunaryExpression ) )* otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1773:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1774:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getList1Access().getList1Action_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleList14007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getList1Access().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1786:1: ( (lv_items_2_0= ruleunaryExpression ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_BOOLEAN)||LA27_0==61||(LA27_0>=63 && LA27_0<=100)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1787:1: (lv_items_2_0= ruleunaryExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1787:1: (lv_items_2_0= ruleunaryExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1788:3: lv_items_2_0= ruleunaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getList1Access().getItemsUnaryExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleunaryExpression_in_ruleList14028);
            	    lv_items_2_0=ruleunaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getList1Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_2_0, 
            	              		"unaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleList14041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getList1Access().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleList1"


    // $ANTLR start "entryRuleMeanTerm"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1818:1: entryRuleMeanTerm returns [String current=null] : iv_ruleMeanTerm= ruleMeanTerm EOF ;
    public final String entryRuleMeanTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1819:2: (iv_ruleMeanTerm= ruleMeanTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1820:2: iv_ruleMeanTerm= ruleMeanTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeanTermRule()); 
            }
            pushFollow(FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm4080);
            iv_ruleMeanTerm=ruleMeanTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeanTerm.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanTerm4091); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMeanTerm"


    // $ANTLR start "ruleMeanTerm"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1827:1: ruleMeanTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMeanTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_DOUBLE_1=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1830:28: ( (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1831:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1831:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DOUBLE) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==38) ) {
                    alt28=2;
                }
                else if ( (LA28_1==EOF) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1831:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOUBLE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOUBLE_0, grammarAccess.getMeanTermAccess().getDOUBLETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1839:6: (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1839:6: (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1839:11: this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOUBLE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOUBLE_1, grammarAccess.getMeanTermAccess().getDOUBLETerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleMeanTerm4176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMeanTermAccess().getAsteriskKeyword_1_1()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1860:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_4, grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_2()); 
                          
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
    // $ANTLR end "ruleMeanTerm"


    // $ANTLR start "entryRulePotentialTableAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1875:1: entryRulePotentialTableAttribute returns [EObject current=null] : iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF ;
    public final EObject entryRulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialTableAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1876:2: (iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1877:2: iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotentialTableAttributeRule()); 
            }
            pushFollow(FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4263);
            iv_rulePotentialTableAttribute=rulePotentialTableAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotentialTableAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialTableAttribute4273); if (state.failed) return current;

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
    // $ANTLR end "entryRulePotentialTableAttribute"


    // $ANTLR start "rulePotentialTableAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1884:1: rulePotentialTableAttribute returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) ;
    public final EObject rulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_samples_1_0 = null;

        EObject lv_data_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1887:28: ( ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1888:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1888:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1888:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1888:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1889:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1889:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1890:3: lv_nodes_0_0= ruleModelNodesAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getNodesModelNodesAttributeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4319);
            lv_nodes_0_0=ruleModelNodesAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPotentialTableAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"nodes",
                      		lv_nodes_0_0, 
                      		"ModelNodesAttribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1906:2: ( (lv_samples_1_0= ruleSamplesAttribute ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1907:1: (lv_samples_1_0= ruleSamplesAttribute )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1907:1: (lv_samples_1_0= ruleSamplesAttribute )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1908:3: lv_samples_1_0= ruleSamplesAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getSamplesSamplesAttributeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4340);
                    lv_samples_1_0=ruleSamplesAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPotentialTableAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"samples",
                              		lv_samples_1_0, 
                              		"SamplesAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1924:3: ( (lv_data_2_0= ruleModelDataAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1925:1: (lv_data_2_0= ruleModelDataAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1925:1: (lv_data_2_0= ruleModelDataAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1926:3: lv_data_2_0= ruleModelDataAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getDataModelDataAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4362);
            lv_data_2_0=ruleModelDataAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPotentialTableAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"data",
                      		lv_data_2_0, 
                      		"ModelDataAttribute");
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
    // $ANTLR end "rulePotentialTableAttribute"


    // $ANTLR start "entryRuleModelNodesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1950:1: entryRuleModelNodesAttribute returns [EObject current=null] : iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF ;
    public final EObject entryRuleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1951:2: (iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1952:2: iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelNodesAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4398);
            iv_ruleModelNodesAttribute=ruleModelNodesAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelNodesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodesAttribute4408); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelNodesAttribute"


    // $ANTLR start "ruleModelNodesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1959:1: ruleModelNodesAttribute returns [EObject current=null] : ( () otherlv_1= 'model_nodes' otherlv_2= '=' otherlv_3= '(' ( (lv_configurations_4_0= RULE_ID ) )* otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_configurations_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1962:28: ( ( () otherlv_1= 'model_nodes' otherlv_2= '=' otherlv_3= '(' ( (lv_configurations_4_0= RULE_ID ) )* otherlv_5= ')' otherlv_6= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1963:1: ( () otherlv_1= 'model_nodes' otherlv_2= '=' otherlv_3= '(' ( (lv_configurations_4_0= RULE_ID ) )* otherlv_5= ')' otherlv_6= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1963:1: ( () otherlv_1= 'model_nodes' otherlv_2= '=' otherlv_3= '(' ( (lv_configurations_4_0= RULE_ID ) )* otherlv_5= ')' otherlv_6= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1963:2: () otherlv_1= 'model_nodes' otherlv_2= '=' otherlv_3= '(' ( (lv_configurations_4_0= RULE_ID ) )* otherlv_5= ')' otherlv_6= ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1963:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1964:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelNodesAttributeAccess().getModelNodesAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleModelNodesAttribute4457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelNodesAttributeAccess().getModel_nodesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleModelNodesAttribute4469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelNodesAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleModelNodesAttribute4481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelNodesAttributeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1984:1: ( (lv_configurations_4_0= RULE_ID ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1985:1: (lv_configurations_4_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1985:1: (lv_configurations_4_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1986:3: lv_configurations_4_0= RULE_ID
            	    {
            	    lv_configurations_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodesAttribute4498); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_configurations_4_0, grammarAccess.getModelNodesAttributeAccess().getConfigurationsIDTerminalRuleCall_4_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModelNodesAttributeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"configurations",
            	              		lv_configurations_4_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleModelNodesAttribute4516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModelNodesAttributeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleModelNodesAttribute4528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelNodesAttributeAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleModelNodesAttribute"


    // $ANTLR start "entryRuleSamplesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2018:1: entryRuleSamplesAttribute returns [EObject current=null] : iv_ruleSamplesAttribute= ruleSamplesAttribute EOF ;
    public final EObject entryRuleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2019:2: (iv_ruleSamplesAttribute= ruleSamplesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2020:2: iv_ruleSamplesAttribute= ruleSamplesAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSamplesAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4564);
            iv_ruleSamplesAttribute=ruleSamplesAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSamplesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplesAttribute4574); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSamplesAttribute"


    // $ANTLR start "ruleSamplesAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2027:1: ruleSamplesAttribute returns [EObject current=null] : (otherlv_0= 'samples_per_interval' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2030:28: ( (otherlv_0= 'samples_per_interval' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2031:1: (otherlv_0= 'samples_per_interval' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2031:1: (otherlv_0= 'samples_per_interval' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2031:3: otherlv_0= 'samples_per_interval' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleSamplesAttribute4611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSamplesAttributeAccess().getSamples_per_intervalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSamplesAttribute4623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSamplesAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2039:1: ( (lv_value_2_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2040:1: (lv_value_2_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2040:1: (lv_value_2_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2041:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplesAttribute4640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getSamplesAttributeAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSamplesAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSamplesAttribute4657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSamplesAttributeAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleSamplesAttribute"


    // $ANTLR start "entryRuleModelDataAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2069:1: entryRuleModelDataAttribute returns [EObject current=null] : iv_ruleModelDataAttribute= ruleModelDataAttribute EOF ;
    public final EObject entryRuleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2070:2: (iv_ruleModelDataAttribute= ruleModelDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2071:2: iv_ruleModelDataAttribute= ruleModelDataAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelDataAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4693);
            iv_ruleModelDataAttribute=ruleModelDataAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelDataAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDataAttribute4703); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelDataAttribute"


    // $ANTLR start "ruleModelDataAttribute"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2078:1: ruleModelDataAttribute returns [EObject current=null] : ( () otherlv_1= 'model_data' otherlv_2= '=' otherlv_3= '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_sequence_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2081:28: ( ( () otherlv_1= 'model_data' otherlv_2= '=' otherlv_3= '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2082:1: ( () otherlv_1= 'model_data' otherlv_2= '=' otherlv_3= '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2082:1: ( () otherlv_1= 'model_data' otherlv_2= '=' otherlv_3= '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2082:2: () otherlv_1= 'model_data' otherlv_2= '=' otherlv_3= '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) otherlv_5= ')' otherlv_6= ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2082:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2083:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelDataAttributeAccess().getModelDataAttributeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleModelDataAttribute4752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelDataAttributeAccess().getModel_dataKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleModelDataAttribute4764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelDataAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleModelDataAttribute4776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelDataAttributeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2103:1: ( (lv_sequence_4_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2104:1: (lv_sequence_4_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2104:1: (lv_sequence_4_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2105:3: lv_sequence_4_0= ruleExpressionSequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelDataAttributeAccess().getSequenceExpressionSequenceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4797);
            lv_sequence_4_0=ruleExpressionSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelDataAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"sequence",
                      		lv_sequence_4_0, 
                      		"ExpressionSequence");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleModelDataAttribute4809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModelDataAttributeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleModelDataAttribute4821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelDataAttributeAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleModelDataAttribute"


    // $ANTLR start "entryRuleClassDefinition"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2137:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2138:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2139:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4857);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition4867); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2146:1: ruleClassDefinition returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleClassElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2149:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleClassElement ) )* otherlv_4= '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2150:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleClassElement ) )* otherlv_4= '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2150:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleClassElement ) )* otherlv_4= '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2150:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleClassElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleClassDefinition4904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassDefinitionAccess().getClassKeyword_0());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2154:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2155:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2155:1: (lv_name_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2156:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition4921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleClassDefinition4938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2176:1: ( (lv_elements_3_0= ruleClassElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=16 && LA31_0<=22)||(LA31_0>=27 && LA31_0<=29)||(LA31_0>=33 && LA31_0<=35)||(LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2177:1: (lv_elements_3_0= ruleClassElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2177:1: (lv_elements_3_0= ruleClassElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2178:3: lv_elements_3_0= ruleClassElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassDefinitionAccess().getElementsClassElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClassDefinition4959);
            	    lv_elements_3_0=ruleClassElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"ClassElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleClassDefinition4972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleClassElement"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2206:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2207:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2208:2: iv_ruleClassElement= ruleClassElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassElementRule()); 
            }
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement5008);
            iv_ruleClassElement=ruleClassElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement5018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassElement"


    // $ANTLR start "ruleClassElement"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2215:1: ruleClassElement returns [EObject current=null] : (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_DomainElement_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_ClassInstance_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2218:28: ( (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2219:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2219:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 35:
            case 42:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
            case 22:
            case 27:
            case 28:
            case 29:
            case 33:
            case 34:
                {
                alt32=2;
                }
                break;
            case 43:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2220:2: this_DomainElement_0= ruleDomainElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getDomainElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleClassElement5068);
                    this_DomainElement_0=ruleDomainElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2233:2: this_Attribute_1= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleClassElement5098);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2246:2: this_ClassInstance_2= ruleClassInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getClassInstanceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassInstance_in_ruleClassElement5128);
                    this_ClassInstance_2=ruleClassInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassInstance_2; 
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
    // $ANTLR end "ruleClassElement"


    // $ANTLR start "entryRuleClassInstance"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2265:1: entryRuleClassInstance returns [EObject current=null] : iv_ruleClassInstance= ruleClassInstance EOF ;
    public final EObject entryRuleClassInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInstance = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2266:2: (iv_ruleClassInstance= ruleClassInstance EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2267:2: iv_ruleClassInstance= ruleClassInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleClassInstance_in_entryRuleClassInstance5163);
            iv_ruleClassInstance=ruleClassInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassInstance5173); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassInstance"


    // $ANTLR start "ruleClassInstance"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2274:1: ruleClassInstance returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_input_5_0= ruleInputBindings ) )? (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? otherlv_8= ')' otherlv_9= '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) otherlv_11= '}' ) ;
    public final EObject ruleClassInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_instanceName_1_0=null;
        Token otherlv_2=null;
        Token lv_className_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2277:28: ( (otherlv_0= 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_input_5_0= ruleInputBindings ) )? (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? otherlv_8= ')' otherlv_9= '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) otherlv_11= '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2278:1: (otherlv_0= 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_input_5_0= ruleInputBindings ) )? (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? otherlv_8= ')' otherlv_9= '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) otherlv_11= '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2278:1: (otherlv_0= 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_input_5_0= ruleInputBindings ) )? (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? otherlv_8= ')' otherlv_9= '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) otherlv_11= '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2278:3: otherlv_0= 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_input_5_0= ruleInputBindings ) )? (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? otherlv_8= ')' otherlv_9= '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleClassInstance5210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassInstanceAccess().getInstanceKeyword_0());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2282:1: ( (lv_instanceName_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2283:1: (lv_instanceName_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2283:1: (lv_instanceName_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2284:3: lv_instanceName_1_0= RULE_ID
            {
            lv_instanceName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_instanceName_1_0, grammarAccess.getClassInstanceAccess().getInstanceNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"instanceName",
                      		lv_instanceName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleClassInstance5244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassInstanceAccess().getColonKeyword_2());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2304:1: ( (lv_className_3_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2305:1: (lv_className_3_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2305:1: (lv_className_3_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2306:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_className_3_0, grammarAccess.getClassInstanceAccess().getClassNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"className",
                      		lv_className_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleClassInstance5278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassInstanceAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2326:1: ( (lv_input_5_0= ruleInputBindings ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2327:1: (lv_input_5_0= ruleInputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2327:1: (lv_input_5_0= ruleInputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2328:3: lv_input_5_0= ruleInputBindings
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassInstanceAccess().getInputInputBindingsParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputBindings_in_ruleClassInstance5299);
                    lv_input_5_0=ruleInputBindings();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassInstanceRule());
                      	        }
                             		set(
                             			current, 
                             			"input",
                              		lv_input_5_0, 
                              		"InputBindings");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2344:3: (otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2344:5: otherlv_6= ';' ( (lv_output_7_0= ruleOutputBindings ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleClassInstance5313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassInstanceAccess().getSemicolonKeyword_6_0());
                          
                    }
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2348:1: ( (lv_output_7_0= ruleOutputBindings ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:1: (lv_output_7_0= ruleOutputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:1: (lv_output_7_0= ruleOutputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2350:3: lv_output_7_0= ruleOutputBindings
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassInstanceAccess().getOutputOutputBindingsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputBindings_in_ruleClassInstance5334);
                    lv_output_7_0=ruleOutputBindings();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassInstanceRule());
                      	        }
                             		set(
                             			current, 
                             			"output",
                              		lv_output_7_0, 
                              		"OutputBindings");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleClassInstance5348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getClassInstanceAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleClassInstance5360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClassInstanceAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2374:1: ( (lv_attributes_10_0= ruleNodeAttributes ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2375:1: (lv_attributes_10_0= ruleNodeAttributes )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2375:1: (lv_attributes_10_0= ruleNodeAttributes )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2376:3: lv_attributes_10_0= ruleNodeAttributes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassInstanceAccess().getAttributesNodeAttributesParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeAttributes_in_ruleClassInstance5381);
            lv_attributes_10_0=ruleNodeAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassInstanceRule());
              	        }
                     		set(
                     			current, 
                     			"attributes",
                      		lv_attributes_10_0, 
                      		"NodeAttributes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleClassInstance5393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getClassInstanceAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleClassInstance"


    // $ANTLR start "entryRuleInputBindings"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2404:1: entryRuleInputBindings returns [EObject current=null] : iv_ruleInputBindings= ruleInputBindings EOF ;
    public final EObject entryRuleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2405:2: (iv_ruleInputBindings= ruleInputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2406:2: iv_ruleInputBindings= ruleInputBindings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputBindingsRule()); 
            }
            pushFollow(FOLLOW_ruleInputBindings_in_entryRuleInputBindings5429);
            iv_ruleInputBindings=ruleInputBindings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputBindings; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBindings5439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputBindings"


    // $ANTLR start "ruleInputBindings"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2413:1: ruleInputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleInputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) ;
    public final EObject ruleInputBindings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2416:28: ( ( ( (lv_lhs_0_0= ruleInputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:2: ( (lv_lhs_0_0= ruleInputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleInputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:2: ( (lv_lhs_0_0= ruleInputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2418:1: (lv_lhs_0_0= ruleInputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2418:1: (lv_lhs_0_0= ruleInputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2419:3: lv_lhs_0_0= ruleInputBinding
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInputBinding_in_ruleInputBindings5485);
            lv_lhs_0_0=ruleInputBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputBindingsRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"InputBinding");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleInputBindings5497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputBindingsAccess().getCommaKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2439:1: ( (lv_rhs_2_0= ruleInputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2440:1: (lv_rhs_2_0= ruleInputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2440:1: (lv_rhs_2_0= ruleInputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2441:3: lv_rhs_2_0= ruleInputBindings
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInputBindings_in_ruleInputBindings5518);
            lv_rhs_2_0=ruleInputBindings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputBindingsRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"InputBindings");
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
    // $ANTLR end "ruleInputBindings"


    // $ANTLR start "entryRuleInputBinding"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2465:1: entryRuleInputBinding returns [EObject current=null] : iv_ruleInputBinding= ruleInputBinding EOF ;
    public final EObject entryRuleInputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2466:2: (iv_ruleInputBinding= ruleInputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2467:2: iv_ruleInputBinding= ruleInputBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputBindingRule()); 
            }
            pushFollow(FOLLOW_ruleInputBinding_in_entryRuleInputBinding5554);
            iv_ruleInputBinding=ruleInputBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBinding5564); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputBinding"


    // $ANTLR start "ruleInputBinding"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2474:1: ruleInputBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_actual_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token otherlv_1=null;
        Token lv_actual_2_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2477:28: ( ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_actual_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_actual_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_actual_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:2: ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_actual_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2479:1: (lv_formal_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2479:1: (lv_formal_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2480:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_formal_0_0, grammarAccess.getInputBindingAccess().getFormalIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputBindingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"formal",
                      		lv_formal_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInputBinding5623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputBindingAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2500:1: ( (lv_actual_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2501:1: (lv_actual_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2501:1: (lv_actual_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2502:3: lv_actual_2_0= RULE_ID
            {
            lv_actual_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_actual_2_0, grammarAccess.getInputBindingAccess().getActualIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputBindingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"actual",
                      		lv_actual_2_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleInputBinding"


    // $ANTLR start "entryRuleOutputBindings"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2526:1: entryRuleOutputBindings returns [EObject current=null] : iv_ruleOutputBindings= ruleOutputBindings EOF ;
    public final EObject entryRuleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2527:2: (iv_ruleOutputBindings= ruleOutputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2528:2: iv_ruleOutputBindings= ruleOutputBindings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputBindingsRule()); 
            }
            pushFollow(FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5681);
            iv_ruleOutputBindings=ruleOutputBindings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputBindings; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBindings5691); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutputBindings"


    // $ANTLR start "ruleOutputBindings"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2535:1: ruleOutputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleOutputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) ;
    public final EObject ruleOutputBindings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2538:28: ( ( ( (lv_lhs_0_0= ruleOutputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:2: ( (lv_lhs_0_0= ruleOutputBinding ) ) otherlv_1= ',' ( (lv_rhs_2_0= ruleOutputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:2: ( (lv_lhs_0_0= ruleOutputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2540:1: (lv_lhs_0_0= ruleOutputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2540:1: (lv_lhs_0_0= ruleOutputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2541:3: lv_lhs_0_0= ruleOutputBinding
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutputBinding_in_ruleOutputBindings5737);
            lv_lhs_0_0=ruleOutputBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputBindingsRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"OutputBinding");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOutputBindings5749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOutputBindingsAccess().getCommaKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2561:1: ( (lv_rhs_2_0= ruleOutputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2562:1: (lv_rhs_2_0= ruleOutputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2562:1: (lv_rhs_2_0= ruleOutputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2563:3: lv_rhs_2_0= ruleOutputBindings
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutputBindings_in_ruleOutputBindings5770);
            lv_rhs_2_0=ruleOutputBindings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputBindingsRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"OutputBindings");
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
    // $ANTLR end "ruleOutputBindings"


    // $ANTLR start "entryRuleOutputBinding"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2587:1: entryRuleOutputBinding returns [EObject current=null] : iv_ruleOutputBinding= ruleOutputBinding EOF ;
    public final EObject entryRuleOutputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2588:2: (iv_ruleOutputBinding= ruleOutputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2589:2: iv_ruleOutputBinding= ruleOutputBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputBindingRule()); 
            }
            pushFollow(FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5806);
            iv_ruleOutputBinding=ruleOutputBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBinding5816); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutputBinding"


    // $ANTLR start "ruleOutputBinding"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2596:1: ruleOutputBinding returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token otherlv_1=null;
        Token lv_formal_2_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2599:28: ( ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2600:1: ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2600:1: ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2600:2: ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2600:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2601:1: (lv_actual_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2601:1: (lv_actual_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2602:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_actual_0_0, grammarAccess.getOutputBindingAccess().getActualIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputBindingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"actual",
                      		lv_actual_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleOutputBinding5875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOutputBindingAccess().getEqualsSignKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2622:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2623:1: (lv_formal_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2623:1: (lv_formal_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2624:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_formal_2_0, grammarAccess.getOutputBindingAccess().getFormalIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputBindingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"formal",
                      		lv_formal_2_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleOutputBinding"


    // $ANTLR start "entryRuleNodeAttributes"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2648:1: entryRuleNodeAttributes returns [EObject current=null] : iv_ruleNodeAttributes= ruleNodeAttributes EOF ;
    public final EObject entryRuleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributes = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2649:2: (iv_ruleNodeAttributes= ruleNodeAttributes EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2650:2: iv_ruleNodeAttributes= ruleNodeAttributes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeAttributesRule()); 
            }
            pushFollow(FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5933);
            iv_ruleNodeAttributes=ruleNodeAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeAttributes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttributes5943); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeAttributes"


    // $ANTLR start "ruleNodeAttributes"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2657:1: ruleNodeAttributes returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) ;
    public final EObject ruleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;

        EObject this_ApplicationAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2660:28: ( (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2661:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2661:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt35=1;
                }
                break;
            case 28:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2662:2: this_LabelAttribute_0= ruleLabelAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAttributesAccess().getLabelAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5993);
                    this_LabelAttribute_0=ruleLabelAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelAttribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2675:2: this_PositionAttribute_1= rulePositionAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAttributesAccess().getPositionAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleNodeAttributes6023);
                    this_PositionAttribute_1=rulePositionAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PositionAttribute_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2688:2: this_ApplicationAttribute_2= ruleApplicationAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAttributesAccess().getApplicationAttributeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes6053);
                    this_ApplicationAttribute_2=ruleApplicationAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ApplicationAttribute_2; 
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
    // $ANTLR end "ruleNodeAttributes"


    // $ANTLR start "entryRuleExpressionSequence"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2707:1: entryRuleExpressionSequence returns [EObject current=null] : iv_ruleExpressionSequence= ruleExpressionSequence EOF ;
    public final EObject entryRuleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSequence = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2708:2: (iv_ruleExpressionSequence= ruleExpressionSequence EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2709:2: iv_ruleExpressionSequence= ruleExpressionSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6088);
            iv_ruleExpressionSequence=ruleExpressionSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSequence6098); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionSequence"


    // $ANTLR start "ruleExpressionSequence"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2716:1: ruleExpressionSequence returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleExpressionSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2719:28: ( ( () ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2720:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2720:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2720:2: () ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2720:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2721:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionSequenceAccess().getExpressionSequenceAction_0(),
                          current);
                  
            }

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2729:2: ( ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_BOOLEAN)||LA37_0==61||(LA37_0>=63 && LA37_0<=100)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2729:3: ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2729:3: ( (lv_expressions_1_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:1: (lv_expressions_1_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:1: (lv_expressions_1_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2731:3: lv_expressions_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6157);
                    lv_expressions_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionSequenceRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2747:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==45) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2747:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleExpressionSequence6170); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2751:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2753:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6191);
                    	    lv_expressions_3_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionSequenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_3_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExpressionSequence"


    // $ANTLR start "entryRuleExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2777:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2778:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2779:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6231);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6241); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2786:1: ruleExpression returns [EObject current=null] : (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_assignmentOpExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2789:28: ( (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2790:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2790:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2791:2: this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentOpExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_ruleExpression6291);
            this_assignmentOpExpression_0=ruleassignmentOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_assignmentOpExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2802:1: ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2802:2: () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2802:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2803:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2811:2: ( (lv_op_2_0= '=' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2812:1: (lv_op_2_0= '=' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2812:1: (lv_op_2_0= '=' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2813:3: lv_op_2_0= '='
                    {
                    lv_op_2_0=(Token)match(input,23,FOLLOW_23_in_ruleExpression6321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "=");
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2826:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2828:3: lv_right_3_0= ruleorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleExpression6355);
                    lv_right_3_0=ruleorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"orExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleassignmentOpExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2852:1: entryRuleassignmentOpExpression returns [EObject current=null] : iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF ;
    public final EObject entryRuleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentOpExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2853:2: (iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2854:2: iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentOpExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression6393);
            iv_ruleassignmentOpExpression=ruleassignmentOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignmentOpExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignmentOpExpression6403); if (state.failed) return current;

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
    // $ANTLR end "entryRuleassignmentOpExpression"


    // $ANTLR start "ruleassignmentOpExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2861:1: ruleassignmentOpExpression returns [EObject current=null] : (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_orExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2864:28: ( (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2865:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2865:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:2: this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6453);
            this_orExpression_0=ruleorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_orExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:1: ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=46 && LA39_0<=50)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:2: () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2878:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2886:2: ( (lv_op_2_0= ruleassignOp ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:1: (lv_op_2_0= ruleassignOp )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:1: (lv_op_2_0= ruleassignOp )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2888:3: lv_op_2_0= ruleassignOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOpAssignOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignOp_in_ruleassignmentOpExpression6486);
                    lv_op_2_0=ruleassignOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentOpExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"assignOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2904:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2905:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2905:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2906:3: lv_right_3_0= ruleorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6507);
                    lv_right_3_0=ruleorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentOpExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"orExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleassignmentOpExpression"


    // $ANTLR start "entryRuleassignOp"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2930:1: entryRuleassignOp returns [String current=null] : iv_ruleassignOp= ruleassignOp EOF ;
    public final String entryRuleassignOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignOp = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2931:2: (iv_ruleassignOp= ruleassignOp EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2932:2: iv_ruleassignOp= ruleassignOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignOpRule()); 
            }
            pushFollow(FOLLOW_ruleassignOp_in_entryRuleassignOp6546);
            iv_ruleassignOp=ruleassignOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignOp6557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleassignOp"


    // $ANTLR start "ruleassignOp"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2939:1: ruleassignOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) ;
    public final AntlrDatatypeRuleToken ruleassignOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2942:28: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2943:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2943:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt40=1;
                }
                break;
            case 47:
                {
                alt40=2;
                }
                break;
            case 48:
                {
                alt40=3;
                }
                break;
            case 49:
                {
                alt40=4;
                }
                break;
            case 50:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2944:2: kw= '+='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleassignOp6595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignOpAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2951:2: kw= '-='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleassignOp6614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignOpAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2958:2: kw= '*='
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleassignOp6633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignOpAccess().getAsteriskEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2965:2: kw= '/='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleassignOp6652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignOpAccess().getSolidusEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2972:2: kw= '%='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleassignOp6671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignOpAccess().getPercentSignEqualsSignKeyword_4()); 
                          
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
    // $ANTLR end "ruleassignOp"


    // $ANTLR start "entryRuleorExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2985:1: entryRuleorExpression returns [EObject current=null] : iv_ruleorExpression= ruleorExpression EOF ;
    public final EObject entryRuleorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleorExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2986:2: (iv_ruleorExpression= ruleorExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2987:2: iv_ruleorExpression= ruleorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleorExpression_in_entryRuleorExpression6711);
            iv_ruleorExpression=ruleorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleorExpression6721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleorExpression"


    // $ANTLR start "ruleorExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2994:1: ruleorExpression returns [EObject current=null] : (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_andExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2997:28: ( (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2998:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2998:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2999:2: this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleandExpression_in_ruleorExpression6771);
            this_andExpression_0=ruleandExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_andExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3010:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3010:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3010:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3011:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3019:2: ( (lv_op_2_0= '||' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3020:1: (lv_op_2_0= '||' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3020:1: (lv_op_2_0= '||' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3021:3: lv_op_2_0= '||'
                    {
                    lv_op_2_0=(Token)match(input,51,FOLLOW_51_in_ruleorExpression6801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3034:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3035:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3035:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3036:3: lv_right_3_0= ruleorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleorExpression6835);
                    lv_right_3_0=ruleorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"orExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleorExpression"


    // $ANTLR start "entryRuleandExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3060:1: entryRuleandExpression returns [EObject current=null] : iv_ruleandExpression= ruleandExpression EOF ;
    public final EObject entryRuleandExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3061:2: (iv_ruleandExpression= ruleandExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3062:2: iv_ruleandExpression= ruleandExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleandExpression_in_entryRuleandExpression6873);
            iv_ruleandExpression=ruleandExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleandExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpression6883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleandExpression"


    // $ANTLR start "ruleandExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3069:1: ruleandExpression returns [EObject current=null] : (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) ;
    public final EObject ruleandExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_relationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3072:28: ( (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3073:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3073:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3074:2: this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulerelationalExpression_in_ruleandExpression6933);
            this_relationalExpression_0=rulerelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_relationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3085:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3085:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3085:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3086:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3094:2: ( (lv_op_2_0= '&&' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3095:1: (lv_op_2_0= '&&' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3095:1: (lv_op_2_0= '&&' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3096:3: lv_op_2_0= '&&'
                    {
                    lv_op_2_0=(Token)match(input,52,FOLLOW_52_in_ruleandExpression6963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAndExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3109:2: ( (lv_right_3_0= ruleandExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3110:1: (lv_right_3_0= ruleandExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3110:1: (lv_right_3_0= ruleandExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3111:3: lv_right_3_0= ruleandExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleandExpression_in_ruleandExpression6997);
                    lv_right_3_0=ruleandExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"andExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleandExpression"


    // $ANTLR start "entryRulerelationalExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3135:1: entryRulerelationalExpression returns [EObject current=null] : iv_rulerelationalExpression= rulerelationalExpression EOF ;
    public final EObject entryRulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelationalExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3136:2: (iv_rulerelationalExpression= rulerelationalExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3137:2: iv_rulerelationalExpression= rulerelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression7035);
            iv_rulerelationalExpression=rulerelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelationalExpression7045); if (state.failed) return current;

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
    // $ANTLR end "entryRulerelationalExpression"


    // $ANTLR start "rulerelationalExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3144:1: rulerelationalExpression returns [EObject current=null] : (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) ;
    public final EObject rulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_additiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3147:28: ( (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3148:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3148:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3149:2: this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleadditiveExpression_in_rulerelationalExpression7095);
            this_additiveExpression_0=ruleadditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_additiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3160:1: ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=53 && LA43_0<=59)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3160:2: () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3160:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3161:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3169:2: ( (lv_op_2_0= rulerelOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3170:1: (lv_op_2_0= rulerelOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3170:1: (lv_op_2_0= rulerelOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3171:3: lv_op_2_0= rulerelOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelOpsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulerelOps_in_rulerelationalExpression7128);
                    lv_op_2_0=rulerelOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"relOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:2: ( (lv_right_3_0= rulerelationalExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3188:1: (lv_right_3_0= rulerelationalExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3188:1: (lv_right_3_0= rulerelationalExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3189:3: lv_right_3_0= rulerelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulerelationalExpression_in_rulerelationalExpression7149);
                    lv_right_3_0=rulerelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"relationalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "rulerelationalExpression"


    // $ANTLR start "entryRulerelOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3213:1: entryRulerelOps returns [String current=null] : iv_rulerelOps= rulerelOps EOF ;
    public final String entryRulerelOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3214:2: (iv_rulerelOps= rulerelOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3215:2: iv_rulerelOps= rulerelOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelOpsRule()); 
            }
            pushFollow(FOLLOW_rulerelOps_in_entryRulerelOps7188);
            iv_rulerelOps=rulerelOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelOps7199); if (state.failed) return current;

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
    // $ANTLR end "entryRulerelOps"


    // $ANTLR start "rulerelOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3222:1: rulerelOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulerelOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3225:28: ( (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3226:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3226:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt44=1;
                }
                break;
            case 54:
                {
                alt44=2;
                }
                break;
            case 55:
                {
                alt44=3;
                }
                break;
            case 56:
                {
                alt44=4;
                }
                break;
            case 57:
                {
                alt44=5;
                }
                break;
            case 58:
                {
                alt44=6;
                }
                break;
            case 59:
                {
                alt44=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3227:2: kw= '!='
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulerelOps7237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3234:2: kw= '=='
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulerelOps7256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getEqualsSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3241:2: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulerelOps7275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getLessThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3248:2: kw= '<>'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_rulerelOps7294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3255:2: kw= '>='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_rulerelOps7313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3262:2: kw= '<'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_rulerelOps7332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3269:2: kw= '>'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulerelOps7351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpsAccess().getGreaterThanSignKeyword_6()); 
                          
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
    // $ANTLR end "rulerelOps"


    // $ANTLR start "entryRuleadditiveExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3282:1: entryRuleadditiveExpression returns [EObject current=null] : iv_ruleadditiveExpression= ruleadditiveExpression EOF ;
    public final EObject entryRuleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditiveExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3283:2: (iv_ruleadditiveExpression= ruleadditiveExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3284:2: iv_ruleadditiveExpression= ruleadditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression7391);
            iv_ruleadditiveExpression=ruleadditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleadditiveExpression7401); if (state.failed) return current;

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
    // $ANTLR end "entryRuleadditiveExpression"


    // $ANTLR start "ruleadditiveExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3291:1: ruleadditiveExpression returns [EObject current=null] : (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) ;
    public final EObject ruleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_multiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3294:28: ( (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3295:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3295:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3296:2: this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression7451);
            this_multiplicativeExpression_0=rulemultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_multiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3307:1: ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=60 && LA45_0<=61)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3307:2: () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3307:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3308:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3316:2: ( (lv_op_2_0= rulearithOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3317:1: (lv_op_2_0= rulearithOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3317:1: (lv_op_2_0= rulearithOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3318:3: lv_op_2_0= rulearithOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpArithOpsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulearithOps_in_ruleadditiveExpression7484);
                    lv_op_2_0=rulearithOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"arithOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3334:2: ( (lv_right_3_0= ruleadditiveExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3335:1: (lv_right_3_0= ruleadditiveExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3335:1: (lv_right_3_0= ruleadditiveExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3336:3: lv_right_3_0= ruleadditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression7505);
                    lv_right_3_0=ruleadditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"additiveExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleadditiveExpression"


    // $ANTLR start "entryRulearithOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3360:1: entryRulearithOps returns [String current=null] : iv_rulearithOps= rulearithOps EOF ;
    public final String entryRulearithOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearithOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3361:2: (iv_rulearithOps= rulearithOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3362:2: iv_rulearithOps= rulearithOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpsRule()); 
            }
            pushFollow(FOLLOW_rulearithOps_in_entryRulearithOps7544);
            iv_rulearithOps=rulearithOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearithOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearithOps7555); if (state.failed) return current;

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
    // $ANTLR end "entryRulearithOps"


    // $ANTLR start "rulearithOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3369:1: rulearithOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulearithOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3372:28: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3373:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3373:1: (kw= '+' | kw= '-' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            else if ( (LA46_0==61) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3374:2: kw= '+'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulearithOps7593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getArithOpsAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3381:2: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulearithOps7612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getArithOpsAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "rulearithOps"


    // $ANTLR start "entryRulemultiplicativeExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3394:1: entryRulemultiplicativeExpression returns [EObject current=null] : iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF ;
    public final EObject entryRulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicativeExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3395:2: (iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3396:2: iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7652);
            iv_rulemultiplicativeExpression=rulemultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplicativeExpression7662); if (state.failed) return current;

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
    // $ANTLR end "entryRulemultiplicativeExpression"


    // $ANTLR start "rulemultiplicativeExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3403:1: rulemultiplicativeExpression returns [EObject current=null] : (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) ;
    public final EObject rulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_unaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3406:28: ( (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3407:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3407:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3408:2: this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7712);
            this_unaryExpression_0=ruleunaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_unaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3419:1: ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38||LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3419:2: () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3419:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3420:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3428:2: ( (lv_op_2_0= rulemultOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3429:1: (lv_op_2_0= rulemultOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3429:1: (lv_op_2_0= rulemultOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3430:3: lv_op_2_0= rulemultOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultOpsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemultOps_in_rulemultiplicativeExpression7745);
                    lv_op_2_0=rulemultOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"multOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3446:2: ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3447:1: (lv_right_3_0= rulemultiplicativeExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3447:1: (lv_right_3_0= rulemultiplicativeExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3448:3: lv_right_3_0= rulemultiplicativeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7766);
                    lv_right_3_0=rulemultiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"multiplicativeExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "rulemultiplicativeExpression"


    // $ANTLR start "entryRulemultOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3472:1: entryRulemultOps returns [String current=null] : iv_rulemultOps= rulemultOps EOF ;
    public final String entryRulemultOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3473:2: (iv_rulemultOps= rulemultOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3474:2: iv_rulemultOps= rulemultOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultOpsRule()); 
            }
            pushFollow(FOLLOW_rulemultOps_in_entryRulemultOps7805);
            iv_rulemultOps=rulemultOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultOps7816); if (state.failed) return current;

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
    // $ANTLR end "entryRulemultOps"


    // $ANTLR start "rulemultOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3481:1: rulemultOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken rulemultOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3484:28: ( (kw= '*' | kw= '/' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3485:1: (kw= '*' | kw= '/' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3485:1: (kw= '*' | kw= '/' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            else if ( (LA48_0==62) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3486:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulemultOps7854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultOpsAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3493:2: kw= '/'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulemultOps7873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultOpsAccess().getSolidusKeyword_1()); 
                          
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
    // $ANTLR end "rulemultOps"


    // $ANTLR start "entryRuleunaryExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3506:1: entryRuleunaryExpression returns [EObject current=null] : iv_ruleunaryExpression= ruleunaryExpression EOF ;
    public final EObject entryRuleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaryExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3507:2: (iv_ruleunaryExpression= ruleunaryExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3508:2: iv_ruleunaryExpression= ruleunaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7913);
            iv_ruleunaryExpression=ruleunaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryExpression7923); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunaryExpression"


    // $ANTLR start "ruleunaryExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3515:1: ruleunaryExpression returns [EObject current=null] : (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) ;
    public final EObject ruleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3518:28: ( (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3519:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3519:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_BOOLEAN)||(LA49_0>=64 && LA49_0<=100)) ) {
                alt49=1;
            }
            else if ( (LA49_0==61||LA49_0==63) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3520:2: this_TermExpression_0= ruleTermExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression7973);
                    this_TermExpression_0=ruleTermExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TermExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:7: ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:7: ( (lv_op_1_0= ruleunaryOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3533:1: (lv_op_1_0= ruleunaryOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3533:1: (lv_op_1_0= ruleunaryOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3534:3: lv_op_1_0= ruleunaryOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunaryOps_in_ruleunaryExpression8000);
                    lv_op_1_0=ruleunaryOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"unaryOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3550:2: ( (lv_expr_2_0= ruleTermExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3551:1: (lv_expr_2_0= ruleTermExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3551:1: (lv_expr_2_0= ruleTermExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3552:3: lv_expr_2_0= ruleTermExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprTermExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression8021);
                    lv_expr_2_0=ruleTermExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"TermExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleunaryExpression"


    // $ANTLR start "entryRuleunaryOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3576:1: entryRuleunaryOps returns [String current=null] : iv_ruleunaryOps= ruleunaryOps EOF ;
    public final String entryRuleunaryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3577:2: (iv_ruleunaryOps= ruleunaryOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3578:2: iv_ruleunaryOps= ruleunaryOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOpsRule()); 
            }
            pushFollow(FOLLOW_ruleunaryOps_in_entryRuleunaryOps8059);
            iv_ruleunaryOps=ruleunaryOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryOps8070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunaryOps"


    // $ANTLR start "ruleunaryOps"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3585:1: ruleunaryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3588:28: ( (kw= '-' | kw= '!' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3589:1: (kw= '-' | kw= '!' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3589:1: (kw= '-' | kw= '!' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            else if ( (LA50_0==63) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3590:2: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleunaryOps8108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOpsAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3597:2: kw= '!'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleunaryOps8127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOpsAccess().getExclamationMarkKeyword_1()); 
                          
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
    // $ANTLR end "ruleunaryOps"


    // $ANTLR start "entryRuleOperator"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3610:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3611:2: (iv_ruleOperator= ruleOperator EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3612:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator8167);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator8177); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3619:1: ruleOperator returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperatorName ) ) otherlv_1= '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) otherlv_3= ')' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3622:28: ( ( ( (lv_op_0_0= ruleOperatorName ) ) otherlv_1= '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) otherlv_3= ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:1: ( ( (lv_op_0_0= ruleOperatorName ) ) otherlv_1= '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) otherlv_3= ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:1: ( ( (lv_op_0_0= ruleOperatorName ) ) otherlv_1= '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) otherlv_3= ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:2: ( (lv_op_0_0= ruleOperatorName ) ) otherlv_1= '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) otherlv_3= ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:2: ( (lv_op_0_0= ruleOperatorName ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3624:1: (lv_op_0_0= ruleOperatorName )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3624:1: (lv_op_0_0= ruleOperatorName )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3625:3: lv_op_0_0= ruleOperatorName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorAccess().getOpOperatorNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperatorName_in_ruleOperator8223);
            lv_op_0_0=ruleOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"OperatorName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleOperator8235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3645:1: ( (lv_sequence_2_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3646:1: (lv_sequence_2_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3646:1: (lv_sequence_2_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:3: lv_sequence_2_0= ruleExpressionSequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorAccess().getSequenceExpressionSequenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleOperator8256);
            lv_sequence_2_0=ruleExpressionSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorRule());
              	        }
                     		set(
                     			current, 
                     			"sequence",
                      		lv_sequence_2_0, 
                      		"ExpressionSequence");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleOperator8268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleTermExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3675:1: entryRuleTermExpression returns [EObject current=null] : iv_ruleTermExpression= ruleTermExpression EOF ;
    public final EObject entryRuleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3676:2: (iv_ruleTermExpression= ruleTermExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3677:2: iv_ruleTermExpression= ruleTermExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTermExpression_in_entryRuleTermExpression8304);
            iv_ruleTermExpression=ruleTermExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermExpression8314); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTermExpression"


    // $ANTLR start "ruleTermExpression"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3684:1: ruleTermExpression returns [EObject current=null] : (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) ;
    public final EObject ruleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermLiteral_0 = null;

        EObject this_Operator_1 = null;


         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3687:28: ( (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3688:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3688:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_BOOLEAN)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=64 && LA51_0<=100)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3689:2: this_TermLiteral_0= ruleTermLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermExpressionAccess().getTermLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTermLiteral_in_ruleTermExpression8364);
                    this_TermLiteral_0=ruleTermLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TermLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3702:2: this_Operator_1= ruleOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermExpressionAccess().getOperatorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperator_in_ruleTermExpression8394);
                    this_Operator_1=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operator_1; 
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
    // $ANTLR end "ruleTermExpression"


    // $ANTLR start "entryRuleTermLiteral"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3721:1: entryRuleTermLiteral returns [EObject current=null] : iv_ruleTermLiteral= ruleTermLiteral EOF ;
    public final EObject entryRuleTermLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermLiteral = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3722:2: (iv_ruleTermLiteral= ruleTermLiteral EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3723:2: iv_ruleTermLiteral= ruleTermLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral8429);
            iv_ruleTermLiteral=ruleTermLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermLiteral8439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTermLiteral"


    // $ANTLR start "ruleTermLiteral"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3730:1: ruleTermLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleTermLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3733:28: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt52=1;
                }
                break;
            case RULE_INT:
                {
                alt52=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt52=3;
                }
                break;
            case RULE_STRING:
                {
                alt52=4;
                }
                break;
            case RULE_DOUBLE:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:3: () ( (lv_value_1_0= RULE_ID ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3735:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermLiteralAccess().getVarRefAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3743:2: ( (lv_value_1_0= RULE_ID ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3744:1: (lv_value_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3744:1: (lv_value_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3745:3: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTermLiteral8494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getTermLiteralAccess().getValueIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3762:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3762:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3762:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3762:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3763:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermLiteralAccess().getIntegerLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3771:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3772:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3772:1: (lv_value_3_0= RULE_INT )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3773:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTermLiteral8536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getTermLiteralAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3790:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3790:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3790:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3790:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3791:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermLiteralAccess().getBooleanLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3799:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3800:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3800:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3801:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getTermLiteralAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"BOOLEAN");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3818:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3818:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3818:7: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3818:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3819:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermLiteralAccess().getStringLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3827:2: ( (lv_value_7_0= RULE_STRING ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3828:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3828:1: (lv_value_7_0= RULE_STRING )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3829:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTermLiteral8620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getTermLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3846:6: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3846:6: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3846:7: () ( (lv_value_9_0= RULE_DOUBLE ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3846:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3847:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermLiteralAccess().getDoubleLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3855:2: ( (lv_value_9_0= RULE_DOUBLE ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3856:1: (lv_value_9_0= RULE_DOUBLE )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3856:1: (lv_value_9_0= RULE_DOUBLE )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3857:3: lv_value_9_0= RULE_DOUBLE
                    {
                    lv_value_9_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTermLiteral8662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_9_0, grammarAccess.getTermLiteralAccess().getValueDOUBLETerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"DOUBLE");
                      	    
                    }

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
    // $ANTLR end "ruleTermLiteral"


    // $ANTLR start "entryRuleOperatorName"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3881:1: entryRuleOperatorName returns [String current=null] : iv_ruleOperatorName= ruleOperatorName EOF ;
    public final String entryRuleOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorName = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3882:2: (iv_ruleOperatorName= ruleOperatorName EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3883:2: iv_ruleOperatorName= ruleOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorNameRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorName_in_entryRuleOperatorName8705);
            iv_ruleOperatorName=ruleOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorName8716); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperatorName"


    // $ANTLR start "ruleOperatorName"
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3890:1: ruleOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3893:28: ( (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3894:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3894:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            int alt53=37;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt53=1;
                }
                break;
            case 65:
                {
                alt53=2;
                }
                break;
            case 66:
                {
                alt53=3;
                }
                break;
            case 67:
                {
                alt53=4;
                }
                break;
            case 68:
                {
                alt53=5;
                }
                break;
            case 69:
                {
                alt53=6;
                }
                break;
            case 70:
                {
                alt53=7;
                }
                break;
            case 71:
                {
                alt53=8;
                }
                break;
            case 72:
                {
                alt53=9;
                }
                break;
            case 73:
                {
                alt53=10;
                }
                break;
            case 74:
                {
                alt53=11;
                }
                break;
            case 75:
                {
                alt53=12;
                }
                break;
            case 76:
                {
                alt53=13;
                }
                break;
            case 77:
                {
                alt53=14;
                }
                break;
            case 78:
                {
                alt53=15;
                }
                break;
            case 79:
                {
                alt53=16;
                }
                break;
            case 80:
                {
                alt53=17;
                }
                break;
            case 81:
                {
                alt53=18;
                }
                break;
            case 82:
                {
                alt53=19;
                }
                break;
            case 83:
                {
                alt53=20;
                }
                break;
            case 84:
                {
                alt53=21;
                }
                break;
            case 85:
                {
                alt53=22;
                }
                break;
            case 86:
                {
                alt53=23;
                }
                break;
            case 87:
                {
                alt53=24;
                }
                break;
            case 88:
                {
                alt53=25;
                }
                break;
            case 89:
                {
                alt53=26;
                }
                break;
            case 90:
                {
                alt53=27;
                }
                break;
            case 91:
                {
                alt53=28;
                }
                break;
            case 92:
                {
                alt53=29;
                }
                break;
            case 93:
                {
                alt53=30;
                }
                break;
            case 94:
                {
                alt53=31;
                }
                break;
            case 95:
                {
                alt53=32;
                }
                break;
            case 96:
                {
                alt53=33;
                }
                break;
            case 97:
                {
                alt53=34;
                }
                break;
            case 98:
                {
                alt53=35;
                }
                break;
            case 99:
                {
                alt53=36;
                }
                break;
            case 100:
                {
                alt53=37;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:2: kw= 'truncate'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOperatorName8754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getTruncateKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3902:2: kw= 'Normal'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOperatorName8773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getNormalKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3909:2: kw= 'LogNormal'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOperatorName8792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getLogNormalKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3916:2: kw= 'Beta'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOperatorName8811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getBetaKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3923:2: kw= 'Gamma'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOperatorName8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getGammaKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3930:2: kw= 'Exponential'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOperatorName8849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getExponentialKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3937:2: kw= 'Weibull'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOperatorName8868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getWeibullKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3944:2: kw= 'Uniform'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOperatorName8887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getUniformKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3951:2: kw= 'Triangular'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOperatorName8906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getTriangularKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3958:2: kw= 'PERT'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOperatorName8925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getPERTKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3965:2: kw= 'Binomial'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOperatorName8944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getBinomialKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3972:2: kw= 'Poisson'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOperatorName8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getPoissonKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3979:2: kw= 'NegativeBinomial'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOperatorName8982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getNegativeBinomialKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3986:2: kw= 'Geometric'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOperatorName9001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getGeometricKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3993:2: kw= 'Distribution'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOperatorName9020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getDistributionKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4000:2: kw= 'NoisyOR'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOperatorName9039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getNoisyORKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4007:2: kw= 'min'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOperatorName9058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getMinKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4014:2: kw= 'max'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOperatorName9077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getMaxKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4021:2: kw= 'log'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOperatorName9096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getLogKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4028:2: kw= 'log2'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOperatorName9115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getLog2Keyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4035:2: kw= 'log10'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOperatorName9134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getLog10Keyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4042:2: kw= 'exp'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleOperatorName9153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getExpKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4049:2: kw= 'sin'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOperatorName9172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getSinKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4056:2: kw= 'cos'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOperatorName9191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getCosKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4063:2: kw= 'tan'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOperatorName9210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getTanKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4070:2: kw= 'sinh'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOperatorName9229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getSinhKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4077:2: kw= 'cosh'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOperatorName9248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getCoshKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4084:2: kw= 'tanh'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOperatorName9267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getTanhKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4091:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOperatorName9286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getSqrtKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4098:2: kw= 'abs'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleOperatorName9305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getAbsKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4105:2: kw= 'floor'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleOperatorName9324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getFloorKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4112:2: kw= 'ceil'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleOperatorName9343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getCeilKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4119:2: kw= 'mod'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleOperatorName9362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getModKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4126:2: kw= 'if'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleOperatorName9381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getIfKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4133:2: kw= 'and'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOperatorName9400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getAndKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4140:2: kw= 'or'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleOperatorName9419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getOrKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4147:2: kw= 'not'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleOperatorName9438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorNameAccess().getNotKeyword_36()); 
                          
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
    // $ANTLR end "ruleOperatorName"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\12\uffff";
    static final String DFA22_eofS =
        "\12\uffff";
    static final String DFA22_minS =
        "\1\30\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff";
    static final String DFA22_maxS =
        "\1\30\2\144\1\uffff\1\144\1\uffff\1\144\3\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1\1\2";
    static final String DFA22_specialS =
        "\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1",
            "\5\3\17\uffff\1\2\1\3\43\uffff\1\3\1\uffff\46\3",
            "\5\5\17\uffff\1\4\1\5\43\uffff\1\5\1\uffff\46\5",
            "",
            "\5\7\17\uffff\1\6\1\7\43\uffff\1\7\1\uffff\46\7",
            "",
            "\5\11\17\uffff\1\10\1\11\43\uffff\1\11\1\uffff\46\11",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1389:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDefinition273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_ruleDomainDefinition319 = new BitSet(new long[]{0x00000408003F0002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomainDefinition340 = new BitSet(new long[]{0x00000408003F0002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainHeader387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDomainHeader436 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainHeader448 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainHeader469 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_15_in_ruleDomainHeader482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_ruleDomainElement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_ruleDomainElement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleDomainElement638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_ruleAttribute733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleAttribute763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleAttribute793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_ruleAttribute823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_ruleAttribute853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleAttribute883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_entryRuleBasicNode948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNode958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1004 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicNode1021 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBasicNode1039 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBasicNode1060 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_15_in_ruleBasicNode1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNodeKeyword1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBasicNodeKeyword1161 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleBasicNodeKeyword1180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBasicNodeKeyword1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBasicNodeKeyword1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicNodeKeyword1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicNodeKeyword1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatesAttribute1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStatesAttribute1352 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStatesAttribute1364 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatesAttribute1376 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatesAttribute1393 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_ruleStatesAttribute1411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStatesAttribute1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelAttribute1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLabelAttribute1506 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLabelAttribute1518 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelAttribute1535 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLabelAttribute1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionAttribute1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePositionAttribute1635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePositionAttribute1647 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePositionAttribute1659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1713 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePositionAttribute1725 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePositionAttribute1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeAttribute1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSubtypeAttribute1820 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSubtypeAttribute1832 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_27_in_ruleSubtypeAttribute1852 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30_in_ruleSubtypeAttribute1881 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31_in_ruleSubtypeAttribute1910 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32_in_ruleSubtypeAttribute1939 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSubtypeAttribute1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateValuesAttribute2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateValuesAttribute2050 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateValuesAttribute2062 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateValuesAttribute2074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStateValuesAttribute2091 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleStateValuesAttribute2109 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStateValuesAttribute2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationAttribute2209 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleApplicationAttribute2226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationAttribute2243 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleApplicationAttribute2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSizeAttribute2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNodeSizeAttribute2343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNodeSizeAttribute2355 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNodeSizeAttribute2367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2406 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNodeSizeAttribute2423 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeSizeAttribute2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_entryRulePotential2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotential2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePotential2518 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_rulePotential2539 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePotentialModel_in_rulePotential2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialGraph2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePotentialGraph2655 = new BitSet(new long[]{0x0000001002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2672 = new BitSet(new long[]{0x0000001002000020L});
    public static final BitSet FOLLOW_36_in_rulePotentialGraph2691 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2708 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePotentialGraph2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialModel_in_entryRulePotentialModel2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialModel2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePotentialModel2823 = new BitSet(new long[]{0x000000A000008000L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_rulePotentialModel2844 = new BitSet(new long[]{0x000000A000008000L});
    public static final BitSet FOLLOW_15_in_rulePotentialModel2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialAttribute2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialDataAttribute3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePotentialDataAttribute3077 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePotentialDataAttribute3089 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMatrixRow_in_rulePotentialDataAttribute3110 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePotentialDataAttribute3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRow_in_entryRuleMatrixRow3158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRow3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList5_in_ruleMatrixRow3227 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList4_in_ruleMatrixRow3269 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList3_in_ruleMatrixRow3311 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList2_in_ruleMatrixRow3353 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList1_in_ruleMatrixRow3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList5_in_entryRuleList53432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList53442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList53491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList4_in_ruleList53512 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList53525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList4_in_entryRuleList43561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList43571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList43620 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList3_in_ruleList43641 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList43654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList3_in_entryRuleList33690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList33700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList33749 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList2_in_ruleList33770 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList33783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList2_in_entryRuleList23819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList23878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList1_in_ruleList23899 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList1_in_entryRuleList13948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList14007 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleunaryExpression_in_ruleList14028 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_25_in_ruleList14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm4080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanTerm4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4158 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeanTerm4176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialTableAttribute4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4319 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4340 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodesAttribute4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleModelNodesAttribute4457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModelNodesAttribute4469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelNodesAttribute4481 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodesAttribute4498 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleModelNodesAttribute4516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelNodesAttribute4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplesAttribute4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSamplesAttribute4611 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSamplesAttribute4623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplesAttribute4640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSamplesAttribute4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDataAttribute4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleModelDataAttribute4752 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModelDataAttribute4764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelDataAttribute4776 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelDataAttribute4809 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelDataAttribute4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleClassDefinition4904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition4921 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassDefinition4938 = new BitSet(new long[]{0x00000C0E387F8020L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClassDefinition4959 = new BitSet(new long[]{0x00000C0E387F8020L});
    public static final BitSet FOLLOW_15_in_ruleClassDefinition4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement5008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleClassElement5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClassElement5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_ruleClassElement5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_entryRuleClassInstance5163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassInstance5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClassInstance5210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5227 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleClassInstance5244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleClassInstance5278 = new BitSet(new long[]{0x0000000006000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleClassInstance5299 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleClassInstance5313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleClassInstance5334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassInstance5348 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassInstance5360 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_ruleClassInstance5381 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassInstance5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBindings_in_entryRuleInputBindings5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBindings5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_ruleInputBindings5485 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInputBindings5497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleInputBindings5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_entryRuleInputBinding5554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBinding5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5606 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInputBinding5623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBindings5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_ruleOutputBindings5737 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleOutputBindings5749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleOutputBindings5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBinding5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5858 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOutputBinding5875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttributes5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleNodeAttributes6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSequence6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6157 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpressionSequence6170 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6191 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_ruleExpression6291 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleExpression6321 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleExpression6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression6393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignmentOpExpression6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6453 = new BitSet(new long[]{0x0007C00000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_ruleassignmentOpExpression6486 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_entryRuleassignOp6546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignOp6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleassignOp6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleassignOp6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleassignOp6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleassignOp6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleassignOp6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_entryRuleorExpression6711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorExpression6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleorExpression6771 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleorExpression6801 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleorExpression6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_entryRuleandExpression6873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpression6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_ruleandExpression6933 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleandExpression6963 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleandExpression6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression7035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelationalExpression7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_rulerelationalExpression7095 = new BitSet(new long[]{0x0FE0000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_rulerelationalExpression7128 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulerelationalExpression_in_rulerelationalExpression7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_entryRulerelOps7188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelOps7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulerelOps7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulerelOps7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulerelOps7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulerelOps7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulerelOps7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulerelOps7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulerelOps7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression7391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadditiveExpression7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression7451 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_ruleadditiveExpression7484 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_entryRulearithOps7544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearithOps7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulearithOps7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulearithOps7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplicativeExpression7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7712 = new BitSet(new long[]{0x4000004000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_rulemultiplicativeExpression7745 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_entryRulemultOps7805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultOps7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulemultOps7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulemultOps7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryExpression7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_ruleunaryExpression8000 = new BitSet(new long[]{0x00000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_entryRuleunaryOps8059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryOps8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleunaryOps8108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleunaryOps8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_ruleOperator8223 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperator8235 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleOperator8256 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOperator8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_entryRuleTermExpression8304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermExpression8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_ruleTermExpression8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTermExpression8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral8429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermLiteral8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTermLiteral8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTermLiteral8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTermLiteral8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTermLiteral8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_entryRuleOperatorName8705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorName8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorName8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorName8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorName8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorName8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorName8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperatorName8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorName8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorName8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorName8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorName8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperatorName8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperatorName8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperatorName8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperatorName9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperatorName9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperatorName9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperatorName9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperatorName9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperatorName9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperatorName9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperatorName9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperatorName9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperatorName9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperatorName9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperatorName9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorName9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOperatorName9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOperatorName9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperatorName9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperatorName9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOperatorName9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOperatorName9343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOperatorName9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOperatorName9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOperatorName9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOperatorName9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOperatorName9438 = new BitSet(new long[]{0x0000000000000002L});

}