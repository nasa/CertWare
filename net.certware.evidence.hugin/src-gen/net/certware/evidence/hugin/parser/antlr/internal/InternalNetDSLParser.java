package net.certware.evidence.hugin.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=9;

        public InternalNetDSLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[230+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private NetDSLGrammarAccess grammarAccess;
     	
        public InternalNetDSLParser(TokenStream input, IAstFactory factory, NetDSLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected NetDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:83:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:84:2: (iv_ruleModel= ruleModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:85:2: iv_ruleModel= ruleModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (failed) return current;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:92:1: ruleModel returns [EObject current=null] : ( (lv_domain_0_0= ruleDomainDefinition ) )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_domain_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:97:6: ( ( (lv_domain_0_0= ruleDomainDefinition ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:98:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:98:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:99:1: (lv_domain_0_0= ruleDomainDefinition )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:99:1: (lv_domain_0_0= ruleDomainDefinition )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:100:3: lv_domain_0_0= ruleDomainDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDomainDomainDefinitionParserRuleCall_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDomainDefinition_in_ruleModel136);
                    lv_domain_0_0=ruleDomainDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"domain",
                      	        		lv_domain_0_0, 
                      	        		"DomainDefinition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleInteger
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:130:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:131:2: (iv_ruleInteger= ruleInteger EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:132:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntegerRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger172);
            iv_ruleInteger=ruleInteger();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInteger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger182); if (failed) return current;

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
    // $ANTLR end entryRuleInteger


    // $ANTLR start ruleInteger
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:139:1: ruleInteger returns [EObject current=null] : ( (lv_i_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:144:6: ( ( (lv_i_0_0= RULE_INT ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:145:1: ( (lv_i_0_0= RULE_INT ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:145:1: ( (lv_i_0_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:146:1: (lv_i_0_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:146:1: (lv_i_0_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:147:3: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger223); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntegerAccess().getIINTTerminalRuleCall_0(), "i"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntegerRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"i",
              	        		lv_i_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInteger


    // $ANTLR start entryRuleDomainDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:177:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:178:2: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:179:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDomainDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition263);
            iv_ruleDomainDefinition=ruleDomainDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDomainDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDefinition273); if (failed) return current;

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
    // $ANTLR end entryRuleDomainDefinition


    // $ANTLR start ruleDomainDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:186:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:191:6: ( ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:2: ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:2: ( (lv_header_0_0= ruleDomainHeader ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:193:1: (lv_header_0_0= ruleDomainHeader )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:193:1: (lv_header_0_0= ruleDomainHeader )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:194:3: lv_header_0_0= ruleDomainHeader
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getHeaderDomainHeaderParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDomainHeader_in_ruleDomainDefinition319);
            lv_header_0_0=ruleDomainHeader();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDomainDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"header",
              	        		lv_header_0_0, 
              	        		"DomainHeader", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:216:2: ( (lv_elements_1_0= ruleDomainElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=21)||LA2_0==35||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:217:1: (lv_elements_1_0= ruleDomainElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:217:1: (lv_elements_1_0= ruleDomainElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:218:3: lv_elements_1_0= ruleDomainElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getElementsDomainElementParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomainDefinition340);
            	    lv_elements_1_0=ruleDomainElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDomainDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_1_0, 
            	      	        		"DomainElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDomainDefinition


    // $ANTLR start entryRuleDomainHeader
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:248:1: entryRuleDomainHeader returns [EObject current=null] : iv_ruleDomainHeader= ruleDomainHeader EOF ;
    public final EObject entryRuleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainHeader = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:249:2: (iv_ruleDomainHeader= ruleDomainHeader EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:250:2: iv_ruleDomainHeader= ruleDomainHeader EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDomainHeaderRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader377);
            iv_ruleDomainHeader=ruleDomainHeader();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDomainHeader; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainHeader387); if (failed) return current;

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
    // $ANTLR end entryRuleDomainHeader


    // $ANTLR start ruleDomainHeader
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:257:1: ruleDomainHeader returns [EObject current=null] : ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:262:6: ( ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:2: () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:264:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getDomainHeaderAccess().getDomainHeaderAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getDomainHeaderAccess().getDomainHeaderAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,13,FOLLOW_13_in_ruleDomainHeader434); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDomainHeaderAccess().getNetKeyword_1(), null); 
                  
            }
            match(input,14,FOLLOW_14_in_ruleDomainHeader444); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDomainHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:285:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==22||(LA3_0>=27 && LA3_0<=29)||(LA3_0>=33 && LA3_0<=34)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:286:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:286:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:287:3: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDomainHeaderAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainHeader465);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDomainHeaderRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_3_0, 
            	      	        		"Attribute", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleDomainHeader476); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDomainHeaderAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDomainHeader


    // $ANTLR start entryRuleDomainElement
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:321:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:322:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:323:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDomainElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement512);
            iv_ruleDomainElement=ruleDomainElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement522); if (failed) return current;

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
    // $ANTLR end entryRuleDomainElement


    // $ANTLR start ruleDomainElement
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:330:1: ruleDomainElement returns [EObject current=null] : (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicNode_0 = null;

        EObject this_Potential_1 = null;

        EObject this_ClassDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:335:6: ( (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:336:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:336:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("336:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:337:2: this_BasicNode_0= ruleBasicNode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getBasicNodeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicNode_in_ruleDomainElement572);
                    this_BasicNode_0=ruleBasicNode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BasicNode_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:350:2: this_Potential_1= rulePotential
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getPotentialParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePotential_in_ruleDomainElement602);
                    this_Potential_1=rulePotential();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Potential_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:363:2: this_ClassDefinition_2= ruleClassDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getClassDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassDefinition_in_ruleDomainElement632);
                    this_ClassDefinition_2=ruleClassDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ClassDefinition_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDomainElement


    // $ANTLR start entryRuleAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:382:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:383:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:384:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute667);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute677); if (failed) return current;

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:391:1: ruleAttribute returns [EObject current=null] : (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_StatesAttribute_0 = null;

        EObject this_LabelAttribute_1 = null;

        EObject this_PositionAttribute_2 = null;

        EObject this_SubtypeAttribute_3 = null;

        EObject this_StateValuesAttribute_4 = null;

        EObject this_ApplicationAttribute_5 = null;

        EObject this_NodeSizeAttribute_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:396:6: ( (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:397:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:397:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("397:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:398:2: this_StatesAttribute_0= ruleStatesAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatesAttributeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatesAttribute_in_ruleAttribute727);
                    this_StatesAttribute_0=ruleStatesAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StatesAttribute_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:411:2: this_LabelAttribute_1= ruleLabelAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleAttribute757);
                    this_LabelAttribute_1=ruleLabelAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LabelAttribute_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:424:2: this_PositionAttribute_2= rulePositionAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleAttribute787);
                    this_PositionAttribute_2=rulePositionAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PositionAttribute_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:437:2: this_SubtypeAttribute_3= ruleSubtypeAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSubtypeAttributeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubtypeAttribute_in_ruleAttribute817);
                    this_SubtypeAttribute_3=ruleSubtypeAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SubtypeAttribute_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:450:2: this_StateValuesAttribute_4= ruleStateValuesAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStateValuesAttributeParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateValuesAttribute_in_ruleAttribute847);
                    this_StateValuesAttribute_4=ruleStateValuesAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StateValuesAttribute_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:463:2: this_ApplicationAttribute_5= ruleApplicationAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getApplicationAttributeParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleAttribute877);
                    this_ApplicationAttribute_5=ruleApplicationAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ApplicationAttribute_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:476:2: this_NodeSizeAttribute_6= ruleNodeSizeAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNodeSizeAttributeParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute907);
                    this_NodeSizeAttribute_6=ruleNodeSizeAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NodeSizeAttribute_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleBasicNode
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:495:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:496:2: (iv_ruleBasicNode= ruleBasicNode EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:497:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBasicNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBasicNode_in_entryRuleBasicNode942);
            iv_ruleBasicNode=ruleBasicNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBasicNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNode952); if (failed) return current;

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
    // $ANTLR end entryRuleBasicNode


    // $ANTLR start ruleBasicNode
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:504:1: ruleBasicNode returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:509:6: ( ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:510:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:510:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:510:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:510:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:511:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:511:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:512:3: lv_keyword_0_0= ruleBasicNodeKeyword
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getKeywordBasicNodeKeywordParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode998);
            lv_keyword_0_0=ruleBasicNodeKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBasicNodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"keyword",
              	        		lv_keyword_0_0, 
              	        		"BasicNodeKeyword", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:535:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:535:1: (lv_id_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:536:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicNode1015); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBasicNodeAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicNodeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleBasicNode1031); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBasicNodeAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:562:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||(LA7_0>=27 && LA7_0<=29)||(LA7_0>=33 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:563:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:563:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:564:3: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBasicNode1052);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBasicNodeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_3_0, 
            	      	        		"Attribute", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleBasicNode1063); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBasicNodeAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBasicNode


    // $ANTLR start entryRuleBasicNodeKeyword
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:598:1: entryRuleBasicNodeKeyword returns [String current=null] : iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF ;
    public final String entryRuleBasicNodeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicNodeKeyword = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:599:2: (iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:600:2: iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBasicNodeKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1100);
            iv_ruleBasicNodeKeyword=ruleBasicNodeKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBasicNodeKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNodeKeyword1111); if (failed) return current;

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
    // $ANTLR end entryRuleBasicNodeKeyword


    // $ANTLR start ruleBasicNodeKeyword
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:607:1: ruleBasicNodeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) ;
    public final AntlrDatatypeRuleToken ruleBasicNodeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:612:6: ( ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("613:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:3: (kw= 'discrete' | kw= 'continuous' )? kw= 'node'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:3: (kw= 'discrete' | kw= 'continuous' )?
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
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:614:2: kw= 'discrete'
                            {
                            kw=(Token)input.LT(1);
                            match(input,16,FOLLOW_16_in_ruleBasicNodeKeyword1151); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDiscreteKeyword_0_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:621:2: kw= 'continuous'
                            {
                            kw=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleBasicNodeKeyword1170); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getContinuousKeyword_0_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleBasicNodeKeyword1185); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getNodeKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:634:2: kw= 'decision'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBasicNodeKeyword1205); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDecisionKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:641:2: kw= 'utility'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBasicNodeKeyword1224); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getUtilityKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:648:2: kw= 'function'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleBasicNodeKeyword1243); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getFunctionKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBasicNodeKeyword


    // $ANTLR start entryRuleStatesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:661:1: entryRuleStatesAttribute returns [EObject current=null] : iv_ruleStatesAttribute= ruleStatesAttribute EOF ;
    public final EObject entryRuleStatesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:662:2: (iv_ruleStatesAttribute= ruleStatesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:663:2: iv_ruleStatesAttribute= ruleStatesAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatesAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1283);
            iv_ruleStatesAttribute=ruleStatesAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStatesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatesAttribute1293); if (failed) return current;

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
    // $ANTLR end entryRuleStatesAttribute


    // $ANTLR start ruleStatesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:670:1: ruleStatesAttribute returns [EObject current=null] : ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) ;
    public final EObject ruleStatesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_states_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:675:6: ( ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:676:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:676:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:676:2: () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:676:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:677:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getStatesAttributeAccess().getStatesAttributeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getStatesAttributeAccess().getStatesAttributeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,22,FOLLOW_22_in_ruleStatesAttribute1340); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesKeyword_1(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleStatesAttribute1350); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStatesAttributeAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_ruleStatesAttribute1360); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStatesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:702:1: ( (lv_states_4_0= RULE_STRING ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:703:1: (lv_states_4_0= RULE_STRING )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:703:1: (lv_states_4_0= RULE_STRING )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:704:3: lv_states_4_0= RULE_STRING
            	    {
            	    lv_states_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatesAttribute1377); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesSTRINGTerminalRuleCall_4_0(), "states"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStatesAttributeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"states",
            	      	        		lv_states_4_0, 
            	      	        		"STRING", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleStatesAttribute1393); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStatesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_ruleStatesAttribute1403); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStatesAttributeAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStatesAttribute


    // $ANTLR start entryRuleLabelAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:742:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:743:2: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:744:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLabelAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1439);
            iv_ruleLabelAttribute=ruleLabelAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLabelAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelAttribute1449); if (failed) return current;

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
    // $ANTLR end entryRuleLabelAttribute


    // $ANTLR start ruleLabelAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:751:1: ruleLabelAttribute returns [EObject current=null] : ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:756:6: ( ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:757:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:757:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:757:3: 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            match(input,27,FOLLOW_27_in_ruleLabelAttribute1484); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleLabelAttribute1494); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLabelAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:765:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:766:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:766:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:767:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelAttribute1511); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLabelAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLabelAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,26,FOLLOW_26_in_ruleLabelAttribute1526); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLabelAttributeAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLabelAttribute


    // $ANTLR start entryRulePositionAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:801:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:802:2: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:803:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPositionAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1562);
            iv_rulePositionAttribute=rulePositionAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePositionAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionAttribute1572); if (failed) return current;

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
    // $ANTLR end entryRulePositionAttribute


    // $ANTLR start rulePositionAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:810:1: rulePositionAttribute returns [EObject current=null] : ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_x_4_0 = null;

        EObject lv_y_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:815:6: ( ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:816:1: ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:816:1: ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:816:3: 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';'
            {
            match(input,28,FOLLOW_28_in_rulePositionAttribute1607); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPositionAttributeAccess().getPositionKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_rulePositionAttribute1617); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPositionAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_rulePositionAttribute1627); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPositionAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:828:1: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:829:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPositionAttributeAccess().getIntegerLiteralAction_3().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPositionAttributeAccess().getIntegerLiteralAction_3(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:842:2: ( (lv_x_4_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:843:1: (lv_x_4_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:843:1: (lv_x_4_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:844:3: lv_x_4_0= ruleInteger
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPositionAttributeAccess().getXIntegerParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1660);
            lv_x_4_0=ruleInteger();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPositionAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"x",
              	        		lv_x_4_0, 
              	        		"Integer", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:866:2: ( (lv_y_5_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:867:1: (lv_y_5_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:867:1: (lv_y_5_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:868:3: lv_y_5_0= ruleInteger
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPositionAttributeAccess().getYIntegerParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1681);
            lv_y_5_0=ruleInteger();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPositionAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"y",
              	        		lv_y_5_0, 
              	        		"Integer", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,25,FOLLOW_25_in_rulePositionAttribute1691); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPositionAttributeAccess().getRightParenthesisKeyword_6(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_rulePositionAttribute1701); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_7(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePositionAttribute


    // $ANTLR start entryRuleSubtypeAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:906:1: entryRuleSubtypeAttribute returns [EObject current=null] : iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF ;
    public final EObject entryRuleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:907:2: (iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:908:2: iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubtypeAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1737);
            iv_ruleSubtypeAttribute=ruleSubtypeAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubtypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeAttribute1747); if (failed) return current;

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
    // $ANTLR end entryRuleSubtypeAttribute


    // $ANTLR start ruleSubtypeAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:915:1: ruleSubtypeAttribute returns [EObject current=null] : ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) ;
    public final EObject ruleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_subtype_2_1=null;
        Token lv_subtype_2_2=null;
        Token lv_subtype_2_3=null;
        Token lv_subtype_2_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:920:6: ( ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:921:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:921:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:921:3: 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';'
            {
            match(input,29,FOLLOW_29_in_ruleSubtypeAttribute1782); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleSubtypeAttribute1792); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubtypeAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:929:1: ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:930:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:930:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:931:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:931:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("931:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:932:3: lv_subtype_2_1= 'label'
                    {
                    lv_subtype_2_1=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleSubtypeAttribute1812); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeLabelKeyword_2_0_0(), "subtype"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubtypeAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "subtype", lv_subtype_2_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:950:8: lv_subtype_2_2= 'boolean'
                    {
                    lv_subtype_2_2=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleSubtypeAttribute1841); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeBooleanKeyword_2_0_1(), "subtype"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubtypeAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "subtype", lv_subtype_2_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:968:8: lv_subtype_2_3= 'number'
                    {
                    lv_subtype_2_3=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSubtypeAttribute1870); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeNumberKeyword_2_0_2(), "subtype"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubtypeAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "subtype", lv_subtype_2_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:986:8: lv_subtype_2_4= 'interval'
                    {
                    lv_subtype_2_4=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSubtypeAttribute1899); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeIntervalKeyword_2_0_3(), "subtype"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubtypeAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "subtype", lv_subtype_2_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            match(input,26,FOLLOW_26_in_ruleSubtypeAttribute1925); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSubtypeAttribute


    // $ANTLR start entryRuleStateValuesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1019:1: entryRuleStateValuesAttribute returns [EObject current=null] : iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF ;
    public final EObject entryRuleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValuesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1020:2: (iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1021:2: iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateValuesAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute1961);
            iv_ruleStateValuesAttribute=ruleStateValuesAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStateValuesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateValuesAttribute1971); if (failed) return current;

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
    // $ANTLR end entryRuleStateValuesAttribute


    // $ANTLR start ruleStateValuesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1028:1: ruleStateValuesAttribute returns [EObject current=null] : ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) ;
    public final EObject ruleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_numbers_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1033:6: ( ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1034:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1034:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1034:3: 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';'
            {
            match(input,33,FOLLOW_33_in_ruleStateValuesAttribute2006); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateValuesAttributeAccess().getState_valuesKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleStateValuesAttribute2016); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateValuesAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_ruleStateValuesAttribute2026); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateValuesAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1046:1: ( (lv_numbers_3_0= RULE_INT ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1047:1: (lv_numbers_3_0= RULE_INT )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1047:1: (lv_numbers_3_0= RULE_INT )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1048:3: lv_numbers_3_0= RULE_INT
            	    {
            	    lv_numbers_3_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStateValuesAttribute2043); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getStateValuesAttributeAccess().getNumbersINTTerminalRuleCall_3_0(), "numbers"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateValuesAttributeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"numbers",
            	      	        		lv_numbers_3_0, 
            	      	        		"INT", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleStateValuesAttribute2059); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateValuesAttributeAccess().getRightParenthesisKeyword_4(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_ruleStateValuesAttribute2069); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateValuesAttributeAccess().getSemicolonKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStateValuesAttribute


    // $ANTLR start entryRuleApplicationAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1086:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1087:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1088:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getApplicationAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2105);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleApplicationAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute2115); if (failed) return current;

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
    // $ANTLR end entryRuleApplicationAttribute


    // $ANTLR start ruleApplicationAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1095:1: ruleApplicationAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1100:6: ( ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1101:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1101:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1101:2: ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1101:2: ( (lv_key_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1102:1: (lv_key_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1102:1: (lv_key_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1103:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationAttribute2157); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getApplicationAttributeAccess().getKeyIDTerminalRuleCall_0_0(), "key"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getApplicationAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"key",
              	        		lv_key_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,23,FOLLOW_23_in_ruleApplicationAttribute2172); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getApplicationAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1129:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1130:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1130:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1131:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationAttribute2189); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getApplicationAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getApplicationAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,26,FOLLOW_26_in_ruleApplicationAttribute2204); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getApplicationAttributeAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleApplicationAttribute


    // $ANTLR start entryRuleNodeSizeAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1165:1: entryRuleNodeSizeAttribute returns [EObject current=null] : iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF ;
    public final EObject entryRuleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSizeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1166:2: (iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1167:2: iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNodeSizeAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2240);
            iv_ruleNodeSizeAttribute=ruleNodeSizeAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNodeSizeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSizeAttribute2250); if (failed) return current;

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
    // $ANTLR end entryRuleNodeSizeAttribute


    // $ANTLR start ruleNodeSizeAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1174:1: ruleNodeSizeAttribute returns [EObject current=null] : ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject ruleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_width_3_0=null;
        Token lv_height_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1179:6: ( ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:3: 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,34,FOLLOW_34_in_ruleNodeSizeAttribute2285); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getNode_sizeKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleNodeSizeAttribute2295); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_ruleNodeSizeAttribute2305); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1192:1: ( (lv_width_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1193:1: (lv_width_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1193:1: (lv_width_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1194:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2322); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getWidthINTTerminalRuleCall_3_0(), "width"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNodeSizeAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"width",
              	        		lv_width_3_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1216:2: ( (lv_height_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1217:1: (lv_height_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1217:1: (lv_height_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1218:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2344); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getHeightINTTerminalRuleCall_4_0(), "height"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNodeSizeAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"height",
              	        		lv_height_4_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,25,FOLLOW_25_in_ruleNodeSizeAttribute2359); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_ruleNodeSizeAttribute2369); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNodeSizeAttribute


    // $ANTLR start entryRulePotential
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1256:1: entryRulePotential returns [EObject current=null] : iv_rulePotential= rulePotential EOF ;
    public final EObject entryRulePotential() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotential = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1257:2: (iv_rulePotential= rulePotential EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1258:2: iv_rulePotential= rulePotential EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotential_in_entryRulePotential2405);
            iv_rulePotential=rulePotential();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotential; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotential2415); if (failed) return current;

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
    // $ANTLR end entryRulePotential


    // $ANTLR start rulePotential
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1265:1: rulePotential returns [EObject current=null] : ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) ;
    public final EObject rulePotential() throws RecognitionException {
        EObject current = null;

        EObject lv_graph_1_0 = null;

        EObject lv_model_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1270:6: ( ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1271:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1271:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1271:3: 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) )
            {
            match(input,35,FOLLOW_35_in_rulePotential2450); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialAccess().getPotentialKeyword_0(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1275:1: ( (lv_graph_1_0= rulePotentialGraph ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1276:1: (lv_graph_1_0= rulePotentialGraph )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1276:1: (lv_graph_1_0= rulePotentialGraph )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1277:3: lv_graph_1_0= rulePotentialGraph
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePotentialGraph_in_rulePotential2471);
            lv_graph_1_0=rulePotentialGraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPotentialRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"graph",
              	        		lv_graph_1_0, 
              	        		"PotentialGraph", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1299:2: ( (lv_model_2_0= rulePotentialModel ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1300:1: (lv_model_2_0= rulePotentialModel )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1300:1: (lv_model_2_0= rulePotentialModel )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1301:3: lv_model_2_0= rulePotentialModel
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePotentialModel_in_rulePotential2492);
            lv_model_2_0=rulePotentialModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPotentialRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"model",
              	        		lv_model_2_0, 
              	        		"PotentialModel", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotential


    // $ANTLR start entryRulePotentialGraph
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1331:1: entryRulePotentialGraph returns [EObject current=null] : iv_rulePotentialGraph= rulePotentialGraph EOF ;
    public final EObject entryRulePotentialGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialGraph = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1332:2: (iv_rulePotentialGraph= rulePotentialGraph EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1333:2: iv_rulePotentialGraph= rulePotentialGraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialGraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2528);
            iv_rulePotentialGraph=rulePotentialGraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotentialGraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialGraph2538); if (failed) return current;

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
    // $ANTLR end entryRulePotentialGraph


    // $ANTLR start rulePotentialGraph
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1340:1: rulePotentialGraph returns [EObject current=null] : ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) ;
    public final EObject rulePotentialGraph() throws RecognitionException {
        EObject current = null;

        Token lv_children_2_0=null;
        Token lv_parents_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1345:6: ( ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:2: () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1347:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPotentialGraphAccess().getPotentialGraphAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialGraphAccess().getPotentialGraphAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_rulePotentialGraph2585); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialGraphAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1364:1: ( (lv_children_2_0= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1365:1: (lv_children_2_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1365:1: (lv_children_2_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1366:3: lv_children_2_0= RULE_ID
            	    {
            	    lv_children_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2602); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getPotentialGraphAccess().getChildrenIDTerminalRuleCall_2_0(), "children"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPotentialGraphRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"children",
            	      	        		lv_children_2_0, 
            	      	        		"ID", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1388:3: ( '|' ( (lv_parents_4_0= RULE_ID ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1388:5: '|' ( (lv_parents_4_0= RULE_ID ) )*
                    {
                    match(input,36,FOLLOW_36_in_rulePotentialGraph2619); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0(), null); 
                          
                    }
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1392:1: ( (lv_parents_4_0= RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1393:1: (lv_parents_4_0= RULE_ID )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1393:1: (lv_parents_4_0= RULE_ID )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1394:3: lv_parents_4_0= RULE_ID
                    	    {
                    	    lv_parents_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2636); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      			createLeafNode(grammarAccess.getPotentialGraphAccess().getParentsIDTerminalRuleCall_3_1_0(), "parents"); 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPotentialGraphRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parents",
                    	      	        		lv_parents_4_0, 
                    	      	        		"ID", 
                    	      	        		lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
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

            match(input,25,FOLLOW_25_in_rulePotentialGraph2654); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialGraphAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotentialGraph


    // $ANTLR start entryRulePotentialModel
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1428:1: entryRulePotentialModel returns [EObject current=null] : iv_rulePotentialModel= rulePotentialModel EOF ;
    public final EObject entryRulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1429:2: (iv_rulePotentialModel= rulePotentialModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1430:2: iv_rulePotentialModel= rulePotentialModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialModelRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotentialModel_in_entryRulePotentialModel2690);
            iv_rulePotentialModel=rulePotentialModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotentialModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialModel2700); if (failed) return current;

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
    // $ANTLR end entryRulePotentialModel


    // $ANTLR start rulePotentialModel
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1437:1: rulePotentialModel returns [EObject current=null] : ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) ;
    public final EObject rulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1442:6: ( ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1443:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1443:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1443:2: () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1443:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1444:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPotentialModelAccess().getPotentialModelAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialModelAccess().getPotentialModelAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,14,FOLLOW_14_in_rulePotentialModel2747); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialModelAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1461:1: ( (lv_attributes_2_0= rulePotentialAttribute ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1462:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1462:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1463:3: lv_attributes_2_0= rulePotentialAttribute
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPotentialModelAccess().getAttributesPotentialAttributeParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePotentialAttribute_in_rulePotentialModel2768);
            	    lv_attributes_2_0=rulePotentialAttribute();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPotentialModelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_2_0, 
            	      	        		"PotentialAttribute", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_rulePotentialModel2779); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialModelAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotentialModel


    // $ANTLR start entryRulePotentialAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1497:1: entryRulePotentialAttribute returns [EObject current=null] : iv_rulePotentialAttribute= rulePotentialAttribute EOF ;
    public final EObject entryRulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1498:2: (iv_rulePotentialAttribute= rulePotentialAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1499:2: iv_rulePotentialAttribute= rulePotentialAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2815);
            iv_rulePotentialAttribute=rulePotentialAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotentialAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialAttribute2825); if (failed) return current;

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
    // $ANTLR end entryRulePotentialAttribute


    // $ANTLR start rulePotentialAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1506:1: rulePotentialAttribute returns [EObject current=null] : (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) ;
    public final EObject rulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PotentialDataAttribute_0 = null;

        EObject this_PotentialTableAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1511:6: ( (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1512:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1512:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==39) ) {
                alt17=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1512:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1513:2: this_PotentialDataAttribute_0= rulePotentialDataAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialDataAttributeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2875);
                    this_PotentialDataAttribute_0=rulePotentialDataAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PotentialDataAttribute_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1526:2: this_PotentialTableAttribute_1= rulePotentialTableAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialTableAttributeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute2905);
                    this_PotentialTableAttribute_1=rulePotentialTableAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PotentialTableAttribute_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotentialAttribute


    // $ANTLR start entryRulePotentialDataAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:1: entryRulePotentialDataAttribute returns [EObject current=null] : iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF ;
    public final EObject entryRulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1546:2: (iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1547:2: iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialDataAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute2940);
            iv_rulePotentialDataAttribute=rulePotentialDataAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotentialDataAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialDataAttribute2950); if (failed) return current;

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
    // $ANTLR end entryRulePotentialDataAttribute


    // $ANTLR start rulePotentialDataAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1554:1: rulePotentialDataAttribute returns [EObject current=null] : ( () 'data' '=' ( (lv_data_3_0= ruleMatrixRow ) ) ';' ) ;
    public final EObject rulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_data_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1559:6: ( ( () 'data' '=' ( (lv_data_3_0= ruleMatrixRow ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1560:1: ( () 'data' '=' ( (lv_data_3_0= ruleMatrixRow ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1560:1: ( () 'data' '=' ( (lv_data_3_0= ruleMatrixRow ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1560:2: () 'data' '=' ( (lv_data_3_0= ruleMatrixRow ) ) ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1560:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1561:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPotentialDataAttributeAccess().getPotentialDataAttributeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getPotentialDataAttributeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,37,FOLLOW_37_in_rulePotentialDataAttribute2997); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getDataKeyword_1(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_rulePotentialDataAttribute3007); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1582:1: ( (lv_data_3_0= ruleMatrixRow ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1583:1: (lv_data_3_0= ruleMatrixRow )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1583:1: (lv_data_3_0= ruleMatrixRow )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1584:3: lv_data_3_0= ruleMatrixRow
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getDataMatrixRowParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMatrixRow_in_rulePotentialDataAttribute3028);
            lv_data_3_0=ruleMatrixRow();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPotentialDataAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"data",
              	        		lv_data_3_0, 
              	        		"MatrixRow", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,26,FOLLOW_26_in_rulePotentialDataAttribute3038); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getSemicolonKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotentialDataAttribute


    // $ANTLR start entryRuleMatrixRow
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1618:1: entryRuleMatrixRow returns [EObject current=null] : iv_ruleMatrixRow= ruleMatrixRow EOF ;
    public final EObject entryRuleMatrixRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRow = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1619:2: (iv_ruleMatrixRow= ruleMatrixRow EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1620:2: iv_ruleMatrixRow= ruleMatrixRow EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMatrixRowRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMatrixRow_in_entryRuleMatrixRow3074);
            iv_ruleMatrixRow=ruleMatrixRow();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMatrixRow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRow3084); if (failed) return current;

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
    // $ANTLR end entryRuleMatrixRow


    // $ANTLR start ruleMatrixRow
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1627:1: ruleMatrixRow returns [EObject current=null] : ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) ) ;
    public final EObject ruleMatrixRow() throws RecognitionException {
        EObject current = null;

        EObject lv_r5_1_0 = null;

        EObject lv_r4_3_0 = null;

        EObject lv_r3_5_0 = null;

        EObject lv_r2_7_0 = null;

        EObject lv_r1_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1632:6: ( ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==24) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=RULE_INT && LA22_2<=RULE_BOOLEAN)||LA22_2==25||LA22_2==61||(LA22_2>=63 && LA22_2<=100)) ) {
                        alt22=4;
                    }
                    else if ( (LA22_2==24) ) {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==24) ) {
                            int LA22_6 = input.LA(5);

                            if ( ((LA22_6>=RULE_INT && LA22_6<=RULE_BOOLEAN)||LA22_6==25||LA22_6==61||(LA22_6>=63 && LA22_6<=100)) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==24) ) {
                                alt22=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )", 22, 6, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA22_5>=RULE_INT && LA22_5<=RULE_BOOLEAN)||LA22_5==25||LA22_5==61||(LA22_5>=63 && LA22_5<=100)) ) {
                            alt22=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )", 22, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )", 22, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA22_1>=RULE_INT && LA22_1<=RULE_BOOLEAN)||LA22_1==25||LA22_1==61||(LA22_1>=63 && LA22_1<=100)) ) {
                    alt22=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1633:1: ( ( () ( (lv_r5_1_0= ruleList5 ) )+ ) | ( () ( (lv_r4_3_0= ruleList4 ) )+ ) | ( () ( (lv_r3_5_0= ruleList3 ) )+ ) | ( () ( (lv_r2_7_0= ruleList2 ) )+ ) | ( () ( (lv_r1_9_0= ruleList1 ) ) ) )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:2: ( () ( (lv_r5_1_0= ruleList5 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:2: ( () ( (lv_r5_1_0= ruleList5 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:3: () ( (lv_r5_1_0= ruleList5 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1634:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMatrixRowAccess().getMatrixRowAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMatrixRowAccess().getMatrixRowAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1647:2: ( (lv_r5_1_0= ruleList5 ) )+
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
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:1: (lv_r5_1_0= ruleList5 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:1: (lv_r5_1_0= ruleList5 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1649:3: lv_r5_1_0= ruleList5
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getMatrixRowAccess().getR5List5ParserRuleCall_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList5_in_ruleMatrixRow3143);
                    	    lv_r5_1_0=ruleList5();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getMatrixRowRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"r5",
                    	      	        		lv_r5_1_0, 
                    	      	        		"List5", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (backtracking>0) {failed=true; return current;}
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1672:6: ( () ( (lv_r4_3_0= ruleList4 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1672:6: ( () ( (lv_r4_3_0= ruleList4 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1672:7: () ( (lv_r4_3_0= ruleList4 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1672:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1673:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMatrixRowAccess().getMatrixRowAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMatrixRowAccess().getMatrixRowAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1686:2: ( (lv_r4_3_0= ruleList4 ) )+
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
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1687:1: (lv_r4_3_0= ruleList4 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1687:1: (lv_r4_3_0= ruleList4 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1688:3: lv_r4_3_0= ruleList4
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getMatrixRowAccess().getR4List4ParserRuleCall_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList4_in_ruleMatrixRow3185);
                    	    lv_r4_3_0=ruleList4();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getMatrixRowRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"r4",
                    	      	        		lv_r4_3_0, 
                    	      	        		"List4", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (backtracking>0) {failed=true; return current;}
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1711:6: ( () ( (lv_r3_5_0= ruleList3 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1711:6: ( () ( (lv_r3_5_0= ruleList3 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1711:7: () ( (lv_r3_5_0= ruleList3 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1711:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1712:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMatrixRowAccess().getMatrixRowAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMatrixRowAccess().getMatrixRowAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1725:2: ( (lv_r3_5_0= ruleList3 ) )+
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
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:1: (lv_r3_5_0= ruleList3 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:1: (lv_r3_5_0= ruleList3 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1727:3: lv_r3_5_0= ruleList3
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getMatrixRowAccess().getR3List3ParserRuleCall_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList3_in_ruleMatrixRow3227);
                    	    lv_r3_5_0=ruleList3();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getMatrixRowRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"r3",
                    	      	        		lv_r3_5_0, 
                    	      	        		"List3", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (backtracking>0) {failed=true; return current;}
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1750:6: ( () ( (lv_r2_7_0= ruleList2 ) )+ )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1750:6: ( () ( (lv_r2_7_0= ruleList2 ) )+ )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1750:7: () ( (lv_r2_7_0= ruleList2 ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1750:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1751:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMatrixRowAccess().getMatrixRowAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMatrixRowAccess().getMatrixRowAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1764:2: ( (lv_r2_7_0= ruleList2 ) )+
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
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1765:1: (lv_r2_7_0= ruleList2 )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1765:1: (lv_r2_7_0= ruleList2 )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1766:3: lv_r2_7_0= ruleList2
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getMatrixRowAccess().getR2List2ParserRuleCall_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleList2_in_ruleMatrixRow3269);
                    	    lv_r2_7_0=ruleList2();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getMatrixRowRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"r2",
                    	      	        		lv_r2_7_0, 
                    	      	        		"List2", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (backtracking>0) {failed=true; return current;}
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1789:6: ( () ( (lv_r1_9_0= ruleList1 ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1789:6: ( () ( (lv_r1_9_0= ruleList1 ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1789:7: () ( (lv_r1_9_0= ruleList1 ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1789:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1790:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMatrixRowAccess().getMatrixRowAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMatrixRowAccess().getMatrixRowAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1803:2: ( (lv_r1_9_0= ruleList1 ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1804:1: (lv_r1_9_0= ruleList1 )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1804:1: (lv_r1_9_0= ruleList1 )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1805:3: lv_r1_9_0= ruleList1
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMatrixRowAccess().getR1List1ParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList1_in_ruleMatrixRow3311);
                    lv_r1_9_0=ruleList1();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMatrixRowRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"r1",
                      	        		lv_r1_9_0, 
                      	        		"List1", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMatrixRow


    // $ANTLR start entryRuleList5
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1835:1: entryRuleList5 returns [EObject current=null] : iv_ruleList5= ruleList5 EOF ;
    public final EObject entryRuleList5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList5 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1836:2: (iv_ruleList5= ruleList5 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1837:2: iv_ruleList5= ruleList5 EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getList5Rule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleList5_in_entryRuleList53348);
            iv_ruleList5=ruleList5();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleList5; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList53358); if (failed) return current;

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
    // $ANTLR end entryRuleList5


    // $ANTLR start ruleList5
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1844:1: ruleList5 returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleList4 ) )+ ')' ) ;
    public final EObject ruleList5() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1849:6: ( ( () '(' ( (lv_list_2_0= ruleList4 ) )+ ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1850:1: ( () '(' ( (lv_list_2_0= ruleList4 ) )+ ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1850:1: ( () '(' ( (lv_list_2_0= ruleList4 ) )+ ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1850:2: () '(' ( (lv_list_2_0= ruleList4 ) )+ ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1850:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1851:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getList5Access().getList5Action_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getList5Access().getList5Action_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_ruleList53405); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList5Access().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1868:1: ( (lv_list_2_0= ruleList4 ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1869:1: (lv_list_2_0= ruleList4 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1869:1: (lv_list_2_0= ruleList4 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1870:3: lv_list_2_0= ruleList4
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getList5Access().getListList4ParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList4_in_ruleList53426);
            	    lv_list_2_0=ruleList4();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getList5Rule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"list",
            	      	        		lv_list_2_0, 
            	      	        		"List4", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleList53437); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList5Access().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleList5


    // $ANTLR start entryRuleList4
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1904:1: entryRuleList4 returns [EObject current=null] : iv_ruleList4= ruleList4 EOF ;
    public final EObject entryRuleList4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList4 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1905:2: (iv_ruleList4= ruleList4 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1906:2: iv_ruleList4= ruleList4 EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getList4Rule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleList4_in_entryRuleList43473);
            iv_ruleList4=ruleList4();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleList4; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList43483); if (failed) return current;

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
    // $ANTLR end entryRuleList4


    // $ANTLR start ruleList4
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1913:1: ruleList4 returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleList3 ) )+ ')' ) ;
    public final EObject ruleList4() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1918:6: ( ( () '(' ( (lv_list_2_0= ruleList3 ) )+ ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1919:1: ( () '(' ( (lv_list_2_0= ruleList3 ) )+ ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1919:1: ( () '(' ( (lv_list_2_0= ruleList3 ) )+ ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1919:2: () '(' ( (lv_list_2_0= ruleList3 ) )+ ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1919:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1920:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getList4Access().getList4Action_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getList4Access().getList4Action_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_ruleList43530); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList4Access().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1937:1: ( (lv_list_2_0= ruleList3 ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1938:1: (lv_list_2_0= ruleList3 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1938:1: (lv_list_2_0= ruleList3 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1939:3: lv_list_2_0= ruleList3
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getList4Access().getListList3ParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList3_in_ruleList43551);
            	    lv_list_2_0=ruleList3();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getList4Rule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"list",
            	      	        		lv_list_2_0, 
            	      	        		"List3", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleList43562); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList4Access().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleList4


    // $ANTLR start entryRuleList3
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1973:1: entryRuleList3 returns [EObject current=null] : iv_ruleList3= ruleList3 EOF ;
    public final EObject entryRuleList3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList3 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1974:2: (iv_ruleList3= ruleList3 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1975:2: iv_ruleList3= ruleList3 EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getList3Rule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleList3_in_entryRuleList33598);
            iv_ruleList3=ruleList3();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleList3; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList33608); if (failed) return current;

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
    // $ANTLR end entryRuleList3


    // $ANTLR start ruleList3
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1982:1: ruleList3 returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleList2 ) )+ ')' ) ;
    public final EObject ruleList3() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1987:6: ( ( () '(' ( (lv_list_2_0= ruleList2 ) )+ ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1988:1: ( () '(' ( (lv_list_2_0= ruleList2 ) )+ ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1988:1: ( () '(' ( (lv_list_2_0= ruleList2 ) )+ ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1988:2: () '(' ( (lv_list_2_0= ruleList2 ) )+ ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1988:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1989:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getList3Access().getList3Action_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getList3Access().getList3Action_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_ruleList33655); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList3Access().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2006:1: ( (lv_list_2_0= ruleList2 ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2007:1: (lv_list_2_0= ruleList2 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2007:1: (lv_list_2_0= ruleList2 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2008:3: lv_list_2_0= ruleList2
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getList3Access().getListList2ParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList2_in_ruleList33676);
            	    lv_list_2_0=ruleList2();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getList3Rule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"list",
            	      	        		lv_list_2_0, 
            	      	        		"List2", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleList33687); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList3Access().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleList3


    // $ANTLR start entryRuleList2
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2042:1: entryRuleList2 returns [EObject current=null] : iv_ruleList2= ruleList2 EOF ;
    public final EObject entryRuleList2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList2 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2043:2: (iv_ruleList2= ruleList2 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2044:2: iv_ruleList2= ruleList2 EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getList2Rule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleList2_in_entryRuleList23723);
            iv_ruleList2=ruleList2();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleList2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList23733); if (failed) return current;

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
    // $ANTLR end entryRuleList2


    // $ANTLR start ruleList2
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2051:1: ruleList2 returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleList1 ) )+ ')' ) ;
    public final EObject ruleList2() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2056:6: ( ( () '(' ( (lv_list_2_0= ruleList1 ) )+ ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:1: ( () '(' ( (lv_list_2_0= ruleList1 ) )+ ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:1: ( () '(' ( (lv_list_2_0= ruleList1 ) )+ ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:2: () '(' ( (lv_list_2_0= ruleList1 ) )+ ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2058:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getList2Access().getList2Action_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getList2Access().getList2Action_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_ruleList23780); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList2Access().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2075:1: ( (lv_list_2_0= ruleList1 ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2076:1: (lv_list_2_0= ruleList1 )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2076:1: (lv_list_2_0= ruleList1 )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2077:3: lv_list_2_0= ruleList1
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getList2Access().getListList1ParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleList1_in_ruleList23801);
            	    lv_list_2_0=ruleList1();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getList2Rule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"list",
            	      	        		lv_list_2_0, 
            	      	        		"List1", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleList23812); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList2Access().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleList2


    // $ANTLR start entryRuleList1
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2111:1: entryRuleList1 returns [EObject current=null] : iv_ruleList1= ruleList1 EOF ;
    public final EObject entryRuleList1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList1 = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2112:2: (iv_ruleList1= ruleList1 EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2113:2: iv_ruleList1= ruleList1 EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getList1Rule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleList1_in_entryRuleList13848);
            iv_ruleList1=ruleList1();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleList1; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList13858); if (failed) return current;

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
    // $ANTLR end entryRuleList1


    // $ANTLR start ruleList1
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2120:1: ruleList1 returns [EObject current=null] : ( () '(' ( (lv_items_2_0= ruleunaryExpression ) )* ')' ) ;
    public final EObject ruleList1() throws RecognitionException {
        EObject current = null;

        EObject lv_items_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2125:6: ( ( () '(' ( (lv_items_2_0= ruleunaryExpression ) )* ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2126:1: ( () '(' ( (lv_items_2_0= ruleunaryExpression ) )* ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2126:1: ( () '(' ( (lv_items_2_0= ruleunaryExpression ) )* ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2126:2: () '(' ( (lv_items_2_0= ruleunaryExpression ) )* ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2126:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2127:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getList1Access().getList1Action_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getList1Access().getList1Action_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,24,FOLLOW_24_in_ruleList13905); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList1Access().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2144:1: ( (lv_items_2_0= ruleunaryExpression ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_BOOLEAN)||LA27_0==61||(LA27_0>=63 && LA27_0<=100)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2145:1: (lv_items_2_0= ruleunaryExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2145:1: (lv_items_2_0= ruleunaryExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2146:3: lv_items_2_0= ruleunaryExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getList1Access().getItemsUnaryExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleunaryExpression_in_ruleList13926);
            	    lv_items_2_0=ruleunaryExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getList1Rule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"items",
            	      	        		lv_items_2_0, 
            	      	        		"unaryExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleList13937); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getList1Access().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleList1


    // $ANTLR start entryRuleMeanTerm
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2182:1: entryRuleMeanTerm returns [String current=null] : iv_ruleMeanTerm= ruleMeanTerm EOF ;
    public final String entryRuleMeanTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2183:2: (iv_ruleMeanTerm= ruleMeanTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2184:2: iv_ruleMeanTerm= ruleMeanTerm EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMeanTermRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3976);
            iv_ruleMeanTerm=ruleMeanTerm();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMeanTerm.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanTerm3987); if (failed) return current;

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
    // $ANTLR end entryRuleMeanTerm


    // $ANTLR start ruleMeanTerm
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2191:1: ruleMeanTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMeanTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_DOUBLE_1=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2196:6: ( (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2197:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2197:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
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
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2197:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2197:1: (this_DOUBLE_0= RULE_DOUBLE | (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2197:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)input.LT(1);
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4027); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_DOUBLE_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getMeanTermAccess().getDOUBLETerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2205:6: (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2205:6: (this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2205:11: this_DOUBLE_1= RULE_DOUBLE kw= '*' this_ID_3= RULE_ID
                    {
                    this_DOUBLE_1=(Token)input.LT(1);
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4054); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_DOUBLE_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getMeanTermAccess().getDOUBLETerminalRuleCall_1_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleMeanTerm4072); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMeanTermAccess().getAsteriskKeyword_1_1(), null); 
                          
                    }
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4087); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2226:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4114); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMeanTerm


    // $ANTLR start entryRulePotentialTableAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2241:1: entryRulePotentialTableAttribute returns [EObject current=null] : iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF ;
    public final EObject entryRulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialTableAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2242:2: (iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2243:2: iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPotentialTableAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4159);
            iv_rulePotentialTableAttribute=rulePotentialTableAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePotentialTableAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialTableAttribute4169); if (failed) return current;

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
    // $ANTLR end entryRulePotentialTableAttribute


    // $ANTLR start rulePotentialTableAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2250:1: rulePotentialTableAttribute returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) ;
    public final EObject rulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_samples_1_0 = null;

        EObject lv_data_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2255:6: ( ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2256:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2256:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2256:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2256:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2257:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2257:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2258:3: lv_nodes_0_0= ruleModelNodesAttribute
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getNodesModelNodesAttributeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4215);
            lv_nodes_0_0=ruleModelNodesAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPotentialTableAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"nodes",
              	        		lv_nodes_0_0, 
              	        		"ModelNodesAttribute", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2280:2: ( (lv_samples_1_0= ruleSamplesAttribute ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2281:1: (lv_samples_1_0= ruleSamplesAttribute )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2281:1: (lv_samples_1_0= ruleSamplesAttribute )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2282:3: lv_samples_1_0= ruleSamplesAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getSamplesSamplesAttributeParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4236);
                    lv_samples_1_0=ruleSamplesAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPotentialTableAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"samples",
                      	        		lv_samples_1_0, 
                      	        		"SamplesAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2304:3: ( (lv_data_2_0= ruleModelDataAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2305:1: (lv_data_2_0= ruleModelDataAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2305:1: (lv_data_2_0= ruleModelDataAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2306:3: lv_data_2_0= ruleModelDataAttribute
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getDataModelDataAttributeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4258);
            lv_data_2_0=ruleModelDataAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPotentialTableAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"data",
              	        		lv_data_2_0, 
              	        		"ModelDataAttribute", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePotentialTableAttribute


    // $ANTLR start entryRuleModelNodesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2336:1: entryRuleModelNodesAttribute returns [EObject current=null] : iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF ;
    public final EObject entryRuleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2337:2: (iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2338:2: iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelNodesAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4294);
            iv_ruleModelNodesAttribute=ruleModelNodesAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModelNodesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodesAttribute4304); if (failed) return current;

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
    // $ANTLR end entryRuleModelNodesAttribute


    // $ANTLR start ruleModelNodesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2345:1: ruleModelNodesAttribute returns [EObject current=null] : ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) ;
    public final EObject ruleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_configurations_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2350:6: ( ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2351:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2351:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2351:2: () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2351:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2352:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getModelNodesAttributeAccess().getModelNodesAttributeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getModelNodesAttributeAccess().getModelNodesAttributeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,39,FOLLOW_39_in_ruleModelNodesAttribute4351); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelNodesAttributeAccess().getModel_nodesKeyword_1(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleModelNodesAttribute4361); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelNodesAttributeAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_ruleModelNodesAttribute4371); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelNodesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2377:1: ( (lv_configurations_4_0= RULE_ID ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2378:1: (lv_configurations_4_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2378:1: (lv_configurations_4_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2379:3: lv_configurations_4_0= RULE_ID
            	    {
            	    lv_configurations_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodesAttribute4388); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getModelNodesAttributeAccess().getConfigurationsIDTerminalRuleCall_4_0(), "configurations"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModelNodesAttributeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"configurations",
            	      	        		lv_configurations_4_0, 
            	      	        		"ID", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleModelNodesAttribute4404); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelNodesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_ruleModelNodesAttribute4414); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelNodesAttributeAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModelNodesAttribute


    // $ANTLR start entryRuleSamplesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:1: entryRuleSamplesAttribute returns [EObject current=null] : iv_ruleSamplesAttribute= ruleSamplesAttribute EOF ;
    public final EObject entryRuleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2418:2: (iv_ruleSamplesAttribute= ruleSamplesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2419:2: iv_ruleSamplesAttribute= ruleSamplesAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSamplesAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4450);
            iv_ruleSamplesAttribute=ruleSamplesAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSamplesAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplesAttribute4460); if (failed) return current;

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
    // $ANTLR end entryRuleSamplesAttribute


    // $ANTLR start ruleSamplesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2426:1: ruleSamplesAttribute returns [EObject current=null] : ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2431:6: ( ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:3: 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';'
            {
            match(input,40,FOLLOW_40_in_ruleSamplesAttribute4495); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSamplesAttributeAccess().getSamples_per_intervalKeyword_0(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleSamplesAttribute4505); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSamplesAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2440:1: ( (lv_value_2_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2441:1: (lv_value_2_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2441:1: (lv_value_2_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2442:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplesAttribute4522); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSamplesAttributeAccess().getValueINTTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSamplesAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,26,FOLLOW_26_in_ruleSamplesAttribute4537); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSamplesAttributeAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSamplesAttribute


    // $ANTLR start entryRuleModelDataAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2476:1: entryRuleModelDataAttribute returns [EObject current=null] : iv_ruleModelDataAttribute= ruleModelDataAttribute EOF ;
    public final EObject entryRuleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2477:2: (iv_ruleModelDataAttribute= ruleModelDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:2: iv_ruleModelDataAttribute= ruleModelDataAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelDataAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4573);
            iv_ruleModelDataAttribute=ruleModelDataAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModelDataAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDataAttribute4583); if (failed) return current;

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
    // $ANTLR end entryRuleModelDataAttribute


    // $ANTLR start ruleModelDataAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2485:1: ruleModelDataAttribute returns [EObject current=null] : ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' ) ;
    public final EObject ruleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2490:6: ( ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2491:1: ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2491:1: ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2491:2: () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2491:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2492:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getModelDataAttributeAccess().getModelDataAttributeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getModelDataAttributeAccess().getModelDataAttributeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,41,FOLLOW_41_in_ruleModelDataAttribute4630); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelDataAttributeAccess().getModel_dataKeyword_1(), null); 
                  
            }
            match(input,23,FOLLOW_23_in_ruleModelDataAttribute4640); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            match(input,24,FOLLOW_24_in_ruleModelDataAttribute4650); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2517:1: ( (lv_sequence_4_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2518:1: (lv_sequence_4_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2518:1: (lv_sequence_4_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2519:3: lv_sequence_4_0= ruleExpressionSequence
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModelDataAttributeAccess().getSequenceExpressionSequenceParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4671);
            lv_sequence_4_0=ruleExpressionSequence();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModelDataAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"sequence",
              	        		lv_sequence_4_0, 
              	        		"ExpressionSequence", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,25,FOLLOW_25_in_ruleModelDataAttribute4681); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelDataAttributeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,26,FOLLOW_26_in_ruleModelDataAttribute4691); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelDataAttributeAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModelDataAttribute


    // $ANTLR start entryRuleClassDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2557:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2558:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2559:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4727);
            iv_ruleClassDefinition=ruleClassDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition4737); if (failed) return current;

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
    // $ANTLR end entryRuleClassDefinition


    // $ANTLR start ruleClassDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2566:1: ruleClassDefinition returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2571:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2572:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2572:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2572:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}'
            {
            match(input,42,FOLLOW_42_in_ruleClassDefinition4772); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassDefinitionAccess().getClassKeyword_0(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2576:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2577:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2577:1: (lv_name_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2578:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition4789); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,14,FOLLOW_14_in_ruleClassDefinition4804); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2604:1: ( (lv_elements_3_0= ruleClassElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=16 && LA31_0<=22)||(LA31_0>=27 && LA31_0<=29)||(LA31_0>=33 && LA31_0<=35)||(LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2605:1: (lv_elements_3_0= ruleClassElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2605:1: (lv_elements_3_0= ruleClassElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2606:3: lv_elements_3_0= ruleClassElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getClassDefinitionAccess().getElementsClassElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClassDefinition4825);
            	    lv_elements_3_0=ruleClassElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getClassDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"ClassElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleClassDefinition4836); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleClassDefinition


    // $ANTLR start entryRuleClassElement
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2640:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2641:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2642:2: iv_ruleClassElement= ruleClassElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement4872);
            iv_ruleClassElement=ruleClassElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClassElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement4882); if (failed) return current;

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
    // $ANTLR end entryRuleClassElement


    // $ANTLR start ruleClassElement
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2649:1: ruleClassElement returns [EObject current=null] : (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_DomainElement_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_ClassInstance_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2654:6: ( (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2655:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2656:2: this_DomainElement_0= ruleDomainElement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getDomainElementParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleClassElement4932);
                    this_DomainElement_0=ruleDomainElement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DomainElement_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2669:2: this_Attribute_1= ruleAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getAttributeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleClassElement4962);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Attribute_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2682:2: this_ClassInstance_2= ruleClassInstance
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getClassInstanceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassInstance_in_ruleClassElement4992);
                    this_ClassInstance_2=ruleClassInstance();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ClassInstance_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleClassElement


    // $ANTLR start entryRuleClassInstance
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2701:1: entryRuleClassInstance returns [EObject current=null] : iv_ruleClassInstance= ruleClassInstance EOF ;
    public final EObject entryRuleClassInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInstance = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2702:2: (iv_ruleClassInstance= ruleClassInstance EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2703:2: iv_ruleClassInstance= ruleClassInstance EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassInstanceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClassInstance_in_entryRuleClassInstance5027);
            iv_ruleClassInstance=ruleClassInstance();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClassInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassInstance5037); if (failed) return current;

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
    // $ANTLR end entryRuleClassInstance


    // $ANTLR start ruleClassInstance
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2710:1: ruleClassInstance returns [EObject current=null] : ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) ;
    public final EObject ruleClassInstance() throws RecognitionException {
        EObject current = null;

        Token lv_instanceName_1_0=null;
        Token lv_className_3_0=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;

        EObject lv_attributes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2715:6: ( ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2716:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2716:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2716:3: 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}'
            {
            match(input,43,FOLLOW_43_in_ruleClassInstance5072); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceKeyword_0(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2720:1: ( (lv_instanceName_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2721:1: (lv_instanceName_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2721:1: (lv_instanceName_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2722:3: lv_instanceName_1_0= RULE_ID
            {
            lv_instanceName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5089); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceNameIDTerminalRuleCall_1_0(), "instanceName"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassInstanceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"instanceName",
              	        		lv_instanceName_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,44,FOLLOW_44_in_ruleClassInstance5104); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getColonKeyword_2(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2748:1: ( (lv_className_3_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2749:1: (lv_className_3_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2749:1: (lv_className_3_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2750:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5121); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getClassInstanceAccess().getClassNameIDTerminalRuleCall_3_0(), "className"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassInstanceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"className",
              	        		lv_className_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,24,FOLLOW_24_in_ruleClassInstance5136); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getLeftParenthesisKeyword_4(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2776:1: ( (lv_input_5_0= ruleInputBindings ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2777:1: (lv_input_5_0= ruleInputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2777:1: (lv_input_5_0= ruleInputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2778:3: lv_input_5_0= ruleInputBindings
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getInputInputBindingsParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputBindings_in_ruleClassInstance5157);
                    lv_input_5_0=ruleInputBindings();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClassInstanceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"input",
                      	        		lv_input_5_0, 
                      	        		"InputBindings", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2800:3: ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2800:5: ';' ( (lv_output_7_0= ruleOutputBindings ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleClassInstance5169); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClassInstanceAccess().getSemicolonKeyword_6_0(), null); 
                          
                    }
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2804:1: ( (lv_output_7_0= ruleOutputBindings ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:1: (lv_output_7_0= ruleOutputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:1: (lv_output_7_0= ruleOutputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2806:3: lv_output_7_0= ruleOutputBindings
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getOutputOutputBindingsParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputBindings_in_ruleClassInstance5190);
                    lv_output_7_0=ruleOutputBindings();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClassInstanceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"output",
                      	        		lv_output_7_0, 
                      	        		"OutputBindings", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleClassInstance5202); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getRightParenthesisKeyword_7(), null); 
                  
            }
            match(input,14,FOLLOW_14_in_ruleClassInstance5212); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getLeftCurlyBracketKeyword_8(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2836:1: ( (lv_attributes_10_0= ruleNodeAttributes ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2837:1: (lv_attributes_10_0= ruleNodeAttributes )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2837:1: (lv_attributes_10_0= ruleNodeAttributes )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2838:3: lv_attributes_10_0= ruleNodeAttributes
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getAttributesNodeAttributesParserRuleCall_9_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeAttributes_in_ruleClassInstance5233);
            lv_attributes_10_0=ruleNodeAttributes();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassInstanceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"attributes",
              	        		lv_attributes_10_0, 
              	        		"NodeAttributes", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,15,FOLLOW_15_in_ruleClassInstance5243); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassInstanceAccess().getRightCurlyBracketKeyword_10(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleClassInstance


    // $ANTLR start entryRuleInputBindings
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2872:1: entryRuleInputBindings returns [EObject current=null] : iv_ruleInputBindings= ruleInputBindings EOF ;
    public final EObject entryRuleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2873:2: (iv_ruleInputBindings= ruleInputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2874:2: iv_ruleInputBindings= ruleInputBindings EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputBindingsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputBindings_in_entryRuleInputBindings5279);
            iv_ruleInputBindings=ruleInputBindings();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputBindings; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBindings5289); if (failed) return current;

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
    // $ANTLR end entryRuleInputBindings


    // $ANTLR start ruleInputBindings
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2881:1: ruleInputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) ;
    public final EObject ruleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2886:6: ( ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:2: ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:2: ( (lv_lhs_0_0= ruleInputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2888:1: (lv_lhs_0_0= ruleInputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2888:1: (lv_lhs_0_0= ruleInputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2889:3: lv_lhs_0_0= ruleInputBinding
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleInputBinding_in_ruleInputBindings5335);
            lv_lhs_0_0=ruleInputBinding();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputBindingsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"InputBinding", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,45,FOLLOW_45_in_ruleInputBindings5345); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputBindingsAccess().getCommaKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2915:1: ( (lv_rhs_2_0= ruleInputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2916:1: (lv_rhs_2_0= ruleInputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2916:1: (lv_rhs_2_0= ruleInputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2917:3: lv_rhs_2_0= ruleInputBindings
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleInputBindings_in_ruleInputBindings5366);
            lv_rhs_2_0=ruleInputBindings();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputBindingsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rhs",
              	        		lv_rhs_2_0, 
              	        		"InputBindings", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInputBindings


    // $ANTLR start entryRuleInputBinding
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2947:1: entryRuleInputBinding returns [EObject current=null] : iv_ruleInputBinding= ruleInputBinding EOF ;
    public final EObject entryRuleInputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2948:2: (iv_ruleInputBinding= ruleInputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2949:2: iv_ruleInputBinding= ruleInputBinding EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputBindingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputBinding_in_entryRuleInputBinding5402);
            iv_ruleInputBinding=ruleInputBinding();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBinding5412); if (failed) return current;

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
    // $ANTLR end entryRuleInputBinding


    // $ANTLR start ruleInputBinding
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2956:1: ruleInputBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token lv_actual_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2961:6: ( ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:2: ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2963:1: (lv_formal_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2963:1: (lv_formal_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2964:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5454); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInputBindingAccess().getFormalIDTerminalRuleCall_0_0(), "formal"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"formal",
              	        		lv_formal_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,23,FOLLOW_23_in_ruleInputBinding5469); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputBindingAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2990:1: ( (lv_actual_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2991:1: (lv_actual_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2991:1: (lv_actual_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2992:3: lv_actual_2_0= RULE_ID
            {
            lv_actual_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5486); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInputBindingAccess().getActualIDTerminalRuleCall_2_0(), "actual"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"actual",
              	        		lv_actual_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInputBinding


    // $ANTLR start entryRuleOutputBindings
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3022:1: entryRuleOutputBindings returns [EObject current=null] : iv_ruleOutputBindings= ruleOutputBindings EOF ;
    public final EObject entryRuleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3023:2: (iv_ruleOutputBindings= ruleOutputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3024:2: iv_ruleOutputBindings= ruleOutputBindings EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputBindingsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5527);
            iv_ruleOutputBindings=ruleOutputBindings();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputBindings; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBindings5537); if (failed) return current;

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
    // $ANTLR end entryRuleOutputBindings


    // $ANTLR start ruleOutputBindings
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3031:1: ruleOutputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) ;
    public final EObject ruleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3036:6: ( ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3037:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3037:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3037:2: ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3037:2: ( (lv_lhs_0_0= ruleOutputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3038:1: (lv_lhs_0_0= ruleOutputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3038:1: (lv_lhs_0_0= ruleOutputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3039:3: lv_lhs_0_0= ruleOutputBinding
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOutputBinding_in_ruleOutputBindings5583);
            lv_lhs_0_0=ruleOutputBinding();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputBindingsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"OutputBinding", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,45,FOLLOW_45_in_ruleOutputBindings5593); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputBindingsAccess().getCommaKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3065:1: ( (lv_rhs_2_0= ruleOutputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3066:1: (lv_rhs_2_0= ruleOutputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3066:1: (lv_rhs_2_0= ruleOutputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3067:3: lv_rhs_2_0= ruleOutputBindings
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOutputBindings_in_ruleOutputBindings5614);
            lv_rhs_2_0=ruleOutputBindings();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputBindingsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rhs",
              	        		lv_rhs_2_0, 
              	        		"OutputBindings", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOutputBindings


    // $ANTLR start entryRuleOutputBinding
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3097:1: entryRuleOutputBinding returns [EObject current=null] : iv_ruleOutputBinding= ruleOutputBinding EOF ;
    public final EObject entryRuleOutputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3098:2: (iv_ruleOutputBinding= ruleOutputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3099:2: iv_ruleOutputBinding= ruleOutputBinding EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputBindingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5650);
            iv_ruleOutputBinding=ruleOutputBinding();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBinding5660); if (failed) return current;

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
    // $ANTLR end entryRuleOutputBinding


    // $ANTLR start ruleOutputBinding
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3106:1: ruleOutputBinding returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3111:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3112:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3112:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3112:2: ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3112:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3113:1: (lv_actual_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3113:1: (lv_actual_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3114:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5702); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOutputBindingAccess().getActualIDTerminalRuleCall_0_0(), "actual"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"actual",
              	        		lv_actual_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,23,FOLLOW_23_in_ruleOutputBinding5717); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputBindingAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3140:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (lv_formal_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (lv_formal_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3142:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5734); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOutputBindingAccess().getFormalIDTerminalRuleCall_2_0(), "formal"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputBindingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"formal",
              	        		lv_formal_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOutputBinding


    // $ANTLR start entryRuleNodeAttributes
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3172:1: entryRuleNodeAttributes returns [EObject current=null] : iv_ruleNodeAttributes= ruleNodeAttributes EOF ;
    public final EObject entryRuleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributes = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3173:2: (iv_ruleNodeAttributes= ruleNodeAttributes EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3174:2: iv_ruleNodeAttributes= ruleNodeAttributes EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNodeAttributesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5775);
            iv_ruleNodeAttributes=ruleNodeAttributes();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNodeAttributes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttributes5785); if (failed) return current;

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
    // $ANTLR end entryRuleNodeAttributes


    // $ANTLR start ruleNodeAttributes
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3181:1: ruleNodeAttributes returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) ;
    public final EObject ruleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;

        EObject this_ApplicationAttribute_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3186:6: ( (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3187:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3188:2: this_LabelAttribute_0= ruleLabelAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getLabelAttributeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5835);
                    this_LabelAttribute_0=ruleLabelAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LabelAttribute_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3201:2: this_PositionAttribute_1= rulePositionAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getPositionAttributeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5865);
                    this_PositionAttribute_1=rulePositionAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PositionAttribute_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3214:2: this_ApplicationAttribute_2= ruleApplicationAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getApplicationAttributeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5895);
                    this_ApplicationAttribute_2=ruleApplicationAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ApplicationAttribute_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNodeAttributes


    // $ANTLR start entryRuleExpressionSequence
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3233:1: entryRuleExpressionSequence returns [EObject current=null] : iv_ruleExpressionSequence= ruleExpressionSequence EOF ;
    public final EObject entryRuleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSequence = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3234:2: (iv_ruleExpressionSequence= ruleExpressionSequence EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3235:2: iv_ruleExpressionSequence= ruleExpressionSequence EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionSequenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence5930);
            iv_ruleExpressionSequence=ruleExpressionSequence();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpressionSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSequence5940); if (failed) return current;

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
    // $ANTLR end entryRuleExpressionSequence


    // $ANTLR start ruleExpressionSequence
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3242:1: ruleExpressionSequence returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3247:6: ( ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3248:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3248:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3248:2: () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3248:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3249:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getExpressionSequenceAccess().getExpressionSequenceAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionSequenceAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3262:2: ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_BOOLEAN)||LA37_0==61||(LA37_0>=63 && LA37_0<=100)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3262:3: ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3262:3: ( (lv_expressions_1_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3263:1: (lv_expressions_1_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3263:1: (lv_expressions_1_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3264:3: lv_expressions_1_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence5999);
                    lv_expressions_1_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionSequenceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"expressions",
                      	        		lv_expressions_1_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3286:2: ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==45) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3286:4: ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    match(input,45,FOLLOW_45_in_ruleExpressionSequence6010); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3290:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3291:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3291:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3292:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6031);
                    	    lv_expressions_3_0=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getExpressionSequenceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"expressions",
                    	      	        		lv_expressions_3_0, 
                    	      	        		"Expression", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpressionSequence


    // $ANTLR start entryRuleExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3322:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3323:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3324:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6071);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6081); if (failed) return current;

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3331:1: ruleExpression returns [EObject current=null] : (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_assignmentOpExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3336:6: ( (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3337:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3337:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3338:2: this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAssignmentOpExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_ruleExpression6131);
            this_assignmentOpExpression_0=ruleassignmentOpExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_assignmentOpExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3349:1: ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3349:2: () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3349:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3350:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3368:2: ( (lv_op_2_0= '=' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3369:1: (lv_op_2_0= '=' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3369:1: (lv_op_2_0= '=' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3370:3: lv_op_2_0= '='
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleExpression6161); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0(), "op"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "op", lv_op_2_0, "=", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3389:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3390:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3390:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3391:3: lv_right_3_0= ruleorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleExpression6195);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"orExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleassignmentOpExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3421:1: entryRuleassignmentOpExpression returns [EObject current=null] : iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF ;
    public final EObject entryRuleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentOpExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3422:2: (iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3423:2: iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentOpExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression6233);
            iv_ruleassignmentOpExpression=ruleassignmentOpExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignmentOpExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignmentOpExpression6243); if (failed) return current;

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
    // $ANTLR end entryRuleassignmentOpExpression


    // $ANTLR start ruleassignmentOpExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3430:1: ruleassignmentOpExpression returns [EObject current=null] : (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_orExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3435:6: ( (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3436:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3436:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3437:2: this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOrExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6293);
            this_orExpression_0=ruleorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_orExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3448:1: ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=46 && LA39_0<=50)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3448:2: () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3448:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3467:2: ( (lv_op_2_0= ruleassignOp ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3468:1: (lv_op_2_0= ruleassignOp )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3468:1: (lv_op_2_0= ruleassignOp )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3469:3: lv_op_2_0= ruleassignOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOpAssignOpParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignOp_in_ruleassignmentOpExpression6326);
                    lv_op_2_0=ruleassignOp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentOpExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_2_0, 
                      	        		"assignOp", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3491:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3492:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3492:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3493:3: lv_right_3_0= ruleorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6347);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentOpExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"orExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleassignmentOpExpression


    // $ANTLR start entryRuleassignOp
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3523:1: entryRuleassignOp returns [String current=null] : iv_ruleassignOp= ruleassignOp EOF ;
    public final String entryRuleassignOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignOp = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3524:2: (iv_ruleassignOp= ruleassignOp EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3525:2: iv_ruleassignOp= ruleassignOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignOp_in_entryRuleassignOp6386);
            iv_ruleassignOp=ruleassignOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignOp6397); if (failed) return current;

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
    // $ANTLR end entryRuleassignOp


    // $ANTLR start ruleassignOp
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:1: ruleassignOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) ;
    public final AntlrDatatypeRuleToken ruleassignOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3537:6: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3538:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3538:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3538:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3539:2: kw= '+='
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleassignOp6435); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAssignOpAccess().getPlusSignEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3546:2: kw= '-='
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleassignOp6454); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAssignOpAccess().getHyphenMinusEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3553:2: kw= '*='
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleassignOp6473); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAssignOpAccess().getAsteriskEqualsSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3560:2: kw= '/='
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleassignOp6492); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAssignOpAccess().getSolidusEqualsSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3567:2: kw= '%='
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleassignOp6511); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAssignOpAccess().getPercentSignEqualsSignKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleassignOp


    // $ANTLR start entryRuleorExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3580:1: entryRuleorExpression returns [EObject current=null] : iv_ruleorExpression= ruleorExpression EOF ;
    public final EObject entryRuleorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleorExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3581:2: (iv_ruleorExpression= ruleorExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3582:2: iv_ruleorExpression= ruleorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleorExpression_in_entryRuleorExpression6551);
            iv_ruleorExpression=ruleorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleorExpression6561); if (failed) return current;

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
    // $ANTLR end entryRuleorExpression


    // $ANTLR start ruleorExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3589:1: ruleorExpression returns [EObject current=null] : (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_andExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3594:6: ( (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3595:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3595:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3596:2: this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleandExpression_in_ruleorExpression6611);
            this_andExpression_0=ruleandExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_andExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3607:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3607:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3607:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3608:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3626:2: ( (lv_op_2_0= '||' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3627:1: (lv_op_2_0= '||' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3627:1: (lv_op_2_0= '||' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3628:3: lv_op_2_0= '||'
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleorExpression6641); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), "op"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "op", lv_op_2_0, "||", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3648:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3648:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3649:3: lv_right_3_0= ruleorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleorExpression_in_ruleorExpression6675);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"orExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleorExpression


    // $ANTLR start entryRuleandExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3679:1: entryRuleandExpression returns [EObject current=null] : iv_ruleandExpression= ruleandExpression EOF ;
    public final EObject entryRuleandExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3680:2: (iv_ruleandExpression= ruleandExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3681:2: iv_ruleandExpression= ruleandExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleandExpression_in_entryRuleandExpression6713);
            iv_ruleandExpression=ruleandExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleandExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpression6723); if (failed) return current;

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
    // $ANTLR end entryRuleandExpression


    // $ANTLR start ruleandExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3688:1: ruleandExpression returns [EObject current=null] : (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) ;
    public final EObject ruleandExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_relationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3693:6: ( (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3694:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3694:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3695:2: this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulerelationalExpression_in_ruleandExpression6773);
            this_relationalExpression_0=rulerelationalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_relationalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3706:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3706:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3706:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3707:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3725:2: ( (lv_op_2_0= '&&' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3726:1: (lv_op_2_0= '&&' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3726:1: (lv_op_2_0= '&&' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3727:3: lv_op_2_0= '&&'
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleandExpression6803); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0(), "op"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "op", lv_op_2_0, "&&", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3746:2: ( (lv_right_3_0= ruleandExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3747:1: (lv_right_3_0= ruleandExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3747:1: (lv_right_3_0= ruleandExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3748:3: lv_right_3_0= ruleandExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleandExpression_in_ruleandExpression6837);
                    lv_right_3_0=ruleandExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"andExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleandExpression


    // $ANTLR start entryRulerelationalExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3778:1: entryRulerelationalExpression returns [EObject current=null] : iv_rulerelationalExpression= rulerelationalExpression EOF ;
    public final EObject entryRulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelationalExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3779:2: (iv_rulerelationalExpression= rulerelationalExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3780:2: iv_rulerelationalExpression= rulerelationalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelationalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression6875);
            iv_rulerelationalExpression=rulerelationalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelationalExpression6885); if (failed) return current;

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
    // $ANTLR end entryRulerelationalExpression


    // $ANTLR start rulerelationalExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3787:1: rulerelationalExpression returns [EObject current=null] : (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) ;
    public final EObject rulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_additiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3792:6: ( (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3793:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3793:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3794:2: this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleadditiveExpression_in_rulerelationalExpression6935);
            this_additiveExpression_0=ruleadditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_additiveExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3805:1: ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=53 && LA43_0<=59)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3805:2: () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3805:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3806:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3824:2: ( (lv_op_2_0= rulerelOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:1: (lv_op_2_0= rulerelOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:1: (lv_op_2_0= rulerelOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3826:3: lv_op_2_0= rulerelOps
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelOpsParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulerelOps_in_rulerelationalExpression6968);
                    lv_op_2_0=rulerelOps();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRelationalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_2_0, 
                      	        		"relOps", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3848:2: ( (lv_right_3_0= rulerelationalExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3849:1: (lv_right_3_0= rulerelationalExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3849:1: (lv_right_3_0= rulerelationalExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3850:3: lv_right_3_0= rulerelationalExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulerelationalExpression_in_rulerelationalExpression6989);
                    lv_right_3_0=rulerelationalExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRelationalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"relationalExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulerelationalExpression


    // $ANTLR start entryRulerelOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3880:1: entryRulerelOps returns [String current=null] : iv_rulerelOps= rulerelOps EOF ;
    public final String entryRulerelOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3881:2: (iv_rulerelOps= rulerelOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3882:2: iv_rulerelOps= rulerelOps EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelOpsRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelOps_in_entryRulerelOps7028);
            iv_rulerelOps=rulerelOps();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelOps7039); if (failed) return current;

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
    // $ANTLR end entryRulerelOps


    // $ANTLR start rulerelOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3889:1: rulerelOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulerelOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3894:6: ( (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3895:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3896:2: kw= '!='
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_rulerelOps7077); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getExclamationMarkEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3903:2: kw= '=='
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_rulerelOps7096); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getEqualsSignEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3910:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_rulerelOps7115); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignEqualsSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3917:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_rulerelOps7134); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3924:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_rulerelOps7153); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getGreaterThanSignEqualsSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3931:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_rulerelOps7172); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3938:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_rulerelOps7191); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getRelOpsAccess().getGreaterThanSignKeyword_6(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulerelOps


    // $ANTLR start entryRuleadditiveExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3951:1: entryRuleadditiveExpression returns [EObject current=null] : iv_ruleadditiveExpression= ruleadditiveExpression EOF ;
    public final EObject entryRuleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditiveExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3952:2: (iv_ruleadditiveExpression= ruleadditiveExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3953:2: iv_ruleadditiveExpression= ruleadditiveExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditiveExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression7231);
            iv_ruleadditiveExpression=ruleadditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleadditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleadditiveExpression7241); if (failed) return current;

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
    // $ANTLR end entryRuleadditiveExpression


    // $ANTLR start ruleadditiveExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3960:1: ruleadditiveExpression returns [EObject current=null] : (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) ;
    public final EObject ruleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_multiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3965:6: ( (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3966:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3966:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3967:2: this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression7291);
            this_multiplicativeExpression_0=rulemultiplicativeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_multiplicativeExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3978:1: ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=60 && LA45_0<=61)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3978:2: () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3978:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3979:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3997:2: ( (lv_op_2_0= rulearithOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3998:1: (lv_op_2_0= rulearithOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3998:1: (lv_op_2_0= rulearithOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3999:3: lv_op_2_0= rulearithOps
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpArithOpsParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulearithOps_in_ruleadditiveExpression7324);
                    lv_op_2_0=rulearithOps();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdditiveExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_2_0, 
                      	        		"arithOps", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4021:2: ( (lv_right_3_0= ruleadditiveExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4022:1: (lv_right_3_0= ruleadditiveExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4022:1: (lv_right_3_0= ruleadditiveExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4023:3: lv_right_3_0= ruleadditiveExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression7345);
                    lv_right_3_0=ruleadditiveExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdditiveExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"additiveExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleadditiveExpression


    // $ANTLR start entryRulearithOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:1: entryRulearithOps returns [String current=null] : iv_rulearithOps= rulearithOps EOF ;
    public final String entryRulearithOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearithOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4054:2: (iv_rulearithOps= rulearithOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4055:2: iv_rulearithOps= rulearithOps EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArithOpsRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulearithOps_in_entryRulearithOps7384);
            iv_rulearithOps=rulearithOps();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulearithOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulearithOps7395); if (failed) return current;

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
    // $ANTLR end entryRulearithOps


    // $ANTLR start rulearithOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4062:1: rulearithOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulearithOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4067:6: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4068:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4068:1: (kw= '+' | kw= '-' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            else if ( (LA46_0==61) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4068:1: (kw= '+' | kw= '-' )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4069:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FOLLOW_60_in_rulearithOps7433); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getArithOpsAccess().getPlusSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4076:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_rulearithOps7452); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getArithOpsAccess().getHyphenMinusKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulearithOps


    // $ANTLR start entryRulemultiplicativeExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4089:1: entryRulemultiplicativeExpression returns [EObject current=null] : iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF ;
    public final EObject entryRulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicativeExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4090:2: (iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4091:2: iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultiplicativeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7492);
            iv_rulemultiplicativeExpression=rulemultiplicativeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplicativeExpression7502); if (failed) return current;

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
    // $ANTLR end entryRulemultiplicativeExpression


    // $ANTLR start rulemultiplicativeExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4098:1: rulemultiplicativeExpression returns [EObject current=null] : (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) ;
    public final EObject rulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_unaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4103:6: ( (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4104:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4104:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4105:2: this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7552);
            this_unaryExpression_0=ruleunaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_unaryExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4116:1: ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38||LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4116:2: () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4116:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4117:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4135:2: ( (lv_op_2_0= rulemultOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4136:1: (lv_op_2_0= rulemultOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4136:1: (lv_op_2_0= rulemultOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4137:3: lv_op_2_0= rulemultOps
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultOpsParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemultOps_in_rulemultiplicativeExpression7585);
                    lv_op_2_0=rulemultOps();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMultiplicativeExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_2_0, 
                      	        		"multOps", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4159:2: ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4160:1: (lv_right_3_0= rulemultiplicativeExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4160:1: (lv_right_3_0= rulemultiplicativeExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4161:3: lv_right_3_0= rulemultiplicativeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7606);
                    lv_right_3_0=rulemultiplicativeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMultiplicativeExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"multiplicativeExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemultiplicativeExpression


    // $ANTLR start entryRulemultOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4191:1: entryRulemultOps returns [String current=null] : iv_rulemultOps= rulemultOps EOF ;
    public final String entryRulemultOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4192:2: (iv_rulemultOps= rulemultOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4193:2: iv_rulemultOps= rulemultOps EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOpsRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemultOps_in_entryRulemultOps7645);
            iv_rulemultOps=rulemultOps();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemultOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemultOps7656); if (failed) return current;

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
    // $ANTLR end entryRulemultOps


    // $ANTLR start rulemultOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4200:1: rulemultOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken rulemultOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4205:6: ( (kw= '*' | kw= '/' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4206:1: (kw= '*' | kw= '/' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4206:1: (kw= '*' | kw= '/' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            else if ( (LA48_0==62) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4206:1: (kw= '*' | kw= '/' )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4207:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_rulemultOps7694); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMultOpsAccess().getAsteriskKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4214:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_rulemultOps7713); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMultOpsAccess().getSolidusKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemultOps


    // $ANTLR start entryRuleunaryExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4227:1: entryRuleunaryExpression returns [EObject current=null] : iv_ruleunaryExpression= ruleunaryExpression EOF ;
    public final EObject entryRuleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaryExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4228:2: (iv_ruleunaryExpression= ruleunaryExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4229:2: iv_ruleunaryExpression= ruleunaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7753);
            iv_ruleunaryExpression=ruleunaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryExpression7763); if (failed) return current;

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
    // $ANTLR end entryRuleunaryExpression


    // $ANTLR start ruleunaryExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4236:1: ruleunaryExpression returns [EObject current=null] : (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) ;
    public final EObject ruleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4241:6: ( (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4242:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4242:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_BOOLEAN)||(LA49_0>=64 && LA49_0<=100)) ) {
                alt49=1;
            }
            else if ( (LA49_0==61||LA49_0==63) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4242:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4243:2: this_TermExpression_0= ruleTermExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression7813);
                    this_TermExpression_0=ruleTermExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TermExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:7: ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:7: ( (lv_op_1_0= ruleunaryOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4256:1: (lv_op_1_0= ruleunaryOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4256:1: (lv_op_1_0= ruleunaryOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4257:3: lv_op_1_0= ruleunaryOps
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpsParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunaryOps_in_ruleunaryExpression7840);
                    lv_op_1_0=ruleunaryOps();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"unaryOps", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4279:2: ( (lv_expr_2_0= ruleTermExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4280:1: (lv_expr_2_0= ruleTermExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4280:1: (lv_expr_2_0= ruleTermExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4281:3: lv_expr_2_0= ruleTermExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprTermExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression7861);
                    lv_expr_2_0=ruleTermExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_2_0, 
                      	        		"TermExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleunaryExpression


    // $ANTLR start entryRuleunaryOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4311:1: entryRuleunaryOps returns [String current=null] : iv_ruleunaryOps= ruleunaryOps EOF ;
    public final String entryRuleunaryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4312:2: (iv_ruleunaryOps= ruleunaryOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4313:2: iv_ruleunaryOps= ruleunaryOps EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOpsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleunaryOps_in_entryRuleunaryOps7899);
            iv_ruleunaryOps=ruleunaryOps();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunaryOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryOps7910); if (failed) return current;

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
    // $ANTLR end entryRuleunaryOps


    // $ANTLR start ruleunaryOps
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4320:1: ruleunaryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4325:6: ( (kw= '-' | kw= '!' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4326:1: (kw= '-' | kw= '!' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4326:1: (kw= '-' | kw= '!' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            else if ( (LA50_0==63) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4326:1: (kw= '-' | kw= '!' )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4327:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_ruleunaryOps7948); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOpsAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4334:2: kw= '!'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleunaryOps7967); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOpsAccess().getExclamationMarkKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleunaryOps


    // $ANTLR start entryRuleOperator
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4347:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4348:2: (iv_ruleOperator= ruleOperator EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4349:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperatorRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator8007);
            iv_ruleOperator=ruleOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator8017); if (failed) return current;

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
    // $ANTLR end entryRuleOperator


    // $ANTLR start ruleOperator
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4356:1: ruleOperator returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_sequence_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4361:6: ( ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4362:1: ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4362:1: ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4362:2: ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4362:2: ( (lv_op_0_0= ruleOperatorName ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4363:1: (lv_op_0_0= ruleOperatorName )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4363:1: (lv_op_0_0= ruleOperatorName )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4364:3: lv_op_0_0= ruleOperatorName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperatorAccess().getOpOperatorNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOperatorName_in_ruleOperator8063);
            lv_op_0_0=ruleOperatorName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperatorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"op",
              	        		lv_op_0_0, 
              	        		"OperatorName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,24,FOLLOW_24_in_ruleOperator8073); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4390:1: ( (lv_sequence_2_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4391:1: (lv_sequence_2_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4391:1: (lv_sequence_2_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4392:3: lv_sequence_2_0= ruleExpressionSequence
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperatorAccess().getSequenceExpressionSequenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleOperator8094);
            lv_sequence_2_0=ruleExpressionSequence();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperatorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"sequence",
              	        		lv_sequence_2_0, 
              	        		"ExpressionSequence", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,25,FOLLOW_25_in_ruleOperator8104); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperator


    // $ANTLR start entryRuleTermExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4426:1: entryRuleTermExpression returns [EObject current=null] : iv_ruleTermExpression= ruleTermExpression EOF ;
    public final EObject entryRuleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4427:2: (iv_ruleTermExpression= ruleTermExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4428:2: iv_ruleTermExpression= ruleTermExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTermExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTermExpression_in_entryRuleTermExpression8140);
            iv_ruleTermExpression=ruleTermExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTermExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermExpression8150); if (failed) return current;

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
    // $ANTLR end entryRuleTermExpression


    // $ANTLR start ruleTermExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4435:1: ruleTermExpression returns [EObject current=null] : (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) ;
    public final EObject ruleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermLiteral_0 = null;

        EObject this_Operator_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4440:6: ( (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4441:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4441:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_BOOLEAN)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=64 && LA51_0<=100)) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4441:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4442:2: this_TermLiteral_0= ruleTermLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTermExpressionAccess().getTermLiteralParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTermLiteral_in_ruleTermExpression8200);
                    this_TermLiteral_0=ruleTermLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TermLiteral_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4455:2: this_Operator_1= ruleOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTermExpressionAccess().getOperatorParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperator_in_ruleTermExpression8230);
                    this_Operator_1=ruleOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Operator_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTermExpression


    // $ANTLR start entryRuleTermLiteral
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4474:1: entryRuleTermLiteral returns [EObject current=null] : iv_ruleTermLiteral= ruleTermLiteral EOF ;
    public final EObject entryRuleTermLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermLiteral = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4475:2: (iv_ruleTermLiteral= ruleTermLiteral EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4476:2: iv_ruleTermLiteral= ruleTermLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTermLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral8265);
            iv_ruleTermLiteral=ruleTermLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTermLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermLiteral8275); if (failed) return current;

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
    // $ANTLR end entryRuleTermLiteral


    // $ANTLR start ruleTermLiteral
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4483:1: ruleTermLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleTermLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4488:6: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4489:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ) )", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:3: () ( (lv_value_1_0= RULE_ID ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4489:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4490:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTermLiteralAccess().getVarRefAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getVarRefAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4503:2: ( (lv_value_1_0= RULE_ID ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4504:1: (lv_value_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4504:1: (lv_value_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4505:3: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTermLiteral8330); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTermLiteralAccess().getValueIDTerminalRuleCall_0_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4528:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4528:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4528:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4528:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4529:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTermLiteralAccess().getIntegerLiteralAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getIntegerLiteralAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4542:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4543:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4543:1: (lv_value_3_0= RULE_INT )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4544:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTermLiteral8372); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTermLiteralAccess().getValueINTTerminalRuleCall_1_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_3_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4567:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4567:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4567:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4567:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4568:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTermLiteralAccess().getBooleanLiteralAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getBooleanLiteralAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4581:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4582:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4582:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4583:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8414); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTermLiteralAccess().getValueBOOLEANTerminalRuleCall_2_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_5_0, 
                      	        		"BOOLEAN", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4606:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4606:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4606:7: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4606:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4607:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTermLiteralAccess().getStringLiteralAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getStringLiteralAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4620:2: ( (lv_value_7_0= RULE_STRING ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4621:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4621:1: (lv_value_7_0= RULE_STRING )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4622:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTermLiteral8456); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTermLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_7_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4645:6: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4645:6: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4645:7: () ( (lv_value_9_0= RULE_DOUBLE ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4645:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4646:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTermLiteralAccess().getDoubleLiteralAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getDoubleLiteralAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4659:2: ( (lv_value_9_0= RULE_DOUBLE ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4660:1: (lv_value_9_0= RULE_DOUBLE )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4660:1: (lv_value_9_0= RULE_DOUBLE )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4661:3: lv_value_9_0= RULE_DOUBLE
                    {
                    lv_value_9_0=(Token)input.LT(1);
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTermLiteral8498); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTermLiteralAccess().getValueDOUBLETerminalRuleCall_4_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_9_0, 
                      	        		"DOUBLE", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTermLiteral


    // $ANTLR start entryRuleOperatorName
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4691:1: entryRuleOperatorName returns [String current=null] : iv_ruleOperatorName= ruleOperatorName EOF ;
    public final String entryRuleOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorName = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4692:2: (iv_ruleOperatorName= ruleOperatorName EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4693:2: iv_ruleOperatorName= ruleOperatorName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperatorNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperatorName_in_entryRuleOperatorName8541);
            iv_ruleOperatorName=ruleOperatorName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorName8552); if (failed) return current;

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
    // $ANTLR end entryRuleOperatorName


    // $ANTLR start ruleOperatorName
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4700:1: ruleOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4705:6: ( (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4706:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4706:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4706:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4707:2: kw= 'truncate'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleOperatorName8590); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getTruncateKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4714:2: kw= 'Normal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_ruleOperatorName8609); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getNormalKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4721:2: kw= 'LogNormal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_ruleOperatorName8628); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getLogNormalKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4728:2: kw= 'Beta'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleOperatorName8647); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getBetaKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4735:2: kw= 'Gamma'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_ruleOperatorName8666); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getGammaKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4742:2: kw= 'Exponential'
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleOperatorName8685); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getExponentialKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4749:2: kw= 'Weibull'
                    {
                    kw=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_ruleOperatorName8704); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getWeibullKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4756:2: kw= 'Uniform'
                    {
                    kw=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_ruleOperatorName8723); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getUniformKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4763:2: kw= 'Triangular'
                    {
                    kw=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ruleOperatorName8742); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getTriangularKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4770:2: kw= 'PERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_ruleOperatorName8761); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getPERTKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4777:2: kw= 'Binomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ruleOperatorName8780); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getBinomialKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4784:2: kw= 'Poisson'
                    {
                    kw=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_ruleOperatorName8799); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getPoissonKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4791:2: kw= 'NegativeBinomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleOperatorName8818); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getNegativeBinomialKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4798:2: kw= 'Geometric'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleOperatorName8837); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getGeometricKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4805:2: kw= 'Distribution'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleOperatorName8856); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getDistributionKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4812:2: kw= 'NoisyOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleOperatorName8875); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getNoisyORKeyword_15(), null); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4819:2: kw= 'min'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleOperatorName8894); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getMinKeyword_16(), null); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4826:2: kw= 'max'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleOperatorName8913); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getMaxKeyword_17(), null); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4833:2: kw= 'log'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleOperatorName8932); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getLogKeyword_18(), null); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4840:2: kw= 'log2'
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleOperatorName8951); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getLog2Keyword_19(), null); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4847:2: kw= 'log10'
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleOperatorName8970); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getLog10Keyword_20(), null); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4854:2: kw= 'exp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleOperatorName8989); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getExpKeyword_21(), null); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4861:2: kw= 'sin'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleOperatorName9008); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getSinKeyword_22(), null); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4868:2: kw= 'cos'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleOperatorName9027); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getCosKeyword_23(), null); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4875:2: kw= 'tan'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleOperatorName9046); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getTanKeyword_24(), null); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4882:2: kw= 'sinh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_ruleOperatorName9065); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getSinhKeyword_25(), null); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4889:2: kw= 'cosh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ruleOperatorName9084); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getCoshKeyword_26(), null); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4896:2: kw= 'tanh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ruleOperatorName9103); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getTanhKeyword_27(), null); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4903:2: kw= 'sqrt'
                    {
                    kw=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_ruleOperatorName9122); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getSqrtKeyword_28(), null); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4910:2: kw= 'abs'
                    {
                    kw=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_ruleOperatorName9141); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getAbsKeyword_29(), null); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4917:2: kw= 'floor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,94,FOLLOW_94_in_ruleOperatorName9160); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getFloorKeyword_30(), null); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4924:2: kw= 'ceil'
                    {
                    kw=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_ruleOperatorName9179); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getCeilKeyword_31(), null); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4931:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,96,FOLLOW_96_in_ruleOperatorName9198); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getModKeyword_32(), null); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4938:2: kw= 'if'
                    {
                    kw=(Token)input.LT(1);
                    match(input,97,FOLLOW_97_in_ruleOperatorName9217); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getIfKeyword_33(), null); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4945:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,98,FOLLOW_98_in_ruleOperatorName9236); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getAndKeyword_34(), null); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4952:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,99,FOLLOW_99_in_ruleOperatorName9255); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getOrKeyword_35(), null); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4959:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,100,FOLLOW_100_in_ruleOperatorName9274); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOperatorNameAccess().getNotKeyword_36(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperatorName


 

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
    public static final BitSet FOLLOW_13_in_ruleDomainHeader434 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainHeader444 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainHeader465 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_15_in_ruleDomainHeader476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_ruleDomainElement572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_ruleDomainElement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleDomainElement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_ruleAttribute727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleAttribute757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleAttribute787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_ruleAttribute817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_ruleAttribute847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleAttribute877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_entryRuleBasicNode942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNode952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode998 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicNode1015 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBasicNode1031 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBasicNode1052 = new BitSet(new long[]{0x0000000638408020L});
    public static final BitSet FOLLOW_15_in_ruleBasicNode1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNodeKeyword1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBasicNodeKeyword1151 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleBasicNodeKeyword1170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBasicNodeKeyword1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBasicNodeKeyword1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicNodeKeyword1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicNodeKeyword1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatesAttribute1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStatesAttribute1340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStatesAttribute1350 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatesAttribute1360 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatesAttribute1377 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_ruleStatesAttribute1393 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStatesAttribute1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelAttribute1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLabelAttribute1484 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLabelAttribute1494 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelAttribute1511 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLabelAttribute1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionAttribute1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePositionAttribute1607 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePositionAttribute1617 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePositionAttribute1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePositionAttribute1691 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePositionAttribute1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeAttribute1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSubtypeAttribute1782 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSubtypeAttribute1792 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_27_in_ruleSubtypeAttribute1812 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30_in_ruleSubtypeAttribute1841 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31_in_ruleSubtypeAttribute1870 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32_in_ruleSubtypeAttribute1899 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSubtypeAttribute1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateValuesAttribute1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateValuesAttribute2006 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateValuesAttribute2016 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateValuesAttribute2026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStateValuesAttribute2043 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleStateValuesAttribute2059 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStateValuesAttribute2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationAttribute2157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleApplicationAttribute2172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationAttribute2189 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleApplicationAttribute2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSizeAttribute2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNodeSizeAttribute2285 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNodeSizeAttribute2295 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNodeSizeAttribute2305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2344 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNodeSizeAttribute2359 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeSizeAttribute2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_entryRulePotential2405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotential2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePotential2450 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_rulePotential2471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePotentialModel_in_rulePotential2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialGraph2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePotentialGraph2585 = new BitSet(new long[]{0x0000001002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2602 = new BitSet(new long[]{0x0000001002000020L});
    public static final BitSet FOLLOW_36_in_rulePotentialGraph2619 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2636 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_rulePotentialGraph2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialModel_in_entryRulePotentialModel2690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialModel2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePotentialModel2747 = new BitSet(new long[]{0x000000A000008000L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_rulePotentialModel2768 = new BitSet(new long[]{0x000000A000008000L});
    public static final BitSet FOLLOW_15_in_rulePotentialModel2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialAttribute2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialDataAttribute2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePotentialDataAttribute2997 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePotentialDataAttribute3007 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMatrixRow_in_rulePotentialDataAttribute3028 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePotentialDataAttribute3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRow_in_entryRuleMatrixRow3074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRow3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList5_in_ruleMatrixRow3143 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList4_in_ruleMatrixRow3185 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList3_in_ruleMatrixRow3227 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList2_in_ruleMatrixRow3269 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleList1_in_ruleMatrixRow3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList5_in_entryRuleList53348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList53358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList53405 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList4_in_ruleList53426 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList53437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList4_in_entryRuleList43473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList43483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList43530 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList3_in_ruleList43551 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList43562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList3_in_entryRuleList33598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList33608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList33655 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList2_in_ruleList33676 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList33687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList2_in_entryRuleList23723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList23780 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleList1_in_ruleList23801 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleList23812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList1_in_entryRuleList13848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleList13905 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleunaryExpression_in_ruleList13926 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_25_in_ruleList13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanTerm3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleMeanTerm4054 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeanTerm4072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialTableAttribute4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4215 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4236 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodesAttribute4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleModelNodesAttribute4351 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModelNodesAttribute4361 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelNodesAttribute4371 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodesAttribute4388 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleModelNodesAttribute4404 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelNodesAttribute4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplesAttribute4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSamplesAttribute4495 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSamplesAttribute4505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplesAttribute4522 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSamplesAttribute4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDataAttribute4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleModelDataAttribute4630 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModelDataAttribute4640 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelDataAttribute4650 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelDataAttribute4681 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelDataAttribute4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleClassDefinition4772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition4789 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassDefinition4804 = new BitSet(new long[]{0x00000C0E387F8020L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClassDefinition4825 = new BitSet(new long[]{0x00000C0E387F8020L});
    public static final BitSet FOLLOW_15_in_ruleClassDefinition4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleClassElement4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClassElement4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_ruleClassElement4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_entryRuleClassInstance5027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassInstance5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClassInstance5072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5089 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleClassInstance5104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5121 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleClassInstance5136 = new BitSet(new long[]{0x0000000006000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleClassInstance5157 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleClassInstance5169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleClassInstance5190 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassInstance5202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassInstance5212 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_ruleClassInstance5233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassInstance5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBindings_in_entryRuleInputBindings5279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBindings5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_ruleInputBindings5335 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInputBindings5345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleInputBindings5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_entryRuleInputBinding5402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBinding5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5454 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInputBinding5469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBindings5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_ruleOutputBindings5583 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleOutputBindings5593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleOutputBindings5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBinding5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5702 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOutputBinding5717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttributes5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence5930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSequence5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence5999 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpressionSequence6010 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6031 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_ruleExpression6131 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleExpression6161 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleExpression6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression6233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignmentOpExpression6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6293 = new BitSet(new long[]{0x0007C00000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_ruleassignmentOpExpression6326 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_entryRuleassignOp6386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignOp6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleassignOp6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleassignOp6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleassignOp6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleassignOp6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleassignOp6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_entryRuleorExpression6551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorExpression6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleorExpression6611 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleorExpression6641 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleorExpression6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_entryRuleandExpression6713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_ruleandExpression6773 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleandExpression6803 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleandExpression6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression6875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelationalExpression6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_rulerelationalExpression6935 = new BitSet(new long[]{0x0FE0000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_rulerelationalExpression6968 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulerelationalExpression_in_rulerelationalExpression6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_entryRulerelOps7028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelOps7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulerelOps7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulerelOps7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulerelOps7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulerelOps7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulerelOps7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulerelOps7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulerelOps7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression7231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadditiveExpression7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression7291 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_ruleadditiveExpression7324 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_entryRulearithOps7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearithOps7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulearithOps7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulearithOps7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplicativeExpression7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7552 = new BitSet(new long[]{0x4000004000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_rulemultiplicativeExpression7585 = new BitSet(new long[]{0xA0000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_entryRulemultOps7645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultOps7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulemultOps7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulemultOps7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryExpression7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_ruleunaryExpression7840 = new BitSet(new long[]{0x00000000000001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_entryRuleunaryOps7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryOps7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleunaryOps7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleunaryOps7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator8007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_ruleOperator8063 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperator8073 = new BitSet(new long[]{0xA0000000020001F0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleOperator8094 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOperator8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_entryRuleTermExpression8140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermExpression8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_ruleTermExpression8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTermExpression8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral8265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermLiteral8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTermLiteral8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTermLiteral8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTermLiteral8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTermLiteral8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_entryRuleOperatorName8541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorName8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorName8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorName8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorName8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorName8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorName8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperatorName8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorName8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorName8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorName8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorName8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperatorName8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperatorName8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperatorName8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperatorName8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperatorName8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperatorName8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperatorName8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperatorName8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperatorName8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperatorName8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperatorName8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperatorName8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperatorName9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperatorName9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperatorName9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorName9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOperatorName9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOperatorName9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperatorName9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperatorName9141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOperatorName9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOperatorName9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOperatorName9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOperatorName9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOperatorName9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOperatorName9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOperatorName9274 = new BitSet(new long[]{0x0000000000000002L});

}