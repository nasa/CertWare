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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'.'", "'net'", "'{'", "'}'", "'discrete'", "'continuous'", "'node'", "'decision'", "'utility'", "'function'", "'states'", "'='", "'('", "')'", "';'", "'label'", "'position'", "'subtype'", "'boolean'", "'number'", "'interval'", "'state_values'", "'node_size'", "'potential'", "'|'", "'data'", "'normal'", "','", "'*'", "'model_nodes'", "'samples_per_interval'", "'model_data'", "'class'", "'instance'", "':'", "'^'", "'false'", "'true'", "'=='", "'!='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'/'", "'truncate'", "'Normal'", "'LogNormal'", "'Beta'", "'Gamma'", "'Exponential'", "'Weibull'", "'Uniform'", "'Triangular'", "'PERT'", "'Binomial'", "'Poisson'", "'NegativeBinomial'", "'Geometric'", "'Distribution'", "'NoisyOR'", "'min'", "'max'", "'log'", "'log2'", "'log10'", "'exp'", "'sin'", "'cos'", "'tan'", "'sinh'", "'cosh'", "'tanh'", "'sqrt'", "'abs'", "'floor'", "'ceil'", "'mod'", "'if'", "'and'", "'or'", "'not'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=8;

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


    // $ANTLR start entryRuleSign
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:124:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:128:2: (iv_ruleSign= ruleSign EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:129:2: iv_ruleSign= ruleSign EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignRule(), currentNode); 
            pushFollow(FOLLOW_ruleSign_in_entryRuleSign173);
            iv_ruleSign=ruleSign();
            _fsp--;

             current =iv_ruleSign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSign184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleSign


    // $ANTLR start ruleSign
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:139:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:145:6: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:146:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:146:1: (kw= '+' | kw= '-' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("146:1: (kw= '+' | kw= '-' )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:147:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleSign226); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:154:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleSign245); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignAccess().getHyphenMinusKeyword_1(), null); 
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleSign


    // $ANTLR start entryRuleFloat
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:170:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:171:2: (iv_ruleFloat= ruleFloat EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:172:2: iv_ruleFloat= ruleFloat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat290);
            iv_ruleFloat=ruleFloat();
            _fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloat


    // $ANTLR start ruleFloat
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:179:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:184:6: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:185:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:185:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:185:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:185:2: (this_Sign_0= ruleSign )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:186:5: this_Sign_0= ruleSign
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFloatAccess().getSignParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSign_in_ruleFloat349);
                    this_Sign_0=ruleSign();
                    _fsp--;


                    		current.merge(this_Sign_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat371); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:203:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:204:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleFloat390); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getFloatAccess().getFullStopKeyword_2_0(), null); 
                        
                    this_INT_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat405); 

                    		current.merge(this_INT_3);
                        
                     
                        createLeafNode(grammarAccess.getFloatAccess().getINTTerminalRuleCall_2_1(), null); 
                        

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
    // $ANTLR end ruleFloat


    // $ANTLR start entryRuleDomainDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:224:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:225:2: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:226:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition452);
            iv_ruleDomainDefinition=ruleDomainDefinition();
            _fsp--;

             current =iv_ruleDomainDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDefinition462); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:233:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:238:6: ( ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:2: ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:239:2: ( (lv_header_0_0= ruleDomainHeader ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:240:1: (lv_header_0_0= ruleDomainHeader )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:240:1: (lv_header_0_0= ruleDomainHeader )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:241:3: lv_header_0_0= ruleDomainHeader
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getHeaderDomainHeaderParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainHeader_in_ruleDomainDefinition508);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:263:2: ( (lv_elements_1_0= ruleDomainElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=22)||LA5_0==36||LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:264:1: (lv_elements_1_0= ruleDomainElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:264:1: (lv_elements_1_0= ruleDomainElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:265:3: lv_elements_1_0= ruleDomainElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getElementsDomainElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomainDefinition529);
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
            	    break loop5;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:295:1: entryRuleDomainHeader returns [EObject current=null] : iv_ruleDomainHeader= ruleDomainHeader EOF ;
    public final EObject entryRuleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainHeader = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:296:2: (iv_ruleDomainHeader= ruleDomainHeader EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:297:2: iv_ruleDomainHeader= ruleDomainHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader566);
            iv_ruleDomainHeader=ruleDomainHeader();
            _fsp--;

             current =iv_ruleDomainHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainHeader576); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:304:1: ruleDomainHeader returns [EObject current=null] : ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:309:6: ( ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:310:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:310:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:310:2: () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:310:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:311:5: 
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

            match(input,14,FOLLOW_14_in_ruleDomainHeader620); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getNetKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleDomainHeader630); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:329:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23||(LA6_0>=28 && LA6_0<=30)||(LA6_0>=34 && LA6_0<=35)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:330:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:330:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:331:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainHeaderAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainHeader651);
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
            	    break loop6;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleDomainHeader662); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:365:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:366:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:367:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement698);
            iv_ruleDomainElement=ruleDomainElement();
            _fsp--;

             current =iv_ruleDomainElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement708); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:374:1: ruleDomainElement returns [EObject current=null] : (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicNode_0 = null;

        EObject this_Potential_1 = null;

        EObject this_ClassDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:379:6: ( (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:380:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:380:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("380:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:381:5: this_BasicNode_0= ruleBasicNode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getBasicNodeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBasicNode_in_ruleDomainElement755);
                    this_BasicNode_0=ruleBasicNode();
                    _fsp--;

                     
                            current = this_BasicNode_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:391:5: this_Potential_1= rulePotential
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getPotentialParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotential_in_ruleDomainElement782);
                    this_Potential_1=rulePotential();
                    _fsp--;

                     
                            current = this_Potential_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:401:5: this_ClassDefinition_2= ruleClassDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getClassDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassDefinition_in_ruleDomainElement809);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:417:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:418:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:419:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute844);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute854); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:426:1: ruleAttribute returns [EObject current=null] : (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) ;
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
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:431:6: ( (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:432:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:432:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 34:
                {
                alt8=5;
                }
                break;
            case RULE_ID:
                {
                alt8=6;
                }
                break;
            case 35:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("432:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:433:5: this_StatesAttribute_0= ruleStatesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatesAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatesAttribute_in_ruleAttribute901);
                    this_StatesAttribute_0=ruleStatesAttribute();
                    _fsp--;

                     
                            current = this_StatesAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:443:5: this_LabelAttribute_1= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleAttribute928);
                    this_LabelAttribute_1=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:453:5: this_PositionAttribute_2= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleAttribute955);
                    this_PositionAttribute_2=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:463:5: this_SubtypeAttribute_3= ruleSubtypeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSubtypeAttributeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubtypeAttribute_in_ruleAttribute982);
                    this_SubtypeAttribute_3=ruleSubtypeAttribute();
                    _fsp--;

                     
                            current = this_SubtypeAttribute_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:473:5: this_StateValuesAttribute_4= ruleStateValuesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStateValuesAttributeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateValuesAttribute_in_ruleAttribute1009);
                    this_StateValuesAttribute_4=ruleStateValuesAttribute();
                    _fsp--;

                     
                            current = this_StateValuesAttribute_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:483:5: this_ApplicationAttribute_5= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getApplicationAttributeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleAttribute1036);
                    this_ApplicationAttribute_5=ruleApplicationAttribute();
                    _fsp--;

                     
                            current = this_ApplicationAttribute_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:493:5: this_NodeSizeAttribute_6= ruleNodeSizeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNodeSizeAttributeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1063);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:509:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:510:2: (iv_ruleBasicNode= ruleBasicNode EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:511:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNode_in_entryRuleBasicNode1098);
            iv_ruleBasicNode=ruleBasicNode();
            _fsp--;

             current =iv_ruleBasicNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNode1108); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:518:1: ruleBasicNode returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:523:6: ( ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:524:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:524:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:524:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:524:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:525:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:525:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:526:3: lv_keyword_0_0= ruleBasicNodeKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getKeywordBasicNodeKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1154);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:548:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:549:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:549:1: (lv_id_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:550:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicNode1171); 

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

            match(input,15,FOLLOW_15_in_ruleBasicNode1187); 

                    createLeafNode(grammarAccess.getBasicNodeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:576:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=34 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:577:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:577:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:578:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBasicNode1208);
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
            	    break loop10;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleBasicNode1219); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:612:1: entryRuleBasicNodeKeyword returns [String current=null] : iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF ;
    public final String entryRuleBasicNodeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicNodeKeyword = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:613:2: (iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:614:2: iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1256);
            iv_ruleBasicNodeKeyword=ruleBasicNodeKeyword();
            _fsp--;

             current =iv_ruleBasicNodeKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNodeKeyword1267); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:621:1: ruleBasicNodeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) ;
    public final AntlrDatatypeRuleToken ruleBasicNodeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:626:6: ( ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("627:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:3: (kw= 'discrete' | kw= 'continuous' )? kw= 'node'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:627:3: (kw= 'discrete' | kw= 'continuous' )?
                    int alt11=3;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==17) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==18) ) {
                        alt11=2;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:628:2: kw= 'discrete'
                            {
                            kw=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleBasicNodeKeyword1307); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDiscreteKeyword_0_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:635:2: kw= 'continuous'
                            {
                            kw=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleBasicNodeKeyword1326); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getContinuousKeyword_0_0_1(), null); 
                                

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBasicNodeKeyword1341); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getNodeKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:648:2: kw= 'decision'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBasicNodeKeyword1361); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDecisionKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:655:2: kw= 'utility'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleBasicNodeKeyword1380); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getUtilityKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:662:2: kw= 'function'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleBasicNodeKeyword1399); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:675:1: entryRuleStatesAttribute returns [EObject current=null] : iv_ruleStatesAttribute= ruleStatesAttribute EOF ;
    public final EObject entryRuleStatesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:676:2: (iv_ruleStatesAttribute= ruleStatesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:677:2: iv_ruleStatesAttribute= ruleStatesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1439);
            iv_ruleStatesAttribute=ruleStatesAttribute();
            _fsp--;

             current =iv_ruleStatesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatesAttribute1449); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:684:1: ruleStatesAttribute returns [EObject current=null] : ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) ;
    public final EObject ruleStatesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_states_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:689:6: ( ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:690:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:690:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:690:2: () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:690:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:691:5: 
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

            match(input,23,FOLLOW_23_in_ruleStatesAttribute1493); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStatesAttribute1503); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStatesAttribute1513); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:713:1: ( (lv_states_4_0= RULE_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:714:1: (lv_states_4_0= RULE_STRING )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:714:1: (lv_states_4_0= RULE_STRING )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:715:3: lv_states_4_0= RULE_STRING
            	    {
            	    lv_states_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatesAttribute1530); 

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
            	    break loop13;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleStatesAttribute1546); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStatesAttribute1556); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:753:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:754:2: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:755:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1592);
            iv_ruleLabelAttribute=ruleLabelAttribute();
            _fsp--;

             current =iv_ruleLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelAttribute1602); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:762:1: ruleLabelAttribute returns [EObject current=null] : ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:767:6: ( ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:768:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:768:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:768:3: 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            match(input,28,FOLLOW_28_in_ruleLabelAttribute1637); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleLabelAttribute1647); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:776:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:777:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:777:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:778:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelAttribute1664); 

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

            match(input,27,FOLLOW_27_in_ruleLabelAttribute1679); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:812:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:813:2: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:814:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1715);
            iv_rulePositionAttribute=rulePositionAttribute();
            _fsp--;

             current =iv_rulePositionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionAttribute1725); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:821:1: rulePositionAttribute returns [EObject current=null] : ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_x_3_0=null;
        Token lv_y_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:826:6: ( ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:827:1: ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:827:1: ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:827:3: 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,29,FOLLOW_29_in_rulePositionAttribute1760); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getPositionKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_rulePositionAttribute1770); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_rulePositionAttribute1780); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:839:1: ( (lv_x_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:840:1: (lv_x_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:840:1: (lv_x_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:841:3: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionAttribute1797); 

            			createLeafNode(grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_3_0(), "x"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPositionAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"x",
            	        		lv_x_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:863:2: ( (lv_y_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:864:1: (lv_y_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:864:1: (lv_y_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:865:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionAttribute1819); 

            			createLeafNode(grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_4_0(), "y"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPositionAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"y",
            	        		lv_y_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,26,FOLLOW_26_in_rulePositionAttribute1834); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_rulePositionAttribute1844); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_6(), null); 
                

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:903:1: entryRuleSubtypeAttribute returns [EObject current=null] : iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF ;
    public final EObject entryRuleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:904:2: (iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:905:2: iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubtypeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1880);
            iv_ruleSubtypeAttribute=ruleSubtypeAttribute();
            _fsp--;

             current =iv_ruleSubtypeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeAttribute1890); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:912:1: ruleSubtypeAttribute returns [EObject current=null] : ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) ;
    public final EObject ruleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_subtype_2_1=null;
        Token lv_subtype_2_2=null;
        Token lv_subtype_2_3=null;
        Token lv_subtype_2_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:917:6: ( ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:918:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:918:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:918:3: 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';'
            {
            match(input,30,FOLLOW_30_in_ruleSubtypeAttribute1925); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSubtypeAttribute1935); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:926:1: ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:928:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:928:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("928:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:929:3: lv_subtype_2_1= 'label'
                    {
                    lv_subtype_2_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSubtypeAttribute1955); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:947:8: lv_subtype_2_2= 'boolean'
                    {
                    lv_subtype_2_2=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSubtypeAttribute1984); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:965:8: lv_subtype_2_3= 'number'
                    {
                    lv_subtype_2_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSubtypeAttribute2013); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:983:8: lv_subtype_2_4= 'interval'
                    {
                    lv_subtype_2_4=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSubtypeAttribute2042); 

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

            match(input,27,FOLLOW_27_in_ruleSubtypeAttribute2068); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1016:1: entryRuleStateValuesAttribute returns [EObject current=null] : iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF ;
    public final EObject entryRuleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValuesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1017:2: (iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1018:2: iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateValuesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2104);
            iv_ruleStateValuesAttribute=ruleStateValuesAttribute();
            _fsp--;

             current =iv_ruleStateValuesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateValuesAttribute2114); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1025:1: ruleStateValuesAttribute returns [EObject current=null] : ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) ;
    public final EObject ruleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_numbers_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1030:6: ( ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1031:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1031:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1031:3: 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';'
            {
            match(input,34,FOLLOW_34_in_ruleStateValuesAttribute2149); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getState_valuesKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStateValuesAttribute2159); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStateValuesAttribute2169); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1043:1: ( (lv_numbers_3_0= RULE_INT ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1044:1: (lv_numbers_3_0= RULE_INT )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1044:1: (lv_numbers_3_0= RULE_INT )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1045:3: lv_numbers_3_0= RULE_INT
            	    {
            	    lv_numbers_3_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStateValuesAttribute2186); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleStateValuesAttribute2202); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStateValuesAttribute2212); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1083:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1084:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1085:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2248);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();
            _fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute2258); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1092:1: ruleApplicationAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1097:6: ( ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1098:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1098:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1098:2: ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1098:2: ( (lv_key_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1099:1: (lv_key_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1099:1: (lv_key_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1100:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationAttribute2300); 

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

            match(input,24,FOLLOW_24_in_ruleApplicationAttribute2315); 

                    createLeafNode(grammarAccess.getApplicationAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1126:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1127:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1127:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1128:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationAttribute2332); 

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

            match(input,27,FOLLOW_27_in_ruleApplicationAttribute2347); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1162:1: entryRuleNodeSizeAttribute returns [EObject current=null] : iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF ;
    public final EObject entryRuleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSizeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1163:2: (iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1164:2: iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeSizeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2383);
            iv_ruleNodeSizeAttribute=ruleNodeSizeAttribute();
            _fsp--;

             current =iv_ruleNodeSizeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSizeAttribute2393); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1171:1: ruleNodeSizeAttribute returns [EObject current=null] : ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject ruleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_width_3_0=null;
        Token lv_height_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1176:6: ( ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1177:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1177:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1177:3: 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,35,FOLLOW_35_in_ruleNodeSizeAttribute2428); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getNode_sizeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleNodeSizeAttribute2438); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNodeSizeAttribute2448); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1189:1: ( (lv_width_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1190:1: (lv_width_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1190:1: (lv_width_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1191:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2465); 

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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1213:2: ( (lv_height_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1214:1: (lv_height_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1214:1: (lv_height_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1215:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2487); 

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

            match(input,26,FOLLOW_26_in_ruleNodeSizeAttribute2502); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleNodeSizeAttribute2512); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1253:1: entryRulePotential returns [EObject current=null] : iv_rulePotential= rulePotential EOF ;
    public final EObject entryRulePotential() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotential = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1254:2: (iv_rulePotential= rulePotential EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1255:2: iv_rulePotential= rulePotential EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialRule(), currentNode); 
            pushFollow(FOLLOW_rulePotential_in_entryRulePotential2548);
            iv_rulePotential=rulePotential();
            _fsp--;

             current =iv_rulePotential; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotential2558); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1262:1: rulePotential returns [EObject current=null] : ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) ;
    public final EObject rulePotential() throws RecognitionException {
        EObject current = null;

        EObject lv_graph_1_0 = null;

        EObject lv_model_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1267:6: ( ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1268:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1268:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1268:3: 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) )
            {
            match(input,36,FOLLOW_36_in_rulePotential2593); 

                    createLeafNode(grammarAccess.getPotentialAccess().getPotentialKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1272:1: ( (lv_graph_1_0= rulePotentialGraph ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1273:1: (lv_graph_1_0= rulePotentialGraph )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1273:1: (lv_graph_1_0= rulePotentialGraph )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1274:3: lv_graph_1_0= rulePotentialGraph
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialGraph_in_rulePotential2614);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1296:2: ( (lv_model_2_0= rulePotentialModel ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1297:1: (lv_model_2_0= rulePotentialModel )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1297:1: (lv_model_2_0= rulePotentialModel )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1298:3: lv_model_2_0= rulePotentialModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialModel_in_rulePotential2635);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1328:1: entryRulePotentialGraph returns [EObject current=null] : iv_rulePotentialGraph= rulePotentialGraph EOF ;
    public final EObject entryRulePotentialGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialGraph = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1329:2: (iv_rulePotentialGraph= rulePotentialGraph EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1330:2: iv_rulePotentialGraph= rulePotentialGraph EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialGraphRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2671);
            iv_rulePotentialGraph=rulePotentialGraph();
            _fsp--;

             current =iv_rulePotentialGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialGraph2681); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1337:1: rulePotentialGraph returns [EObject current=null] : ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) ;
    public final EObject rulePotentialGraph() throws RecognitionException {
        EObject current = null;

        Token lv_children_2_0=null;
        Token lv_parents_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1342:6: ( ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1343:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1343:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1343:2: () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1343:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1344:5: 
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

            match(input,25,FOLLOW_25_in_rulePotentialGraph2725); 

                    createLeafNode(grammarAccess.getPotentialGraphAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1358:1: ( (lv_children_2_0= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1359:1: (lv_children_2_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1359:1: (lv_children_2_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1360:3: lv_children_2_0= RULE_ID
            	    {
            	    lv_children_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2742); 

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
            	    break loop16;
                }
            } while (true);

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1382:3: ( '|' ( (lv_parents_4_0= RULE_ID ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1382:5: '|' ( (lv_parents_4_0= RULE_ID ) )*
                    {
                    match(input,37,FOLLOW_37_in_rulePotentialGraph2759); 

                            createLeafNode(grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1386:1: ( (lv_parents_4_0= RULE_ID ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1387:1: (lv_parents_4_0= RULE_ID )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1387:1: (lv_parents_4_0= RULE_ID )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1388:3: lv_parents_4_0= RULE_ID
                    	    {
                    	    lv_parents_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2776); 

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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_rulePotentialGraph2794); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1422:1: entryRulePotentialModel returns [EObject current=null] : iv_rulePotentialModel= rulePotentialModel EOF ;
    public final EObject entryRulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1423:2: (iv_rulePotentialModel= rulePotentialModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1424:2: iv_rulePotentialModel= rulePotentialModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialModelRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialModel_in_entryRulePotentialModel2830);
            iv_rulePotentialModel=rulePotentialModel();
            _fsp--;

             current =iv_rulePotentialModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialModel2840); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1431:1: rulePotentialModel returns [EObject current=null] : ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) ;
    public final EObject rulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1436:6: ( ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1437:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1437:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1437:2: () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1437:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1438:5: 
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

            match(input,15,FOLLOW_15_in_rulePotentialModel2884); 

                    createLeafNode(grammarAccess.getPotentialModelAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1452:1: ( (lv_attributes_2_0= rulePotentialAttribute ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38||LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1453:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1453:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1454:3: lv_attributes_2_0= rulePotentialAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPotentialModelAccess().getAttributesPotentialAttributeParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePotentialAttribute_in_rulePotentialModel2905);
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
            	    break loop19;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_rulePotentialModel2916); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1488:1: entryRulePotentialAttribute returns [EObject current=null] : iv_rulePotentialAttribute= rulePotentialAttribute EOF ;
    public final EObject entryRulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1489:2: (iv_rulePotentialAttribute= rulePotentialAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1490:2: iv_rulePotentialAttribute= rulePotentialAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2952);
            iv_rulePotentialAttribute=rulePotentialAttribute();
            _fsp--;

             current =iv_rulePotentialAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialAttribute2962); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1497:1: rulePotentialAttribute returns [EObject current=null] : (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) ;
    public final EObject rulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PotentialDataAttribute_0 = null;

        EObject this_PotentialTableAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1502:6: ( (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1503:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1503:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==42) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1503:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1504:5: this_PotentialDataAttribute_0= rulePotentialDataAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialDataAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute3009);
                    this_PotentialDataAttribute_0=rulePotentialDataAttribute();
                    _fsp--;

                     
                            current = this_PotentialDataAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1514:5: this_PotentialTableAttribute_1= rulePotentialTableAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialTableAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute3036);
                    this_PotentialTableAttribute_1=rulePotentialTableAttribute();
                    _fsp--;

                     
                            current = this_PotentialTableAttribute_1; 
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
    // $ANTLR end rulePotentialAttribute


    // $ANTLR start entryRulePotentialDataAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1530:1: entryRulePotentialDataAttribute returns [EObject current=null] : iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF ;
    public final EObject entryRulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1531:2: (iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1532:2: iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3071);
            iv_rulePotentialDataAttribute=rulePotentialDataAttribute();
            _fsp--;

             current =iv_rulePotentialDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialDataAttribute3081); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1539:1: rulePotentialDataAttribute returns [EObject current=null] : ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* ) ')' ';' ) ;
    public final EObject rulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_unstructured_4_0 = null;

        EObject lv_items_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1544:6: ( ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:1: ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:1: ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:2: () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* ) ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1545:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1546:5: 
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

            match(input,38,FOLLOW_38_in_rulePotentialDataAttribute3125); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getDataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_rulePotentialDataAttribute3135); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_rulePotentialDataAttribute3145); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1568:1: ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* )
            int alt22=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 11:
            case 12:
                {
                alt22=1;
                }
                break;
            case 26:
            case 39:
                {
                alt22=1;
                }
                break;
            case 25:
                {
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1568:1: ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_items_5_0= ruleStructuredDataList ) )* )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1568:2: ( (lv_unstructured_4_0= ruleUnstructuredDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1568:2: ( (lv_unstructured_4_0= ruleUnstructuredDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1569:1: (lv_unstructured_4_0= ruleUnstructuredDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1569:1: (lv_unstructured_4_0= ruleUnstructuredDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1570:3: lv_unstructured_4_0= ruleUnstructuredDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getUnstructuredUnstructuredDataListParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnstructuredDataList_in_rulePotentialDataAttribute3167);
                    lv_unstructured_4_0=ruleUnstructuredDataList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPotentialDataAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"unstructured",
                    	        		lv_unstructured_4_0, 
                    	        		"UnstructuredDataList", 
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1593:6: ( (lv_items_5_0= ruleStructuredDataList ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1593:6: ( (lv_items_5_0= ruleStructuredDataList ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==25) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1594:1: (lv_items_5_0= ruleStructuredDataList )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1594:1: (lv_items_5_0= ruleStructuredDataList )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1595:3: lv_items_5_0= ruleStructuredDataList
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getItemsStructuredDataListParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStructuredDataList_in_rulePotentialDataAttribute3194);
                    	    lv_items_5_0=ruleStructuredDataList();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPotentialDataAttributeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"items",
                    	    	        		lv_items_5_0, 
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_rulePotentialDataAttribute3206); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_rulePotentialDataAttribute3216); 

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


    // $ANTLR start entryRuleUnstructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1633:1: entryRuleUnstructuredDataList returns [EObject current=null] : iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF ;
    public final EObject entryRuleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnstructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1634:2: (iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1635:2: iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnstructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3252);
            iv_ruleUnstructuredDataList=ruleUnstructuredDataList();
            _fsp--;

             current =iv_ruleUnstructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnstructuredDataList3262); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1642:1: ruleUnstructuredDataList returns [EObject current=null] : ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) | ( (lv_normal_2_0= ruleNormalDistribution ) ) ) ;
    public final EObject ruleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;

        EObject lv_normal_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1647:6: ( ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) | ( (lv_normal_2_0= ruleNormalDistribution ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:1: ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) | ( (lv_normal_2_0= ruleNormalDistribution ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:1: ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) | ( (lv_normal_2_0= ruleNormalDistribution ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==RULE_INT||(LA23_0>=11 && LA23_0<=12)||LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1648:1: ( ( () ( (lv_list_1_0= ruleFloatDataList ) ) ) | ( (lv_normal_2_0= ruleNormalDistribution ) ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:2: ( () ( (lv_list_1_0= ruleFloatDataList ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:2: ( () ( (lv_list_1_0= ruleFloatDataList ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:3: () ( (lv_list_1_0= ruleFloatDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1648:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1649:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getUnstructuredDataListAccess().getUnstructuredDataListAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getUnstructuredDataListAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1659:2: ( (lv_list_1_0= ruleFloatDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1660:1: (lv_list_1_0= ruleFloatDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1660:1: (lv_list_1_0= ruleFloatDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1661:3: lv_list_1_0= ruleFloatDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getListFloatDataListParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFloatDataList_in_ruleUnstructuredDataList3318);
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
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1684:6: ( (lv_normal_2_0= ruleNormalDistribution ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1684:6: ( (lv_normal_2_0= ruleNormalDistribution ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1685:1: (lv_normal_2_0= ruleNormalDistribution )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1685:1: (lv_normal_2_0= ruleNormalDistribution )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1686:3: lv_normal_2_0= ruleNormalDistribution
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getNormalNormalDistributionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNormalDistribution_in_ruleUnstructuredDataList3346);
                    lv_normal_2_0=ruleNormalDistribution();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnstructuredDataListRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"normal",
                    	        		lv_normal_2_0, 
                    	        		"NormalDistribution", 
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1716:1: entryRuleStructuredDataList returns [EObject current=null] : iv_ruleStructuredDataList= ruleStructuredDataList EOF ;
    public final EObject entryRuleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1717:2: (iv_ruleStructuredDataList= ruleStructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1718:2: iv_ruleStructuredDataList= ruleStructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3382);
            iv_ruleStructuredDataList=ruleStructuredDataList();
            _fsp--;

             current =iv_ruleStructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredDataList3392); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1725:1: ruleStructuredDataList returns [EObject current=null] : ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* ) ')' ) ;
    public final EObject ruleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1730:6: ( ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:1: ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:1: ( () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:2: () '(' ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1731:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1732:5: 
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

            match(input,25,FOLLOW_25_in_ruleStructuredDataList3436); 

                    createLeafNode(grammarAccess.getStructuredDataListAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1746:1: ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* )
            int alt25=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 11:
            case 12:
                {
                alt25=1;
                }
                break;
            case 26:
                {
                alt25=1;
                }
                break;
            case 25:
                {
                alt25=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1746:1: ( ( (lv_list_2_0= ruleFloatDataList ) ) | ( (lv_items_3_0= ruleStructuredDataList ) )* )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1746:2: ( (lv_list_2_0= ruleFloatDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1746:2: ( (lv_list_2_0= ruleFloatDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1747:1: (lv_list_2_0= ruleFloatDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1747:1: (lv_list_2_0= ruleFloatDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1748:3: lv_list_2_0= ruleFloatDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructuredDataListAccess().getListFloatDataListParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3458);
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1771:6: ( (lv_items_3_0= ruleStructuredDataList ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1771:6: ( (lv_items_3_0= ruleStructuredDataList ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==25) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1772:1: (lv_items_3_0= ruleStructuredDataList )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1772:1: (lv_items_3_0= ruleStructuredDataList )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1773:3: lv_items_3_0= ruleStructuredDataList
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStructuredDataListAccess().getItemsStructuredDataListParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStructuredDataList_in_ruleStructuredDataList3485);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleStructuredDataList3497); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1807:1: entryRuleFloatDataList returns [EObject current=null] : iv_ruleFloatDataList= ruleFloatDataList EOF ;
    public final EObject entryRuleFloatDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1808:2: (iv_ruleFloatDataList= ruleFloatDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1809:2: iv_ruleFloatDataList= ruleFloatDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3533);
            iv_ruleFloatDataList=ruleFloatDataList();
            _fsp--;

             current =iv_ruleFloatDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataList3543); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1816:1: ruleFloatDataList returns [EObject current=null] : ( () ( (lv_items_1_0= ruleFloat ) )* ) ;
    public final EObject ruleFloatDataList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1821:6: ( ( () ( (lv_items_1_0= ruleFloat ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1822:1: ( () ( (lv_items_1_0= ruleFloat ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1822:1: ( () ( (lv_items_1_0= ruleFloat ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1822:2: () ( (lv_items_1_0= ruleFloat ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1822:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1823:5: 
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1833:2: ( (lv_items_1_0= ruleFloat ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_INT||(LA26_0>=11 && LA26_0<=12)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1834:1: (lv_items_1_0= ruleFloat )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1834:1: (lv_items_1_0= ruleFloat )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1835:3: lv_items_1_0= ruleFloat
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFloatDataListAccess().getItemsFloatParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFloat_in_ruleFloatDataList3598);
            	    lv_items_1_0=ruleFloat();
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
            	    	        		"Float", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start entryRuleNormalDistribution
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1865:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1866:2: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1867:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNormalDistributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNormalDistribution_in_entryRuleNormalDistribution3635);
            iv_ruleNormalDistribution=ruleNormalDistribution();
            _fsp--;

             current =iv_ruleNormalDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalDistribution3645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNormalDistribution


    // $ANTLR start ruleNormalDistribution
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1874:1: ruleNormalDistribution returns [EObject current=null] : ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_mean_2_0 = null;

        AntlrDatatypeRuleToken lv_variance_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1879:6: ( ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1880:1: ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1880:1: ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1880:3: 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')'
            {
            match(input,39,FOLLOW_39_in_ruleNormalDistribution3680); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getNormalKeyword_0(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNormalDistribution3690); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1888:1: ( (lv_mean_2_0= ruleMeanExpression ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1889:1: (lv_mean_2_0= ruleMeanExpression )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1889:1: (lv_mean_2_0= ruleMeanExpression )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1890:3: lv_mean_2_0= ruleMeanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalDistributionAccess().getMeanMeanExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMeanExpression_in_ruleNormalDistribution3711);
            lv_mean_2_0=ruleMeanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNormalDistributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mean",
            	        		lv_mean_2_0, 
            	        		"MeanExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,40,FOLLOW_40_in_ruleNormalDistribution3721); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getCommaKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1916:1: ( (lv_variance_4_0= ruleFloat ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1917:1: (lv_variance_4_0= ruleFloat )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1917:1: (lv_variance_4_0= ruleFloat )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1918:3: lv_variance_4_0= ruleFloat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalDistributionAccess().getVarianceFloatParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFloat_in_ruleNormalDistribution3742);
            lv_variance_4_0=ruleFloat();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNormalDistributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"variance",
            	        		lv_variance_4_0, 
            	        		"Float", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleNormalDistribution3752); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleNormalDistribution


    // $ANTLR start entryRuleMeanExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1952:1: entryRuleMeanExpression returns [String current=null] : iv_ruleMeanExpression= ruleMeanExpression EOF ;
    public final String entryRuleMeanExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1953:2: (iv_ruleMeanExpression= ruleMeanExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1954:2: iv_ruleMeanExpression= ruleMeanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3789);
            iv_ruleMeanExpression=ruleMeanExpression();
            _fsp--;

             current =iv_ruleMeanExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanExpression3800); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1961:1: ruleMeanExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleMeanExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MeanTerm_0 = null;

        AntlrDatatypeRuleToken this_MeanTerm_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1966:6: ( (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1967:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1967:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1968:5: this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3847);
            this_MeanTerm_0=ruleMeanTerm();
            _fsp--;


            		current.merge(this_MeanTerm_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1978:1: (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==11) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1979:2: kw= '+' this_MeanTerm_2= ruleMeanTerm
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleMeanExpression3866); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getMeanExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	        
            	     
            	            currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_1_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3888);
            	    this_MeanTerm_2=ruleMeanTerm();
            	    _fsp--;


            	    		current.merge(this_MeanTerm_2);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2003:1: entryRuleMeanTerm returns [String current=null] : iv_ruleMeanTerm= ruleMeanTerm EOF ;
    public final String entryRuleMeanTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2004:2: (iv_ruleMeanTerm= ruleMeanTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2005:2: iv_ruleMeanTerm= ruleMeanTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3936);
            iv_ruleMeanTerm=ruleMeanTerm();
            _fsp--;

             current =iv_ruleMeanTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanTerm3947); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2012:1: ruleMeanTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMeanTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_Float_0 = null;

        AntlrDatatypeRuleToken this_Float_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2017:6: ( (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA28_5 = input.LA(4);

                        if ( (LA28_5==RULE_INT) ) {
                            int LA28_8 = input.LA(5);

                            if ( (LA28_8==41) ) {
                                alt28=2;
                            }
                            else if ( (LA28_8==EOF||LA28_8==11||LA28_8==40) ) {
                                alt28=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt28=2;
                        }
                        break;
                    case EOF:
                    case 11:
                    case 40:
                        {
                        alt28=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA28_5 = input.LA(4);

                        if ( (LA28_5==RULE_INT) ) {
                            int LA28_8 = input.LA(5);

                            if ( (LA28_8==41) ) {
                                alt28=2;
                            }
                            else if ( (LA28_8==EOF||LA28_8==11||LA28_8==40) ) {
                                alt28=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt28=2;
                        }
                        break;
                    case EOF:
                    case 11:
                    case 40:
                        {
                        alt28=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA28_5 = input.LA(3);

                    if ( (LA28_5==RULE_INT) ) {
                        int LA28_8 = input.LA(4);

                        if ( (LA28_8==41) ) {
                            alt28=2;
                        }
                        else if ( (LA28_8==EOF||LA28_8==11||LA28_8==40) ) {
                            alt28=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    alt28=2;
                    }
                    break;
                case EOF:
                case 11:
                case 40:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2018:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2019:5: this_Float_0= ruleFloat
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getFloatParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleMeanTerm3994);
                    this_Float_0=ruleFloat();
                    _fsp--;


                    		current.merge(this_Float_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2030:6: (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2030:6: (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2031:5: this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getFloatParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleMeanTerm4028);
                    this_Float_1=ruleFloat();
                    _fsp--;


                    		current.merge(this_Float_1);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleMeanTerm4046); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getMeanTermAccess().getAsteriskKeyword_1_1(), null); 
                        
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4061); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2055:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4088); 

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


    // $ANTLR start entryRulePotentialTableAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2070:1: entryRulePotentialTableAttribute returns [EObject current=null] : iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF ;
    public final EObject entryRulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialTableAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2071:2: (iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2072:2: iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialTableAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4133);
            iv_rulePotentialTableAttribute=rulePotentialTableAttribute();
            _fsp--;

             current =iv_rulePotentialTableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialTableAttribute4143); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2079:1: rulePotentialTableAttribute returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) ;
    public final EObject rulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_samples_1_0 = null;

        EObject lv_data_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2084:6: ( ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2085:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2085:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2085:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2085:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2086:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2086:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2087:3: lv_nodes_0_0= ruleModelNodesAttribute
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getNodesModelNodesAttributeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4189);
            lv_nodes_0_0=ruleModelNodesAttribute();
            _fsp--;


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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2109:2: ( (lv_samples_1_0= ruleSamplesAttribute ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2110:1: (lv_samples_1_0= ruleSamplesAttribute )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2110:1: (lv_samples_1_0= ruleSamplesAttribute )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2111:3: lv_samples_1_0= ruleSamplesAttribute
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getSamplesSamplesAttributeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4210);
                    lv_samples_1_0=ruleSamplesAttribute();
                    _fsp--;


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
                    break;

            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2133:3: ( (lv_data_2_0= ruleModelDataAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2134:1: (lv_data_2_0= ruleModelDataAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2134:1: (lv_data_2_0= ruleModelDataAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2135:3: lv_data_2_0= ruleModelDataAttribute
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getDataModelDataAttributeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4232);
            lv_data_2_0=ruleModelDataAttribute();
            _fsp--;


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
    // $ANTLR end rulePotentialTableAttribute


    // $ANTLR start entryRuleModelNodesAttribute
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2165:1: entryRuleModelNodesAttribute returns [EObject current=null] : iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF ;
    public final EObject entryRuleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2166:2: (iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2167:2: iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelNodesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4268);
            iv_ruleModelNodesAttribute=ruleModelNodesAttribute();
            _fsp--;

             current =iv_ruleModelNodesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodesAttribute4278); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2174:1: ruleModelNodesAttribute returns [EObject current=null] : ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) ;
    public final EObject ruleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_configurations_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2179:6: ( ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2180:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2180:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2180:2: () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2180:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2181:5: 
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

            match(input,42,FOLLOW_42_in_ruleModelNodesAttribute4322); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getModel_nodesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelNodesAttribute4332); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelNodesAttribute4342); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2203:1: ( (lv_configurations_4_0= RULE_ID ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2204:1: (lv_configurations_4_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2204:1: (lv_configurations_4_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2205:3: lv_configurations_4_0= RULE_ID
            	    {
            	    lv_configurations_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodesAttribute4359); 

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
            	    break loop30;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleModelNodesAttribute4375); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelNodesAttribute4385); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2243:1: entryRuleSamplesAttribute returns [EObject current=null] : iv_ruleSamplesAttribute= ruleSamplesAttribute EOF ;
    public final EObject entryRuleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2244:2: (iv_ruleSamplesAttribute= ruleSamplesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2245:2: iv_ruleSamplesAttribute= ruleSamplesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSamplesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4421);
            iv_ruleSamplesAttribute=ruleSamplesAttribute();
            _fsp--;

             current =iv_ruleSamplesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplesAttribute4431); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2252:1: ruleSamplesAttribute returns [EObject current=null] : ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2257:6: ( ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2258:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2258:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2258:3: 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';'
            {
            match(input,43,FOLLOW_43_in_ruleSamplesAttribute4466); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getSamples_per_intervalKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSamplesAttribute4476); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2266:1: ( (lv_value_2_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2267:1: (lv_value_2_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2267:1: (lv_value_2_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2268:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplesAttribute4493); 

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

            match(input,27,FOLLOW_27_in_ruleSamplesAttribute4508); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2302:1: entryRuleModelDataAttribute returns [EObject current=null] : iv_ruleModelDataAttribute= ruleModelDataAttribute EOF ;
    public final EObject entryRuleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2303:2: (iv_ruleModelDataAttribute= ruleModelDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2304:2: iv_ruleModelDataAttribute= ruleModelDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4544);
            iv_ruleModelDataAttribute=ruleModelDataAttribute();
            _fsp--;

             current =iv_ruleModelDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDataAttribute4554); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2311:1: ruleModelDataAttribute returns [EObject current=null] : ( () 'model_data' '=' '(' ')' ';' ) ;
    public final EObject ruleModelDataAttribute() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2316:6: ( ( () 'model_data' '=' '(' ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2317:1: ( () 'model_data' '=' '(' ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2317:1: ( () 'model_data' '=' '(' ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2317:2: () 'model_data' '=' '(' ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2317:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2318:5: 
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

            match(input,44,FOLLOW_44_in_ruleModelDataAttribute4598); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getModel_dataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelDataAttribute4608); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelDataAttribute4618); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            match(input,26,FOLLOW_26_in_ruleModelDataAttribute4628); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelDataAttribute4638); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getSemicolonKeyword_5(), null); 
                

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2356:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2357:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2358:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4674);
            iv_ruleClassDefinition=ruleClassDefinition();
            _fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition4684); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2365:1: ruleClassDefinition returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2370:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2371:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2371:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2371:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}'
            {
            match(input,45,FOLLOW_45_in_ruleClassDefinition4719); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getClassKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2375:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2376:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2376:1: (lv_name_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2377:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition4736); 

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

            match(input,15,FOLLOW_15_in_ruleClassDefinition4751); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2403:1: ( (lv_elements_3_0= ruleClassElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=17 && LA31_0<=23)||(LA31_0>=28 && LA31_0<=30)||(LA31_0>=34 && LA31_0<=36)||(LA31_0>=45 && LA31_0<=46)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2404:1: (lv_elements_3_0= ruleClassElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2404:1: (lv_elements_3_0= ruleClassElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2405:3: lv_elements_3_0= ruleClassElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getClassDefinitionAccess().getElementsClassElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClassDefinition4772);
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
            	    break loop31;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleClassDefinition4783); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2439:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2440:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2441:2: iv_ruleClassElement= ruleClassElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement4819);
            iv_ruleClassElement=ruleClassElement();
            _fsp--;

             current =iv_ruleClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement4829); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2448:1: ruleClassElement returns [EObject current=null] : (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_DomainElement_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_ClassInstance_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2453:6: ( (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2454:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2454:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 36:
            case 45:
                {
                alt32=1;
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
                alt32=2;
                }
                break;
            case 46:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2454:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2455:5: this_DomainElement_0= ruleDomainElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getDomainElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleClassElement4876);
                    this_DomainElement_0=ruleDomainElement();
                    _fsp--;

                     
                            current = this_DomainElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2465:5: this_Attribute_1= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleClassElement4903);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2475:5: this_ClassInstance_2= ruleClassInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getClassInstanceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassInstance_in_ruleClassElement4930);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2491:1: entryRuleClassInstance returns [EObject current=null] : iv_ruleClassInstance= ruleClassInstance EOF ;
    public final EObject entryRuleClassInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInstance = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2492:2: (iv_ruleClassInstance= ruleClassInstance EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2493:2: iv_ruleClassInstance= ruleClassInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassInstance_in_entryRuleClassInstance4965);
            iv_ruleClassInstance=ruleClassInstance();
            _fsp--;

             current =iv_ruleClassInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassInstance4975); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2500:1: ruleClassInstance returns [EObject current=null] : ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) ;
    public final EObject ruleClassInstance() throws RecognitionException {
        EObject current = null;

        Token lv_instanceName_1_0=null;
        Token lv_className_3_0=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;

        EObject lv_attributes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2505:6: ( ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2506:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2506:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2506:3: 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}'
            {
            match(input,46,FOLLOW_46_in_ruleClassInstance5010); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2510:1: ( (lv_instanceName_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2511:1: (lv_instanceName_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2511:1: (lv_instanceName_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2512:3: lv_instanceName_1_0= RULE_ID
            {
            lv_instanceName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5027); 

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

            match(input,47,FOLLOW_47_in_ruleClassInstance5042); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getColonKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2538:1: ( (lv_className_3_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:1: (lv_className_3_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2539:1: (lv_className_3_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2540:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5059); 

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

            match(input,25,FOLLOW_25_in_ruleClassInstance5074); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2566:1: ( (lv_input_5_0= ruleInputBindings ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2567:1: (lv_input_5_0= ruleInputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2567:1: (lv_input_5_0= ruleInputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2568:3: lv_input_5_0= ruleInputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getInputInputBindingsParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInputBindings_in_ruleClassInstance5095);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2590:3: ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2590:5: ';' ( (lv_output_7_0= ruleOutputBindings ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleClassInstance5107); 

                            createLeafNode(grammarAccess.getClassInstanceAccess().getSemicolonKeyword_6_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2594:1: ( (lv_output_7_0= ruleOutputBindings ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2595:1: (lv_output_7_0= ruleOutputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2595:1: (lv_output_7_0= ruleOutputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2596:3: lv_output_7_0= ruleOutputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getOutputOutputBindingsParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOutputBindings_in_ruleClassInstance5128);
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

            match(input,26,FOLLOW_26_in_ruleClassInstance5140); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getRightParenthesisKeyword_7(), null); 
                
            match(input,15,FOLLOW_15_in_ruleClassInstance5150); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2626:1: ( (lv_attributes_10_0= ruleNodeAttributes ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2627:1: (lv_attributes_10_0= ruleNodeAttributes )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2627:1: (lv_attributes_10_0= ruleNodeAttributes )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2628:3: lv_attributes_10_0= ruleNodeAttributes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getAttributesNodeAttributesParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNodeAttributes_in_ruleClassInstance5171);
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

            match(input,16,FOLLOW_16_in_ruleClassInstance5181); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2662:1: entryRuleInputBindings returns [EObject current=null] : iv_ruleInputBindings= ruleInputBindings EOF ;
    public final EObject entryRuleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2663:2: (iv_ruleInputBindings= ruleInputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2664:2: iv_ruleInputBindings= ruleInputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBindings_in_entryRuleInputBindings5217);
            iv_ruleInputBindings=ruleInputBindings();
            _fsp--;

             current =iv_ruleInputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBindings5227); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2671:1: ruleInputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) ;
    public final EObject ruleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2676:6: ( ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2677:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2677:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2677:2: ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2677:2: ( (lv_lhs_0_0= ruleInputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2678:1: (lv_lhs_0_0= ruleInputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2678:1: (lv_lhs_0_0= ruleInputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2679:3: lv_lhs_0_0= ruleInputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBinding_in_ruleInputBindings5273);
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

            match(input,40,FOLLOW_40_in_ruleInputBindings5283); 

                    createLeafNode(grammarAccess.getInputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2705:1: ( (lv_rhs_2_0= ruleInputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2706:1: (lv_rhs_2_0= ruleInputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2706:1: (lv_rhs_2_0= ruleInputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2707:3: lv_rhs_2_0= ruleInputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBindings_in_ruleInputBindings5304);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2737:1: entryRuleInputBinding returns [EObject current=null] : iv_ruleInputBinding= ruleInputBinding EOF ;
    public final EObject entryRuleInputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2738:2: (iv_ruleInputBinding= ruleInputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2739:2: iv_ruleInputBinding= ruleInputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBinding_in_entryRuleInputBinding5340);
            iv_ruleInputBinding=ruleInputBinding();
            _fsp--;

             current =iv_ruleInputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBinding5350); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2746:1: ruleInputBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token lv_actual_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2751:6: ( ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:2: ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2752:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2753:1: (lv_formal_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2753:1: (lv_formal_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2754:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5392); 

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

            match(input,24,FOLLOW_24_in_ruleInputBinding5407); 

                    createLeafNode(grammarAccess.getInputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2780:1: ( (lv_actual_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2781:1: (lv_actual_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2781:1: (lv_actual_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2782:3: lv_actual_2_0= RULE_ID
            {
            lv_actual_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5424); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2812:1: entryRuleOutputBindings returns [EObject current=null] : iv_ruleOutputBindings= ruleOutputBindings EOF ;
    public final EObject entryRuleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2813:2: (iv_ruleOutputBindings= ruleOutputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2814:2: iv_ruleOutputBindings= ruleOutputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5465);
            iv_ruleOutputBindings=ruleOutputBindings();
            _fsp--;

             current =iv_ruleOutputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBindings5475); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2821:1: ruleOutputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) ;
    public final EObject ruleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2826:6: ( ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:2: ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2827:2: ( (lv_lhs_0_0= ruleOutputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2828:1: (lv_lhs_0_0= ruleOutputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2828:1: (lv_lhs_0_0= ruleOutputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2829:3: lv_lhs_0_0= ruleOutputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBinding_in_ruleOutputBindings5521);
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

            match(input,40,FOLLOW_40_in_ruleOutputBindings5531); 

                    createLeafNode(grammarAccess.getOutputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2855:1: ( (lv_rhs_2_0= ruleOutputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2856:1: (lv_rhs_2_0= ruleOutputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2856:1: (lv_rhs_2_0= ruleOutputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2857:3: lv_rhs_2_0= ruleOutputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBindings_in_ruleOutputBindings5552);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2887:1: entryRuleOutputBinding returns [EObject current=null] : iv_ruleOutputBinding= ruleOutputBinding EOF ;
    public final EObject entryRuleOutputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2888:2: (iv_ruleOutputBinding= ruleOutputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2889:2: iv_ruleOutputBinding= ruleOutputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5588);
            iv_ruleOutputBinding=ruleOutputBinding();
            _fsp--;

             current =iv_ruleOutputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBinding5598); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2896:1: ruleOutputBinding returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2901:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2902:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2902:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2902:2: ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2902:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2903:1: (lv_actual_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2903:1: (lv_actual_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2904:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5640); 

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

            match(input,24,FOLLOW_24_in_ruleOutputBinding5655); 

                    createLeafNode(grammarAccess.getOutputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2930:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2931:1: (lv_formal_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2931:1: (lv_formal_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2932:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5672); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2962:1: entryRuleNodeAttributes returns [EObject current=null] : iv_ruleNodeAttributes= ruleNodeAttributes EOF ;
    public final EObject entryRuleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributes = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2963:2: (iv_ruleNodeAttributes= ruleNodeAttributes EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2964:2: iv_ruleNodeAttributes= ruleNodeAttributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeAttributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5713);
            iv_ruleNodeAttributes=ruleNodeAttributes();
            _fsp--;

             current =iv_ruleNodeAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttributes5723); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2971:1: ruleNodeAttributes returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) ;
    public final EObject ruleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;

        EObject this_ApplicationAttribute_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2976:6: ( (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2977:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2977:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt35=1;
                }
                break;
            case 29:
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
                NoViableAltException nvae =
                    new NoViableAltException("2977:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2978:5: this_LabelAttribute_0= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getLabelAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5770);
                    this_LabelAttribute_0=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2988:5: this_PositionAttribute_1= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getPositionAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5797);
                    this_PositionAttribute_1=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2998:5: this_ApplicationAttribute_2= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getApplicationAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5824);
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


    // $ANTLR start entryRuleExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3014:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3015:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3016:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5859);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5869); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3023:1: ruleExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3028:6: ( ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3029:1: ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3029:1: ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3029:2: ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3029:2: ( (lv_lhs_0_0= ruleSimpleExpression ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3030:1: (lv_lhs_0_0= ruleSimpleExpression )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3030:1: (lv_lhs_0_0= ruleSimpleExpression )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3031:3: lv_lhs_0_0= ruleSimpleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLhsSimpleExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression5915);
            lv_lhs_0_0=ruleSimpleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lhs",
            	        		lv_lhs_0_0, 
            	        		"SimpleExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3053:2: ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==24||(LA36_0>=51 && LA36_0<=57)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3054:5: ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleComparison_in_ruleExpression5932);
            	    ruleComparison();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3061:1: ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3062:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3062:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3063:3: lv_rhs_2_0= ruleSimpleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRhsSimpleExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression5952);
            	    lv_rhs_2_0=ruleSimpleExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rhs",
            	    	        		lv_rhs_2_0, 
            	    	        		"SimpleExpression", 
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
            	    break loop36;
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleSimpleExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3093:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3094:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3095:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression5990);
            iv_ruleSimpleExpression=ruleSimpleExpression();
            _fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression6000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleExpression


    // $ANTLR start ruleSimpleExpression
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3102:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3107:6: ( ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3108:1: ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3108:1: ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3108:2: ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3108:2: ( (lv_lhs_0_0= ruleTerm ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3109:1: (lv_lhs_0_0= ruleTerm )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3109:1: (lv_lhs_0_0= ruleTerm )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3110:3: lv_lhs_0_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getLhsTermParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleSimpleExpression6046);
            lv_lhs_0_0=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lhs",
            	        		lv_lhs_0_0, 
            	        		"Term", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3132:2: ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==11) ) {
                    alt37=1;
                }
                else if ( (LA37_0==12) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3133:5: rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getPlusOrMinusParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleSimpleExpression6063);
            	    rulePlusOrMinus();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3140:1: ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3141:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3142:3: lv_rhs_2_0= ruleSimpleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getRhsSimpleExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleSimpleExpression6083);
            	    lv_rhs_2_0=ruleSimpleExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSimpleExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rhs",
            	    	        		lv_rhs_2_0, 
            	    	        		"SimpleExpression", 
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
            	    break loop37;
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
    // $ANTLR end ruleSimpleExpression


    // $ANTLR start entryRuleTerm
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3172:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3173:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3174:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm6121);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm6131); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3181:1: ruleTerm returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3186:6: ( ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:1: ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:1: ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:2: ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3187:2: ( (lv_lhs_0_0= ruleExpFactor ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3188:1: (lv_lhs_0_0= ruleExpFactor )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3188:1: (lv_lhs_0_0= ruleExpFactor )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3189:3: lv_lhs_0_0= ruleExpFactor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getLhsExpFactorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpFactor_in_ruleTerm6177);
            lv_lhs_0_0=ruleExpFactor();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lhs",
            	        		lv_lhs_0_0, 
            	        		"ExpFactor", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3211:2: ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==41) ) {
                    alt38=1;
                }
                else if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3212:5: ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTimesOrDivideParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleTimesOrDivide_in_ruleTerm6194);
            	    ruleTimesOrDivide();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3219:1: ( (lv_rhs_2_0= ruleTerm ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3220:1: (lv_rhs_2_0= ruleTerm )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3220:1: (lv_rhs_2_0= ruleTerm )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3221:3: lv_rhs_2_0= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getRhsTermParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerm6214);
            	    lv_rhs_2_0=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rhs",
            	    	        		lv_rhs_2_0, 
            	    	        		"Term", 
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
            	    break loop38;
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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleExpFactor
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3251:1: entryRuleExpFactor returns [EObject current=null] : iv_ruleExpFactor= ruleExpFactor EOF ;
    public final EObject entryRuleExpFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpFactor = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3252:2: (iv_ruleExpFactor= ruleExpFactor EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3253:2: iv_ruleExpFactor= ruleExpFactor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpFactorRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpFactor_in_entryRuleExpFactor6252);
            iv_ruleExpFactor=ruleExpFactor();
            _fsp--;

             current =iv_ruleExpFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpFactor6262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpFactor


    // $ANTLR start ruleExpFactor
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3260:1: ruleExpFactor returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* ) ;
    public final EObject ruleExpFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3265:6: ( ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3266:1: ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3266:1: ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3266:2: ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3266:2: ( (lv_lhs_0_0= ruleFactor ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3267:1: (lv_lhs_0_0= ruleFactor )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3267:1: (lv_lhs_0_0= ruleFactor )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3268:3: lv_lhs_0_0= ruleFactor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpFactorAccess().getLhsFactorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFactor_in_ruleExpFactor6308);
            lv_lhs_0_0=ruleFactor();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpFactorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lhs",
            	        		lv_lhs_0_0, 
            	        		"Factor", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3290:2: ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==48) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3290:4: '^' ( (lv_rhs_2_0= ruleExpFactor ) )
            	    {
            	    match(input,48,FOLLOW_48_in_ruleExpFactor6319); 

            	            createLeafNode(grammarAccess.getExpFactorAccess().getCircumflexAccentKeyword_1_0(), null); 
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3294:1: ( (lv_rhs_2_0= ruleExpFactor ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3295:1: (lv_rhs_2_0= ruleExpFactor )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3295:1: (lv_rhs_2_0= ruleExpFactor )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3296:3: lv_rhs_2_0= ruleExpFactor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpFactorAccess().getRhsExpFactorParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpFactor_in_ruleExpFactor6340);
            	    lv_rhs_2_0=ruleExpFactor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExpFactorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rhs",
            	    	        		lv_rhs_2_0, 
            	    	        		"ExpFactor", 
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
            	    break loop39;
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
    // $ANTLR end ruleExpFactor


    // $ANTLR start entryRuleFactor
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3326:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3327:2: (iv_ruleFactor= ruleFactor EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3328:2: iv_ruleFactor= ruleFactor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFactorRule(), currentNode); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor6378);
            iv_ruleFactor=ruleFactor();
            _fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor6388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFactor


    // $ANTLR start ruleFactor
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3335:1: ruleFactor returns [EObject current=null] : ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        Token lv_nodeName_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        EObject lv_expression_7_0 = null;

        AntlrDatatypeRuleToken lv_op_9_0 = null;

        EObject lv_sequence_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3340:6: ( ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt40=1;
                }
                break;
            case RULE_ID:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
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
            case 25:
                {
                alt40=6;
                }
                break;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3341:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:3: () ( (lv_number_1_0= RULE_INT ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3341:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3342:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getFactorAccess().getFactorAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getFactorAccess().getFactorAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3352:2: ( (lv_number_1_0= RULE_INT ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3353:1: (lv_number_1_0= RULE_INT )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3353:1: (lv_number_1_0= RULE_INT )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3354:3: lv_number_1_0= RULE_INT
                    {
                    lv_number_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFactor6440); 

                    			createLeafNode(grammarAccess.getFactorAccess().getNumberINTTerminalRuleCall_0_1_0(), "number"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"number",
                    	        		lv_number_1_0, 
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
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3377:6: ( (lv_nodeName_2_0= RULE_ID ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3377:6: ( (lv_nodeName_2_0= RULE_ID ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3378:1: (lv_nodeName_2_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3378:1: (lv_nodeName_2_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3379:3: lv_nodeName_2_0= RULE_ID
                    {
                    lv_nodeName_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor6469); 

                    			createLeafNode(grammarAccess.getFactorAccess().getNodeNameIDTerminalRuleCall_1_0(), "nodeName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"nodeName",
                    	        		lv_nodeName_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3402:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3402:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3403:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3403:1: (lv_value_3_0= RULE_STRING )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3404:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor6497); 

                    			createLeafNode(grammarAccess.getFactorAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3427:6: ( (lv_value_4_0= 'false' ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3427:6: ( (lv_value_4_0= 'false' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3428:1: (lv_value_4_0= 'false' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3428:1: (lv_value_4_0= 'false' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3429:3: lv_value_4_0= 'false'
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleFactor6526); 

                            createLeafNode(grammarAccess.getFactorAccess().getValueFalseKeyword_3_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_4_0, "false", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:6: ( (lv_value_5_0= 'true' ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:6: ( (lv_value_5_0= 'true' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3450:1: (lv_value_5_0= 'true' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3450:1: (lv_value_5_0= 'true' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3451:3: lv_value_5_0= 'true'
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleFactor6563); 

                            createLeafNode(grammarAccess.getFactorAccess().getValueTrueKeyword_4_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_5_0, "true", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3471:6: ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3471:6: ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3471:8: '(' ( (lv_expression_7_0= ruleExpression ) ) ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleFactor6593); 

                            createLeafNode(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_5_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3475:1: ( (lv_expression_7_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3476:1: (lv_expression_7_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3476:1: (lv_expression_7_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3477:3: lv_expression_7_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFactor6614);
                    lv_expression_7_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_7_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleFactor6624); 

                            createLeafNode(grammarAccess.getFactorAccess().getRightParenthesisKeyword_5_2(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3504:6: ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3504:6: ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3504:7: ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3504:7: ( (lv_op_9_0= ruleOperatorName ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3505:1: (lv_op_9_0= ruleOperatorName )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3505:1: (lv_op_9_0= ruleOperatorName )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3506:3: lv_op_9_0= ruleOperatorName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getOpOperatorNameParserRuleCall_6_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperatorName_in_ruleFactor6653);
                    lv_op_9_0=ruleOperatorName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_9_0, 
                    	        		"OperatorName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleFactor6663); 

                            createLeafNode(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3532:1: ( (lv_sequence_11_0= ruleExpressionSequence ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3533:1: (lv_sequence_11_0= ruleExpressionSequence )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3533:1: (lv_sequence_11_0= ruleExpressionSequence )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3534:3: lv_sequence_11_0= ruleExpressionSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getSequenceExpressionSequenceParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionSequence_in_ruleFactor6684);
                    lv_sequence_11_0=ruleExpressionSequence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"sequence",
                    	        		lv_sequence_11_0, 
                    	        		"ExpressionSequence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleFactor6694); 

                            createLeafNode(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_3(), null); 
                        

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
    // $ANTLR end ruleFactor


    // $ANTLR start entryRuleExpressionSequence
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3568:1: entryRuleExpressionSequence returns [EObject current=null] : iv_ruleExpressionSequence= ruleExpressionSequence EOF ;
    public final EObject entryRuleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSequence = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3569:2: (iv_ruleExpressionSequence= ruleExpressionSequence EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3570:2: iv_ruleExpressionSequence= ruleExpressionSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6731);
            iv_ruleExpressionSequence=ruleExpressionSequence();
            _fsp--;

             current =iv_ruleExpressionSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSequence6741); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3577:1: ruleExpressionSequence returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3582:6: ( ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3583:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3583:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3583:2: () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3583:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3584:5: 
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3594:2: ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_INT && LA42_0<=RULE_STRING)||LA42_0==25||(LA42_0>=49 && LA42_0<=50)||(LA42_0>=59 && LA42_0<=73)||(LA42_0>=75 && LA42_0<=95)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3594:3: ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3594:3: ( (lv_expressions_1_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3595:1: (lv_expressions_1_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3595:1: (lv_expressions_1_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3596:3: lv_expressions_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6797);
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3618:2: ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==40) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3618:4: ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    match(input,40,FOLLOW_40_in_ruleExpressionSequence6808); 

                    	            createLeafNode(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3622:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3623:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3624:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6829);
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
                    	    break loop41;
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


    // $ANTLR start entryRuleComparison
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3654:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3655:2: (iv_ruleComparison= ruleComparison EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3656:2: iv_ruleComparison= ruleComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison6870);
            iv_ruleComparison=ruleComparison();
            _fsp--;

             current =iv_ruleComparison.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison6881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComparison


    // $ANTLR start ruleComparison
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3663:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3668:6: ( (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3669:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3669:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt43=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt43=1;
                }
                break;
            case 24:
                {
                alt43=2;
                }
                break;
            case 52:
                {
                alt43=3;
                }
                break;
            case 53:
                {
                alt43=4;
                }
                break;
            case 54:
                {
                alt43=5;
                }
                break;
            case 55:
                {
                alt43=6;
                }
                break;
            case 56:
                {
                alt43=7;
                }
                break;
            case 57:
                {
                alt43=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3669:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3670:2: kw= '=='
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleComparison6919); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3677:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleComparison6938); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3684:2: kw= '!='
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleComparison6957); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3691:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleComparison6976); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3698:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleComparison6995); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3705:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleComparison7014); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3712:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleComparison7033); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3719:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleComparison7052); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_7(), null); 
                        

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
    // $ANTLR end ruleComparison


    // $ANTLR start entryRulePlusOrMinus
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3732:1: entryRulePlusOrMinus returns [String current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final String entryRulePlusOrMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOrMinus = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3733:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3734:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlusOrMinusRule(), currentNode); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus7093);
            iv_rulePlusOrMinus=rulePlusOrMinus();
            _fsp--;

             current =iv_rulePlusOrMinus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus7104); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlusOrMinus


    // $ANTLR start rulePlusOrMinus
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3741:1: rulePlusOrMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePlusOrMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3746:6: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3747:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3747:1: (kw= '+' | kw= '-' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            else if ( (LA44_0==12) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3747:1: (kw= '+' | kw= '-' )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3748:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_rulePlusOrMinus7142); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3755:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePlusOrMinus7161); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1(), null); 
                        

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
    // $ANTLR end rulePlusOrMinus


    // $ANTLR start entryRuleTimesOrDivide
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3768:1: entryRuleTimesOrDivide returns [String current=null] : iv_ruleTimesOrDivide= ruleTimesOrDivide EOF ;
    public final String entryRuleTimesOrDivide() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesOrDivide = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3769:2: (iv_ruleTimesOrDivide= ruleTimesOrDivide EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3770:2: iv_ruleTimesOrDivide= ruleTimesOrDivide EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTimesOrDivideRule(), currentNode); 
            pushFollow(FOLLOW_ruleTimesOrDivide_in_entryRuleTimesOrDivide7202);
            iv_ruleTimesOrDivide=ruleTimesOrDivide();
            _fsp--;

             current =iv_ruleTimesOrDivide.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesOrDivide7213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTimesOrDivide


    // $ANTLR start ruleTimesOrDivide
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3777:1: ruleTimesOrDivide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleTimesOrDivide() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3782:6: ( (kw= '*' | kw= '/' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3783:1: (kw= '*' | kw= '/' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3783:1: (kw= '*' | kw= '/' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            else if ( (LA45_0==58) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3783:1: (kw= '*' | kw= '/' )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3784:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleTimesOrDivide7251); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimesOrDivideAccess().getAsteriskKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3791:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleTimesOrDivide7270); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimesOrDivideAccess().getSolidusKeyword_1(), null); 
                        

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
    // $ANTLR end ruleTimesOrDivide


    // $ANTLR start entryRuleOperatorName
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3804:1: entryRuleOperatorName returns [String current=null] : iv_ruleOperatorName= ruleOperatorName EOF ;
    public final String entryRuleOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorName = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3805:2: (iv_ruleOperatorName= ruleOperatorName EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3806:2: iv_ruleOperatorName= ruleOperatorName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperatorNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperatorName_in_entryRuleOperatorName7311);
            iv_ruleOperatorName=ruleOperatorName();
            _fsp--;

             current =iv_ruleOperatorName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorName7322); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3813:1: ruleOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3818:6: ( (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3819:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3819:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            int alt46=36;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt46=1;
                }
                break;
            case 60:
                {
                alt46=2;
                }
                break;
            case 61:
                {
                alt46=3;
                }
                break;
            case 62:
                {
                alt46=4;
                }
                break;
            case 63:
                {
                alt46=5;
                }
                break;
            case 64:
                {
                alt46=6;
                }
                break;
            case 65:
                {
                alt46=7;
                }
                break;
            case 66:
                {
                alt46=8;
                }
                break;
            case 67:
                {
                alt46=9;
                }
                break;
            case 68:
                {
                alt46=10;
                }
                break;
            case 69:
                {
                alt46=11;
                }
                break;
            case 70:
                {
                alt46=12;
                }
                break;
            case 71:
                {
                alt46=13;
                }
                break;
            case 72:
                {
                alt46=14;
                }
                break;
            case 73:
                {
                alt46=15;
                }
                break;
            case 75:
                {
                alt46=16;
                }
                break;
            case 76:
                {
                alt46=17;
                }
                break;
            case 77:
                {
                alt46=18;
                }
                break;
            case 78:
                {
                alt46=19;
                }
                break;
            case 79:
                {
                alt46=20;
                }
                break;
            case 80:
                {
                alt46=21;
                }
                break;
            case 81:
                {
                alt46=22;
                }
                break;
            case 82:
                {
                alt46=23;
                }
                break;
            case 83:
                {
                alt46=24;
                }
                break;
            case 84:
                {
                alt46=25;
                }
                break;
            case 85:
                {
                alt46=26;
                }
                break;
            case 86:
                {
                alt46=27;
                }
                break;
            case 87:
                {
                alt46=28;
                }
                break;
            case 88:
                {
                alt46=29;
                }
                break;
            case 89:
                {
                alt46=30;
                }
                break;
            case 90:
                {
                alt46=31;
                }
                break;
            case 91:
                {
                alt46=32;
                }
                break;
            case 92:
                {
                alt46=33;
                }
                break;
            case 93:
                {
                alt46=34;
                }
                break;
            case 94:
                {
                alt46=35;
                }
                break;
            case 95:
                {
                alt46=36;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3819:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3820:2: kw= 'truncate'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_ruleOperatorName7360); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTruncateKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3827:2: kw= 'Normal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FOLLOW_60_in_ruleOperatorName7379); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNormalKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3834:2: kw= 'LogNormal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_ruleOperatorName7398); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogNormalKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3841:2: kw= 'Beta'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_ruleOperatorName7417); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBetaKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3848:2: kw= 'Gamma'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleOperatorName7436); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGammaKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3855:2: kw= 'Exponential'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleOperatorName7455); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExponentialKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3862:2: kw= 'Weibull'
                    {
                    kw=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_ruleOperatorName7474); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getWeibullKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3869:2: kw= 'Uniform'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_ruleOperatorName7493); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getUniformKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3876:2: kw= 'Triangular'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleOperatorName7512); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTriangularKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3883:2: kw= 'PERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_ruleOperatorName7531); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPERTKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3890:2: kw= 'Binomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleOperatorName7550); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBinomialKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3897:2: kw= 'Poisson'
                    {
                    kw=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_ruleOperatorName7569); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPoissonKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3904:2: kw= 'NegativeBinomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_ruleOperatorName7588); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNegativeBinomialKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3911:2: kw= 'Geometric'
                    {
                    kw=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ruleOperatorName7607); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGeometricKeyword_13(), null); 
                        

                    }
                    break;
                case 15 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3917:6: (kw= 'Distribution' kw= 'NoisyOR' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3917:6: (kw= 'Distribution' kw= 'NoisyOR' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3918:2: kw= 'Distribution' kw= 'NoisyOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_ruleOperatorName7627); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getDistributionKeyword_14_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ruleOperatorName7640); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNoisyORKeyword_14_1(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3931:2: kw= 'min'
                    {
                    kw=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_ruleOperatorName7660); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMinKeyword_15(), null); 
                        

                    }
                    break;
                case 17 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3938:2: kw= 'max'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleOperatorName7679); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMaxKeyword_16(), null); 
                        

                    }
                    break;
                case 18 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3945:2: kw= 'log'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleOperatorName7698); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogKeyword_17(), null); 
                        

                    }
                    break;
                case 19 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3952:2: kw= 'log2'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleOperatorName7717); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog2Keyword_18(), null); 
                        

                    }
                    break;
                case 20 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3959:2: kw= 'log10'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleOperatorName7736); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog10Keyword_19(), null); 
                        

                    }
                    break;
                case 21 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3966:2: kw= 'exp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleOperatorName7755); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExpKeyword_20(), null); 
                        

                    }
                    break;
                case 22 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3973:2: kw= 'sin'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleOperatorName7774); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinKeyword_21(), null); 
                        

                    }
                    break;
                case 23 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3980:2: kw= 'cos'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleOperatorName7793); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCosKeyword_22(), null); 
                        

                    }
                    break;
                case 24 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3987:2: kw= 'tan'
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleOperatorName7812); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanKeyword_23(), null); 
                        

                    }
                    break;
                case 25 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3994:2: kw= 'sinh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleOperatorName7831); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinhKeyword_24(), null); 
                        

                    }
                    break;
                case 26 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4001:2: kw= 'cosh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleOperatorName7850); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCoshKeyword_25(), null); 
                        

                    }
                    break;
                case 27 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4008:2: kw= 'tanh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleOperatorName7869); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanhKeyword_26(), null); 
                        

                    }
                    break;
                case 28 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4015:2: kw= 'sqrt'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleOperatorName7888); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSqrtKeyword_27(), null); 
                        

                    }
                    break;
                case 29 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4022:2: kw= 'abs'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleOperatorName7907); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAbsKeyword_28(), null); 
                        

                    }
                    break;
                case 30 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4029:2: kw= 'floor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_ruleOperatorName7926); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getFloorKeyword_29(), null); 
                        

                    }
                    break;
                case 31 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4036:2: kw= 'ceil'
                    {
                    kw=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ruleOperatorName7945); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCeilKeyword_30(), null); 
                        

                    }
                    break;
                case 32 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4043:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ruleOperatorName7964); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getModKeyword_31(), null); 
                        

                    }
                    break;
                case 33 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4050:2: kw= 'if'
                    {
                    kw=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_ruleOperatorName7983); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getIfKeyword_32(), null); 
                        

                    }
                    break;
                case 34 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4057:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_ruleOperatorName8002); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAndKeyword_33(), null); 
                        

                    }
                    break;
                case 35 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4064:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,94,FOLLOW_94_in_ruleOperatorName8021); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getOrKeyword_34(), null); 
                        

                    }
                    break;
                case 36 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4071:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_ruleOperatorName8040); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNotKeyword_35(), null); 
                        

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
    public static final BitSet FOLLOW_ruleSign_in_entryRuleSign173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSign184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSign226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSign245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleFloat349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat371 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFloat390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDefinition462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_ruleDomainDefinition508 = new BitSet(new long[]{0x00002010007E0002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomainDefinition529 = new BitSet(new long[]{0x00002010007E0002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainHeader576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainHeader620 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDomainHeader630 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainHeader651 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_16_in_ruleDomainHeader662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_ruleDomainElement755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_ruleDomainElement782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleDomainElement809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_ruleAttribute901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleAttribute928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleAttribute955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_ruleAttribute982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_ruleAttribute1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleAttribute1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_entryRuleBasicNode1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNode1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1154 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicNode1171 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBasicNode1187 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBasicNode1208 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_16_in_ruleBasicNode1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNodeKeyword1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBasicNodeKeyword1307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleBasicNodeKeyword1326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBasicNodeKeyword1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicNodeKeyword1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicNodeKeyword1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicNodeKeyword1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatesAttribute1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStatesAttribute1493 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatesAttribute1503 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatesAttribute1513 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatesAttribute1530 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_ruleStatesAttribute1546 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatesAttribute1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelAttribute1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLabelAttribute1637 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabelAttribute1647 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelAttribute1664 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLabelAttribute1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionAttribute1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePositionAttribute1760 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePositionAttribute1770 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePositionAttribute1780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionAttribute1797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionAttribute1819 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePositionAttribute1834 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePositionAttribute1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeAttribute1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSubtypeAttribute1925 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubtypeAttribute1935 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleSubtypeAttribute1955 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31_in_ruleSubtypeAttribute1984 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32_in_ruleSubtypeAttribute2013 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33_in_ruleSubtypeAttribute2042 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubtypeAttribute2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateValuesAttribute2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateValuesAttribute2149 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateValuesAttribute2159 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStateValuesAttribute2169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStateValuesAttribute2186 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleStateValuesAttribute2202 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStateValuesAttribute2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationAttribute2300 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleApplicationAttribute2315 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationAttribute2332 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleApplicationAttribute2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSizeAttribute2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNodeSizeAttribute2428 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNodeSizeAttribute2438 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNodeSizeAttribute2448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2487 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeSizeAttribute2502 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeSizeAttribute2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_entryRulePotential2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotential2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePotential2593 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_rulePotential2614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulePotentialModel_in_rulePotential2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialGraph2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePotentialGraph2725 = new BitSet(new long[]{0x0000002004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2742 = new BitSet(new long[]{0x0000002004000020L});
    public static final BitSet FOLLOW_37_in_rulePotentialGraph2759 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2776 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePotentialGraph2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialModel_in_entryRulePotentialModel2830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialModel2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePotentialModel2884 = new BitSet(new long[]{0x0000044000010000L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_rulePotentialModel2905 = new BitSet(new long[]{0x0000044000010000L});
    public static final BitSet FOLLOW_16_in_rulePotentialModel2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialAttribute2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialDataAttribute3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePotentialDataAttribute3125 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePotentialDataAttribute3135 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePotentialDataAttribute3145 = new BitSet(new long[]{0x0000008006001810L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_rulePotentialDataAttribute3167 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_rulePotentialDataAttribute3194 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_rulePotentialDataAttribute3206 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePotentialDataAttribute3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnstructuredDataList3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_ruleUnstructuredDataList3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDistribution_in_ruleUnstructuredDataList3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredDataList3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStructuredDataList3436 = new BitSet(new long[]{0x0000000006001810L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3458 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_ruleStructuredDataList3485 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleStructuredDataList3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataList3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleFloatDataList3598 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_ruleNormalDistribution_in_entryRuleNormalDistribution3635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalDistribution3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNormalDistribution3680 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNormalDistribution3690 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_ruleMeanExpression_in_ruleNormalDistribution3711 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleNormalDistribution3721 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleNormalDistribution3742 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNormalDistribution3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanExpression3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3847 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleMeanExpression3866 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3888 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanTerm3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleMeanTerm3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleMeanTerm4028 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMeanTerm4046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialTableAttribute4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4189 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4210 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodesAttribute4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModelNodesAttribute4322 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelNodesAttribute4332 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelNodesAttribute4342 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodesAttribute4359 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_ruleModelNodesAttribute4375 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelNodesAttribute4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplesAttribute4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSamplesAttribute4466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSamplesAttribute4476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplesAttribute4493 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSamplesAttribute4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDataAttribute4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModelDataAttribute4598 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelDataAttribute4608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelDataAttribute4618 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelDataAttribute4628 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelDataAttribute4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleClassDefinition4719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition4736 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassDefinition4751 = new BitSet(new long[]{0x0000601C70FF0020L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClassDefinition4772 = new BitSet(new long[]{0x0000601C70FF0020L});
    public static final BitSet FOLLOW_16_in_ruleClassDefinition4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement4819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleClassElement4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClassElement4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_ruleClassElement4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_entryRuleClassInstance4965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassInstance4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleClassInstance5010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5027 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleClassInstance5042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassInstance5074 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleClassInstance5095 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleClassInstance5107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleClassInstance5128 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleClassInstance5140 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassInstance5150 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_ruleClassInstance5171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassInstance5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBindings_in_entryRuleInputBindings5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBindings5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_ruleInputBindings5273 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleInputBindings5283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleInputBindings5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_entryRuleInputBinding5340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBinding5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5392 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInputBinding5407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBindings5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_ruleOutputBindings5521 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleOutputBindings5531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleOutputBindings5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBinding5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5640 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOutputBinding5655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttributes5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression5915 = new BitSet(new long[]{0x03F8000001000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression5932 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression5952 = new BitSet(new long[]{0x03F8000001000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression5990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleSimpleExpression6046 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleSimpleExpression6063 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleSimpleExpression6083 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm6121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpFactor_in_ruleTerm6177 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_ruleTimesOrDivide_in_ruleTerm6194 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerm6214 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_ruleExpFactor_in_entryRuleExpFactor6252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpFactor6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExpFactor6308 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExpFactor6319 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpFactor_in_ruleExpFactor6340 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor6378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFactor6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFactor6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFactor6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFactor6593 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactor6614 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFactor6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_ruleFactor6653 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFactor6663 = new BitSet(new long[]{0xF806000006000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleFactor6684 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFactor6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSequence6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6797 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpressionSequence6808 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6829 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison6870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleComparison6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparison6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComparison6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleComparison6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleComparison6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleComparison7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleComparison7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparison7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus7093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePlusOrMinus7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlusOrMinus7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesOrDivide_in_entryRuleTimesOrDivide7202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesOrDivide7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTimesOrDivide7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTimesOrDivide7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_entryRuleOperatorName7311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorName7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOperatorName7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOperatorName7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOperatorName7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOperatorName7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOperatorName7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorName7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorName7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorName7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorName7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorName7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperatorName7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorName7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorName7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorName7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorName7627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleOperatorName7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperatorName7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperatorName7679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperatorName7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperatorName7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperatorName7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperatorName7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperatorName7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperatorName7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperatorName7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperatorName7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperatorName7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperatorName7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperatorName7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperatorName7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorName7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOperatorName7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOperatorName7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperatorName7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperatorName8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOperatorName8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOperatorName8040 = new BitSet(new long[]{0x0000000000000002L});

}