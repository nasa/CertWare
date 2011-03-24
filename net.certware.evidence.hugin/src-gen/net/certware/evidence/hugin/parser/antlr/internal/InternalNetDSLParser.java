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

@SuppressWarnings("all")
public class InternalNetDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXT_INT", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'net'", "'{'", "'}'", "'discrete'", "'continuous'", "'node'", "'decision'", "'utility'", "'function'", "'states'", "'='", "'('", "')'", "';'", "'label'", "'position'", "'subtype'", "'boolean'", "'number'", "'interval'", "'state_values'", "'node_size'", "'potential'", "'|'", "'data'", "'+'", "'*'", "'model_nodes'", "'samples_per_interval'", "'model_data'", "'class'", "'instance'", "':'", "','", "'+='", "'-='", "'*='", "'/='", "'%='", "'||'", "'&&'", "'!='", "'=='", "'<='", "'<>'", "'>='", "'<'", "'>'", "'-'", "'/'", "'!'", "'truncate'", "'Normal'", "'LogNormal'", "'Beta'", "'Gamma'", "'Exponential'", "'Weibull'", "'Uniform'", "'Triangular'", "'PERT'", "'Binomial'", "'Poisson'", "'NegativeBinomial'", "'Geometric'", "'Distribution'", "'NoisyOR'", "'min'", "'max'", "'log'", "'log2'", "'log10'", "'exp'", "'sin'", "'cos'", "'tan'", "'sinh'", "'cosh'", "'tanh'", "'sqrt'", "'abs'", "'floor'", "'ceil'", "'mod'", "'if'", "'and'", "'or'", "'not'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=6;
    public static final int RULE_EXT_INT=5;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalNetDSLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g"; }



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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:86:1: ruleModel returns [EObject current=null] : ( (lv_domain_0_0= ruleDomainDefinition ) )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_domain_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:91:6: ( ( (lv_domain_0_0= ruleDomainDefinition ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:92:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:92:1: ( (lv_domain_0_0= ruleDomainDefinition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:93:1: (lv_domain_0_0= ruleDomainDefinition )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:93:1: (lv_domain_0_0= ruleDomainDefinition )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:94:3: lv_domain_0_0= ruleDomainDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDomainDomainDefinitionParserRuleCall_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDomainDefinition_in_ruleModel130);
                    lv_domain_0_0=ruleDomainDefinition();
                    _fsp--;


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
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleDOUBLE
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:124:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:125:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:126:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDOUBLERule(), currentNode); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE167);
            iv_ruleDOUBLE=ruleDOUBLE();
            _fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDOUBLE


    // $ANTLR start ruleDOUBLE
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:133:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:138:6: ( (this_INT_0= RULE_INT kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:139:1: (this_INT_0= RULE_INT kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:139:1: (this_INT_0= RULE_INT kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:139:6: this_INT_0= RULE_INT kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE218); 

            		current.merge(this_INT_0);
                
             
                createLeafNode(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_ruleDOUBLE236); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:152:1: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_EXT_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("152:1: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:152:6: this_EXT_INT_2= RULE_EXT_INT
                    {
                    this_EXT_INT_2=(Token)input.LT(1);
                    match(input,RULE_EXT_INT,FOLLOW_RULE_EXT_INT_in_ruleDOUBLE252); 

                    		current.merge(this_EXT_INT_2);
                        
                     
                        createLeafNode(grammarAccess.getDOUBLEAccess().getEXT_INTTerminalRuleCall_2_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:160:10: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE278); 

                    		current.merge(this_INT_3);
                        
                     
                        createLeafNode(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDOUBLE


    // $ANTLR start entryRuleInteger
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:175:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:176:2: (iv_ruleInteger= ruleInteger EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:177:2: iv_ruleInteger= ruleInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerRule(), currentNode); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger324);
            iv_ruleInteger=ruleInteger();
            _fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger334); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:184:1: ruleInteger returns [EObject current=null] : ( (lv_i_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:189:6: ( ( (lv_i_0_0= RULE_INT ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:190:1: ( (lv_i_0_0= RULE_INT ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:190:1: ( (lv_i_0_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:191:1: (lv_i_0_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:191:1: (lv_i_0_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:3: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger375); 

            			createLeafNode(grammarAccess.getIntegerAccess().getIINTTerminalRuleCall_0(), "i"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:222:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:223:2: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:224:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition415);
            iv_ruleDomainDefinition=ruleDomainDefinition();
            _fsp--;

             current =iv_ruleDomainDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDefinition425); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:231:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:236:6: ( ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:237:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:237:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:237:2: ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:237:2: ( (lv_header_0_0= ruleDomainHeader ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:238:1: (lv_header_0_0= ruleDomainHeader )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:238:1: (lv_header_0_0= ruleDomainHeader )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:3: lv_header_0_0= ruleDomainHeader
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getHeaderDomainHeaderParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainHeader_in_ruleDomainDefinition471);
            lv_header_0_0=ruleDomainHeader();
            _fsp--;


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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:261:2: ( (lv_elements_1_0= ruleDomainElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=22)||LA3_0==36||LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:262:1: (lv_elements_1_0= ruleDomainElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:262:1: (lv_elements_1_0= ruleDomainElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:3: lv_elements_1_0= ruleDomainElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getElementsDomainElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomainDefinition492);
            	    lv_elements_1_0=ruleDomainElement();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:293:1: entryRuleDomainHeader returns [EObject current=null] : iv_ruleDomainHeader= ruleDomainHeader EOF ;
    public final EObject entryRuleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainHeader = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:294:2: (iv_ruleDomainHeader= ruleDomainHeader EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:295:2: iv_ruleDomainHeader= ruleDomainHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader529);
            iv_ruleDomainHeader=ruleDomainHeader();
            _fsp--;

             current =iv_ruleDomainHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainHeader539); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:302:1: ruleDomainHeader returns [EObject current=null] : ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:307:6: ( ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:308:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:308:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:308:2: () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:308:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:309:5: 
            {
             
                    temp=factory.create(grammarAccess.getDomainHeaderAccess().getDomainHeaderAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDomainHeaderAccess().getDomainHeaderAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,14,FOLLOW_14_in_ruleDomainHeader583); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getNetKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleDomainHeader593); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:327:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==23||(LA4_0>=28 && LA4_0<=30)||(LA4_0>=34 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:328:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:328:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:329:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainHeaderAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainHeader614);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleDomainHeader625); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:363:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:364:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:365:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement661);
            iv_ruleDomainElement=ruleDomainElement();
            _fsp--;

             current =iv_ruleDomainElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement671); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:372:1: ruleDomainElement returns [EObject current=null] : (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicNode_0 = null;

        EObject this_Potential_1 = null;

        EObject this_ClassDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:377:6: ( (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:378:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:378:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("378:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:379:5: this_BasicNode_0= ruleBasicNode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getBasicNodeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBasicNode_in_ruleDomainElement718);
                    this_BasicNode_0=ruleBasicNode();
                    _fsp--;

                     
                            current = this_BasicNode_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:389:5: this_Potential_1= rulePotential
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getPotentialParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotential_in_ruleDomainElement745);
                    this_Potential_1=rulePotential();
                    _fsp--;

                     
                            current = this_Potential_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:399:5: this_ClassDefinition_2= ruleClassDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getClassDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassDefinition_in_ruleDomainElement772);
                    this_ClassDefinition_2=ruleClassDefinition();
                    _fsp--;

                     
                            current = this_ClassDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:415:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:416:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:417:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute807);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute817); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:424:1: ruleAttribute returns [EObject current=null] : (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) ;
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
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:429:6: ( (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:430:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:430:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case RULE_ID:
                {
                alt6=6;
                }
                break;
            case 35:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("430:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:431:5: this_StatesAttribute_0= ruleStatesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatesAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatesAttribute_in_ruleAttribute864);
                    this_StatesAttribute_0=ruleStatesAttribute();
                    _fsp--;

                     
                            current = this_StatesAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:441:5: this_LabelAttribute_1= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleAttribute891);
                    this_LabelAttribute_1=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:451:5: this_PositionAttribute_2= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleAttribute918);
                    this_PositionAttribute_2=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:461:5: this_SubtypeAttribute_3= ruleSubtypeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSubtypeAttributeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubtypeAttribute_in_ruleAttribute945);
                    this_SubtypeAttribute_3=ruleSubtypeAttribute();
                    _fsp--;

                     
                            current = this_SubtypeAttribute_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:471:5: this_StateValuesAttribute_4= ruleStateValuesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStateValuesAttributeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateValuesAttribute_in_ruleAttribute972);
                    this_StateValuesAttribute_4=ruleStateValuesAttribute();
                    _fsp--;

                     
                            current = this_StateValuesAttribute_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:481:5: this_ApplicationAttribute_5= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getApplicationAttributeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleAttribute999);
                    this_ApplicationAttribute_5=ruleApplicationAttribute();
                    _fsp--;

                     
                            current = this_ApplicationAttribute_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:491:5: this_NodeSizeAttribute_6= ruleNodeSizeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNodeSizeAttributeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1026);
                    this_NodeSizeAttribute_6=ruleNodeSizeAttribute();
                    _fsp--;

                     
                            current = this_NodeSizeAttribute_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:507:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:508:2: (iv_ruleBasicNode= ruleBasicNode EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:509:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNode_in_entryRuleBasicNode1061);
            iv_ruleBasicNode=ruleBasicNode();
            _fsp--;

             current =iv_ruleBasicNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNode1071); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:516:1: ruleBasicNode returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:521:6: ( ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:522:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:522:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:522:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:522:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:523:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:523:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:524:3: lv_keyword_0_0= ruleBasicNodeKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getKeywordBasicNodeKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1117);
            lv_keyword_0_0=ruleBasicNodeKeyword();
            _fsp--;


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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:546:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:547:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:547:1: (lv_id_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:548:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicNode1134); 

                    			createLeafNode(grammarAccess.getBasicNodeAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                    		

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
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleBasicNode1150); 

                    createLeafNode(grammarAccess.getBasicNodeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:574:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23||(LA8_0>=28 && LA8_0<=30)||(LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:575:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:575:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:576:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBasicNode1171);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleBasicNode1182); 

                    createLeafNode(grammarAccess.getBasicNodeAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:610:1: entryRuleBasicNodeKeyword returns [String current=null] : iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF ;
    public final String entryRuleBasicNodeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicNodeKeyword = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:611:2: (iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:612:2: iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1219);
            iv_ruleBasicNodeKeyword=ruleBasicNodeKeyword();
            _fsp--;

             current =iv_ruleBasicNodeKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNodeKeyword1230); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:619:1: ruleBasicNodeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) ;
    public final AntlrDatatypeRuleToken ruleBasicNodeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:624:6: ( ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("625:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:3: (kw= 'discrete' | kw= 'continuous' )? kw= 'node'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:625:3: (kw= 'discrete' | kw= 'continuous' )?
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==18) ) {
                        alt9=2;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:626:2: kw= 'discrete'
                            {
                            kw=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleBasicNodeKeyword1270); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDiscreteKeyword_0_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:633:2: kw= 'continuous'
                            {
                            kw=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleBasicNodeKeyword1289); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getContinuousKeyword_0_0_1(), null); 
                                

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBasicNodeKeyword1304); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getNodeKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:646:2: kw= 'decision'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBasicNodeKeyword1324); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDecisionKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:653:2: kw= 'utility'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleBasicNodeKeyword1343); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getUtilityKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:660:2: kw= 'function'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleBasicNodeKeyword1362); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getFunctionKeyword_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:673:1: entryRuleStatesAttribute returns [EObject current=null] : iv_ruleStatesAttribute= ruleStatesAttribute EOF ;
    public final EObject entryRuleStatesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:674:2: (iv_ruleStatesAttribute= ruleStatesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:675:2: iv_ruleStatesAttribute= ruleStatesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1402);
            iv_ruleStatesAttribute=ruleStatesAttribute();
            _fsp--;

             current =iv_ruleStatesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatesAttribute1412); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:682:1: ruleStatesAttribute returns [EObject current=null] : ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) ;
    public final EObject ruleStatesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_states_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:687:6: ( ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:688:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:688:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:688:2: () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:688:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:689:5: 
            {
             
                    temp=factory.create(grammarAccess.getStatesAttributeAccess().getStatesAttributeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStatesAttributeAccess().getStatesAttributeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,23,FOLLOW_23_in_ruleStatesAttribute1456); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStatesAttribute1466); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStatesAttribute1476); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:711:1: ( (lv_states_4_0= RULE_STRING ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:712:1: (lv_states_4_0= RULE_STRING )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:712:1: (lv_states_4_0= RULE_STRING )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:713:3: lv_states_4_0= RULE_STRING
            	    {
            	    lv_states_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatesAttribute1493); 

            	    			createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesSTRINGTerminalRuleCall_4_0(), "states"); 
            	    		

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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleStatesAttribute1509); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStatesAttribute1519); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:751:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:752:2: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:753:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1555);
            iv_ruleLabelAttribute=ruleLabelAttribute();
            _fsp--;

             current =iv_ruleLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelAttribute1565); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:760:1: ruleLabelAttribute returns [EObject current=null] : ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:765:6: ( ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:766:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:766:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:766:3: 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            match(input,28,FOLLOW_28_in_ruleLabelAttribute1600); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleLabelAttribute1610); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:774:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:775:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:775:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:776:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelAttribute1627); 

            			createLeafNode(grammarAccess.getLabelAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
            		

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

            match(input,27,FOLLOW_27_in_ruleLabelAttribute1642); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:810:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:811:2: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:812:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1678);
            iv_rulePositionAttribute=rulePositionAttribute();
            _fsp--;

             current =iv_rulePositionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionAttribute1688); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:819:1: rulePositionAttribute returns [EObject current=null] : ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_x_4_0 = null;

        EObject lv_y_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:824:6: ( ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:825:1: ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:825:1: ( 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:825:3: 'position' '=' '(' () ( (lv_x_4_0= ruleInteger ) ) ( (lv_y_5_0= ruleInteger ) ) ')' ';'
            {
            match(input,29,FOLLOW_29_in_rulePositionAttribute1723); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getPositionKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_rulePositionAttribute1733); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_rulePositionAttribute1743); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:837:1: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:838:5: 
            {
             
                    temp=factory.create(grammarAccess.getPositionAttributeAccess().getIntegerLiteralAction_3().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPositionAttributeAccess().getIntegerLiteralAction_3(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:848:2: ( (lv_x_4_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:849:1: (lv_x_4_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:849:1: (lv_x_4_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:850:3: lv_x_4_0= ruleInteger
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPositionAttributeAccess().getXIntegerParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1773);
            lv_x_4_0=ruleInteger();
            _fsp--;


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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:872:2: ( (lv_y_5_0= ruleInteger ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:873:1: (lv_y_5_0= ruleInteger )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:873:1: (lv_y_5_0= ruleInteger )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:874:3: lv_y_5_0= ruleInteger
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPositionAttributeAccess().getYIntegerParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInteger_in_rulePositionAttribute1794);
            lv_y_5_0=ruleInteger();
            _fsp--;


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

            match(input,26,FOLLOW_26_in_rulePositionAttribute1804); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getRightParenthesisKeyword_6(), null); 
                
            match(input,27,FOLLOW_27_in_rulePositionAttribute1814); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:912:1: entryRuleSubtypeAttribute returns [EObject current=null] : iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF ;
    public final EObject entryRuleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:913:2: (iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:914:2: iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubtypeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1850);
            iv_ruleSubtypeAttribute=ruleSubtypeAttribute();
            _fsp--;

             current =iv_ruleSubtypeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeAttribute1860); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:921:1: ruleSubtypeAttribute returns [EObject current=null] : ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) ;
    public final EObject ruleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_subtype_2_1=null;
        Token lv_subtype_2_2=null;
        Token lv_subtype_2_3=null;
        Token lv_subtype_2_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:926:6: ( ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:3: 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';'
            {
            match(input,30,FOLLOW_30_in_ruleSubtypeAttribute1895); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSubtypeAttribute1905); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:935:1: ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:936:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:936:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:937:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:937:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("937:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:938:3: lv_subtype_2_1= 'label'
                    {
                    lv_subtype_2_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSubtypeAttribute1925); 

                            createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeLabelKeyword_2_0_0(), "subtype"); 
                        

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
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:956:8: lv_subtype_2_2= 'boolean'
                    {
                    lv_subtype_2_2=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSubtypeAttribute1954); 

                            createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeBooleanKeyword_2_0_1(), "subtype"); 
                        

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
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:974:8: lv_subtype_2_3= 'number'
                    {
                    lv_subtype_2_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSubtypeAttribute1983); 

                            createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeNumberKeyword_2_0_2(), "subtype"); 
                        

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
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:992:8: lv_subtype_2_4= 'interval'
                    {
                    lv_subtype_2_4=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSubtypeAttribute2012); 

                            createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeIntervalKeyword_2_0_3(), "subtype"); 
                        

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
                    break;

            }


            }


            }

            match(input,27,FOLLOW_27_in_ruleSubtypeAttribute2038); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1025:1: entryRuleStateValuesAttribute returns [EObject current=null] : iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF ;
    public final EObject entryRuleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValuesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1026:2: (iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1027:2: iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateValuesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2074);
            iv_ruleStateValuesAttribute=ruleStateValuesAttribute();
            _fsp--;

             current =iv_ruleStateValuesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateValuesAttribute2084); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1034:1: ruleStateValuesAttribute returns [EObject current=null] : ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) ;
    public final EObject ruleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_numbers_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1039:6: ( ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1040:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1040:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1040:3: 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';'
            {
            match(input,34,FOLLOW_34_in_ruleStateValuesAttribute2119); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getState_valuesKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStateValuesAttribute2129); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStateValuesAttribute2139); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1052:1: ( (lv_numbers_3_0= RULE_INT ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1053:1: (lv_numbers_3_0= RULE_INT )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1053:1: (lv_numbers_3_0= RULE_INT )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1054:3: lv_numbers_3_0= RULE_INT
            	    {
            	    lv_numbers_3_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStateValuesAttribute2156); 

            	    			createLeafNode(grammarAccess.getStateValuesAttributeAccess().getNumbersINTTerminalRuleCall_3_0(), "numbers"); 
            	    		

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
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleStateValuesAttribute2172); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStateValuesAttribute2182); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1092:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1093:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1094:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2218);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();
            _fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute2228); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1101:1: ruleApplicationAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1106:6: ( ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1107:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1107:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1107:2: ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1107:2: ( (lv_key_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:1: (lv_key_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:1: (lv_key_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1109:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationAttribute2270); 

            			createLeafNode(grammarAccess.getApplicationAttributeAccess().getKeyIDTerminalRuleCall_0_0(), "key"); 
            		

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

            match(input,24,FOLLOW_24_in_ruleApplicationAttribute2285); 

                    createLeafNode(grammarAccess.getApplicationAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1135:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1136:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1136:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1137:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationAttribute2302); 

            			createLeafNode(grammarAccess.getApplicationAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
            		

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

            match(input,27,FOLLOW_27_in_ruleApplicationAttribute2317); 

                    createLeafNode(grammarAccess.getApplicationAttributeAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1171:1: entryRuleNodeSizeAttribute returns [EObject current=null] : iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF ;
    public final EObject entryRuleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSizeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1172:2: (iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1173:2: iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeSizeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2353);
            iv_ruleNodeSizeAttribute=ruleNodeSizeAttribute();
            _fsp--;

             current =iv_ruleNodeSizeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSizeAttribute2363); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1180:1: ruleNodeSizeAttribute returns [EObject current=null] : ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject ruleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_width_3_0=null;
        Token lv_height_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1185:6: ( ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1186:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1186:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1186:3: 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,35,FOLLOW_35_in_ruleNodeSizeAttribute2398); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getNode_sizeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleNodeSizeAttribute2408); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNodeSizeAttribute2418); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1198:1: ( (lv_width_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1199:1: (lv_width_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1199:1: (lv_width_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1200:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2435); 

            			createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getWidthINTTerminalRuleCall_3_0(), "width"); 
            		

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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1222:2: ( (lv_height_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1223:1: (lv_height_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1223:1: (lv_height_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1224:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2457); 

            			createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getHeightINTTerminalRuleCall_4_0(), "height"); 
            		

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

            match(input,26,FOLLOW_26_in_ruleNodeSizeAttribute2472); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleNodeSizeAttribute2482); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1262:1: entryRulePotential returns [EObject current=null] : iv_rulePotential= rulePotential EOF ;
    public final EObject entryRulePotential() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotential = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1263:2: (iv_rulePotential= rulePotential EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1264:2: iv_rulePotential= rulePotential EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialRule(), currentNode); 
            pushFollow(FOLLOW_rulePotential_in_entryRulePotential2518);
            iv_rulePotential=rulePotential();
            _fsp--;

             current =iv_rulePotential; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotential2528); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1271:1: rulePotential returns [EObject current=null] : ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) ;
    public final EObject rulePotential() throws RecognitionException {
        EObject current = null;

        EObject lv_graph_1_0 = null;

        EObject lv_model_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1276:6: ( ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1277:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1277:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1277:3: 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) )
            {
            match(input,36,FOLLOW_36_in_rulePotential2563); 

                    createLeafNode(grammarAccess.getPotentialAccess().getPotentialKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1281:1: ( (lv_graph_1_0= rulePotentialGraph ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1282:1: (lv_graph_1_0= rulePotentialGraph )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1282:1: (lv_graph_1_0= rulePotentialGraph )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1283:3: lv_graph_1_0= rulePotentialGraph
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialGraph_in_rulePotential2584);
            lv_graph_1_0=rulePotentialGraph();
            _fsp--;


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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1305:2: ( (lv_model_2_0= rulePotentialModel ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1306:1: (lv_model_2_0= rulePotentialModel )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1306:1: (lv_model_2_0= rulePotentialModel )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1307:3: lv_model_2_0= rulePotentialModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialModel_in_rulePotential2605);
            lv_model_2_0=rulePotentialModel();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1337:1: entryRulePotentialGraph returns [EObject current=null] : iv_rulePotentialGraph= rulePotentialGraph EOF ;
    public final EObject entryRulePotentialGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialGraph = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1338:2: (iv_rulePotentialGraph= rulePotentialGraph EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1339:2: iv_rulePotentialGraph= rulePotentialGraph EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialGraphRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2641);
            iv_rulePotentialGraph=rulePotentialGraph();
            _fsp--;

             current =iv_rulePotentialGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialGraph2651); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1346:1: rulePotentialGraph returns [EObject current=null] : ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) ;
    public final EObject rulePotentialGraph() throws RecognitionException {
        EObject current = null;

        Token lv_children_2_0=null;
        Token lv_parents_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1351:6: ( ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1352:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1352:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1352:2: () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1352:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1353:5: 
            {
             
                    temp=factory.create(grammarAccess.getPotentialGraphAccess().getPotentialGraphAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialGraphAccess().getPotentialGraphAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,25,FOLLOW_25_in_rulePotentialGraph2695); 

                    createLeafNode(grammarAccess.getPotentialGraphAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1367:1: ( (lv_children_2_0= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1368:1: (lv_children_2_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1368:1: (lv_children_2_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1369:3: lv_children_2_0= RULE_ID
            	    {
            	    lv_children_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2712); 

            	    			createLeafNode(grammarAccess.getPotentialGraphAccess().getChildrenIDTerminalRuleCall_2_0(), "children"); 
            	    		

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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1391:3: ( '|' ( (lv_parents_4_0= RULE_ID ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1391:5: '|' ( (lv_parents_4_0= RULE_ID ) )*
                    {
                    match(input,37,FOLLOW_37_in_rulePotentialGraph2729); 

                            createLeafNode(grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1395:1: ( (lv_parents_4_0= RULE_ID ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1396:1: (lv_parents_4_0= RULE_ID )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1396:1: (lv_parents_4_0= RULE_ID )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1397:3: lv_parents_4_0= RULE_ID
                    	    {
                    	    lv_parents_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2746); 

                    	    			createLeafNode(grammarAccess.getPotentialGraphAccess().getParentsIDTerminalRuleCall_3_1_0(), "parents"); 
                    	    		

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
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_rulePotentialGraph2764); 

                    createLeafNode(grammarAccess.getPotentialGraphAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1431:1: entryRulePotentialModel returns [EObject current=null] : iv_rulePotentialModel= rulePotentialModel EOF ;
    public final EObject entryRulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1432:2: (iv_rulePotentialModel= rulePotentialModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1433:2: iv_rulePotentialModel= rulePotentialModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialModelRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialModel_in_entryRulePotentialModel2800);
            iv_rulePotentialModel=rulePotentialModel();
            _fsp--;

             current =iv_rulePotentialModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialModel2810); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1440:1: rulePotentialModel returns [EObject current=null] : ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) ;
    public final EObject rulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1445:6: ( ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:2: () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1447:5: 
            {
             
                    temp=factory.create(grammarAccess.getPotentialModelAccess().getPotentialModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialModelAccess().getPotentialModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,15,FOLLOW_15_in_rulePotentialModel2854); 

                    createLeafNode(grammarAccess.getPotentialModelAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1461:1: ( (lv_attributes_2_0= rulePotentialAttribute ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1462:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1462:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1463:3: lv_attributes_2_0= rulePotentialAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPotentialModelAccess().getAttributesPotentialAttributeParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePotentialAttribute_in_rulePotentialModel2875);
            	    lv_attributes_2_0=rulePotentialAttribute();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_rulePotentialModel2886); 

                    createLeafNode(grammarAccess.getPotentialModelAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
             currentNode = createCompositeNode(grammarAccess.getPotentialAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2922);
            iv_rulePotentialAttribute=rulePotentialAttribute();
            _fsp--;

             current =iv_rulePotentialAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialAttribute2932); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1506:1: rulePotentialAttribute returns [EObject current=null] : this_PotentialDataAttribute_0= rulePotentialDataAttribute ;
    public final EObject rulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PotentialDataAttribute_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1511:6: (this_PotentialDataAttribute_0= rulePotentialDataAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1513:5: this_PotentialDataAttribute_0= rulePotentialDataAttribute
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialDataAttributeParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2978);
            this_PotentialDataAttribute_0=rulePotentialDataAttribute();
            _fsp--;

             
                    current = this_PotentialDataAttribute_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1529:1: entryRulePotentialDataAttribute returns [EObject current=null] : iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF ;
    public final EObject entryRulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1530:2: (iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1531:2: iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3012);
            iv_rulePotentialDataAttribute=rulePotentialDataAttribute();
            _fsp--;

             current =iv_rulePotentialDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialDataAttribute3022); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1538:1: rulePotentialDataAttribute returns [EObject current=null] : ( () 'data' '=' '(' ( (lv_items_4_0= ruleDataItemList ) ) ')' ';' ) ;
    public final EObject rulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1543:6: ( ( () 'data' '=' '(' ( (lv_items_4_0= ruleDataItemList ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1544:1: ( () 'data' '=' '(' ( (lv_items_4_0= ruleDataItemList ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1544:1: ( () 'data' '=' '(' ( (lv_items_4_0= ruleDataItemList ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1544:2: () 'data' '=' '(' ( (lv_items_4_0= ruleDataItemList ) ) ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1544:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:5: 
            {
             
                    temp=factory.create(grammarAccess.getPotentialDataAttributeAccess().getPotentialDataAttributeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getPotentialDataAttributeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,38,FOLLOW_38_in_rulePotentialDataAttribute3066); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getDataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_rulePotentialDataAttribute3076); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_rulePotentialDataAttribute3086); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1567:1: ( (lv_items_4_0= ruleDataItemList ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1568:1: (lv_items_4_0= ruleDataItemList )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1568:1: (lv_items_4_0= ruleDataItemList )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1569:3: lv_items_4_0= ruleDataItemList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getItemsDataItemListParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataItemList_in_rulePotentialDataAttribute3107);
            lv_items_4_0=ruleDataItemList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPotentialDataAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"items",
            	        		lv_items_4_0, 
            	        		"DataItemList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_rulePotentialDataAttribute3117); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_rulePotentialDataAttribute3127); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleDataItemList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1607:1: entryRuleDataItemList returns [EObject current=null] : iv_ruleDataItemList= ruleDataItemList EOF ;
    public final EObject entryRuleDataItemList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataItemList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1608:2: (iv_ruleDataItemList= ruleDataItemList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1609:2: iv_ruleDataItemList= ruleDataItemList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataItemListRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataItemList_in_entryRuleDataItemList3163);
            iv_ruleDataItemList=ruleDataItemList();
            _fsp--;

             current =iv_ruleDataItemList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataItemList3173); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataItemList


    // $ANTLR start ruleDataItemList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1616:1: ruleDataItemList returns [EObject current=null] : (this_UnstructuredDataList_0= ruleUnstructuredDataList | this_StructuredDataList_1= ruleStructuredDataList ) ;
    public final EObject ruleDataItemList() throws RecognitionException {
        EObject current = null;

        EObject this_UnstructuredDataList_0 = null;

        EObject this_StructuredDataList_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1621:6: ( (this_UnstructuredDataList_0= ruleUnstructuredDataList | this_StructuredDataList_1= ruleStructuredDataList ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1622:1: (this_UnstructuredDataList_0= ruleUnstructuredDataList | this_StructuredDataList_1= ruleStructuredDataList )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1622:1: (this_UnstructuredDataList_0= ruleUnstructuredDataList | this_StructuredDataList_1= ruleStructuredDataList )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||LA18_0==RULE_INT||LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1622:1: (this_UnstructuredDataList_0= ruleUnstructuredDataList | this_StructuredDataList_1= ruleStructuredDataList )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1623:5: this_UnstructuredDataList_0= ruleUnstructuredDataList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataItemListAccess().getUnstructuredDataListParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnstructuredDataList_in_ruleDataItemList3220);
                    this_UnstructuredDataList_0=ruleUnstructuredDataList();
                    _fsp--;

                     
                            current = this_UnstructuredDataList_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:5: this_StructuredDataList_1= ruleStructuredDataList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataItemListAccess().getStructuredDataListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructuredDataList_in_ruleDataItemList3247);
                    this_StructuredDataList_1=ruleStructuredDataList();
                    _fsp--;

                     
                            current = this_StructuredDataList_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataItemList


    // $ANTLR start entryRuleUnstructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1649:1: entryRuleUnstructuredDataList returns [EObject current=null] : iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF ;
    public final EObject entryRuleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnstructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1650:2: (iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1651:2: iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnstructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3282);
            iv_ruleUnstructuredDataList=ruleUnstructuredDataList();
            _fsp--;

             current =iv_ruleUnstructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnstructuredDataList3292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnstructuredDataList


    // $ANTLR start ruleUnstructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:1: ruleUnstructuredDataList returns [EObject current=null] : ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) ;
    public final EObject ruleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1663:6: ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1664:1: ( () ( (lv_list_1_0= ruleFloatDataList ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1664:1: ( () ( (lv_list_1_0= ruleFloatDataList ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1664:2: () ( (lv_list_1_0= ruleFloatDataList ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1664:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1665:5: 
            {
             
                    temp=factory.create(grammarAccess.getUnstructuredDataListAccess().getUnstructuredDataListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getUnstructuredDataListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1675:2: ( (lv_list_1_0= ruleFloatDataList ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1676:1: (lv_list_1_0= ruleFloatDataList )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1676:1: (lv_list_1_0= ruleFloatDataList )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1677:3: lv_list_1_0= ruleFloatDataList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getListFloatDataListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFloatDataList_in_ruleUnstructuredDataList3347);
            lv_list_1_0=ruleFloatDataList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnstructuredDataListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"list",
            	        		lv_list_1_0, 
            	        		"FloatDataList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnstructuredDataList


    // $ANTLR start entryRuleStructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1707:1: entryRuleStructuredDataList returns [EObject current=null] : iv_ruleStructuredDataList= ruleStructuredDataList EOF ;
    public final EObject entryRuleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1708:2: (iv_ruleStructuredDataList= ruleStructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1709:2: iv_ruleStructuredDataList= ruleStructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3383);
            iv_ruleStructuredDataList=ruleStructuredDataList();
            _fsp--;

             current =iv_ruleStructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredDataList3393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStructuredDataList


    // $ANTLR start ruleStructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1716:1: ruleStructuredDataList returns [EObject current=null] : ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ ) ')' ) ;
    public final EObject ruleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1721:6: ( ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1722:1: ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1722:1: ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1722:2: () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1722:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1723:5: 
            {
             
                    temp=factory.create(grammarAccess.getStructuredDataListAccess().getStructuredDataListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStructuredDataListAccess().getStructuredDataListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,25,FOLLOW_25_in_ruleStructuredDataList3437); 

                    createLeafNode(grammarAccess.getStructuredDataListAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1737:1: ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1737:1: ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )+ )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1737:2: ( (lv_list_2_0= ruleFloatDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1737:2: ( (lv_list_2_0= ruleFloatDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1738:1: (lv_list_2_0= ruleFloatDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1738:1: (lv_list_2_0= ruleFloatDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1739:3: lv_list_2_0= ruleFloatDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructuredDataListAccess().getListFloatDataListParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3459);
                    lv_list_2_0=ruleFloatDataList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructuredDataListRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"list",
                    	        		lv_list_2_0, 
                    	        		"FloatDataList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1762:6: ( (lv_items_3_0= ruleStructuredDataList ) )+
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1762:6: ( (lv_items_3_0= ruleStructuredDataList ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1763:1: (lv_items_3_0= ruleStructuredDataList )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1763:1: (lv_items_3_0= ruleStructuredDataList )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1764:3: lv_items_3_0= ruleStructuredDataList
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStructuredDataListAccess().getItemsStructuredDataListParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStructuredDataList_in_ruleStructuredDataList3486);
                    	    lv_items_3_0=ruleStructuredDataList();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStructuredDataListRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"items",
                    	    	        		lv_items_3_0, 
                    	    	        		"StructuredDataList", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleStructuredDataList3498); 

                    createLeafNode(grammarAccess.getStructuredDataListAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructuredDataList


    // $ANTLR start entryRuleFloatDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1798:1: entryRuleFloatDataList returns [EObject current=null] : iv_ruleFloatDataList= ruleFloatDataList EOF ;
    public final EObject entryRuleFloatDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1799:2: (iv_ruleFloatDataList= ruleFloatDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1800:2: iv_ruleFloatDataList= ruleFloatDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3534);
            iv_ruleFloatDataList=ruleFloatDataList();
            _fsp--;

             current =iv_ruleFloatDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataList3544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatDataList


    // $ANTLR start ruleFloatDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1807:1: ruleFloatDataList returns [EObject current=null] : ( () ( (lv_items_1_0= ruleDOUBLE ) )* ) ;
    public final EObject ruleFloatDataList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1812:6: ( ( () ( (lv_items_1_0= ruleDOUBLE ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1813:1: ( () ( (lv_items_1_0= ruleDOUBLE ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1813:1: ( () ( (lv_items_1_0= ruleDOUBLE ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1813:2: () ( (lv_items_1_0= ruleDOUBLE ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1813:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1814:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatDataListAccess().getFloatDataListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatDataListAccess().getFloatDataListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1824:2: ( (lv_items_1_0= ruleDOUBLE ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_INT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1825:1: (lv_items_1_0= ruleDOUBLE )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1825:1: (lv_items_1_0= ruleDOUBLE )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1826:3: lv_items_1_0= ruleDOUBLE
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFloatDataListAccess().getItemsDOUBLEParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOUBLE_in_ruleFloatDataList3599);
            	    lv_items_1_0=ruleDOUBLE();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFloatDataListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_1_0, 
            	    	        		"DOUBLE", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatDataList


    // $ANTLR start entryRuleMeanExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1858:1: entryRuleMeanExpression returns [String current=null] : iv_ruleMeanExpression= ruleMeanExpression EOF ;
    public final String entryRuleMeanExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1859:2: (iv_ruleMeanExpression= ruleMeanExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1860:2: iv_ruleMeanExpression= ruleMeanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3639);
            iv_ruleMeanExpression=ruleMeanExpression();
            _fsp--;

             current =iv_ruleMeanExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanExpression3650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMeanExpression


    // $ANTLR start ruleMeanExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1867:1: ruleMeanExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleMeanExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MeanTerm_0 = null;

        AntlrDatatypeRuleToken this_MeanTerm_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1872:6: ( (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1873:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1873:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1874:5: this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3697);
            this_MeanTerm_0=ruleMeanTerm();
            _fsp--;


            		current.merge(this_MeanTerm_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1884:1: (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1885:2: kw= '+' this_MeanTerm_2= ruleMeanTerm
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,39,FOLLOW_39_in_ruleMeanExpression3716); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getMeanExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	        
            	     
            	            currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_1_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3738);
            	    this_MeanTerm_2=ruleMeanTerm();
            	    _fsp--;


            	    		current.merge(this_MeanTerm_2);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMeanExpression


    // $ANTLR start entryRuleMeanTerm
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1909:1: entryRuleMeanTerm returns [String current=null] : iv_ruleMeanTerm= ruleMeanTerm EOF ;
    public final String entryRuleMeanTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1910:2: (iv_ruleMeanTerm= ruleMeanTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1911:2: iv_ruleMeanTerm= ruleMeanTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3786);
            iv_ruleMeanTerm=ruleMeanTerm();
            _fsp--;

             current =iv_ruleMeanTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanTerm3797); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1918:1: ruleMeanTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMeanTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_DOUBLE_0 = null;

        AntlrDatatypeRuleToken this_DOUBLE_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1923:6: ( (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==13) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_EXT_INT) ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4==40) ) {
                            alt23=2;
                        }
                        else if ( (LA23_4==EOF||LA23_4==39) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 23, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_3==RULE_INT) ) {
                        int LA23_5 = input.LA(4);

                        if ( (LA23_5==40) ) {
                            alt23=2;
                        }
                        else if ( (LA23_5==EOF||LA23_5==39) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 23, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 23, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1924:1: (this_DOUBLE_0= ruleDOUBLE | (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1925:5: this_DOUBLE_0= ruleDOUBLE
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getDOUBLEParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeanTerm3844);
                    this_DOUBLE_0=ruleDOUBLE();
                    _fsp--;


                    		current.merge(this_DOUBLE_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1936:6: (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1936:6: (this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1937:5: this_DOUBLE_1= ruleDOUBLE kw= '*' this_ID_3= RULE_ID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getDOUBLEParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeanTerm3878);
                    this_DOUBLE_1=ruleDOUBLE();
                    _fsp--;


                    		current.merge(this_DOUBLE_1);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleMeanTerm3896); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getMeanTermAccess().getAsteriskKeyword_1_1(), null); 
                        
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm3911); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1961:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm3938); 

                    		current.merge(this_ID_4);
                        
                     
                        createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleModelNodesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1978:1: entryRuleModelNodesAttribute returns [EObject current=null] : iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF ;
    public final EObject entryRuleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1979:2: (iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1980:2: iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelNodesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute3985);
            iv_ruleModelNodesAttribute=ruleModelNodesAttribute();
            _fsp--;

             current =iv_ruleModelNodesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodesAttribute3995); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1987:1: ruleModelNodesAttribute returns [EObject current=null] : ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) ;
    public final EObject ruleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_configurations_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1992:6: ( ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1993:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1993:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1993:2: () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1993:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1994:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelNodesAttributeAccess().getModelNodesAttributeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelNodesAttributeAccess().getModelNodesAttributeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,41,FOLLOW_41_in_ruleModelNodesAttribute4039); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getModel_nodesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelNodesAttribute4049); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelNodesAttribute4059); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2016:1: ( (lv_configurations_4_0= RULE_ID ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2017:1: (lv_configurations_4_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2017:1: (lv_configurations_4_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2018:3: lv_configurations_4_0= RULE_ID
            	    {
            	    lv_configurations_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodesAttribute4076); 

            	    			createLeafNode(grammarAccess.getModelNodesAttributeAccess().getConfigurationsIDTerminalRuleCall_4_0(), "configurations"); 
            	    		

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
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleModelNodesAttribute4092); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelNodesAttribute4102); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2056:1: entryRuleSamplesAttribute returns [EObject current=null] : iv_ruleSamplesAttribute= ruleSamplesAttribute EOF ;
    public final EObject entryRuleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:2: (iv_ruleSamplesAttribute= ruleSamplesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2058:2: iv_ruleSamplesAttribute= ruleSamplesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSamplesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4138);
            iv_ruleSamplesAttribute=ruleSamplesAttribute();
            _fsp--;

             current =iv_ruleSamplesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplesAttribute4148); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2065:1: ruleSamplesAttribute returns [EObject current=null] : ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2070:6: ( ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2071:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2071:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2071:3: 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';'
            {
            match(input,42,FOLLOW_42_in_ruleSamplesAttribute4183); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getSamples_per_intervalKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSamplesAttribute4193); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2079:1: ( (lv_value_2_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2080:1: (lv_value_2_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2080:1: (lv_value_2_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2081:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplesAttribute4210); 

            			createLeafNode(grammarAccess.getSamplesAttributeAccess().getValueINTTerminalRuleCall_2_0(), "value"); 
            		

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

            match(input,27,FOLLOW_27_in_ruleSamplesAttribute4225); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2115:1: entryRuleModelDataAttribute returns [EObject current=null] : iv_ruleModelDataAttribute= ruleModelDataAttribute EOF ;
    public final EObject entryRuleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2116:2: (iv_ruleModelDataAttribute= ruleModelDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2117:2: iv_ruleModelDataAttribute= ruleModelDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4261);
            iv_ruleModelDataAttribute=ruleModelDataAttribute();
            _fsp--;

             current =iv_ruleModelDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDataAttribute4271); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2124:1: ruleModelDataAttribute returns [EObject current=null] : ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' ) ;
    public final EObject ruleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2129:6: ( ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2130:1: ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2130:1: ( () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2130:2: () 'model_data' '=' '(' ( (lv_sequence_4_0= ruleExpressionSequence ) ) ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2130:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2131:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelDataAttributeAccess().getModelDataAttributeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelDataAttributeAccess().getModelDataAttributeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,43,FOLLOW_43_in_ruleModelDataAttribute4315); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getModel_dataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelDataAttribute4325); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelDataAttribute4335); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2153:1: ( (lv_sequence_4_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2154:1: (lv_sequence_4_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2154:1: (lv_sequence_4_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2155:3: lv_sequence_4_0= ruleExpressionSequence
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelDataAttributeAccess().getSequenceExpressionSequenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4356);
            lv_sequence_4_0=ruleExpressionSequence();
            _fsp--;


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

            match(input,26,FOLLOW_26_in_ruleModelDataAttribute4366); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelDataAttribute4376); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2193:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2194:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2195:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4412);
            iv_ruleClassDefinition=ruleClassDefinition();
            _fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition4422); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2202:1: ruleClassDefinition returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2207:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2208:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2208:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2208:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}'
            {
            match(input,44,FOLLOW_44_in_ruleClassDefinition4457); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getClassKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2213:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2213:1: (lv_name_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition4474); 

            			createLeafNode(grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

            match(input,15,FOLLOW_15_in_ruleClassDefinition4489); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2240:1: ( (lv_elements_3_0= ruleClassElement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=17 && LA25_0<=23)||(LA25_0>=28 && LA25_0<=30)||(LA25_0>=34 && LA25_0<=36)||(LA25_0>=44 && LA25_0<=45)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2241:1: (lv_elements_3_0= ruleClassElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2241:1: (lv_elements_3_0= ruleClassElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2242:3: lv_elements_3_0= ruleClassElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getClassDefinitionAccess().getElementsClassElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClassDefinition4510);
            	    lv_elements_3_0=ruleClassElement();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleClassDefinition4521); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2276:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2277:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2278:2: iv_ruleClassElement= ruleClassElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement4557);
            iv_ruleClassElement=ruleClassElement();
            _fsp--;

             current =iv_ruleClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement4567); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2285:1: ruleClassElement returns [EObject current=null] : (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_DomainElement_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_ClassInstance_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2290:6: ( (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2291:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2291:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 36:
            case 44:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
            case 23:
            case 28:
            case 29:
            case 30:
            case 34:
            case 35:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2291:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2292:5: this_DomainElement_0= ruleDomainElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getDomainElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleClassElement4614);
                    this_DomainElement_0=ruleDomainElement();
                    _fsp--;

                     
                            current = this_DomainElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2302:5: this_Attribute_1= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleClassElement4641);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2312:5: this_ClassInstance_2= ruleClassInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getClassInstanceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassInstance_in_ruleClassElement4668);
                    this_ClassInstance_2=ruleClassInstance();
                    _fsp--;

                     
                            current = this_ClassInstance_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2328:1: entryRuleClassInstance returns [EObject current=null] : iv_ruleClassInstance= ruleClassInstance EOF ;
    public final EObject entryRuleClassInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInstance = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2329:2: (iv_ruleClassInstance= ruleClassInstance EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2330:2: iv_ruleClassInstance= ruleClassInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassInstance_in_entryRuleClassInstance4703);
            iv_ruleClassInstance=ruleClassInstance();
            _fsp--;

             current =iv_ruleClassInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassInstance4713); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2337:1: ruleClassInstance returns [EObject current=null] : ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) ;
    public final EObject ruleClassInstance() throws RecognitionException {
        EObject current = null;

        Token lv_instanceName_1_0=null;
        Token lv_className_3_0=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;

        EObject lv_attributes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2342:6: ( ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2343:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2343:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2343:3: 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}'
            {
            match(input,45,FOLLOW_45_in_ruleClassInstance4748); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2347:1: ( (lv_instanceName_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2348:1: (lv_instanceName_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2348:1: (lv_instanceName_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:3: lv_instanceName_1_0= RULE_ID
            {
            lv_instanceName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance4765); 

            			createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceNameIDTerminalRuleCall_1_0(), "instanceName"); 
            		

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

            match(input,46,FOLLOW_46_in_ruleClassInstance4780); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getColonKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2375:1: ( (lv_className_3_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2376:1: (lv_className_3_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2376:1: (lv_className_3_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2377:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance4797); 

            			createLeafNode(grammarAccess.getClassInstanceAccess().getClassNameIDTerminalRuleCall_3_0(), "className"); 
            		

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

            match(input,25,FOLLOW_25_in_ruleClassInstance4812); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2403:1: ( (lv_input_5_0= ruleInputBindings ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2404:1: (lv_input_5_0= ruleInputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2404:1: (lv_input_5_0= ruleInputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2405:3: lv_input_5_0= ruleInputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getInputInputBindingsParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInputBindings_in_ruleClassInstance4833);
                    lv_input_5_0=ruleInputBindings();
                    _fsp--;


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
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2427:3: ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2427:5: ';' ( (lv_output_7_0= ruleOutputBindings ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleClassInstance4845); 

                            createLeafNode(grammarAccess.getClassInstanceAccess().getSemicolonKeyword_6_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2431:1: ( (lv_output_7_0= ruleOutputBindings ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: (lv_output_7_0= ruleOutputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: (lv_output_7_0= ruleOutputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2433:3: lv_output_7_0= ruleOutputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getOutputOutputBindingsParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOutputBindings_in_ruleClassInstance4866);
                    lv_output_7_0=ruleOutputBindings();
                    _fsp--;


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
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleClassInstance4878); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getRightParenthesisKeyword_7(), null); 
                
            match(input,15,FOLLOW_15_in_ruleClassInstance4888); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2463:1: ( (lv_attributes_10_0= ruleNodeAttributes ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2464:1: (lv_attributes_10_0= ruleNodeAttributes )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2464:1: (lv_attributes_10_0= ruleNodeAttributes )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2465:3: lv_attributes_10_0= ruleNodeAttributes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getAttributesNodeAttributesParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNodeAttributes_in_ruleClassInstance4909);
            lv_attributes_10_0=ruleNodeAttributes();
            _fsp--;


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

            match(input,16,FOLLOW_16_in_ruleClassInstance4919); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getRightCurlyBracketKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2499:1: entryRuleInputBindings returns [EObject current=null] : iv_ruleInputBindings= ruleInputBindings EOF ;
    public final EObject entryRuleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2500:2: (iv_ruleInputBindings= ruleInputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2501:2: iv_ruleInputBindings= ruleInputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBindings_in_entryRuleInputBindings4955);
            iv_ruleInputBindings=ruleInputBindings();
            _fsp--;

             current =iv_ruleInputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBindings4965); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2508:1: ruleInputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) ;
    public final EObject ruleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2513:6: ( ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2514:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2514:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2514:2: ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2514:2: ( (lv_lhs_0_0= ruleInputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2515:1: (lv_lhs_0_0= ruleInputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2515:1: (lv_lhs_0_0= ruleInputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2516:3: lv_lhs_0_0= ruleInputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBinding_in_ruleInputBindings5011);
            lv_lhs_0_0=ruleInputBinding();
            _fsp--;


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

            match(input,47,FOLLOW_47_in_ruleInputBindings5021); 

                    createLeafNode(grammarAccess.getInputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2542:1: ( (lv_rhs_2_0= ruleInputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2543:1: (lv_rhs_2_0= ruleInputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2543:1: (lv_rhs_2_0= ruleInputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2544:3: lv_rhs_2_0= ruleInputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBindings_in_ruleInputBindings5042);
            lv_rhs_2_0=ruleInputBindings();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2574:1: entryRuleInputBinding returns [EObject current=null] : iv_ruleInputBinding= ruleInputBinding EOF ;
    public final EObject entryRuleInputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2575:2: (iv_ruleInputBinding= ruleInputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2576:2: iv_ruleInputBinding= ruleInputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBinding_in_entryRuleInputBinding5078);
            iv_ruleInputBinding=ruleInputBinding();
            _fsp--;

             current =iv_ruleInputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBinding5088); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2583:1: ruleInputBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token lv_actual_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2588:6: ( ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2589:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2589:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2589:2: ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2589:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2590:1: (lv_formal_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2590:1: (lv_formal_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2591:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5130); 

            			createLeafNode(grammarAccess.getInputBindingAccess().getFormalIDTerminalRuleCall_0_0(), "formal"); 
            		

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

            match(input,24,FOLLOW_24_in_ruleInputBinding5145); 

                    createLeafNode(grammarAccess.getInputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2617:1: ( (lv_actual_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2618:1: (lv_actual_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2618:1: (lv_actual_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2619:3: lv_actual_2_0= RULE_ID
            {
            lv_actual_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5162); 

            			createLeafNode(grammarAccess.getInputBindingAccess().getActualIDTerminalRuleCall_2_0(), "actual"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2649:1: entryRuleOutputBindings returns [EObject current=null] : iv_ruleOutputBindings= ruleOutputBindings EOF ;
    public final EObject entryRuleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2650:2: (iv_ruleOutputBindings= ruleOutputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2651:2: iv_ruleOutputBindings= ruleOutputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5203);
            iv_ruleOutputBindings=ruleOutputBindings();
            _fsp--;

             current =iv_ruleOutputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBindings5213); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2658:1: ruleOutputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) ;
    public final EObject ruleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2663:6: ( ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2664:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2664:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2664:2: ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2664:2: ( (lv_lhs_0_0= ruleOutputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2665:1: (lv_lhs_0_0= ruleOutputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2665:1: (lv_lhs_0_0= ruleOutputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2666:3: lv_lhs_0_0= ruleOutputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBinding_in_ruleOutputBindings5259);
            lv_lhs_0_0=ruleOutputBinding();
            _fsp--;


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

            match(input,47,FOLLOW_47_in_ruleOutputBindings5269); 

                    createLeafNode(grammarAccess.getOutputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2692:1: ( (lv_rhs_2_0= ruleOutputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2693:1: (lv_rhs_2_0= ruleOutputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2693:1: (lv_rhs_2_0= ruleOutputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2694:3: lv_rhs_2_0= ruleOutputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBindings_in_ruleOutputBindings5290);
            lv_rhs_2_0=ruleOutputBindings();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2724:1: entryRuleOutputBinding returns [EObject current=null] : iv_ruleOutputBinding= ruleOutputBinding EOF ;
    public final EObject entryRuleOutputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2725:2: (iv_ruleOutputBinding= ruleOutputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2726:2: iv_ruleOutputBinding= ruleOutputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5326);
            iv_ruleOutputBinding=ruleOutputBinding();
            _fsp--;

             current =iv_ruleOutputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBinding5336); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2733:1: ruleOutputBinding returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2738:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2739:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2739:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2739:2: ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2739:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2740:1: (lv_actual_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2740:1: (lv_actual_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2741:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5378); 

            			createLeafNode(grammarAccess.getOutputBindingAccess().getActualIDTerminalRuleCall_0_0(), "actual"); 
            		

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

            match(input,24,FOLLOW_24_in_ruleOutputBinding5393); 

                    createLeafNode(grammarAccess.getOutputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2767:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2768:1: (lv_formal_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2768:1: (lv_formal_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2769:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5410); 

            			createLeafNode(grammarAccess.getOutputBindingAccess().getFormalIDTerminalRuleCall_2_0(), "formal"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2799:1: entryRuleNodeAttributes returns [EObject current=null] : iv_ruleNodeAttributes= ruleNodeAttributes EOF ;
    public final EObject entryRuleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributes = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2800:2: (iv_ruleNodeAttributes= ruleNodeAttributes EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2801:2: iv_ruleNodeAttributes= ruleNodeAttributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeAttributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5451);
            iv_ruleNodeAttributes=ruleNodeAttributes();
            _fsp--;

             current =iv_ruleNodeAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttributes5461); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2808:1: ruleNodeAttributes returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) ;
    public final EObject ruleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;

        EObject this_ApplicationAttribute_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2813:6: ( (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2814:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2814:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2814:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2815:5: this_LabelAttribute_0= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getLabelAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5508);
                    this_LabelAttribute_0=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2825:5: this_PositionAttribute_1= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getPositionAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5535);
                    this_PositionAttribute_1=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2835:5: this_ApplicationAttribute_2= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getApplicationAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5562);
                    this_ApplicationAttribute_2=ruleApplicationAttribute();
                    _fsp--;

                     
                            current = this_ApplicationAttribute_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2851:1: entryRuleExpressionSequence returns [EObject current=null] : iv_ruleExpressionSequence= ruleExpressionSequence EOF ;
    public final EObject entryRuleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSequence = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2852:2: (iv_ruleExpressionSequence= ruleExpressionSequence EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2853:2: iv_ruleExpressionSequence= ruleExpressionSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence5597);
            iv_ruleExpressionSequence=ruleExpressionSequence();
            _fsp--;

             current =iv_ruleExpressionSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSequence5607); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2860:1: ruleExpressionSequence returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2865:6: ( ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:2: () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2867:5: 
            {
             
                    temp=factory.create(grammarAccess.getExpressionSequenceAccess().getExpressionSequenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionSequenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:2: ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||(LA31_0>=RULE_ID && LA31_0<=RULE_BOOLEAN)||LA31_0==62||(LA31_0>=64 && LA31_0<=101)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:3: ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2877:3: ( (lv_expressions_1_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2878:1: (lv_expressions_1_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2878:1: (lv_expressions_1_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2879:3: lv_expressions_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence5663);
                    lv_expressions_1_0=ruleExpression();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2901:2: ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==47) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2901:4: ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    match(input,47,FOLLOW_47_in_ruleExpressionSequence5674); 

                    	            createLeafNode(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2905:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2906:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2906:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2907:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence5695);
                    	    lv_expressions_3_0=ruleExpression();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2937:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2938:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2939:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5735);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5745); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2946:1: ruleExpression returns [EObject current=null] : (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_assignmentOpExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2951:6: ( (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2952:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2952:1: (this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2953:5: this_assignmentOpExpression_0= ruleassignmentOpExpression ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAssignmentOpExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_ruleExpression5792);
            this_assignmentOpExpression_0=ruleassignmentOpExpression();
            _fsp--;

             
                    current = this_assignmentOpExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2961:1: ( () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2961:2: () ( (lv_op_2_0= '=' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2961:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2977:2: ( (lv_op_2_0= '=' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2978:1: (lv_op_2_0= '=' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2978:1: (lv_op_2_0= '=' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2979:3: lv_op_2_0= '='
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleExpression5819); 

                            createLeafNode(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0(), "op"); 
                        

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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2998:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2999:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2999:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3000:3: lv_right_3_0= ruleorExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleorExpression_in_ruleExpression5853);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3030:1: entryRuleassignmentOpExpression returns [EObject current=null] : iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF ;
    public final EObject entryRuleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentOpExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3031:2: (iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3032:2: iv_ruleassignmentOpExpression= ruleassignmentOpExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression5891);
            iv_ruleassignmentOpExpression=ruleassignmentOpExpression();
            _fsp--;

             current =iv_ruleassignmentOpExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignmentOpExpression5901); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3039:1: ruleassignmentOpExpression returns [EObject current=null] : (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleassignmentOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_orExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3044:6: ( (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3045:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3045:1: (this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3046:5: this_orExpression_0= ruleorExpression ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOrExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression5948);
            this_orExpression_0=ruleorExpression();
            _fsp--;

             
                    current = this_orExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3054:1: ( () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=48 && LA33_0<=52)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3054:2: () ( (lv_op_2_0= ruleassignOp ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3054:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3055:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3070:2: ( (lv_op_2_0= ruleassignOp ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3071:1: (lv_op_2_0= ruleassignOp )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3071:1: (lv_op_2_0= ruleassignOp )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3072:3: lv_op_2_0= ruleassignOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getOpAssignOpParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleassignOp_in_ruleassignmentOpExpression5978);
                    lv_op_2_0=ruleassignOp();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3094:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3095:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3095:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3096:3: lv_right_3_0= ruleorExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleorExpression_in_ruleassignmentOpExpression5999);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3126:1: entryRuleassignOp returns [String current=null] : iv_ruleassignOp= ruleassignOp EOF ;
    public final String entryRuleassignOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignOp = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3127:2: (iv_ruleassignOp= ruleassignOp EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3128:2: iv_ruleassignOp= ruleassignOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleassignOp_in_entryRuleassignOp6038);
            iv_ruleassignOp=ruleassignOp();
            _fsp--;

             current =iv_ruleassignOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignOp6049); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3135:1: ruleassignOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) ;
    public final AntlrDatatypeRuleToken ruleassignOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3140:6: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt34=1;
                }
                break;
            case 49:
                {
                alt34=2;
                }
                break;
            case 50:
                {
                alt34=3;
                }
                break;
            case 51:
                {
                alt34=4;
                }
                break;
            case 52:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3141:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3142:2: kw= '+='
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleassignOp6087); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAssignOpAccess().getPlusSignEqualsSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3149:2: kw= '-='
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleassignOp6106); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAssignOpAccess().getHyphenMinusEqualsSignKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3156:2: kw= '*='
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleassignOp6125); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAssignOpAccess().getAsteriskEqualsSignKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3163:2: kw= '/='
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleassignOp6144); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAssignOpAccess().getSolidusEqualsSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3170:2: kw= '%='
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleassignOp6163); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAssignOpAccess().getPercentSignEqualsSignKeyword_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3183:1: entryRuleorExpression returns [EObject current=null] : iv_ruleorExpression= ruleorExpression EOF ;
    public final EObject entryRuleorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleorExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3184:2: (iv_ruleorExpression= ruleorExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3185:2: iv_ruleorExpression= ruleorExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleorExpression_in_entryRuleorExpression6203);
            iv_ruleorExpression=ruleorExpression();
            _fsp--;

             current =iv_ruleorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorExpression6213); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3192:1: ruleorExpression returns [EObject current=null] : (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) ;
    public final EObject ruleorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_andExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3197:6: ( (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3198:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3198:1: (this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3199:5: this_andExpression_0= ruleandExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleandExpression_in_ruleorExpression6260);
            this_andExpression_0=ruleandExpression();
            _fsp--;

             
                    current = this_andExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3207:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3207:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleorExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3207:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3208:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3223:2: ( (lv_op_2_0= '||' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3224:1: (lv_op_2_0= '||' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3224:1: (lv_op_2_0= '||' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3225:3: lv_op_2_0= '||'
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleorExpression6287); 

                            createLeafNode(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), "op"); 
                        

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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3244:2: ( (lv_right_3_0= ruleorExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3245:1: (lv_right_3_0= ruleorExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3245:1: (lv_right_3_0= ruleorExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3246:3: lv_right_3_0= ruleorExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleorExpression_in_ruleorExpression6321);
                    lv_right_3_0=ruleorExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3276:1: entryRuleandExpression returns [EObject current=null] : iv_ruleandExpression= ruleandExpression EOF ;
    public final EObject entryRuleandExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3277:2: (iv_ruleandExpression= ruleandExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3278:2: iv_ruleandExpression= ruleandExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleandExpression_in_entryRuleandExpression6359);
            iv_ruleandExpression=ruleandExpression();
            _fsp--;

             current =iv_ruleandExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpression6369); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3285:1: ruleandExpression returns [EObject current=null] : (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) ;
    public final EObject ruleandExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_relationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3290:6: ( (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3291:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3291:1: (this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3292:5: this_relationalExpression_0= rulerelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulerelationalExpression_in_ruleandExpression6416);
            this_relationalExpression_0=rulerelationalExpression();
            _fsp--;

             
                    current = this_relationalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3300:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3300:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleandExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3300:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3301:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3316:2: ( (lv_op_2_0= '&&' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3317:1: (lv_op_2_0= '&&' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3317:1: (lv_op_2_0= '&&' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3318:3: lv_op_2_0= '&&'
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleandExpression6443); 

                            createLeafNode(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0(), "op"); 
                        

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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3337:2: ( (lv_right_3_0= ruleandExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3338:1: (lv_right_3_0= ruleandExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3338:1: (lv_right_3_0= ruleandExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3339:3: lv_right_3_0= ruleandExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleandExpression_in_ruleandExpression6477);
                    lv_right_3_0=ruleandExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3369:1: entryRulerelationalExpression returns [EObject current=null] : iv_rulerelationalExpression= rulerelationalExpression EOF ;
    public final EObject entryRulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelationalExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3370:2: (iv_rulerelationalExpression= rulerelationalExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3371:2: iv_rulerelationalExpression= rulerelationalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression6515);
            iv_rulerelationalExpression=rulerelationalExpression();
            _fsp--;

             current =iv_rulerelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerelationalExpression6525); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3378:1: rulerelationalExpression returns [EObject current=null] : (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) ;
    public final EObject rulerelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_additiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3383:6: ( (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3384:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3384:1: (this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3385:5: this_additiveExpression_0= ruleadditiveExpression ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleadditiveExpression_in_rulerelationalExpression6572);
            this_additiveExpression_0=ruleadditiveExpression();
            _fsp--;

             
                    current = this_additiveExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3393:1: ( () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=55 && LA37_0<=61)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3393:2: () ( (lv_op_2_0= rulerelOps ) ) ( (lv_right_3_0= rulerelationalExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3393:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3394:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3409:2: ( (lv_op_2_0= rulerelOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3410:1: (lv_op_2_0= rulerelOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3410:1: (lv_op_2_0= rulerelOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3411:3: lv_op_2_0= rulerelOps
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelOpsParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulerelOps_in_rulerelationalExpression6602);
                    lv_op_2_0=rulerelOps();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3433:2: ( (lv_right_3_0= rulerelationalExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3434:1: (lv_right_3_0= rulerelationalExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3434:1: (lv_right_3_0= rulerelationalExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3435:3: lv_right_3_0= rulerelationalExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulerelationalExpression_in_rulerelationalExpression6623);
                    lv_right_3_0=rulerelationalExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3465:1: entryRulerelOps returns [String current=null] : iv_rulerelOps= rulerelOps EOF ;
    public final String entryRulerelOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3466:2: (iv_rulerelOps= rulerelOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3467:2: iv_rulerelOps= rulerelOps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelOpsRule(), currentNode); 
            pushFollow(FOLLOW_rulerelOps_in_entryRulerelOps6662);
            iv_rulerelOps=rulerelOps();
            _fsp--;

             current =iv_rulerelOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerelOps6673); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3474:1: rulerelOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulerelOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3479:6: ( (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3480:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3480:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )
            int alt38=7;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt38=1;
                }
                break;
            case 56:
                {
                alt38=2;
                }
                break;
            case 57:
                {
                alt38=3;
                }
                break;
            case 58:
                {
                alt38=4;
                }
                break;
            case 59:
                {
                alt38=5;
                }
                break;
            case 60:
                {
                alt38=6;
                }
                break;
            case 61:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3480:1: (kw= '!=' | kw= '==' | kw= '<=' | kw= '<>' | kw= '>=' | kw= '<' | kw= '>' )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3481:2: kw= '!='
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_rulerelOps6711); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getExclamationMarkEqualsSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3488:2: kw= '=='
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_rulerelOps6730); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getEqualsSignEqualsSignKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3495:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_rulerelOps6749); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignEqualsSignKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3502:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_rulerelOps6768); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3509:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_rulerelOps6787); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getGreaterThanSignEqualsSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3516:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FOLLOW_60_in_rulerelOps6806); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getLessThanSignKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3523:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_rulerelOps6825); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getRelOpsAccess().getGreaterThanSignKeyword_6(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3536:1: entryRuleadditiveExpression returns [EObject current=null] : iv_ruleadditiveExpression= ruleadditiveExpression EOF ;
    public final EObject entryRuleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditiveExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3537:2: (iv_ruleadditiveExpression= ruleadditiveExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3538:2: iv_ruleadditiveExpression= ruleadditiveExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditiveExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression6865);
            iv_ruleadditiveExpression=ruleadditiveExpression();
            _fsp--;

             current =iv_ruleadditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleadditiveExpression6875); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3545:1: ruleadditiveExpression returns [EObject current=null] : (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) ;
    public final EObject ruleadditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_multiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3550:6: ( (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3551:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3551:1: (this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3552:5: this_multiplicativeExpression_0= rulemultiplicativeExpression ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression6922);
            this_multiplicativeExpression_0=rulemultiplicativeExpression();
            _fsp--;

             
                    current = this_multiplicativeExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3560:1: ( () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39||LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3560:2: () ( (lv_op_2_0= rulearithOps ) ) ( (lv_right_3_0= ruleadditiveExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3560:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3561:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3576:2: ( (lv_op_2_0= rulearithOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3577:1: (lv_op_2_0= rulearithOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3577:1: (lv_op_2_0= rulearithOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3578:3: lv_op_2_0= rulearithOps
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpArithOpsParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulearithOps_in_ruleadditiveExpression6952);
                    lv_op_2_0=rulearithOps();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3600:2: ( (lv_right_3_0= ruleadditiveExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3601:1: (lv_right_3_0= ruleadditiveExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3601:1: (lv_right_3_0= ruleadditiveExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3602:3: lv_right_3_0= ruleadditiveExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression6973);
                    lv_right_3_0=ruleadditiveExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3632:1: entryRulearithOps returns [String current=null] : iv_rulearithOps= rulearithOps EOF ;
    public final String entryRulearithOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearithOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3633:2: (iv_rulearithOps= rulearithOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3634:2: iv_rulearithOps= rulearithOps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArithOpsRule(), currentNode); 
            pushFollow(FOLLOW_rulearithOps_in_entryRulearithOps7012);
            iv_rulearithOps=rulearithOps();
            _fsp--;

             current =iv_rulearithOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearithOps7023); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3641:1: rulearithOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulearithOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3646:6: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:1: (kw= '+' | kw= '-' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            else if ( (LA40_0==62) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3647:1: (kw= '+' | kw= '-' )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3648:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_rulearithOps7061); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getArithOpsAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3655:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_rulearithOps7080); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getArithOpsAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3668:1: entryRulemultiplicativeExpression returns [EObject current=null] : iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF ;
    public final EObject entryRulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicativeExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3669:2: (iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3670:2: iv_rulemultiplicativeExpression= rulemultiplicativeExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicativeExpressionRule(), currentNode); 
            pushFollow(FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7120);
            iv_rulemultiplicativeExpression=rulemultiplicativeExpression();
            _fsp--;

             current =iv_rulemultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplicativeExpression7130); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3677:1: rulemultiplicativeExpression returns [EObject current=null] : (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) ;
    public final EObject rulemultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_unaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3682:6: ( (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3683:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3683:1: (this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3684:5: this_unaryExpression_0= ruleunaryExpression ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7177);
            this_unaryExpression_0=ruleunaryExpression();
            _fsp--;

             
                    current = this_unaryExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3692:1: ( () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40||LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3692:2: () ( (lv_op_2_0= rulemultOps ) ) ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3692:2: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3693:5: 
                    {
                     
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3708:2: ( (lv_op_2_0= rulemultOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3709:1: (lv_op_2_0= rulemultOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3709:1: (lv_op_2_0= rulemultOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3710:3: lv_op_2_0= rulemultOps
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultOpsParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulemultOps_in_rulemultiplicativeExpression7207);
                    lv_op_2_0=rulemultOps();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3732:2: ( (lv_right_3_0= rulemultiplicativeExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3733:1: (lv_right_3_0= rulemultiplicativeExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3733:1: (lv_right_3_0= rulemultiplicativeExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:3: lv_right_3_0= rulemultiplicativeExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7228);
                    lv_right_3_0=rulemultiplicativeExpression();
                    _fsp--;


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3764:1: entryRulemultOps returns [String current=null] : iv_rulemultOps= rulemultOps EOF ;
    public final String entryRulemultOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3765:2: (iv_rulemultOps= rulemultOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3766:2: iv_rulemultOps= rulemultOps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultOpsRule(), currentNode); 
            pushFollow(FOLLOW_rulemultOps_in_entryRulemultOps7267);
            iv_rulemultOps=rulemultOps();
            _fsp--;

             current =iv_rulemultOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemultOps7278); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3773:1: rulemultOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken rulemultOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3778:6: ( (kw= '*' | kw= '/' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3779:1: (kw= '*' | kw= '/' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3779:1: (kw= '*' | kw= '/' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            else if ( (LA42_0==63) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3779:1: (kw= '*' | kw= '/' )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3780:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_rulemultOps7316); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getMultOpsAccess().getAsteriskKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3787:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_rulemultOps7335); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getMultOpsAccess().getSolidusKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3800:1: entryRuleunaryExpression returns [EObject current=null] : iv_ruleunaryExpression= ruleunaryExpression EOF ;
    public final EObject entryRuleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaryExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3801:2: (iv_ruleunaryExpression= ruleunaryExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3802:2: iv_ruleunaryExpression= ruleunaryExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7375);
            iv_ruleunaryExpression=ruleunaryExpression();
            _fsp--;

             current =iv_ruleunaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryExpression7385); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3809:1: ruleunaryExpression returns [EObject current=null] : (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) ;
    public final EObject ruleunaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3814:6: ( (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3815:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3815:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT||(LA43_0>=RULE_ID && LA43_0<=RULE_BOOLEAN)||(LA43_0>=65 && LA43_0<=101)) ) {
                alt43=1;
            }
            else if ( (LA43_0==62||LA43_0==64) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3815:1: (this_TermExpression_0= ruleTermExpression | ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3816:5: this_TermExpression_0= ruleTermExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression7432);
                    this_TermExpression_0=ruleTermExpression();
                    _fsp--;

                     
                            current = this_TermExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:6: ( ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:7: ( (lv_op_1_0= ruleunaryOps ) ) ( (lv_expr_2_0= ruleTermExpression ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3825:7: ( (lv_op_1_0= ruleunaryOps ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3826:1: (lv_op_1_0= ruleunaryOps )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3826:1: (lv_op_1_0= ruleunaryOps )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3827:3: lv_op_1_0= ruleunaryOps
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpsParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleunaryOps_in_ruleunaryExpression7459);
                    lv_op_1_0=ruleunaryOps();
                    _fsp--;


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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3849:2: ( (lv_expr_2_0= ruleTermExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3850:1: (lv_expr_2_0= ruleTermExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3850:1: (lv_expr_2_0= ruleTermExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3851:3: lv_expr_2_0= ruleTermExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprTermExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTermExpression_in_ruleunaryExpression7480);
                    lv_expr_2_0=ruleTermExpression();
                    _fsp--;


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
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3881:1: entryRuleunaryOps returns [String current=null] : iv_ruleunaryOps= ruleunaryOps EOF ;
    public final String entryRuleunaryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOps = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3882:2: (iv_ruleunaryOps= ruleunaryOps EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3883:2: iv_ruleunaryOps= ruleunaryOps EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryOpsRule(), currentNode); 
            pushFollow(FOLLOW_ruleunaryOps_in_entryRuleunaryOps7518);
            iv_ruleunaryOps=ruleunaryOps();
            _fsp--;

             current =iv_ruleunaryOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunaryOps7529); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3890:1: ruleunaryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:6: ( (kw= '-' | kw= '!' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3896:1: (kw= '-' | kw= '!' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3896:1: (kw= '-' | kw= '!' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            else if ( (LA44_0==64) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3896:1: (kw= '-' | kw= '!' )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3897:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_ruleunaryOps7567); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getUnaryOpsAccess().getHyphenMinusKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3904:2: kw= '!'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleunaryOps7586); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getUnaryOpsAccess().getExclamationMarkKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3917:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3918:2: (iv_ruleOperator= ruleOperator EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3919:2: iv_ruleOperator= ruleOperator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperatorRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator7626);
            iv_ruleOperator=ruleOperator();
            _fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator7636); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3926:1: ruleOperator returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_sequence_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3931:6: ( ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3932:1: ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3932:1: ( ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3932:2: ( (lv_op_0_0= ruleOperatorName ) ) '(' ( (lv_sequence_2_0= ruleExpressionSequence ) ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3932:2: ( (lv_op_0_0= ruleOperatorName ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3933:1: (lv_op_0_0= ruleOperatorName )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3933:1: (lv_op_0_0= ruleOperatorName )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3934:3: lv_op_0_0= ruleOperatorName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperatorAccess().getOpOperatorNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperatorName_in_ruleOperator7682);
            lv_op_0_0=ruleOperatorName();
            _fsp--;


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

            match(input,25,FOLLOW_25_in_ruleOperator7692); 

                    createLeafNode(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3960:1: ( (lv_sequence_2_0= ruleExpressionSequence ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3961:1: (lv_sequence_2_0= ruleExpressionSequence )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3961:1: (lv_sequence_2_0= ruleExpressionSequence )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3962:3: lv_sequence_2_0= ruleExpressionSequence
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperatorAccess().getSequenceExpressionSequenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionSequence_in_ruleOperator7713);
            lv_sequence_2_0=ruleExpressionSequence();
            _fsp--;


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

            match(input,26,FOLLOW_26_in_ruleOperator7723); 

                    createLeafNode(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3996:1: entryRuleTermExpression returns [EObject current=null] : iv_ruleTermExpression= ruleTermExpression EOF ;
    public final EObject entryRuleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3997:2: (iv_ruleTermExpression= ruleTermExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3998:2: iv_ruleTermExpression= ruleTermExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTermExpression_in_entryRuleTermExpression7759);
            iv_ruleTermExpression=ruleTermExpression();
            _fsp--;

             current =iv_ruleTermExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermExpression7769); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4005:1: ruleTermExpression returns [EObject current=null] : (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) ;
    public final EObject ruleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TermLiteral_0 = null;

        EObject this_Operator_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4010:6: ( (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4011:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4011:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT||(LA45_0>=RULE_ID && LA45_0<=RULE_BOOLEAN)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=65 && LA45_0<=101)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4011:1: (this_TermLiteral_0= ruleTermLiteral | this_Operator_1= ruleOperator )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4012:5: this_TermLiteral_0= ruleTermLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermExpressionAccess().getTermLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTermLiteral_in_ruleTermExpression7816);
                    this_TermLiteral_0=ruleTermLiteral();
                    _fsp--;

                     
                            current = this_TermLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4022:5: this_Operator_1= ruleOperator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermExpressionAccess().getOperatorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperator_in_ruleTermExpression7843);
                    this_Operator_1=ruleOperator();
                    _fsp--;

                     
                            current = this_Operator_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4038:1: entryRuleTermLiteral returns [EObject current=null] : iv_ruleTermLiteral= ruleTermLiteral EOF ;
    public final EObject entryRuleTermLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermLiteral = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4039:2: (iv_ruleTermLiteral= ruleTermLiteral EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4040:2: iv_ruleTermLiteral= ruleTermLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral7878);
            iv_ruleTermLiteral=ruleTermLiteral();
            _fsp--;

             current =iv_ruleTermLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermLiteral7888); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4047:1: ruleTermLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) ) ;
    public final EObject ruleTermLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_value_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4052:6: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
                {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==13) ) {
                    alt46=5;
                }
                else if ( (LA46_2==EOF||LA46_2==24||LA46_2==26||(LA46_2>=39 && LA46_2<=40)||(LA46_2>=47 && LA46_2<=63)) ) {
                    alt46=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("4053:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) )", 46, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                alt46=3;
                }
                break;
            case RULE_STRING:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4053:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= ruleDOUBLE ) ) ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:3: () ( (lv_value_1_0= RULE_ID ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4053:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4054:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTermLiteralAccess().getVarRefAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getVarRefAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4064:2: ( (lv_value_1_0= RULE_ID ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4065:1: (lv_value_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4065:1: (lv_value_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4066:3: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTermLiteral7940); 

                    			createLeafNode(grammarAccess.getTermLiteralAccess().getValueIDTerminalRuleCall_0_1_0(), "value"); 
                    		

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
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4089:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4089:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4089:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4089:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4090:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTermLiteralAccess().getIntegerLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getIntegerLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4100:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4101:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4101:1: (lv_value_3_0= RULE_INT )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4102:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTermLiteral7979); 

                    			createLeafNode(grammarAccess.getTermLiteralAccess().getValueINTTerminalRuleCall_1_1_0(), "value"); 
                    		

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
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4125:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4125:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4125:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4125:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4126:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTermLiteralAccess().getBooleanLiteralAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getBooleanLiteralAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4136:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4137:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4137:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4138:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8018); 

                    			createLeafNode(grammarAccess.getTermLiteralAccess().getValueBOOLEANTerminalRuleCall_2_1_0(), "value"); 
                    		

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
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4161:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4161:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4161:7: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4161:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4162:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTermLiteralAccess().getStringLiteralAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getStringLiteralAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4172:2: ( (lv_value_7_0= RULE_STRING ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4173:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4173:1: (lv_value_7_0= RULE_STRING )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4174:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTermLiteral8057); 

                    			createLeafNode(grammarAccess.getTermLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0(), "value"); 
                    		

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
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4197:6: ( () ( (lv_value_9_0= ruleDOUBLE ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4197:6: ( () ( (lv_value_9_0= ruleDOUBLE ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4197:7: () ( (lv_value_9_0= ruleDOUBLE ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4197:7: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4198:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTermLiteralAccess().getDoubleLiteralAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTermLiteralAccess().getDoubleLiteralAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4208:2: ( (lv_value_9_0= ruleDOUBLE ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4209:1: (lv_value_9_0= ruleDOUBLE )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4209:1: (lv_value_9_0= ruleDOUBLE )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4210:3: lv_value_9_0= ruleDOUBLE
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTermLiteralAccess().getValueDOUBLEParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleTermLiteral8100);
                    lv_value_9_0=ruleDOUBLE();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTermLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_9_0, 
                    	        		"DOUBLE", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4240:1: entryRuleOperatorName returns [String current=null] : iv_ruleOperatorName= ruleOperatorName EOF ;
    public final String entryRuleOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorName = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4241:2: (iv_ruleOperatorName= ruleOperatorName EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4242:2: iv_ruleOperatorName= ruleOperatorName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperatorNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperatorName_in_entryRuleOperatorName8138);
            iv_ruleOperatorName=ruleOperatorName();
            _fsp--;

             current =iv_ruleOperatorName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorName8149); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4249:1: ruleOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4254:6: ( (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4255:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            int alt47=37;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt47=1;
                }
                break;
            case 66:
                {
                alt47=2;
                }
                break;
            case 67:
                {
                alt47=3;
                }
                break;
            case 68:
                {
                alt47=4;
                }
                break;
            case 69:
                {
                alt47=5;
                }
                break;
            case 70:
                {
                alt47=6;
                }
                break;
            case 71:
                {
                alt47=7;
                }
                break;
            case 72:
                {
                alt47=8;
                }
                break;
            case 73:
                {
                alt47=9;
                }
                break;
            case 74:
                {
                alt47=10;
                }
                break;
            case 75:
                {
                alt47=11;
                }
                break;
            case 76:
                {
                alt47=12;
                }
                break;
            case 77:
                {
                alt47=13;
                }
                break;
            case 78:
                {
                alt47=14;
                }
                break;
            case 79:
                {
                alt47=15;
                }
                break;
            case 80:
                {
                alt47=16;
                }
                break;
            case 81:
                {
                alt47=17;
                }
                break;
            case 82:
                {
                alt47=18;
                }
                break;
            case 83:
                {
                alt47=19;
                }
                break;
            case 84:
                {
                alt47=20;
                }
                break;
            case 85:
                {
                alt47=21;
                }
                break;
            case 86:
                {
                alt47=22;
                }
                break;
            case 87:
                {
                alt47=23;
                }
                break;
            case 88:
                {
                alt47=24;
                }
                break;
            case 89:
                {
                alt47=25;
                }
                break;
            case 90:
                {
                alt47=26;
                }
                break;
            case 91:
                {
                alt47=27;
                }
                break;
            case 92:
                {
                alt47=28;
                }
                break;
            case 93:
                {
                alt47=29;
                }
                break;
            case 94:
                {
                alt47=30;
                }
                break;
            case 95:
                {
                alt47=31;
                }
                break;
            case 96:
                {
                alt47=32;
                }
                break;
            case 97:
                {
                alt47=33;
                }
                break;
            case 98:
                {
                alt47=34;
                }
                break;
            case 99:
                {
                alt47=35;
                }
                break;
            case 100:
                {
                alt47=36;
                }
                break;
            case 101:
                {
                alt47=37;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4255:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | kw= 'Distribution' | kw= 'NoisyOR' | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4256:2: kw= 'truncate'
                    {
                    kw=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_ruleOperatorName8187); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTruncateKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4263:2: kw= 'Normal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_ruleOperatorName8206); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNormalKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4270:2: kw= 'LogNormal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleOperatorName8225); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogNormalKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4277:2: kw= 'Beta'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_ruleOperatorName8244); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBetaKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4284:2: kw= 'Gamma'
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleOperatorName8263); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGammaKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4291:2: kw= 'Exponential'
                    {
                    kw=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_ruleOperatorName8282); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExponentialKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4298:2: kw= 'Weibull'
                    {
                    kw=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_ruleOperatorName8301); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getWeibullKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4305:2: kw= 'Uniform'
                    {
                    kw=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ruleOperatorName8320); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getUniformKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4312:2: kw= 'Triangular'
                    {
                    kw=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_ruleOperatorName8339); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTriangularKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4319:2: kw= 'PERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ruleOperatorName8358); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPERTKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4326:2: kw= 'Binomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_ruleOperatorName8377); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBinomialKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4333:2: kw= 'Poisson'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleOperatorName8396); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPoissonKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4340:2: kw= 'NegativeBinomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleOperatorName8415); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNegativeBinomialKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4347:2: kw= 'Geometric'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleOperatorName8434); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGeometricKeyword_13(), null); 
                        

                    }
                    break;
                case 15 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4354:2: kw= 'Distribution'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleOperatorName8453); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getDistributionKeyword_14(), null); 
                        

                    }
                    break;
                case 16 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4361:2: kw= 'NoisyOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleOperatorName8472); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNoisyORKeyword_15(), null); 
                        

                    }
                    break;
                case 17 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4368:2: kw= 'min'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleOperatorName8491); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMinKeyword_16(), null); 
                        

                    }
                    break;
                case 18 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4375:2: kw= 'max'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleOperatorName8510); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMaxKeyword_17(), null); 
                        

                    }
                    break;
                case 19 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4382:2: kw= 'log'
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleOperatorName8529); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogKeyword_18(), null); 
                        

                    }
                    break;
                case 20 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4389:2: kw= 'log2'
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleOperatorName8548); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog2Keyword_19(), null); 
                        

                    }
                    break;
                case 21 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4396:2: kw= 'log10'
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleOperatorName8567); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog10Keyword_20(), null); 
                        

                    }
                    break;
                case 22 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4403:2: kw= 'exp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleOperatorName8586); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExpKeyword_21(), null); 
                        

                    }
                    break;
                case 23 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4410:2: kw= 'sin'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleOperatorName8605); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinKeyword_22(), null); 
                        

                    }
                    break;
                case 24 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4417:2: kw= 'cos'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleOperatorName8624); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCosKeyword_23(), null); 
                        

                    }
                    break;
                case 25 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4424:2: kw= 'tan'
                    {
                    kw=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_ruleOperatorName8643); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanKeyword_24(), null); 
                        

                    }
                    break;
                case 26 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4431:2: kw= 'sinh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ruleOperatorName8662); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinhKeyword_25(), null); 
                        

                    }
                    break;
                case 27 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4438:2: kw= 'cosh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ruleOperatorName8681); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCoshKeyword_26(), null); 
                        

                    }
                    break;
                case 28 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4445:2: kw= 'tanh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_ruleOperatorName8700); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanhKeyword_27(), null); 
                        

                    }
                    break;
                case 29 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4452:2: kw= 'sqrt'
                    {
                    kw=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_ruleOperatorName8719); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSqrtKeyword_28(), null); 
                        

                    }
                    break;
                case 30 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4459:2: kw= 'abs'
                    {
                    kw=(Token)input.LT(1);
                    match(input,94,FOLLOW_94_in_ruleOperatorName8738); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAbsKeyword_29(), null); 
                        

                    }
                    break;
                case 31 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4466:2: kw= 'floor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_ruleOperatorName8757); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getFloorKeyword_30(), null); 
                        

                    }
                    break;
                case 32 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4473:2: kw= 'ceil'
                    {
                    kw=(Token)input.LT(1);
                    match(input,96,FOLLOW_96_in_ruleOperatorName8776); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCeilKeyword_31(), null); 
                        

                    }
                    break;
                case 33 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4480:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,97,FOLLOW_97_in_ruleOperatorName8795); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getModKeyword_32(), null); 
                        

                    }
                    break;
                case 34 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4487:2: kw= 'if'
                    {
                    kw=(Token)input.LT(1);
                    match(input,98,FOLLOW_98_in_ruleOperatorName8814); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getIfKeyword_33(), null); 
                        

                    }
                    break;
                case 35 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4494:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,99,FOLLOW_99_in_ruleOperatorName8833); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAndKeyword_34(), null); 
                        

                    }
                    break;
                case 36 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4501:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,100,FOLLOW_100_in_ruleOperatorName8852); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getOrKeyword_35(), null); 
                        

                    }
                    break;
                case 37 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4508:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,101,FOLLOW_101_in_ruleOperatorName8871); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNotKeyword_36(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDOUBLE236 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_EXT_INT_in_ruleDOUBLE252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDefinition425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_ruleDomainDefinition471 = new BitSet(new long[]{0x00001010007E0002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomainDefinition492 = new BitSet(new long[]{0x00001010007E0002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainHeader539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainHeader583 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDomainHeader593 = new BitSet(new long[]{0x0000000C70810040L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainHeader614 = new BitSet(new long[]{0x0000000C70810040L});
    public static final BitSet FOLLOW_16_in_ruleDomainHeader625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_ruleDomainElement718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_ruleDomainElement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleDomainElement772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_ruleAttribute864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleAttribute891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleAttribute918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_ruleAttribute945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_ruleAttribute972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleAttribute999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_entryRuleBasicNode1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNode1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1117 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicNode1134 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBasicNode1150 = new BitSet(new long[]{0x0000000C70810040L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBasicNode1171 = new BitSet(new long[]{0x0000000C70810040L});
    public static final BitSet FOLLOW_16_in_ruleBasicNode1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNodeKeyword1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBasicNodeKeyword1270 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleBasicNodeKeyword1289 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBasicNodeKeyword1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicNodeKeyword1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicNodeKeyword1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicNodeKeyword1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatesAttribute1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStatesAttribute1456 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatesAttribute1466 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatesAttribute1476 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatesAttribute1493 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_26_in_ruleStatesAttribute1509 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatesAttribute1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelAttribute1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLabelAttribute1600 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabelAttribute1610 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelAttribute1627 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLabelAttribute1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionAttribute1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePositionAttribute1723 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePositionAttribute1733 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePositionAttribute1743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositionAttribute1794 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePositionAttribute1804 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePositionAttribute1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeAttribute1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSubtypeAttribute1895 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubtypeAttribute1905 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleSubtypeAttribute1925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31_in_ruleSubtypeAttribute1954 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32_in_ruleSubtypeAttribute1983 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33_in_ruleSubtypeAttribute2012 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubtypeAttribute2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateValuesAttribute2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateValuesAttribute2119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateValuesAttribute2129 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStateValuesAttribute2139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStateValuesAttribute2156 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleStateValuesAttribute2172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStateValuesAttribute2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationAttribute2270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleApplicationAttribute2285 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationAttribute2302 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleApplicationAttribute2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSizeAttribute2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNodeSizeAttribute2398 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNodeSizeAttribute2408 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNodeSizeAttribute2418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2457 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeSizeAttribute2472 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeSizeAttribute2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_entryRulePotential2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotential2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePotential2563 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_rulePotential2584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulePotentialModel_in_rulePotential2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialGraph2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePotentialGraph2695 = new BitSet(new long[]{0x0000002004000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2712 = new BitSet(new long[]{0x0000002004000040L});
    public static final BitSet FOLLOW_37_in_rulePotentialGraph2729 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2746 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_rulePotentialGraph2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialModel_in_entryRulePotentialModel2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialModel2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePotentialModel2854 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_rulePotentialModel2875 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_rulePotentialModel2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialAttribute2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialDataAttribute3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePotentialDataAttribute3066 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePotentialDataAttribute3076 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePotentialDataAttribute3086 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleDataItemList_in_rulePotentialDataAttribute3107 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePotentialDataAttribute3117 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePotentialDataAttribute3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataItemList_in_entryRuleDataItemList3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataItemList3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_ruleDataItemList3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_ruleDataItemList3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnstructuredDataList3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_ruleUnstructuredDataList3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredDataList3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStructuredDataList3437 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_ruleStructuredDataList3486 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleStructuredDataList3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataList3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleFloatDataList3599 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanExpression3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3697 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleMeanExpression3716 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3738 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanTerm3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeanTerm3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeanTerm3878 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMeanTerm3896 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute3985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodesAttribute3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleModelNodesAttribute4039 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelNodesAttribute4049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelNodesAttribute4059 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodesAttribute4076 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_ruleModelNodesAttribute4092 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelNodesAttribute4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplesAttribute4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSamplesAttribute4183 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSamplesAttribute4193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplesAttribute4210 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSamplesAttribute4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDataAttribute4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleModelDataAttribute4315 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelDataAttribute4325 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelDataAttribute4335 = new BitSet(new long[]{0x40000000040001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleModelDataAttribute4356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelDataAttribute4366 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelDataAttribute4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleClassDefinition4457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition4474 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassDefinition4489 = new BitSet(new long[]{0x0000301C70FF0040L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClassDefinition4510 = new BitSet(new long[]{0x0000301C70FF0040L});
    public static final BitSet FOLLOW_16_in_ruleClassDefinition4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement4557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleClassElement4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClassElement4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_ruleClassElement4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_entryRuleClassInstance4703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassInstance4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleClassInstance4748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance4765 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleClassInstance4780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance4797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassInstance4812 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleClassInstance4833 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleClassInstance4845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleClassInstance4866 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleClassInstance4878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassInstance4888 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_ruleClassInstance4909 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassInstance4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBindings_in_entryRuleInputBindings4955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBindings4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_ruleInputBindings5011 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleInputBindings5021 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleInputBindings5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_entryRuleInputBinding5078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBinding5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInputBinding5145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBindings5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_ruleOutputBindings5259 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleOutputBindings5269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleOutputBindings5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBinding5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5378 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOutputBinding5393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttributes5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence5597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSequence5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence5663 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExpressionSequence5674 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence5695 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_ruleExpression5792 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleExpression5819 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleExpression5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignmentOpExpression_in_entryRuleassignmentOpExpression5891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignmentOpExpression5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression5948 = new BitSet(new long[]{0x001F000000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_ruleassignmentOpExpression5978 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleassignmentOpExpression5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignOp_in_entryRuleassignOp6038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignOp6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleassignOp6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleassignOp6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleassignOp6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleassignOp6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleassignOp6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorExpression_in_entryRuleorExpression6203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorExpression6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleorExpression6260 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleorExpression6287 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleorExpression_in_ruleorExpression6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpression_in_entryRuleandExpression6359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpression6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_ruleandExpression6416 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleandExpression6443 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleandExpression_in_ruleandExpression6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationalExpression_in_entryRulerelationalExpression6515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelationalExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_rulerelationalExpression6572 = new BitSet(new long[]{0x3F80000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_rulerelationalExpression6602 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_rulerelationalExpression_in_rulerelationalExpression6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelOps_in_entryRulerelOps6662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelOps6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulerelOps6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulerelOps6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulerelOps6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulerelOps6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulerelOps6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulerelOps6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulerelOps6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_entryRuleadditiveExpression6865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadditiveExpression6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_ruleadditiveExpression6922 = new BitSet(new long[]{0x4000008000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_ruleadditiveExpression6952 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleadditiveExpression_in_ruleadditiveExpression6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearithOps_in_entryRulearithOps7012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearithOps7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulearithOps7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulearithOps7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_entryRulemultiplicativeExpression7120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplicativeExpression7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_rulemultiplicativeExpression7177 = new BitSet(new long[]{0x8000010000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_rulemultiplicativeExpression7207 = new BitSet(new long[]{0x40000000000001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_rulemultiplicativeExpression_in_rulemultiplicativeExpression7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultOps_in_entryRulemultOps7267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultOps7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulemultOps7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulemultOps7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryExpression_in_entryRuleunaryExpression7375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryExpression7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_ruleunaryExpression7459 = new BitSet(new long[]{0x00000000000001D0L,0x0000003FFFFFFFFEL});
    public static final BitSet FOLLOW_ruleTermExpression_in_ruleunaryExpression7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunaryOps_in_entryRuleunaryOps7518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunaryOps7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleunaryOps7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleunaryOps7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator7626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_ruleOperator7682 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOperator7692 = new BitSet(new long[]{0x40000000040001D0L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleOperator7713 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOperator7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermExpression_in_entryRuleTermExpression7759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermExpression7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_ruleTermExpression7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTermExpression7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermLiteral_in_entryRuleTermLiteral7878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermLiteral7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTermLiteral7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTermLiteral7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTermLiteral8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTermLiteral8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleTermLiteral8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_entryRuleOperatorName8138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorName8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorName8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorName8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorName8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorName8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperatorName8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorName8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorName8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorName8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorName8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperatorName8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperatorName8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperatorName8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperatorName8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperatorName8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperatorName8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperatorName8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperatorName8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperatorName8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperatorName8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperatorName8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperatorName8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperatorName8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperatorName8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperatorName8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorName8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOperatorName8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOperatorName8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperatorName8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperatorName8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOperatorName8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOperatorName8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOperatorName8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOperatorName8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOperatorName8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOperatorName8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOperatorName8852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleOperatorName8871 = new BitSet(new long[]{0x0000000000000002L});

}