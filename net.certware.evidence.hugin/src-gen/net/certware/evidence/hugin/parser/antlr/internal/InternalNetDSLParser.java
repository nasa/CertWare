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


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:174:2: (iv_ruleFloat= ruleFloat EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:175:2: iv_ruleFloat= ruleFloat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat296);
            iv_ruleFloat=ruleFloat();
            _fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat307); 

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
    // $ANTLR end entryRuleFloat


    // $ANTLR start ruleFloat
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:185:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:191:6: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:192:2: (this_Sign_0= ruleSign )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:193:5: this_Sign_0= ruleSign
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFloatAccess().getSignParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSign_in_ruleFloat359);
                    this_Sign_0=ruleSign();
                    _fsp--;


                    		current.merge(this_Sign_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat381); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:210:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:211:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleFloat400); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getFloatAccess().getFullStopKeyword_2_0(), null); 
                        
                    this_INT_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat415); 

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleFloat


    // $ANTLR start entryRuleDomainDefinition
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:234:1: entryRuleDomainDefinition returns [EObject current=null] : iv_ruleDomainDefinition= ruleDomainDefinition EOF ;
    public final EObject entryRuleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:235:2: (iv_ruleDomainDefinition= ruleDomainDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:236:2: iv_ruleDomainDefinition= ruleDomainDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition466);
            iv_ruleDomainDefinition=ruleDomainDefinition();
            _fsp--;

             current =iv_ruleDomainDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDefinition476); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:243:1: ruleDomainDefinition returns [EObject current=null] : ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) ;
    public final EObject ruleDomainDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:248:6: ( ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:249:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:249:1: ( ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:249:2: ( (lv_header_0_0= ruleDomainHeader ) ) ( (lv_elements_1_0= ruleDomainElement ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:249:2: ( (lv_header_0_0= ruleDomainHeader ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:250:1: (lv_header_0_0= ruleDomainHeader )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:250:1: (lv_header_0_0= ruleDomainHeader )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:251:3: lv_header_0_0= ruleDomainHeader
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getHeaderDomainHeaderParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainHeader_in_ruleDomainDefinition522);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:273:2: ( (lv_elements_1_0= ruleDomainElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=22)||LA5_0==36||LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:274:1: (lv_elements_1_0= ruleDomainElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:274:1: (lv_elements_1_0= ruleDomainElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:275:3: lv_elements_1_0= ruleDomainElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainDefinitionAccess().getElementsDomainElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomainDefinition543);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:305:1: entryRuleDomainHeader returns [EObject current=null] : iv_ruleDomainHeader= ruleDomainHeader EOF ;
    public final EObject entryRuleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainHeader = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:306:2: (iv_ruleDomainHeader= ruleDomainHeader EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:307:2: iv_ruleDomainHeader= ruleDomainHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader580);
            iv_ruleDomainHeader=ruleDomainHeader();
            _fsp--;

             current =iv_ruleDomainHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainHeader590); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:314:1: ruleDomainHeader returns [EObject current=null] : ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleDomainHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:319:6: ( ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:320:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:320:1: ( () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:320:2: () 'net' '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:320:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:321:5: 
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

            match(input,14,FOLLOW_14_in_ruleDomainHeader634); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getNetKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleDomainHeader644); 

                    createLeafNode(grammarAccess.getDomainHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:339:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23||(LA6_0>=28 && LA6_0<=30)||(LA6_0>=34 && LA6_0<=35)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:340:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:340:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:341:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainHeaderAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainHeader665);
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

            match(input,16,FOLLOW_16_in_ruleDomainHeader676); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:375:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:376:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:377:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement712);
            iv_ruleDomainElement=ruleDomainElement();
            _fsp--;

             current =iv_ruleDomainElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement722); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:384:1: ruleDomainElement returns [EObject current=null] : (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicNode_0 = null;

        EObject this_Potential_1 = null;

        EObject this_ClassDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:389:6: ( (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:390:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:390:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )
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
                    new NoViableAltException("390:1: (this_BasicNode_0= ruleBasicNode | this_Potential_1= rulePotential | this_ClassDefinition_2= ruleClassDefinition )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:391:5: this_BasicNode_0= ruleBasicNode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getBasicNodeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBasicNode_in_ruleDomainElement769);
                    this_BasicNode_0=ruleBasicNode();
                    _fsp--;

                     
                            current = this_BasicNode_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:401:5: this_Potential_1= rulePotential
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getPotentialParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotential_in_ruleDomainElement796);
                    this_Potential_1=rulePotential();
                    _fsp--;

                     
                            current = this_Potential_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:411:5: this_ClassDefinition_2= ruleClassDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainElementAccess().getClassDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassDefinition_in_ruleDomainElement823);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:427:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:428:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:429:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute858);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute868); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:436:1: ruleAttribute returns [EObject current=null] : (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) ;
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
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:441:6: ( (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:442:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:442:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )
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
                    new NoViableAltException("442:1: (this_StatesAttribute_0= ruleStatesAttribute | this_LabelAttribute_1= ruleLabelAttribute | this_PositionAttribute_2= rulePositionAttribute | this_SubtypeAttribute_3= ruleSubtypeAttribute | this_StateValuesAttribute_4= ruleStateValuesAttribute | this_ApplicationAttribute_5= ruleApplicationAttribute | this_NodeSizeAttribute_6= ruleNodeSizeAttribute )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:443:5: this_StatesAttribute_0= ruleStatesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStatesAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatesAttribute_in_ruleAttribute915);
                    this_StatesAttribute_0=ruleStatesAttribute();
                    _fsp--;

                     
                            current = this_StatesAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:453:5: this_LabelAttribute_1= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleAttribute942);
                    this_LabelAttribute_1=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:463:5: this_PositionAttribute_2= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleAttribute969);
                    this_PositionAttribute_2=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:473:5: this_SubtypeAttribute_3= ruleSubtypeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSubtypeAttributeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubtypeAttribute_in_ruleAttribute996);
                    this_SubtypeAttribute_3=ruleSubtypeAttribute();
                    _fsp--;

                     
                            current = this_SubtypeAttribute_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:483:5: this_StateValuesAttribute_4= ruleStateValuesAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getStateValuesAttributeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateValuesAttribute_in_ruleAttribute1023);
                    this_StateValuesAttribute_4=ruleStateValuesAttribute();
                    _fsp--;

                     
                            current = this_StateValuesAttribute_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:493:5: this_ApplicationAttribute_5= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getApplicationAttributeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleAttribute1050);
                    this_ApplicationAttribute_5=ruleApplicationAttribute();
                    _fsp--;

                     
                            current = this_ApplicationAttribute_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:503:5: this_NodeSizeAttribute_6= ruleNodeSizeAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNodeSizeAttributeParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1077);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:519:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:520:2: (iv_ruleBasicNode= ruleBasicNode EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:521:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNode_in_entryRuleBasicNode1112);
            iv_ruleBasicNode=ruleBasicNode();
            _fsp--;

             current =iv_ruleBasicNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNode1122); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:528:1: ruleBasicNode returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:533:6: ( ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:1: ( ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:534:2: ( (lv_keyword_0_0= ruleBasicNodeKeyword ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:535:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:535:1: (lv_keyword_0_0= ruleBasicNodeKeyword )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:536:3: lv_keyword_0_0= ruleBasicNodeKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getKeywordBasicNodeKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1168);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:558:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:559:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:559:1: (lv_id_1_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:560:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicNode1185); 

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

            match(input,15,FOLLOW_15_in_ruleBasicNode1201); 

                    createLeafNode(grammarAccess.getBasicNodeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:586:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=34 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:587:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:587:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:588:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBasicNodeAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBasicNode1222);
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

            match(input,16,FOLLOW_16_in_ruleBasicNode1233); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:622:1: entryRuleBasicNodeKeyword returns [String current=null] : iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF ;
    public final String entryRuleBasicNodeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicNodeKeyword = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:623:2: (iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:624:2: iv_ruleBasicNodeKeyword= ruleBasicNodeKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicNodeKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1270);
            iv_ruleBasicNodeKeyword=ruleBasicNodeKeyword();
            _fsp--;

             current =iv_ruleBasicNodeKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicNodeKeyword1281); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:631:1: ruleBasicNodeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) ;
    public final AntlrDatatypeRuleToken ruleBasicNodeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:636:6: ( ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )
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
                    new NoViableAltException("637:1: ( ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' ) | kw= 'decision' | kw= 'utility' | kw= 'function' )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:2: ( (kw= 'discrete' | kw= 'continuous' )? kw= 'node' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:3: (kw= 'discrete' | kw= 'continuous' )? kw= 'node'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:637:3: (kw= 'discrete' | kw= 'continuous' )?
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
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:638:2: kw= 'discrete'
                            {
                            kw=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleBasicNodeKeyword1321); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDiscreteKeyword_0_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:645:2: kw= 'continuous'
                            {
                            kw=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleBasicNodeKeyword1340); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getContinuousKeyword_0_0_1(), null); 
                                

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBasicNodeKeyword1355); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getNodeKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:658:2: kw= 'decision'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBasicNodeKeyword1375); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getDecisionKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:665:2: kw= 'utility'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleBasicNodeKeyword1394); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBasicNodeKeywordAccess().getUtilityKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:672:2: kw= 'function'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleBasicNodeKeyword1413); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:685:1: entryRuleStatesAttribute returns [EObject current=null] : iv_ruleStatesAttribute= ruleStatesAttribute EOF ;
    public final EObject entryRuleStatesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:686:2: (iv_ruleStatesAttribute= ruleStatesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:687:2: iv_ruleStatesAttribute= ruleStatesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1453);
            iv_ruleStatesAttribute=ruleStatesAttribute();
            _fsp--;

             current =iv_ruleStatesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatesAttribute1463); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:694:1: ruleStatesAttribute returns [EObject current=null] : ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) ;
    public final EObject ruleStatesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_states_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:699:6: ( ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:700:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:700:1: ( () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:700:2: () 'states' '=' '(' ( (lv_states_4_0= RULE_STRING ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:700:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:701:5: 
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

            match(input,23,FOLLOW_23_in_ruleStatesAttribute1507); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getStatesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStatesAttribute1517); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStatesAttribute1527); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:723:1: ( (lv_states_4_0= RULE_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:724:1: (lv_states_4_0= RULE_STRING )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:724:1: (lv_states_4_0= RULE_STRING )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:725:3: lv_states_4_0= RULE_STRING
            	    {
            	    lv_states_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatesAttribute1544); 

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

            match(input,26,FOLLOW_26_in_ruleStatesAttribute1560); 

                    createLeafNode(grammarAccess.getStatesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStatesAttribute1570); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:763:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:764:2: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:765:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1606);
            iv_ruleLabelAttribute=ruleLabelAttribute();
            _fsp--;

             current =iv_ruleLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelAttribute1616); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:772:1: ruleLabelAttribute returns [EObject current=null] : ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:777:6: ( ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:778:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:778:1: ( 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:778:3: 'label' '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            match(input,28,FOLLOW_28_in_ruleLabelAttribute1651); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleLabelAttribute1661); 

                    createLeafNode(grammarAccess.getLabelAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:786:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:787:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:787:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:788:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabelAttribute1678); 

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

            match(input,27,FOLLOW_27_in_ruleLabelAttribute1693); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:822:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:823:2: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:824:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1729);
            iv_rulePositionAttribute=rulePositionAttribute();
            _fsp--;

             current =iv_rulePositionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionAttribute1739); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:831:1: rulePositionAttribute returns [EObject current=null] : ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_x_3_0=null;
        Token lv_y_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:836:6: ( ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:837:1: ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:837:1: ( 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:837:3: 'position' '=' '(' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,29,FOLLOW_29_in_rulePositionAttribute1774); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getPositionKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_rulePositionAttribute1784); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_rulePositionAttribute1794); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:849:1: ( (lv_x_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:850:1: (lv_x_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:850:1: (lv_x_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:851:3: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionAttribute1811); 

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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:873:2: ( (lv_y_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:874:1: (lv_y_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:874:1: (lv_y_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:875:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePositionAttribute1833); 

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

            match(input,26,FOLLOW_26_in_rulePositionAttribute1848); 

                    createLeafNode(grammarAccess.getPositionAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_rulePositionAttribute1858); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:913:1: entryRuleSubtypeAttribute returns [EObject current=null] : iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF ;
    public final EObject entryRuleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:914:2: (iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:915:2: iv_ruleSubtypeAttribute= ruleSubtypeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubtypeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1894);
            iv_ruleSubtypeAttribute=ruleSubtypeAttribute();
            _fsp--;

             current =iv_ruleSubtypeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypeAttribute1904); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:922:1: ruleSubtypeAttribute returns [EObject current=null] : ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) ;
    public final EObject ruleSubtypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_subtype_2_1=null;
        Token lv_subtype_2_2=null;
        Token lv_subtype_2_3=null;
        Token lv_subtype_2_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:927:6: ( ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:928:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:928:1: ( 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:928:3: 'subtype' '=' ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) ) ';'
            {
            match(input,30,FOLLOW_30_in_ruleSubtypeAttribute1939); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getSubtypeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSubtypeAttribute1949); 

                    createLeafNode(grammarAccess.getSubtypeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:936:1: ( ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:937:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:937:1: ( (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:938:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:938:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )
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
                    new NoViableAltException("938:1: (lv_subtype_2_1= 'label' | lv_subtype_2_2= 'boolean' | lv_subtype_2_3= 'number' | lv_subtype_2_4= 'interval' )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:939:3: lv_subtype_2_1= 'label'
                    {
                    lv_subtype_2_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSubtypeAttribute1969); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:957:8: lv_subtype_2_2= 'boolean'
                    {
                    lv_subtype_2_2=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSubtypeAttribute1998); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:975:8: lv_subtype_2_3= 'number'
                    {
                    lv_subtype_2_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSubtypeAttribute2027); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:993:8: lv_subtype_2_4= 'interval'
                    {
                    lv_subtype_2_4=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSubtypeAttribute2056); 

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

            match(input,27,FOLLOW_27_in_ruleSubtypeAttribute2082); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1026:1: entryRuleStateValuesAttribute returns [EObject current=null] : iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF ;
    public final EObject entryRuleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValuesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1027:2: (iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1028:2: iv_ruleStateValuesAttribute= ruleStateValuesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateValuesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2118);
            iv_ruleStateValuesAttribute=ruleStateValuesAttribute();
            _fsp--;

             current =iv_ruleStateValuesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateValuesAttribute2128); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1035:1: ruleStateValuesAttribute returns [EObject current=null] : ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) ;
    public final EObject ruleStateValuesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_numbers_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1040:6: ( ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1041:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1041:1: ( 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1041:3: 'state_values' '=' '(' ( (lv_numbers_3_0= RULE_INT ) )+ ')' ';'
            {
            match(input,34,FOLLOW_34_in_ruleStateValuesAttribute2163); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getState_valuesKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleStateValuesAttribute2173); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleStateValuesAttribute2183); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1053:1: ( (lv_numbers_3_0= RULE_INT ) )+
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
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1054:1: (lv_numbers_3_0= RULE_INT )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1054:1: (lv_numbers_3_0= RULE_INT )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1055:3: lv_numbers_3_0= RULE_INT
            	    {
            	    lv_numbers_3_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStateValuesAttribute2200); 

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

            match(input,26,FOLLOW_26_in_ruleStateValuesAttribute2216); 

                    createLeafNode(grammarAccess.getStateValuesAttributeAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,27,FOLLOW_27_in_ruleStateValuesAttribute2226); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1093:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1094:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1095:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2262);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();
            _fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute2272); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1102:1: ruleApplicationAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1107:6: ( ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:1: ( ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:2: ( (lv_key_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_STRING ) ) ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1108:2: ( (lv_key_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1109:1: (lv_key_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1109:1: (lv_key_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1110:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationAttribute2314); 

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

            match(input,24,FOLLOW_24_in_ruleApplicationAttribute2329); 

                    createLeafNode(grammarAccess.getApplicationAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1136:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1137:1: (lv_value_2_0= RULE_STRING )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1137:1: (lv_value_2_0= RULE_STRING )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1138:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationAttribute2346); 

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

            match(input,27,FOLLOW_27_in_ruleApplicationAttribute2361); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1172:1: entryRuleNodeSizeAttribute returns [EObject current=null] : iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF ;
    public final EObject entryRuleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSizeAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1173:2: (iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1174:2: iv_ruleNodeSizeAttribute= ruleNodeSizeAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeSizeAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2397);
            iv_ruleNodeSizeAttribute=ruleNodeSizeAttribute();
            _fsp--;

             current =iv_ruleNodeSizeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSizeAttribute2407); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1181:1: ruleNodeSizeAttribute returns [EObject current=null] : ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) ;
    public final EObject ruleNodeSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_width_3_0=null;
        Token lv_height_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1186:6: ( ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1187:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1187:1: ( 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1187:3: 'node_size' '=' '(' ( (lv_width_3_0= RULE_INT ) ) ( (lv_height_4_0= RULE_INT ) ) ')' ';'
            {
            match(input,35,FOLLOW_35_in_ruleNodeSizeAttribute2442); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getNode_sizeKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleNodeSizeAttribute2452); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNodeSizeAttribute2462); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1199:1: ( (lv_width_3_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1200:1: (lv_width_3_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1200:1: (lv_width_3_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1201:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2479); 

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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1223:2: ( (lv_height_4_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1224:1: (lv_height_4_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1224:1: (lv_height_4_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1225:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2501); 

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

            match(input,26,FOLLOW_26_in_ruleNodeSizeAttribute2516); 

                    createLeafNode(grammarAccess.getNodeSizeAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleNodeSizeAttribute2526); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1263:1: entryRulePotential returns [EObject current=null] : iv_rulePotential= rulePotential EOF ;
    public final EObject entryRulePotential() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotential = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1264:2: (iv_rulePotential= rulePotential EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1265:2: iv_rulePotential= rulePotential EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialRule(), currentNode); 
            pushFollow(FOLLOW_rulePotential_in_entryRulePotential2562);
            iv_rulePotential=rulePotential();
            _fsp--;

             current =iv_rulePotential; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotential2572); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1272:1: rulePotential returns [EObject current=null] : ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) ;
    public final EObject rulePotential() throws RecognitionException {
        EObject current = null;

        EObject lv_graph_1_0 = null;

        EObject lv_model_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1277:6: ( ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1278:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1278:1: ( 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1278:3: 'potential' ( (lv_graph_1_0= rulePotentialGraph ) ) ( (lv_model_2_0= rulePotentialModel ) )
            {
            match(input,36,FOLLOW_36_in_rulePotential2607); 

                    createLeafNode(grammarAccess.getPotentialAccess().getPotentialKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1282:1: ( (lv_graph_1_0= rulePotentialGraph ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1283:1: (lv_graph_1_0= rulePotentialGraph )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1283:1: (lv_graph_1_0= rulePotentialGraph )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1284:3: lv_graph_1_0= rulePotentialGraph
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialGraph_in_rulePotential2628);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1306:2: ( (lv_model_2_0= rulePotentialModel ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1307:1: (lv_model_2_0= rulePotentialModel )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1307:1: (lv_model_2_0= rulePotentialModel )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1308:3: lv_model_2_0= rulePotentialModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePotentialModel_in_rulePotential2649);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1338:1: entryRulePotentialGraph returns [EObject current=null] : iv_rulePotentialGraph= rulePotentialGraph EOF ;
    public final EObject entryRulePotentialGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialGraph = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1339:2: (iv_rulePotentialGraph= rulePotentialGraph EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1340:2: iv_rulePotentialGraph= rulePotentialGraph EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialGraphRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2685);
            iv_rulePotentialGraph=rulePotentialGraph();
            _fsp--;

             current =iv_rulePotentialGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialGraph2695); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1347:1: rulePotentialGraph returns [EObject current=null] : ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) ;
    public final EObject rulePotentialGraph() throws RecognitionException {
        EObject current = null;

        Token lv_children_2_0=null;
        Token lv_parents_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1352:6: ( ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1353:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1353:1: ( () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1353:2: () '(' ( (lv_children_2_0= RULE_ID ) )* ( '|' ( (lv_parents_4_0= RULE_ID ) )* )? ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1353:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1354:5: 
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

            match(input,25,FOLLOW_25_in_rulePotentialGraph2739); 

                    createLeafNode(grammarAccess.getPotentialGraphAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1368:1: ( (lv_children_2_0= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1369:1: (lv_children_2_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1369:1: (lv_children_2_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1370:3: lv_children_2_0= RULE_ID
            	    {
            	    lv_children_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2756); 

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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1392:3: ( '|' ( (lv_parents_4_0= RULE_ID ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1392:5: '|' ( (lv_parents_4_0= RULE_ID ) )*
                    {
                    match(input,37,FOLLOW_37_in_rulePotentialGraph2773); 

                            createLeafNode(grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1396:1: ( (lv_parents_4_0= RULE_ID ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1397:1: (lv_parents_4_0= RULE_ID )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1397:1: (lv_parents_4_0= RULE_ID )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1398:3: lv_parents_4_0= RULE_ID
                    	    {
                    	    lv_parents_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePotentialGraph2790); 

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

            match(input,26,FOLLOW_26_in_rulePotentialGraph2808); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1432:1: entryRulePotentialModel returns [EObject current=null] : iv_rulePotentialModel= rulePotentialModel EOF ;
    public final EObject entryRulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialModel = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1433:2: (iv_rulePotentialModel= rulePotentialModel EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1434:2: iv_rulePotentialModel= rulePotentialModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialModelRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialModel_in_entryRulePotentialModel2844);
            iv_rulePotentialModel=rulePotentialModel();
            _fsp--;

             current =iv_rulePotentialModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialModel2854); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1441:1: rulePotentialModel returns [EObject current=null] : ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) ;
    public final EObject rulePotentialModel() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1446:6: ( ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1447:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1447:1: ( () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1447:2: () '{' ( (lv_attributes_2_0= rulePotentialAttribute ) )* '}'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1447:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1448:5: 
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

            match(input,15,FOLLOW_15_in_rulePotentialModel2898); 

                    createLeafNode(grammarAccess.getPotentialModelAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1462:1: ( (lv_attributes_2_0= rulePotentialAttribute ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38||LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1463:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1463:1: (lv_attributes_2_0= rulePotentialAttribute )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1464:3: lv_attributes_2_0= rulePotentialAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPotentialModelAccess().getAttributesPotentialAttributeParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePotentialAttribute_in_rulePotentialModel2919);
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

            match(input,16,FOLLOW_16_in_rulePotentialModel2930); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1498:1: entryRulePotentialAttribute returns [EObject current=null] : iv_rulePotentialAttribute= rulePotentialAttribute EOF ;
    public final EObject entryRulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1499:2: (iv_rulePotentialAttribute= rulePotentialAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1500:2: iv_rulePotentialAttribute= rulePotentialAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2966);
            iv_rulePotentialAttribute=rulePotentialAttribute();
            _fsp--;

             current =iv_rulePotentialAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialAttribute2976); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1507:1: rulePotentialAttribute returns [EObject current=null] : (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) ;
    public final EObject rulePotentialAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PotentialDataAttribute_0 = null;

        EObject this_PotentialTableAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1512:6: ( (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1513:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1513:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )
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
                    new NoViableAltException("1513:1: (this_PotentialDataAttribute_0= rulePotentialDataAttribute | this_PotentialTableAttribute_1= rulePotentialTableAttribute )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1514:5: this_PotentialDataAttribute_0= rulePotentialDataAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialDataAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute3023);
                    this_PotentialDataAttribute_0=rulePotentialDataAttribute();
                    _fsp--;

                     
                            current = this_PotentialDataAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1524:5: this_PotentialTableAttribute_1= rulePotentialTableAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPotentialAttributeAccess().getPotentialTableAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute3050);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1540:1: entryRulePotentialDataAttribute returns [EObject current=null] : iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF ;
    public final EObject entryRulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1541:2: (iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1542:2: iv_rulePotentialDataAttribute= rulePotentialDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3085);
            iv_rulePotentialDataAttribute=rulePotentialDataAttribute();
            _fsp--;

             current =iv_rulePotentialDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialDataAttribute3095); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1549:1: rulePotentialDataAttribute returns [EObject current=null] : ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) ) ')' ';' ) ;
    public final EObject rulePotentialDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_unstructured_4_0 = null;

        EObject lv_structured_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1554:6: ( ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) ) ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1555:1: ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) ) ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1555:1: ( () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) ) ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1555:2: () 'data' '=' '(' ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) ) ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1555:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1556:5: 
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

            match(input,38,FOLLOW_38_in_rulePotentialDataAttribute3139); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getDataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_rulePotentialDataAttribute3149); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_rulePotentialDataAttribute3159); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1578:1: ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||(LA21_0>=11 && LA21_0<=12)||LA21_0==26||LA21_0==39) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1578:1: ( ( (lv_unstructured_4_0= ruleUnstructuredDataList ) ) | ( (lv_structured_5_0= ruleStructuredDataList ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1578:2: ( (lv_unstructured_4_0= ruleUnstructuredDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1578:2: ( (lv_unstructured_4_0= ruleUnstructuredDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1579:1: (lv_unstructured_4_0= ruleUnstructuredDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1579:1: (lv_unstructured_4_0= ruleUnstructuredDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1580:3: lv_unstructured_4_0= ruleUnstructuredDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getUnstructuredUnstructuredDataListParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnstructuredDataList_in_rulePotentialDataAttribute3181);
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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1603:6: ( (lv_structured_5_0= ruleStructuredDataList ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1603:6: ( (lv_structured_5_0= ruleStructuredDataList ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1604:1: (lv_structured_5_0= ruleStructuredDataList )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1604:1: (lv_structured_5_0= ruleStructuredDataList )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1605:3: lv_structured_5_0= ruleStructuredDataList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPotentialDataAttributeAccess().getStructuredStructuredDataListParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStructuredDataList_in_rulePotentialDataAttribute3208);
                    lv_structured_5_0=ruleStructuredDataList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPotentialDataAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"structured",
                    	        		lv_structured_5_0, 
                    	        		"StructuredDataList", 
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

            match(input,26,FOLLOW_26_in_rulePotentialDataAttribute3219); 

                    createLeafNode(grammarAccess.getPotentialDataAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_rulePotentialDataAttribute3229); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1643:1: entryRuleUnstructuredDataList returns [EObject current=null] : iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF ;
    public final EObject entryRuleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnstructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1644:2: (iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1645:2: iv_ruleUnstructuredDataList= ruleUnstructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnstructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3265);
            iv_ruleUnstructuredDataList=ruleUnstructuredDataList();
            _fsp--;

             current =iv_ruleUnstructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnstructuredDataList3275); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1652:1: ruleUnstructuredDataList returns [EObject current=null] : ( ( () ( (lv_items_1_0= ruleFloat ) )* ) | this_NormalDistribution_2= ruleNormalDistribution ) ;
    public final EObject ruleUnstructuredDataList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_1_0 = null;

        EObject this_NormalDistribution_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1657:6: ( ( ( () ( (lv_items_1_0= ruleFloat ) )* ) | this_NormalDistribution_2= ruleNormalDistribution ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:1: ( ( () ( (lv_items_1_0= ruleFloat ) )* ) | this_NormalDistribution_2= ruleNormalDistribution )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:1: ( ( () ( (lv_items_1_0= ruleFloat ) )* ) | this_NormalDistribution_2= ruleNormalDistribution )
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
                    new NoViableAltException("1658:1: ( ( () ( (lv_items_1_0= ruleFloat ) )* ) | this_NormalDistribution_2= ruleNormalDistribution )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:2: ( () ( (lv_items_1_0= ruleFloat ) )* )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:2: ( () ( (lv_items_1_0= ruleFloat ) )* )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:3: () ( (lv_items_1_0= ruleFloat ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1658:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1659:5: 
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1669:2: ( (lv_items_1_0= ruleFloat ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_INT||(LA22_0>=11 && LA22_0<=12)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1670:1: (lv_items_1_0= ruleFloat )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1670:1: (lv_items_1_0= ruleFloat )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1671:3: lv_items_1_0= ruleFloat
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getItemsFloatParserRuleCall_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFloat_in_ruleUnstructuredDataList3331);
                    	    lv_items_1_0=ruleFloat();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getUnstructuredDataListRule().getType().getClassifier());
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
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1695:5: this_NormalDistribution_2= ruleNormalDistribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUnstructuredDataListAccess().getNormalDistributionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNormalDistribution_in_ruleUnstructuredDataList3361);
                    this_NormalDistribution_2=ruleNormalDistribution();
                    _fsp--;

                     
                            current = this_NormalDistribution_2; 
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
    // $ANTLR end ruleUnstructuredDataList


    // $ANTLR start entryRuleStructuredDataList
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1711:1: entryRuleStructuredDataList returns [EObject current=null] : iv_ruleStructuredDataList= ruleStructuredDataList EOF ;
    public final EObject entryRuleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1712:2: (iv_ruleStructuredDataList= ruleStructuredDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1713:2: iv_ruleStructuredDataList= ruleStructuredDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuredDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3396);
            iv_ruleStructuredDataList=ruleStructuredDataList();
            _fsp--;

             current =iv_ruleStructuredDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredDataList3406); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1720:1: ruleStructuredDataList returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleFloatDataList ) ) ')' ) ;
    public final EObject ruleStructuredDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1725:6: ( ( () '(' ( (lv_list_2_0= ruleFloatDataList ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:1: ( () '(' ( (lv_list_2_0= ruleFloatDataList ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:1: ( () '(' ( (lv_list_2_0= ruleFloatDataList ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:2: () '(' ( (lv_list_2_0= ruleFloatDataList ) ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1726:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1727:5: 
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

            match(input,25,FOLLOW_25_in_ruleStructuredDataList3450); 

                    createLeafNode(grammarAccess.getStructuredDataListAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1741:1: ( (lv_list_2_0= ruleFloatDataList ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1742:1: (lv_list_2_0= ruleFloatDataList )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1742:1: (lv_list_2_0= ruleFloatDataList )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1743:3: lv_list_2_0= ruleFloatDataList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructuredDataListAccess().getListFloatDataListParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3471);
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

            match(input,26,FOLLOW_26_in_ruleStructuredDataList3481); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1777:1: entryRuleFloatDataList returns [EObject current=null] : iv_ruleFloatDataList= ruleFloatDataList EOF ;
    public final EObject entryRuleFloatDataList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataList = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1778:2: (iv_ruleFloatDataList= ruleFloatDataList EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1779:2: iv_ruleFloatDataList= ruleFloatDataList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatDataListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3517);
            iv_ruleFloatDataList=ruleFloatDataList();
            _fsp--;

             current =iv_ruleFloatDataList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataList3527); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1786:1: ruleFloatDataList returns [EObject current=null] : ( () '(' ( (lv_list_2_0= ruleUnstructuredDataList ) ) ')' ) ;
    public final EObject ruleFloatDataList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1791:6: ( ( () '(' ( (lv_list_2_0= ruleUnstructuredDataList ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1792:1: ( () '(' ( (lv_list_2_0= ruleUnstructuredDataList ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1792:1: ( () '(' ( (lv_list_2_0= ruleUnstructuredDataList ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1792:2: () '(' ( (lv_list_2_0= ruleUnstructuredDataList ) ) ')'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1792:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1793:5: 
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

            match(input,25,FOLLOW_25_in_ruleFloatDataList3571); 

                    createLeafNode(grammarAccess.getFloatDataListAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1807:1: ( (lv_list_2_0= ruleUnstructuredDataList ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1808:1: (lv_list_2_0= ruleUnstructuredDataList )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1808:1: (lv_list_2_0= ruleUnstructuredDataList )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1809:3: lv_list_2_0= ruleUnstructuredDataList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFloatDataListAccess().getListUnstructuredDataListParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUnstructuredDataList_in_ruleFloatDataList3592);
            lv_list_2_0=ruleUnstructuredDataList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFloatDataListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"list",
            	        		lv_list_2_0, 
            	        		"UnstructuredDataList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleFloatDataList3602); 

                    createLeafNode(grammarAccess.getFloatDataListAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1843:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1844:2: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1845:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNormalDistributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNormalDistribution_in_entryRuleNormalDistribution3638);
            iv_ruleNormalDistribution=ruleNormalDistribution();
            _fsp--;

             current =iv_ruleNormalDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalDistribution3648); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1852:1: ruleNormalDistribution returns [EObject current=null] : ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_mean_2_0 = null;

        AntlrDatatypeRuleToken lv_variance_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1857:6: ( ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1858:1: ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1858:1: ( 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1858:3: 'normal' '(' ( (lv_mean_2_0= ruleMeanExpression ) ) ',' ( (lv_variance_4_0= ruleFloat ) ) ')'
            {
            match(input,39,FOLLOW_39_in_ruleNormalDistribution3683); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getNormalKeyword_0(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNormalDistribution3693); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1866:1: ( (lv_mean_2_0= ruleMeanExpression ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1867:1: (lv_mean_2_0= ruleMeanExpression )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1867:1: (lv_mean_2_0= ruleMeanExpression )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1868:3: lv_mean_2_0= ruleMeanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalDistributionAccess().getMeanMeanExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMeanExpression_in_ruleNormalDistribution3714);
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

            match(input,40,FOLLOW_40_in_ruleNormalDistribution3724); 

                    createLeafNode(grammarAccess.getNormalDistributionAccess().getCommaKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1894:1: ( (lv_variance_4_0= ruleFloat ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1895:1: (lv_variance_4_0= ruleFloat )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1895:1: (lv_variance_4_0= ruleFloat )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1896:3: lv_variance_4_0= ruleFloat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalDistributionAccess().getVarianceFloatParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFloat_in_ruleNormalDistribution3745);
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

            match(input,26,FOLLOW_26_in_ruleNormalDistribution3755); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1930:1: entryRuleMeanExpression returns [String current=null] : iv_ruleMeanExpression= ruleMeanExpression EOF ;
    public final String entryRuleMeanExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1931:2: (iv_ruleMeanExpression= ruleMeanExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1932:2: iv_ruleMeanExpression= ruleMeanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3792);
            iv_ruleMeanExpression=ruleMeanExpression();
            _fsp--;

             current =iv_ruleMeanExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanExpression3803); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1939:1: ruleMeanExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleMeanExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MeanTerm_0 = null;

        AntlrDatatypeRuleToken this_MeanTerm_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1944:6: ( (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1945:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1945:1: (this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1946:5: this_MeanTerm_0= ruleMeanTerm (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3850);
            this_MeanTerm_0=ruleMeanTerm();
            _fsp--;


            		current.merge(this_MeanTerm_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1956:1: (kw= '+' this_MeanTerm_2= ruleMeanTerm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==11) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1957:2: kw= '+' this_MeanTerm_2= ruleMeanTerm
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleMeanExpression3869); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getMeanExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	        
            	     
            	            currentNode=createCompositeNode(grammarAccess.getMeanExpressionAccess().getMeanTermParserRuleCall_1_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleMeanTerm_in_ruleMeanExpression3891);
            	    this_MeanTerm_2=ruleMeanTerm();
            	    _fsp--;


            	    		current.merge(this_MeanTerm_2);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1981:1: entryRuleMeanTerm returns [String current=null] : iv_ruleMeanTerm= ruleMeanTerm EOF ;
    public final String entryRuleMeanTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1982:2: (iv_ruleMeanTerm= ruleMeanTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1983:2: iv_ruleMeanTerm= ruleMeanTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMeanTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3939);
            iv_ruleMeanTerm=ruleMeanTerm();
            _fsp--;

             current =iv_ruleMeanTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeanTerm3950); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1990:1: ruleMeanTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMeanTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_Float_0 = null;

        AntlrDatatypeRuleToken this_Float_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1995:6: ( (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==RULE_INT) ) {
                            int LA25_8 = input.LA(5);

                            if ( (LA25_8==EOF||LA25_8==11||LA25_8==40) ) {
                                alt25=1;
                            }
                            else if ( (LA25_8==41) ) {
                                alt25=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt25=2;
                        }
                        break;
                    case EOF:
                    case 11:
                    case 40:
                        {
                        alt25=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==RULE_INT) ) {
                            int LA25_8 = input.LA(5);

                            if ( (LA25_8==EOF||LA25_8==11||LA25_8==40) ) {
                                alt25=1;
                            }
                            else if ( (LA25_8==41) ) {
                                alt25=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt25=2;
                        }
                        break;
                    case EOF:
                    case 11:
                    case 40:
                        {
                        alt25=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA25_5 = input.LA(3);

                    if ( (LA25_5==RULE_INT) ) {
                        int LA25_8 = input.LA(4);

                        if ( (LA25_8==EOF||LA25_8==11||LA25_8==40) ) {
                            alt25=1;
                        }
                        else if ( (LA25_8==41) ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    alt25=2;
                    }
                    break;
                case EOF:
                case 11:
                case 40:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1996:1: (this_Float_0= ruleFloat | (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID ) | this_ID_4= RULE_ID )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:1997:5: this_Float_0= ruleFloat
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getFloatParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleMeanTerm3997);
                    this_Float_0=ruleFloat();
                    _fsp--;


                    		current.merge(this_Float_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2008:6: (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2008:6: (this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2009:5: this_Float_1= ruleFloat kw= '*' this_ID_3= RULE_ID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMeanTermAccess().getFloatParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleMeanTerm4031);
                    this_Float_1=ruleFloat();
                    _fsp--;


                    		current.merge(this_Float_1);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleMeanTerm4049); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getMeanTermAccess().getAsteriskKeyword_1_1(), null); 
                        
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4064); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getMeanTermAccess().getIDTerminalRuleCall_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2033:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeanTerm4091); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2048:1: entryRulePotentialTableAttribute returns [EObject current=null] : iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF ;
    public final EObject entryRulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotentialTableAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2049:2: (iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2050:2: iv_rulePotentialTableAttribute= rulePotentialTableAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPotentialTableAttributeRule(), currentNode); 
            pushFollow(FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4136);
            iv_rulePotentialTableAttribute=rulePotentialTableAttribute();
            _fsp--;

             current =iv_rulePotentialTableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePotentialTableAttribute4146); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2057:1: rulePotentialTableAttribute returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) ;
    public final EObject rulePotentialTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_samples_1_0 = null;

        EObject lv_data_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2062:6: ( ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2063:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2063:1: ( ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2063:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) ) ( (lv_samples_1_0= ruleSamplesAttribute ) )? ( (lv_data_2_0= ruleModelDataAttribute ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2063:2: ( (lv_nodes_0_0= ruleModelNodesAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2064:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2064:1: (lv_nodes_0_0= ruleModelNodesAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2065:3: lv_nodes_0_0= ruleModelNodesAttribute
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getNodesModelNodesAttributeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4192);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2087:2: ( (lv_samples_1_0= ruleSamplesAttribute ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2088:1: (lv_samples_1_0= ruleSamplesAttribute )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2088:1: (lv_samples_1_0= ruleSamplesAttribute )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2089:3: lv_samples_1_0= ruleSamplesAttribute
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getSamplesSamplesAttributeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4213);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2111:3: ( (lv_data_2_0= ruleModelDataAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2112:1: (lv_data_2_0= ruleModelDataAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2112:1: (lv_data_2_0= ruleModelDataAttribute )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2113:3: lv_data_2_0= ruleModelDataAttribute
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPotentialTableAttributeAccess().getDataModelDataAttributeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4235);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2143:1: entryRuleModelNodesAttribute returns [EObject current=null] : iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF ;
    public final EObject entryRuleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2144:2: (iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2145:2: iv_ruleModelNodesAttribute= ruleModelNodesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelNodesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4271);
            iv_ruleModelNodesAttribute=ruleModelNodesAttribute();
            _fsp--;

             current =iv_ruleModelNodesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodesAttribute4281); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2152:1: ruleModelNodesAttribute returns [EObject current=null] : ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) ;
    public final EObject ruleModelNodesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_configurations_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2157:6: ( ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2158:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2158:1: ( () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2158:2: () 'model_nodes' '=' '(' ( (lv_configurations_4_0= RULE_ID ) )* ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2158:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2159:5: 
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

            match(input,42,FOLLOW_42_in_ruleModelNodesAttribute4325); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getModel_nodesKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelNodesAttribute4335); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelNodesAttribute4345); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2181:1: ( (lv_configurations_4_0= RULE_ID ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2182:1: (lv_configurations_4_0= RULE_ID )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2182:1: (lv_configurations_4_0= RULE_ID )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2183:3: lv_configurations_4_0= RULE_ID
            	    {
            	    lv_configurations_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodesAttribute4362); 

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
            	    break loop27;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleModelNodesAttribute4378); 

                    createLeafNode(grammarAccess.getModelNodesAttributeAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelNodesAttribute4388); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2221:1: entryRuleSamplesAttribute returns [EObject current=null] : iv_ruleSamplesAttribute= ruleSamplesAttribute EOF ;
    public final EObject entryRuleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplesAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2222:2: (iv_ruleSamplesAttribute= ruleSamplesAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2223:2: iv_ruleSamplesAttribute= ruleSamplesAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSamplesAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4424);
            iv_ruleSamplesAttribute=ruleSamplesAttribute();
            _fsp--;

             current =iv_ruleSamplesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplesAttribute4434); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2230:1: ruleSamplesAttribute returns [EObject current=null] : ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleSamplesAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2235:6: ( ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2236:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2236:1: ( 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2236:3: 'samples_per_interval' '=' ( (lv_value_2_0= RULE_INT ) ) ';'
            {
            match(input,43,FOLLOW_43_in_ruleSamplesAttribute4469); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getSamples_per_intervalKeyword_0(), null); 
                
            match(input,24,FOLLOW_24_in_ruleSamplesAttribute4479); 

                    createLeafNode(grammarAccess.getSamplesAttributeAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2244:1: ( (lv_value_2_0= RULE_INT ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2245:1: (lv_value_2_0= RULE_INT )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2245:1: (lv_value_2_0= RULE_INT )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2246:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplesAttribute4496); 

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

            match(input,27,FOLLOW_27_in_ruleSamplesAttribute4511); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2280:1: entryRuleModelDataAttribute returns [EObject current=null] : iv_ruleModelDataAttribute= ruleModelDataAttribute EOF ;
    public final EObject entryRuleModelDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDataAttribute = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2281:2: (iv_ruleModelDataAttribute= ruleModelDataAttribute EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2282:2: iv_ruleModelDataAttribute= ruleModelDataAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelDataAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4547);
            iv_ruleModelDataAttribute=ruleModelDataAttribute();
            _fsp--;

             current =iv_ruleModelDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDataAttribute4557); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2289:1: ruleModelDataAttribute returns [EObject current=null] : ( () 'model_data' '=' '(' ')' ';' ) ;
    public final EObject ruleModelDataAttribute() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2294:6: ( ( () 'model_data' '=' '(' ')' ';' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2295:1: ( () 'model_data' '=' '(' ')' ';' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2295:1: ( () 'model_data' '=' '(' ')' ';' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2295:2: () 'model_data' '=' '(' ')' ';'
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2295:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2296:5: 
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

            match(input,44,FOLLOW_44_in_ruleModelDataAttribute4601); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getModel_dataKeyword_1(), null); 
                
            match(input,24,FOLLOW_24_in_ruleModelDataAttribute4611); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleModelDataAttribute4621); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getLeftParenthesisKeyword_3(), null); 
                
            match(input,26,FOLLOW_26_in_ruleModelDataAttribute4631); 

                    createLeafNode(grammarAccess.getModelDataAttributeAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,27,FOLLOW_27_in_ruleModelDataAttribute4641); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2334:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2335:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2336:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4677);
            iv_ruleClassDefinition=ruleClassDefinition();
            _fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition4687); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2343:1: ruleClassDefinition returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2348:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2349:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_elements_3_0= ruleClassElement ) )* '}'
            {
            match(input,45,FOLLOW_45_in_ruleClassDefinition4722); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getClassKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2354:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2354:1: (lv_name_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition4739); 

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

            match(input,15,FOLLOW_15_in_ruleClassDefinition4754); 

                    createLeafNode(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2381:1: ( (lv_elements_3_0= ruleClassElement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=17 && LA28_0<=23)||(LA28_0>=28 && LA28_0<=30)||(LA28_0>=34 && LA28_0<=36)||(LA28_0>=45 && LA28_0<=46)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2382:1: (lv_elements_3_0= ruleClassElement )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2382:1: (lv_elements_3_0= ruleClassElement )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2383:3: lv_elements_3_0= ruleClassElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getClassDefinitionAccess().getElementsClassElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClassDefinition4775);
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
            	    break loop28;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleClassDefinition4786); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2417:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2418:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2419:2: iv_ruleClassElement= ruleClassElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement4822);
            iv_ruleClassElement=ruleClassElement();
            _fsp--;

             current =iv_ruleClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement4832); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2426:1: ruleClassElement returns [EObject current=null] : (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_DomainElement_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_ClassInstance_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2431:6: ( (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2432:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )
            int alt29=3;
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
                alt29=1;
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
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2432:1: (this_DomainElement_0= ruleDomainElement | this_Attribute_1= ruleAttribute | this_ClassInstance_2= ruleClassInstance )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2433:5: this_DomainElement_0= ruleDomainElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getDomainElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainElement_in_ruleClassElement4879);
                    this_DomainElement_0=ruleDomainElement();
                    _fsp--;

                     
                            current = this_DomainElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2443:5: this_Attribute_1= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleClassElement4906);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2453:5: this_ClassInstance_2= ruleClassInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassElementAccess().getClassInstanceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClassInstance_in_ruleClassElement4933);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2469:1: entryRuleClassInstance returns [EObject current=null] : iv_ruleClassInstance= ruleClassInstance EOF ;
    public final EObject entryRuleClassInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInstance = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2470:2: (iv_ruleClassInstance= ruleClassInstance EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2471:2: iv_ruleClassInstance= ruleClassInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassInstance_in_entryRuleClassInstance4968);
            iv_ruleClassInstance=ruleClassInstance();
            _fsp--;

             current =iv_ruleClassInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassInstance4978); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2478:1: ruleClassInstance returns [EObject current=null] : ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) ;
    public final EObject ruleClassInstance() throws RecognitionException {
        EObject current = null;

        Token lv_instanceName_1_0=null;
        Token lv_className_3_0=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;

        EObject lv_attributes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2483:6: ( ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2484:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2484:1: ( 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}' )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2484:3: 'instance' ( (lv_instanceName_1_0= RULE_ID ) ) ':' ( (lv_className_3_0= RULE_ID ) ) '(' ( (lv_input_5_0= ruleInputBindings ) )? ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )? ')' '{' ( (lv_attributes_10_0= ruleNodeAttributes ) ) '}'
            {
            match(input,46,FOLLOW_46_in_ruleClassInstance5013); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getInstanceKeyword_0(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2488:1: ( (lv_instanceName_1_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2489:1: (lv_instanceName_1_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2489:1: (lv_instanceName_1_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2490:3: lv_instanceName_1_0= RULE_ID
            {
            lv_instanceName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5030); 

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

            match(input,47,FOLLOW_47_in_ruleClassInstance5045); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getColonKeyword_2(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2516:1: ( (lv_className_3_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2517:1: (lv_className_3_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2517:1: (lv_className_3_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2518:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassInstance5062); 

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

            match(input,25,FOLLOW_25_in_ruleClassInstance5077); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2544:1: ( (lv_input_5_0= ruleInputBindings ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2545:1: (lv_input_5_0= ruleInputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2545:1: (lv_input_5_0= ruleInputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2546:3: lv_input_5_0= ruleInputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getInputInputBindingsParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInputBindings_in_ruleClassInstance5098);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2568:3: ( ';' ( (lv_output_7_0= ruleOutputBindings ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2568:5: ';' ( (lv_output_7_0= ruleOutputBindings ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleClassInstance5110); 

                            createLeafNode(grammarAccess.getClassInstanceAccess().getSemicolonKeyword_6_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2572:1: ( (lv_output_7_0= ruleOutputBindings ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2573:1: (lv_output_7_0= ruleOutputBindings )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2573:1: (lv_output_7_0= ruleOutputBindings )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2574:3: lv_output_7_0= ruleOutputBindings
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getOutputOutputBindingsParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOutputBindings_in_ruleClassInstance5131);
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

            match(input,26,FOLLOW_26_in_ruleClassInstance5143); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getRightParenthesisKeyword_7(), null); 
                
            match(input,15,FOLLOW_15_in_ruleClassInstance5153); 

                    createLeafNode(grammarAccess.getClassInstanceAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2604:1: ( (lv_attributes_10_0= ruleNodeAttributes ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2605:1: (lv_attributes_10_0= ruleNodeAttributes )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2605:1: (lv_attributes_10_0= ruleNodeAttributes )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2606:3: lv_attributes_10_0= ruleNodeAttributes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassInstanceAccess().getAttributesNodeAttributesParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNodeAttributes_in_ruleClassInstance5174);
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

            match(input,16,FOLLOW_16_in_ruleClassInstance5184); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2640:1: entryRuleInputBindings returns [EObject current=null] : iv_ruleInputBindings= ruleInputBindings EOF ;
    public final EObject entryRuleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2641:2: (iv_ruleInputBindings= ruleInputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2642:2: iv_ruleInputBindings= ruleInputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBindings_in_entryRuleInputBindings5220);
            iv_ruleInputBindings=ruleInputBindings();
            _fsp--;

             current =iv_ruleInputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBindings5230); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2649:1: ruleInputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) ;
    public final EObject ruleInputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2654:6: ( ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:1: ( ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:2: ( (lv_lhs_0_0= ruleInputBinding ) ) ',' ( (lv_rhs_2_0= ruleInputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2655:2: ( (lv_lhs_0_0= ruleInputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2656:1: (lv_lhs_0_0= ruleInputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2656:1: (lv_lhs_0_0= ruleInputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2657:3: lv_lhs_0_0= ruleInputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBinding_in_ruleInputBindings5276);
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

            match(input,40,FOLLOW_40_in_ruleInputBindings5286); 

                    createLeafNode(grammarAccess.getInputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2683:1: ( (lv_rhs_2_0= ruleInputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2684:1: (lv_rhs_2_0= ruleInputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2684:1: (lv_rhs_2_0= ruleInputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2685:3: lv_rhs_2_0= ruleInputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInputBindings_in_ruleInputBindings5307);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2715:1: entryRuleInputBinding returns [EObject current=null] : iv_ruleInputBinding= ruleInputBinding EOF ;
    public final EObject entryRuleInputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2716:2: (iv_ruleInputBinding= ruleInputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2717:2: iv_ruleInputBinding= ruleInputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputBinding_in_entryRuleInputBinding5343);
            iv_ruleInputBinding=ruleInputBinding();
            _fsp--;

             current =iv_ruleInputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputBinding5353); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2724:1: ruleInputBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token lv_actual_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2729:6: ( ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:1: ( ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:2: ( (lv_formal_0_0= RULE_ID ) ) '=' ( (lv_actual_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2730:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2731:1: (lv_formal_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2731:1: (lv_formal_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2732:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5395); 

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

            match(input,24,FOLLOW_24_in_ruleInputBinding5410); 

                    createLeafNode(grammarAccess.getInputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2758:1: ( (lv_actual_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2759:1: (lv_actual_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2759:1: (lv_actual_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2760:3: lv_actual_2_0= RULE_ID
            {
            lv_actual_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputBinding5427); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2790:1: entryRuleOutputBindings returns [EObject current=null] : iv_ruleOutputBindings= ruleOutputBindings EOF ;
    public final EObject entryRuleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBindings = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2791:2: (iv_ruleOutputBindings= ruleOutputBindings EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2792:2: iv_ruleOutputBindings= ruleOutputBindings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5468);
            iv_ruleOutputBindings=ruleOutputBindings();
            _fsp--;

             current =iv_ruleOutputBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBindings5478); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2799:1: ruleOutputBindings returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) ;
    public final EObject ruleOutputBindings() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2804:6: ( ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:1: ( ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:2: ( (lv_lhs_0_0= ruleOutputBinding ) ) ',' ( (lv_rhs_2_0= ruleOutputBindings ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2805:2: ( (lv_lhs_0_0= ruleOutputBinding ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2806:1: (lv_lhs_0_0= ruleOutputBinding )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2806:1: (lv_lhs_0_0= ruleOutputBinding )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2807:3: lv_lhs_0_0= ruleOutputBinding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBinding_in_ruleOutputBindings5524);
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

            match(input,40,FOLLOW_40_in_ruleOutputBindings5534); 

                    createLeafNode(grammarAccess.getOutputBindingsAccess().getCommaKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2833:1: ( (lv_rhs_2_0= ruleOutputBindings ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2834:1: (lv_rhs_2_0= ruleOutputBindings )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2834:1: (lv_rhs_2_0= ruleOutputBindings )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2835:3: lv_rhs_2_0= ruleOutputBindings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOutputBindings_in_ruleOutputBindings5555);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2865:1: entryRuleOutputBinding returns [EObject current=null] : iv_ruleOutputBinding= ruleOutputBinding EOF ;
    public final EObject entryRuleOutputBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBinding = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2866:2: (iv_ruleOutputBinding= ruleOutputBinding EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2867:2: iv_ruleOutputBinding= ruleOutputBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5591);
            iv_ruleOutputBinding=ruleOutputBinding();
            _fsp--;

             current =iv_ruleOutputBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBinding5601); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2874:1: ruleOutputBinding returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputBinding() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2879:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2880:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2880:1: ( ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2880:2: ( (lv_actual_0_0= RULE_ID ) ) '=' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2880:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2881:1: (lv_actual_0_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2881:1: (lv_actual_0_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2882:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5643); 

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

            match(input,24,FOLLOW_24_in_ruleOutputBinding5658); 

                    createLeafNode(grammarAccess.getOutputBindingAccess().getEqualsSignKeyword_1(), null); 
                
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2908:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2909:1: (lv_formal_2_0= RULE_ID )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2909:1: (lv_formal_2_0= RULE_ID )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2910:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBinding5675); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2940:1: entryRuleNodeAttributes returns [EObject current=null] : iv_ruleNodeAttributes= ruleNodeAttributes EOF ;
    public final EObject entryRuleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributes = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2941:2: (iv_ruleNodeAttributes= ruleNodeAttributes EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2942:2: iv_ruleNodeAttributes= ruleNodeAttributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeAttributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5716);
            iv_ruleNodeAttributes=ruleNodeAttributes();
            _fsp--;

             current =iv_ruleNodeAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttributes5726); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2949:1: ruleNodeAttributes returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) ;
    public final EObject ruleNodeAttributes() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;

        EObject this_ApplicationAttribute_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2954:6: ( (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2955:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2955:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt32=1;
                }
                break;
            case 29:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2955:1: (this_LabelAttribute_0= ruleLabelAttribute | this_PositionAttribute_1= rulePositionAttribute | this_ApplicationAttribute_2= ruleApplicationAttribute )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2956:5: this_LabelAttribute_0= ruleLabelAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getLabelAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5773);
                    this_LabelAttribute_0=ruleLabelAttribute();
                    _fsp--;

                     
                            current = this_LabelAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2966:5: this_PositionAttribute_1= rulePositionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getPositionAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5800);
                    this_PositionAttribute_1=rulePositionAttribute();
                    _fsp--;

                     
                            current = this_PositionAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2976:5: this_ApplicationAttribute_2= ruleApplicationAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAttributesAccess().getApplicationAttributeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5827);
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2992:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2993:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:2994:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5862);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5872); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3001:1: ruleExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3006:6: ( ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3007:1: ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3007:1: ( ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3007:2: ( (lv_lhs_0_0= ruleSimpleExpression ) ) ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3007:2: ( (lv_lhs_0_0= ruleSimpleExpression ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3008:1: (lv_lhs_0_0= ruleSimpleExpression )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3008:1: (lv_lhs_0_0= ruleSimpleExpression )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3009:3: lv_lhs_0_0= ruleSimpleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLhsSimpleExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression5918);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3031:2: ( ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24||(LA33_0>=51 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3032:5: ruleComparison ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleComparison_in_ruleExpression5935);
            	    ruleComparison();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3039:1: ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3040:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3040:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3041:3: lv_rhs_2_0= ruleSimpleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRhsSimpleExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression5955);
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
            	    break loop33;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3071:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3072:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3073:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression5993);
            iv_ruleSimpleExpression=ruleSimpleExpression();
            _fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression6003); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3080:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3085:6: ( ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3086:1: ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3086:1: ( ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3086:2: ( (lv_lhs_0_0= ruleTerm ) ) ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3086:2: ( (lv_lhs_0_0= ruleTerm ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3087:1: (lv_lhs_0_0= ruleTerm )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3087:1: (lv_lhs_0_0= ruleTerm )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3088:3: lv_lhs_0_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getLhsTermParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleSimpleExpression6049);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3110:2: ( rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==11) ) {
                    alt34=1;
                }
                else if ( (LA34_0==12) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3111:5: rulePlusOrMinus ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getPlusOrMinusParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleSimpleExpression6066);
            	    rulePlusOrMinus();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3118:1: ( (lv_rhs_2_0= ruleSimpleExpression ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3119:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3119:1: (lv_rhs_2_0= ruleSimpleExpression )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3120:3: lv_rhs_2_0= ruleSimpleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSimpleExpressionAccess().getRhsSimpleExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleSimpleExpression6086);
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
            	    break loop34;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3150:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3151:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3152:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm6124);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm6134); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3159:1: ruleTerm returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3164:6: ( ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3165:1: ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3165:1: ( ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3165:2: ( (lv_lhs_0_0= ruleExpFactor ) ) ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3165:2: ( (lv_lhs_0_0= ruleExpFactor ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3166:1: (lv_lhs_0_0= ruleExpFactor )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3166:1: (lv_lhs_0_0= ruleExpFactor )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3167:3: lv_lhs_0_0= ruleExpFactor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getLhsExpFactorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpFactor_in_ruleTerm6180);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3189:2: ( ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==41) ) {
                    alt35=1;
                }
                else if ( (LA35_0==58) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3190:5: ruleTimesOrDivide ( (lv_rhs_2_0= ruleTerm ) )
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTimesOrDivideParserRuleCall_1_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleTimesOrDivide_in_ruleTerm6197);
            	    ruleTimesOrDivide();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3197:1: ( (lv_rhs_2_0= ruleTerm ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3198:1: (lv_rhs_2_0= ruleTerm )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3198:1: (lv_rhs_2_0= ruleTerm )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3199:3: lv_rhs_2_0= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getRhsTermParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerm6217);
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
            	    break loop35;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3229:1: entryRuleExpFactor returns [EObject current=null] : iv_ruleExpFactor= ruleExpFactor EOF ;
    public final EObject entryRuleExpFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpFactor = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3230:2: (iv_ruleExpFactor= ruleExpFactor EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3231:2: iv_ruleExpFactor= ruleExpFactor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpFactorRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpFactor_in_entryRuleExpFactor6255);
            iv_ruleExpFactor=ruleExpFactor();
            _fsp--;

             current =iv_ruleExpFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpFactor6265); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3238:1: ruleExpFactor returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* ) ;
    public final EObject ruleExpFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3243:6: ( ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3244:1: ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3244:1: ( ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )* )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3244:2: ( (lv_lhs_0_0= ruleFactor ) ) ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )*
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3244:2: ( (lv_lhs_0_0= ruleFactor ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3245:1: (lv_lhs_0_0= ruleFactor )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3245:1: (lv_lhs_0_0= ruleFactor )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3246:3: lv_lhs_0_0= ruleFactor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpFactorAccess().getLhsFactorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFactor_in_ruleExpFactor6311);
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3268:2: ( '^' ( (lv_rhs_2_0= ruleExpFactor ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3268:4: '^' ( (lv_rhs_2_0= ruleExpFactor ) )
            	    {
            	    match(input,48,FOLLOW_48_in_ruleExpFactor6322); 

            	            createLeafNode(grammarAccess.getExpFactorAccess().getCircumflexAccentKeyword_1_0(), null); 
            	        
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3272:1: ( (lv_rhs_2_0= ruleExpFactor ) )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3273:1: (lv_rhs_2_0= ruleExpFactor )
            	    {
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3273:1: (lv_rhs_2_0= ruleExpFactor )
            	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3274:3: lv_rhs_2_0= ruleExpFactor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpFactorAccess().getRhsExpFactorParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpFactor_in_ruleExpFactor6343);
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
    // $ANTLR end ruleExpFactor


    // $ANTLR start entryRuleFactor
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3304:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3305:2: (iv_ruleFactor= ruleFactor EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3306:2: iv_ruleFactor= ruleFactor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFactorRule(), currentNode); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor6381);
            iv_ruleFactor=ruleFactor();
            _fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor6391); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3313:1: ruleFactor returns [EObject current=null] : ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) ) ;
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
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3318:6: ( ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_ID:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case 49:
                {
                alt37=4;
                }
                break;
            case 50:
                {
                alt37=5;
                }
                break;
            case 25:
                {
                alt37=6;
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
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3319:1: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) | ( (lv_nodeName_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'false' ) ) | ( (lv_value_5_0= 'true' ) ) | ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' ) | ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:3: () ( (lv_number_1_0= RULE_INT ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3319:3: ()
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3320:5: 
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3330:2: ( (lv_number_1_0= RULE_INT ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3331:1: (lv_number_1_0= RULE_INT )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3331:1: (lv_number_1_0= RULE_INT )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3332:3: lv_number_1_0= RULE_INT
                    {
                    lv_number_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFactor6443); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3355:6: ( (lv_nodeName_2_0= RULE_ID ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3355:6: ( (lv_nodeName_2_0= RULE_ID ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3356:1: (lv_nodeName_2_0= RULE_ID )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3356:1: (lv_nodeName_2_0= RULE_ID )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3357:3: lv_nodeName_2_0= RULE_ID
                    {
                    lv_nodeName_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor6472); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3380:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3380:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3381:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3381:1: (lv_value_3_0= RULE_STRING )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3382:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor6500); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3405:6: ( (lv_value_4_0= 'false' ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3405:6: ( (lv_value_4_0= 'false' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3406:1: (lv_value_4_0= 'false' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3406:1: (lv_value_4_0= 'false' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3407:3: lv_value_4_0= 'false'
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleFactor6529); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3427:6: ( (lv_value_5_0= 'true' ) )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3427:6: ( (lv_value_5_0= 'true' ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3428:1: (lv_value_5_0= 'true' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3428:1: (lv_value_5_0= 'true' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3429:3: lv_value_5_0= 'true'
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleFactor6566); 

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
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:6: ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:6: ( '(' ( (lv_expression_7_0= ruleExpression ) ) ')' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3449:8: '(' ( (lv_expression_7_0= ruleExpression ) ) ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleFactor6596); 

                            createLeafNode(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_5_0(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3453:1: ( (lv_expression_7_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3454:1: (lv_expression_7_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3454:1: (lv_expression_7_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3455:3: lv_expression_7_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFactor6617);
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

                    match(input,26,FOLLOW_26_in_ruleFactor6627); 

                            createLeafNode(grammarAccess.getFactorAccess().getRightParenthesisKeyword_5_2(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3482:6: ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3482:6: ( ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3482:7: ( (lv_op_9_0= ruleOperatorName ) ) '(' ( (lv_sequence_11_0= ruleExpressionSequence ) ) ')'
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3482:7: ( (lv_op_9_0= ruleOperatorName ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3483:1: (lv_op_9_0= ruleOperatorName )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3483:1: (lv_op_9_0= ruleOperatorName )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3484:3: lv_op_9_0= ruleOperatorName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getOpOperatorNameParserRuleCall_6_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperatorName_in_ruleFactor6656);
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

                    match(input,25,FOLLOW_25_in_ruleFactor6666); 

                            createLeafNode(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_1(), null); 
                        
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3510:1: ( (lv_sequence_11_0= ruleExpressionSequence ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3511:1: (lv_sequence_11_0= ruleExpressionSequence )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3511:1: (lv_sequence_11_0= ruleExpressionSequence )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3512:3: lv_sequence_11_0= ruleExpressionSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFactorAccess().getSequenceExpressionSequenceParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionSequence_in_ruleFactor6687);
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

                    match(input,26,FOLLOW_26_in_ruleFactor6697); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3546:1: entryRuleExpressionSequence returns [EObject current=null] : iv_ruleExpressionSequence= ruleExpressionSequence EOF ;
    public final EObject entryRuleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSequence = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3547:2: (iv_ruleExpressionSequence= ruleExpressionSequence EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3548:2: iv_ruleExpressionSequence= ruleExpressionSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6734);
            iv_ruleExpressionSequence=ruleExpressionSequence();
            _fsp--;

             current =iv_ruleExpressionSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSequence6744); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3555:1: ruleExpressionSequence returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleExpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3560:6: ( ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3561:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3561:1: ( () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )? )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3561:2: () ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3561:2: ()
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3562:5: 
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

            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3572:2: ( ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||LA39_0==25||(LA39_0>=49 && LA39_0<=50)||(LA39_0>=59 && LA39_0<=73)||(LA39_0>=75 && LA39_0<=95)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3572:3: ( (lv_expressions_1_0= ruleExpression ) ) ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3572:3: ( (lv_expressions_1_0= ruleExpression ) )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3573:1: (lv_expressions_1_0= ruleExpression )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3573:1: (lv_expressions_1_0= ruleExpression )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3574:3: lv_expressions_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6800);
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

                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3596:2: ( ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==40) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3596:4: ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    match(input,40,FOLLOW_40_in_ruleExpressionSequence6811); 

                    	            createLeafNode(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3600:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3601:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3601:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3602:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSequence6832);
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
                    	    break loop38;
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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3632:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3633:2: (iv_ruleComparison= ruleComparison EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3634:2: iv_ruleComparison= ruleComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison6873);
            iv_ruleComparison=ruleComparison();
            _fsp--;

             current =iv_ruleComparison.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison6884); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3641:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3646:6: ( (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3647:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt40=1;
                }
                break;
            case 24:
                {
                alt40=2;
                }
                break;
            case 52:
                {
                alt40=3;
                }
                break;
            case 53:
                {
                alt40=4;
                }
                break;
            case 54:
                {
                alt40=5;
                }
                break;
            case 55:
                {
                alt40=6;
                }
                break;
            case 56:
                {
                alt40=7;
                }
                break;
            case 57:
                {
                alt40=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3647:1: (kw= '==' | kw= '=' | kw= '!=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3648:2: kw= '=='
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleComparison6922); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3655:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleComparison6941); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3662:2: kw= '!='
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleComparison6960); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3669:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleComparison6979); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3676:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleComparison6998); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3683:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleComparison7017); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3690:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleComparison7036); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3697:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleComparison7055); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3710:1: entryRulePlusOrMinus returns [String current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final String entryRulePlusOrMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOrMinus = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3711:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3712:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlusOrMinusRule(), currentNode); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus7096);
            iv_rulePlusOrMinus=rulePlusOrMinus();
            _fsp--;

             current =iv_rulePlusOrMinus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus7107); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3719:1: rulePlusOrMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePlusOrMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3724:6: ( (kw= '+' | kw= '-' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3725:1: (kw= '+' | kw= '-' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3725:1: (kw= '+' | kw= '-' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            else if ( (LA41_0==12) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3725:1: (kw= '+' | kw= '-' )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3726:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_rulePlusOrMinus7145); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3733:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePlusOrMinus7164); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3746:1: entryRuleTimesOrDivide returns [String current=null] : iv_ruleTimesOrDivide= ruleTimesOrDivide EOF ;
    public final String entryRuleTimesOrDivide() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesOrDivide = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3747:2: (iv_ruleTimesOrDivide= ruleTimesOrDivide EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3748:2: iv_ruleTimesOrDivide= ruleTimesOrDivide EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTimesOrDivideRule(), currentNode); 
            pushFollow(FOLLOW_ruleTimesOrDivide_in_entryRuleTimesOrDivide7205);
            iv_ruleTimesOrDivide=ruleTimesOrDivide();
            _fsp--;

             current =iv_ruleTimesOrDivide.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesOrDivide7216); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3755:1: ruleTimesOrDivide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleTimesOrDivide() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3760:6: ( (kw= '*' | kw= '/' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3761:1: (kw= '*' | kw= '/' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3761:1: (kw= '*' | kw= '/' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            else if ( (LA42_0==58) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3761:1: (kw= '*' | kw= '/' )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3762:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleTimesOrDivide7254); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimesOrDivideAccess().getAsteriskKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3769:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleTimesOrDivide7273); 

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3782:1: entryRuleOperatorName returns [String current=null] : iv_ruleOperatorName= ruleOperatorName EOF ;
    public final String entryRuleOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorName = null;


        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3783:2: (iv_ruleOperatorName= ruleOperatorName EOF )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3784:2: iv_ruleOperatorName= ruleOperatorName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperatorNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperatorName_in_entryRuleOperatorName7314);
            iv_ruleOperatorName=ruleOperatorName();
            _fsp--;

             current =iv_ruleOperatorName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorName7325); 

            }

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
    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3791:1: ruleOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3796:6: ( (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' ) )
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3797:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            {
            // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3797:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )
            int alt43=36;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt43=1;
                }
                break;
            case 60:
                {
                alt43=2;
                }
                break;
            case 61:
                {
                alt43=3;
                }
                break;
            case 62:
                {
                alt43=4;
                }
                break;
            case 63:
                {
                alt43=5;
                }
                break;
            case 64:
                {
                alt43=6;
                }
                break;
            case 65:
                {
                alt43=7;
                }
                break;
            case 66:
                {
                alt43=8;
                }
                break;
            case 67:
                {
                alt43=9;
                }
                break;
            case 68:
                {
                alt43=10;
                }
                break;
            case 69:
                {
                alt43=11;
                }
                break;
            case 70:
                {
                alt43=12;
                }
                break;
            case 71:
                {
                alt43=13;
                }
                break;
            case 72:
                {
                alt43=14;
                }
                break;
            case 73:
                {
                alt43=15;
                }
                break;
            case 75:
                {
                alt43=16;
                }
                break;
            case 76:
                {
                alt43=17;
                }
                break;
            case 77:
                {
                alt43=18;
                }
                break;
            case 78:
                {
                alt43=19;
                }
                break;
            case 79:
                {
                alt43=20;
                }
                break;
            case 80:
                {
                alt43=21;
                }
                break;
            case 81:
                {
                alt43=22;
                }
                break;
            case 82:
                {
                alt43=23;
                }
                break;
            case 83:
                {
                alt43=24;
                }
                break;
            case 84:
                {
                alt43=25;
                }
                break;
            case 85:
                {
                alt43=26;
                }
                break;
            case 86:
                {
                alt43=27;
                }
                break;
            case 87:
                {
                alt43=28;
                }
                break;
            case 88:
                {
                alt43=29;
                }
                break;
            case 89:
                {
                alt43=30;
                }
                break;
            case 90:
                {
                alt43=31;
                }
                break;
            case 91:
                {
                alt43=32;
                }
                break;
            case 92:
                {
                alt43=33;
                }
                break;
            case 93:
                {
                alt43=34;
                }
                break;
            case 94:
                {
                alt43=35;
                }
                break;
            case 95:
                {
                alt43=36;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3797:1: (kw= 'truncate' | kw= 'Normal' | kw= 'LogNormal' | kw= 'Beta' | kw= 'Gamma' | kw= 'Exponential' | kw= 'Weibull' | kw= 'Uniform' | kw= 'Triangular' | kw= 'PERT' | kw= 'Binomial' | kw= 'Poisson' | kw= 'NegativeBinomial' | kw= 'Geometric' | (kw= 'Distribution' kw= 'NoisyOR' ) | kw= 'min' | kw= 'max' | kw= 'log' | kw= 'log2' | kw= 'log10' | kw= 'exp' | kw= 'sin' | kw= 'cos' | kw= 'tan' | kw= 'sinh' | kw= 'cosh' | kw= 'tanh' | kw= 'sqrt' | kw= 'abs' | kw= 'floor' | kw= 'ceil' | kw= 'mod' | kw= 'if' | kw= 'and' | kw= 'or' | kw= 'not' )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3798:2: kw= 'truncate'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_ruleOperatorName7363); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTruncateKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3805:2: kw= 'Normal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FOLLOW_60_in_ruleOperatorName7382); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNormalKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3812:2: kw= 'LogNormal'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_ruleOperatorName7401); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogNormalKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3819:2: kw= 'Beta'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_ruleOperatorName7420); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBetaKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3826:2: kw= 'Gamma'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleOperatorName7439); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGammaKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3833:2: kw= 'Exponential'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleOperatorName7458); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExponentialKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3840:2: kw= 'Weibull'
                    {
                    kw=(Token)input.LT(1);
                    match(input,65,FOLLOW_65_in_ruleOperatorName7477); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getWeibullKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3847:2: kw= 'Uniform'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_ruleOperatorName7496); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getUniformKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3854:2: kw= 'Triangular'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleOperatorName7515); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTriangularKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3861:2: kw= 'PERT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_ruleOperatorName7534); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPERTKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3868:2: kw= 'Binomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleOperatorName7553); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getBinomialKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3875:2: kw= 'Poisson'
                    {
                    kw=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_ruleOperatorName7572); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getPoissonKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3882:2: kw= 'NegativeBinomial'
                    {
                    kw=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_ruleOperatorName7591); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNegativeBinomialKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3889:2: kw= 'Geometric'
                    {
                    kw=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ruleOperatorName7610); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getGeometricKeyword_13(), null); 
                        

                    }
                    break;
                case 15 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:6: (kw= 'Distribution' kw= 'NoisyOR' )
                    {
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3895:6: (kw= 'Distribution' kw= 'NoisyOR' )
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3896:2: kw= 'Distribution' kw= 'NoisyOR'
                    {
                    kw=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_ruleOperatorName7630); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getDistributionKeyword_14_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ruleOperatorName7643); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getNoisyORKeyword_14_1(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3909:2: kw= 'min'
                    {
                    kw=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_ruleOperatorName7663); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMinKeyword_15(), null); 
                        

                    }
                    break;
                case 17 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3916:2: kw= 'max'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleOperatorName7682); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getMaxKeyword_16(), null); 
                        

                    }
                    break;
                case 18 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3923:2: kw= 'log'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleOperatorName7701); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLogKeyword_17(), null); 
                        

                    }
                    break;
                case 19 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3930:2: kw= 'log2'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleOperatorName7720); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog2Keyword_18(), null); 
                        

                    }
                    break;
                case 20 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3937:2: kw= 'log10'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleOperatorName7739); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getLog10Keyword_19(), null); 
                        

                    }
                    break;
                case 21 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3944:2: kw= 'exp'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleOperatorName7758); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getExpKeyword_20(), null); 
                        

                    }
                    break;
                case 22 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3951:2: kw= 'sin'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleOperatorName7777); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinKeyword_21(), null); 
                        

                    }
                    break;
                case 23 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3958:2: kw= 'cos'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleOperatorName7796); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCosKeyword_22(), null); 
                        

                    }
                    break;
                case 24 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3965:2: kw= 'tan'
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleOperatorName7815); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanKeyword_23(), null); 
                        

                    }
                    break;
                case 25 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3972:2: kw= 'sinh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleOperatorName7834); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSinhKeyword_24(), null); 
                        

                    }
                    break;
                case 26 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3979:2: kw= 'cosh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleOperatorName7853); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCoshKeyword_25(), null); 
                        

                    }
                    break;
                case 27 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3986:2: kw= 'tanh'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleOperatorName7872); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getTanhKeyword_26(), null); 
                        

                    }
                    break;
                case 28 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:3993:2: kw= 'sqrt'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleOperatorName7891); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getSqrtKeyword_27(), null); 
                        

                    }
                    break;
                case 29 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4000:2: kw= 'abs'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleOperatorName7910); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAbsKeyword_28(), null); 
                        

                    }
                    break;
                case 30 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4007:2: kw= 'floor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_ruleOperatorName7929); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getFloorKeyword_29(), null); 
                        

                    }
                    break;
                case 31 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4014:2: kw= 'ceil'
                    {
                    kw=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ruleOperatorName7948); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getCeilKeyword_30(), null); 
                        

                    }
                    break;
                case 32 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4021:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_ruleOperatorName7967); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getModKeyword_31(), null); 
                        

                    }
                    break;
                case 33 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4028:2: kw= 'if'
                    {
                    kw=(Token)input.LT(1);
                    match(input,92,FOLLOW_92_in_ruleOperatorName7986); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getIfKeyword_32(), null); 
                        

                    }
                    break;
                case 34 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4035:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_ruleOperatorName8005); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getAndKeyword_33(), null); 
                        

                    }
                    break;
                case 35 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4042:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,94,FOLLOW_94_in_ruleOperatorName8024); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getOperatorNameAccess().getOrKeyword_34(), null); 
                        

                    }
                    break;
                case 36 :
                    // ../net.certware.evidence.hugin/src-gen/net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.g:4049:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_ruleOperatorName8043); 

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
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleFloat359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat381 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFloat400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDefinition_in_entryRuleDomainDefinition466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDefinition476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_ruleDomainDefinition522 = new BitSet(new long[]{0x00002010007E0002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomainDefinition543 = new BitSet(new long[]{0x00002010007E0002L});
    public static final BitSet FOLLOW_ruleDomainHeader_in_entryRuleDomainHeader580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainHeader590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainHeader634 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDomainHeader644 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainHeader665 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_16_in_ruleDomainHeader676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_ruleDomainElement769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_ruleDomainElement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleDomainElement823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_ruleAttribute915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleAttribute942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleAttribute969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_ruleAttribute996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_ruleAttribute1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleAttribute1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_ruleAttribute1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNode_in_entryRuleBasicNode1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNode1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_ruleBasicNode1168 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicNode1185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBasicNode1201 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBasicNode1222 = new BitSet(new long[]{0x0000000C70810020L});
    public static final BitSet FOLLOW_16_in_ruleBasicNode1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicNodeKeyword_in_entryRuleBasicNodeKeyword1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicNodeKeyword1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBasicNodeKeyword1321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleBasicNodeKeyword1340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBasicNodeKeyword1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicNodeKeyword1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicNodeKeyword1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicNodeKeyword1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatesAttribute_in_entryRuleStatesAttribute1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatesAttribute1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStatesAttribute1507 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatesAttribute1517 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatesAttribute1527 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatesAttribute1544 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_ruleStatesAttribute1560 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatesAttribute1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_entryRuleLabelAttribute1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelAttribute1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLabelAttribute1651 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabelAttribute1661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabelAttribute1678 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLabelAttribute1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_entryRulePositionAttribute1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionAttribute1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePositionAttribute1774 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePositionAttribute1784 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePositionAttribute1794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionAttribute1811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePositionAttribute1833 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePositionAttribute1848 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePositionAttribute1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypeAttribute_in_entryRuleSubtypeAttribute1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypeAttribute1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSubtypeAttribute1939 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubtypeAttribute1949 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleSubtypeAttribute1969 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31_in_ruleSubtypeAttribute1998 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32_in_ruleSubtypeAttribute2027 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33_in_ruleSubtypeAttribute2056 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubtypeAttribute2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateValuesAttribute_in_entryRuleStateValuesAttribute2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateValuesAttribute2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateValuesAttribute2163 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateValuesAttribute2173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStateValuesAttribute2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStateValuesAttribute2200 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleStateValuesAttribute2216 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStateValuesAttribute2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute2262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationAttribute2314 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleApplicationAttribute2329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationAttribute2346 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleApplicationAttribute2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSizeAttribute_in_entryRuleNodeSizeAttribute2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSizeAttribute2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNodeSizeAttribute2442 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNodeSizeAttribute2452 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNodeSizeAttribute2462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNodeSizeAttribute2501 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNodeSizeAttribute2516 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNodeSizeAttribute2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotential_in_entryRulePotential2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotential2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePotential2607 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_rulePotential2628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulePotentialModel_in_rulePotential2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialGraph_in_entryRulePotentialGraph2685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialGraph2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePotentialGraph2739 = new BitSet(new long[]{0x0000002004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2756 = new BitSet(new long[]{0x0000002004000020L});
    public static final BitSet FOLLOW_37_in_rulePotentialGraph2773 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePotentialGraph2790 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_rulePotentialGraph2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialModel_in_entryRulePotentialModel2844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialModel2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePotentialModel2898 = new BitSet(new long[]{0x0000044000010000L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_rulePotentialModel2919 = new BitSet(new long[]{0x0000044000010000L});
    public static final BitSet FOLLOW_16_in_rulePotentialModel2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialAttribute_in_entryRulePotentialAttribute2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialAttribute2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_rulePotentialAttribute3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_rulePotentialAttribute3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialDataAttribute_in_entryRulePotentialDataAttribute3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialDataAttribute3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePotentialDataAttribute3139 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePotentialDataAttribute3149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePotentialDataAttribute3159 = new BitSet(new long[]{0x0000008006001810L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_rulePotentialDataAttribute3181 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_rulePotentialDataAttribute3208 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePotentialDataAttribute3219 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePotentialDataAttribute3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_entryRuleUnstructuredDataList3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnstructuredDataList3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleUnstructuredDataList3331 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_ruleNormalDistribution_in_ruleUnstructuredDataList3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredDataList_in_entryRuleStructuredDataList3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredDataList3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStructuredDataList3450 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_ruleStructuredDataList3471 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStructuredDataList3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataList_in_entryRuleFloatDataList3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataList3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFloatDataList3571 = new BitSet(new long[]{0x0000008004001810L});
    public static final BitSet FOLLOW_ruleUnstructuredDataList_in_ruleFloatDataList3592 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFloatDataList3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDistribution_in_entryRuleNormalDistribution3638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalDistribution3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNormalDistribution3683 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNormalDistribution3693 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_ruleMeanExpression_in_ruleNormalDistribution3714 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleNormalDistribution3724 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleNormalDistribution3745 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNormalDistribution3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanExpression_in_entryRuleMeanExpression3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanExpression3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3850 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleMeanExpression3869 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_ruleMeanExpression3891 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMeanTerm_in_entryRuleMeanTerm3939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeanTerm3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleMeanTerm3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleMeanTerm4031 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMeanTerm4049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeanTerm4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePotentialTableAttribute_in_entryRulePotentialTableAttribute4136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePotentialTableAttribute4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_rulePotentialTableAttribute4192 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_rulePotentialTableAttribute4213 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_rulePotentialTableAttribute4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodesAttribute_in_entryRuleModelNodesAttribute4271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodesAttribute4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModelNodesAttribute4325 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelNodesAttribute4335 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelNodesAttribute4345 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodesAttribute4362 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_ruleModelNodesAttribute4378 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelNodesAttribute4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplesAttribute_in_entryRuleSamplesAttribute4424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplesAttribute4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSamplesAttribute4469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSamplesAttribute4479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplesAttribute4496 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSamplesAttribute4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDataAttribute_in_entryRuleModelDataAttribute4547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDataAttribute4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModelDataAttribute4601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModelDataAttribute4611 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModelDataAttribute4621 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleModelDataAttribute4631 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelDataAttribute4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition4677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleClassDefinition4722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition4739 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassDefinition4754 = new BitSet(new long[]{0x0000601C70FF0020L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClassDefinition4775 = new BitSet(new long[]{0x0000601C70FF0020L});
    public static final BitSet FOLLOW_16_in_ruleClassDefinition4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement4822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleClassElement4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClassElement4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_ruleClassElement4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassInstance_in_entryRuleClassInstance4968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassInstance4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleClassInstance5013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5030 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleClassInstance5045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassInstance5062 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassInstance5077 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleClassInstance5098 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleClassInstance5110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleClassInstance5131 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleClassInstance5143 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClassInstance5153 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_ruleClassInstance5174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassInstance5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBindings_in_entryRuleInputBindings5220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBindings5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_ruleInputBindings5276 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleInputBindings5286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInputBindings_in_ruleInputBindings5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputBinding_in_entryRuleInputBinding5343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputBinding5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5395 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInputBinding5410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputBinding5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_entryRuleOutputBindings5468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBindings5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_ruleOutputBindings5524 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleOutputBindings5534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutputBindings_in_ruleOutputBindings5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBinding_in_entryRuleOutputBinding5591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBinding5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5643 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOutputBinding5658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBinding5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttributes_in_entryRuleNodeAttributes5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttributes5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelAttribute_in_ruleNodeAttributes5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionAttribute_in_ruleNodeAttributes5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleNodeAttributes5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression5918 = new BitSet(new long[]{0x03F8000001000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression5935 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression5955 = new BitSet(new long[]{0x03F8000001000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression5993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleSimpleExpression6049 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleSimpleExpression6066 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleSimpleExpression6086 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm6124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpFactor_in_ruleTerm6180 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_ruleTimesOrDivide_in_ruleTerm6197 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerm6217 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_ruleExpFactor_in_entryRuleExpFactor6255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpFactor6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExpFactor6311 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExpFactor6322 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpFactor_in_ruleExpFactor6343 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor6381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFactor6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFactor6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFactor6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFactor6596 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactor6617 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFactor6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_ruleFactor6656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFactor6666 = new BitSet(new long[]{0xF806000006000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_ruleFactor6687 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFactor6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSequence_in_entryRuleExpressionSequence6734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSequence6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6800 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpressionSequence6811 = new BitSet(new long[]{0xF806000002000070L,0x00000000FFFFFBFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSequence6832 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison6873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleComparison6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparison6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComparison6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleComparison6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleComparison6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleComparison7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleComparison7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparison7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus7096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePlusOrMinus7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlusOrMinus7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesOrDivide_in_entryRuleTimesOrDivide7205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesOrDivide7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTimesOrDivide7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTimesOrDivide7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorName_in_entryRuleOperatorName7314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorName7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOperatorName7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOperatorName7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOperatorName7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOperatorName7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOperatorName7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorName7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorName7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorName7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorName7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorName7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperatorName7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorName7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorName7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorName7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorName7630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleOperatorName7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperatorName7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperatorName7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperatorName7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperatorName7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperatorName7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOperatorName7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOperatorName7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOperatorName7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOperatorName7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOperatorName7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOperatorName7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOperatorName7872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOperatorName7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOperatorName7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorName7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOperatorName7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOperatorName7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOperatorName7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOperatorName8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOperatorName8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOperatorName8043 = new BitSet(new long[]{0x0000000000000002L});

}